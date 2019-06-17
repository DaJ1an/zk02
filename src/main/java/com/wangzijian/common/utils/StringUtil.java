/**   
 * Copyright © 2019 北京八维研修学院. All rights reserved.
 * 
 * @Title: StringUtil.java 
 * @Prject: wangzijian_zk
 * @Package: com.wangzijian.common.utils 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月17日 上午9:19:55 
 * @version: V1.0   
 */
package com.wangzijian.common.utils;

import java.util.Random;

/** 
 * @ClassName: StringUtil 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月17日 上午9:19:55  
 */
public class StringUtil {
  /**
   * 
   * @Title:判断源字符串是否有值，空引号(空白字符串)也算没值
   * @Description: TODO
   * @param src
   * @return
   * @return: boolean
   */
  public static boolean hasLength(String src) {
    int length = src.length();
    if (length > 0) {
      return true;
    } else {
      return false;
    }
  }

  public static int generateChineseName() {
    Random random = new Random();
    return random.nextInt(40869 - 19968 + 1) + 19968;

  }
}
