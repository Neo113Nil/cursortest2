package yads;

/* loaded from: classes4.dex */
public final class jy implements cj1 {
    public final bj1 a = new bj1();
    public final cj1[] b;

    public jy(cj1... cj1VarArr) {
        this.b = cj1VarArr;
    }

    @Override // yads.cj1
    public final bj1 a(int i, int i2) {
        cj1[] cj1VarArr = this.b;
        int length = cj1VarArr.length;
        int i3 = 0;
        while (i3 < length) {
            bj1 a = cj1VarArr[i3].a(i, i2);
            int i4 = a.a;
            i3++;
            i2 = a.b;
            i = i4;
        }
        bj1 bj1Var = this.a;
        bj1Var.a = i;
        bj1Var.b = i2;
        return bj1Var;
    }
}
