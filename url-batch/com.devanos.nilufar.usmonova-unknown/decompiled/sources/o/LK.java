package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class LK extends AbstractC1851rq {
    public int k;
    public List l;
    public boolean m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public MK f62o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public MK u;
    public int v;
    public MK w;
    public int x;
    public int y;

    public static LK h() {
        LK lk = new LK();
        lk.l = Collections.EMPTY_LIST;
        MK mk = MK.A;
        lk.f62o = mk;
        lk.u = mk;
        lk.w = mk;
        return lk;
    }

    @Override // o.AbstractC1654oq
    public final E c() {
        MK g = g();
        if (g.b()) {
            return g;
        }
        throw new C0057Cc();
    }

    public final Object clone() {
        LK h = h();
        h.i(g());
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        MK mk = null;
        try {
            try {
                MK.B.getClass();
                i(new MK(c0523Ub, c1649ol));
                return this;
            } catch (C0204Ht e) {
                MK mk2 = (MK) e.h;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    mk = mk2;
                    if (mk != null) {
                        i(mk);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (mk != null) {
            }
            throw th;
        }
    }

    @Override // o.AbstractC1654oq
    public final /* bridge */ /* synthetic */ AbstractC1654oq e(AbstractC2115vq abstractC2115vq) {
        i((MK) abstractC2115vq);
        return this;
    }

    public final MK g() {
        MK mk = new MK(this);
        int i = this.k;
        if ((i & 1) == 1) {
            this.l = Collections.unmodifiableList(this.l);
            this.k &= -2;
        }
        mk.k = this.l;
        int i2 = (i & 2) != 2 ? 0 : 1;
        mk.l = this.m;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        mk.m = this.n;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        mk.n = this.f62o;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        mk.f68o = this.p;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        mk.p = this.q;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        mk.q = this.r;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        mk.r = this.s;
        if ((i & 256) == 256) {
            i2 |= 128;
        }
        mk.s = this.t;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        mk.t = this.u;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        mk.u = this.v;
        if ((i & 2048) == 2048) {
            i2 |= 1024;
        }
        mk.v = this.w;
        if ((i & 4096) == 4096) {
            i2 |= 2048;
        }
        mk.w = this.x;
        if ((i & 8192) == 8192) {
            i2 |= 4096;
        }
        mk.x = this.y;
        mk.j = i2;
        return mk;
    }

    public final LK i(MK mk) {
        MK mk2;
        MK mk3;
        MK mk4;
        MK mk5 = MK.A;
        if (mk == mk5) {
            return this;
        }
        if (!mk.k.isEmpty()) {
            if (this.l.isEmpty()) {
                this.l = mk.k;
                this.k &= -2;
            } else {
                if ((this.k & 1) != 1) {
                    this.l = new ArrayList(this.l);
                    this.k |= 1;
                }
                this.l.addAll(mk.k);
            }
        }
        int i = mk.j;
        if ((i & 1) == 1) {
            boolean z = mk.l;
            this.k |= 2;
            this.m = z;
        }
        if ((i & 2) == 2) {
            int i2 = mk.m;
            this.k |= 4;
            this.n = i2;
        }
        if ((i & 4) == 4) {
            MK mk6 = mk.n;
            if ((this.k & 8) != 8 || (mk4 = this.f62o) == mk5) {
                this.f62o = mk6;
            } else {
                LK r = MK.r(mk4);
                r.i(mk6);
                this.f62o = r.g();
            }
            this.k |= 8;
        }
        if ((mk.j & 8) == 8) {
            int i3 = mk.f68o;
            this.k |= 16;
            this.p = i3;
        }
        if (mk.p()) {
            int i4 = mk.p;
            this.k |= 32;
            this.q = i4;
        }
        int i5 = mk.j;
        if ((i5 & 32) == 32) {
            int i6 = mk.q;
            this.k |= 64;
            this.r = i6;
        }
        if ((i5 & 64) == 64) {
            int i7 = mk.r;
            this.k |= 128;
            this.s = i7;
        }
        if ((i5 & 128) == 128) {
            int i8 = mk.s;
            this.k |= 256;
            this.t = i8;
        }
        if ((i5 & 256) == 256) {
            MK mk7 = mk.t;
            if ((this.k & 512) != 512 || (mk3 = this.u) == mk5) {
                this.u = mk7;
            } else {
                LK r2 = MK.r(mk3);
                r2.i(mk7);
                this.u = r2.g();
            }
            this.k |= 512;
        }
        int i9 = mk.j;
        if ((i9 & 512) == 512) {
            int i10 = mk.u;
            this.k |= 1024;
            this.v = i10;
        }
        if ((i9 & 1024) == 1024) {
            MK mk8 = mk.v;
            if ((this.k & 2048) != 2048 || (mk2 = this.w) == mk5) {
                this.w = mk8;
            } else {
                LK r3 = MK.r(mk2);
                r3.i(mk8);
                this.w = r3.g();
            }
            this.k |= 2048;
        }
        int i11 = mk.j;
        if ((i11 & 2048) == 2048) {
            int i12 = mk.w;
            this.k |= 4096;
            this.x = i12;
        }
        if ((i11 & 4096) == 4096) {
            int i13 = mk.x;
            this.k |= 8192;
            this.y = i13;
        }
        f(mk);
        this.h = this.h.k(mk.i);
        return this;
    }
}
