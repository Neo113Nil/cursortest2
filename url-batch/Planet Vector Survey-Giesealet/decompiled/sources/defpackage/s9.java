package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class s9 extends l {
    public final Thread g;
    public final pq h;

    public s9(rj rjVar, Thread thread, pq pqVar) {
        super(rjVar, true);
        this.g = thread;
        this.h = pqVar;
    }

    @Override // defpackage.g00
    public final void w(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.g;
        if (nz.l(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
