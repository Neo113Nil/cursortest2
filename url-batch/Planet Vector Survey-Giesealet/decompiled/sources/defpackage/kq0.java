package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class kq0 extends lq0 {
    public static List A(iq0 iq0Var) {
        Iterator it = iq0Var.iterator();
        if (!it.hasNext()) {
            return wp.d;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return px0.H(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static iq0 y(Iterator it) {
        it.getClass();
        return new ti(new fe(1, it));
    }

    public static iq0 z(Object obj, mu muVar) {
        return obj == null ? aq.a : new dr(new ab0(6, obj), muVar, 1);
    }
}
