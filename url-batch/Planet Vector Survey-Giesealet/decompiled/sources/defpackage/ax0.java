package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ax0 implements bt0 {
    public final j3 d;
    public final ce0 e;
    public final ce0 f;
    public final ce0 g;
    public bp0 h;
    public zu0 i;
    public final ce0 j;
    public final yd0 k;
    public boolean l;
    public final ce0 m;
    public i7 n;
    public final ae0 o;
    public boolean p;
    public final ts0 q;
    public final /* synthetic */ cx0 r;

    public ax0(cx0 cx0Var, Object obj, i7 i7Var, j3 j3Var) {
        this.r = cx0Var;
        this.d = j3Var;
        ce0 o = ud0.o(obj);
        this.e = o;
        Object obj2 = null;
        ce0 o2 = ud0.o(nk.K(7, null));
        this.f = o2;
        this.g = ud0.o(new zu0((er) o2.getValue(), j3Var, obj, o.getValue(), i7Var));
        this.j = ud0.o(Boolean.TRUE);
        this.k = new yd0(-1.0f);
        this.m = ud0.o(obj);
        this.n = i7Var;
        this.o = new ae0(a().c());
        Float f = (Float) t01.a.get(j3Var);
        if (f != null) {
            float floatValue = f.floatValue();
            i7 i7Var2 = (i7) ((mu) j3Var.e).c(obj);
            int b = i7Var2.b();
            for (int i = 0; i < b; i++) {
                i7Var2.e(floatValue, i);
            }
            obj2 = ((mu) this.d.f).c(i7Var2);
        }
        this.q = nk.K(3, obj2);
    }

    public final zu0 a() {
        return (zu0) this.g.getValue();
    }

    public final void b(long j) {
        if (this.k.g() == -1.0f) {
            this.p = true;
            if (nz.l(a().c, a().d)) {
                c(a().c);
            } else {
                c(a().b(j));
                this.n = a().f(j);
            }
        }
    }

    public final void c(Object obj) {
        this.m.setValue(obj);
    }

    public final void e(Object obj, boolean z) {
        zu0 zu0Var = this.i;
        Object obj2 = zu0Var != null ? zu0Var.c : null;
        ce0 ce0Var = this.e;
        boolean l = nz.l(obj2, ce0Var.getValue());
        ae0 ae0Var = this.o;
        ce0 ce0Var2 = this.g;
        er erVar = this.q;
        if (l) {
            ce0Var2.setValue(new zu0(erVar, this.d, obj, obj, this.n.c()));
            this.l = true;
            ae0Var.h(a().c());
            return;
        }
        ce0 ce0Var3 = this.f;
        if (!z || this.p) {
            erVar = (er) ce0Var3.getValue();
        } else if (((er) ce0Var3.getValue()) instanceof ts0) {
            erVar = (er) ce0Var3.getValue();
        }
        cx0 cx0Var = this.r;
        long e = cx0Var.e();
        ce0 ce0Var4 = cx0Var.h;
        ce0Var2.setValue(new zu0(e <= 0 ? erVar : new xs0(erVar, cx0Var.e()), this.d, obj, ce0Var.getValue(), this.n));
        ae0Var.h(a().c());
        this.l = false;
        ce0Var4.setValue(Boolean.TRUE);
        if (cx0Var.g()) {
            gs0 gs0Var = cx0Var.i;
            int size = gs0Var.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                ax0 ax0Var = (ax0) gs0Var.get(i);
                j = Math.max(j, ax0Var.o.g());
                ax0Var.b(0L);
            }
            ce0Var4.setValue(Boolean.FALSE);
        }
    }

    public final void f(Object obj, Object obj2, er erVar) {
        this.e.setValue(obj2);
        this.f.setValue(erVar);
        if (nz.l(a().d, obj) && nz.l(a().c, obj2)) {
            return;
        }
        e(obj, false);
    }

    @Override // defpackage.bt0
    public final Object getValue() {
        return this.m.getValue();
    }

    public final String toString() {
        return "current value: " + this.m.getValue() + ", target: " + this.e.getValue() + ", spec: " + ((er) this.f.getValue());
    }
}
