package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.א, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0601 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0600 f1036;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0412 f1037;

    public C0601(C0600 c0600, C0412 c0412) {
        this.f1036 = c0600;
        this.f1037 = c0412;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        boolean z;
        C0600 c0600 = this.f1036;
        c0600.f1013 = this.f1037;
        synchronized (c0600) {
            z = c0600.f1009;
        }
        if (z) {
            this.f1037.mo3995();
        }
    }
}
