package com.ysocorp.ysonetwork.webview;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes6.dex */
public class YNWebViewClient extends WebViewClient {
    private final YNWebToAndroid ynWebToAndroid;

    public YNWebViewClient(YNWebToAndroid yNWebToAndroid) {
        this.ynWebToAndroid = yNWebToAndroid;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.ynWebToAndroid.activity.runOnUiThread(new Runnable() { // from class: com.ysocorp.ysonetwork.webview.YNWebViewClient$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                YNWebViewClient.this.lambda$onPageStarted$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPageStarted$0() {
        this.ynWebToAndroid.displayEvent("onPageStarted");
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, final WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest.isForMainFrame()) {
            webResourceError.getDescription().toString();
            this.ynWebToAndroid.activity.runOnUiThread(new Runnable() { // from class: com.ysocorp.ysonetwork.webview.YNWebViewClient$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    YNWebViewClient.this.lambda$onReceivedError$1(webResourceError);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onReceivedError$1(WebResourceError webResourceError) {
        this.ynWebToAndroid.closeEventWithError("onReceivedError", "WebViewError: " + webResourceError.getDescription().toString());
    }
}
