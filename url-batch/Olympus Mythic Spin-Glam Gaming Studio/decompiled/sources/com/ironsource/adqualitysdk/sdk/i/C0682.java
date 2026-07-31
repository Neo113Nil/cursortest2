package com.ironsource.adqualitysdk.sdk.i;

import com.explorestack.protobuf.adcom.Ad;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ܐ, reason: contains not printable characters */
/* loaded from: classes14.dex */
public final class C0682 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0648 f1495;

    public C0682(C0648 c0648) {
        this.f1495 = c0648;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0648 c0648 = this.f1495;
        Ad ad = (Ad) arrayList.get(0);
        c0648.getClass();
        return ad.getVideo();
    }
}
