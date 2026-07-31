package sg.bigo.ads.ad;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.f;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.p;
import sg.bigo.ads.ad.interstitial.q;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.ad.interstitial.z;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;
import sg.bigo.ads.k.x;

/* loaded from: classes12.dex */
public class h extends z implements f.a {
    private x K;
    private sg.bigo.ads.j.x L;

    protected h(@NonNull Activity activity) {
        super(activity);
        activity.overridePendingTransition(0, 0);
    }

    private boolean aO() {
        sg.bigo.ads.cp.a f = ((t) this.A).f();
        sg.bigo.ads.f.c cVar = ((t) this.A).D;
        return (f.bq() == null) && (cVar == null || !cVar.b());
    }

    private x aP() {
        if (this.K == null) {
            this.K = sg.bigo.ads.k.a.a(this.E, ((sg.bigo.ads.ad.interstitial.a) this).c, o());
        }
        return this.K;
    }

    private sg.bigo.ads.j.x aQ() {
        if (this.L == null) {
            this.L = sg.bigo.ads.k.a.b(this.E, ((sg.bigo.ads.ad.interstitial.a) this).c, o());
        }
        return this.L;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void A() {
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a
    public final void D() {
        super.D();
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(false);
            this.C.setTakeoverTickEvent(false);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void O() {
        MediaView mediaView;
        ViewGroup viewGroup = this.F;
        if (viewGroup == null || (mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media)) == null) {
            return;
        }
        aP().a((ViewGroup) mediaView);
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean Y() {
        return true;
    }

    @Override // sg.bigo.ads.ad.f.a
    public final void a() {
        e(true);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void a(@NonNull ViewGroup viewGroup) {
        aP().c(viewGroup);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void a(boolean z) {
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.i.a.InterfaceC1899a
    public final void a(boolean z, boolean z2) {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null) {
            adCountDownButton.e();
        }
        if (z2 && d() == 0) {
            a(((z) this).I, new Runnable() { // from class: sg.bigo.ads.ad.h.1
                @Override // java.lang.Runnable
                public final void run() {
                    h.this.aA();
                    if (h.this.P()) {
                        h.this.m(1);
                        return;
                    }
                    VideoController ao = h.this.ao();
                    if (ao != null) {
                        ao.play();
                    }
                }
            });
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final boolean aF() {
        return !this.q.get();
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final LandingPageStyleConfig aJ() {
        int n = aQ().n();
        int o = aQ().o();
        ViewGroup viewGroup = this.F;
        return new LandingPageStyleConfig(sg.bigo.ads.q.f.class, 1, n, o, viewGroup != null ? viewGroup.getMeasuredHeight() : 0, s.a(this.E, 0), 0.8f);
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.i
    public final int ac() {
        int o = o();
        return o != 2 ? o != 3 ? o != 4 ? o != 5 ? o != 6 ? R.layout.bigo_ad_activity_pop_up_style_1 : R.layout.bigo_ad_activity_pop_up_style_6 : R.layout.bigo_ad_activity_pop_up_style_5 : R.layout.bigo_ad_activity_pop_up_style_4 : R.layout.bigo_ad_activity_pop_up_style_3 : R.layout.bigo_ad_activity_pop_up_style_2;
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.cl.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    @CallSuper
    public final void al() {
        super.al();
        this.N.overridePendingTransition(0, 0);
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final boolean as() {
        aQ().i();
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a
    @NonNull
    public final sg.bigo.ads.ad.interstitial.x c() {
        sg.bigo.ads.ad.interstitial.x xVar = new sg.bigo.ads.ad.interstitial.x();
        o oVar = ((sg.bigo.ads.ad.interstitial.a) this).c;
        if (oVar != null) {
            xVar.f = oVar.c("video_play_page.media_view_clickable_switch");
            xVar.h = ((sg.bigo.ads.ad.interstitial.a) this).c.c("video_play_page.ad_component_clickable_switch");
            xVar.g = ((sg.bigo.ads.ad.interstitial.a) this).c.c("video_play_page.other_space_clickable_switch");
            xVar.i = ((sg.bigo.ads.ad.interstitial.a) this).c.a("video_play_page.click_type");
            xVar.m = ((sg.bigo.ads.ad.interstitial.a) this).c.c("layer.other_space_clickable_switch");
            xVar.n = ((sg.bigo.ads.ad.interstitial.a) this).c.a("layer.click_type");
            xVar.c = ((sg.bigo.ads.ad.interstitial.a) this).c.a("video_play_page.force_staying_time");
            xVar.e = ((sg.bigo.ads.ad.interstitial.a) this).c.a("layer.force_staying_time");
            xVar.k = ((sg.bigo.ads.ad.interstitial.a) this).c.a("video_play_page.auto_click");
            xVar.o = ((sg.bigo.ads.ad.interstitial.a) this).c.a("video_play_page.time_for_auto_click", -1);
            xVar.p = ((sg.bigo.ads.ad.interstitial.a) this).c.a("video_play_page.time_for_show_backup", -1);
            this.e = true;
            xVar.a = false;
            xVar.b = 0;
            xVar.d = false;
        }
        return xVar;
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a
    public final boolean f(boolean z) {
        sg.bigo.ads.f.c ay;
        p pVar;
        int d = d();
        if (d == 14 && (pVar = this.t) != null) {
            pVar.a(this.C);
        }
        if (P() && d == 0) {
            b(true);
            m(3);
            return d() == 0;
        }
        if ((d == 5 || d == 14) && (ay = ay()) != null) {
            ay.a(2);
        }
        return z;
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void g(@LayoutRes int i) {
        super.g(i);
        if (this.F == null) {
            return;
        }
        q qVar = this.s;
        if (qVar != null) {
            qVar.i = false;
        }
        aP().g(this.F);
        aP().h(this.F);
        aP().d(this.F);
        aP().a(q(R.id.inter_container), this.F.findViewById(R.id.media_layout));
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void h() {
        super.h();
        if (this.C == null) {
            aP().q();
            aQ().q();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.api.VideoController.a
    public final void i(boolean z) {
        super.i(z);
        au();
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void j() {
        super.j();
        if (this.C == null) {
            aP().p();
            aQ().p();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final void l(int i) {
        aP();
        x.a(this.F, this.m);
        sg.bigo.ads.common.utils.o e = aP().e(this.F);
        this.w = e;
        if (e == null) {
            aP().f(this.F);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final void m(int i) {
        int a;
        if (this.F == null) {
            return;
        }
        if (d() != 0) {
            sg.bigo.ads.bn.a.a(0, "PopupVideoActivityImpl", "end page can be shown but current page is not main");
            return;
        }
        if (this.q.get() && aO()) {
            return;
        }
        View findViewById = this.F.findViewById(R.id.inter_btn_cta);
        if (findViewById != null) {
            findViewById.setBackgroundColor(this.o);
        }
        View findViewById2 = this.F.findViewById(R.id.inter_btn_mute);
        if (findViewById2 != null) {
            findViewById2.setVisibility(4);
        }
        MediaView mediaView = (MediaView) this.F.findViewById(R.id.inter_media);
        if (mediaView == null || (a = aQ().a(mediaView, (t) this.A, this.q.get())) == 0) {
            return;
        }
        aQ().g(this.F);
        aQ().c(this.F);
        aQ().f(this.F);
        aQ().a(this.C, this.F, this);
        aQ().d(this.F);
        f(a);
        sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) ((t) this.A).f(), d(), i);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void u() {
        aP().a(this.C, this.F, this);
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a
    public final void y() {
        e(true);
    }
}
