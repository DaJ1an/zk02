/**   
 * Copyright © 2019 北京八维研修学院. All rights reserved.
 * 
 * @Title: StringUtilTest.java 
 * @Prject: wangzijian_zk
 * @Package: com.wangzijian.common.utils 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月17日 上午9:22:08 
 * @version: V1.0   
 */
package com.wangzijian.common.utils;

import org.junit.jupiter.api.Test;

/** 
 * @ClassName: StringUtilTest 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月17日 上午9:22:08  
 */
class StringUtilTest {

  @Test
  void test() {
    String src = "111";
    boolean hasLength = StringUtil.hasLength(src);
    System.out.println(hasLength);
  }

  @Test
  void test2() {
    int i = StringUtil.generateChineseName();
    System.out.println(i);
  }
}
