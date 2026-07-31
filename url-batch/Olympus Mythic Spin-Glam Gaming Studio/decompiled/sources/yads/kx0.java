package yads;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;

/* loaded from: classes4.dex */
public final class kx0 {
    public static final Set a = SetsKt.setOf("test_environment");

    public static jx0 a(d8 d8Var) {
        LinkedHashMap linkedHashMap;
        Map map = d8Var.g;
        if (map != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (!a.contains((String) entry.getKey())) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            if (!linkedHashMap2.isEmpty()) {
                linkedHashMap = linkedHashMap2;
                String str = d8Var.a;
                String str2 = d8Var.b;
                String str3 = d8Var.c;
                String str4 = d8Var.d;
                List list = d8Var.e;
                return new jx0(str, str2, str3, str4, (list != null || list.isEmpty()) ? null : list, linkedHashMap, d8Var.i);
            }
        }
        linkedHashMap = null;
        String str5 = d8Var.a;
        String str22 = d8Var.b;
        String str32 = d8Var.c;
        String str42 = d8Var.d;
        List list2 = d8Var.e;
        return new jx0(str5, str22, str32, str42, (list2 != null || list2.isEmpty()) ? null : list2, linkedHashMap, d8Var.i);
    }
}
