package p1;

/* loaded from: classes.dex */
public final class t implements v1.t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3482a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.f f3483b = new v1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3484c;
    public final /* synthetic */ w d;

    public t(w wVar, boolean z2) {
        this.d = wVar;
        this.f3482a = z2;
    }

    @Override // v1.t
    public final v1.x a() {
        return this.d.f3499l;
    }

    @Override // v1.t
    public final void c(v1.f fVar, long j2) {
        byte[] bArr = j1.b.f2609a;
        v1.f fVar2 = this.f3483b;
        fVar2.c(fVar, j2);
        while (fVar2.f4052b >= 16384) {
            e(false);
        }
    }

    @Override // v1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        w wVar = this.d;
        byte[] bArr = j1.b.f2609a;
        synchronized (wVar) {
            if (this.f3484c) {
                return;
            }
            synchronized (wVar) {
                z2 = wVar.f3500m == 0;
            }
            w wVar2 = this.d;
            if (!wVar2.f3497j.f3482a) {
                if (this.f3483b.f4052b > 0) {
                    while (this.f3483b.f4052b > 0) {
                        e(true);
                    }
                } else if (z2) {
                    wVar2.f3492b.j(wVar2.f3491a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.f3484c = true;
            }
            this.d.f3492b.flush();
            this.d.a();
        }
    }

    public final void e(boolean z2) {
        long min;
        boolean z3;
        w wVar = this.d;
        synchronized (wVar) {
            wVar.f3499l.h();
            while (wVar.f3494e >= wVar.f3495f && !this.f3482a && !this.f3484c) {
                try {
                    synchronized (wVar) {
                        int i = wVar.f3500m;
                        if (i != 0) {
                            break;
                        } else {
                            wVar.k();
                        }
                    }
                } finally {
                    wVar.f3499l.k();
                }
            }
            wVar.f3499l.k();
            wVar.b();
            min = Math.min(wVar.f3495f - wVar.f3494e, this.f3483b.f4052b);
            wVar.f3494e += min;
            z3 = z2 && min == this.f3483b.f4052b;
        }
        this.d.f3499l.h();
        try {
            w wVar2 = this.d;
            wVar2.f3492b.j(wVar2.f3491a, z3, this.f3483b, min);
        } finally {
            wVar = this.d;
        }
    }

    @Override // v1.t, java.io.Flushable
    public final void flush() {
        w wVar = this.d;
        byte[] bArr = j1.b.f2609a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f3483b.f4052b > 0) {
            e(false);
            this.d.f3492b.flush();
        }
    }
}
