package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.response.AdParams;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓴ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0862 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f2088;

    public C0862(C1249 c1249) {
        this.f2088 = c1249;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1249 c1249 = this.f2088;
        AdParams adParams = (AdParams) arrayList.get(0);
        c1249.getClass();
        return adParams.getAdParams();
    }
}
