package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class v12 {
    public final c02 a = new c02();

    public static ArrayList b(s12 s12Var) {
        List list = s12Var.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((ry1) it.next()).c;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final List a(s12 s12Var) {
        List<ry1> list = s12Var.a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ry1 ry1Var : list) {
            ki kiVar = this.a.a;
            Set a = ki.a(ry1Var.b);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = a.iterator();
            while (it.hasNext()) {
                String str = ((q31) it.next()).d;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((String) next).length() > 0) {
                    arrayList3.add(next);
                }
            }
            arrayList.add(CollectionsKt.toList(arrayList3));
        }
        return CollectionsKt.flatten(arrayList);
    }
}
