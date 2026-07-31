package com.ironsource.adqualitysdk.sdk.i;

import com.explorestack.protobuf.adcom.Ad;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.চ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C0705 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0648 f1563;

    public C0705(C0648 c0648) {
        this.f1563 = c0648;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0648 c0648 = this.f1563;
        Ad ad = (Ad) arrayList.get(0);
        int intValue = ((Integer) arrayList.get(1)).intValue();
        c0648.getClass();
        return ad.getBundle(intValue);
    }
}
