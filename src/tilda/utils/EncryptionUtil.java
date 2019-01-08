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

import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Base64;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EncryptionUtil
  {

    protected static final Logger LOG = LogManager.getLogger(EncryptionUtil.class.getName());

    public static String hash(String plaintext)
      {
    	return hash(plaintext, "SHA-512");
      }
    
    public static String hash(String plaintext, String algo)
      {
        if (TextUtil.isNullOrEmpty(plaintext) == true)
          return null;
        try
          {
            MessageDigest md = MessageDigest.getInstance(algo);
            md.update(plaintext.getBytes("UTF-8"));
            return new String(Base64.getEncoder().encodeToString(md.digest()));
          }
        catch (Exception e)
          {
            LOG.error(e);
            return null;
          }
      }
    
    public static byte[] sha(String plainText, String shaAlgo) 
      {
          if (TextUtil.isNullOrEmpty(plainText) == true)
            return null;
          try
            {
        	    MessageDigest md5 = MessageDigest.getInstance(shaAlgo);
        	    byte[] digest = md5.digest(plainText.getBytes("UTF-8"));
        	    return digest;
            }
          catch (Exception e)
            {
              LOG.error(e);
              return null;
            }
      }

    /**
     * A short-hand version of {@link #getToken(int, boolean)} with alphaNumOnly set to false
     * @param size The size of the returned String. If size is < 8, then it will be changed to 8. If it's > 254, it will be changed to 254.
     * @return A string of random characters of a minimum size of 8, and maximum size of 254.
     */
    public static String getToken(int size)
      {
        return getToken(size, false);
      }
    /**
     * Generates a random string with "size" characters.
     * @param size The size of the returned String. If size is < 8, then it will be changed to 8. If it's > 254, it will be changed to 254.
     * @param alphaNumOnly Whether the returned random string should only contain alphanumeric characters or not.
     * @return A string of random characters of a minimum size of 8, and maximum size of 254.
     */
    public static String getToken(int size, boolean alphaNumOnly)
      {
        if (size < 8)
          size = 8;
        else if (size > 254)
          size = 254;
        char[] possibleCharacters = (new String(alphaNumOnly == true ? "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
        : "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?")).toCharArray();
        return RandomStringUtils.random(size, 0, possibleCharacters.length - 1, false, false, possibleCharacters, new SecureRandom());
      }
    
    public static String bytesToHex(byte[] digest) {
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < digest.length; ++i) {
	        sb.append(Integer.toHexString((digest[i] & 0xFF) | 0x100).substring(1, 3));
	    }
    	return sb.toString();
    }
    
    public static byte[] hexStringToByteArray(String s) {
        byte[] b = new byte[s.length() / 2];
        for (int i = 0; i < b.length; i++) {
          int index = i * 2;
          int v = Integer.parseInt(s.substring(index, index + 2), 16);
          b[i] = (byte) v;
        }
        return b;
    }
    
  }
