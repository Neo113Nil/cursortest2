package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.core.ad.InterstitialAdPresenter;
import com.smaato.sdk.video.ad.InterstitialVideoAdPresenter;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ן, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0614 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f1118;

    public C0614(C0563 c0563) {
        this.f1118 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0563 c0563 = this.f1118;
        InterstitialVideoAdPresenter interstitialVideoAdPresenter = (InterstitialVideoAdPresenter) arrayList.get(0);
        InterstitialAdPresenter.Listener listener = (InterstitialAdPresenter.Listener) arrayList.get(1);
        c0563.getClass();
        interstitialVideoAdPresenter.setListener(listener);
        return null;
    }
}
