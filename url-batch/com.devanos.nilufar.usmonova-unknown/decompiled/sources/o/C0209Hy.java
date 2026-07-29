package o;

/* renamed from: o.Hy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209Hy {
    public final C0027Ay a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f46o;
    public int p;
    public C0131Ey r;
    public long s;
    public final C1139h0 t;
    public int b = 5;
    public final C0157Fy q = new C0157Fy(this);

    public C0209Hy(C0027Ay c0027Ay) {
        long b;
        this.a = c0027Ay;
        b = AbstractC0868ct.b(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        this.s = b;
        this.t = new C1139h0(26, this);
    }

    public final ME a() {
        return (ME) this.a.u.d;
    }

    public final void b(int i) {
        int i2 = this.m;
        this.m = i;
        if ((i2 == 0) != (i == 0)) {
            C0027Ay l = this.a.l();
            C0209Hy c0209Hy = l != null ? l.v : null;
            if (c0209Hy != null) {
                if (i == 0) {
                    c0209Hy.b(c0209Hy.m - 1);
                } else {
                    c0209Hy.b(c0209Hy.m + 1);
                }
            }
        }
    }

    public final void c(int i) {
        int i2 = this.p;
        this.p = i;
        if ((i2 == 0) != (i == 0)) {
            C0027Ay l = this.a.l();
            C0209Hy c0209Hy = l != null ? l.v : null;
            if (c0209Hy != null) {
                if (i == 0) {
                    c0209Hy.c(c0209Hy.p - 1);
                } else {
                    c0209Hy.c(c0209Hy.p + 1);
                }
            }
        }
    }

    public final void d(boolean z) {
        if (this.l != z) {
            this.l = z;
            if (z && !this.k) {
                b(this.m + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                b(this.m - 1);
            }
        }
    }

    public final void e(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.l) {
                b(this.m + 1);
            } else {
                if (z || this.l) {
                    return;
                }
                b(this.m - 1);
            }
        }
    }

    public final void f(boolean z) {
        if (this.f46o != z) {
            this.f46o = z;
            if (z && !this.n) {
                c(this.p + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                c(this.p - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.f46o) {
                c(this.p + 1);
            } else {
                if (z || this.f46o) {
                    return;
                }
                c(this.p - 1);
            }
        }
    }

    public final void h() {
        this.q.B.a().g();
        C0131Ey c0131Ey = this.r;
        if (c0131Ey != null) {
            AbstractC1547nB f0 = c0131Ey.v.a().f0();
            AbstractC0048Bt.k(f0);
            f0.g();
        }
    }
}
