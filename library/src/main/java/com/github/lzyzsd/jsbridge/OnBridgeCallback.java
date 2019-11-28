package com.github.lzyzsd.jsbridge;

public interface OnBridgeCallback {
  /**
   * Native请求完web后,web发送回调触发的方法
   * @param data
   */
  void onCallBack(String data);
}
