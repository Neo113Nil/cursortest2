package K1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends x {
    public static final ReentrantLock h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f739j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f740k;

    /* renamed from: l, reason: collision with root package name */
    public static e f741l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f742e;

    /* renamed from: f, reason: collision with root package name */
    public e f743f;

    /* renamed from: g, reason: collision with root package name */
    public long f744g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        i1.f.d(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f739j = millis;
        f740k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j2 = this.f781c;
        boolean z2 = this.f779a;
        if (j2 != 0 || z2) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f742e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f742e = true;
                if (f741l == null) {
                    f741l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z2) {
                    this.f744g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f744g = j2 + nanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    this.f744g = c();
                }
                long j3 = this.f744g - nanoTime;
                e eVar2 = f741l;
                i1.f.b(eVar2);
                while (true) {
                    eVar = eVar2.f743f;
                    if (eVar == null || j3 < eVar.f744g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f743f = eVar;
                eVar2.f743f = this;
                if (eVar2 == f741l) {
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
            if (!this.f742e) {
                return false;
            }
            this.f742e = false;
            e eVar = f741l;
            while (eVar != null) {
                e eVar2 = eVar.f743f;
                if (eVar2 == this) {
                    eVar.f743f = this.f743f;
                    this.f743f = null;
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
