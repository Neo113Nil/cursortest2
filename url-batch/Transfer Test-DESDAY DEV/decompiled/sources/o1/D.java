package o1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class D implements Runnable, Comparable, A {
    private volatile Object _heap;

    /* renamed from: a, reason: collision with root package name */
    public long f3278a;

    /* renamed from: b, reason: collision with root package name */
    public int f3279b;

    public final int a(long j2, E e2, F f2) {
        synchronized (this) {
            if (this._heap == AbstractC0302t.f3335a) {
                return 2;
            }
            synchronized (e2) {
                try {
                    D[] dArr = e2.f3721a;
                    D d = dArr != null ? dArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F.f3281f;
                    f2.getClass();
                    if (F.h.get(f2) != 0) {
                        return 1;
                    }
                    if (d == null) {
                        e2.f3280c = j2;
                    } else {
                        long j3 = d.f3278a;
                        if (j3 - j2 < 0) {
                            j2 = j3;
                        }
                        if (j2 - e2.f3280c > 0) {
                            e2.f3280c = j2;
                        }
                    }
                    long j4 = this.f3278a;
                    long j5 = e2.f3280c;
                    if (j4 - j5 < 0) {
                        this.f3278a = j5;
                    }
                    e2.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b(E e2) {
        if (this._heap == AbstractC0302t.f3335a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = e2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j2 = this.f3278a - ((D) obj).f3278a;
        if (j2 > 0) {
            return 1;
        }
        return j2 < 0 ? -1 : 0;
    }

    @Override // o1.A
    public final void e() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                U.q qVar = AbstractC0302t.f3335a;
                if (obj == qVar) {
                    return;
                }
                E e2 = obj instanceof E ? (E) obj : null;
                if (e2 != null) {
                    synchronized (e2) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof s1.t ? (s1.t) obj2 : null) != null) {
                            e2.b(this.f3279b);
                        }
                    }
                }
                this._heap = qVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f3278a + ']';
    }
}
