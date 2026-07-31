package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes15.dex */
public final class fn1 {
    public static Set a(ry1 ry1Var) {
        List list = ry1Var.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ph) it.next()).c);
        }
        return CollectionsKt.toSet(CollectionsKt.filterIsInstance(arrayList, dn1.class));
    }
}
