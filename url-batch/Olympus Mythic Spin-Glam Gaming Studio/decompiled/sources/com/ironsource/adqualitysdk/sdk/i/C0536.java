package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ѓ, reason: contains not printable characters */
/* loaded from: classes8.dex */
public final class C0536 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0529 f592;

    public C0536(C0529 c0529) {
        this.f592 = c0529;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0529 c0529 = this.f592;
        InneractiveUnitController inneractiveUnitController = (InneractiveUnitController) arrayList.get(0);
        c0529.getClass();
        return inneractiveUnitController.getSelectedContentController();
    }
}
