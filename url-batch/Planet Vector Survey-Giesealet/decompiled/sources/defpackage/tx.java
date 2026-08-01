package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class tx implements mo {
    public final sx a;

    public tx(sx sxVar) {
        this.a = sxVar;
    }

    @Override // defpackage.u50
    public final Object a(qu quVar, Object obj) {
        return quVar.invoke(obj, this);
    }

    @Override // defpackage.mo
    public final void b(r10 r10Var) {
        this.a.e(r10Var);
    }

    @Override // defpackage.u50
    public final /* synthetic */ u50 c(u50 u50Var) {
        return y6.d(this, u50Var);
    }

    @Override // defpackage.u50
    public final boolean e(mu muVar) {
        return ((Boolean) muVar.c(this)).booleanValue();
    }
}
