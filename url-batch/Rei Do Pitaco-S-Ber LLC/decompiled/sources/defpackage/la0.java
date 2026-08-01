package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class la0 extends ra0 {
    public final WindowInsets.Builder e;

    public la0(db0 db0Var) {
        super(db0Var);
        WindowInsets f = db0Var.f();
        this.e = f != null ? n60.h(f) : n60.g();
    }

    @Override // defpackage.ra0
    public db0 b() {
        WindowInsets build;
        a();
        build = this.e.build();
        db0 g = db0.g(null, build);
        io[] ioVarArr = this.b;
        ab0 ab0Var = g.a;
        ab0Var.u(ioVarArr);
        ab0Var.t(null);
        ab0Var.y(this.c);
        ab0Var.z(this.d);
        return g;
    }

    @Override // defpackage.ra0
    public void e(io ioVar) {
        this.e.setMandatorySystemGestureInsets(ioVar.e());
    }

    @Override // defpackage.ra0
    public void f(io ioVar) {
        this.e.setStableInsets(ioVar.e());
    }

    @Override // defpackage.ra0
    public void g(io ioVar) {
        this.e.setSystemGestureInsets(ioVar.e());
    }

    @Override // defpackage.ra0
    public void h(io ioVar) {
        this.e.setSystemWindowInsets(ioVar.e());
    }

    @Override // defpackage.ra0
    public void i(io ioVar) {
        this.e.setTappableElementInsets(ioVar.e());
    }

    public la0() {
        this.e = n60.g();
    }
}
