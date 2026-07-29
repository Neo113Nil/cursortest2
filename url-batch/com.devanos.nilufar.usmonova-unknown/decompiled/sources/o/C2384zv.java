package o;

/* renamed from: o.zv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2384zv extends AbstractC1654oq implements EC {
    public int i;
    public C2252xv j;
    public C2318yv k;
    public C2318yv l;
    public C2318yv m;
    public C2318yv n;

    public static C2384zv g() {
        C2384zv c2384zv = new C2384zv();
        c2384zv.j = C2252xv.n;
        C2318yv c2318yv = C2318yv.n;
        c2384zv.k = c2318yv;
        c2384zv.l = c2318yv;
        c2384zv.m = c2318yv;
        c2384zv.n = c2318yv;
        return c2384zv;
    }

    @Override // o.AbstractC1654oq
    public final E c() {
        C0024Av f = f();
        f.b();
        return f;
    }

    public final Object clone() {
        C2384zv g = g();
        g.h(f());
        return g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        C0024Av c0024Av = null;
        try {
            try {
                C0024Av.r.getClass();
                h(new C0024Av(c0523Ub, c1649ol));
                return this;
            } catch (C0204Ht e) {
                C0024Av c0024Av2 = (C0024Av) e.h;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    c0024Av = c0024Av2;
                    if (c0024Av != null) {
                        h(c0024Av);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c0024Av != null) {
            }
            throw th;
        }
    }

    @Override // o.AbstractC1654oq
    public final /* bridge */ /* synthetic */ AbstractC1654oq e(AbstractC2115vq abstractC2115vq) {
        h((C0024Av) abstractC2115vq);
        return this;
    }

    public final C0024Av f() {
        C0024Av c0024Av = new C0024Av(this);
        int i = this.i;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c0024Av.j = this.j;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c0024Av.k = this.k;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c0024Av.l = this.l;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c0024Av.m = this.m;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c0024Av.n = this.n;
        c0024Av.i = i2;
        return c0024Av;
    }

    public final void h(C0024Av c0024Av) {
        C2318yv c2318yv;
        C2318yv c2318yv2;
        C2318yv c2318yv3;
        C2318yv c2318yv4;
        C2252xv c2252xv;
        if (c0024Av == C0024Av.q) {
            return;
        }
        if ((c0024Av.i & 1) == 1) {
            C2252xv c2252xv2 = c0024Av.j;
            if ((this.i & 1) != 1 || (c2252xv = this.j) == C2252xv.n) {
                this.j = c2252xv2;
            } else {
                C2186wv c2186wv = new C2186wv(0);
                c2186wv.h(c2252xv);
                c2186wv.h(c2252xv2);
                this.j = c2186wv.f();
            }
            this.i |= 1;
        }
        if ((c0024Av.i & 2) == 2) {
            C2318yv c2318yv5 = c0024Av.k;
            if ((this.i & 2) != 2 || (c2318yv4 = this.k) == C2318yv.n) {
                this.k = c2318yv5;
            } else {
                C2186wv i = C2318yv.i(c2318yv4);
                i.i(c2318yv5);
                this.k = i.g();
            }
            this.i |= 2;
        }
        if ((c0024Av.i & 4) == 4) {
            C2318yv c2318yv6 = c0024Av.l;
            if ((this.i & 4) != 4 || (c2318yv3 = this.l) == C2318yv.n) {
                this.l = c2318yv6;
            } else {
                C2186wv i2 = C2318yv.i(c2318yv3);
                i2.i(c2318yv6);
                this.l = i2.g();
            }
            this.i |= 4;
        }
        if ((c0024Av.i & 8) == 8) {
            C2318yv c2318yv7 = c0024Av.m;
            if ((this.i & 8) != 8 || (c2318yv2 = this.m) == C2318yv.n) {
                this.m = c2318yv7;
            } else {
                C2186wv i3 = C2318yv.i(c2318yv2);
                i3.i(c2318yv7);
                this.m = i3.g();
            }
            this.i |= 8;
        }
        if ((c0024Av.i & 16) == 16) {
            C2318yv c2318yv8 = c0024Av.n;
            if ((this.i & 16) != 16 || (c2318yv = this.n) == C2318yv.n) {
                this.n = c2318yv8;
            } else {
                C2186wv i4 = C2318yv.i(c2318yv);
                i4.i(c2318yv8);
                this.n = i4.g();
            }
            this.i |= 16;
        }
        this.h = this.h.k(c0024Av.h);
    }
}
