package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class iv implements mu {
    public final /* synthetic */ mu d;

    public iv(mu muVar) {
        this.d = muVar;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        long j;
        sr0 sr0Var = (sr0) obj;
        synchronized (ur0.c) {
            j = ur0.e;
            ur0.e = 1 + j;
        }
        return new oi0(j, sr0Var, this.d);
    }
}
