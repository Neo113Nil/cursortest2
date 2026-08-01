package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class zr0 extends jt0 {
    public Object c;

    public zr0(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.jt0
    public final void a(jt0 jt0Var) {
        jt0Var.getClass();
        this.c = ((zr0) jt0Var).c;
    }

    @Override // defpackage.jt0
    public final jt0 b(long j) {
        return new zr0(ur0.k().g(), this.c);
    }
}
