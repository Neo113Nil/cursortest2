package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class p90 {
    public a80 a;
    public boolean b;

    public abstract m80 a();

    public final a80 b() {
        a80 a80Var = this.a;
        if (a80Var != null) {
            return a80Var;
        }
        g8.s("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void d(List list, c90 c90Var) {
        cr crVar = new cr(new dr(new tu0(new fe(0, list), new f2(this, c90Var), 1), new tn0(3), 0));
        while (crVar.hasNext()) {
            b().f((y70) crVar.next());
        }
    }

    public void e(y70 y70Var, boolean z) {
        y70Var.getClass();
        List list = (List) b().e.d.getValue();
        if (!list.contains(y70Var)) {
            g8.p("popBackStack was called with ", y70Var, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        y70 y70Var2 = null;
        while (f()) {
            y70Var2 = (y70) listIterator.previous();
            if (nz.l(y70Var2, y70Var)) {
                break;
            }
        }
        if (y70Var2 != null) {
            b().c(y70Var2, z);
        }
    }

    public boolean f() {
        return true;
    }

    public m80 c(m80 m80Var) {
        return m80Var;
    }
}
