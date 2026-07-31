package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒌ, reason: contains not printable characters */
/* loaded from: classes8.dex */
public final class C0807 extends AbstractRunnableC0913 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0794 f1992;

    public C0807(C0794 c0794) {
        this.f1992 = c0794;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        boolean mo4088;
        C0791 c0791 = this.f1992.f1879;
        String str = C0791.f1862;
        synchronized (c0791) {
            mo4088 = AbstractC0590.m4087().mo4088();
        }
        if (mo4088) {
            AbstractC1026.m4315(new C0809(this), AbstractC0590.m4087().mo4097());
        }
    }
}
