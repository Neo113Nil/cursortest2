package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
@o90("composable")
/* loaded from: classes.dex */
public final class rg extends p90 {
    public final ce0 c = ud0.o(Boolean.FALSE);

    @Override // defpackage.p90
    public final m80 a() {
        return new qg(this, hg.a);
    }

    @Override // defpackage.p90
    public final void d(List list, c90 c90Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y70 y70Var = (y70) it.next();
            a80 b = b();
            pi0 pi0Var = b.e;
            y70Var.getClass();
            et0 et0Var = b.c;
            Iterable iterable = (Iterable) et0Var.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((y70) it2.next()) == y70Var) {
                        Iterable iterable2 = (Iterable) pi0Var.d.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((y70) it3.next()) == y70Var) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            y70 y70Var2 = (y70) zd.i0((List) pi0Var.d.getValue());
            if (y70Var2 != null) {
                et0Var.k(null, mq0.t((Set) et0Var.getValue(), y70Var2));
            }
            et0Var.k(null, mq0.t((Set) et0Var.getValue(), y70Var));
            b.f(y70Var);
        }
        this.c.setValue(Boolean.FALSE);
    }

    @Override // defpackage.p90
    public final void e(y70 y70Var, boolean z) {
        b().e(y70Var, z);
        this.c.setValue(Boolean.TRUE);
    }

    public final void g(y70 y70Var) {
        a80 b = b();
        y70Var.getClass();
        et0 et0Var = b.c;
        et0Var.k(null, mq0.t((Set) et0Var.getValue(), y70Var));
        if (!b.h.g.contains(y70Var)) {
            g8.s("Cannot transition entry that is not in the back stack");
        } else {
            y70Var.n = f20.g;
            y70Var.b();
        }
    }
}
