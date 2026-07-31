package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓓ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0845 extends AbstractRunnableC0913 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0756 f2068;

    public C0845(C0756 c0756) {
        this.f2068 = c0756;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0756 c0756 = this.f2068;
        if (c0756.f1691 == null) {
            c0756.f1691 = new C0851(this);
            c0756.f1693.post(new C0846(this));
        }
    }
}
