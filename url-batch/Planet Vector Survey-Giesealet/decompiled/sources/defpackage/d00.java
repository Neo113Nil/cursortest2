package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class d00 extends hc {
    public final g00 l;

    public d00(kj kjVar, ff ffVar) {
        super(1, kjVar);
        this.l = ffVar;
    }

    @Override // defpackage.hc
    public final Throwable o(g00 g00Var) {
        Throwable c;
        g00 g00Var2 = this.l;
        g00Var2.getClass();
        Object obj = g00.d.get(g00Var2);
        return (!(obj instanceof f00) || (c = ((f00) obj).c()) == null) ? obj instanceof jf ? ((jf) obj).a : g00Var.n() : c;
    }

    @Override // defpackage.hc
    public final String x() {
        return "AwaitContinuation";
    }
}
