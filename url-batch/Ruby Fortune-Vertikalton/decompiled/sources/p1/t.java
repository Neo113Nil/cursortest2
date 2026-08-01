package p1;

/* loaded from: classes.dex */
public final class t implements v1.s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3477a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.f f3478b = new v1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3479c;
    public final /* synthetic */ w d;

    public t(w wVar, boolean z2) {
        this.d = wVar;
        this.f3477a = z2;
    }

    @Override // v1.s
    public final v1.w a() {
        return this.d.f3494l;
    }

    @Override // v1.s
    public final void c(v1.f fVar, long j2) {
        byte[] bArr = j1.b.f2600a;
        v1.f fVar2 = this.f3478b;
        fVar2.c(fVar, j2);
        while (fVar2.f4070b >= 16384) {
            e(false);
        }
    }

    @Override // v1.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        w wVar = this.d;
        byte[] bArr = j1.b.f2600a;
        synchronized (wVar) {
            if (this.f3479c) {
                return;
            }
            synchronized (wVar) {
                z2 = wVar.f3495m == 0;
            }
            w wVar2 = this.d;
            if (!wVar2.f3492j.f3477a) {
                if (this.f3478b.f4070b > 0) {
                    while (this.f3478b.f4070b > 0) {
                        e(true);
                    }
                } else if (z2) {
                    wVar2.f3487b.j(wVar2.f3486a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.f3479c = true;
            }
            this.d.f3487b.flush();
            this.d.a();
        }
    }

    public final void e(boolean z2) {
        long min;
        boolean z3;
        w wVar = this.d;
        synchronized (wVar) {
            wVar.f3494l.h();
            while (wVar.f3489e >= wVar.f3490f && !this.f3477a && !this.f3479c) {
                try {
                    synchronized (wVar) {
                        int i = wVar.f3495m;
                        if (i != 0) {
                            break;
                        } else {
                            wVar.k();
                        }
                    }
                } finally {
                    wVar.f3494l.k();
                }
            }
            wVar.f3494l.k();
            wVar.b();
            min = Math.min(wVar.f3490f - wVar.f3489e, this.f3478b.f4070b);
            wVar.f3489e += min;
            z3 = z2 && min == this.f3478b.f4070b;
        }
        this.d.f3494l.h();
        try {
            w wVar2 = this.d;
            wVar2.f3487b.j(wVar2.f3486a, z3, this.f3478b, min);
        } finally {
            wVar = this.d;
        }
    }

    @Override // v1.s, java.io.Flushable
    public final void flush() {
        w wVar = this.d;
        byte[] bArr = j1.b.f2600a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f3478b.f4070b > 0) {
            e(false);
            this.d.f3487b.flush();
        }
    }
}
