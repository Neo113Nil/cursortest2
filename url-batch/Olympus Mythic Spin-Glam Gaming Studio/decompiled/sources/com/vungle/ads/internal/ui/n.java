package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes15.dex */
public final class n extends Lambda implements Function0 {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ WebViewRenderProcess b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        super(0);
        this.a = webView;
        this.b = webViewRenderProcess;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onRenderProcessUnresponsive(Title = ");
        a.append(this.a.getTitle());
        a.append(", URL = ");
        a.append(this.a.getOriginalUrl());
        a.append(", (webViewRenderProcess != null) = ");
        a.append(this.b != null);
        return a.toString();
    }
}
