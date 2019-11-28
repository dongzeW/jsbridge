package com.github.lzyzsd.jsbridge;

public interface WebViewJavascriptBridge {
  /**
   * 用于Native发消息给web
   *
   * @param data 数据格式为json
   */
  void sendToWeb(Object data);

  void sendToWeb(Object data, OnBridgeCallback responseCallback);

  void sendToWeb(String function, Object... values);
}
