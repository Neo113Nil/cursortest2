package o;

import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class L20 implements InterfaceC1224iG, InterfaceC0960eG, InterfaceC0698aG {
    public final Object h = new Object();
    public final int i;
    public final p30 j;
    public int k;
    public int l;
    public int m;
    public Exception n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f60o;

    public L20(int i, p30 p30Var) {
        this.i = i;
        this.j = p30Var;
    }

    public final void a() {
        int i = this.k + this.l + this.m;
        int i2 = this.i;
        if (i == i2) {
            Exception exc = this.n;
            p30 p30Var = this.j;
            if (exc == null) {
                if (this.f60o) {
                    p30Var.l();
                    return;
                } else {
                    p30Var.k(null);
                    return;
                }
            }
            p30Var.j(new ExecutionException(this.l + " out of " + i2 + " underlying tasks failed", this.n));
        }
    }

    @Override // o.InterfaceC0698aG
    public final void b() {
        synchronized (this.h) {
            this.m++;
            this.f60o = true;
            a();
        }
    }

    @Override // o.InterfaceC1224iG
    public final void c(Object obj) {
        synchronized (this.h) {
            this.k++;
            a();
        }
    }

    @Override // o.InterfaceC0960eG
    public final void d(Exception exc) {
        synchronized (this.h) {
            this.l++;
            this.n = exc;
            a();
        }
    }
}
