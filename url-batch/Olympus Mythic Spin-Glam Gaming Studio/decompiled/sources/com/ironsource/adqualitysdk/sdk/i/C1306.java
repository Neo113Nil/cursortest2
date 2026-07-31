package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.device.ads.DTBAdResponse;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｓ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1306 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1303 f3600;

    public C1306(C1303 c1303) {
        this.f3600 = c1303;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1303 c1303 = this.f3600;
        DTBAdResponse dTBAdResponse = (DTBAdResponse) arrayList.get(0);
        c1303.getClass();
        return dTBAdResponse.getDTBAds();
    }
}
