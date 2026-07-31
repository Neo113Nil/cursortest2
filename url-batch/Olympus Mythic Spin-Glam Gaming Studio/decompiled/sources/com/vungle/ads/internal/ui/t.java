package com.vungle.ads.internal.ui;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes15.dex */
public final class t extends Lambda implements Function0 {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ RenderProcessGoneDetail b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        super(0);
        this.a = webView;
        this.b = renderProcessGoneDetail;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        boolean didCrash;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onRenderProcessGone url: ");
        WebView webView = this.a;
        Boolean bool = null;
        a.append(webView != null ? webView.getUrl() : null);
        a.append(", did crash: ");
        RenderProcessGoneDetail renderProcessGoneDetail = this.b;
        if (renderProcessGoneDetail != null) {
            didCrash = renderProcessGoneDetail.didCrash();
            bool = Boolean.valueOf(didCrash);
        }
        a.append(bool);
        return a.toString();
    }
}
