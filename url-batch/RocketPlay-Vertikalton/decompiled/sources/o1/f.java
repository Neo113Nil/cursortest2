package o1;

import F1.l;
import W0.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f extends g {
    public static List w(d dVar) {
        Iterator it = dVar.iterator();
        if (!it.hasNext()) {
            return s.f1284a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return l.T(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
