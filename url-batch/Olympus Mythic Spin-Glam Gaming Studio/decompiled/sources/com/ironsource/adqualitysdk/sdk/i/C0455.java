package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.device.ads.DTBAdSize;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʜ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0455 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1303 f342;

    public C0455(C1303 c1303) {
        this.f342 = c1303;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1303 c1303 = this.f342;
        DTBAdSize dTBAdSize = (DTBAdSize) arrayList.get(0);
        c1303.getClass();
        return dTBAdSize.getPubSettings();
    }
}
