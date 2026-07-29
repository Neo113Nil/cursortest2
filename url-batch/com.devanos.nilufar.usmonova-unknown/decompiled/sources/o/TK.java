package o;

/* loaded from: classes.dex */
public final class TK extends AbstractC1851rq {
    public int k;
    public int l;
    public int m;
    public MK n;

    /* renamed from: o, reason: collision with root package name */
    public int f110o;
    public MK p;
    public int q;

    @Override // o.AbstractC1654oq
    public final E c() {
        UK g = g();
        if (g.b()) {
            return g;
        }
        throw new C0057Cc();
    }

    public final Object clone() {
        TK tk = new TK();
        MK mk = MK.A;
        tk.n = mk;
        tk.p = mk;
        tk.h(g());
        return tk;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        UK uk = null;
        try {
            try {
                UK.t.getClass();
                h(new UK(c0523Ub, c1649ol));
                return this;
            } catch (C0204Ht e) {
                UK uk2 = (UK) e.h;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    uk = uk2;
                    if (uk != null) {
                        h(uk);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (uk != null) {
            }
            throw th;
        }
    }

    @Override // o.AbstractC1654oq
    public final /* bridge */ /* synthetic */ AbstractC1654oq e(AbstractC2115vq abstractC2115vq) {
        h((UK) abstractC2115vq);
        return this;
    }

    public final UK g() {
        UK uk = new UK(this);
        int i = this.k;
        int i2 = (i & 1) != 1 ? 0 : 1;
        uk.k = this.l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        uk.l = this.m;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        uk.m = this.n;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        uk.n = this.f110o;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        uk.f115o = this.p;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        uk.p = this.q;
        uk.j = i2;
        return uk;
    }

    public final void h(UK uk) {
        MK mk;
        MK mk2;
        if (uk == UK.s) {
            return;
        }
        int i = uk.j;
        if ((i & 1) == 1) {
            int i2 = uk.k;
            this.k = 1 | this.k;
            this.l = i2;
        }
        if ((i & 2) == 2) {
            int i3 = uk.l;
            this.k = 2 | this.k;
            this.m = i3;
        }
        if ((i & 4) == 4) {
            MK mk3 = uk.m;
            if ((this.k & 4) != 4 || (mk2 = this.n) == MK.A) {
                this.n = mk3;
            } else {
                LK r = MK.r(mk2);
                r.i(mk3);
                this.n = r.g();
            }
            this.k |= 4;
        }
        int i4 = uk.j;
        if ((i4 & 8) == 8) {
            int i5 = uk.n;
            this.k = 8 | this.k;
            this.f110o = i5;
        }
        if ((i4 & 16) == 16) {
            MK mk4 = uk.f115o;
            if ((this.k & 16) != 16 || (mk = this.p) == MK.A) {
                this.p = mk4;
            } else {
                LK r2 = MK.r(mk);
                r2.i(mk4);
                this.p = r2.g();
            }
            this.k |= 16;
        }
        if ((uk.j & 32) == 32) {
            int i6 = uk.p;
            this.k = 32 | this.k;
            this.q = i6;
        }
        f(uk);
        this.h = this.h.k(uk.i);
    }
}
