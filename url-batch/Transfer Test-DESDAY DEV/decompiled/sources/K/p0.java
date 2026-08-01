package K;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class p0 extends r0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f439c;

    public p0() {
        this.f439c = C.b.h();
    }

    @Override // K.r0
    public z0 b() {
        WindowInsets build;
        a();
        build = this.f439c.build();
        z0 g2 = z0.g(null, build);
        g2.f465a.o(this.f443b);
        return g2;
    }

    @Override // K.r0
    public void d(C.d dVar) {
        this.f439c.setMandatorySystemGestureInsets(dVar.d());
    }

    @Override // K.r0
    public void e(C.d dVar) {
        this.f439c.setStableInsets(dVar.d());
    }

    @Override // K.r0
    public void f(C.d dVar) {
        this.f439c.setSystemGestureInsets(dVar.d());
    }

    @Override // K.r0
    public void g(C.d dVar) {
        this.f439c.setSystemWindowInsets(dVar.d());
    }

    @Override // K.r0
    public void h(C.d dVar) {
        this.f439c.setTappableElementInsets(dVar.d());
    }

    public p0(z0 z0Var) {
        super(z0Var);
        WindowInsets.Builder h;
        WindowInsets f2 = z0Var.f();
        if (f2 != null) {
            h = C.b.i(f2);
        } else {
            h = C.b.h();
        }
        this.f439c = h;
    }
}
