package yads;

/* loaded from: classes3.dex */
public final class gw1 implements bv {
    public final xw1 a;

    public gw1(xw1 xw1Var) {
        this.a = xw1Var;
    }

    @Override // yads.bv
    public final void a(kf1 kf1Var, dv dvVar) {
        this.a.setClickListener(new fw1(kf1Var, dvVar));
    }
}
