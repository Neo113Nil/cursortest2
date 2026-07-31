package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ҭ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0573 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0529 f962;

    public C0573(C0529 c0529) {
        this.f962 = c0529;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0529 c0529 = this.f962;
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) arrayList.get(0);
        c0529.getClass();
        return Boolean.valueOf(inneractiveAdSpot.getAdContent().isVideoAd());
    }
}
