package com.ironsource.adqualitysdk.sdk.i;

import io.bidmachine.AdRequestParameters;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ถ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0731 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0648 f1655;

    public C0731(C0648 c0648) {
        this.f1655 = c0648;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0648 c0648 = this.f1655;
        AdRequestParameters adRequestParameters = (AdRequestParameters) arrayList.get(0);
        c0648.getClass();
        return adRequestParameters.getAdsType().getName();
    }
}
