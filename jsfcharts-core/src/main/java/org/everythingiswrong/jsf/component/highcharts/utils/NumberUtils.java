package org.everythingiswrong.jsf.component.highcharts.utils;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberUtils {
	//--------------------------------------------------------------------
	  
	  // must handle Long, Float, Integer, Float, Short,
	  //                  BigDecimal, BigInteger and Byte
	  // useful methods:
	  // Byte.decode(String)
	  // Byte.valueOf(String,int radix)
	  // Byte.valueOf(String)
	  // Double.valueOf(String)
	  // Float.valueOf(String)
	  // new Float(String)
	  // Integer.valueOf(String,int radix)
	  // Integer.valueOf(String)
	  // Integer.decode(String)
	  // Integer.getInteger(String)
	  // Integer.getInteger(String,int val)
	  // Integer.getInteger(String,Integer val)
	  // new Integer(String)
	  // new Double(String)
	  // new Byte(String)
	  // new Long(String)
	  // Long.getLong(String)
	  // Long.getLong(String,int)
	  // Long.getLong(String,Integer)
	  // Long.valueOf(String,int)
	  // Long.valueOf(String)
	  // new Short(String)
	  // Short.decode(String)
	  // Short.valueOf(String,int)
	  // Short.valueOf(String)
	  // new BigDecimal(String)
	  // new BigInteger(String)
	  // new BigInteger(String,int radix)
	  // Possible inputs:
	  // 45 45.5 45E7 4.5E7 Hex Oct Binary xxxF xxxD xxxf xxxd
	  // plus minus everything. Prolly more. A lot are not separable.

	  /**
	   * <p>Turns a string value into a java.lang.Number.</p>
	   *
	   * <p>First, the value is examined for a type qualifier on the end
	   * (<code>'f','F','d','D','l','L'</code>).  If it is found, it starts 
	   * trying to create successively larger types from the type specified
	   * until one is found that can hold the value.</p>
	   *
	   * <p>If a type specifier is not found, it will check for a decimal point
	   * and then try successively larger types from <code>Integer</code> to
	   * <code>BigInteger</code> and from <code>Float</code> to
	   * <code>BigDecimal</code>.</p>
	   *
	   * <p>If the string starts with <code>0x</code> or <code>-0x</code>, it
	   * will be interpreted as a hexadecimal integer.  Values with leading
	   * <code>0</code>'s will not be interpreted as octal.</p>
	   *
	   * @param val String containing a number
	   * @return Number created from the string
	   * @throws NumberFormatException if the value cannot be converted
	   */
	  public static Number createNumber(String val) throws NumberFormatException {
	      if (val == null) {
	          return null;
	      }
	      if (val.length() == 0) {
	          throw new NumberFormatException("\"\" is not a valid number.");
	      }
	      if (val.startsWith("--")) {
	          // this is protection for poorness in java.lang.BigDecimal.
	          // it accepts this as a legal value, but it does not appear 
	          // to be in specification of class. OS X Java parses it to 
	          // a wrong value.
	          return null;
	      }
	      if (val.startsWith("0x") || val.startsWith("-0x")) {
	          return createInteger(val);
	      }   
	      char lastChar = val.charAt(val.length() - 1);
	      String mant;
	      String dec;
	      String exp;
	      int decPos = val.indexOf('.');
	      int expPos = val.indexOf('e') + val.indexOf('E') + 1;

	      if (decPos > -1) {

	          if (expPos > -1) {
	              if (expPos < decPos) {
	                  throw new NumberFormatException(val + " is not a valid number.");
	              }
	              dec = val.substring(decPos + 1, expPos);
	          } else {
	              dec = val.substring(decPos + 1);
	          }
	          mant = val.substring(0, decPos);
	      } else {
	          if (expPos > -1) {
	              mant = val.substring(0, expPos);
	          } else {
	              mant = val;
	          }
	          dec = null;
	      }
	      if (!Character.isDigit(lastChar)) {
	          if (expPos > -1 && expPos < val.length() - 1) {
	              exp = val.substring(expPos + 1, val.length() - 1);
	          } else {
	              exp = null;
	          }
	          //Requesting a specific type..
	          String numeric = val.substring(0, val.length() - 1);
	          boolean allZeros = isAllZeros(mant) && isAllZeros(exp);
	          switch (lastChar) {
	              case 'l' :
	              case 'L' :
	                  if (dec == null
	                      && exp == null
	                      && (numeric.charAt(0) == '-' && isDigits(numeric.substring(1)) || isDigits(numeric))) {
	                      try {
	                          return createLong(numeric);
	                      } catch (NumberFormatException nfe) {
	                          //Too big for a long
	                      }
	                      return createBigInteger(numeric);

	                  }
	                  throw new NumberFormatException(val + " is not a valid number.");
	              case 'f' :
	              case 'F' :
	                  try {
	                      Float f = createFloat(numeric);
	                      if (!(f.isInfinite() || (f.floatValue() == 0.0F && !allZeros))) {
	                          //If it's too big for a float or the float value = 0 and the string
	                          //has non-zeros in it, then float does not have the precision we want
	                          return f;
	                      }

	                  } catch (NumberFormatException e) {
	                      // ignore the bad number
	                  }
	                  //Fall through
	              case 'd' :
	              case 'D' :
	                  try {
	                      Double d = createDouble(numeric);
	                      if (!(d.isInfinite() || (d.floatValue() == 0.0D && !allZeros))) {
	                          return d;
	                      }
	                  } catch (NumberFormatException nfe) {
	                      // empty catch
	                  }
	                  try {
	                      return createBigDecimal(numeric);
	                  } catch (NumberFormatException e) {
	                      // empty catch
	                  }
	                  //Fall through
	              default :
	                  throw new NumberFormatException(val + " is not a valid number.");

	          }
	      } else {
	          //User doesn't have a preference on the return type, so let's start
	          //small and go from there...
	          if (expPos > -1 && expPos < val.length() - 1) {
	              exp = val.substring(expPos + 1, val.length());
	          } else {
	              exp = null;
	          }
	          if (dec == null && exp == null) {
	              //Must be an int,long,bigint
	              try {
	                  return createInteger(val);
	              } catch (NumberFormatException nfe) {
	                  // empty catch
	              }
	              try {
	                  return createLong(val);
	              } catch (NumberFormatException nfe) {
	                  // empty catch
	              }
	              return createBigInteger(val);

	          } else {
	              //Must be a float,double,BigDec
	              boolean allZeros = isAllZeros(mant) && isAllZeros(exp);
	              try {
	                  Float f = createFloat(val);
	                  if (!(f.isInfinite() || (f.floatValue() == 0.0F && !allZeros))) {
	                      return f;
	                  }
	              } catch (NumberFormatException nfe) {
	                  // empty catch
	              }
	              try {
	                  Double d = createDouble(val);
	                  if (!(d.isInfinite() || (d.doubleValue() == 0.0D && !allZeros))) {
	                      return d;
	                  }
	              } catch (NumberFormatException nfe) {
	                  // empty catch
	              }

	              return createBigDecimal(val);

	          }

	      }
	  }

	  /**
	   * <p>Utility method for {@link #createNumber(java.lang.String)}.</p>
	   *
	   * <p>Returns <code>true</code> if s is <code>null</code>.</p>
	   * 
	   * @param s the String to check
	   * @return if it is all zeros or <code>null</code>
	   */
	  private static boolean isAllZeros(String s) {
	      if (s == null) {
	          return true;
	      }
	      for (int i = s.length() - 1; i >= 0; i--) {
	          if (s.charAt(i) != '0') {
	              return false;
	          }
	      }
	      return s.length() > 0;
	  }

	  //--------------------------------------------------------------------
	  
	  /**
	   * <p>Convert a <code>String</code> to a <code>Float</code>.</p>
	   * 
	   * @param val  a <code>String</code> to convert
	   * @return converted <code>Float</code>
	   * @throws NumberFormatException if the value cannot be converted
	   */
	  public static Float createFloat(String val) {
	      return Float.valueOf(val);
	  }

	  /**
	   * <p>Convert a <code>String</code> to a <code>Double</code>.</p>
	   * 
	   * @param val  a <code>String</code> to convert
	   * @return converted <code>Double</code>
	   * @throws NumberFormatException if the value cannot be converted
	   */
	  public static Double createDouble(String val) {
	      return Double.valueOf(val);
	  }

	  /**
	   * <p>Convert a <code>String</code> to a <code>Integer</code>, handling
	   * hex and octal notations.</p>
	   * 
	   * @param val  a <code>String</code> to convert
	   * @return converted <code>Integer</code>
	   * @throws NumberFormatException if the value cannot be converted
	   */
	  public static Integer createInteger(String val) {
	      // decode() handles 0xAABD and 0777 (hex and octal) as well.
	      return Integer.decode(val);
	  }

	  /**
	   * <p>Convert a <code>String</code> to a <code>Long</code>.</p>
	   * 
	   * @param val  a <code>String</code> to convert
	   * @return converted <code>Long</code>
	   * @throws NumberFormatException if the value cannot be converted
	   */
	  public static Long createLong(String val) {
	      return Long.valueOf(val);
	  }

	  /**
	   * <p>Convert a <code>String</code> to a <code>BigInteger</code>.</p>
	   * 
	   * @param val  a <code>String</code> to convert
	   * @return converted <code>BigInteger</code>
	   * @throws NumberFormatException if the value cannot be converted
	   */
	  public static BigInteger createBigInteger(String val) {
	      BigInteger bi = new BigInteger(val);
	      return bi;
	  }

	  /**
	   * <p>Convert a <code>String</code> to a <code>BigDecimal</code>.</p>
	   * 
	   * @param val  a <code>String</code> to convert
	   * @return converted <code>BigDecimal</code>
	   * @throws NumberFormatException if the value cannot be converted
	   */
	  public static BigDecimal createBigDecimal(String val) {
	      BigDecimal bd = new BigDecimal(val);
	      return bd;
	  }
	  
	  //--------------------------------------------------------------------
	  
	  /**
	   * <p>Checks whether the <code>String</code> contains only
	   * digit characters.</p>
	   *
	   * <p><code>Null</code> and empty String will return
	   * <code>false</code>.</p>
	   *
	   * @param str  the <code>String</code> to check
	   * @return <code>true</code> if str contains only unicode numeric
	   */
	  public static boolean isDigits(String str) {
	      if ((str == null) || (str.length() == 0)) {
	          return false;
	      }
	      for (int i = 0; i < str.length(); i++) {
	          if (!Character.isDigit(str.charAt(i))) {
	              return false;
	          }
	      }
	      return true;
	  }
}
