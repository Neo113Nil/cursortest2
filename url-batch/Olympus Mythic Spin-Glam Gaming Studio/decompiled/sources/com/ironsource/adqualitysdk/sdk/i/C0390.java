package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.aps.ads.ApsAd;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ť, reason: contains not printable characters */
/* loaded from: classes13.dex */
public final class C0390 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1303 f210;

    public C0390(C1303 c1303) {
        this.f210 = c1303;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1303 c1303 = this.f210;
        ApsAd apsAd = (ApsAd) arrayList.get(0);
        c1303.getClass();
        return apsAd.getBidInfo();
    }
}
