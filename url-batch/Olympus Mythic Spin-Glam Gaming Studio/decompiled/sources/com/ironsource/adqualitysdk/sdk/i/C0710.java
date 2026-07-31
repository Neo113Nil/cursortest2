package com.ironsource.adqualitysdk.sdk.i;

import com.explorestack.protobuf.adcom.Ad;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ন, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C0710 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0648 f1575;

    public C0710(C0648 c0648) {
        this.f1575 = c0648;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0648 c0648 = this.f1575;
        Ad.Display display = (Ad.Display) arrayList.get(0);
        c0648.getClass();
        return display.getAdm();
    }
}
