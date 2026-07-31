package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ܥ, reason: contains not printable characters */
/* loaded from: classes14.dex */
public final class C0691 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0529 f1546;

    public C0691(C0529 c0529) {
        this.f1546 = c0529;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0529 c0529 = this.f1546;
        InneractiveAdViewUnitController inneractiveAdViewUnitController = (InneractiveAdViewUnitController) arrayList.get(0);
        c0529.getClass();
        return inneractiveAdViewUnitController.getAdSpot();
    }
}
