package o;

/* renamed from: o.wv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2186wv extends AbstractC1654oq implements EC {
    public final /* synthetic */ int i;
    public int j;
    public int k;
    public int l;

    public /* synthetic */ C2186wv(int i) {
        this.i = i;
    }

    @Override // o.AbstractC1654oq
    public final E c() {
        switch (this.i) {
            case 0:
                C2252xv f = f();
                f.b();
                return f;
            default:
                C2318yv g = g();
                g.b();
                return g;
        }
    }

    public final Object clone() {
        switch (this.i) {
            case 0:
                C2186wv c2186wv = new C2186wv(0);
                c2186wv.h(f());
                return c2186wv;
            default:
                C2186wv c2186wv2 = new C2186wv(1);
                c2186wv2.i(g());
                return c2186wv2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        switch (this.i) {
            case 0:
                C2252xv c2252xv = null;
                try {
                    try {
                        C2252xv.f244o.getClass();
                        h(new C2252xv(c0523Ub));
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (c2252xv != null) {
                            h(c2252xv);
                        }
                        throw th;
                    }
                } catch (C0204Ht e) {
                    C2252xv c2252xv2 = (C2252xv) e.h;
                    try {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        c2252xv = c2252xv2;
                        if (c2252xv != null) {
                        }
                        throw th;
                    }
                }
            default:
                C2318yv c2318yv = null;
                try {
                    try {
                        C2318yv.f250o.getClass();
                        i(new C2318yv(c0523Ub));
                        return this;
                    } catch (Throwable th3) {
                        th = th3;
                        if (c2318yv != null) {
                            i(c2318yv);
                        }
                        throw th;
                    }
                } catch (C0204Ht e2) {
                    C2318yv c2318yv2 = (C2318yv) e2.h;
                    try {
                        throw e2;
                    } catch (Throwable th4) {
                        th = th4;
                        c2318yv = c2318yv2;
                        if (c2318yv != null) {
                        }
                        throw th;
                    }
                }
        }
    }

    @Override // o.AbstractC1654oq
    public final /* bridge */ /* synthetic */ AbstractC1654oq e(AbstractC2115vq abstractC2115vq) {
        switch (this.i) {
            case 0:
                h((C2252xv) abstractC2115vq);
                break;
            default:
                i((C2318yv) abstractC2115vq);
                break;
        }
        return this;
    }

    public C2252xv f() {
        C2252xv c2252xv = new C2252xv(this);
        int i = this.j;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c2252xv.j = this.k;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c2252xv.k = this.l;
        c2252xv.i = i2;
        return c2252xv;
    }

    public C2318yv g() {
        C2318yv c2318yv = new C2318yv(this);
        int i = this.j;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c2318yv.j = this.k;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c2318yv.k = this.l;
        c2318yv.i = i2;
        return c2318yv;
    }

    public void h(C2252xv c2252xv) {
        if (c2252xv == C2252xv.n) {
            return;
        }
        int i = c2252xv.i;
        if ((i & 1) == 1) {
            int i2 = c2252xv.j;
            this.j = 1 | this.j;
            this.k = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c2252xv.k;
            this.j = 2 | this.j;
            this.l = i3;
        }
        this.h = this.h.k(c2252xv.h);
    }

    public void i(C2318yv c2318yv) {
        if (c2318yv == C2318yv.n) {
            return;
        }
        int i = c2318yv.i;
        if ((i & 1) == 1) {
            int i2 = c2318yv.j;
            this.j = 1 | this.j;
            this.k = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c2318yv.k;
            this.j = 2 | this.j;
            this.l = i3;
        }
        this.h = this.h.k(c2318yv.h);
    }
}
