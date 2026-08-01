package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class xr0 extends jt0 {
    public long c;

    public xr0(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // defpackage.jt0
    public final void a(jt0 jt0Var) {
        jt0Var.getClass();
        this.c = ((xr0) jt0Var).c;
    }

    @Override // defpackage.jt0
    public final jt0 b(long j) {
        return new xr0(j, this.c);
    }
}
