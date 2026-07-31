package sg.bigo.ads.ba;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public final class i {
    private static Map<String, a> a = new HashMap();

    protected static void a() {
        a.clear();
    }

    public static void a(String str) {
        a c = c(str);
        if (c == null) {
            sg.bigo.ads.bn.a.a(0, "TaskManager", "you add " + str + " to TaskQueue ?");
            return;
        }
        int i = c.e;
        if (i == h.d || i == h.f) {
            c.toString();
            return;
        }
        c.e = h.b;
        f.a().a(c.a);
        g.a.execute(c.c);
    }

    protected static void a(a aVar) {
        aVar.f = "It's remove !!!";
        if (aVar.e != h.f) {
            aVar.e = h.g;
            f.a().a(aVar.a);
        }
        f.a().b(aVar.a);
        g.a(aVar.c);
    }

    protected static Collection<a> b() {
        return a.values();
    }

    protected static void b(String str) {
        a c = c(str);
        if (c != null) {
            a(c);
        } else {
            sg.bigo.ads.bn.a.a(0, "TaskManager", "you add " + str + " to TaskQueue ?");
        }
        if (a.containsKey(str)) {
            a.remove(str);
        }
    }

    public static void b(a aVar) {
        if (a.containsKey(aVar.a)) {
            return;
        }
        a.keySet().size();
        a.put(aVar.a, aVar);
    }

    public static a c(String str) {
        if (a.containsKey(str)) {
            return a.get(str);
        }
        return null;
    }
}
