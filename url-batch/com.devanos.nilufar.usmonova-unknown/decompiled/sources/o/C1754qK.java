package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.qK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1754qK extends AbstractC1654oq implements EC {
    public int i;
    public int j;
    public int k;
    public EnumC1819rK l;
    public MK m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public List f213o;
    public List p;

    public static C1754qK g() {
        C1754qK c1754qK = new C1754qK();
        c1754qK.l = EnumC1819rK.TRUE;
        c1754qK.m = MK.A;
        List list = Collections.EMPTY_LIST;
        c1754qK.f213o = list;
        c1754qK.p = list;
        return c1754qK;
    }

    @Override // o.AbstractC1654oq
    public final E c() {
        C1885sK f = f();
        if (f.b()) {
            return f;
        }
        throw new C0057Cc();
    }

    public final Object clone() {
        C1754qK g = g();
        g.h(f());
        return g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        C1885sK c1885sK = null;
        try {
            try {
                C1885sK.t.getClass();
                h(new C1885sK(c0523Ub, c1649ol));
                return this;
            } catch (C0204Ht e) {
                C1885sK c1885sK2 = (C1885sK) e.h;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    c1885sK = c1885sK2;
                    if (c1885sK != null) {
                        h(c1885sK);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c1885sK != null) {
            }
            throw th;
        }
    }

    @Override // o.AbstractC1654oq
    public final /* bridge */ /* synthetic */ AbstractC1654oq e(AbstractC2115vq abstractC2115vq) {
        h((C1885sK) abstractC2115vq);
        return this;
    }

    public final C1885sK f() {
        C1885sK c1885sK = new C1885sK(this);
        int i = this.i;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c1885sK.j = this.j;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c1885sK.k = this.k;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c1885sK.l = this.l;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c1885sK.m = this.m;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c1885sK.n = this.n;
        if ((i & 32) == 32) {
            this.f213o = Collections.unmodifiableList(this.f213o);
            this.i &= -33;
        }
        c1885sK.f219o = this.f213o;
        if ((this.i & 64) == 64) {
            this.p = Collections.unmodifiableList(this.p);
            this.i &= -65;
        }
        c1885sK.p = this.p;
        c1885sK.i = i2;
        return c1885sK;
    }

    public final void h(C1885sK c1885sK) {
        MK mk;
        if (c1885sK == C1885sK.s) {
            return;
        }
        int i = c1885sK.i;
        if ((i & 1) == 1) {
            int i2 = c1885sK.j;
            this.i = 1 | this.i;
            this.j = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c1885sK.k;
            this.i = 2 | this.i;
            this.k = i3;
        }
        if ((i & 4) == 4) {
            EnumC1819rK enumC1819rK = c1885sK.l;
            enumC1819rK.getClass();
            this.i = 4 | this.i;
            this.l = enumC1819rK;
        }
        if ((c1885sK.i & 8) == 8) {
            MK mk2 = c1885sK.m;
            if ((this.i & 8) != 8 || (mk = this.m) == MK.A) {
                this.m = mk2;
            } else {
                LK r = MK.r(mk);
                r.i(mk2);
                this.m = r.g();
            }
            this.i |= 8;
        }
        if ((c1885sK.i & 16) == 16) {
            int i4 = c1885sK.n;
            this.i = 16 | this.i;
            this.n = i4;
        }
        if (!c1885sK.f219o.isEmpty()) {
            if (this.f213o.isEmpty()) {
                this.f213o = c1885sK.f219o;
                this.i &= -33;
            } else {
                if ((this.i & 32) != 32) {
                    this.f213o = new ArrayList(this.f213o);
                    this.i |= 32;
                }
                this.f213o.addAll(c1885sK.f219o);
            }
        }
        if (!c1885sK.p.isEmpty()) {
            if (this.p.isEmpty()) {
                this.p = c1885sK.p;
                this.i &= -65;
            } else {
                if ((this.i & 64) != 64) {
                    this.p = new ArrayList(this.p);
                    this.i |= 64;
                }
                this.p.addAll(c1885sK.p);
            }
        }
        this.h = this.h.k(c1885sK.h);
    }
}
