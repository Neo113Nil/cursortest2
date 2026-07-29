package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.gK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1096gK extends AbstractC1851rq {
    public int k;
    public int l;
    public List m;
    public List n;

    public static C1096gK h() {
        C1096gK c1096gK = new C1096gK();
        c1096gK.l = 6;
        List list = Collections.EMPTY_LIST;
        c1096gK.m = list;
        c1096gK.n = list;
        return c1096gK;
    }

    @Override // o.AbstractC1654oq
    public final E c() {
        C1162hK g = g();
        if (g.b()) {
            return g;
        }
        throw new C0057Cc();
    }

    public final Object clone() {
        C1096gK h = h();
        h.i(g());
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        C1162hK c1162hK = null;
        try {
            try {
                C1162hK.q.getClass();
                i(new C1162hK(c0523Ub, c1649ol));
                return this;
            } catch (C0204Ht e) {
                C1162hK c1162hK2 = (C1162hK) e.h;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    c1162hK = c1162hK2;
                    if (c1162hK != null) {
                        i(c1162hK);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c1162hK != null) {
            }
            throw th;
        }
    }

    @Override // o.AbstractC1654oq
    public final /* bridge */ /* synthetic */ AbstractC1654oq e(AbstractC2115vq abstractC2115vq) {
        i((C1162hK) abstractC2115vq);
        return this;
    }

    public final C1162hK g() {
        C1162hK c1162hK = new C1162hK(this);
        int i = this.k;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c1162hK.k = this.l;
        if ((i & 2) == 2) {
            this.m = Collections.unmodifiableList(this.m);
            this.k &= -3;
        }
        c1162hK.l = this.m;
        if ((this.k & 4) == 4) {
            this.n = Collections.unmodifiableList(this.n);
            this.k &= -5;
        }
        c1162hK.m = this.n;
        c1162hK.j = i2;
        return c1162hK;
    }

    public final void i(C1162hK c1162hK) {
        if (c1162hK == C1162hK.p) {
            return;
        }
        if ((c1162hK.j & 1) == 1) {
            int i = c1162hK.k;
            this.k = 1 | this.k;
            this.l = i;
        }
        if (!c1162hK.l.isEmpty()) {
            if (this.m.isEmpty()) {
                this.m = c1162hK.l;
                this.k &= -3;
            } else {
                if ((this.k & 2) != 2) {
                    this.m = new ArrayList(this.m);
                    this.k |= 2;
                }
                this.m.addAll(c1162hK.l);
            }
        }
        if (!c1162hK.m.isEmpty()) {
            if (this.n.isEmpty()) {
                this.n = c1162hK.m;
                this.k &= -5;
            } else {
                if ((this.k & 4) != 4) {
                    this.n = new ArrayList(this.n);
                    this.k |= 4;
                }
                this.n.addAll(c1162hK.m);
            }
        }
        f(c1162hK);
        this.h = this.h.k(c1162hK.i);
    }
}
