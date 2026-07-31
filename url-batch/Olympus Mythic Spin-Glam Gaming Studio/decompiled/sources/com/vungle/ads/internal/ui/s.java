package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes15.dex */
public final class s extends Lambda implements Function0 {
    public final /* synthetic */ WebView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(WebView webView) {
        super(0);
        this.a = webView;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onRenderProcessGone url: ");
        WebView webView = this.a;
        a.append(webView != null ? webView.getUrl() : null);
        return a.toString();
    }
}
