/**   
 * Copyright © 2019 北京八维研修学院. All rights reserved.
 * 
 * @Title: RandomUtilTest.java 
 * @Prject: wangzijian_zk
 * @Package: com.wangzijian.common.utils 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月17日 上午8:56:39 
 * @version: V1.0   
 */
package com.wangzijian.common.utils;

import org.junit.jupiter.api.Test;

/** 
 * @ClassName: RandomUtilTest 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月17日 上午8:56:39  
 */
class RandomUtilTest {

  /**
   * Test method for {@link com.wangzijian.common.utils.RandomUtil#random(int, int)}.
   */
  @Test
  void testRandom() {
    for (int i = 0; i < 5; i++) {
      System.out.println(RandomUtil.random(5, 1));
    }
  }

  /**
   * 
   * @Title: testRandom 
   * @Description: TODO
   * @return: void
   */
  @Test
  void test2() {
    for (int i = 0; i < 5; i++) {
      System.out.println(RandomUtil.subRandom(0, 5, 6));
    }
  }

  @Test
  void test3() {
    System.out.println(RandomUtil.randomCharacter());
  }

  @Test
  void test4() {
    System.out.println(RandomUtil.randomCharacter());
  }

  @Test
  void test5() {
    System.out.println(RandomUtil.randomString(4));
  }
}
