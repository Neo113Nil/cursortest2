package yads;

import android.app.Activity;
import com.yandex.mobile.ads.R$layout;

/* loaded from: classes13.dex */
public final class bg2 implements tx0 {
    public final kw a;
    public final mt1 b;

    public bg2(kw kwVar, mt1 mt1Var) {
        this.a = kwVar;
        this.b = mt1Var;
    }

    @Override // yads.tx0
    public final md1 a(Activity activity, t8 t8Var, m12 m12Var, d2 d2Var, x00 x00Var) {
        return new md1(R$layout.monetization_ads_internal_native_interstitial_portrait, new dy(kx.a(m12Var, d2Var, x00Var, this.a, this.b), new xl1(m12Var.getAdAssets()), new gn3(), new ws(m12Var), new vs(activity)), new ib2(1));
    }
}
