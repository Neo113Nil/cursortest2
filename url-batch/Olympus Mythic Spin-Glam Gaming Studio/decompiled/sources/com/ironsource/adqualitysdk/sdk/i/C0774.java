package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.appopen.AppOpenAd;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ꮭ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C0774 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0624 f1816;

    public C0774(C0624 c0624) {
        this.f1816 = c0624;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0624 c0624 = this.f1816;
        c0624.getClass();
        return new C0649(c0624, (AppOpenAd.AppOpenAdLoadCallback) AbstractC1100.m4401(arrayList, 0, AppOpenAd.AppOpenAdLoadCallback.class), c1189);
    }
}
