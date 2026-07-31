package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class a60 {
    public final rr1 a;
    public final cs1 b;
    public final o50 c;
    public final zr1 d;

    public a60(rr1 rr1Var, cs1 cs1Var, o50 o50Var, zr1 zr1Var) {
        this.a = rr1Var;
        this.b = cs1Var;
        this.c = o50Var;
        this.d = zr1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a A[LOOP:2: B:40:0x0114->B:42:0x011a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z50 a(g80 g80Var, s80 s80Var) {
        List emptyList;
        List emptyList2;
        List emptyList3;
        m50 m50Var;
        Object obj;
        f50 d50Var;
        Iterator it;
        boolean z = true;
        if (s80Var == null || (emptyList = s80Var.g) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        r50 r50Var = g80Var.a;
        g90 g90Var = g80Var.b;
        b40 b40Var = new b40(s80Var != null ? s80Var.a : null, s80Var != null ? s80Var.d : null, s80Var != null ? s80Var.c : null);
        ArrayList<qr1> arrayList = g80Var.c;
        ArrayList a = this.b.a(emptyList);
        if (!a.isEmpty()) {
            arrayList = a;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (qr1 qr1Var : arrayList) {
            Iterator it2 = emptyList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (Intrinsics.areEqual(((m80) obj).b, qr1Var.a)) {
                    break;
                }
            }
            m80 m80Var = (m80) obj;
            this.a.getClass();
            boolean a2 = rr1.a(qr1Var);
            this.d.getClass();
            List list = qr1Var.d;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    if (((pr1) it3.next()).c != z) {
                        List list2 = qr1Var.d;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it4 = list2.iterator();
                            while (it4.hasNext()) {
                                if (((pr1) it4.next()).c) {
                                    sr1 sr1Var = sr1.b;
                                    d50Var = new d50();
                                    break;
                                }
                            }
                        }
                        d50Var = e50.a;
                        f50 f50Var = d50Var;
                        String str = qr1Var.a;
                        String str2 = m80Var == null ? m80Var.c : null;
                        pr1 pr1Var = (pr1) CollectionsKt.firstOrNull(qr1Var.d);
                        String str3 = pr1Var == null ? pr1Var.b : null;
                        String str4 = m80Var == null ? m80Var.f : null;
                        String str5 = qr1Var.c;
                        List list3 = qr1Var.d;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                        it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((pr1) it.next()).a);
                        }
                        arrayList2.add(new g50(str, str2, a2, str3, str4, str5, f50Var, arrayList3));
                        z = true;
                    }
                }
            }
            d50Var = c50.a;
            f50 f50Var2 = d50Var;
            String str6 = qr1Var.a;
            if (m80Var == null) {
            }
            pr1 pr1Var2 = (pr1) CollectionsKt.firstOrNull(qr1Var.d);
            if (pr1Var2 == null) {
            }
            if (m80Var == null) {
            }
            String str52 = qr1Var.c;
            List list32 = qr1Var.d;
            ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list32, 10));
            it = list32.iterator();
            while (it.hasNext()) {
            }
            arrayList2.add(new g50(str6, str2, a2, str3, str4, str52, f50Var2, arrayList32));
            z = true;
        }
        i50 i50Var = new i50(arrayList2);
        y50 y50Var = g80Var.d;
        z70 z70Var = g80Var.e;
        if (s80Var == null || (emptyList2 = s80Var.f) == null) {
            emptyList2 = CollectionsKt.emptyList();
        }
        List list4 = emptyList2;
        o50 o50Var = this.c;
        List list5 = s80Var != null ? s80Var.e : null;
        o50Var.getClass();
        if (list5 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list5) {
                l50 l50Var = (l50) obj2;
                if (l50Var.a != null || l50Var.b != null) {
                    arrayList4.add(obj2);
                }
            }
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            Iterator it5 = arrayList4.iterator();
            while (it5.hasNext()) {
                l50 l50Var2 = (l50) it5.next();
                String str7 = l50Var2.a;
                String str8 = l50Var2.b;
                m50[] values = m50.values();
                int length = values.length;
                Iterator it6 = it5;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        m50Var = null;
                        break;
                    }
                    int i2 = length;
                    m50 m50Var2 = values[i];
                    m50[] m50VarArr = values;
                    l50 l50Var3 = l50Var2;
                    if (Intrinsics.areEqual(l50Var2.c, m50Var2.b)) {
                        m50Var = m50Var2;
                        break;
                    }
                    i++;
                    values = m50VarArr;
                    length = i2;
                    l50Var2 = l50Var3;
                }
                if (m50Var == null) {
                    m50Var = m50.c;
                }
                arrayList5.add(new n50(str7, str8, m50Var));
                it5 = it6;
            }
            emptyList3 = arrayList5;
        } else {
            emptyList3 = CollectionsKt.emptyList();
        }
        return new z50(r50Var, g90Var, b40Var, i50Var, y50Var, z70Var, list4, emptyList3);
    }
}
