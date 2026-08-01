package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class rq implements Runnable, Comparable, bn {
    private volatile Object _heap;
    public long d;
    public int e;

    @Override // defpackage.bn
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                op opVar = a50.f;
                if (obj == opVar) {
                    return;
                }
                sq sqVar = obj instanceof sq ? (sq) obj : null;
                if (sqVar != null) {
                    sqVar.b(this);
                }
                this._heap = opVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final jw0 b() {
        Object obj = this._heap;
        if (obj instanceof jw0) {
            return (jw0) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.d - ((rq) obj).d;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final int d(long j, sq sqVar, tq tqVar) {
        synchronized (this) {
            if (this._heap == a50.f) {
                return 2;
            }
            synchronized (sqVar) {
                try {
                    rq[] rqVarArr = sqVar.a;
                    rq rqVar = rqVarArr != null ? rqVarArr[0] : null;
                    if (tq.l.get(tqVar) != 0) {
                        return 1;
                    }
                    if (rqVar == null) {
                        sqVar.c = j;
                    } else {
                        long j2 = rqVar.d;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - sqVar.c > 0) {
                            sqVar.c = j;
                        }
                    }
                    long j3 = this.d;
                    long j4 = sqVar.c;
                    if (j3 - j4 < 0) {
                        this.d = j4;
                    }
                    sqVar.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e(sq sqVar) {
        if (this._heap != a50.f) {
            this._heap = sqVar;
        } else {
            g8.r("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.d + ']';
    }
}
