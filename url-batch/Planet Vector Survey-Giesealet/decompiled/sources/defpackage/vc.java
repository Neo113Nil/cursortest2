package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class vc implements bv {
    public final rj d;
    public final int e;
    public final cb f;

    public vc(rj rjVar, int i, cb cbVar) {
        this.d = rjVar;
        this.e = i;
        this.f = cbVar;
    }

    @Override // defpackage.bv
    public final or b(rj rjVar, int i, cb cbVar) {
        rj rjVar2 = this.d;
        rj i2 = rjVar.i(rjVar2);
        cb cbVar2 = cb.d;
        cb cbVar3 = this.f;
        int i3 = this.e;
        if (cbVar == cbVar2) {
            if (i3 != -3) {
                if (i != -3) {
                    if (i3 != -2) {
                        if (i != -2) {
                            i += i3;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i3;
            }
            cbVar = cbVar3;
        }
        return (nz.l(i2, rjVar2) && i == i3 && cbVar == cbVar3) ? this : e(i2, i, cbVar);
    }

    public String c() {
        return null;
    }

    public abstract Object d(wh0 wh0Var, c cVar);

    public abstract vc e(rj rjVar, int i, cb cbVar);

    public or f() {
        return null;
    }

    public tc g(bk bkVar) {
        int i = this.e;
        if (i == -3) {
            i = -2;
        }
        qu cVar = new c(this, null, 6);
        eb b = x40.b(i, this.f, 4);
        rj s = a50.s(bkVar.f(), this.d, true);
        gl glVar = vm.a;
        if (s != glVar && s.k(b2.t) == null) {
            s = s.i(glVar);
        }
        wh0 wh0Var = new wh0(s, b);
        wh0Var.d0(ek.f, wh0Var, cVar);
        return wh0Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String c = c();
        if (c != null) {
            arrayList.add(c);
        }
        up upVar = up.d;
        rj rjVar = this.d;
        if (rjVar != upVar) {
            arrayList.add("context=" + rjVar);
        }
        int i = this.e;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        cb cbVar = cb.d;
        cb cbVar2 = this.f;
        if (cbVar2 != cbVar) {
            arrayList.add("onBufferOverflow=" + cbVar2);
        }
        return getClass().getSimpleName() + '[' + zd.g0(arrayList, null, null, null, 62) + ']';
    }
}
