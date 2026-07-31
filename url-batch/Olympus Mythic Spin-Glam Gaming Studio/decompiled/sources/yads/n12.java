package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;

/* loaded from: classes6.dex */
public abstract class n12 {
    public static Set a(m12 m12Var, ii0 ii0Var) {
        List f = m12Var.f();
        if (f != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = f.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((ri0) it.next()).g);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                hi0 hi0Var = (hi0) next;
                if (ii0Var == null || hi0Var.a == ii0Var) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((hi0) it3.next()).b);
            }
            Set set = CollectionsKt.toSet(arrayList3);
            if (set != null) {
                return set;
            }
        }
        return SetsKt.emptySet();
    }
}
