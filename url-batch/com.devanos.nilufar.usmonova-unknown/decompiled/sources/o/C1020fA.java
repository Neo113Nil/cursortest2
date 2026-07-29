package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.fA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1020fA extends AbstractC1152hA {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(Object obj, long j, int i) {
        List list = (List) AbstractC1768qY.c.i(j, obj);
        if (list.isEmpty()) {
            List c1729pz = list instanceof InterfaceC1860rz ? new C1729pz(i) : new ArrayList(i);
            AbstractC1768qY.p(j, obj, c1729pz);
            return c1729pz;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            AbstractC1768qY.p(j, obj, arrayList);
            return arrayList;
        }
        if (!(list instanceof C1242iY)) {
            return list;
        }
        C1729pz c1729pz2 = new C1729pz(list.size() + i);
        c1729pz2.addAll((C1242iY) list);
        AbstractC1768qY.p(j, obj, c1729pz2);
        return c1729pz2;
    }

    @Override // o.AbstractC1152hA
    public final void a(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) AbstractC1768qY.c.i(j, obj);
        if (list instanceof InterfaceC1860rz) {
            unmodifiableList = ((InterfaceC1860rz) list).a();
        } else if (c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC1768qY.p(j, obj, unmodifiableList);
    }

    @Override // o.AbstractC1152hA
    public final void b(long j, Object obj, Object obj2) {
        List list = (List) AbstractC1768qY.c.i(j, obj2);
        List d = d(obj, j, list.size());
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        AbstractC1768qY.p(j, obj, list);
    }

    @Override // o.AbstractC1152hA
    public final List c(long j, Object obj) {
        return d(obj, j, 10);
    }
}
