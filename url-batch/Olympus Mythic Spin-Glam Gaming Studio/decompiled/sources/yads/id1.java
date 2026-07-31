package yads;

import android.app.Activity;
import com.yandex.mobile.ads.R$dimen;
import com.yandex.mobile.ads.R$layout;
import kotlin.math.MathKt;

/* loaded from: classes13.dex */
public final class id1 implements tx0 {
    public final kw a;
    public final mt1 b;

    public id1(kw kwVar, mt1 mt1Var) {
        this.a = kwVar;
        this.b = mt1Var;
    }

    @Override // yads.tx0
    public final md1 a(Activity activity, t8 t8Var, m12 m12Var, d2 d2Var, x00 x00Var) {
        w00 adAssets = m12Var.getAdAssets();
        return new md1(R$layout.monetization_ads_internal_native_interstitial_landscape_horizontal_media, new dy(new fy(adAssets, MathKt.roundToInt(activity.getResources().getDimension(R$dimen.monetization_ads_internal_landscape_horizontal_icon_size))), kx.a(m12Var, d2Var, x00Var, this.a, this.b), new jj1(adAssets), new rd2(adAssets), new gn3(), new ws(m12Var)), new ib2(2));
    }
}
