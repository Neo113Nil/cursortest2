package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.FairBid;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ť, reason: contains not printable characters */
/* loaded from: classes13.dex */
public final class C0391 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1161 f211;

    public C0391(C1161 c1161) {
        this.f211 = c1161;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1161 c1161 = this.f211;
        FairBid.AdsConfig adsConfig = (FairBid.AdsConfig) arrayList.get(0);
        c1161.getClass();
        return adsConfig.store;
    }
}
