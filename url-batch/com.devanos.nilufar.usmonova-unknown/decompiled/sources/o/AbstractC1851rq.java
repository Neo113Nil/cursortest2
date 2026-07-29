package o;

import java.util.Iterator;
import java.util.Map;

/* renamed from: o.rq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1851rq extends AbstractC1654oq implements EC {
    public C0377Ol i = C0377Ol.c;
    public boolean j;

    public final void f(AbstractC1917sq abstractC1917sq) {
        C1038fS c1038fS;
        if (!this.j) {
            this.i = this.i.clone();
            this.j = true;
        }
        C0377Ol c0377Ol = this.i;
        C0377Ol c0377Ol2 = abstractC1917sq.h;
        c0377Ol.getClass();
        int i = 0;
        while (true) {
            c1038fS = c0377Ol2.a;
            if (i >= c1038fS.i.size()) {
                break;
            }
            c0377Ol.g((Map.Entry) c1038fS.i.get(i));
            i++;
        }
        Iterator it = c1038fS.c().iterator();
        while (it.hasNext()) {
            c0377Ol.g((Map.Entry) it.next());
        }
    }
}
