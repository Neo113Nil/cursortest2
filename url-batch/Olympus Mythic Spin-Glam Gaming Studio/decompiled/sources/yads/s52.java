package yads;

/* loaded from: classes5.dex */
public final class s52 implements uf3 {
    public final zo0 a;

    public s52(zo0 zo0Var) {
        this.a = zo0Var;
    }

    @Override // yads.uf3
    public final void a(we3 we3Var) {
        this.a.a((t62) we3Var.d);
    }

    @Override // yads.uf3
    public final long c() {
        return this.a.a.i();
    }

    @Override // yads.uf3
    public final void d() {
        this.a.d();
    }

    @Override // yads.uf3
    public final long getAdPosition() {
        xn0 xn0Var = this.a.a;
        xn0Var.q();
        return sb3.b(xn0Var.a(xn0Var.b0));
    }

    @Override // yads.uf3
    public final float getVolume() {
        xn0 xn0Var = this.a.a;
        xn0Var.q();
        return xn0Var.V;
    }

    @Override // yads.uf3
    public final void pauseAd() {
        this.a.c();
    }

    @Override // yads.uf3
    public final void a(xf3 xf3Var) {
        this.a.a(xf3Var);
    }
}
