package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ۅ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0675 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0624 f1439;

    public C0675(C0624 c0624) {
        this.f1439 = c0624;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        this.f1439.getClass();
        AdView adView = (AdView) AbstractC1100.m4401(arrayList, 0, AdView.class);
        this.f1439.getClass();
        adView.setAdListener((AdListener) AbstractC1100.m4401(arrayList, 1, AdListener.class));
        return null;
    }
}
