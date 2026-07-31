package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᖮ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0925 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0813 f2220;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ EnumC0814 f2221;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2222;

    public C0925(C0813 c0813, String str, EnumC0814 enumC0814) {
        this.f2220 = c0813;
        this.f2222 = str;
        this.f2221 = enumC0814;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        synchronized (this.f2220) {
            this.f2220.f2004.put(this.f2222, this.f2221);
        }
    }
}
