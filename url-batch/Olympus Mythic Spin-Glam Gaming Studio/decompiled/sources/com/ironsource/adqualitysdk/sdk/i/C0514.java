package com.ironsource.adqualitysdk.sdk.i;

import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.κ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0514 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0426 f477;

    public C0514(C0426 c0426) {
        this.f477 = c0426;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0426 c0426 = this.f477;
        AdView adView = (AdView) arrayList.get(0);
        AdListener adListener = (AdListener) arrayList.get(1);
        c0426.getClass();
        adView.setAdListener(adListener);
        return null;
    }
}
