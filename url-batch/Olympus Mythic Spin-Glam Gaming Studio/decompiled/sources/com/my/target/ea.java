package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.ia;
import com.my.target.wh;
import com.my.target.xa;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class ea implements z9 {
    private final zf a = zf.a(o0.g, 200);
    private final Runnable b = new Runnable() { // from class: com.my.target.ea$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            ea.this.g();
        }
    };
    private final d9 c;
    private final ia d;
    private final xa.a e;
    private final d0 f;
    private f g;
    private ha h;
    private a2 i;
    private k9 j;
    private s9 k;
    private long l;
    private long m;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class a implements View.OnClickListener {
        private final ea a;

        a(ea eaVar) {
            this.a = eaVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s9 d = this.a.d();
            if (d != null) {
                d.e();
            }
            this.a.e().a(this.a.c());
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface b {
        void b();
    }

    private ea(cf cfVar, d9 d9Var, xa.a aVar, d0 d0Var, wh.c cVar, Context context) {
        a2 a2Var;
        this.c = d9Var;
        this.f = d0Var;
        this.e = aVar;
        c cVar2 = new c(this);
        eb j0 = d9Var.j0();
        if (!d9Var.g0().isEmpty()) {
            a2 a2 = cfVar.a();
            this.i = a2;
            this.d = a2;
        } else if (j0 == null || d9Var.i0() != 1) {
            ha b2 = cfVar.b();
            this.h = b2;
            this.d = b2;
        } else {
            ha c2 = cfVar.c();
            this.h = c2;
            this.d = c2;
        }
        this.d.setInterstitialPromoViewListener(cVar2);
        this.d.getCloseButton().setOnClickListener(new a(this));
        ha haVar = this.h;
        if (haVar != null && j0 != null) {
            s9 a3 = s9.a(cfVar, j0, haVar, aVar, d0Var, new b() { // from class: com.my.target.ea$$ExternalSyntheticLambda1
                @Override // com.my.target.ea.b
                public final void b() {
                    ea.this.b();
                }
            }, cVar);
            this.k = a3;
            a3.a(j0, context);
            if (j0.v0()) {
                this.m = 0L;
            }
        }
        this.d.setBanner(d9Var);
        this.d.setClickArea(d9Var.i());
        if (j0 == null || !j0.v0()) {
            long X = (long) (d9Var.X() * 1000.0f);
            this.l = X;
            if (X > 0) {
                mi.a("InterstitialPromoPresenter: Banner will be allowed to close in " + this.l + " millis");
                f();
            } else {
                mi.a("InterstitialPromoPresenter: Banner is allowed to close");
                this.d.c();
            }
        }
        List g0 = d9Var.g0();
        if (!g0.isEmpty() && (a2Var = this.i) != null) {
            this.j = k9.a(g0, a2Var);
        }
        k9 k9Var = this.j;
        if (k9Var != null) {
            k9Var.a(aVar);
        }
        e a4 = d9Var.a();
        if (a4 != null) {
            a(cVar2, a4);
        }
        aVar.a(d9Var, this.d.getView());
        aVar.a(d9Var.X());
    }

    public static ea a(cf cfVar, d9 d9Var, xa.a aVar, d0 d0Var, wh.c cVar, Context context) {
        return new ea(cfVar, d9Var, aVar, d0Var, cVar, context);
    }

    private void f() {
        this.a.a(this.b);
        this.m = System.currentTimeMillis();
        this.e.a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.e.a(this.l / 1000.0d);
        long j = this.l;
        if (j > 0) {
            this.l = j - 200;
        } else {
            a();
        }
    }

    public void b() {
        s9 s9Var = this.k;
        if (s9Var != null) {
            s9Var.a(this.c);
            this.k.b();
            this.k = null;
        }
        this.e.a(true);
    }

    public d9 c() {
        return this.c;
    }

    s9 d() {
        return this.k;
    }

    @Override // com.my.target.z9
    public void destroy() {
        this.a.b(this.b);
        s9 s9Var = this.k;
        if (s9Var != null) {
            s9Var.b();
        }
    }

    public xa.a e() {
        return this.e;
    }

    @Override // com.my.target.z9
    public View getCloseButton() {
        return this.d.getCloseButton();
    }

    @Override // com.my.target.z9
    public View i() {
        return this.d.getView();
    }

    @Override // com.my.target.z9
    public void pause() {
        s9 s9Var = this.k;
        if (s9Var != null) {
            s9Var.f();
        }
        this.a.b(this.b);
        if (this.m > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.m;
            if (currentTimeMillis > 0) {
                long j = this.l;
                if (currentTimeMillis < j) {
                    this.l = j - currentTimeMillis;
                    return;
                }
            }
            this.l = 0L;
        }
    }

    @Override // com.my.target.z9
    public void resume() {
        if (this.k != null || this.l <= 0) {
            return;
        }
        f();
    }

    @Override // com.my.target.z9
    public void stop() {
        s9 s9Var = this.k;
        if (s9Var != null) {
            s9Var.h();
        }
    }

    void a() {
        this.d.c();
        this.a.b(this.b);
        this.e.e();
        this.e.a(true);
    }

    private void a(ia.a aVar, e eVar) {
        if (eVar.b() != null) {
            f a2 = f.a(eVar, new r3());
            this.g = a2;
            a2.a(aVar);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class c implements ia.a {
        private final ea a;

        c(ea eaVar) {
            this.a = eaVar;
        }

        private void c() {
            Context context = this.a.i().getContext();
            e a = this.a.c().a();
            if (a == null) {
                return;
            }
            f fVar = this.a.g;
            if (fVar == null || !fVar.b()) {
                if (fVar == null) {
                    a7.a(a.c(), context);
                } else {
                    fVar.a(context);
                }
            }
        }

        @Override // com.my.target.ia.a
        public void a(int i, n2 n2Var) {
            this.a.e().a(this.a.c(), null, i, s2.a(n2Var), this.a.i().getContext());
        }

        @Override // com.my.target.g.a
        public void b() {
            s9 d = this.a.d();
            if (d != null) {
                d.b();
            }
            this.a.e().b(this.a.c());
        }

        @Override // com.my.target.ia.a
        public void a() {
            c();
        }
    }
}
