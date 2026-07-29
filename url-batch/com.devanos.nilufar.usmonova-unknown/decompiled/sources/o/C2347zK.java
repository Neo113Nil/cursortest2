package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.zK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2347zK extends AbstractC1851rq {
    public int k;
    public HK l;
    public GK m;
    public C2281yK n;

    /* renamed from: o, reason: collision with root package name */
    public List f254o;

    public static C2347zK h() {
        C2347zK c2347zK = new C2347zK();
        c2347zK.l = HK.l;
        c2347zK.m = GK.l;
        c2347zK.n = C2281yK.r;
        c2347zK.f254o = Collections.EMPTY_LIST;
        return c2347zK;
    }

    @Override // o.AbstractC1654oq
    public final E c() {
        AK g = g();
        if (g.b()) {
            return g;
        }
        throw new C0057Cc();
    }

    public final Object clone() {
        C2347zK h = h();
        h.i(g());
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        AK ak = null;
        try {
            try {
                AK.r.getClass();
                i(new AK(c0523Ub, c1649ol));
                return this;
            } catch (C0204Ht e) {
                AK ak2 = (AK) e.h;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    ak = ak2;
                    if (ak != null) {
                        i(ak);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (ak != null) {
            }
            throw th;
        }
    }

    @Override // o.AbstractC1654oq
    public final /* bridge */ /* synthetic */ AbstractC1654oq e(AbstractC2115vq abstractC2115vq) {
        i((AK) abstractC2115vq);
        return this;
    }

    public final AK g() {
        AK ak = new AK(this);
        int i = this.k;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ak.k = this.l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ak.l = this.m;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ak.m = this.n;
        if ((i & 8) == 8) {
            this.f254o = Collections.unmodifiableList(this.f254o);
            this.k &= -9;
        }
        ak.n = this.f254o;
        ak.j = i2;
        return ak;
    }

    public final void i(AK ak) {
        C2281yK c2281yK;
        GK gk;
        HK hk;
        if (ak == AK.q) {
            return;
        }
        if ((ak.j & 1) == 1) {
            HK hk2 = ak.k;
            if ((this.k & 1) != 1 || (hk = this.l) == HK.l) {
                this.l = hk2;
            } else {
                C1228iK c1228iK = new C1228iK(3);
                c1228iK.k = C1663oz.i;
                c1228iK.l(hk);
                c1228iK.l(hk2);
                this.l = c1228iK.h();
            }
            this.k |= 1;
        }
        if ((ak.j & 2) == 2) {
            GK gk2 = ak.l;
            if ((this.k & 2) != 2 || (gk = this.m) == GK.l) {
                this.m = gk2;
            } else {
                C1228iK c1228iK2 = new C1228iK(1);
                c1228iK2.k = Collections.EMPTY_LIST;
                c1228iK2.k(gk);
                c1228iK2.k(gk2);
                this.m = c1228iK2.g();
            }
            this.k |= 2;
        }
        if ((ak.j & 4) == 4) {
            C2281yK c2281yK2 = ak.m;
            if ((this.k & 4) != 4 || (c2281yK = this.n) == C2281yK.r) {
                this.n = c2281yK2;
            } else {
                C2215xK h = C2215xK.h();
                h.i(c2281yK);
                h.i(c2281yK2);
                this.n = h.g();
            }
            this.k |= 4;
        }
        if (!ak.n.isEmpty()) {
            if (this.f254o.isEmpty()) {
                this.f254o = ak.n;
                this.k &= -9;
            } else {
                if ((this.k & 8) != 8) {
                    this.f254o = new ArrayList(this.f254o);
                    this.k |= 8;
                }
                this.f254o.addAll(ak.n);
            }
        }
        f(ak);
        this.h = this.h.k(ak.i);
    }
}
