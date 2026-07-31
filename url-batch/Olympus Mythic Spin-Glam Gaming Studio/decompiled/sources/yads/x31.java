package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class x31 {
    public final Set a(List list) {
        Object obj;
        List emptyList;
        Object obj2;
        Iterable emptyList2;
        ArrayList arrayList;
        Object obj3;
        Set mutableSet = CollectionsKt.toMutableSet(ki.a(list));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((ph) obj).a, "feedback")) {
                break;
            }
        }
        ph phVar = (ph) obj;
        if ((phVar != null ? phVar.c : null) instanceof ot0) {
            List listOfNotNull = CollectionsKt.listOfNotNull(((ot0) phVar.c).a);
            kf1 kf1Var = phVar.d;
            if (kf1Var == null || (arrayList = kf1Var.a) == null) {
                obj2 = null;
            } else {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    if (Intrinsics.areEqual(((j0) obj3).a(), "divkit_adtune")) {
                        break;
                    }
                }
                obj2 = (j0) obj3;
            }
            ci0 ci0Var = obj2 instanceof ci0 ? (ci0) obj2 : null;
            if (ci0Var == null || (emptyList2 = ci0Var.b.d) == null) {
                emptyList2 = CollectionsKt.emptyList();
            }
            emptyList = CollectionsKt.plus((Collection) listOfNotNull, emptyList2);
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        mutableSet.addAll(emptyList);
        return mutableSet;
    }
}
