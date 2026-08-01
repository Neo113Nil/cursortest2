package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class tn {
    public final int a;
    public final mn b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque g;
    public boolean h;
    public final rn i;
    public final qn j;
    public final sn k;
    public final sn l;
    public int m;
    public IOException n;

    public tn(int i, mn mnVar, boolean z, boolean z2, nm nmVar) {
        mnVar.getClass();
        this.a = i;
        this.b = mnVar;
        this.f = mnVar.v.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.i = new rn(this, mnVar.u.a(), z2);
        this.j = new qn(this, z);
        this.k = new sn(this);
        this.l = new sn(this);
        if (nmVar == null) {
            if (f()) {
                return;
            }
            l8.u("remotely-initiated streams should have headers");
            throw null;
        }
        if (f()) {
            l8.u("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(nmVar);
    }

    public final void a() {
        boolean z;
        boolean g;
        byte[] bArr = z60.a;
        synchronized (this) {
            try {
                rn rnVar = this.i;
                if (!rnVar.g && rnVar.j) {
                    qn qnVar = this.j;
                    if (!qnVar.f) {
                        if (qnVar.h) {
                        }
                    }
                    z = true;
                    g = g();
                }
                z = false;
                g = g();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(9, null);
        } else {
            if (g) {
                return;
            }
            this.b.o(this.a);
        }
    }

    public final void b() {
        qn qnVar = this.j;
        if (qnVar.h) {
            l8.y("stream closed");
            return;
        }
        if (qnVar.f) {
            l8.y("stream finished");
            return;
        }
        int i = this.m;
        if (i != 0) {
            IOException iOException = this.n;
            if (iOException != null) {
                throw iOException;
            }
            if (i == 0) {
                throw null;
            }
            throw new l30(i);
        }
    }

    public final void c(int i, IOException iOException) {
        if (i == 0) {
            throw null;
        }
        if (d(i, iOException)) {
            mn mnVar = this.b;
            mnVar.getClass();
            mnVar.B.s(this.a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = z60.a;
        synchronized (this) {
            if (this.m != 0) {
                return false;
            }
            this.m = i;
            this.n = iOException;
            notifyAll();
            if (this.i.g) {
                if (this.j.f) {
                    return false;
                }
            }
            this.b.o(this.a);
            return true;
        }
    }

    public final void e(int i) {
        if (i == 0) {
            throw null;
        }
        if (d(i, null)) {
            this.b.s(this.a, i);
        }
    }

    public final boolean f() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final synchronized boolean g() {
        try {
            if (this.m != 0) {
                return false;
            }
            rn rnVar = this.i;
            if (!rnVar.g) {
                if (rnVar.j) {
                }
                return true;
            }
            qn qnVar = this.j;
            if (qnVar.f || qnVar.h) {
                if (this.h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0006, B:8:0x000e, B:10:0x001f, B:11:0x0023, B:19:0x0016), top: B:3:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(nm nmVar, boolean z) {
        boolean g;
        nmVar.getClass();
        byte[] bArr = z60.a;
        synchronized (this) {
            try {
                if (this.h && z) {
                    this.i.getClass();
                    if (z) {
                        this.i.g = true;
                    }
                    g = g();
                    notifyAll();
                }
                this.h = true;
                this.g.add(nmVar);
                if (z) {
                }
                g = g();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (g) {
            return;
        }
        this.b.o(this.a);
    }
}
