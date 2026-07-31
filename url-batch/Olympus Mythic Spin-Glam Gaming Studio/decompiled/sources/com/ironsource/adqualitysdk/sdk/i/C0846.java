package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓕ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0846 extends AbstractRunnableC0913 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0845 f2069;

    public C0846(C0845 c0845) {
        this.f2069 = c0845;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        AbstractC0698 m4143 = AbstractC0698.m4143();
        C0851 c0851 = this.f2069.f2068.f1691;
        synchronized (m4143) {
            m4143.f1553.add(c0851);
        }
        AbstractC1026.m4313(new C0848(this));
    }
}
