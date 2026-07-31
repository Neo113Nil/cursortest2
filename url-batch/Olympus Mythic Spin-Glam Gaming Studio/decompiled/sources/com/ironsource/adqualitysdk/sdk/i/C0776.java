package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.media.ads.network.common.model.Ad;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐜ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0776 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0771 f1818;

    public C0776(C0771 c0771) {
        this.f1818 = c0771;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0771 c0771 = this.f1818;
        Ad ad = (Ad) arrayList.get(0);
        c0771.getClass();
        return ad.getContextData();
    }
}
