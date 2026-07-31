package yads;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.mobile.ads.banner.BannerAdView;

/* loaded from: classes6.dex */
public final class a32 implements x00 {
    public final fl a;

    public a32(fl flVar) {
        this.a = flVar;
    }

    @Override // yads.x00
    public final void a(y4 y4Var) {
        this.a.E.a(y4Var);
    }

    @Override // yads.x00
    public final void onAdClicked() {
    }

    @Override // yads.x00
    public final void onLeftApplication() {
        this.a.E.c();
    }

    @Override // yads.x00
    public final void onReturnedToApplication() {
        this.a.E.d();
    }

    @Override // yads.x00
    public final void a() {
        fl flVar = this.a;
        dj0 dj0Var = flVar.J;
        BannerAdView bannerAdView = flVar.D;
        dj0Var.getClass();
        View findViewWithTag = bannerAdView.findViewWithTag("rootDivkitView");
        Div2View div2View = findViewWithTag instanceof Div2View ? (Div2View) findViewWithTag : null;
        if (div2View != null) {
            div2View.setVariable("is_banner_closed", "closed");
        }
        flVar.E.a();
    }
}
