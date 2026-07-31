package yads;

import android.app.Activity;
import com.yandex.mobile.ads.R$dimen;
import com.yandex.mobile.ads.R$layout;
import kotlin.math.MathKt;

/* loaded from: classes9.dex */
public final class jd1 implements tx0 {
    public final kw a;
    public final mt1 b;

    public jd1(kw kwVar, mt1 mt1Var) {
        this.a = kwVar;
        this.b = mt1Var;
    }

    @Override // yads.tx0
    public final md1 a(Activity activity, t8 t8Var, m12 m12Var, d2 d2Var, x00 x00Var) {
        w00 adAssets = m12Var.getAdAssets();
        return new md1(R$layout.monetization_ads_internal_native_interstitial_landscape_vetrical_media, new dy(new fy(adAssets, MathKt.roundToInt(activity.getResources().getDimension(R$dimen.monetization_ads_internal_landscape_vertical_icon_size))), kx.a(m12Var, d2Var, x00Var, this.a, this.b), new jj1(adAssets), new rd2(adAssets), new gn3(), new ws(m12Var)), new ey(new ib2(2), new qj1(m12Var.getAdAssets(), MathKt.roundToInt(activity.getResources().getDimension(R$dimen.monetization_ads_internal_landscape_vertical_media_content_min_width)))));
    }
}
