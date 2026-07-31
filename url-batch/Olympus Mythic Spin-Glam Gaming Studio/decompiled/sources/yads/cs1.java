package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class cs1 {
    public final ds1 a;

    public cs1(ds1 ds1Var) {
        this.a = ds1Var;
    }

    public final ArrayList a(List list) {
        wr1 wr1Var;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m80 m80Var = (m80) it.next();
            List<String> list2 = m80Var.e;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (String str : list2) {
                List split$default = StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
                String str2 = (String) CollectionsKt.getOrNull(split$default, CollectionsKt.getLastIndex(split$default) - 1);
                if (str2 == null) {
                    str2 = "";
                }
                arrayList2.add(new cr1(str2, str));
            }
            String str3 = m80Var.b;
            String str4 = m80Var.a;
            if (str4 != null) {
                wr1.c.getClass();
                wr1Var = (wr1) wr1.d.get(str4);
                if (wr1Var == null) {
                    wr1Var = wr1.x;
                }
            } else {
                wr1Var = wr1.x;
            }
            arrayList.add(new dr1(str3, wr1Var, arrayList2));
        }
        return this.a.a(arrayList);
    }
}
