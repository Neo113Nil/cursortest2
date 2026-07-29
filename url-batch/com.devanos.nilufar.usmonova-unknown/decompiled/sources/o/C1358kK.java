package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.kK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1358kK extends AbstractC1654oq implements EC {
    public int i;
    public EnumC1424lK j;
    public List k;
    public C1885sK l;
    public EnumC1490mK m;

    public static C1358kK g() {
        C1358kK c1358kK = new C1358kK();
        c1358kK.j = EnumC1424lK.RETURNS_CONSTANT;
        c1358kK.k = Collections.EMPTY_LIST;
        c1358kK.l = C1885sK.s;
        c1358kK.m = EnumC1490mK.AT_MOST_ONCE;
        return c1358kK;
    }

    @Override // o.AbstractC1654oq
    public final E c() {
        C1556nK f = f();
        if (f.b()) {
            return f;
        }
        throw new C0057Cc();
    }

    public final Object clone() {
        C1358kK g = g();
        g.h(f());
        return g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        C1556nK c1556nK = null;
        try {
            try {
                C1556nK.q.getClass();
                h(new C1556nK(c0523Ub, c1649ol));
                return this;
            } catch (C0204Ht e) {
                C1556nK c1556nK2 = (C1556nK) e.h;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    c1556nK = c1556nK2;
                    if (c1556nK != null) {
                        h(c1556nK);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c1556nK != null) {
            }
            throw th;
        }
    }

    @Override // o.AbstractC1654oq
    public final /* bridge */ /* synthetic */ AbstractC1654oq e(AbstractC2115vq abstractC2115vq) {
        h((C1556nK) abstractC2115vq);
        return this;
    }

    public final C1556nK f() {
        C1556nK c1556nK = new C1556nK(this);
        int i = this.i;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c1556nK.j = this.j;
        if ((i & 2) == 2) {
            this.k = Collections.unmodifiableList(this.k);
            this.i &= -3;
        }
        c1556nK.k = this.k;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        c1556nK.l = this.l;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        c1556nK.m = this.m;
        c1556nK.i = i2;
        return c1556nK;
    }

    public final void h(C1556nK c1556nK) {
        C1885sK c1885sK;
        if (c1556nK == C1556nK.p) {
            return;
        }
        if ((c1556nK.i & 1) == 1) {
            EnumC1424lK enumC1424lK = c1556nK.j;
            enumC1424lK.getClass();
            this.i = 1 | this.i;
            this.j = enumC1424lK;
        }
        if (!c1556nK.k.isEmpty()) {
            if (this.k.isEmpty()) {
                this.k = c1556nK.k;
                this.i &= -3;
            } else {
                if ((this.i & 2) != 2) {
                    this.k = new ArrayList(this.k);
                    this.i |= 2;
                }
                this.k.addAll(c1556nK.k);
            }
        }
        if ((c1556nK.i & 2) == 2) {
            C1885sK c1885sK2 = c1556nK.l;
            if ((this.i & 4) != 4 || (c1885sK = this.l) == C1885sK.s) {
                this.l = c1885sK2;
            } else {
                C1754qK g = C1754qK.g();
                g.h(c1885sK);
                g.h(c1885sK2);
                this.l = g.f();
            }
            this.i |= 4;
        }
        if ((c1556nK.i & 4) == 4) {
            EnumC1490mK enumC1490mK = c1556nK.m;
            enumC1490mK.getClass();
            this.i |= 8;
            this.m = enumC1490mK;
        }
        this.h = this.h.k(c1556nK.h);
    }
}
