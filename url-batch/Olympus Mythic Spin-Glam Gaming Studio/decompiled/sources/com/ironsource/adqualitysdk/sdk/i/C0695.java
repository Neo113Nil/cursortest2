package com.ironsource.adqualitysdk.sdk.i;

import com.explorestack.protobuf.adcom.Ad;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ट, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C0695 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0648 f1549;

    public C0695(C0648 c0648) {
        this.f1549 = c0648;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0648 c0648 = this.f1549;
        Ad.Display display = (Ad.Display) arrayList.get(0);
        c0648.getClass();
        return display.getBanner();
    }
}
