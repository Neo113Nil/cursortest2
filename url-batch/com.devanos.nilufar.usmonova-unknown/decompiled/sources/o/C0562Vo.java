package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: o.Vo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0562Vo implements InterfaceC0510To {
    public final /* synthetic */ AbstractC0588Wo a;

    public C0562Vo(AbstractC0588Wo abstractC0588Wo) {
        this.a = abstractC0588Wo;
    }

    @Override // o.InterfaceC0510To
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC0588Wo abstractC0588Wo = this.a;
        ArrayList arrayList3 = abstractC0588Wo.d;
        Q7 q7 = (Q7) arrayList3.get(arrayList3.size() - 1);
        abstractC0588Wo.h = q7;
        Iterator it = q7.a.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = ((C1258ip) it.next()).b;
            if (abstractComponentCallbacksC0069Co != null) {
                abstractComponentCallbacksC0069Co.t = true;
            }
        }
        boolean R = abstractC0588Wo.R(arrayList, arrayList2, -1, 0);
        if (!abstractC0588Wo.m.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(AbstractC0588Wo.E((Q7) it2.next()));
            }
            Iterator it3 = abstractC0588Wo.m.iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    throw new ClassCastException();
                }
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return R;
    }
}
