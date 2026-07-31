package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.yandex.mobile.ads.banner.BannerAdView;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class fl extends l01 implements il3 {
    public final sa A;
    public boolean B;
    public final tm2 C;
    public final BannerAdView D;
    public final el E;
    public final vh3 F;
    public final hl G;
    public final gl H;
    public final x12 I;
    public final dj0 J;
    public final ik3 K;
    public ml L;
    public ml M;
    public final BannerAdView y;
    public final Handler z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(Context context, v3 v3Var, BannerAdView bannerAdView, el elVar, i5 i5Var) {
        super(context, bannerAdView.getAdConfiguration$mobileads_externalRelease(), i5Var, bannerAdView.getSdkEnvironmentModule$mobileads_externalRelease());
        vh3 vh3Var = new vh3();
        hl hlVar = new hl();
        gl glVar = new gl(bannerAdView.getSdkEnvironmentModule$mobileads_externalRelease());
        x12 x12Var = new x12(v3Var);
        dj0 dj0Var = new dj0();
        ik3 ik3Var = new ik3();
        Handler handler = new Handler(Looper.getMainLooper());
        sa saVar = new sa(bannerAdView);
        this.y = bannerAdView;
        this.z = handler;
        this.A = saVar;
        this.B = true;
        this.C = new tm2(this);
        bannerAdView.addVisibilityChangeListener(this);
        this.D = bannerAdView;
        this.E = elVar;
        this.F = vh3Var;
        this.G = hlVar;
        this.H = glVar;
        this.I = x12Var;
        this.J = dj0Var;
        this.K = ik3Var;
        bannerAdView.setHorizontalScrollBarEnabled(false);
        bannerAdView.setVerticalScrollBarEnabled(false);
        bannerAdView.setVisibility(8);
        bannerAdView.setBackgroundColor(0);
        elVar.b.f = x12Var;
    }

    @Override // yads.wp2
    public final void a(Object obj) {
        t8 t8Var = (t8) obj;
        synchronized (this) {
            this.b.a(h5.t);
            this.w = t8Var;
        }
        this.I.d = t8Var;
        gl glVar = this.H;
        glVar.getClass();
        vq1 vq1Var = t8Var.q;
        ml a = (vq1Var != null ? new vo1(t8Var, vq1Var) : new iw2(glVar.a)).a(this.a, this, this.x);
        this.M = a;
        a.a(this.a, t8Var);
    }

    @Override // yads.wm
    public final void b() {
        super.b();
        this.y.removeVisibilityChangeListener(this);
        boolean z = ob1.a;
        this.B = false;
        this.z.removeCallbacks(this.C);
        el elVar = this.E;
        elVar.c = null;
        elVar.b.a(null);
        this.K.a(this.D, true);
        this.D.setVisibility(8);
        hl3.a((ViewGroup) this.D);
    }

    @Override // yads.wm
    public final void c() {
        ml[] mlVarArr = {this.L, this.M};
        for (int i = 0; i < 2; i++) {
            ml mlVar = mlVarArr[i];
            if (mlVar != null) {
                mlVar.a(this.a);
            }
        }
        super.c();
    }

    @Override // yads.wm
    public final void e() {
        super.e();
        l();
    }

    @Override // yads.wm
    public final void g() {
        super.g();
        ml mlVar = this.L;
        if (mlVar != this.M) {
            ml mlVar2 = new ml[]{mlVar}[0];
            if (mlVar2 != null) {
                mlVar2.a(this.a);
            }
            this.L = this.M;
        }
        l03 l03Var = this.c.d.a;
        if (k03.d != (l03Var != null ? l03Var.b() : null) || this.D.getLayoutParams() == null) {
            return;
        }
        this.D.getLayoutParams().height = -2;
    }

    public final void k() {
        l();
    }

    public final void l() {
        boolean z = ob1.a;
        this.z.removeCallbacks(this.C);
        t8 t8Var = this.w;
        if (t8Var != null && t8Var.K && this.B && this.o.a()) {
            qm2 qm2Var = this.A.a;
            KProperty kProperty = sa.b[0];
            hb1 hb1Var = (hb1) qm2Var.a.get();
            if (hb1Var == null || hl3.b(hb1Var)) {
                return;
            }
            this.z.postDelayed(this.C, t8Var.I);
        }
    }

    @Override // yads.wm
    public final void b(d4 d4Var) {
        super.b(d4Var);
        int i = d4Var.a;
        if (5 == i || 2 == i) {
            return;
        }
        l();
    }

    @Override // yads.wm, yads.hd2
    public final void a(dd2 dd2Var) {
        super.a(dd2Var);
        l();
    }
}
