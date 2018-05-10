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

package tilda.utils;

public class PaddingTracker
  {
    public PaddingTracker()
      {
      }

    protected int _Max;

    public void track(String str)
      {
        if (_Max < str.length())
          _Max = str.length();
      }

    public String pad(String str)
      {
        return PaddingUtil.Pad(str,  _Max);
      }
    
    public String getPad(String Str)
      {
        return PaddingUtil.getPad(_Max-Str.length());
      }
    
    public void clear()
      {
        _Max = 0;
      }
  }
