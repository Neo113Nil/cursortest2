package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.models.Ad;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ĭ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0367 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f184;

    public C0367(C1249 c1249) {
        this.f184 = c1249;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1249 c1249 = this.f184;
        Ad ad = (Ad) arrayList.get(0);
        c1249.getClass();
        return ad.getVast();
    }
}
