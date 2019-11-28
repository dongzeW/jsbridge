package com.snail.cmjsbridge;

/**
 * js触发Native方法,分发接口
 */
public interface IJsCallBack {
  /**
   * 当h5调用到原生,bridge层分发消息到页面
   * 事件分发到页面处理
   */
  void onJsCall(JsMessageBean jsMessageBean);
}
