package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Collections;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ڒ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0661 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0654 f1413;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ISAdQualityCustomMediationRevenue f1414;

    public C0661(C0654 c0654, ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        this.f1413 = c0654;
        this.f1414 = iSAdQualityCustomMediationRevenue;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0791 c0791 = this.f1413.f1390;
        String decrypt = StringFog.decrypt("3SHkxDro8Zjeau/DGOnrg98p0sgt\n", "sESArVucmPc=\n");
        C0654 c0654 = this.f1413;
        ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue = this.f1414;
        c0654.getClass();
        C1094 c1094 = new C1094();
        c1094.f2797 = true;
        c1094.f2800 = iSAdQualityCustomMediationRevenue.getRevenue();
        c1094.f2802 = C0654.m4131(iSAdQualityCustomMediationRevenue.getMediationNetwork());
        c1094.f2798 = iSAdQualityCustomMediationRevenue.getPlacement();
        c0791.m4205(decrypt, Collections.singletonList(c1094.m4392()));
        this.f1413.f1391 = true;
    }
}
