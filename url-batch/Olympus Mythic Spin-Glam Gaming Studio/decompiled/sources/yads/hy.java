package yads;

import android.widget.ImageView;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes5.dex */
public final class hy {
    public final w00 a;
    public final int b;

    public hy(w00 w00Var, int i) {
        this.a = w00Var;
        this.b = i;
    }

    public final ImageView a(ExtendedNativeAdView extendedNativeAdView, gy gyVar, y00 y00Var) {
        w00 w00Var = this.a;
        gy gyVar2 = w00Var.c != null ? gy.c : w00Var.b != null ? gy.b : gy.d;
        if (y00Var == null || gyVar2 != gyVar) {
            return null;
        }
        int i = y00Var.c;
        int i2 = y00Var.d;
        int i3 = this.b;
        return (i3 > i || i3 > i2) ? (ImageView) extendedNativeAdView.findViewById(R$id.icon_small) : (ImageView) extendedNativeAdView.findViewById(R$id.icon_large);
    }
}
