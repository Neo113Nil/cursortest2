package yads;

/* loaded from: classes5.dex */
public final class qw2 implements b52 {
    public final /* synthetic */ rw2 a;

    public qw2(rw2 rw2Var) {
        this.a = rw2Var;
    }

    @Override // yads.b52
    public final void a(m12 m12Var) {
        rw2 rw2Var = this.a;
        if (rw2Var.l) {
            return;
        }
        rw2Var.k = m12Var;
        rw2Var.a.g();
    }

    @Override // yads.b52
    public final void a(d4 d4Var) {
        rw2 rw2Var = this.a;
        if (rw2Var.l) {
            return;
        }
        rw2Var.k = null;
        rw2Var.a.b(d4Var);
    }
}
