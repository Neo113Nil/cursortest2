package o;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class U6 extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        X6 L;
        while (true) {
            try {
                ReentrantLock reentrantLock2 = X6.h;
                reentrantLock = X6.h;
                reentrantLock.lock();
                try {
                    L = C1097gL.L();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (L == X6.l) {
                X6.l = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (L != null) {
                    L.j();
                }
            }
        }
    }
}
