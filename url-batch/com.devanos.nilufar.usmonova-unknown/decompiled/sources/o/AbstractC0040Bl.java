package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.Bl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0040Bl {
    public static final LinkedHashMap a;
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        b(C1039fT.q, a("java.util.ArrayList", "java.util.LinkedList"));
        b(C1039fT.r, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(C1039fT.s, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b(C1639ob.j(new C2245xo("java.util.function.Function")), a("java.util.function.UnaryOperator"));
        b(C1639ob.j(new C2245xo("java.util.function.BiFunction")), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new C1619oH(((C1639ob) entry.getKey()).b(), ((C1639ob) entry.getValue()).b()));
        }
        b = EB.V(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C1639ob.j(new C2245xo(str)));
        }
        return arrayList;
    }

    public static void b(C1639ob c1639ob, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            a.put(next, c1639ob);
        }
    }
}
