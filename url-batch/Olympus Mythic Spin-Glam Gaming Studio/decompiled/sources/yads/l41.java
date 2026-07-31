package yads;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes15.dex */
public abstract class l41 extends f41 implements List, RandomAccess {
    public static final i41 c = new i41(um2.f, 0);

    public static um2 a(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (objArr[i] == null) {
                throw new NullPointerException(gg2.a(i, "at index "));
            }
        }
        return b(objArr.length, objArr);
    }

    public static um2 b(int i, Object[] objArr) {
        return i == 0 ? um2.f : new um2(i, objArr);
    }

    public static h41 f() {
        return new h41();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // yads.f41
    public final l41 a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // yads.f41, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (x92.a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && x92.a(it.next(), it2.next())) {
                    }
                }
                return true ^ it2.hasNext();
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj != null) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (obj.equals(get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // yads.f41, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj != null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (obj.equals(get(size))) {
                    return size;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // yads.f41
    public Object writeReplace() {
        return new j41(toArray(f41.b));
    }

    @Override // yads.f41, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final wa3 iterator() {
        return listIterator(0);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public static um2 b(Object[] objArr) {
        if (objArr.length == 0) {
            return um2.f;
        }
        return a((Object[]) objArr.clone());
    }

    public static l41 a(Collection collection) {
        if (collection instanceof f41) {
            l41 a = ((f41) collection).a();
            if (!a.e()) {
                return a;
            }
            Object[] array = a.toArray(f41.b);
            return b(array.length, array);
        }
        return a(collection.toArray());
    }

    @Override // java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final i41 listIterator(int i) {
        hg2.b(i, size());
        if (isEmpty()) {
            return c;
        }
        return new i41(this, i);
    }

    @Override // java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public l41 subList(int i, int i2) {
        hg2.a(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return um2.f;
        }
        return new k41(this, i, i3);
    }

    @Override // yads.f41
    public int a(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }
}
