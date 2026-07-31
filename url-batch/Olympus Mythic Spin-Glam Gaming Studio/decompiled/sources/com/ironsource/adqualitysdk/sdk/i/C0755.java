package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ງ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0755 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0624 f1689;

    public C0755(C0624 c0624) {
        this.f1689 = c0624;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        this.f1689.getClass();
        AdManagerAdView adManagerAdView = (AdManagerAdView) AbstractC1100.m4401(arrayList, 0, AdManagerAdView.class);
        this.f1689.getClass();
        adManagerAdView.setAdListener((AdListener) AbstractC1100.m4401(arrayList, 1, AdListener.class));
        return null;
    }
}
