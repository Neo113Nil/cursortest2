package o;

/* loaded from: classes.dex */
public final class NU {
    public final p30 a = new p30();

    public final void a(Exception exc) {
        this.a.j(exc);
    }

    public final void b(Object obj) {
        this.a.k(obj);
    }

    public final boolean c(Exception exc) {
        p30 p30Var = this.a;
        p30Var.getClass();
        AbstractC1473m3.o(exc, "Exception must not be null");
        synchronized (p30Var.a) {
            try {
                if (p30Var.c) {
                    return false;
                }
                p30Var.c = true;
                p30Var.f = exc;
                p30Var.b.f(p30Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        p30 p30Var = this.a;
        synchronized (p30Var.a) {
            try {
                if (p30Var.c) {
                    return;
                }
                p30Var.c = true;
                p30Var.e = obj;
                p30Var.b.f(p30Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
