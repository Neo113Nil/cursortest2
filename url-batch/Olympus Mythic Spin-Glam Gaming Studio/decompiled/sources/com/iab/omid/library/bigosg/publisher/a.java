package com.iab.omid.library.bigosg.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* loaded from: classes11.dex */
public class a extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public a(String str, WebView webView) {
        super(str);
        if (webView != null) {
            com.iab.omid.library.bigosg.webviewclient.a.a(webView);
        }
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
