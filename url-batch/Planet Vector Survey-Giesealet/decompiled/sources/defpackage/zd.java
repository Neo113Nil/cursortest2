package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zd extends ee {
    public static boolean b0(Iterable iterable, Object obj) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : e0(iterable, obj) >= 0;
    }

    public static Object c0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        g8.e("List is empty.");
        return null;
    }

    public static Object d0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static int e0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                px0.V();
                throw null;
            }
            if (nz.l(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void f0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, mu muVar) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            ud0.f(sb, obj, muVar);
        }
        sb.append(charSequence3);
    }

    public static String g0(Iterable iterable, String str, String str2, mu muVar, int i) {
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            muVar = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        f0(iterable, sb, ", ", str3, str4, "...", muVar);
        return sb.toString();
    }

    public static Object h0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        g8.e("List is empty.");
        return null;
    }

    public static Object i0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable j0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList k0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList l0(Collection collection, List list) {
        collection.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static List m0(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return o0(iterable);
        }
        List q0 = q0(iterable);
        Collections.reverse(q0);
        return q0;
    }

    public static List n0(ArrayList arrayList, Comparator comparator) {
        arrayList.getClass();
        if (arrayList.size() <= 1) {
            return o0(arrayList);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List asList = Arrays.asList(array);
        asList.getClass();
        return asList;
    }

    public static List o0(Iterable iterable) {
        iterable.getClass();
        boolean z = iterable instanceof Collection;
        wp wpVar = wp.d;
        if (!z) {
            List q0 = q0(iterable);
            int size = q0.size();
            return size != 0 ? size != 1 ? q0 : px0.H(q0.get(0)) : wpVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return wpVar;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return px0.H(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList p0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List q0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
