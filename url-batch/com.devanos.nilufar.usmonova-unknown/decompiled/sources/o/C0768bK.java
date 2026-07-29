package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.bK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0768bK extends AbstractC1654oq implements EC {
    public final /* synthetic */ int i;
    public int j;
    public Object k;
    public int l;

    public /* synthetic */ C0768bK(int i) {
        this.i = i;
    }

    public static C0768bK i() {
        C0768bK c0768bK = new C0768bK(1);
        c0768bK.k = Collections.EMPTY_LIST;
        c0768bK.l = -1;
        return c0768bK;
    }

    @Override // o.AbstractC1654oq
    public final E c() {
        switch (this.i) {
            case 0:
                C0833cK g = g();
                if (g.b()) {
                    return g;
                }
                throw new C0057Cc();
            case 1:
                SK h = h();
                if (h.b()) {
                    return h;
                }
                throw new C0057Cc();
            default:
                C0702aK f = f();
                if (f.b()) {
                    return f;
                }
                throw new C0057Cc();
        }
    }

    public final Object clone() {
        switch (this.i) {
            case 0:
                C0768bK c0768bK = new C0768bK(0);
                c0768bK.k = Collections.EMPTY_LIST;
                c0768bK.k(g());
                return c0768bK;
            case 1:
                C0768bK i = i();
                i.l(h());
                return i;
            default:
                C0768bK c0768bK2 = new C0768bK(2);
                c0768bK2.k = ZJ.w;
                c0768bK2.j(f());
                return c0768bK2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005c  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        switch (this.i) {
            case 0:
                C0833cK c0833cK = null;
                try {
                    try {
                        k((C0833cK) C0833cK.f146o.a(c0523Ub, c1649ol));
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (c0833cK != null) {
                            k(c0833cK);
                        }
                        throw th;
                    }
                } catch (C0204Ht e) {
                    C0833cK c0833cK2 = (C0833cK) e.h;
                    try {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        c0833cK = c0833cK2;
                        if (c0833cK != null) {
                        }
                        throw th;
                    }
                }
            case 1:
                SK sk = null;
                try {
                    try {
                        SK.f105o.getClass();
                        l(new SK(c0523Ub, c1649ol));
                        return this;
                    } catch (Throwable th3) {
                        th = th3;
                        if (sk != null) {
                            l(sk);
                        }
                        throw th;
                    }
                } catch (C0204Ht e2) {
                    SK sk2 = (SK) e2.h;
                    try {
                        throw e2;
                    } catch (Throwable th4) {
                        th = th4;
                        sk = sk2;
                        if (sk != null) {
                        }
                        throw th;
                    }
                }
            default:
                C0702aK c0702aK = null;
                try {
                    try {
                        C0702aK.f138o.getClass();
                        j(new C0702aK(c0523Ub, c1649ol));
                        return this;
                    } catch (Throwable th5) {
                        th = th5;
                        if (c0702aK != null) {
                            j(c0702aK);
                        }
                        throw th;
                    }
                } catch (C0204Ht e3) {
                    C0702aK c0702aK2 = (C0702aK) e3.h;
                    try {
                        throw e3;
                    } catch (Throwable th6) {
                        th = th6;
                        c0702aK = c0702aK2;
                        if (c0702aK != null) {
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
                k((C0833cK) abstractC2115vq);
                break;
            case 1:
                l((SK) abstractC2115vq);
                break;
            default:
                j((C0702aK) abstractC2115vq);
                break;
        }
        return this;
    }

    public C0702aK f() {
        C0702aK c0702aK = new C0702aK(this);
        int i = this.j;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c0702aK.j = this.l;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c0702aK.k = (ZJ) this.k;
        c0702aK.i = i2;
        return c0702aK;
    }

    public C0833cK g() {
        C0833cK c0833cK = new C0833cK(this);
        int i = this.j;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c0833cK.j = this.l;
        if ((i & 2) == 2) {
            this.k = Collections.unmodifiableList((List) this.k);
            this.j &= -3;
        }
        c0833cK.k = (List) this.k;
        c0833cK.i = i2;
        return c0833cK;
    }

    public SK h() {
        SK sk = new SK(this);
        int i = this.j;
        if ((i & 1) == 1) {
            this.k = Collections.unmodifiableList((List) this.k);
            this.j &= -2;
        }
        sk.j = (List) this.k;
        int i2 = (i & 2) != 2 ? 0 : 1;
        sk.k = this.l;
        sk.i = i2;
        return sk;
    }

    public void j(C0702aK c0702aK) {
        ZJ zj;
        if (c0702aK == C0702aK.n) {
            return;
        }
        int i = c0702aK.i;
        if ((i & 1) == 1) {
            int i2 = c0702aK.j;
            this.j = 1 | this.j;
            this.l = i2;
        }
        if ((i & 2) == 2) {
            ZJ zj2 = c0702aK.k;
            if ((this.j & 2) != 2 || (zj = (ZJ) this.k) == ZJ.w) {
                this.k = zj2;
            } else {
                XJ g = XJ.g();
                g.h(zj);
                g.h(zj2);
                this.k = g.f();
            }
            this.j |= 2;
        }
        this.h = this.h.k(c0702aK.h);
    }

    public void k(C0833cK c0833cK) {
        if (c0833cK == C0833cK.n) {
            return;
        }
        if ((c0833cK.i & 1) == 1) {
            int i = c0833cK.j;
            this.j = 1 | this.j;
            this.l = i;
        }
        if (!c0833cK.k.isEmpty()) {
            if (((List) this.k).isEmpty()) {
                this.k = c0833cK.k;
                this.j &= -3;
            } else {
                if ((this.j & 2) != 2) {
                    this.k = new ArrayList((List) this.k);
                    this.j |= 2;
                }
                ((List) this.k).addAll(c0833cK.k);
            }
        }
        this.h = this.h.k(c0833cK.h);
    }

    public void l(SK sk) {
        if (sk == SK.n) {
            return;
        }
        if (!sk.j.isEmpty()) {
            if (((List) this.k).isEmpty()) {
                this.k = sk.j;
                this.j &= -2;
            } else {
                if ((this.j & 1) != 1) {
                    this.k = new ArrayList((List) this.k);
                    this.j |= 1;
                }
                ((List) this.k).addAll(sk.j);
            }
        }
        if ((sk.i & 1) == 1) {
            int i = sk.k;
            this.j |= 2;
            this.l = i;
        }
        this.h = this.h.k(sk.h);
    }
}
