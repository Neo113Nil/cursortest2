package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class iy0 extends yn0 {
    public final ThreadLocal h;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public iy0(rj rjVar, fu0 fu0Var) {
        super(fu0Var, rjVar.k(r0) == null ? rjVar.i(r0) : rjVar);
        jc jcVar = jc.f;
        this.h = new ThreadLocal();
        if (fu0Var.getContext().k(b2.t) instanceof uj) {
            return;
        }
        Object Y = mz.Y(rjVar, null);
        mz.S(rjVar, Y);
        f0(rjVar, Y);
    }

    public final boolean e0() {
        boolean z = this.threadLocalIsSet && this.h.get() == null;
        this.h.remove();
        return !z;
    }

    public final void f0(rj rjVar, Object obj) {
        this.threadLocalIsSet = true;
        this.h.set(new pd0(rjVar, obj));
    }

    @Override // defpackage.yn0, defpackage.g00
    public final void x(Object obj) {
        if (this.threadLocalIsSet) {
            pd0 pd0Var = (pd0) this.h.get();
            if (pd0Var != null) {
                mz.S((rj) pd0Var.d, pd0Var.e);
            }
            this.h.remove();
        }
        Object X = nz.X(obj);
        kj kjVar = this.g;
        rj context = kjVar.getContext();
        Object Y = mz.Y(context, null);
        iy0 P = Y != mz.p ? a50.P(kjVar, context, Y) : null;
        try {
            this.g.resumeWith(X);
            if (P == null || P.e0()) {
                mz.S(context, Y);
            }
        } catch (Throwable th) {
            if (P == null || P.e0()) {
                mz.S(context, Y);
            }
            throw th;
        }
    }
}
