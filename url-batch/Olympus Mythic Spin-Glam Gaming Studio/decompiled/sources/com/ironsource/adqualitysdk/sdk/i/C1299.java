package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.fairbid.ads.ImpressionData;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｆ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1299 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1161 f3471;

    public C1299(C1161 c1161) {
        this.f3471 = c1161;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1161 c1161 = this.f3471;
        ImpressionData impressionData = (ImpressionData) arrayList.get(0);
        c1161.getClass();
        return impressionData.getPlacementType();
    }
}
