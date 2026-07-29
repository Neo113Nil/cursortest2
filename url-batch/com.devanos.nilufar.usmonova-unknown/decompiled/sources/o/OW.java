package o;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class OW extends AbstractC0689a7 {
    public static final C0208Hx i = new C0208Hx(28);
    public static final OW j = new OW(C1318jk.h);

    public OW(List list) {
        this.h = C0990ek.h;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1869s4 c1869s4 = (C1869s4) it.next();
            c1869s4.getClass();
            int P0 = i.P0(UM.a.b(C1869s4.class));
            int j2 = this.h.j();
            if (j2 != 0) {
                if (j2 == 1) {
                    J6 j6 = this.h;
                    AbstractC0048Bt.l(j6, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                    C1288jG c1288jG = (C1288jG) j6;
                    int i2 = c1288jG.i;
                    if (i2 == P0) {
                        this.h = new C1288jG(P0, c1869s4);
                    } else {
                        M6 m6 = new M6();
                        m6.h = new Object[20];
                        m6.i = 0;
                        this.h = m6;
                        m6.k(i2, c1288jG.h);
                    }
                }
                this.h.k(P0, c1869s4);
            } else {
                this.h = new C1288jG(P0, c1869s4);
            }
        }
    }
}
