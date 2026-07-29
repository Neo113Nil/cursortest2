package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.Bv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050Bv extends AbstractC1654oq implements EC {
    public int i;
    public List j;
    public List k;

    @Override // o.AbstractC1654oq
    public final E c() {
        C0154Fv f = f();
        f.b();
        return f;
    }

    public final Object clone() {
        C0050Bv c0050Bv = new C0050Bv();
        List list = Collections.EMPTY_LIST;
        c0050Bv.j = list;
        c0050Bv.k = list;
        c0050Bv.g(f());
        return c0050Bv;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        C0154Fv c0154Fv = null;
        try {
            try {
                C0154Fv.f41o.getClass();
                g(new C0154Fv(c0523Ub, c1649ol));
                return this;
            } catch (C0204Ht e) {
                C0154Fv c0154Fv2 = (C0154Fv) e.h;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    c0154Fv = c0154Fv2;
                    if (c0154Fv != null) {
                        g(c0154Fv);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c0154Fv != null) {
            }
            throw th;
        }
    }

    @Override // o.AbstractC1654oq
    public final /* bridge */ /* synthetic */ AbstractC1654oq e(AbstractC2115vq abstractC2115vq) {
        g((C0154Fv) abstractC2115vq);
        return this;
    }

    public final C0154Fv f() {
        C0154Fv c0154Fv = new C0154Fv(this);
        if ((this.i & 1) == 1) {
            this.j = Collections.unmodifiableList(this.j);
            this.i &= -2;
        }
        c0154Fv.i = this.j;
        if ((this.i & 2) == 2) {
            this.k = Collections.unmodifiableList(this.k);
            this.i &= -3;
        }
        c0154Fv.j = this.k;
        return c0154Fv;
    }

    public final void g(C0154Fv c0154Fv) {
        if (c0154Fv == C0154Fv.n) {
            return;
        }
        if (!c0154Fv.i.isEmpty()) {
            if (this.j.isEmpty()) {
                this.j = c0154Fv.i;
                this.i &= -2;
            } else {
                if ((this.i & 1) != 1) {
                    this.j = new ArrayList(this.j);
                    this.i |= 1;
                }
                this.j.addAll(c0154Fv.i);
            }
        }
        if (!c0154Fv.j.isEmpty()) {
            if (this.k.isEmpty()) {
                this.k = c0154Fv.j;
                this.i &= -3;
            } else {
                if ((this.i & 2) != 2) {
                    this.k = new ArrayList(this.k);
                    this.i |= 2;
                }
                this.k.addAll(c0154Fv.j);
            }
        }
        this.h = this.h.k(c0154Fv.h);
    }
}
