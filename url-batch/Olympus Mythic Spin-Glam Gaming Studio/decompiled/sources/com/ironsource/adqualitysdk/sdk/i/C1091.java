package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ι, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1091 extends AbstractRunnableC0913 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0497 f2776;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ boolean f2777;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f2778;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ WebView f2779;

    public C1091(C0497 c0497, WebView webView, String str, boolean z) {
        this.f2776 = c0497;
        this.f2779 = webView;
        this.f2778 = str;
        this.f2777 = z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        AbstractC1026.m4316(new C0475(this, this.f2779.getOriginalUrl(), this.f2776.f441.mo4009(this.f2779)));
    }
}
