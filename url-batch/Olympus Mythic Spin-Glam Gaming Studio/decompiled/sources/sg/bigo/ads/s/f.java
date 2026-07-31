package sg.bigo.ads.s;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.ad.interstitial.z;
import sg.bigo.ads.an.i;
import sg.bigo.ads.common.utils.o;
import sg.bigo.ads.common.utils.s;

/* loaded from: classes13.dex */
public final class f extends z implements b {
    private final a K;
    private o L;
    private sg.bigo.ads.f.b M;

    protected f(@NonNull Activity activity, a aVar) {
        super(activity);
        this.K = aVar;
    }

    static /* synthetic */ boolean e(f fVar) {
        fVar.f = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final boolean G() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
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
        sg.bigo.ads.f.b bVar = this.M;
        if (bVar != null) {
            bVar.b();
            this.M = null;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a
    public final void N() {
        x xVar;
        int i;
        sg.bigo.ads.cp.a f = ((t) this.A).f();
        if (!this.q.get()) {
            int i2 = this.i.l;
            if (i2 >= 0) {
                a(f, false, i2);
                return;
            }
            return;
        }
        if (f.bq() != null || (xVar = this.i) == null || (i = xVar.o) < 0) {
            return;
        }
        a(f, true, i);
    }

    @Override // sg.bigo.ads.s.b
    public final void a(int i) {
        a aVar = this.K;
        if (aVar != null) {
            aVar.a(i, i == 11 ? 2 : 1);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final void a(sg.bigo.ads.cp.a aVar, boolean z, int i) {
        long j;
        if (z) {
            j = i == 0 ? 800L : s.a.a(i);
        } else {
            j = i * 1000;
            if (j == 0) {
                j = 500;
            }
        }
        o oVar = new o(j) { // from class: sg.bigo.ads.s.f.1
            @Override // sg.bigo.ads.common.utils.o
            public final void a() {
                int d = f.this.d();
                if (((z) f.this).J || f.this.f || f.this.K == null || f.this.K.e_() || d != 0) {
                    return;
                }
                f.e(f.this);
                f.this.K.d_();
                ((t) f.this.A).K().a((i) null, f.this.az(), 22);
            }

            @Override // sg.bigo.ads.common.utils.o
            public final void a(long j2) {
            }
        };
        this.y = oVar;
        oVar.c();
    }

    @Override // sg.bigo.ads.s.b
    public final boolean a() {
        return f(true);
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final boolean aB() {
        return this.i.l == -2;
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final boolean aF() {
        sg.bigo.ads.ai.o oVar = ((sg.bigo.ads.ad.interstitial.a) this).c;
        return oVar != null && 1 == oVar.a("endpage.companion_first", 0);
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final void aK() {
        if (this.A == 0 || Q()) {
            return;
        }
        ((t) this.A).c(this.E);
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.i
    public final int ac() {
        int o = o();
        return (o == 1 || o == 2 || o == 3) ? R.layout.bigo_ad_activity_sub_interstitial_rich_video_1_3 : super.ac();
    }

    @Override // sg.bigo.ads.ad.interstitial.r
    public final ValueCallback<Double> ar() {
        return this.K.a();
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final sg.bigo.ads.f.a ax() {
        Pair<sg.bigo.ads.f.c, sg.bigo.ads.f.a> b;
        T t = this.A;
        if (t == 0 || (b = ((t) t).b(this.E)) == null) {
            return null;
        }
        return (sg.bigo.ads.f.a) b.second;
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final sg.bigo.ads.f.c ay() {
        Pair<sg.bigo.ads.f.c, sg.bigo.ads.f.a> b;
        T t = this.A;
        if (t == 0 || (b = ((t) t).b(this.E)) == null) {
            return null;
        }
        return (sg.bigo.ads.f.c) b.first;
    }

    @Override // sg.bigo.ads.s.b
    public final View b() {
        Pair<sg.bigo.ads.f.c, sg.bigo.ads.f.a> b;
        FrameLayout frameLayout;
        T t = this.A;
        if (t != 0 && (b = ((t) t).b(this.E)) != null) {
            sg.bigo.ads.f.c cVar = (sg.bigo.ads.f.c) b.first;
            if (cVar.a && cVar.b() && !cVar.b) {
                cVar.a(1);
                return cVar.o.k;
            }
            if (cVar.a && !cVar.b && cVar.h()) {
                Activity activity = this.N;
                if (activity == null) {
                    frameLayout = null;
                } else {
                    sg.bigo.ads.f.b bVar = this.M;
                    if (bVar != null) {
                        bVar.b();
                    }
                    frameLayout = new FrameLayout(activity);
                    frameLayout.setTag(19);
                    sg.bigo.ads.f.b bVar2 = new sg.bigo.ads.f.b(cVar);
                    this.M = bVar2;
                    bVar2.a(frameLayout, activity);
                }
                if (frameLayout != null) {
                    return frameLayout;
                }
            } else if (!cVar.b()) {
                cVar.o.f();
            }
            sg.bigo.ads.f.a aVar = (sg.bigo.ads.f.a) b.second;
            if (aVar.a && aVar.b()) {
                aVar.a(1);
                return aVar.a();
            }
            if (!aVar.b()) {
                aVar.f();
            }
        }
        return null;
    }

    @Override // sg.bigo.ads.s.b
    public final void b(int i) {
        a aVar = this.K;
        if (aVar != null) {
            aVar.a(i);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
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
            o oVar = new o(r6.c * 1000) { // from class: sg.bigo.ads.s.f.2
                @Override // sg.bigo.ads.common.utils.o
                public final void a() {
                    if (f.this.K == null || f.this.d() != 0 || sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) f.this.E)) {
                        return;
                    }
                    f.this.K.a(0, 2);
                }

                @Override // sg.bigo.ads.common.utils.o
                public final void a(long j) {
                }
            };
            this.L = oVar;
            oVar.c();
        }
        b(0);
        aw();
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void j() {
        super.j();
        o oVar = this.L;
        if (oVar == null || oVar.e()) {
            return;
        }
        this.L.d();
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final void m(int i) {
        if (Q()) {
            return;
        }
        super.m(i);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void n() {
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void p() {
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final int v() {
        int i;
        x xVar = this.i;
        if (xVar == null || (i = xVar.p) <= 0) {
            return 5;
        }
        return i;
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a
    public final boolean z() {
        return false;
    }
}
