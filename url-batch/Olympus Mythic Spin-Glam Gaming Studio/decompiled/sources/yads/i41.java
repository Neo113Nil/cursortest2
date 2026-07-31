package yads;

/* loaded from: classes4.dex */
public final class i41 extends f {
    public final l41 d;

    public i41(l41 l41Var, int i) {
        super(l41Var.size(), i);
        this.d = l41Var;
    }

    @Override // yads.f
    public final Object a(int i) {
        return this.d.get(i);
    }
}
