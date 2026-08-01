package defpackage;

import android.view.Choreographer;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class q5 implements Choreographer.FrameCallback {
    public final /* synthetic */ hc d;
    public final /* synthetic */ mu e;

    public q5(hc hcVar, r5 r5Var, mu muVar) {
        this.d = hcVar;
        this.e = muVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object uk0Var;
        try {
            uk0Var = this.e.c(Long.valueOf(j));
        } catch (Throwable th) {
            uk0Var = new uk0(th);
        }
        this.d.resumeWith(uk0Var);
    }
}
