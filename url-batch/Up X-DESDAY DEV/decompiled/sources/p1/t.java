package p1;

/* loaded from: classes.dex */
public final class t implements v1.s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3461a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.f f3462b = new v1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3463c;
    public final /* synthetic */ w d;

    public t(w wVar, boolean z2) {
        this.d = wVar;
        this.f3461a = z2;
    }

    @Override // v1.s
    public final v1.w a() {
        return this.d.f3478l;
    }

    @Override // v1.s
    public final void c(v1.f fVar, long j2) {
        byte[] bArr = j1.b.f2584a;
        v1.f fVar2 = this.f3462b;
        fVar2.c(fVar, j2);
        while (fVar2.f4054b >= 16384) {
            e(false);
        }
    }

    @Override // v1.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        w wVar = this.d;
        byte[] bArr = j1.b.f2584a;
        synchronized (wVar) {
            if (this.f3463c) {
                return;
            }
            synchronized (wVar) {
                z2 = wVar.f3479m == 0;
            }
            w wVar2 = this.d;
            if (!wVar2.f3476j.f3461a) {
                if (this.f3462b.f4054b > 0) {
                    while (this.f3462b.f4054b > 0) {
                        e(true);
                    }
                } else if (z2) {
                    wVar2.f3471b.j(wVar2.f3470a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.f3463c = true;
            }
            this.d.f3471b.flush();
            this.d.a();
        }
    }

    public final void e(boolean z2) {
        long min;
        boolean z3;
        w wVar = this.d;
        synchronized (wVar) {
            wVar.f3478l.h();
            while (wVar.f3473e >= wVar.f3474f && !this.f3461a && !this.f3463c) {
                try {
                    synchronized (wVar) {
                        int i = wVar.f3479m;
                        if (i != 0) {
                            break;
                        } else {
                            wVar.k();
                        }
                    }
                } finally {
                    wVar.f3478l.k();
                }
            }
            wVar.f3478l.k();
            wVar.b();
            min = Math.min(wVar.f3474f - wVar.f3473e, this.f3462b.f4054b);
            wVar.f3473e += min;
            z3 = z2 && min == this.f3462b.f4054b;
        }
        this.d.f3478l.h();
        try {
            w wVar2 = this.d;
            wVar2.f3471b.j(wVar2.f3470a, z3, this.f3462b, min);
        } finally {
            wVar = this.d;
        }
    }

    @Override // v1.s, java.io.Flushable
    public final void flush() {
        w wVar = this.d;
        byte[] bArr = j1.b.f2584a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f3462b.f4054b > 0) {
            e(false);
            this.d.f3471b.flush();
        }
    }
}
