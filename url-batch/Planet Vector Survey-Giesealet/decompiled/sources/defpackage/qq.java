package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class qq extends rq {
    public final hc f;
    public final /* synthetic */ tq g;

    public qq(tq tqVar, long j, hc hcVar) {
        this.g = tqVar;
        this.d = j;
        this.e = -1;
        this.f = hcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.B(this.g);
    }

    @Override // defpackage.rq
    public final String toString() {
        return super.toString() + this.f;
    }
}
