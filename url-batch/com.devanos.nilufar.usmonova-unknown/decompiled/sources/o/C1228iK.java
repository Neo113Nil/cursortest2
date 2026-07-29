package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.iK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1228iK extends AbstractC1654oq implements EC {
    public final /* synthetic */ int i;
    public int j;
    public List k;

    public /* synthetic */ C1228iK(int i) {
        this.i = i;
    }

    @Override // o.AbstractC1654oq
    public final E c() {
        switch (this.i) {
            case 0:
                C1292jK f = f();
                if (f.b()) {
                    return f;
                }
                throw new C0057Cc();
            case 1:
                GK g = g();
                if (g.b()) {
                    return g;
                }
                throw new C0057Cc();
            case 2:
                ZK i = i();
                i.b();
                return i;
            default:
                HK h = h();
                h.b();
                return h;
        }
    }

    public final Object clone() {
        switch (this.i) {
            case 0:
                C1228iK c1228iK = new C1228iK(0);
                c1228iK.k = Collections.EMPTY_LIST;
                c1228iK.j(f());
                return c1228iK;
            case 1:
                C1228iK c1228iK2 = new C1228iK(1);
                c1228iK2.k = Collections.EMPTY_LIST;
                c1228iK2.k(g());
                return c1228iK2;
            case 2:
                C1228iK c1228iK3 = new C1228iK(2);
                c1228iK3.k = Collections.EMPTY_LIST;
                c1228iK3.m(i());
                return c1228iK3;
            default:
                C1228iK c1228iK4 = new C1228iK(3);
                c1228iK4.k = C1663oz.i;
                c1228iK4.l(h());
                return c1228iK4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007d  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        switch (this.i) {
            case 0:
                C1292jK c1292jK = null;
                try {
                    try {
                        C1292jK.m.getClass();
                        j(new C1292jK(c0523Ub, c1649ol));
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (c1292jK != null) {
                            j(c1292jK);
                        }
                        throw th;
                    }
                } catch (C0204Ht e) {
                    C1292jK c1292jK2 = (C1292jK) e.h;
                    try {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        c1292jK = c1292jK2;
                        if (c1292jK != null) {
                        }
                        throw th;
                    }
                }
            case 1:
                GK gk = null;
                try {
                    try {
                        GK.m.getClass();
                        k(new GK(c0523Ub, c1649ol));
                        return this;
                    } catch (Throwable th3) {
                        th = th3;
                        if (gk != null) {
                            k(gk);
                        }
                        throw th;
                    }
                } catch (C0204Ht e2) {
                    GK gk2 = (GK) e2.h;
                    try {
                        throw e2;
                    } catch (Throwable th4) {
                        th = th4;
                        gk = gk2;
                        if (gk != null) {
                        }
                        throw th;
                    }
                }
            case 2:
                ZK zk = null;
                try {
                    try {
                        ZK.m.getClass();
                        m(new ZK(c0523Ub, c1649ol));
                        return this;
                    } catch (Throwable th5) {
                        th = th5;
                        if (zk != null) {
                            m(zk);
                        }
                        throw th;
                    }
                } catch (C0204Ht e3) {
                    ZK zk2 = (ZK) e3.h;
                    try {
                        throw e3;
                    } catch (Throwable th6) {
                        th = th6;
                        zk = zk2;
                        if (zk != null) {
                        }
                        throw th;
                    }
                }
            default:
                HK hk = null;
                try {
                    try {
                        HK.m.getClass();
                        l(new HK(c0523Ub));
                        return this;
                    } catch (Throwable th7) {
                        th = th7;
                        if (hk != null) {
                            l(hk);
                        }
                        throw th;
                    }
                } catch (C0204Ht e4) {
                    HK hk2 = (HK) e4.h;
                    try {
                        throw e4;
                    } catch (Throwable th8) {
                        th = th8;
                        hk = hk2;
                        if (hk != null) {
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
                j((C1292jK) abstractC2115vq);
                break;
            case 1:
                k((GK) abstractC2115vq);
                break;
            case 2:
                m((ZK) abstractC2115vq);
                break;
            default:
                l((HK) abstractC2115vq);
                break;
        }
        return this;
    }

    public C1292jK f() {
        C1292jK c1292jK = new C1292jK(this);
        if ((this.j & 1) == 1) {
            this.k = Collections.unmodifiableList(this.k);
            this.j &= -2;
        }
        c1292jK.i = this.k;
        return c1292jK;
    }

    public GK g() {
        GK gk = new GK(this);
        if ((this.j & 1) == 1) {
            this.k = Collections.unmodifiableList(this.k);
            this.j &= -2;
        }
        gk.i = this.k;
        return gk;
    }

    public HK h() {
        HK hk = new HK(this);
        if ((this.j & 1) == 1) {
            this.k = ((InterfaceC1795qz) this.k).a();
            this.j &= -2;
        }
        hk.i = (InterfaceC1795qz) this.k;
        return hk;
    }

    public ZK i() {
        ZK zk = new ZK(this);
        if ((this.j & 1) == 1) {
            this.k = Collections.unmodifiableList(this.k);
            this.j &= -2;
        }
        zk.i = this.k;
        return zk;
    }

    public void j(C1292jK c1292jK) {
        if (c1292jK == C1292jK.l) {
            return;
        }
        if (!c1292jK.i.isEmpty()) {
            if (this.k.isEmpty()) {
                this.k = c1292jK.i;
                this.j &= -2;
            } else {
                if ((this.j & 1) != 1) {
                    this.k = new ArrayList(this.k);
                    this.j |= 1;
                }
                this.k.addAll(c1292jK.i);
            }
        }
        this.h = this.h.k(c1292jK.h);
    }

    public void k(GK gk) {
        if (gk == GK.l) {
            return;
        }
        if (!gk.i.isEmpty()) {
            if (this.k.isEmpty()) {
                this.k = gk.i;
                this.j &= -2;
            } else {
                if ((this.j & 1) != 1) {
                    this.k = new ArrayList(this.k);
                    this.j |= 1;
                }
                this.k.addAll(gk.i);
            }
        }
        this.h = this.h.k(gk.h);
    }

    public void l(HK hk) {
        if (hk == HK.l) {
            return;
        }
        if (!hk.i.isEmpty()) {
            if (((InterfaceC1795qz) this.k).isEmpty()) {
                this.k = hk.i;
                this.j &= -2;
            } else {
                if ((this.j & 1) != 1) {
                    this.k = new C1663oz((InterfaceC1795qz) this.k);
                    this.j |= 1;
                }
                ((InterfaceC1795qz) this.k).addAll(hk.i);
            }
        }
        this.h = this.h.k(hk.h);
    }

    public void m(ZK zk) {
        if (zk == ZK.l) {
            return;
        }
        if (!zk.i.isEmpty()) {
            if (this.k.isEmpty()) {
                this.k = zk.i;
                this.j &= -2;
            } else {
                if ((this.j & 1) != 1) {
                    this.k = new ArrayList(this.k);
                    this.j |= 1;
                }
                this.k.addAll(zk.i);
            }
        }
        this.h = this.h.k(zk.h);
    }
}
