package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class ah3 {
    public static zg3 a(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((fe3) obj).a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        return new zg3((List) pair.component2(), (List) pair.component1());
    }
}
