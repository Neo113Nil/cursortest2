package o;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: o.gT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1105gT {
    static {
        new C2245xo("java.lang").c(C0827cE.e("annotation"));
    }

    public static final C1639ob a(String str) {
        C2245xo c2245xo = C1039fT.a;
        return new C1639ob(C1039fT.a, C0827cE.e(str));
    }

    public static final C1639ob b(String str) {
        C2245xo c2245xo = C1039fT.a;
        return new C1639ob(C1039fT.c, C0827cE.e(str));
    }

    public static final void c(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> entrySet = linkedHashMap.entrySet();
        int E = EB.E(AbstractC0786bc.d0(entrySet));
        if (E < 16) {
            E = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(E);
        for (Map.Entry entry : entrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
    }

    public static final C1639ob d(C0827cE c0827cE) {
        C2245xo c2245xo = C1039fT.a;
        C1639ob c1639ob = C1039fT.h;
        return new C1639ob(c1639ob.g(), C0827cE.e(c0827cE.c().concat(c1639ob.i().c())));
    }

    public static final C1639ob e(String str) {
        C2245xo c2245xo = C1039fT.a;
        return new C1639ob(C1039fT.b, C0827cE.e(str));
    }

    public static final C1639ob f(C1639ob c1639ob) {
        C2245xo c2245xo = C1039fT.a;
        return new C1639ob(C1039fT.a, C0827cE.e("U".concat(c1639ob.i().c())));
    }
}
