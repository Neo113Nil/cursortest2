package v1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends x {
    public static final ReentrantLock h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f4069j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f4070k;

    /* renamed from: l, reason: collision with root package name */
    public static e f4071l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4072e;

    /* renamed from: f, reason: collision with root package name */
    public e f4073f;

    /* renamed from: g, reason: collision with root package name */
    public long f4074g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        X0.d.d(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f4069j = millis;
        f4070k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j2 = this.f4110c;
        boolean z2 = this.f4108a;
        if (j2 != 0 || z2) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f4072e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f4072e = true;
                if (f4071l == null) {
                    f4071l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z2) {
                    this.f4074g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f4074g = j2 + nanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    this.f4074g = c();
                }
                long j3 = this.f4074g - nanoTime;
                e eVar2 = f4071l;
                X0.d.b(eVar2);
                while (true) {
                    eVar = eVar2.f4073f;
                    if (eVar == null || j3 < eVar.f4074g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f4073f = eVar;
                eVar2.f4073f = this;
                if (eVar2 == f4071l) {
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
            if (!this.f4072e) {
                return false;
            }
            this.f4072e = false;
            e eVar = f4071l;
            while (eVar != null) {
                e eVar2 = eVar.f4073f;
                if (eVar2 == this) {
                    eVar.f4073f = this.f4073f;
                    this.f4073f = null;
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
