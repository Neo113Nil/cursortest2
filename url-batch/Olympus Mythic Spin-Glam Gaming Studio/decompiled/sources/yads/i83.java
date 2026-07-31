package yads;

/* loaded from: classes3.dex */
public final class i83 {
    public final int a;
    public final on2[] b;
    public final xo0[] c;
    public final e93 d;
    public final ei1 e;

    public i83(on2[] on2VarArr, xo0[] xo0VarArr, e93 e93Var, ei1 ei1Var) {
        this.b = on2VarArr;
        this.c = (xo0[]) xo0VarArr.clone();
        this.d = e93Var;
        this.e = ei1Var;
        this.a = on2VarArr.length;
    }

    public final boolean a(int i) {
        return this.b[i] != null;
    }
}
