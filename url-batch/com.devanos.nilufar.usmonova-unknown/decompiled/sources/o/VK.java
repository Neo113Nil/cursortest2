package o;

/* loaded from: classes.dex */
public final class VK extends AbstractC1654oq implements EC {
    public int i;
    public int j;
    public int k;
    public WK l;
    public int m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public XK f119o;

    public static VK g() {
        VK vk = new VK();
        vk.l = WK.ERROR;
        vk.f119o = XK.LANGUAGE_VERSION;
        return vk;
    }

    @Override // o.AbstractC1654oq
    public final E c() {
        YK f = f();
        f.b();
        return f;
    }

    public final Object clone() {
        VK g = g();
        g.h(f());
        return g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        YK yk = null;
        try {
            try {
                YK.s.getClass();
                h(new YK(c0523Ub));
                return this;
            } catch (C0204Ht e) {
                YK yk2 = (YK) e.h;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    yk = yk2;
                    if (yk != null) {
                        h(yk);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (yk != null) {
            }
            throw th;
        }
    }

    @Override // o.AbstractC1654oq
    public final /* bridge */ /* synthetic */ AbstractC1654oq e(AbstractC2115vq abstractC2115vq) {
        h((YK) abstractC2115vq);
        return this;
    }

    public final YK f() {
        YK yk = new YK(this);
        int i = this.i;
        int i2 = (i & 1) != 1 ? 0 : 1;
        yk.j = this.j;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        yk.k = this.k;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        yk.l = this.l;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        yk.m = this.m;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        yk.n = this.n;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        yk.f133o = this.f119o;
        yk.i = i2;
        return yk;
    }

    public final void h(YK yk) {
        if (yk == YK.r) {
            return;
        }
        int i = yk.i;
        if ((i & 1) == 1) {
            int i2 = yk.j;
            this.i = 1 | this.i;
            this.j = i2;
        }
        if ((i & 2) == 2) {
            int i3 = yk.k;
            this.i = 2 | this.i;
            this.k = i3;
        }
        if ((i & 4) == 4) {
            WK wk = yk.l;
            wk.getClass();
            this.i = 4 | this.i;
            this.l = wk;
        }
        int i4 = yk.i;
        if ((i4 & 8) == 8) {
            int i5 = yk.m;
            this.i = 8 | this.i;
            this.m = i5;
        }
        if ((i4 & 16) == 16) {
            int i6 = yk.n;
            this.i = 16 | this.i;
            this.n = i6;
        }
        if ((i4 & 32) == 32) {
            XK xk = yk.f133o;
            xk.getClass();
            this.i = 32 | this.i;
            this.f119o = xk;
        }
        this.h = this.h.k(yk.h);
    }
}
