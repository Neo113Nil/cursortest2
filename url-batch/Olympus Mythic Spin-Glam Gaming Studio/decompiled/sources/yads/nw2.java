package yads;

/* loaded from: classes3.dex */
public final class nw2 implements b52 {
    public final /* synthetic */ ow2 a;

    public nw2(ow2 ow2Var) {
        this.a = ow2Var;
    }

    @Override // yads.b52
    public final void a(m12 m12Var) {
        ow2 ow2Var = this.a;
        if (ow2Var.l) {
            return;
        }
        ow2Var.k = m12Var;
        ow2Var.a.g();
    }

    @Override // yads.b52
    public final void a(d4 d4Var) {
        ow2 ow2Var = this.a;
        if (ow2Var.l) {
            return;
        }
        ow2Var.k = null;
        ow2Var.a.b(d4Var);
    }
}
