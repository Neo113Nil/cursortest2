package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ة, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0630 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0600 f1266;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1212 f1267;

    public C0630(C0600 c0600, InterfaceC1212 interfaceC1212) {
        this.f1266 = c0600;
        this.f1267 = interfaceC1212;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        boolean z;
        this.f1266.f1011.add(this.f1267);
        C0600 c0600 = this.f1266;
        synchronized (c0600) {
            z = c0600.f1009;
        }
        if (z) {
            this.f1267.mo3995();
        }
    }
}
