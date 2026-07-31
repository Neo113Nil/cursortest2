package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.device.ads.DTBAdResponse;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｸ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1327 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1303 f3671;

    public C1327(C1303 c1303) {
        this.f3671 = c1303;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1303 c1303 = this.f3671;
        DTBAdResponse dTBAdResponse = (DTBAdResponse) arrayList.get(0);
        c1303.getClass();
        return dTBAdResponse.getImpressionUrl();
    }
}
