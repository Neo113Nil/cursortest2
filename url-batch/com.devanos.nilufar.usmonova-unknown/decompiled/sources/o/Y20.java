package o;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class Y20 implements k30, InterfaceC1224iG, InterfaceC0960eG, InterfaceC0698aG {
    public final /* synthetic */ int h;
    public final Executor i;
    public final Object j;
    public final Object k;

    public Y20(Executor executor, InterfaceC0698aG interfaceC0698aG) {
        this.h = 0;
        this.j = new Object();
        this.i = executor;
        this.k = interfaceC0698aG;
    }

    @Override // o.k30
    public final void a(MU mu) {
        switch (this.h) {
            case 0:
                if (((p30) mu).d) {
                    synchronized (this.j) {
                    }
                    this.i.execute(new R2(15, this));
                    return;
                }
                return;
            case 1:
                synchronized (this.j) {
                }
                this.i.execute(new RunnableC1996u1(this, 12, mu));
                return;
            case 2:
                if (mu.i() || ((p30) mu).d) {
                    return;
                }
                synchronized (this.j) {
                }
                this.i.execute(new RunnableC1996u1(this, 14, mu));
                return;
            case 3:
                if (mu.i()) {
                    synchronized (this.j) {
                    }
                    this.i.execute(new RunnableC1996u1(this, 15, mu));
                    return;
                }
                return;
            default:
                this.i.execute(new RunnableC1996u1(this, 17, mu));
                return;
        }
    }

    @Override // o.InterfaceC0698aG
    public void b() {
        ((p30) this.k).l();
    }

    @Override // o.InterfaceC1224iG
    public void c(Object obj) {
        ((p30) this.k).k(obj);
    }

    @Override // o.InterfaceC0960eG
    public void d(Exception exc) {
        ((p30) this.k).j(exc);
    }

    public Y20(Executor executor, InterfaceC0764bG interfaceC0764bG) {
        this.h = 1;
        this.j = new Object();
        this.i = executor;
        this.k = interfaceC0764bG;
    }

    public Y20(Executor executor, InterfaceC0960eG interfaceC0960eG) {
        this.h = 2;
        this.j = new Object();
        this.i = executor;
        this.k = interfaceC0960eG;
    }

    public Y20(Executor executor, InterfaceC1224iG interfaceC1224iG) {
        this.h = 3;
        this.j = new Object();
        this.i = executor;
        this.k = interfaceC1224iG;
    }

    public Y20(Executor executor, InterfaceC1302jU interfaceC1302jU, p30 p30Var) {
        this.h = 4;
        this.i = executor;
        this.j = interfaceC1302jU;
        this.k = p30Var;
    }
}
