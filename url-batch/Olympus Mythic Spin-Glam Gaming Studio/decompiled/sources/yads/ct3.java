package yads;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ct3 implements RewardedAd {
    public final kr2 a;
    public final yp3 b;

    public ct3(kr2 kr2Var) {
        yp3 yp3Var = new yp3();
        this.a = kr2Var;
        this.b = yp3Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ct3) && Intrinsics.areEqual(((ct3) obj).a, this.a);
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final AdInfo getAdInfo() {
        return this.b.a((zz) this.a.f.getValue());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final void setAdEventListener(RewardedAdEventListener rewardedAdEventListener) {
        jt3 jt3Var = new jt3(rewardedAdEventListener);
        kr2 kr2Var = this.a;
        kr2Var.c.a();
        kr2Var.b.c = jt3Var;
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final void show(Activity activity) {
        this.a.a(activity);
    }
}
