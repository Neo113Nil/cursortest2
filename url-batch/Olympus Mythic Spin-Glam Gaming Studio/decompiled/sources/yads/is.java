package yads;

/* loaded from: classes3.dex */
public final class is implements u00 {
    public final d8 a;
    public final /* synthetic */ ls b;

    public is(ls lsVar, d8 d8Var) {
        this.b = lsVar;
        this.a = d8Var;
    }

    @Override // yads.u00
    public final void a(zb1 zb1Var) {
        ls lsVar = this.b;
        z10.a(lsVar.f, new gs(lsVar, this), new hs(this.b, this, zb1Var, null));
    }

    @Override // yads.u00
    public final void onAdFailedToLoad(d4 d4Var) {
        vd0 vd0Var = this.b.e;
        vd0Var.a.a(this.a, null);
    }
}
