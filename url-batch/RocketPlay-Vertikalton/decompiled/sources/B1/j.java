package B1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import x1.s;

/* loaded from: classes.dex */
public final class j implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final x1.p f189a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f190b;

    /* renamed from: c, reason: collision with root package name */
    public final n f191c;
    public final i d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f192e;

    /* renamed from: f, reason: collision with root package name */
    public Object f193f;

    /* renamed from: g, reason: collision with root package name */
    public f f194g;
    public m h;
    public e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f195j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f196k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f197l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f198m;

    /* renamed from: n, reason: collision with root package name */
    public volatile e f199n;

    /* renamed from: o, reason: collision with root package name */
    public volatile m f200o;

    public j(x1.p pVar, H.e eVar) {
        this.f189a = pVar;
        this.f190b = eVar;
        this.f191c = (n) pVar.f4563b.f3473a;
        pVar.f4565e.getClass();
        i iVar = new i(this);
        iVar.g(0, TimeUnit.MILLISECONDS);
        this.d = iVar;
        this.f192e = new AtomicBoolean();
        this.f197l = true;
    }

    public static final String a(j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.f198m ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((x1.l) jVar.f190b.f547c).f());
        return sb.toString();
    }

    public final void b(m mVar) {
        byte[] bArr = y1.b.f4648a;
        if (this.h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.h = mVar;
        mVar.f215p.add(new h(this, this.f193f));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i;
        byte[] bArr = y1.b.f4648a;
        m mVar = this.h;
        if (mVar != null) {
            synchronized (mVar) {
                i = i();
            }
            if (this.h == null) {
                if (i != null) {
                    y1.b.c(i);
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
            i1.f.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new j(this.f189a, this.f190b);
    }

    public final void d() {
        Socket socket;
        if (this.f198m) {
            return;
        }
        this.f198m = true;
        e eVar = this.f199n;
        if (eVar != null) {
            eVar.f176c.cancel();
        }
        m mVar = this.f200o;
        if (mVar == null || (socket = mVar.f205c) == null) {
            return;
        }
        y1.b.c(socket);
    }

    public final void e(boolean z2) {
        e eVar;
        synchronized (this) {
            if (!this.f197l) {
                throw new IllegalStateException("released");
            }
        }
        if (z2 && (eVar = this.f199n) != null) {
            eVar.f176c.cancel();
            eVar.f174a.g(eVar, true, true, null);
        }
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s f() {
        ArrayList arrayList = new ArrayList();
        W0.p.u0(arrayList, this.f189a.f4564c);
        arrayList.add(new C1.a(this.f189a));
        arrayList.add(new C1.a(this.f189a.f4568j));
        arrayList.add(new z1.b());
        arrayList.add(a.f159a);
        W0.p.u0(arrayList, this.f189a.d);
        arrayList.add(new C1.b());
        H.e eVar = this.f190b;
        x1.p pVar = this.f189a;
        boolean z2 = false;
        try {
            s b2 = new C1.g(this, arrayList, 0, null, eVar, pVar.f4580v, pVar.f4581w, pVar.f4582x).b(this.f190b);
            if (this.f198m) {
                y1.b.b(b2);
                throw new IOException("Canceled");
            }
            h(null);
            return b2;
        } catch (IOException e2) {
            try {
                IOException h = h(e2);
                i1.f.c(h, "null cannot be cast to non-null type kotlin.Throwable");
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
        i1.f.e(eVar, "exchange");
        if (!eVar.equals(this.f199n)) {
            return iOException;
        }
        synchronized (this) {
            z4 = false;
            if (z2) {
                try {
                    if (!this.f195j) {
                    }
                    if (z2) {
                        this.f195j = false;
                    }
                    if (z3) {
                        this.f196k = false;
                    }
                    z6 = this.f195j;
                    boolean z7 = z6 && !this.f196k;
                    if (!z6 && !this.f196k) {
                        if (!this.f197l) {
                            z4 = true;
                        }
                    }
                    z5 = z4;
                    z4 = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z3 || !this.f196k) {
                z5 = false;
            }
            if (z2) {
            }
            if (z3) {
            }
            z6 = this.f195j;
            if (z6) {
            }
            if (!z6) {
                if (!this.f197l) {
                }
            }
            z5 = z4;
            z4 = z7;
        }
        if (z4) {
            this.f199n = null;
            m mVar = this.h;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.f212m++;
                }
            }
        }
        return z5 ? c(iOException) : iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f197l) {
                this.f197l = false;
                if (!this.f195j) {
                    if (!this.f196k) {
                        z2 = true;
                    }
                }
            }
        }
        return z2 ? c(iOException) : iOException;
    }

    public final Socket i() {
        m mVar = this.h;
        i1.f.b(mVar);
        byte[] bArr = y1.b.f4648a;
        ArrayList arrayList = mVar.f215p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (i1.f.a(((Reference) it.next()).get(), this)) {
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
            mVar.f216q = System.nanoTime();
            n nVar = this.f191c;
            nVar.getClass();
            byte[] bArr2 = y1.b.f4648a;
            boolean z2 = mVar.f209j;
            A1.c cVar = nVar.f218b;
            if (z2) {
                mVar.f209j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = nVar.d;
                concurrentLinkedQueue.remove(mVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = mVar.d;
                i1.f.b(socket);
                return socket;
            }
            cVar.c(nVar.f219c, 0L);
        }
        return null;
    }
}
