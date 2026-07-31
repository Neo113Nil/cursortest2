package yads;

/* loaded from: classes11.dex */
public final class nf3 implements xf3 {
    public final we3 a;
    public final uf3 b;
    public final gg3 c;
    public final jg3 d;
    public final tg3 e;
    public final i5 f;
    public final wj3 g;
    public final of3 h;
    public final boolean i;
    public tf3 j;
    public boolean k;

    public nf3(we3 we3Var, uf3 uf3Var, gg3 gg3Var, jg3 jg3Var, tg3 tg3Var, i5 i5Var, wj3 wj3Var, of3 of3Var, boolean z) {
        this.a = we3Var;
        this.b = uf3Var;
        this.c = gg3Var;
        this.d = jg3Var;
        this.e = tg3Var;
        this.f = i5Var;
        this.g = wj3Var;
        this.h = of3Var;
        this.i = z;
    }

    @Override // yads.xf3
    public final void a() {
        if (this.k) {
            this.e.a(rg3.e);
            this.g.a.j();
        }
    }

    @Override // yads.xf3
    public final void b() {
        if (this.k) {
            this.e.a(rg3.i);
            this.g.a.f();
        }
    }

    @Override // yads.xf3
    public final void c() {
        this.k = true;
        this.e.a(rg3.e);
        gg3 gg3Var = this.c;
        if (!gg3Var.d) {
            gg3Var.d = true;
            gg3Var.b.a();
            gg3Var.c.post(new fg3(gg3Var));
        }
        this.j = new tf3(this.b, this.g);
        this.h.b(this.a);
    }

    @Override // yads.xf3
    public final void d() {
        this.k = false;
        this.e.a(rg3.g);
        if (this.i) {
            wj3 wj3Var = this.g;
            wj3Var.a.b();
            wj3Var.k();
        }
        this.c.a();
        this.d.b();
        this.h.c(this.a);
        this.b.a((xf3) null);
        this.h.g(this.a);
    }

    @Override // yads.xf3
    public final void e() {
        wj3 wj3Var = this.g;
        wj3Var.a.g();
        wj3Var.k();
        this.k = false;
        this.e.a(rg3.f);
        this.c.a();
        this.d.b();
        this.h.h(this.a);
        this.b.a((xf3) null);
        this.h.g(this.a);
    }

    @Override // yads.xf3
    public final void f() {
        this.e.a(rg3.e);
        if (this.k) {
            this.g.a.c();
        }
        gg3 gg3Var = this.c;
        if (!gg3Var.d) {
            gg3Var.d = true;
            gg3Var.b.a();
            gg3Var.c.post(new fg3(gg3Var));
        }
        this.h.d(this.a);
    }

    @Override // yads.xf3
    public final void h() {
        this.e.a(rg3.d);
        this.f.a(h5.z);
        this.h.j(this.a);
    }

    @Override // yads.xf3
    public final void i() {
        this.e.a(rg3.h);
        if (this.k) {
            this.g.a.d();
        }
        this.h.k(this.a);
    }

    @Override // yads.xf3
    public final void onVolumeChanged(float f) {
        this.g.a.a(f);
        tf3 tf3Var = this.j;
        if (tf3Var != null) {
            if (f == 0.0f) {
                if (!tf3Var.b) {
                    tf3Var.b = true;
                    tf3Var.a.a.l();
                }
            } else if (tf3Var.b) {
                tf3Var.b = false;
                tf3Var.a.a.a();
            }
        }
        this.h.a(this.a, f);
    }

    @Override // yads.xf3
    public final void a(wf3 wf3Var) {
        rg3 rg3Var;
        this.k = false;
        tg3 tg3Var = this.e;
        if (tg3Var.a.contains(rg3.d)) {
            rg3Var = rg3.j;
        } else {
            rg3Var = rg3.k;
        }
        this.e.a(rg3Var);
        this.c.a();
        this.d.a(wf3Var);
        wj3 wj3Var = this.g;
        wj3Var.a.a(wf3Var);
        wj3Var.k();
        this.h.a(this.a, wf3Var);
        this.b.a((xf3) null);
        this.h.g(this.a);
    }
}
