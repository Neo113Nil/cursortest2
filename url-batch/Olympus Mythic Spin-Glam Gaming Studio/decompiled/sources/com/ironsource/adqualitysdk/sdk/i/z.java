package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.common.ImpressionData;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class z implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ H f172;

    public z(H h) {
        this.f172 = h;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        H h = this.f172;
        ImpressionData impressionData = (ImpressionData) arrayList.get(0);
        h.getClass();
        return impressionData.getRawData();
    }
}
