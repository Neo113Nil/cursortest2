package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ڊ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0653 implements InterfaceC1076 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0634 f1386;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1153 f1387;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0442 f1388;

    public C0653(C0634 c0634, AbstractC0442 abstractC0442, InterfaceC1153 interfaceC1153) {
        this.f1386 = c0634;
        this.f1388 = abstractC0442;
        this.f1387 = interfaceC1153;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1076
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo4130() {
        C0951 c0951 = this.f1386.f1272.f613.f2439;
        synchronized (c0951) {
            c0951.f2267.remove(this);
        }
        this.f1386.f1272.m4043(this.f1388, this.f1387);
    }
}
