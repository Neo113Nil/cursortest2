package K;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class p0 extends r0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f701c;

    public p0() {
        this.f701c = C.b.g();
    }

    @Override // K.r0
    public z0 b() {
        WindowInsets build;
        a();
        build = this.f701c.build();
        z0 g2 = z0.g(null, build);
        g2.f729a.o(this.f705b);
        return g2;
    }

    @Override // K.r0
    public void d(C.d dVar) {
        this.f701c.setMandatorySystemGestureInsets(dVar.d());
    }

    @Override // K.r0
    public void e(C.d dVar) {
        this.f701c.setStableInsets(dVar.d());
    }

    @Override // K.r0
    public void f(C.d dVar) {
        this.f701c.setSystemGestureInsets(dVar.d());
    }

    @Override // K.r0
    public void g(C.d dVar) {
        this.f701c.setSystemWindowInsets(dVar.d());
    }

    @Override // K.r0
    public void h(C.d dVar) {
        this.f701c.setTappableElementInsets(dVar.d());
    }

    public p0(z0 z0Var) {
        super(z0Var);
        WindowInsets.Builder g2;
        WindowInsets f2 = z0Var.f();
        if (f2 != null) {
            g2 = C.b.h(f2);
        } else {
            g2 = C.b.g();
        }
        this.f701c = g2;
    }
}
