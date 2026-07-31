package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.models.Ad;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ļ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0378 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f195;

    public C0378(C1249 c1249) {
        this.f195 = c1249;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1249 c1249 = this.f195;
        Ad ad = (Ad) arrayList.get(0);
        c1249.getClass();
        try {
            return ad.toJson();
        } catch (Exception unused) {
            return null;
        }
    }
}
