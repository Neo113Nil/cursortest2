package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.media.ads.network.common.model.Ad;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔭ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0893 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0771 f2160;

    public C0893(C0771 c0771) {
        this.f2160 = c0771;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0771 c0771 = this.f2160;
        Ad ad = (Ad) arrayList.get(0);
        c0771.getClass();
        return ad.getRewards();
    }
}
