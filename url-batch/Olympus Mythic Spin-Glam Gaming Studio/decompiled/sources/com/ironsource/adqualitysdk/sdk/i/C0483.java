package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˊ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0483 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C4550a f419;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f420;

    public C0483(C4550a c4550a, String str) {
        this.f419 = c4550a;
        this.f420 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        WebView webView = this.f419.f132;
        String str = this.f420;
        String str2 = o.f157;
        if (webView != null) {
            if (webView.getHandler() == null && webView.getRootView() == null) {
                return;
            }
            StringBuilder m4006 = AbstractC0446.m4006("MsYxrTmCTuYo032pPIBQpznTKK5iww==\n", "WKdHzErhPI8=\n", new StringBuilder(), str);
            m4006.append(StringFog.decrypt("a6PGFA==\n", "SYrvLxY36LI=\n"));
            IronSourceNetworkBridge.webviewLoadUrl(webView, m4006.toString());
        }
    }
}
