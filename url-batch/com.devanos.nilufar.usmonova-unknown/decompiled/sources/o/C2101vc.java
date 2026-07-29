package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: o.vc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2101vc {
    public static final LinkedHashSet a;

    static {
        Set<EnumC1423lJ> set = EnumC1423lJ.l;
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(set));
        for (EnumC1423lJ enumC1423lJ : set) {
            AbstractC0048Bt.n(enumC1423lJ, "primitiveType");
            arrayList.add(AbstractC1499mT.j.c(enumC1423lJ.h));
        }
        ArrayList B0 = AbstractC0720ac.B0(AbstractC0720ac.B0(AbstractC0720ac.B0(arrayList, AbstractC1433lT.f.g()), AbstractC1433lT.h.g()), AbstractC1433lT.j.g());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = B0.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(C1639ob.j((C2245xo) it.next()));
        }
        a = linkedHashSet;
    }
}
