package E1;

/* loaded from: classes.dex */
public final class v implements K1.t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f374a;

    /* renamed from: b, reason: collision with root package name */
    public final K1.f f375b = new K1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f376c;
    public final /* synthetic */ y d;

    public v(y yVar, boolean z2) {
        this.d = yVar;
        this.f374a = z2;
    }

    public final void a(boolean z2) {
        long min;
        boolean z3;
        y yVar = this.d;
        synchronized (yVar) {
            yVar.f391l.h();
            while (yVar.f386e >= yVar.f387f && !this.f374a && !this.f376c) {
                try {
                    synchronized (yVar) {
                        int i = yVar.f392m;
                        if (i != 0) {
                            break;
                        } else {
                            yVar.k();
                        }
                    }
                } finally {
                    yVar.f391l.k();
                }
            }
            yVar.f391l.k();
            yVar.b();
            min = Math.min(yVar.f387f - yVar.f386e, this.f375b.f746b);
            yVar.f386e += min;
            z3 = z2 && min == this.f375b.f746b;
        }
        this.d.f391l.h();
        try {
            y yVar2 = this.d;
            yVar2.f384b.D(yVar2.f383a, z3, this.f375b, min);
        } finally {
            yVar = this.d;
        }
    }

    @Override // K1.t
    public final K1.x b() {
        return this.d.f391l;
    }

    @Override // K1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        y yVar = this.d;
        byte[] bArr = y1.b.f4648a;
        synchronized (yVar) {
            if (this.f376c) {
                return;
            }
            synchronized (yVar) {
                z2 = yVar.f392m == 0;
            }
            y yVar2 = this.d;
            if (!yVar2.f389j.f374a) {
                if (this.f375b.f746b > 0) {
                    while (this.f375b.f746b > 0) {
                        a(true);
                    }
                } else if (z2) {
                    yVar2.f384b.D(yVar2.f383a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.f376c = true;
            }
            this.d.f384b.flush();
            this.d.a();
        }
    }

    @Override // K1.t, java.io.Flushable
    public final void flush() {
        y yVar = this.d;
        byte[] bArr = y1.b.f4648a;
        synchronized (yVar) {
            yVar.b();
        }
        while (this.f375b.f746b > 0) {
            a(false);
            this.d.f384b.flush();
        }
    }

    @Override // K1.t
    public final void u(K1.f fVar, long j2) {
        byte[] bArr = y1.b.f4648a;
        K1.f fVar2 = this.f375b;
        fVar2.u(fVar, j2);
        while (fVar2.f746b >= 16384) {
            a(false);
        }
    }
}
