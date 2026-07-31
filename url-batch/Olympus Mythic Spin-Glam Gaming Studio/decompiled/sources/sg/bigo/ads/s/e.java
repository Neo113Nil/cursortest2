package sg.bigo.ads.s;

import android.app.Activity;
import android.view.View;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.ad.interstitial.y;
import sg.bigo.ads.an.i;
import sg.bigo.ads.common.utils.o;

/* loaded from: classes8.dex */
public final class e extends y implements b {
    private final a K;
    private o L;

    protected e(@NonNull Activity activity, a aVar) {
        super(activity);
        this.K = aVar;
    }

    static /* synthetic */ boolean d(e eVar) {
        eVar.f = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final boolean G() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void J() {
        super.J();
        o oVar = this.L;
        if (oVar != null) {
            oVar.b();
            this.L = null;
        }
        o oVar2 = this.y;
        if (oVar2 != null) {
            oVar2.b();
            this.y = null;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    public final void N() {
        long j = this.i.l * 1000;
        if (j >= 0) {
            if (j == 0) {
                j = 500;
            }
            o oVar = new o(j) { // from class: sg.bigo.ads.s.e.1
                @Override // sg.bigo.ads.common.utils.o
                public final void a() {
                    if (((y) e.this).J || e.this.f || e.this.K == null || e.this.K.e_()) {
                        return;
                    }
                    e.d(e.this);
                    e.this.K.d_();
                    ((t) e.this.A).K().a((i) null, 8, 22);
                }

                @Override // sg.bigo.ads.common.utils.o
                public final void a(long j2) {
                }
            };
            this.y = oVar;
            oVar.c();
        }
    }

    @Override // sg.bigo.ads.s.b
    public final void a(int i) {
        a aVar = this.K;
        if (aVar != null) {
            aVar.a(i, 2);
        }
    }

    @Override // sg.bigo.ads.s.b
    public final boolean a() {
        return f(true);
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.i
    public final int ac() {
        int o = o();
        return (o == 1 || o == 2 || o == 3) ? R.layout.bigo_ad_activity_sub_interstitial_rich_video_1_3 : super.ac();
    }

    @Override // sg.bigo.ads.ad.interstitial.r
    public final ValueCallback<Double> ar() {
        return this.K.a();
    }

    @Override // sg.bigo.ads.ad.interstitial.y
    public final boolean au() {
        return this.i.l == -2;
    }

    @Override // sg.bigo.ads.s.b
    public final View b() {
        return null;
    }

    @Override // sg.bigo.ads.s.b
    public final void b(int i) {
        a aVar = this.K;
        if (aVar != null) {
            aVar.a(i);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void h() {
        super.h();
        o oVar = this.L;
        if (oVar == null || !oVar.e()) {
            return;
        }
        this.L.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.i
    public final void h(int i) {
        super.h(i);
        if (this.i != null && this.F != null) {
            o oVar = new o(r6.c * 1000) { // from class: sg.bigo.ads.s.e.2
                @Override // sg.bigo.ads.common.utils.o
                public final void a() {
                    if (sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) e.this.E) || e.this.d() != 0) {
                        return;
                    }
                    e.this.a(0);
                    e.this.at();
                }

                @Override // sg.bigo.ads.common.utils.o
                public final void a(long j) {
                }
            };
            this.L = oVar;
            oVar.c();
        }
        b(0);
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void j() {
        super.j();
        o oVar = this.L;
        if (oVar == null || oVar.e()) {
            return;
        }
        this.L.d();
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void n() {
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void p() {
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final boolean z() {
        return false;
    }
}
