package com.github.lzyzsd.jsbridge.example;

import android.util.Log;
import androidx.collection.ArrayMap;
import com.github.lzyzsd.jsbridge.BridgeWebView;

import com.github.lzyzsd.jsbridge.OnBridgeCallback;

import java.util.Map;

/**
 * Created on 2019/7/10.
 * Author: bigwang
 * Description:
 */
public class MainJavascriptInterface extends BridgeWebView.BaseJavascriptInterface {

  private BridgeWebView mWebView;
  private Map<String, String> mCallbacks = new ArrayMap<>();

  public String getReponseId() {
    return reponseId;
  }

  public void setReponseId(String reponseId) {
    this.reponseId = reponseId;
  }

  private String reponseId;

  public MainJavascriptInterface(Map<String, OnBridgeCallback> callbacks, BridgeWebView webView) {
    super(callbacks);
    mWebView = webView;
  }

  @Override public String sendImpl(String data, String webResponseId) {
    //native处理完的数据回传给web
    mCallbacks.put(webResponseId, webResponseId);
    setReponseId(webResponseId);
    return null;
  }

  public void responseWeb(String webResponseId) {
    mWebView.sendResponse("hello java", mCallbacks.get(webResponseId));
    Log.d("jsbridge", "map里是啥: = " + mCallbacks.remove(webResponseId));
  }
}
