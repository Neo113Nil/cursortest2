package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Λ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0504 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1303 f462;

    public C0504(C1303 c1303) {
        this.f462 = c1303;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1303 c1303 = this.f462;
        DTBAdResponse dTBAdResponse = (DTBAdResponse) arrayList.get(0);
        DTBAdSize dTBAdSize = (DTBAdSize) arrayList.get(1);
        c1303.getClass();
        return dTBAdResponse.getPricePoints(dTBAdSize);
    }
}
