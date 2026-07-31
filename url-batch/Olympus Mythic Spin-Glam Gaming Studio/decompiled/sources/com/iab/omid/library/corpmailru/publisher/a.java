package com.iab.omid.library.corpmailru.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* loaded from: classes5.dex */
public class a extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
