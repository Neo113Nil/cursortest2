package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.FairBid;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ÿ, reason: contains not printable characters */
/* loaded from: classes13.dex */
public final class C0394 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1161 f215;

    public C0394(C1161 c1161) {
        this.f215 = c1161;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1161 c1161 = this.f215;
        FairBid.AdsConfig adsConfig = (FairBid.AdsConfig) arrayList.get(0);
        c1161.getClass();
        return adsConfig.appId;
    }
}
