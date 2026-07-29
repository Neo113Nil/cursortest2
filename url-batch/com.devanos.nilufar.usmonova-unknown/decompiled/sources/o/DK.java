package o;

/* loaded from: classes.dex */
public final class DK extends AbstractC1654oq implements EC {
    public int i;
    public int j;
    public int k;
    public EK l;

    public static DK g() {
        DK dk = new DK();
        dk.j = -1;
        dk.l = EK.PACKAGE;
        return dk;
    }

    @Override // o.AbstractC1654oq
    public final E c() {
        FK f = f();
        if (f.b()) {
            return f;
        }
        throw new C0057Cc();
    }

    public final Object clone() {
        DK g = g();
        g.h(f());
        return g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        FK fk = null;
        try {
            try {
                FK.p.getClass();
                h(new FK(c0523Ub));
                return this;
            } catch (C0204Ht e) {
                FK fk2 = (FK) e.h;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    fk = fk2;
                    if (fk != null) {
                        h(fk);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (fk != null) {
            }
            throw th;
        }
    }

    @Override // o.AbstractC1654oq
    public final /* bridge */ /* synthetic */ AbstractC1654oq e(AbstractC2115vq abstractC2115vq) {
        h((FK) abstractC2115vq);
        return this;
    }

    public final FK f() {
        FK fk = new FK(this);
        int i = this.i;
        int i2 = (i & 1) != 1 ? 0 : 1;
        fk.j = this.j;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        fk.k = this.k;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        fk.l = this.l;
        fk.i = i2;
        return fk;
    }

    public final void h(FK fk) {
        if (fk == FK.f40o) {
            return;
        }
        int i = fk.i;
        if ((i & 1) == 1) {
            int i2 = fk.j;
            this.i = 1 | this.i;
            this.j = i2;
        }
        if ((i & 2) == 2) {
            int i3 = fk.k;
            this.i = 2 | this.i;
            this.k = i3;
        }
        if ((i & 4) == 4) {
            EK ek = fk.l;
            ek.getClass();
            this.i = 4 | this.i;
            this.l = ek;
        }
        this.h = this.h.k(fk.h);
    }
}
