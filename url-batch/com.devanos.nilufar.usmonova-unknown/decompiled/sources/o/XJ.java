package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class XJ extends AbstractC1654oq implements EC {
    public int i;
    public YJ j;
    public long k;
    public float l;
    public double m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f128o;
    public int p;
    public C0833cK q;
    public List r;
    public int s;
    public int t;

    public static XJ g() {
        XJ xj = new XJ();
        xj.j = YJ.BYTE;
        xj.q = C0833cK.n;
        xj.r = Collections.EMPTY_LIST;
        return xj;
    }

    @Override // o.AbstractC1654oq
    public final E c() {
        ZJ f = f();
        if (f.b()) {
            return f;
        }
        throw new C0057Cc();
    }

    public final Object clone() {
        XJ g = g();
        g.h(f());
        return g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        ZJ zj = null;
        try {
            try {
                ZJ.x.getClass();
                h(new ZJ(c0523Ub, c1649ol));
                return this;
            } catch (C0204Ht e) {
                ZJ zj2 = (ZJ) e.h;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    zj = zj2;
                    if (zj != null) {
                        h(zj);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (zj != null) {
            }
            throw th;
        }
    }

    @Override // o.AbstractC1654oq
    public final /* bridge */ /* synthetic */ AbstractC1654oq e(AbstractC2115vq abstractC2115vq) {
        h((ZJ) abstractC2115vq);
        return this;
    }

    public final ZJ f() {
        ZJ zj = new ZJ(this);
        int i = this.i;
        int i2 = (i & 1) != 1 ? 0 : 1;
        zj.j = this.j;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        zj.k = this.k;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        zj.l = this.l;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        zj.m = this.m;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        zj.n = this.n;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        zj.f135o = this.f128o;
        if ((i & 64) == 64) {
            i2 |= 64;
        }
        zj.p = this.p;
        if ((i & 128) == 128) {
            i2 |= 128;
        }
        zj.q = this.q;
        if ((i & 256) == 256) {
            this.r = Collections.unmodifiableList(this.r);
            this.i &= -257;
        }
        zj.r = this.r;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        zj.s = this.s;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        zj.t = this.t;
        zj.i = i2;
        return zj;
    }

    public final void h(ZJ zj) {
        C0833cK c0833cK;
        if (zj == ZJ.w) {
            return;
        }
        if ((zj.i & 1) == 1) {
            YJ yj = zj.j;
            yj.getClass();
            this.i = 1 | this.i;
            this.j = yj;
        }
        int i = zj.i;
        if ((i & 2) == 2) {
            long j = zj.k;
            this.i |= 2;
            this.k = j;
        }
        if ((i & 4) == 4) {
            float f = zj.l;
            this.i = 4 | this.i;
            this.l = f;
        }
        if ((i & 8) == 8) {
            double d = zj.m;
            this.i |= 8;
            this.m = d;
        }
        if ((i & 16) == 16) {
            int i2 = zj.n;
            this.i = 16 | this.i;
            this.n = i2;
        }
        if ((i & 32) == 32) {
            int i3 = zj.f135o;
            this.i = 32 | this.i;
            this.f128o = i3;
        }
        if ((i & 64) == 64) {
            int i4 = zj.p;
            this.i = 64 | this.i;
            this.p = i4;
        }
        if ((i & 128) == 128) {
            C0833cK c0833cK2 = zj.q;
            if ((this.i & 128) != 128 || (c0833cK = this.q) == C0833cK.n) {
                this.q = c0833cK2;
            } else {
                C0768bK c0768bK = new C0768bK(0);
                c0768bK.k = Collections.EMPTY_LIST;
                c0768bK.k(c0833cK);
                c0768bK.k(c0833cK2);
                this.q = c0768bK.g();
            }
            this.i |= 128;
        }
        if (!zj.r.isEmpty()) {
            if (this.r.isEmpty()) {
                this.r = zj.r;
                this.i &= -257;
            } else {
                if ((this.i & 256) != 256) {
                    this.r = new ArrayList(this.r);
                    this.i |= 256;
                }
                this.r.addAll(zj.r);
            }
        }
        int i5 = zj.i;
        if ((i5 & 256) == 256) {
            int i6 = zj.s;
            this.i |= 512;
            this.s = i6;
        }
        if ((i5 & 512) == 512) {
            int i7 = zj.t;
            this.i |= 1024;
            this.t = i7;
        }
        this.h = this.h.k(zj.h);
    }
}
