package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒲ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0829 extends AbstractRunnableC0913 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C0791 f2031;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractRunnableC0913 f2032;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0955 f2033;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Context f2034;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2035;

    public C0829(C0791 c0791, String str, Context context, AbstractC0955 abstractC0955, AbstractRunnableC0913 abstractRunnableC0913) {
        this.f2031 = c0791;
        this.f2035 = str;
        this.f2034 = context;
        this.f2033 = abstractC0955;
        this.f2032 = abstractRunnableC0913;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        if (this.f2031.f1876.get()) {
            return;
        }
        String lowerCase = this.f2035.toLowerCase();
        C0696 c0696 = this.f2031.f1867;
        if (c0696 == null) {
            return;
        }
        c0696.f1550.put(lowerCase, new C0715(lowerCase));
        AbstractC1026.m4316(new C0830(this, lowerCase));
    }
}
