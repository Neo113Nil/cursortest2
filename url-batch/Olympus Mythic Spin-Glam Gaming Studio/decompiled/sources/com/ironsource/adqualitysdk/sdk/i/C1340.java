package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.aps.ads.ApsAd;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾊ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1340 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1303 f3693;

    public C1340(C1303 c1303) {
        this.f3693 = c1303;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1303 c1303 = this.f3693;
        ApsAd apsAd = (ApsAd) arrayList.get(0);
        c1303.getClass();
        return apsAd.getAdView();
    }
}
