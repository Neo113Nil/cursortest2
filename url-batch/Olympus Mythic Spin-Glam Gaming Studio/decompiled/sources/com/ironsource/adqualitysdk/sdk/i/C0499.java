package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.device.ads.DTBAdSize;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ύ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0499 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1303 f458;

    public C0499(C1303 c1303) {
        this.f458 = c1303;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1303 c1303 = this.f458;
        DTBAdSize dTBAdSize = (DTBAdSize) arrayList.get(0);
        c1303.getClass();
        return dTBAdSize.getDTBAdType();
    }
}
