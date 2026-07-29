package o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class X6 extends NV {
    public static final ReentrantLock h;
    public static final Condition i;
    public static final long j;
    public static final long k;
    public static X6 l;
    public int e;
    public X6 f;
    public long g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        AbstractC0048Bt.m(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        j = millis;
        k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = 1;
                C1097gL.u(this, j2, z);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            int i2 = this.e;
            this.e = 0;
            if (i2 != 1) {
                return i2 == 2;
            }
            X6 x6 = l;
            while (x6 != null) {
                X6 x62 = x6.f;
                if (x62 == this) {
                    x6.f = this.f;
                    this.f = null;
                    return false;
                }
                x6 = x62;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
