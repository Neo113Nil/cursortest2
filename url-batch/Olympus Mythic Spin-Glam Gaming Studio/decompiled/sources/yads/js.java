package yads;

/* loaded from: classes3.dex */
public final class js implements u00 {
    public final u00 a;

    public js(u00 u00Var) {
        this.a = u00Var;
    }

    @Override // yads.u00
    public final void a(zb1 zb1Var) {
        u00 u00Var = this.a;
        if (u00Var != null) {
            u00Var.a(zb1Var);
        }
    }

    @Override // yads.u00
    public final void onAdFailedToLoad(d4 d4Var) {
        u00 u00Var = this.a;
        if (u00Var != null) {
            u00Var.onAdFailedToLoad(d4Var);
        }
    }
}
