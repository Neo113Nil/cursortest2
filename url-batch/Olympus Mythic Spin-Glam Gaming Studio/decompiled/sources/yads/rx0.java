package yads;

/* loaded from: classes8.dex */
public final class rx0 implements lx0 {
    public final rd1 a;
    public final d2 b;

    public rx0(rd1 rd1Var, d2 d2Var) {
        this.a = rd1Var;
        this.b = d2Var;
    }

    @Override // yads.lx0
    public final void c() {
        if (this.a.a()) {
            return;
        }
        this.b.e();
    }

    @Override // yads.lx0
    public final void invalidate() {
        this.a.b();
    }
}
