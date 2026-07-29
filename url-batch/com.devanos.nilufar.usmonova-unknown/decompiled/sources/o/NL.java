package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class NL implements InterfaceC2006u9 {
    public final EF h;
    public final FN i;
    public final QL j;
    public final ML k;
    public final AtomicBoolean l;
    public Object m;
    public C0636Yk n;

    /* renamed from: o, reason: collision with root package name */
    public PL f72o;
    public boolean p;
    public C0584Wk q;
    public boolean r;
    public boolean s;
    public boolean t;
    public volatile boolean u;
    public volatile C0584Wk v;
    public volatile PL w;

    public NL(EF ef, FN fn) {
        AbstractC0048Bt.n(ef, "client");
        this.h = ef;
        this.i = fn;
        this.j = (QL) ef.i.i;
        ef.l.getClass();
        ML ml = new ML(this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ml.g(0);
        this.k = ml;
        this.l = new AtomicBoolean();
        this.t = true;
    }

    public static final String a(NL nl) {
        StringBuilder sb = new StringBuilder();
        sb.append(nl.u ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(nl.i.a.g());
        return sb.toString();
    }

    public final void b(PL pl) {
        byte[] bArr = HY.a;
        if (this.f72o != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f72o = pl;
        pl.p.add(new LL(this, this.m));
    }

    public final IOException c(IOException iOException) {
        IOException iOException2;
        Socket h;
        byte[] bArr = HY.a;
        PL pl = this.f72o;
        if (pl != null) {
            synchronized (pl) {
                h = h();
            }
            if (this.f72o == null) {
                if (h != null) {
                    HY.d(h);
                }
            } else if (h != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.p && this.k.i()) {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        } else {
            iOException2 = iOException;
        }
        if (iOException != null) {
            AbstractC0048Bt.k(iOException2);
        }
        return iOException2;
    }

    public final void cancel() {
        Socket socket;
        if (this.u) {
            return;
        }
        this.u = true;
        C0584Wk c0584Wk = this.v;
        if (c0584Wk != null) {
            ((InterfaceC0610Xk) c0584Wk.e).cancel();
        }
        PL pl = this.w;
        if (pl == null || (socket = pl.c) == null) {
            return;
        }
        HY.d(socket);
    }

    public final Object clone() {
        return new NL(this.h, this.i);
    }

    public final void d(boolean z) {
        C0584Wk c0584Wk;
        synchronized (this) {
            if (!this.t) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (c0584Wk = this.v) != null) {
            ((InterfaceC0610Xk) c0584Wk.e).cancel();
            ((NL) c0584Wk.c).f(c0584Wk, true, true, null);
        }
        this.q = null;
    }

    public final C0968eO e() {
        ArrayList arrayList = new ArrayList();
        AbstractC1048fc.f0(arrayList, this.h.j);
        arrayList.add(new B8(this.h));
        arrayList.add(new B8(this.h.q));
        this.h.getClass();
        arrayList.add(new C1677p9(0));
        arrayList.add(C1677p9.b);
        AbstractC1048fc.f0(arrayList, this.h.k);
        arrayList.add(new C1677p9(2));
        FN fn = this.i;
        EF ef = this.h;
        try {
            try {
                C0968eO b = new RL(this, arrayList, 0, null, fn, ef.C, ef.D, ef.E).b(fn);
                if (this.u) {
                    HY.c(b);
                    throw new IOException("Canceled");
                }
                g(null);
                return b;
            } catch (IOException e) {
                IOException g = g(e);
                AbstractC0048Bt.l(g, "null cannot be cast to non-null type kotlin.Throwable");
                throw g;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                g(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:48:0x0013, B:10:0x0022, B:12:0x0026, B:13:0x0028, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:7:0x001c), top: B:47:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:48:0x0013, B:10:0x0022, B:12:0x0026, B:13:0x0028, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:7:0x001c), top: B:47:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException f(C0584Wk c0584Wk, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        boolean z5;
        AbstractC0048Bt.n(c0584Wk, "exchange");
        if (c0584Wk.equals(this.v)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (!this.r) {
                        }
                        if (z) {
                            this.r = false;
                        }
                        if (z2) {
                            this.s = false;
                        }
                        z5 = this.r;
                        boolean z6 = z5 && !this.s;
                        if (!z5 && !this.s) {
                            if (!this.t) {
                                z3 = true;
                            }
                        }
                        z4 = z3;
                        z3 = z6;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z2 || !this.s) {
                    z4 = false;
                }
                if (z) {
                }
                if (z2) {
                }
                z5 = this.r;
                if (z5) {
                }
                if (!z5) {
                    if (!this.t) {
                    }
                }
                z4 = z3;
                z3 = z6;
            }
            if (z3) {
                this.v = null;
                PL pl = this.f72o;
                if (pl != null) {
                    synchronized (pl) {
                        pl.m++;
                    }
                }
            }
            if (z4) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException g(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.t) {
                this.t = false;
                if (!this.r) {
                    if (!this.s) {
                        z = true;
                    }
                }
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket h() {
        PL pl = this.f72o;
        AbstractC0048Bt.k(pl);
        byte[] bArr = HY.a;
        ArrayList arrayList = pl.p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (AbstractC0048Bt.h(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.f72o = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        pl.q = System.nanoTime();
        QL ql = this.j;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) ql.d;
        QU qu = (QU) ql.b;
        byte[] bArr2 = HY.a;
        if (!pl.j) {
            qu.c((C0409Pr) ql.c, 0L);
            return null;
        }
        pl.j = true;
        concurrentLinkedQueue.remove(pl);
        if (concurrentLinkedQueue.isEmpty()) {
            qu.a();
        }
        Socket socket = pl.d;
        AbstractC0048Bt.k(socket);
        return socket;
    }
}
