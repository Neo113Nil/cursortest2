package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.mediation.MaxAd;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᑈ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0798 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0795 f1984;

    public C0798(C0795 c0795) {
        this.f1984 = c0795;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0795 c0795 = this.f1984;
        MaxAd maxAd = (MaxAd) arrayList.get(0);
        c0795.getClass();
        return maxAd.getCreativeId();
    }
}
