package m1;

import V0.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f extends g {
    public static List s(d dVar) {
        Iterator it = dVar.iterator();
        if (!it.hasNext()) {
            return m.f875a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return T.e.E(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
