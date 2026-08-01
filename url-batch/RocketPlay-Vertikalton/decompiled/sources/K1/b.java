package K1;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class b extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        e a2;
        while (true) {
            try {
                reentrantLock = e.h;
                reentrantLock.lock();
                try {
                    a2 = F1.l.a();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            }
            if (a2 == e.f741l) {
                e.f741l = null;
                return;
            } else {
                reentrantLock.unlock();
                if (a2 != null) {
                    a2.j();
                }
            }
        }
    }
}
