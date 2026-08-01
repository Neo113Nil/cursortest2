package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class b0 extends px0 {
    @Override // defpackage.px0
    public final void O(c0 c0Var, c0 c0Var2) {
        c0Var.b = c0Var2;
    }

    @Override // defpackage.px0
    public final void P(c0 c0Var, Thread thread) {
        c0Var.a = thread;
    }

    @Override // defpackage.px0
    public final boolean m(d0 d0Var, z zVar) {
        z zVar2 = z.b;
        synchronized (d0Var) {
            try {
                if (d0Var.e != zVar) {
                    return false;
                }
                d0Var.e = zVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.px0
    public final boolean n(d0 d0Var, Object obj, Object obj2) {
        synchronized (d0Var) {
            try {
                if (d0Var.d != obj) {
                    return false;
                }
                d0Var.d = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.px0
    public final boolean o(d0 d0Var, c0 c0Var, c0 c0Var2) {
        synchronized (d0Var) {
            try {
                if (d0Var.f != c0Var) {
                    return false;
                }
                d0Var.f = c0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
