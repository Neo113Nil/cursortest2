package defpackage;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class s6 extends e50 {
    public static final ReentrantLock h;
    public static final Condition i;
    public static final long j;
    public static final long k;
    public static s6 l;
    public boolean e;
    public s6 f;
    public long g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        i = newCondition;
        j = 60000L;
        k = 60000000000L;
    }

    public final void h() {
        s6 s6Var;
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = true;
                if (l == null) {
                    l = new s6();
                    p6 p6Var = new p6("Okio Watchdog");
                    p6Var.setDaemon(true);
                    p6Var.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z) {
                    this.g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.g = j2 + nanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    this.g = c();
                }
                long j3 = this.g - nanoTime;
                s6 s6Var2 = l;
                s6Var2.getClass();
                while (true) {
                    s6Var = s6Var2.f;
                    if (s6Var == null || j3 < s6Var.g - nanoTime) {
                        break;
                    } else {
                        s6Var2 = s6Var;
                    }
                }
                this.f = s6Var;
                s6Var2.f = this;
                if (s6Var2 == l) {
                    i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            if (!this.e) {
                return false;
            }
            this.e = false;
            s6 s6Var = l;
            while (s6Var != null) {
                s6 s6Var2 = s6Var.f;
                if (s6Var2 == this) {
                    s6Var.f = this.f;
                    this.f = null;
                    return false;
                }
                s6Var = s6Var2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
