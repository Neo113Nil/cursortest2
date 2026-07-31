package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﻛ, reason: contains not printable characters */
/* loaded from: classes14.dex */
public final class C1279 extends AbstractRunnableC0913 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1187 f3444;

    public C1279(C1187 c1187) {
        this.f3444 = c1187;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        try {
            C1187 c1187 = this.f3444;
            c1187.f3081 = Class.forName(c1187.f3076.f3102);
            AbstractC1026.m4312(new C1346(this));
        } catch (ClassNotFoundException e) {
            AbstractC0580.m4072(StringFog.decrypt("FJety8DAsm4UkJHD2M2qcic=\n", "VfTZorapxhc=\n"), StringFog.decrypt("vurdM0mPV5SI7MoyUsFc3Y/3jzlNylWJiLjAOhs=\n", "+5ivXDuvO/0=\n") + this.f3444.f3076.f3102 + StringFog.decrypt("i2M=\n", "sUPY6zaZ/RY=\n") + e.getLocalizedMessage());
        }
    }
}
