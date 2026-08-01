package m1;

import i1.q;
import i1.u;
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
public final class j implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final q f3234a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f3235b;

    /* renamed from: c, reason: collision with root package name */
    public final n f3236c;
    public final i d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f3237e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3238f;

    /* renamed from: g, reason: collision with root package name */
    public f f3239g;
    public m h;
    public e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3240j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3241k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3242l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f3243m;

    /* renamed from: n, reason: collision with root package name */
    public volatile e f3244n;

    /* renamed from: o, reason: collision with root package name */
    public volatile m f3245o;

    public j(q qVar, H.e eVar) {
        this.f3234a = qVar;
        this.f3235b = eVar;
        this.f3236c = (n) qVar.f2489b.f62b;
        qVar.f2491e.getClass();
        i iVar = new i(this);
        iVar.g(qVar.f2506v, TimeUnit.MILLISECONDS);
        this.d = iVar;
        this.f3237e = new AtomicBoolean();
        this.f3242l = true;
    }

    public static final String a(j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.f3243m ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((i1.n) jVar.f3235b.f206c).f());
        return sb.toString();
    }

    public final void b(m mVar) {
        byte[] bArr = j1.b.f2609a;
        if (this.h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.h = mVar;
        mVar.f3260p.add(new h(this, this.f3238f));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i;
        byte[] bArr = j1.b.f2609a;
        m mVar = this.h;
        if (mVar != null) {
            synchronized (mVar) {
                i = i();
            }
            if (this.h == null) {
                if (i != null) {
                    j1.b.c(i);
                }
            } else if (i != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.d.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            X0.d.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new j(this.f3234a, this.f3235b);
    }

    public final void d() {
        Socket socket;
        if (this.f3243m) {
            return;
        }
        this.f3243m = true;
        e eVar = this.f3244n;
        if (eVar != null) {
            eVar.f3221c.cancel();
        }
        m mVar = this.f3245o;
        if (mVar == null || (socket = mVar.f3250c) == null) {
            return;
        }
        j1.b.c(socket);
    }

    public final void e(boolean z2) {
        e eVar;
        synchronized (this) {
            if (!this.f3242l) {
                throw new IllegalStateException("released");
            }
        }
        if (z2 && (eVar = this.f3244n) != null) {
            eVar.f3221c.cancel();
            eVar.f3219a.g(eVar, true, true, null);
        }
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u f() {
        ArrayList arrayList = new ArrayList();
        Q0.n.x0(arrayList, this.f3234a.f2490c);
        arrayList.add(new n1.a(this.f3234a));
        arrayList.add(new n1.a(this.f3234a.f2494j));
        arrayList.add(new k1.b());
        arrayList.add(a.f3204a);
        Q0.n.x0(arrayList, this.f3234a.d);
        arrayList.add(new n1.b());
        H.e eVar = this.f3235b;
        q qVar = this.f3234a;
        boolean z2 = false;
        try {
            u b2 = new n1.f(this, arrayList, 0, null, eVar, qVar.f2507w, qVar.f2508x, qVar.f2509y).b(this.f3235b);
            if (this.f3243m) {
                j1.b.b(b2);
                throw new IOException("Canceled");
            }
            h(null);
            return b2;
        } catch (IOException e2) {
            try {
                IOException h = h(e2);
                X0.d.c(h, "null cannot be cast to non-null type kotlin.Throwable");
                throw h;
            } catch (Throwable th) {
                th = th;
                z2 = true;
                if (!z2) {
                    h(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z2) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:50:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001c), top: B:49:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:50:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001c), top: B:49:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException g(e eVar, boolean z2, boolean z3, IOException iOException) {
        boolean z4;
        boolean z5;
        boolean z6;
        X0.d.e(eVar, "exchange");
        if (!eVar.equals(this.f3244n)) {
            return iOException;
        }
        synchronized (this) {
            z4 = false;
            if (z2) {
                try {
                    if (!this.f3240j) {
                    }
                    if (z2) {
                        this.f3240j = false;
                    }
                    if (z3) {
                        this.f3241k = false;
                    }
                    z6 = this.f3240j;
                    boolean z7 = z6 && !this.f3241k;
                    if (!z6 && !this.f3241k) {
                        if (!this.f3242l) {
                            z4 = true;
                        }
                    }
                    z5 = z4;
                    z4 = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z3 || !this.f3241k) {
                z5 = false;
            }
            if (z2) {
            }
            if (z3) {
            }
            z6 = this.f3240j;
            if (z6) {
            }
            if (!z6) {
                if (!this.f3242l) {
                }
            }
            z5 = z4;
            z4 = z7;
        }
        if (z4) {
            this.f3244n = null;
            m mVar = this.h;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.f3257m++;
                }
            }
        }
        return z5 ? c(iOException) : iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f3242l) {
                this.f3242l = false;
                if (!this.f3240j) {
                    if (!this.f3241k) {
                        z2 = true;
                    }
                }
            }
        }
        return z2 ? c(iOException) : iOException;
    }

    public final Socket i() {
        m mVar = this.h;
        X0.d.b(mVar);
        byte[] bArr = j1.b.f2609a;
        ArrayList arrayList = mVar.f3260p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (X0.d.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.h = null;
        if (arrayList.isEmpty()) {
            mVar.f3261q = System.nanoTime();
            n nVar = this.f3236c;
            nVar.getClass();
            byte[] bArr2 = j1.b.f2609a;
            boolean z2 = mVar.f3254j;
            l1.c cVar = nVar.f3263b;
            if (z2) {
                mVar.f3254j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = nVar.d;
                concurrentLinkedQueue.remove(mVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = mVar.d;
                X0.d.b(socket);
                return socket;
            }
            cVar.c(nVar.f3264c, 0L);
        }
        return null;
    }
}
