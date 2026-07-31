package com.ironsource.adqualitysdk.sdk.i;

import com.tapjoy.TJPlacementData;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔋ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0885 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0721 f2151;

    public C0885(C0721 c0721) {
        this.f2151 = c0721;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0721 c0721 = this.f2151;
        TJPlacementData tJPlacementData = (TJPlacementData) arrayList.get(0);
        c0721.getClass();
        return tJPlacementData.getHttpResponse();
    }
}
