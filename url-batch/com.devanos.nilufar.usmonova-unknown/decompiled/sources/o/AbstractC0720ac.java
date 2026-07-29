package o;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: o.ac, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0720ac extends AbstractC1048fc {
    public static ArrayList A0(Collection collection, Iterable iterable) {
        AbstractC0048Bt.n(collection, "<this>");
        AbstractC0048Bt.n(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC1048fc.f0(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList B0(Collection collection, Object obj) {
        AbstractC0048Bt.n(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object C0(Iterable iterable) {
        AbstractC0048Bt.n(iterable, "<this>");
        if (iterable instanceof List) {
            return D0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object D0(List list) {
        AbstractC0048Bt.n(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object E0(Iterable iterable) {
        AbstractC0048Bt.n(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object F0(List list) {
        AbstractC0048Bt.n(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List G0(Iterable iterable, Comparator comparator) {
        ArrayList arrayList;
        AbstractC0048Bt.n(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        if (!z) {
            if (z) {
                arrayList = K0((Collection) iterable);
            } else {
                ArrayList arrayList2 = new ArrayList();
                H0(iterable, arrayList2);
                arrayList = arrayList2;
            }
            AbstractC0982ec.e0(arrayList, comparator);
            return arrayList;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return J0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC0048Bt.n(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return P6.W(array);
    }

    public static final void H0(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC0048Bt.n(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] I0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List J0(Iterable iterable) {
        ArrayList arrayList;
        AbstractC0048Bt.n(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        if (!z) {
            if (z) {
                arrayList = K0((Collection) iterable);
            } else {
                ArrayList arrayList2 = new ArrayList();
                H0(iterable, arrayList2);
                arrayList = arrayList2;
            }
            return AbstractC0868ct.Q(arrayList);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C1318jk.h;
        }
        if (size != 1) {
            return K0(collection);
        }
        return AbstractC0868ct.J(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList K0(Collection collection) {
        AbstractC0048Bt.n(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set L0(Iterable iterable) {
        AbstractC0048Bt.n(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        H0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set M0(Iterable iterable) {
        AbstractC0048Bt.n(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return AbstractC0773bP.i(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(EB.E(collection.size()));
                H0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            H0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : AbstractC0773bP.i(linkedHashSet2.iterator().next());
            }
        }
        return C1648ok.h;
    }

    public static S6 N0(List list) {
        AbstractC0048Bt.n(list, "<this>");
        return new S6(1, new R6(1, list));
    }

    public static ArrayList O0(List list, List list2) {
        AbstractC0048Bt.n(list, "<this>");
        AbstractC0048Bt.n(list2, "other");
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC0786bc.d0(list), AbstractC0786bc.d0(list2)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new C1619oH(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final int g0(C1955tO c1955tO, int i) {
        if (i >= 0 && i <= AbstractC0868ct.w(c1955tO)) {
            return AbstractC0868ct.w(c1955tO) - i;
        }
        StringBuilder i2 = AbstractC2188wx.i(i, "Element index ", " must be in range [");
        i2.append(new C1197ht(0, AbstractC0868ct.w(c1955tO), 1));
        i2.append("].");
        throw new IndexOutOfBoundsException(i2.toString());
    }

    public static final int h0(C1955tO c1955tO, int i) {
        if (i >= 0 && i <= c1955tO.size()) {
            return c1955tO.size() - i;
        }
        StringBuilder i2 = AbstractC2188wx.i(i, "Position index ", " must be in range [");
        i2.append(new C1197ht(0, c1955tO.size(), 1));
        i2.append("].");
        throw new IndexOutOfBoundsException(i2.toString());
    }

    public static T6 i0(Iterable iterable) {
        AbstractC0048Bt.n(iterable, "<this>");
        return new T6(1, iterable);
    }

    public static boolean j0(Iterable iterable, Object obj) {
        int i;
        AbstractC0048Bt.n(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i2 < 0) {
                    AbstractC0868ct.Y();
                    throw null;
                }
                if (AbstractC0048Bt.h(obj, next)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        } else {
            i = ((List) iterable).indexOf(obj);
        }
        return i >= 0;
    }

    public static List k0(List list) {
        int size = list.size() - 1;
        if (size <= 0) {
            return C1318jk.h;
        }
        if (size == 1) {
            return AbstractC0868ct.J(u0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i = 1; i < size2; i++) {
                arrayList.add(list.get(i));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List l0(List list) {
        AbstractC0048Bt.n(list, "<this>");
        int size = list.size() - 1;
        int i = 0;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(AbstractC1888sN.h(size, "Requested element count ", " is less than zero.").toString());
        }
        if (size == 0) {
            return C1318jk.h;
        }
        if (size >= list.size()) {
            return J0(list);
        }
        if (size == 1) {
            return AbstractC0868ct.J(m0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i++;
            if (i == size) {
                break;
            }
        }
        return AbstractC0868ct.Q(arrayList);
    }

    public static Object m0(Collection collection) {
        AbstractC0048Bt.n(collection, "<this>");
        if (collection instanceof List) {
            return n0((List) collection);
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object n0(List list) {
        AbstractC0048Bt.n(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object o0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object p0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object q0(int i, List list) {
        AbstractC0048Bt.n(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final void r0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(iterable, "<this>");
        AbstractC0048Bt.n(appendable, "buffer");
        AbstractC0048Bt.n(charSequence2, "prefix");
        AbstractC0048Bt.n(charSequence3, "postfix");
        appendable.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                appendable.append(charSequence);
            }
            AbstractC2219xO.c(appendable, obj, interfaceC2114vp);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ void s0(Iterable iterable, StringBuilder sb, String str, String str2, String str3, InterfaceC2114vp interfaceC2114vp, int i) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 64) != 0) {
            interfaceC2114vp = null;
        }
        r0(iterable, sb, str, str2, str3, "...", interfaceC2114vp);
    }

    public static String t0(Iterable iterable, String str, String str2, String str3, InterfaceC2114vp interfaceC2114vp, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            interfaceC2114vp = null;
        }
        AbstractC0048Bt.n(iterable, "<this>");
        StringBuilder sb = new StringBuilder();
        r0(iterable, sb, str4, str5, str6, "...", interfaceC2114vp);
        return sb.toString();
    }

    public static Object u0(Iterable iterable) {
        if (iterable instanceof List) {
            return v0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object v0(List list) {
        AbstractC0048Bt.n(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC0868ct.w(list));
    }

    public static Object w0(List list) {
        AbstractC0048Bt.n(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList x0(Iterable iterable, Object obj) {
        AbstractC0048Bt.n(iterable, "<this>");
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(iterable));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && AbstractC0048Bt.h(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList y0(Iterable iterable, Iterable iterable2) {
        AbstractC0048Bt.n(iterable, "<this>");
        if (iterable instanceof Collection) {
            return A0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC1048fc.f0(arrayList, iterable);
        AbstractC1048fc.f0(arrayList, iterable2);
        return arrayList;
    }

    public static ArrayList z0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return B0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC1048fc.f0(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }
}
