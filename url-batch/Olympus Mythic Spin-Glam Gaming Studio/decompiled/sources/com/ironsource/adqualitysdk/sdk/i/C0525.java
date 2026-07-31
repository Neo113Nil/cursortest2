package com.ironsource.adqualitysdk.sdk.i;

import com.facebook.ads.AdView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ϛ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C0525 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0426 f524;

    public C0525(C0426 c0426) {
        this.f524 = c0426;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0426 c0426 = this.f524;
        AdView adView = (AdView) arrayList.get(0);
        c0426.getClass();
        return adView.getPlacementId();
    }
}
