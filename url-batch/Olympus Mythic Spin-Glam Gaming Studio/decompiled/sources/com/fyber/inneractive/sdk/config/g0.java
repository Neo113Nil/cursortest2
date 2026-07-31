package com.fyber.inneractive.sdk.config;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes6.dex */
public final class g0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        WebView webView;
        IAConfigManager iAConfigManager = IAConfigManager.N;
        WebView webView2 = iAConfigManager.K;
        if (webView2 == null || iAConfigManager.f == null) {
            return;
        }
        webView2.destroy();
        try {
            webView = new WebView(iAConfigManager.f);
            webView.setWebViewClient(new y());
        } catch (Throwable unused) {
            IAlog.a("failed to create a new webview", new Object[0]);
            webView = null;
        }
        iAConfigManager.K = webView;
    }
}
