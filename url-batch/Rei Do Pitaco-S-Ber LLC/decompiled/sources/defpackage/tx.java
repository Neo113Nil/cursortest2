package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class tx implements Cloneable {
    public final fv f;
    public final po g;
    public final xx h;
    public final sx i;
    public final AtomicBoolean j;
    public Object k;
    public gi l;
    public wx m;
    public ei n;
    public boolean o;
    public boolean p;
    public boolean q;
    public volatile boolean r;
    public volatile ei s;
    public volatile wx t;

    public tx(fv fvVar, po poVar) {
        this.f = fvVar;
        this.g = poVar;
        this.h = (xx) fvVar.g.g;
        fvVar.j.getClass();
        sx sxVar = new sx(this);
        sxVar.g(0L);
        this.i = sxVar;
        this.j = new AtomicBoolean();
        this.q = true;
    }

    public static final String a(tx txVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(txVar.r ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((xn) txVar.g.b).f());
        return sb.toString();
    }

    public final void b(wx wxVar) {
        byte[] bArr = z60.a;
        if (this.m != null) {
            l8.u("Check failed.");
        } else {
            this.m = wxVar;
            wxVar.p.add(new rx(this, this.k));
        }
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i;
        byte[] bArr = z60.a;
        wx wxVar = this.m;
        if (wxVar != null) {
            synchronized (wxVar) {
                i = i();
            }
            if (this.m == null) {
                if (i != null) {
                    z60.c(i);
                }
            } else if (i != null) {
                l8.u("Check failed.");
                return null;
            }
        }
        if (this.i.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            interruptedIOException.getClass();
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new tx(this.f, this.g);
    }

    public final void d() {
        Socket socket;
        if (this.r) {
            return;
        }
        this.r = true;
        ei eiVar = this.s;
        if (eiVar != null) {
            eiVar.c.cancel();
        }
        wx wxVar = this.t;
        if (wxVar == null || (socket = wxVar.c) == null) {
            return;
        }
        z60.c(socket);
    }

    public final void e(boolean z) {
        ei eiVar;
        synchronized (this) {
            if (!this.q) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (eiVar = this.s) != null) {
            eiVar.c.cancel();
            eiVar.a.g(eiVar, true, true, null);
        }
        this.n = null;
    }

    public final zz f() {
        ArrayList arrayList = new ArrayList();
        ab.Z(arrayList, this.f.h);
        arrayList.add(new k8(this.f));
        arrayList.add(new k8(this.f.o));
        arrayList.add(new t8(0));
        arrayList.add(t8.b);
        ab.Z(arrayList, this.f.i);
        arrayList.add(new t8(2));
        po poVar = this.g;
        fv fvVar = this.f;
        try {
            try {
                zz b = new yx(this, arrayList, 0, null, poVar, fvVar.A, fvVar.B, fvVar.C).b(poVar);
                if (this.r) {
                    z60.b(b);
                    throw new IOException("Canceled");
                }
                h(null);
                return b;
            } catch (IOException e) {
                IOException h = h(e);
                h.getClass();
                throw h;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                h(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:48:0x0011, B:10:0x0020, B:12:0x0024, B:13:0x0026, B:15:0x002a, B:19:0x0033, B:21:0x0037, B:7:0x001a), top: B:47:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:48:0x0011, B:10:0x0020, B:12:0x0024, B:13:0x0026, B:15:0x002a, B:19:0x0033, B:21:0x0037, B:7:0x001a), top: B:47:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException g(ei eiVar, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        boolean z5;
        eiVar.getClass();
        if (eiVar.equals(this.s)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (!this.o) {
                        }
                        if (z) {
                            this.o = false;
                        }
                        if (z2) {
                            this.p = false;
                        }
                        z5 = this.o;
                        boolean z6 = z5 && !this.p;
                        if (!z5 && !this.p) {
                            if (!this.q) {
                                z3 = true;
                            }
                        }
                        z4 = z3;
                        z3 = z6;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z2 || !this.p) {
                    z4 = false;
                }
                if (z) {
                }
                if (z2) {
                }
                z5 = this.o;
                if (z5) {
                }
                if (!z5) {
                    if (!this.q) {
                    }
                }
                z4 = z3;
                z3 = z6;
            }
            if (z3) {
                this.s = null;
                wx wxVar = this.m;
                if (wxVar != null) {
                    synchronized (wxVar) {
                        wxVar.m++;
                    }
                }
            }
            if (z4) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.q) {
                this.q = false;
                if (!this.o) {
                    if (!this.p) {
                        z = true;
                    }
                }
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket i() {
        wx wxVar = this.m;
        wxVar.getClass();
        byte[] bArr = z60.a;
        ArrayList arrayList = wxVar.p;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (oo.b(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            l8.u("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.m = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        wxVar.q = System.nanoTime();
        xx xxVar = this.h;
        ConcurrentLinkedQueue concurrentLinkedQueue = xxVar.d;
        l40 l40Var = xxVar.b;
        byte[] bArr2 = z60.a;
        if (!wxVar.j) {
            l40Var.c(xxVar.c, 0L);
            return null;
        }
        wxVar.j = true;
        concurrentLinkedQueue.remove(wxVar);
        if (concurrentLinkedQueue.isEmpty()) {
            l40Var.a();
        }
        Socket socket = wxVar.d;
        socket.getClass();
        return socket;
    }
}
