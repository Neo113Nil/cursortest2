package yads;

/* loaded from: classes12.dex */
public final class ic0 {
    public final zj[] a;
    public final iz2 b;
    public final o23 c;

    public ic0(zj... zjVarArr) {
        iz2 iz2Var = new iz2();
        o23 o23Var = new o23();
        zj[] zjVarArr2 = new zj[zjVarArr.length + 2];
        this.a = zjVarArr2;
        System.arraycopy(zjVarArr, 0, zjVarArr2, 0, zjVarArr.length);
        this.b = iz2Var;
        this.c = o23Var;
        zjVarArr2[zjVarArr.length] = iz2Var;
        zjVarArr2[zjVarArr.length + 1] = o23Var;
    }
}
