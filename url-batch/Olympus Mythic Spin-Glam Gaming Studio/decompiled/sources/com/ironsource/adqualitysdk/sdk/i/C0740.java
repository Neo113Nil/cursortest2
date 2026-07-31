package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ร, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0740 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0529 f1666;

    public C0740(C0529 c0529) {
        this.f1666 = c0529;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0529 c0529 = this.f1666;
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) arrayList.get(0);
        c0529.getClass();
        return inneractiveFullscreenVideoContentController.getEventsListener();
    }
}
