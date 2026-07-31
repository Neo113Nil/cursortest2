package yads;

/* loaded from: classes5.dex */
public final class tc3 implements cg3 {
    public final we3 a;
    public final wj3 b;
    public final of3 c;
    public final ck3 d;
    public boolean e;

    public tc3(we3 we3Var, bk3 bk3Var, wj3 wj3Var, of3 of3Var) {
        ck3 ck3Var = new ck3(bk3Var);
        this.a = we3Var;
        this.b = wj3Var;
        this.c = of3Var;
        this.d = ck3Var;
    }

    @Override // yads.cg3
    public final void a(long j, long j2) {
        if (this.e || j2 <= 0 || !this.d.a()) {
            return;
        }
        this.e = true;
        this.b.h();
        this.c.f(this.a);
    }
}
