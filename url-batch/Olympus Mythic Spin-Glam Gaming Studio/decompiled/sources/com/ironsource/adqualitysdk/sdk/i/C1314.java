package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｩ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1314 extends AbstractRunnableC0913 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1298 f3640;

    public C1314(C1298 c1298) {
        this.f3640 = c1298;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0916 c0916 = this.f3640.f3470.f3450.f3188;
        String decrypt = StringFog.decrypt("xZXW+dVDcF7QjeT7nks=\n", "o/m3nvslGSw=\n");
        C1315 c1315 = new C1315(this);
        c0916.getClass();
        C0916.m4240().post(new C0968(c0916, decrypt, c1315));
    }
}
