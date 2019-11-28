package com.snail.cmjsbridge;

/**
 * js回调native需要封装的数据格式
 */
public class JsMessageBean {

  /**
   * sdk版本号
   */
  public String version;
  /**
   * h5传递的方法名称
   */
  public String method;
  /**
   * data
   */
  public String params;//json参数
  /**
   * 回调事件id,生成规则: wjyg + (id++) + 当前时间
   */
  public String id;
}
