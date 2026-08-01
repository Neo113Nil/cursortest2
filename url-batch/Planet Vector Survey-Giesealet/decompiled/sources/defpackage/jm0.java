package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jm0 extends t50 implements i10, ix0 {
    public py r;
    public final y3 s;

    public jm0(py pyVar) {
        this.r = pyVar;
        this.s = new y3(17, this, pyVar);
    }

    @Override // defpackage.i10
    public final e40 d(f40 f40Var, b50 b50Var, long j) {
        yf0 d = b50Var.d(j);
        return f40Var.g0(d.d, d.e, xp.d, this.s, new hq(d, 5));
    }

    @Override // defpackage.ix0
    public final Object j() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }
}
