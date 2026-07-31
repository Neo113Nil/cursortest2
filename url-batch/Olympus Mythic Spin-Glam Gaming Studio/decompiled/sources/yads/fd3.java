package yads;

/* loaded from: classes15.dex */
public final class fd3 implements cg3 {
    public final wj3 a;
    public final uf3 b;
    public final ck3 c;
    public boolean d;

    public fd3(bk3 bk3Var, wj3 wj3Var, uf3 uf3Var) {
        ck3 ck3Var = new ck3(bk3Var);
        this.a = wj3Var;
        this.b = uf3Var;
        this.c = ck3Var;
    }

    @Override // yads.cg3
    public final void a(long j, long j2) {
        if (this.d || j2 <= 0 || !this.c.a()) {
            return;
        }
        this.d = true;
        wj3 wj3Var = this.a;
        wj3Var.a.a(j, this.b.getVolume());
    }
}
