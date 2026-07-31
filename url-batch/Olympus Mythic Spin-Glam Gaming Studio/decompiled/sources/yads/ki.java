package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class ki {
    public static Set a(List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ph) it.next()).c);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            List listOf = next instanceof q31 ? CollectionsKt.listOf(next) : next instanceof dn1 ? ((dn1) next).c : null;
            if (listOf != null) {
                arrayList2.add(listOf);
            }
        }
        return CollectionsKt.toSet(CollectionsKt.flatten(arrayList2));
    }
}
