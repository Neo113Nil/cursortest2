package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class VD implements List, InterfaceC1726pw {
    public final YD h;

    public VD(YD yd) {
        this.h = yd;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.h.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        YD yd = this.h;
        return yd.f(yd.j, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.h.h();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.h.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        YD yd = this.h;
        yd.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!yd.i(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1807r8.c(i, this);
        return this.h.h[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        YD yd = this.h;
        int i = yd.j;
        if (i <= 0) {
            return -1;
        }
        Object[] objArr = yd.h;
        int i2 = 0;
        while (!AbstractC0048Bt.h(obj, objArr[i2])) {
            i2++;
            if (i2 >= i) {
                return -1;
            }
        }
        return i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.h.k();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new XD(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        YD yd = this.h;
        int i = yd.j;
        if (i <= 0) {
            return -1;
        }
        int i2 = i - 1;
        Object[] objArr = yd.h;
        while (!AbstractC0048Bt.h(obj, objArr[i2])) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
        }
        return i2;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new XD(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.h.m(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        YD yd = this.h;
        yd.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i = yd.j;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            yd.m(it.next());
        }
        return i != yd.j;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        YD yd = this.h;
        int i = yd.j;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(yd.h[i2])) {
                yd.n(i2);
            }
        }
        return i != yd.j;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        AbstractC1807r8.c(i, this);
        Object[] objArr = this.h.h;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.h.j;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        AbstractC1807r8.d(this, i, i2);
        return new WD(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0048Bt.j0(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.h.a(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new XD(i, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        AbstractC1807r8.c(i, this);
        return this.h.n(i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC0048Bt.k0(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.h.f(i, collection);
    }
}
