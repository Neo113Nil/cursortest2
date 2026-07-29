package o;

import java.util.concurrent.locks.LockSupport;

/* renamed from: o.o8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1610o8 extends AbstractC1993u {
    public final Thread k;
    public final AbstractC0454Rk l;

    public C1610o8(InterfaceC0189He interfaceC0189He, Thread thread, AbstractC0454Rk abstractC0454Rk) {
        super(interfaceC0189He, true);
        this.k = thread;
        this.l = abstractC0454Rk;
    }

    @Override // o.C0283Ku
    public final void i(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.k;
        if (AbstractC0048Bt.h(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
