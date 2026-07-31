package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.models.Ad;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺫ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1269 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f3433;

    public C1269(C1249 c1249) {
        this.f3433 = c1249;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1249 c1249 = this.f3433;
        Ad ad = (Ad) arrayList.get(0);
        String str = (String) arrayList.get(1);
        c1249.getClass();
        return ad.getAsset(str);
    }
}
