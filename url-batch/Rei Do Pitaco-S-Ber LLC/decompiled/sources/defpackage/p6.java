package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class p6 extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        s6 c;
        while (true) {
            try {
                reentrantLock = s6.h;
                reentrantLock.lock();
                try {
                    c = oo.c();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (c == s6.l) {
                s6.l = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (c != null) {
                    c.j();
                }
            }
        }
    }
}
