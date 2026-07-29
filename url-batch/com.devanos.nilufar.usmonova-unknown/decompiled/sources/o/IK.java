package o;

/* loaded from: classes.dex */
public final class IK extends AbstractC1654oq implements EC {
    public int i;
    public JK j;
    public MK k;
    public int l;

    public static IK g() {
        IK ik = new IK();
        ik.j = JK.INV;
        ik.k = MK.A;
        return ik;
    }

    @Override // o.AbstractC1654oq
    public final E c() {
        KK f = f();
        if (f.b()) {
            return f;
        }
        throw new C0057Cc();
    }

    public final Object clone() {
        IK g = g();
        g.h(f());
        return g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        KK kk = null;
        try {
            try {
                KK.p.getClass();
                h(new KK(c0523Ub, c1649ol));
                return this;
            } catch (C0204Ht e) {
                KK kk2 = (KK) e.h;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    kk = kk2;
                    if (kk != null) {
                        h(kk);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (kk != null) {
            }
            throw th;
        }
    }

    @Override // o.AbstractC1654oq
    public final /* bridge */ /* synthetic */ AbstractC1654oq e(AbstractC2115vq abstractC2115vq) {
        h((KK) abstractC2115vq);
        return this;
    }

    public final KK f() {
        KK kk = new KK(this);
        int i = this.i;
        int i2 = (i & 1) != 1 ? 0 : 1;
        kk.j = this.j;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        kk.k = this.k;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        kk.l = this.l;
        kk.i = i2;
        return kk;
    }

    public final void h(KK kk) {
        MK mk;
        if (kk == KK.f57o) {
            return;
        }
        if ((kk.i & 1) == 1) {
            JK jk = kk.j;
            jk.getClass();
            this.i = 1 | this.i;
            this.j = jk;
        }
        if ((kk.i & 2) == 2) {
            MK mk2 = kk.k;
            if ((this.i & 2) != 2 || (mk = this.k) == MK.A) {
                this.k = mk2;
            } else {
                LK r = MK.r(mk);
                r.i(mk2);
                this.k = r.g();
            }
            this.i |= 2;
        }
        if ((kk.i & 4) == 4) {
            int i = kk.l;
            this.i = 4 | this.i;
            this.l = i;
        }
        this.h = this.h.k(kk.h);
    }
}
