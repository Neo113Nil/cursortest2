package m1;

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
    public final i1.p f3225a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f3226b;

    /* renamed from: c, reason: collision with root package name */
    public final n f3227c;
    public final i d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f3228e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3229f;

    /* renamed from: g, reason: collision with root package name */
    public f f3230g;
    public m h;
    public e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3231j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3232k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3233l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f3234m;

    /* renamed from: n, reason: collision with root package name */
    public volatile e f3235n;

    /* renamed from: o, reason: collision with root package name */
    public volatile m f3236o;

    public j(i1.p pVar, H.e eVar) {
        this.f3225a = pVar;
        this.f3226b = eVar;
        this.f3227c = (n) pVar.f2476b.f59b;
        pVar.f2478e.getClass();
        i iVar = new i(this);
        iVar.g(pVar.f2493v, TimeUnit.MILLISECONDS);
        this.d = iVar;
        this.f3228e = new AtomicBoolean();
        this.f3233l = true;
    }

    public static final String a(j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.f3234m ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((i1.m) jVar.f3226b.f213c).f());
        return sb.toString();
    }

    public final void b(m mVar) {
        byte[] bArr = j1.b.f2600a;
        if (this.h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.h = mVar;
        mVar.f3251p.add(new h(this, this.f3229f));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i;
        byte[] bArr = j1.b.f2600a;
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
            X0.e.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new j(this.f3225a, this.f3226b);
    }

    public final void d() {
        Socket socket;
        if (this.f3234m) {
            return;
        }
        this.f3234m = true;
        e eVar = this.f3235n;
        if (eVar != null) {
            eVar.f3212c.cancel();
        }
        m mVar = this.f3236o;
        if (mVar == null || (socket = mVar.f3241c) == null) {
            return;
        }
        j1.b.c(socket);
    }

    public final void e(boolean z2) {
        e eVar;
        synchronized (this) {
            if (!this.f3233l) {
                throw new IllegalStateException("released");
            }
        }
        if (z2 && (eVar = this.f3235n) != null) {
            eVar.f3212c.cancel();
            eVar.f3210a.g(eVar, true, true, null);
        }
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u f() {
        ArrayList arrayList = new ArrayList();
        Q0.j.w0(arrayList, this.f3225a.f2477c);
        arrayList.add(new n1.a(this.f3225a));
        arrayList.add(new n1.a(this.f3225a.f2481j));
        arrayList.add(new k1.b());
        arrayList.add(a.f3195a);
        Q0.j.w0(arrayList, this.f3225a.d);
        arrayList.add(new n1.b());
        H.e eVar = this.f3226b;
        i1.p pVar = this.f3225a;
        boolean z2 = false;
        try {
            u b2 = new n1.f(this, arrayList, 0, null, eVar, pVar.f2494w, pVar.f2495x, pVar.f2496y).b(this.f3226b);
            if (this.f3234m) {
                j1.b.b(b2);
                throw new IOException("Canceled");
            }
            h(null);
            return b2;
        } catch (IOException e2) {
            try {
                IOException h = h(e2);
                X0.e.c(h, "null cannot be cast to non-null type kotlin.Throwable");
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
        X0.e.e(eVar, "exchange");
        if (!eVar.equals(this.f3235n)) {
            return iOException;
        }
        synchronized (this) {
            z4 = false;
            if (z2) {
                try {
                    if (!this.f3231j) {
                    }
                    if (z2) {
                        this.f3231j = false;
                    }
                    if (z3) {
                        this.f3232k = false;
                    }
                    z6 = this.f3231j;
                    boolean z7 = z6 && !this.f3232k;
                    if (!z6 && !this.f3232k) {
                        if (!this.f3233l) {
                            z4 = true;
                        }
                    }
                    z5 = z4;
                    z4 = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z3 || !this.f3232k) {
                z5 = false;
            }
            if (z2) {
            }
            if (z3) {
            }
            z6 = this.f3231j;
            if (z6) {
            }
            if (!z6) {
                if (!this.f3233l) {
                }
            }
            z5 = z4;
            z4 = z7;
        }
        if (z4) {
            this.f3235n = null;
            m mVar = this.h;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.f3248m++;
                }
            }
        }
        return z5 ? c(iOException) : iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f3233l) {
                this.f3233l = false;
                if (!this.f3231j) {
                    if (!this.f3232k) {
                        z2 = true;
                    }
                }
            }
        }
        return z2 ? c(iOException) : iOException;
    }

    public final Socket i() {
        m mVar = this.h;
        X0.e.b(mVar);
        byte[] bArr = j1.b.f2600a;
        ArrayList arrayList = mVar.f3251p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (X0.e.a(((Reference) it.next()).get(), this)) {
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
            mVar.f3252q = System.nanoTime();
            n nVar = this.f3227c;
            nVar.getClass();
            byte[] bArr2 = j1.b.f2600a;
            boolean z2 = mVar.f3245j;
            l1.c cVar = nVar.f3254b;
            if (z2) {
                mVar.f3245j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = nVar.d;
                concurrentLinkedQueue.remove(mVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = mVar.d;
                X0.e.b(socket);
                return socket;
            }
            cVar.c(nVar.f3255c, 0L);
        }
        return null;
    }
}
