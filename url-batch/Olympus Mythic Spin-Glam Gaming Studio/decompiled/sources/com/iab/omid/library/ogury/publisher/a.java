package com.iab.omid.library.ogury.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public class a extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public a(String str, WebView webView) {
        super(str);
        if (webView != null) {
            com.iab.omid.library.ogury.webviewclient.a.a(webView);
        }
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
