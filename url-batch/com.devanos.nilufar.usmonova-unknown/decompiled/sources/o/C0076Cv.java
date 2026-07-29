package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.Cv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0076Cv extends AbstractC1654oq implements EC {
    public int i;
    public int j;
    public int k;
    public Object l;
    public EnumC0102Dv m;
    public List n;

    /* renamed from: o, reason: collision with root package name */
    public List f26o;

    public static C0076Cv g() {
        C0076Cv c0076Cv = new C0076Cv();
        c0076Cv.j = 1;
        c0076Cv.l = "";
        c0076Cv.m = EnumC0102Dv.NONE;
        List list = Collections.EMPTY_LIST;
        c0076Cv.n = list;
        c0076Cv.f26o = list;
        return c0076Cv;
    }

    @Override // o.AbstractC1654oq
    public final E c() {
        C0128Ev f = f();
        f.b();
        return f;
    }

    public final Object clone() {
        C0076Cv g = g();
        g.h(f());
        return g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // o.AbstractC1654oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1654oq d(C0523Ub c0523Ub, C1649ol c1649ol) {
        C0128Ev c0128Ev = null;
        try {
            try {
                C0128Ev.u.getClass();
                h(new C0128Ev(c0523Ub));
                return this;
            } catch (C0204Ht e) {
                C0128Ev c0128Ev2 = (C0128Ev) e.h;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    c0128Ev = c0128Ev2;
                    if (c0128Ev != null) {
                        h(c0128Ev);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c0128Ev != null) {
            }
            throw th;
        }
    }

    @Override // o.AbstractC1654oq
    public final /* bridge */ /* synthetic */ AbstractC1654oq e(AbstractC2115vq abstractC2115vq) {
        h((C0128Ev) abstractC2115vq);
        return this;
    }

    public final C0128Ev f() {
        C0128Ev c0128Ev = new C0128Ev(this);
        int i = this.i;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c0128Ev.j = this.j;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c0128Ev.k = this.k;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c0128Ev.l = this.l;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c0128Ev.m = this.m;
        if ((i & 16) == 16) {
            this.n = Collections.unmodifiableList(this.n);
            this.i &= -17;
        }
        c0128Ev.n = this.n;
        if ((this.i & 32) == 32) {
            this.f26o = Collections.unmodifiableList(this.f26o);
            this.i &= -33;
        }
        c0128Ev.p = this.f26o;
        c0128Ev.i = i2;
        return c0128Ev;
    }

    public final void h(C0128Ev c0128Ev) {
        if (c0128Ev == C0128Ev.t) {
            return;
        }
        int i = c0128Ev.i;
        if ((i & 1) == 1) {
            int i2 = c0128Ev.j;
            this.i = 1 | this.i;
            this.j = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c0128Ev.k;
            this.i = 2 | this.i;
            this.k = i3;
        }
        if ((i & 4) == 4) {
            this.i |= 4;
            this.l = c0128Ev.l;
        }
        if ((i & 8) == 8) {
            EnumC0102Dv enumC0102Dv = c0128Ev.m;
            enumC0102Dv.getClass();
            this.i = 8 | this.i;
            this.m = enumC0102Dv;
        }
        if (!c0128Ev.n.isEmpty()) {
            if (this.n.isEmpty()) {
                this.n = c0128Ev.n;
                this.i &= -17;
            } else {
                if ((this.i & 16) != 16) {
                    this.n = new ArrayList(this.n);
                    this.i |= 16;
                }
                this.n.addAll(c0128Ev.n);
            }
        }
        if (!c0128Ev.p.isEmpty()) {
            if (this.f26o.isEmpty()) {
                this.f26o = c0128Ev.p;
                this.i &= -33;
            } else {
                if ((this.i & 32) != 32) {
                    this.f26o = new ArrayList(this.f26o);
                    this.i |= 32;
                }
                this.f26o.addAll(c0128Ev.p);
            }
        }
        this.h = this.h.k(c0128Ev.h);
    }
}
