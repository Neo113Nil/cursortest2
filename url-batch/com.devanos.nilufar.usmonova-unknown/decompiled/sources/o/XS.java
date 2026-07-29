package o;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public abstract class XS {
    public static final LinkedHashSet a;
    public static final C1639ob b;

    static {
        List K = AbstractC0868ct.K(AbstractC0438Qu.a, AbstractC0438Qu.h, AbstractC0438Qu.i, AbstractC0438Qu.c, AbstractC0438Qu.d, AbstractC0438Qu.f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = K.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(C1639ob.j((C2245xo) it.next()));
        }
        a = linkedHashSet;
        b = C1639ob.j(AbstractC0438Qu.g);
    }
}
