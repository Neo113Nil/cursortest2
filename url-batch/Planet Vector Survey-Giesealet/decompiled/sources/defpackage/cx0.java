package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class cx0 {
    public final bh a;
    public final cx0 b;
    public final String c;
    public final ce0 d;
    public final ce0 e;
    public final ae0 f = new ae0(0);
    public final ae0 g = new ae0(Long.MIN_VALUE);
    public final ce0 h;
    public final gs0 i;
    public final gs0 j;
    public final ce0 k;
    public final yl l;

    public cx0(bh bhVar, cx0 cx0Var, String str) {
        this.a = bhVar;
        this.b = cx0Var;
        this.c = str;
        this.d = ud0.o(bhVar.b());
        this.e = ud0.o(new zw0(bhVar.b(), bhVar.b()));
        Boolean bool = Boolean.FALSE;
        this.h = ud0.o(bool);
        this.i = new gs0();
        this.j = new gs0();
        this.k = ud0.o(bool);
        this.l = ud0.i(new s6(this, 1));
        bhVar.f(this);
    }

    public final void a(Object obj, ih ihVar, int i) {
        qh qhVar = (qh) ihVar;
        qhVar.W(-1493585151);
        int i2 = (qhVar.f(obj) ? 4 : 2) | i | (qhVar.f(this) ? 32 : 16);
        if ((i2 & 19) == 18 && qhVar.z()) {
            qhVar.Q();
        } else if (g()) {
            qhVar.V(1823992347);
            qhVar.q(false);
        } else {
            qhVar.V(1822507602);
            q(obj);
            if (nz.l(obj, this.a.b()) && this.g.g() == Long.MIN_VALUE && !((Boolean) this.h.getValue()).booleanValue()) {
                qhVar.V(1823982427);
                qhVar.q(false);
            } else {
                qhVar.V(1822738893);
                Object K = qhVar.K();
                y7 y7Var = hh.a;
                if (K == y7Var) {
                    ii iiVar = new ii(mz.z(qhVar));
                    qhVar.e0(iiVar);
                    K = iiVar;
                }
                bk bkVar = ((ii) K).d;
                boolean h = ((i2 & 112) == 32) | qhVar.h(bkVar);
                Object K2 = qhVar.K();
                if (h || K2 == y7Var) {
                    K2 = new y3(20, bkVar, this);
                    qhVar.e0(K2);
                }
                mz.i(bkVar, this, (mu) K2, qhVar);
                qhVar.q(false);
            }
            qhVar.q(false);
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new w3(i, 11, this, obj);
        }
    }

    public final long b() {
        gs0 gs0Var = this.i;
        int size = gs0Var.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((ax0) gs0Var.get(i)).o.g());
        }
        gs0 gs0Var2 = this.j;
        int size2 = gs0Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = Math.max(j, ((cx0) gs0Var2.get(i2)).b());
        }
        return j;
    }

    public final void c() {
        gs0 gs0Var = this.i;
        int size = gs0Var.size();
        for (int i = 0; i < size; i++) {
            ax0 ax0Var = (ax0) gs0Var.get(i);
            ax0Var.i = null;
            ax0Var.h = null;
            ax0Var.l = false;
        }
        gs0 gs0Var2 = this.j;
        int size2 = gs0Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((cx0) gs0Var2.get(i2)).c();
        }
    }

    public final boolean d() {
        gs0 gs0Var = this.i;
        int size = gs0Var.size();
        for (int i = 0; i < size; i++) {
            if (((ax0) gs0Var.get(i)).h != null) {
                return true;
            }
        }
        gs0 gs0Var2 = this.j;
        int size2 = gs0Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((cx0) gs0Var2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        cx0 cx0Var = this.b;
        return cx0Var != null ? cx0Var.e() : this.f.g();
    }

    public final yw0 f() {
        return (yw0) this.e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final void h(long j, boolean z) {
        ae0 ae0Var = this.g;
        long g = ae0Var.g();
        bh bhVar = this.a;
        if (g == Long.MIN_VALUE) {
            ae0Var.h(j);
            ((ce0) bhVar.a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((ce0) bhVar.a).getValue()).booleanValue()) {
            ((ce0) bhVar.a).setValue(Boolean.TRUE);
        }
        this.h.setValue(Boolean.FALSE);
        gs0 gs0Var = this.i;
        int size = gs0Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            ax0 ax0Var = (ax0) gs0Var.get(i);
            ce0 ce0Var = ax0Var.j;
            ce0 ce0Var2 = ax0Var.j;
            if (!((Boolean) ce0Var.getValue()).booleanValue()) {
                long c = z ? ax0Var.a().c() : j;
                ax0Var.c(ax0Var.a().b(c));
                ax0Var.n = ax0Var.a().f(c);
                zu0 a = ax0Var.a();
                a.getClass();
                if (y6.a(a, c)) {
                    ce0Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) ce0Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        gs0 gs0Var2 = this.j;
        int size2 = gs0Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            cx0 cx0Var = (cx0) gs0Var2.get(i2);
            ce0 ce0Var3 = cx0Var.d;
            bh bhVar2 = cx0Var.a;
            if (!nz.l(ce0Var3.getValue(), bhVar2.b())) {
                cx0Var.h(j, z);
            }
            if (!nz.l(cx0Var.d.getValue(), bhVar2.b())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    public final void i() {
        this.g.h(Long.MIN_VALUE);
        bh bhVar = this.a;
        if (bhVar instanceof h70) {
            bhVar.e(this.d.getValue());
        }
        o(0L);
        ((ce0) bhVar.a).setValue(Boolean.FALSE);
        gs0 gs0Var = this.j;
        int size = gs0Var.size();
        for (int i = 0; i < size; i++) {
            ((cx0) gs0Var.get(i)).i();
        }
    }

    public final void j(float f) {
        gs0 gs0Var = this.i;
        int size = gs0Var.size();
        for (int i = 0; i < size; i++) {
            ax0 ax0Var = (ax0) gs0Var.get(i);
            ax0Var.getClass();
            if (f == -4.0f || f == -5.0f) {
                zu0 zu0Var = ax0Var.i;
                if (zu0Var != null) {
                    ax0Var.a().h(zu0Var.c);
                    ax0Var.h = null;
                    ax0Var.i = null;
                }
                Object obj = f == -4.0f ? ax0Var.a().d : ax0Var.a().c;
                ax0Var.a().h(obj);
                ax0Var.a().i(obj);
                ax0Var.c(obj);
                ax0Var.o.h(ax0Var.a().c());
            } else {
                ax0Var.k.h(f);
            }
        }
        gs0 gs0Var2 = this.j;
        int size2 = gs0Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((cx0) gs0Var2.get(i2)).j(f);
        }
    }

    public final void k() {
        gs0 gs0Var = this.i;
        int size = gs0Var.size();
        for (int i = 0; i < size; i++) {
            ((ax0) gs0Var.get(i)).k.h(-2.0f);
        }
        gs0 gs0Var2 = this.j;
        int size2 = gs0Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((cx0) gs0Var2.get(i2)).k();
        }
    }

    public final void l(Object obj, Object obj2) {
        this.g.h(Long.MIN_VALUE);
        bh bhVar = this.a;
        ((ce0) bhVar.a).setValue(Boolean.FALSE);
        boolean g = g();
        ce0 ce0Var = this.d;
        if (!g || !nz.l(bhVar.b(), obj) || !nz.l(ce0Var.getValue(), obj2)) {
            if (!nz.l(bhVar.b(), obj) && (bhVar instanceof h70)) {
                bhVar.e(obj);
            }
            ce0Var.setValue(obj2);
            this.k.setValue(Boolean.TRUE);
            this.e.setValue(new zw0(obj, obj2));
        }
        gs0 gs0Var = this.j;
        int size = gs0Var.size();
        for (int i = 0; i < size; i++) {
            cx0 cx0Var = (cx0) gs0Var.get(i);
            cx0Var.getClass();
            if (cx0Var.g()) {
                cx0Var.l(cx0Var.a.b(), cx0Var.d.getValue());
            }
        }
        gs0 gs0Var2 = this.i;
        int size2 = gs0Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ax0) gs0Var2.get(i2)).b(0L);
        }
    }

    public final void m(long j) {
        ae0 ae0Var = this.g;
        if (ae0Var.g() == Long.MIN_VALUE) {
            ae0Var.h(j);
        }
        o(j);
        this.h.setValue(Boolean.FALSE);
        gs0 gs0Var = this.i;
        int size = gs0Var.size();
        for (int i = 0; i < size; i++) {
            ((ax0) gs0Var.get(i)).b(j);
        }
        gs0 gs0Var2 = this.j;
        int size2 = gs0Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            cx0 cx0Var = (cx0) gs0Var2.get(i2);
            if (!nz.l(cx0Var.d.getValue(), cx0Var.a.b())) {
                cx0Var.m(j);
            }
        }
    }

    public final void n(bp0 bp0Var) {
        gs0 gs0Var = this.i;
        int size = gs0Var.size();
        for (int i = 0; i < size; i++) {
            ax0 ax0Var = (ax0) gs0Var.get(i);
            ce0 ce0Var = ax0Var.m;
            if (!nz.l(ax0Var.a().c, ax0Var.a().d)) {
                ax0Var.i = ax0Var.a();
                ax0Var.h = bp0Var;
            }
            ax0Var.g.setValue(new zu0(ax0Var.q, ax0Var.d, ce0Var.getValue(), ce0Var.getValue(), ax0Var.n.c()));
            ax0Var.o.h(ax0Var.a().c());
            ax0Var.l = true;
        }
        gs0 gs0Var2 = this.j;
        int size2 = gs0Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((cx0) gs0Var2.get(i2)).n(bp0Var);
        }
    }

    public final void o(long j) {
        if (this.b == null) {
            this.f.h(j);
        }
    }

    public final void p() {
        zu0 zu0Var;
        gs0 gs0Var = this.i;
        int size = gs0Var.size();
        for (int i = 0; i < size; i++) {
            ax0 ax0Var = (ax0) gs0Var.get(i);
            bp0 bp0Var = ax0Var.h;
            if (bp0Var != null && (zu0Var = ax0Var.i) != null) {
                long J = a50.J(bp0Var.g * bp0Var.d);
                Object b = zu0Var.b(J);
                if (ax0Var.l) {
                    ax0Var.a().i(b);
                }
                ax0Var.a().h(b);
                ax0Var.o.h(ax0Var.a().c());
                if (ax0Var.k.g() == -2.0f || ax0Var.l) {
                    ax0Var.c(b);
                } else {
                    ax0Var.b(ax0Var.r.e());
                }
                if (J >= bp0Var.g) {
                    ax0Var.h = null;
                    ax0Var.i = null;
                } else {
                    bp0Var.c = false;
                }
            }
        }
        gs0 gs0Var2 = this.j;
        int size2 = gs0Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((cx0) gs0Var2.get(i2)).p();
        }
    }

    public final void q(Object obj) {
        ce0 ce0Var = this.d;
        if (nz.l(ce0Var.getValue(), obj)) {
            return;
        }
        this.e.setValue(new zw0(ce0Var.getValue(), obj));
        bh bhVar = this.a;
        if (!nz.l(bhVar.b(), ce0Var.getValue())) {
            bhVar.e(ce0Var.getValue());
        }
        ce0Var.setValue(obj);
        if (this.g.g() == Long.MIN_VALUE) {
            this.h.setValue(Boolean.TRUE);
        }
        k();
    }

    public final String toString() {
        gs0 gs0Var = this.i;
        int size = gs0Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((ax0) gs0Var.get(i)) + ", ";
        }
        return str;
    }
}
