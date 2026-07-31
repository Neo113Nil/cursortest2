package yads;

/* loaded from: classes15.dex */
public final class sl3 implements cg3 {
    public final s52 a;
    public final dk3 b;

    public sl3(s52 s52Var, u72 u72Var) {
        dk3 dk3Var = new dk3(u72Var);
        this.a = s52Var;
        this.b = dk3Var;
    }

    @Override // yads.cg3
    public final void a(long j, long j2) {
        if (this.b.a()) {
            if (this.a.a.b()) {
                return;
            }
            this.a.a.e();
        } else if (this.a.a.b()) {
            this.a.a.c();
        }
    }
}
