package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.media.ads.network.common.model.AdSet;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒩ, reason: contains not printable characters */
/* loaded from: classes8.dex */
public final class C0820 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0771 f2023;

    public C0820(C0771 c0771) {
        this.f2023 = c0771;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0771 c0771 = this.f2023;
        AdSet adSet = (AdSet) arrayList.get(0);
        c0771.getClass();
        return adSet.getAds();
    }
}
