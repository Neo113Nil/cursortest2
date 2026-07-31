package com.fyber.inneractive.sdk.activities;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes6.dex */
public final class f extends WebChromeClient {
    public final /* synthetic */ InneractiveInternalBrowserActivity a;

    public f(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.a = inneractiveInternalBrowserActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        this.a.setTitle("Page is Loading...");
        this.a.setProgress(i * 100);
        if (i == 100) {
            this.a.setTitle(webView.getUrl());
        }
    }
}
