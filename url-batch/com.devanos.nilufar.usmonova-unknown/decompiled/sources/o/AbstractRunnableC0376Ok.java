package o;

/* renamed from: o.Ok, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0376Ok implements Runnable, Comparable, InterfaceC0297Li {
    private volatile Object _heap;
    public long h;
    public int i = -1;

    public AbstractRunnableC0376Ok(long j) {
        this.h = j;
    }

    @Override // o.InterfaceC0297Li
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C0457Rn c0457Rn = AbstractC0946e20.c;
                if (obj == c0457Rn) {
                    return;
                }
                C0402Pk c0402Pk = obj instanceof C0402Pk ? (C0402Pk) obj : null;
                if (c0402Pk != null) {
                    synchronized (c0402Pk) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof GV ? (GV) obj2 : null) != null) {
                            c0402Pk.b(this.i);
                        }
                    }
                }
                this._heap = c0457Rn;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(long j, C0402Pk c0402Pk, AbstractC0428Qk abstractC0428Qk) {
        synchronized (this) {
            if (this._heap == AbstractC0946e20.c) {
                return 2;
            }
            synchronized (c0402Pk) {
                try {
                    AbstractRunnableC0376Ok[] abstractRunnableC0376OkArr = c0402Pk.a;
                    AbstractRunnableC0376Ok abstractRunnableC0376Ok = abstractRunnableC0376OkArr != null ? abstractRunnableC0376OkArr[0] : null;
                    if (AbstractC0428Qk.p.get(abstractC0428Qk) != 0) {
                        return 1;
                    }
                    if (abstractRunnableC0376Ok == null) {
                        c0402Pk.c = j;
                    } else {
                        long j2 = abstractRunnableC0376Ok.h;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - c0402Pk.c > 0) {
                            c0402Pk.c = j;
                        }
                    }
                    long j3 = this.h;
                    long j4 = c0402Pk.c;
                    if (j3 - j4 < 0) {
                        this.h = j4;
                    }
                    c0402Pk.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.h - ((AbstractRunnableC0376Ok) obj).h;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(C0402Pk c0402Pk) {
        if (this._heap == AbstractC0946e20.c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c0402Pk;
    }

    public String toString() {
        return "Delayed[nanos=" + this.h + ']';
    }
}
