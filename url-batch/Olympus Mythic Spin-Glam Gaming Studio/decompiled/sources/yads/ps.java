package yads;

/* loaded from: classes3.dex */
public final class ps implements o10 {
    public final d8 a;
    public final /* synthetic */ ts b;

    public ps(ts tsVar, d8 d8Var) {
        this.b = tsVar;
        this.a = d8Var;
    }

    @Override // yads.o10
    public final void a(kr2 kr2Var) {
        ts tsVar = this.b;
        z10.a(tsVar.f, new ns(tsVar, this), new os(this.b, this, kr2Var, null));
    }

    @Override // yads.o10
    public final void onAdFailedToLoad(d4 d4Var) {
        vd0 vd0Var = this.b.e;
        vd0Var.a.a(this.a, null);
    }
}
