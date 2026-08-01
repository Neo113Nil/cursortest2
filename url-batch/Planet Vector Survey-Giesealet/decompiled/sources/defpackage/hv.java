package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class hv implements mu {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hv(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    private final Object d(Object obj) {
        long j;
        sr0 sr0Var = (sr0) obj;
        synchronized (ur0.c) {
            j = ur0.e;
            ur0.e = 1 + j;
        }
        return new e70(j, sr0Var, (mu) this.e, (mu) this.f);
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        switch (this.d) {
            case 0:
                return d(obj);
            default:
                w00 w00Var = (w00) this.e;
                Object obj2 = w00Var.a;
                hc hcVar = (hc) this.f;
                synchronized (obj2) {
                    w00Var.b.remove(hcVar);
                }
                return ky0.a;
        }
    }
}
