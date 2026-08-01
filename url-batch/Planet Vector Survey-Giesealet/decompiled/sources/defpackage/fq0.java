package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class fq0 extends kp0 {
    public final /* synthetic */ AtomicReferenceArray e;

    public fq0(long j, fq0 fq0Var, int i) {
        super(j, fq0Var, i);
        this.e = new AtomicReferenceArray(eq0.f);
    }

    @Override // defpackage.kp0
    public final int f() {
        return eq0.f;
    }

    @Override // defpackage.kp0
    public final void g(int i, rj rjVar) {
        this.e.set(i, eq0.e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
