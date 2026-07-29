package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class CR {
    public final ArrayList a = new ArrayList();
    public C1619oH b = new C1619oH("V", null);

    public CR(C0208Hx c0208Hx, String str) {
    }

    public final void a(String str, C1921su... c1921suArr) {
        ZW zw;
        AbstractC0048Bt.n(str, "type");
        if (c1921suArr.length == 0) {
            zw = null;
        } else {
            S6 s6 = new S6(1, new R6(0, c1921suArr));
            int E = EB.E(AbstractC0786bc.d0(s6));
            if (E < 16) {
                E = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(E);
            Iterator it = s6.iterator();
            while (true) {
                C1779qj c1779qj = (C1779qj) it;
                if (!c1779qj.i.hasNext()) {
                    break;
                }
                C0021As c0021As = (C0021As) c1779qj.next();
                linkedHashMap.put(Integer.valueOf(c0021As.a), (C1921su) c0021As.b);
            }
            zw = new ZW(linkedHashMap);
        }
        this.a.add(new C1619oH(str, zw));
    }

    public final void b(String str, C1921su... c1921suArr) {
        AbstractC0048Bt.n(str, "type");
        S6 s6 = new S6(1, new R6(0, c1921suArr));
        int E = EB.E(AbstractC0786bc.d0(s6));
        if (E < 16) {
            E = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(E);
        Iterator it = s6.iterator();
        while (true) {
            C1779qj c1779qj = (C1779qj) it;
            if (!c1779qj.i.hasNext()) {
                this.b = new C1619oH(str, new ZW(linkedHashMap));
                return;
            } else {
                C0021As c0021As = (C0021As) c1779qj.next();
                linkedHashMap.put(Integer.valueOf(c0021As.a), (C1921su) c0021As.b);
            }
        }
    }

    public final void c(EnumC1791qv enumC1791qv) {
        AbstractC0048Bt.n(enumC1791qv, "type");
        String c = enumC1791qv.c();
        AbstractC0048Bt.m(c, "type.desc");
        this.b = new C1619oH(c, null);
    }
}
