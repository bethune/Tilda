/* ===========================================================================
 * Copyright (C) 2015 CapsicoHealth Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tilda.parsing.parts;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import tilda.enums.FrameworkSourcedType;
import tilda.parsing.ParserSession;
import tilda.parsing.parts.helpers.ReferenceHelper;
import tilda.parsing.parts.helpers.SameAsHelper;
import tilda.parsing.parts.helpers.ValidationHelper;
import tilda.utils.TextUtil;

public class ForeignKey
  {
    /*@formatter:off*/
    @SerializedName("name"       ) public String   _Name       ;
    @SerializedName("srcColumns" ) public String[] _SrcColumns ;
    @SerializedName("destObject" ) public String   _DestObject ;
    /*@formatter:on*/

    public transient List<Column> _SrcColumnObjs = new ArrayList<Column>();
    public transient Object       _DestObjectObj;
    public transient Object       _ParentObject;

    public ForeignKey()
      {
      }

    public ForeignKey(ForeignKey fk)
      {
        _Name = fk._Name;
        _SrcColumns = fk._SrcColumns;
        _DestObject = fk._DestObject;
      }

    public String getName()
      {
        return "fk_" + _ParentObject.getBaseName() + "_" + _Name;
      }

    public boolean Validate(ParserSession PS, Object O)
      {
        int Errs = PS.getErrorCount();
        _ParentObject = O;

        // Does it have a name?
        if (TextUtil.isNullOrEmpty(_Name) == true)
          return PS.AddError("Object '" + _ParentObject.getFullName() + "' is defining a foreign key without a name.");

        if (_Name.equals(TextUtil.sanitizeName(_Name)) == false)
          PS.AddError("Object '" + _ParentObject.getFullName() + "' is defining foreign key '" + _Name + "' with a name containing invalid characters (must all be alphanumeric or underscore).");

        if (TextUtil.isJavaIdentifier(_Name) == false)
          PS.AddError("Object '" + _ParentObject.getFullName() + "' is defining foreign key '" + _Name + "' with a name that is imcompatible with standard identifier convensions (for example, Java, JavaScript since Foreign Keys have programmatic equivalents in those languages).");

        if (_Name.length() > PS._CGSql.getMaxColumnNameSize())
          PS.AddError("Object '" + _ParentObject.getFullName() + "' is defining foreign key '" + _Name + "' with a name that's too long: max allowed by your database is " + PS._CGSql.getMaxColumnNameSize() + " vs " + _Name.length() + " for this identifier.");

        ValidateSourceColumns(PS);
        ValidateDestinationObject(PS);

        if (Errs != PS.getErrorCount())
          return false;

        CheckForeignKeyMapping(PS, _ParentObject, _SrcColumnObjs, _DestObjectObj, "foreign key '" + _Name + "'");

        return Errs == PS.getErrorCount();
      }

    protected static boolean CheckForeignKeyMapping(ParserSession PS, Object ParentObject, List<Column> SrcColumns, Object DestObject, String What)
      {
        PrimaryKey DPK = DestObject._PrimaryKey;
        if (DPK == null)
          return PS.AddError("Object '" + ParentObject.getFullName() + "' declares " + What + " to Object  '" + DestObject.getFullName() + " with no primary key.");
        if (DPK._ColumnObjs == null)
          return PS.AddError("Object '" + ParentObject.getFullName() + "' declares " + What + " to Object  '" + DestObject.getFullName() + " which incorrectly defined a primary key.");
        if (SrcColumns.size() != DPK._ColumnObjs.size())
          return PS.AddError("Object '" + ParentObject.getFullName() + "' declares " + What + " with " + SrcColumns.size() + " columns against a primary key on '" + DestObject.getFullName() + "' with  " + DPK._ColumnObjs.size() + " columns.");

        if (ParentObject._FST != FrameworkSourcedType.REALIZED)
          for (int i = 0; i < SrcColumns.size(); ++i)
            {
              Column S = SrcColumns.get(i);
              Column FK = DestObject._PrimaryKey._ColumnObjs.get(i);

              if (S._SameAsObj == null)
                PS.AddError("Object '" + ParentObject.getFullName() + "' declares " + What + " with src column '" + S.getFullName() + "' which doesn't define a SameAs.");
              else if (SameAsHelper.checkRootSameAs(S, FK) == false)
                PS.AddError("Object '" + ParentObject.getFullName() + "' declares " + What + " with src column '" + S.getFullName() + "' with a SameAs which doesn't match the intended primary key column '" + FK.getFullName() + "'.");
            }
        return true;
      }

    private boolean ValidateDestinationObject(ParserSession PS)
      {
        if (TextUtil.isNullOrEmpty(_DestObject) == true)
          return PS.AddError("Object '" + _ParentObject.getFullName() + "' is defining a foreign key without a destination object.");

        ReferenceHelper R = ReferenceHelper.parseObjectReference(_DestObject, _ParentObject._ParentSchema);
        if (TextUtil.isNullOrEmpty(R._S) == true || TextUtil.isNullOrEmpty(R._O) == true)
          PS.AddError("Object '" + _ParentObject.getFullName() + "' declares foreign key '" + _Name + "' with an incorrect syntax for the destination object. It should be '((package\\.)?schema\\.)?object'.");
        else
          {
            _DestObjectObj = PS.getObject(R._P, R._S, R._O);
            if (_DestObjectObj == null)
              return PS.AddError("Object '" + _ParentObject.getFullName() + "' declares foreign key '" + _Name + "' with destination Object '" + _DestObject + "' resolving to '" + R.getFullName() + "' which cannot be found.");
            if (_ParentObject != _DestObjectObj && _DestObjectObj._Validated == false)
              {
                if (_ParentObject.getSchema().isDefinedInOrder(_DestObjectObj, _ParentObject) == false)
                  return PS.AddError("Object '" + _ParentObject.getFullName() + "' declares foreign key to destination Object '" + _DestObject + "', but is defined before. Dependent object must be defined first.");
                else
                  return PS.AddError("Object '" + _ParentObject.getFullName() + "' declares foreign key to destination Object '" + _DestObject + "' which has failed validation.");
              }
          }

        return true;
      }

    private boolean ValidateSourceColumns(ParserSession PS)
      {
        if (_SrcColumns == null || _SrcColumns.length == 0)
          return PS.AddError("Object '" + _ParentObject.getFullName() + "' is defining a foreign key '" + _Name + "' without any source column.");

        _SrcColumnObjs = ValidationHelper.ProcessColumn(PS, _ParentObject, "foreign key '" + _Name + "'", _SrcColumns, null);
        for (Column C : _SrcColumnObjs)
          C._ForeignKey = true;

        return true;
      }

    public String getColumnList()
      {
        return TextUtil.print(_SrcColumns);
      }

    public String getSignature()
      {
        return _DestObjectObj.getShortName().toUpperCase() + "(" + getColumnList() + ")";
      }
  }
