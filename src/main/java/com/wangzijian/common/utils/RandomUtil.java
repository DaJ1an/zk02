/**   
 * Copyright © 2019 北京八维研修学院. All rights reserved.
 * 
 * @Title: RandomUtil.java 
 * @Prject: wangzijian_zk
 * @Package: com.wangzijian.common.utils 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月17日 上午8:41:41 
 * @version: V1.0   
 */
package com.wangzijian.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/** 
 * @ClassName: RandomUtil工具类
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月17日 上午8:41:41  
 */
public class RandomUtil {
  /**
   * 
   * @Title: 返回min-max之间的随机整数（包含min和max值）
   * @Description: TODO
   * @param max
   * @param min
   * @return
   * @return: int
   */
  public static int random(int max, int min) {
    Random r = new Random();

    return r.nextInt(max - min + 1) + min;
  }

  /**
   * 
   * @Title: 在最小值min与最大值max之间截取subs个不重复的随机数
   * @Description: TODO
   * @param min
   * @param max
   * @param subs
   * @return
   * @return: int[]
   */
  public static Set<Integer> subRandom(int min, int max, int subs) {
    Set<Integer> set = new HashSet<Integer>();
    if (set.size() != subs) {
      Random r = new Random();
      int i = r.nextInt(max - min + 1) + min;
    }
    return set;
  }

  /**
   * 
   * @Title:  返回1个1-9,a-Z之间的随机字符
   * @Description: TODO
   * @return
   * @return: char
   */
  public static char randomCharacter() {
    String s = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
    //int random = random(s.length() - 1, 0);
    return (char) random(s.length() - 1, 0);
  }

  /**
   * 
   * @Title: randomString 
   * @Description: TODO
   * @param length
   * @return
   * @return: String
   */
  public static String randomString(int length) {
    String s = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
    for (int i = 0; i < length; i++) {
      int random = random(s.length(), 0);
    }
    return s;
  }
}
