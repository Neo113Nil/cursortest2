package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v31 {
    public final void a(List list, Map map) {
        List list2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ph phVar = (ph) it.next();
            Object obj = phVar.c;
            if (Intrinsics.areEqual(phVar.b, "media") && (obj instanceof dn1) && (list2 = ((dn1) obj).c) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (s31.a((q31) obj2, map)) {
                        arrayList.add(obj2);
                    }
                }
                list2.retainAll(arrayList);
            }
        }
    }
}
