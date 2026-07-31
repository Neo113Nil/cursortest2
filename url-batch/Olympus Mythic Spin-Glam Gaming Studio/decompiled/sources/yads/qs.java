package yads;

/* loaded from: classes3.dex */
public final class qs implements o10 {
    public final o10 a;

    public qs(o10 o10Var) {
        this.a = o10Var;
    }

    @Override // yads.o10
    public final void a(kr2 kr2Var) {
        o10 o10Var = this.a;
        if (o10Var != null) {
            o10Var.a(kr2Var);
        }
    }

    @Override // yads.o10
    public final void onAdFailedToLoad(d4 d4Var) {
        o10 o10Var = this.a;
        if (o10Var != null) {
            o10Var.onAdFailedToLoad(d4Var);
        }
    }
}
