package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class FN {
    public final C0932ds a;
    public final String b;
    public final C1852rr c;
    public final JN d;
    public final Map e;
    public C1611o9 f;

    public FN(C0932ds c0932ds, String str, C1852rr c1852rr, JN jn, Map map) {
        AbstractC0048Bt.n(c0932ds, "url");
        AbstractC0048Bt.n(str, "method");
        this.a = c0932ds;
        this.b = str;
        this.c = c1852rr;
        this.d = jn;
        this.e = map;
    }

    public final EN a() {
        EN en = new EN();
        en.e = new LinkedHashMap();
        en.a = this.a;
        en.b = this.b;
        en.d = this.d;
        Map map = this.e;
        en.e = map.isEmpty() ? new LinkedHashMap() : EB.X(map);
        en.c = this.c.l();
        return en;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        C1852rr c1852rr = this.c;
        if (c1852rr.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : c1852rr) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC0868ct.Y();
                    throw null;
                }
                C1619oH c1619oH = (C1619oH) obj;
                String str = (String) c1619oH.h;
                String str2 = (String) c1619oH.i;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        Map map = this.e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
