package yads;

/* loaded from: classes5.dex */
public final class bo2 implements xf3 {
    public final /* synthetic */ co2 a;

    public bo2(co2 co2Var) {
        this.a = co2Var;
    }

    @Override // yads.xf3
    public final void a() {
    }

    @Override // yads.xf3
    public final void b() {
    }

    @Override // yads.xf3
    public final void c() {
        gg3 gg3Var = this.a.c;
        if (!gg3Var.d) {
            gg3Var.d = true;
            gg3Var.b.a();
            gg3Var.c.post(new fg3(gg3Var));
        }
        rf3 rf3Var = this.a.e;
        if (rf3Var != null) {
            rf3Var.c();
        }
    }

    @Override // yads.xf3
    public final void d() {
        this.a.c.a();
        this.a.a.a((xf3) null);
        rf3 rf3Var = this.a.e;
        if (rf3Var != null) {
            rf3Var.b();
        }
    }

    @Override // yads.xf3
    public final void e() {
        this.a.c.a();
        this.a.a.a((xf3) null);
    }

    @Override // yads.xf3
    public final void f() {
    }

    @Override // yads.xf3
    public final void h() {
        this.a.a.d();
    }

    @Override // yads.xf3
    public final void i() {
    }

    @Override // yads.xf3
    public final void onVolumeChanged(float f) {
    }

    @Override // yads.xf3
    public final void a(wf3 wf3Var) {
        this.a.c.a();
        this.a.a.a((xf3) null);
        this.a.a.a(wf3Var);
    }
}
