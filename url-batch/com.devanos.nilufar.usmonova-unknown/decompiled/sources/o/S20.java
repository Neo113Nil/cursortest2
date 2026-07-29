package o;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class S20 implements k30, InterfaceC1224iG, InterfaceC0960eG, InterfaceC0698aG {
    public final /* synthetic */ int h;
    public final Executor i;
    public final InterfaceC2301ye j;
    public final p30 k;

    public /* synthetic */ S20(Executor executor, InterfaceC2301ye interfaceC2301ye, p30 p30Var, int i) {
        this.h = i;
        this.i = executor;
        this.j = interfaceC2301ye;
        this.k = p30Var;
    }

    @Override // o.k30
    public final void a(MU mu) {
        switch (this.h) {
            case 0:
                this.i.execute(new RunnableC1996u1(this, 10, mu));
                break;
            default:
                this.i.execute(new RunnableC1996u1(this, 11, mu));
                break;
        }
    }

    @Override // o.InterfaceC0698aG
    public void b() {
        this.k.l();
    }

    @Override // o.InterfaceC1224iG
    public void c(Object obj) {
        this.k.k(obj);
    }

    @Override // o.InterfaceC0960eG
    public void d(Exception exc) {
        this.k.j(exc);
    }
}
