package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class o extends WebViewRenderProcessClient {
    public com.vungle.ads.internal.ui.view.p a;

    public o(com.vungle.ads.internal.ui.view.p pVar) {
        this.a = pVar;
    }

    public final void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        Intrinsics.checkNotNullParameter(webView, "webView");
    }

    public final void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", new n(webView, webViewRenderProcess));
        com.vungle.ads.internal.ui.view.p pVar = this.a;
        if (pVar != null) {
            ((com.vungle.ads.internal.presenter.r) pVar).e();
        }
    }
}
