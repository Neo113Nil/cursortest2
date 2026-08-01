package p1;

/* loaded from: classes.dex */
public final class t implements v1.t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3483a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.f f3484b = new v1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3485c;
    public final /* synthetic */ w d;

    public t(w wVar, boolean z2) {
        this.d = wVar;
        this.f3483a = z2;
    }

    @Override // v1.t
    public final v1.x a() {
        return this.d.f3500l;
    }

    @Override // v1.t
    public final void c(v1.f fVar, long j2) {
        byte[] bArr = j1.b.f2606a;
        v1.f fVar2 = this.f3484b;
        fVar2.c(fVar, j2);
        while (fVar2.f4076b >= 16384) {
            e(false);
        }
    }

    @Override // v1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        w wVar = this.d;
        byte[] bArr = j1.b.f2606a;
        synchronized (wVar) {
            if (this.f3485c) {
                return;
            }
            synchronized (wVar) {
                z2 = wVar.f3501m == 0;
            }
            w wVar2 = this.d;
            if (!wVar2.f3498j.f3483a) {
                if (this.f3484b.f4076b > 0) {
                    while (this.f3484b.f4076b > 0) {
                        e(true);
                    }
                } else if (z2) {
                    wVar2.f3493b.j(wVar2.f3492a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.f3485c = true;
            }
            this.d.f3493b.flush();
            this.d.a();
        }
    }

    public final void e(boolean z2) {
        long min;
        boolean z3;
        w wVar = this.d;
        synchronized (wVar) {
            wVar.f3500l.h();
            while (wVar.f3495e >= wVar.f3496f && !this.f3483a && !this.f3485c) {
                try {
                    synchronized (wVar) {
                        int i = wVar.f3501m;
                        if (i != 0) {
                            break;
                        } else {
                            wVar.k();
                        }
                    }
                } finally {
                    wVar.f3500l.k();
                }
            }
            wVar.f3500l.k();
            wVar.b();
            min = Math.min(wVar.f3496f - wVar.f3495e, this.f3484b.f4076b);
            wVar.f3495e += min;
            z3 = z2 && min == this.f3484b.f4076b;
        }
        this.d.f3500l.h();
        try {
            w wVar2 = this.d;
            wVar2.f3493b.j(wVar2.f3492a, z3, this.f3484b, min);
        } finally {
            wVar = this.d;
        }
    }

    @Override // v1.t, java.io.Flushable
    public final void flush() {
        w wVar = this.d;
        byte[] bArr = j1.b.f2606a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f3484b.f4076b > 0) {
            e(false);
            this.d.f3493b.flush();
        }
    }
}
