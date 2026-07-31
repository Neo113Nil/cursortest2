package yads;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class as3 implements InterstitialAd {
    public final zb1 a;
    public final yp3 b;

    public as3(zb1 zb1Var) {
        yp3 yp3Var = new yp3();
        this.a = zb1Var;
        this.b = yp3Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof as3) && Intrinsics.areEqual(((as3) obj).a, this.a);
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final AdInfo getAdInfo() {
        return this.b.a((zz) this.a.f.getValue());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final void setAdEventListener(InterstitialAdEventListener interstitialAdEventListener) {
        gs3 gs3Var = new gs3(interstitialAdEventListener);
        zb1 zb1Var = this.a;
        zb1Var.c.a();
        zb1Var.b.c = gs3Var;
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final void show(Activity activity) {
        this.a.a(activity);
    }
}
