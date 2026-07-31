package com.my.target;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.my.target.common.models.ImageData;
import com.my.target.da;
import com.my.target.ff;
import com.my.target.g;
import com.my.target.ja;
import com.my.target.mf;
import com.my.target.wh;
import com.my.target.xa;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class fa implements z9, mf.a, da.a, ff.a, ja.a {
    private final d9 a;
    private final e2 b;
    private final xa.a c;
    private final mf d;
    private final Runnable e;
    private final hf f;
    private final d0 g;
    private final Handler h;
    private boolean i;
    private t9 k;
    private f l;
    private long n;
    private long o;
    private boolean p;
    private boolean q;
    private a m = a.DISABLED;
    private boolean r = false;
    private final Runnable j = new Runnable() { // from class: com.my.target.fa$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            fa.this.p();
        }
    };

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private enum a {
        DISABLED,
        RULED_BY_POST,
        RULED_BY_VIDEO
    }

    private fa(df dfVar, d9 d9Var, xa.a aVar, d0 d0Var, wh.c cVar) {
        this.a = d9Var;
        e2 i = d9Var.i();
        this.b = i;
        this.c = aVar;
        this.g = d0Var;
        this.h = dfVar.d();
        hf e = dfVar.e();
        this.f = e;
        e.setColor(d9Var.h0().h());
        ff a2 = dfVar.a(this);
        a2.setBanner(d9Var);
        eb j0 = d9Var.j0();
        List g0 = d9Var.g0();
        if (!g0.isEmpty()) {
            com.my.target.core.ui.views.promo.style2.cards.b c = dfVar.c();
            dfVar.a(c, g0, this);
            this.d = dfVar.a(d9Var, a2.a(), e.a(), c, this);
        } else if (j0 != null) {
            this.i = i.n;
            e0 b = dfVar.b();
            mf a3 = dfVar.a(d9Var, a2.a(), e.a(), b, this);
            this.d = a3;
            b.a(j0.R(), j0.v());
            this.k = dfVar.a(j0, b, this, d0Var, cVar);
            e.setMaxTime(j0.t());
            ImageData i0 = j0.i0();
            a3.setBackgroundImage(i0 == null ? d9Var.y() : i0);
        } else {
            mf a4 = dfVar.a(d9Var, a2.a(), e.a(), (View) null, this);
            this.d = a4;
            a4.d();
            a4.setBackgroundImage(d9Var.y());
        }
        this.d.setBanner(d9Var);
        this.e = new Runnable() { // from class: com.my.target.fa$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                fa.this.q();
            }
        };
        a(d9Var);
        aVar.a(d9Var, this.d.a());
        a(d9Var.a());
    }

    public static fa a(df dfVar, d9 d9Var, xa.a aVar, d0 d0Var, wh.c cVar) {
        return new fa(dfVar, d9Var, aVar, d0Var, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (this.p) {
            t();
            this.d.b(false);
            this.d.d();
            this.p = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        if (o()) {
            n();
        } else {
            s();
        }
    }

    private void t() {
        this.p = false;
        this.h.removeCallbacks(this.j);
    }

    @Override // com.my.target.ja.a
    public void b(b bVar) {
        String e = qi.e(this.d.a().getContext());
        if (e != null) {
            wh.a(bVar.H(), e, 1);
        }
        wh.b(bVar.H(), "show", 1);
    }

    @Override // com.my.target.da.a
    public void c() {
        eb j0 = this.a.j0();
        if (j0 != null) {
            if (j0.q0()) {
                this.d.a(2, !TextUtils.isEmpty(j0.k0()) ? j0.k0() : null);
                this.d.b(true);
            } else {
                this.q = true;
            }
        }
        this.d.a(true);
        this.d.c(false);
        this.f.setVisible(false);
        this.f.setTimeChanged(0.0f);
        this.g.c();
        n();
        this.r = true;
    }

    @Override // com.my.target.mf.a
    public void d() {
        t();
        String e0 = this.a.e0();
        if (e0 == null) {
            return;
        }
        a7.a(e0, this.d.a().getContext());
    }

    @Override // com.my.target.z9
    public void destroy() {
        t9 t9Var = this.k;
        if (t9Var != null) {
            t9Var.destroy();
        }
        t();
    }

    @Override // com.my.target.mf.a
    public void e() {
        t9 t9Var = this.k;
        if (t9Var != null) {
            t9Var.a();
        }
    }

    @Override // com.my.target.da.a
    public void f() {
        this.d.b(true);
        this.d.a(0, (String) null);
        this.d.c(false);
    }

    @Override // com.my.target.da.a
    public void g() {
        this.d.b(true);
        this.d.d();
        this.d.a(false);
        this.d.c(true);
        this.f.setVisible(true);
    }

    @Override // com.my.target.z9
    public View getCloseButton() {
        return this.d.getCloseButton();
    }

    @Override // com.my.target.da.a
    public void h() {
        this.d.b(false);
        this.d.a(false);
        this.d.d();
        this.d.c(false);
    }

    @Override // com.my.target.z9
    public View i() {
        return this.d.a();
    }

    @Override // com.my.target.da.a
    public void j() {
        this.d.b(false);
        this.d.a(false);
        this.d.d();
        this.d.c(false);
        this.f.setVisible(true);
    }

    @Override // com.my.target.mf.a
    public void k() {
        t9 t9Var = this.k;
        if (t9Var != null) {
            t9Var.i();
        }
        t();
        this.c.a(this.a);
    }

    @Override // com.my.target.da.a
    public void l() {
        this.d.b(true);
        this.d.a(0, (String) null);
        this.d.c(false);
        this.f.setVisible(false);
    }

    void m() {
        t9 t9Var = this.k;
        if (t9Var != null) {
            t9Var.destroy();
        }
        t();
        this.c.b(this.a);
    }

    void n() {
        this.d.b();
        this.c.a(0.0d);
        this.h.removeCallbacks(this.e);
        this.m = a.DISABLED;
        this.c.e();
        this.c.a(true);
    }

    boolean o() {
        a aVar = this.m;
        if (aVar == a.DISABLED) {
            return true;
        }
        if (aVar == a.RULED_BY_POST) {
            this.n -= 200;
        }
        return this.n <= 0;
    }

    @Override // com.my.target.da.a
    public void onVolumeChanged(float f) {
        this.d.setSoundState(f != 0.0f);
    }

    @Override // com.my.target.z9
    public void pause() {
        t9 t9Var = this.k;
        if (t9Var != null) {
            t9Var.b();
        }
        this.h.removeCallbacks(this.e);
        t();
    }

    public void r() {
        t9 t9Var = this.k;
        if (t9Var != null) {
            t9Var.e();
        }
    }

    @Override // com.my.target.z9
    public void resume() {
        if (this.m != a.DISABLED && this.n > 0) {
            s();
        }
        t();
        eb j0 = this.a.j0();
        if (this.k == null || j0 == null || !j0.v0() || this.r) {
            return;
        }
        this.k.resume();
    }

    void s() {
        this.h.removeCallbacks(this.e);
        this.h.postDelayed(this.e, 200L);
        this.c.a(this.n / 1000.0d);
        float f = this.o;
        long j = this.n;
        this.d.a((int) ((j / 1000) + 1), (f - j) / f);
    }

    @Override // com.my.target.z9
    public void stop() {
        t9 t9Var = this.k;
        if (t9Var != null) {
            t9Var.b();
        }
        t();
    }

    @Override // com.my.target.ja.a
    public void a(b bVar) {
        wh.b(bVar.H(), "render", 1);
    }

    @Override // com.my.target.mf.a, com.my.target.ff.a, com.my.target.ja.a
    public void a(b bVar, int i, n2 n2Var) {
        if (bVar != null) {
            this.c.a(bVar, null, i, s2.a(n2Var), i().getContext());
        } else {
            this.c.a(this.a, null, i, s2.a(n2Var), i().getContext());
        }
    }

    @Override // com.my.target.mf.a
    public void b(int i) {
        t9 t9Var = this.k;
        if (t9Var != null) {
            t9Var.d();
        }
        t();
    }

    @Override // com.my.target.mf.a
    public void b(h2 h2Var) {
        n2 a2;
        if (this.i) {
            if (this.a.f().b()) {
                a2 = t2.a(8192, h2Var);
            } else {
                a2 = q2.a();
            }
            a(this.a, 1, a2);
            return;
        }
        if (this.p) {
            p();
        }
    }

    @Override // com.my.target.mf.a
    public void a(boolean z) {
        lf h0 = this.a.h0();
        int b = h0.b();
        int argb = Color.argb((int) (h0.c() * 255.0f), Color.red(b), Color.green(b), Color.blue(b));
        mf mfVar = this.d;
        if (z) {
            b = argb;
        }
        mfVar.setPanelColor(b);
    }

    @Override // com.my.target.da.a
    public void b() {
        this.d.b(false);
        this.d.a(true);
        this.d.d();
        this.d.c(false);
        this.d.e();
        this.f.setVisible(false);
        n();
    }

    @Override // com.my.target.mf.a
    public void a() {
        e a2 = this.a.a();
        if (a2 == null) {
            return;
        }
        t();
        f fVar = this.l;
        if (fVar == null || !fVar.b()) {
            Context context = this.d.a().getContext();
            f fVar2 = this.l;
            if (fVar2 == null) {
                a7.a(a2.c(), context);
            } else {
                fVar2.a(context);
            }
        }
    }

    @Override // com.my.target.mf.a
    public void a(h2 h2Var) {
        n2 a2;
        n2 a3;
        if (this.i) {
            if (this.a.f().b()) {
                a3 = t2.a(8192, h2Var);
            } else {
                a3 = q2.a();
            }
            a(this.a, 1, a3);
            return;
        }
        if (this.q) {
            if (this.b.d) {
                if (this.a.f().b()) {
                    a2 = t2.a(8, h2Var);
                } else {
                    a2 = q2.a();
                }
                a(null, 1, a2);
                return;
            }
            return;
        }
        this.d.b(true);
        this.d.a(1, (String) null);
        this.d.c(false);
        t();
        this.h.postDelayed(this.j, 4000L);
        this.p = true;
    }

    @Override // com.my.target.da.a
    public void a(float f, float f2) {
        if (this.m == a.RULED_BY_VIDEO) {
            this.n = (long) (this.o - (1000.0f * f));
        }
        this.f.setTimeChanged(f);
    }

    private void a(e eVar) {
        if (eVar == null || eVar.b() == null) {
            return;
        }
        f a2 = f.a(eVar, new r3());
        this.l = a2;
        a2.a(new g.a() { // from class: com.my.target.fa$$ExternalSyntheticLambda2
            @Override // com.my.target.g.a
            public final void b() {
                fa.this.m();
            }
        });
    }

    private void a(d9 d9Var) {
        eb j0 = d9Var.j0();
        boolean z = false;
        if (j0 != null && j0.v0()) {
            if (j0.o0()) {
                long Y = (long) (j0.Y() * 1000.0f);
                this.o = Y;
                this.n = Y;
                if (Y > 0) {
                    this.m = a.RULED_BY_VIDEO;
                    s();
                } else {
                    n();
                    z = true;
                }
            } else {
                this.d.c();
            }
        } else if (d9Var.b0()) {
            long X = (long) (d9Var.X() * 1000.0f);
            this.o = X;
            this.n = X;
            if (X > 0) {
                mi.a("InterstitialPromoPresenterS2: Banner will be allowed to close in " + this.n + " millis");
                this.m = a.RULED_BY_POST;
                s();
            } else {
                mi.a("InterstitialPromoPresenterS2: Banner is allowed to close");
                n();
                z = true;
            }
        } else {
            this.m = a.DISABLED;
            this.d.c();
        }
        this.c.a(z);
    }
}
