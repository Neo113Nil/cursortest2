package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class po1 {
    public final zp1 a;

    public po1(zp1 zp1Var) {
        this.a = zp1Var;
    }

    public final ArrayList a(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String b = this.a.b((er1) next);
            Object obj = linkedHashMap.get(b);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(b, obj);
            }
            ((List) obj).add(next);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            er1 er1Var = ((String) entry.getKey()) != null ? (er1) CollectionsKt.first((List) entry.getValue()) : null;
            if (er1Var != null) {
                arrayList2.add(er1Var);
            }
        }
        return arrayList2;
    }
}
