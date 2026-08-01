package V0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e extends k {
    public static List d0(Iterable iterable) {
        ArrayList arrayList;
        g1.f.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        m mVar = m.f875a;
        if (z2) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return mVar;
            }
            if (size != 1) {
                return new ArrayList(collection);
            }
            return T.e.E(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        if (z2) {
            arrayList = new ArrayList((Collection) iterable);
        } else {
            arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : T.e.E(arrayList.get(0)) : mVar;
    }
}
