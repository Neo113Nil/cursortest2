package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Rect;
import android.view.View;
import android.webkit.WebView;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʻ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0472 extends AbstractViewOnLayoutChangeListenerC0474 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractViewOnLayoutChangeListenerC0474
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Object mo4009(WebView webView) {
        Rect rect = AbstractC1240.f3245;
        WebView webView2 = webView;
        while (webView2.getParent() instanceof View) {
            webView2 = (View) webView2.getParent();
        }
        return webView2;
    }
}
