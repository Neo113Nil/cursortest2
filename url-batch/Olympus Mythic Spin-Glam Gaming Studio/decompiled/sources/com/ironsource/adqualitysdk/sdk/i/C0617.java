package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ע, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0617 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0600 f1121;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0388 f1122;

    public C0617(C0600 c0600, C0388 c0388) {
        this.f1121 = c0600;
        this.f1122 = c0388;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        boolean z;
        C0600 c0600 = this.f1121;
        synchronized (c0600) {
            z = c0600.f1009;
        }
        if (z) {
            this.f1122.mo3995();
        } else {
            this.f1121.f1012.add(this.f1122);
        }
    }
}
