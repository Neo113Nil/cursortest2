package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class wc extends vc {
    public final or g;

    public wc(or orVar, rj rjVar, int i, cb cbVar) {
        super(rjVar, i, cbVar);
        this.g = orVar;
    }

    @Override // defpackage.or
    public final Object a(pr prVar, kj kjVar) {
        int i = this.e;
        kj kjVar2 = null;
        ck ckVar = ck.d;
        ky0 ky0Var = ky0.a;
        if (i == -3) {
            rj context = kjVar.getContext();
            Boolean bool = Boolean.FALSE;
            ze zeVar = new ze(9);
            rj rjVar = this.d;
            rj i2 = !((Boolean) rjVar.o(zeVar, bool)).booleanValue() ? context.i(rjVar) : a50.s(context, rjVar, false);
            if (nz.l(i2, context)) {
                Object h = h(prVar, kjVar);
                if (h == ckVar) {
                    return h;
                }
            } else {
                b2 b2Var = b2.t;
                if (nz.l(i2.k(b2Var), context.k(b2Var))) {
                    rj context2 = kjVar.getContext();
                    if (!(prVar instanceof hq0) && !(prVar instanceof ka0)) {
                        prVar = new t6(prVar, context2);
                    }
                    Object L = d31.L(i2, prVar, mz.V(i2), new c(this, kjVar2, 7), kjVar);
                    if (L == ckVar) {
                        return L;
                    }
                }
            }
        }
        Object v = x40.v(new u6(prVar, this, kjVar2, 2), kjVar);
        if (v != ckVar) {
            v = ky0Var;
        }
        return v == ckVar ? v : ky0Var;
    }

    @Override // defpackage.vc
    public final Object d(wh0 wh0Var, c cVar) {
        Object h = h(new hq0(wh0Var), cVar);
        return h == ck.d ? h : ky0.a;
    }

    public abstract Object h(pr prVar, kj kjVar);

    @Override // defpackage.vc
    public final String toString() {
        return this.g + " -> " + super.toString();
    }
}
