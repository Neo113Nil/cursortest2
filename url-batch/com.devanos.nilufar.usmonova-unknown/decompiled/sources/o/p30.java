package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class p30 extends MU {
    public final Object a = new Object();
    public final C1711ph b = new C1711ph(4);
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override // o.MU
    public final p30 a(Executor executor, InterfaceC0764bG interfaceC0764bG) {
        this.b.e(new Y20(executor, interfaceC0764bG));
        n();
        return this;
    }

    @Override // o.MU
    public final p30 b(Executor executor, InterfaceC0960eG interfaceC0960eG) {
        this.b.e(new Y20(executor, interfaceC0960eG));
        n();
        return this;
    }

    @Override // o.MU
    public final p30 c(Executor executor, InterfaceC1224iG interfaceC1224iG) {
        this.b.e(new Y20(executor, interfaceC1224iG));
        n();
        return this;
    }

    @Override // o.MU
    public final p30 d(Executor executor, InterfaceC2301ye interfaceC2301ye) {
        p30 p30Var = new p30();
        this.b.e(new S20(executor, interfaceC2301ye, p30Var, 0));
        n();
        return p30Var;
    }

    @Override // o.MU
    public final p30 e(Executor executor, InterfaceC2301ye interfaceC2301ye) {
        p30 p30Var = new p30();
        this.b.e(new S20(executor, interfaceC2301ye, p30Var, 1));
        n();
        return p30Var;
    }

    @Override // o.MU
    public final Exception f() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // o.MU
    public final Object g() {
        Object obj;
        synchronized (this.a) {
            try {
                if (!this.c) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new ZO(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // o.MU
    public final boolean h() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // o.MU
    public final boolean i() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final void j(Exception exc) {
        AbstractC1473m3.o(exc, "Exception must not be null");
        synchronized (this.a) {
            m();
            this.c = true;
            this.f = exc;
        }
        this.b.f(this);
    }

    public final void k(Object obj) {
        synchronized (this.a) {
            m();
            this.c = true;
            this.e = obj;
        }
        this.b.f(this);
    }

    public final void l() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.f(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        if (this.c) {
            int i = C0393Pb.h;
            if (!h()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception f = f();
        }
    }

    public final void n() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
