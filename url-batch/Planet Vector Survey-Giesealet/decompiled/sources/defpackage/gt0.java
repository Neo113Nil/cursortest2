package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class gt0 extends jt0 {
    public w c;
    public int d;
    public int e;

    public gt0(long j, w wVar) {
        super(j);
        this.c = wVar;
    }

    @Override // defpackage.jt0
    public final void a(jt0 jt0Var) {
        synchronized (px0.g) {
            jt0Var.getClass();
            this.c = ((gt0) jt0Var).c;
            this.d = ((gt0) jt0Var).d;
            this.e = ((gt0) jt0Var).e;
        }
    }

    @Override // defpackage.jt0
    public final jt0 b(long j) {
        return new gt0(j, this.c);
    }
}
