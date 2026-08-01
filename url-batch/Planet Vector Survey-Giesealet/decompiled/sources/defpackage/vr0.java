package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class vr0 extends jt0 {
    public float c;

    public vr0(long j, float f) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.jt0
    public final void a(jt0 jt0Var) {
        jt0Var.getClass();
        this.c = ((vr0) jt0Var).c;
    }

    @Override // defpackage.jt0
    public final jt0 b(long j) {
        return new vr0(j, this.c);
    }
}
