package W0;

import c1.AbstractC0104b;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class j extends p {
    public static Object v0(List list) {
        i1.f.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final void w0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, h1.l lVar) {
        i1.f.e(charSequence, "separator");
        i1.f.e(charSequence2, "prefix");
        i1.f.e(charSequence3, "postfix");
        i1.f.e(charSequence4, "truncated");
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : collection) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                AbstractC0104b.a(sb, obj, lVar);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static byte[] x0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void y0(Iterable iterable, AbstractCollection abstractCollection) {
        i1.f.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List z0(Iterable iterable) {
        ArrayList arrayList;
        i1.f.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        s sVar = s.f1284a;
        if (!z2) {
            if (z2) {
                arrayList = new ArrayList((Collection) iterable);
            } else {
                arrayList = new ArrayList();
                y0(iterable, arrayList);
            }
            int size = arrayList.size();
            return size != 0 ? size != 1 ? arrayList : F1.l.T(arrayList.get(0)) : sVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return sVar;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return F1.l.T(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }
}
