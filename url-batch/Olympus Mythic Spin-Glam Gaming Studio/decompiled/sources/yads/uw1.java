package yads;

/* loaded from: classes5.dex */
public final class uw1 extends qn {
    public final lw1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw1(vb2 vb2Var, t01 t01Var, gi3 gi3Var, kv1 kv1Var, lv1 lv1Var, xa2 xa2Var) {
        super(vb2Var);
        yw1 yw1Var = new yw1(t01Var);
        lw1 lw1Var = new lw1(vb2Var, null, 254);
        this.b = lw1Var;
        lw1Var.l = yw1Var;
        lw1Var.p = gi3Var;
        lw1Var.n = kv1Var;
        lw1Var.m = lv1Var;
        lw1Var.o = xa2Var;
    }

    @Override // yads.qn
    public final void a(String str) {
        this.b.a(str);
    }

    @Override // yads.qn
    public final void a(t01 t01Var) {
        this.a.setHtmlWebViewListener(new ow1(this.b));
    }
}
