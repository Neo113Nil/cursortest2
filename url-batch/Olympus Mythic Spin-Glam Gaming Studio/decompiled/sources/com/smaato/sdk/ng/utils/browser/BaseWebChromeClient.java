package com.smaato.sdk.ng.utils.browser;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes9.dex */
public class BaseWebChromeClient extends WebChromeClient {
    private WebChromeClientCallback a;

    public interface WebChromeClientCallback {
        void onProgressChanged(int i);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        WebChromeClientCallback webChromeClientCallback = this.a;
        if (webChromeClientCallback != null) {
            webChromeClientCallback.onProgressChanged(i);
        }
    }

    public void setWebChromeClientCallback(WebChromeClientCallback webChromeClientCallback) {
        this.a = webChromeClientCallback;
    }
}
