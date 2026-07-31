package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.fairbid.ads.ImpressionData;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ƭ, reason: contains not printable characters */
/* loaded from: classes13.dex */
public final class C0406 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1161 f229;

    public C0406(C1161 c1161) {
        this.f229 = c1161;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1161 c1161 = this.f229;
        ImpressionData impressionData = (ImpressionData) arrayList.get(0);
        c1161.getClass();
        return impressionData.getAdvertiserDomain();
    }
}
