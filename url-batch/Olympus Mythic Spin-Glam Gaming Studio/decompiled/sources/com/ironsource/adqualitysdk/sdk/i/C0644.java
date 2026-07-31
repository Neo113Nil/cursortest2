package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.external.ImpressionData;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ٳ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0644 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0529 f1301;

    public C0644(C0529 c0529) {
        this.f1301 = c0529;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0529 c0529 = this.f1301;
        ImpressionData impressionData = (ImpressionData) arrayList.get(0);
        c0529.getClass();
        return impressionData.getAdvertiserDomain();
    }
}
