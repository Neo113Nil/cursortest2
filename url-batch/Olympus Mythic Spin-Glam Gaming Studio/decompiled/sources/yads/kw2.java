package yads;

/* loaded from: classes4.dex */
public final class kw2 implements m32 {
    public final yu2 a;
    public final v3 b;

    public kw2(v3 v3Var, yu2 yu2Var) {
        this.a = yu2Var;
        this.b = v3Var;
    }

    @Override // yads.m32
    public final l32 a(x02 x02Var, km kmVar) {
        return new jw2(this.a, x02Var, kmVar, this.b);
    }
}
