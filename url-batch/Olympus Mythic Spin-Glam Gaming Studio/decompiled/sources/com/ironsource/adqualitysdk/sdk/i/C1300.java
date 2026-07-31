package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.fairbid.internal.Constants;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｉ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1300 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1161 f3472;

    public C1300(C1161 c1161) {
        this.f3472 = c1161;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1161 c1161 = this.f3472;
        Constants.AdType adType = (Constants.AdType) arrayList.get(0);
        c1161.getClass();
        return adType.getPlacementType();
    }
}
