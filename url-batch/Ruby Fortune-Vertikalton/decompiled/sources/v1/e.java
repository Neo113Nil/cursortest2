package v1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends w {
    public static final ReentrantLock h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f4063j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f4064k;

    /* renamed from: l, reason: collision with root package name */
    public static e f4065l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4066e;

    /* renamed from: f, reason: collision with root package name */
    public e f4067f;

    /* renamed from: g, reason: collision with root package name */
    public long f4068g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        X0.e.d(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f4063j = millis;
        f4064k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j2 = this.f4103c;
        boolean z2 = this.f4101a;
        if (j2 != 0 || z2) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f4066e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f4066e = true;
                if (f4065l == null) {
                    f4065l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z2) {
                    this.f4068g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f4068g = j2 + nanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    this.f4068g = c();
                }
                long j3 = this.f4068g - nanoTime;
                e eVar2 = f4065l;
                X0.e.b(eVar2);
                while (true) {
                    eVar = eVar2.f4067f;
                    if (eVar == null || j3 < eVar.f4068g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f4067f = eVar;
                eVar2.f4067f = this;
                if (eVar2 == f4065l) {
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
            if (!this.f4066e) {
                return false;
            }
            this.f4066e = false;
            e eVar = f4065l;
            while (eVar != null) {
                e eVar2 = eVar.f4067f;
                if (eVar2 == this) {
                    eVar.f4067f = this.f4067f;
                    this.f4067f = null;
                    return false;
                }
                eVar = eVar2;
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
