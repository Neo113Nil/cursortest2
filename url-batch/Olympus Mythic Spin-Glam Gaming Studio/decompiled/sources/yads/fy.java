package yads;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes5.dex */
public final class fy implements hg0 {
    public final w00 a;
    public final int b;

    public fy(w00 w00Var, int i) {
        this.a = w00Var;
        this.b = i;
    }

    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView extendedNativeAdView = (ExtendedNativeAdView) viewGroup;
        w00 w00Var = this.a;
        hy hyVar = new hy(w00Var, this.b);
        ImageView a = hyVar.a(extendedNativeAdView, gy.b, w00Var.b);
        ImageView a2 = hyVar.a(extendedNativeAdView, gy.c, w00Var.c);
        if (a != null) {
            a.setId(R$id.favicon);
        }
        if (a2 != null) {
            a2.setId(R$id.icon);
        }
    }

    @Override // yads.hg0
    public final void c() {
    }
}
