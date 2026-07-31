package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒍ, reason: contains not printable characters */
/* loaded from: classes8.dex */
public final class C0808 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0756 f1993;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0887 f1994;

    public C0808(C0756 c0756, InterfaceC0887 interfaceC0887) {
        this.f1993 = c0756;
        this.f1994 = interfaceC0887;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        this.f1993.f1694.put(this.f1994, new C0811(this));
        C0756.m4156(this.f1993);
    }
}
