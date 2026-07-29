package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class WD implements List, InterfaceC1726pw {
    public final Object h;
    public final int i;
    public int j;

    public WD(List list, int i, int i2) {
        this.h = list;
        this.i = i;
        this.j = i2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.j;
        this.j = i + 1;
        this.h.add(i, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        this.h.addAll(i + this.i, collection);
        this.j = collection.size() + this.j;
        return collection.size() > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.j - 1;
        int i2 = this.i;
        if (i2 <= i) {
            while (true) {
                this.h.remove(i);
                if (i == i2) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.j = i2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.j;
        for (int i2 = this.i; i2 < i; i2++) {
            if (AbstractC0048Bt.h(this.h.get(i2), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1807r8.c(i, this);
        return this.h.get(i + this.i);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.j;
        int i2 = this.i;
        for (int i3 = i2; i3 < i; i3++) {
            if (AbstractC0048Bt.h(this.h.get(i3), obj)) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.j == this.i;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new XD(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.j - 1;
        int i2 = this.i;
        if (i2 > i) {
            return -1;
        }
        while (!AbstractC0048Bt.h(this.h.get(i), obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new XD(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.j;
        for (int i2 = this.i; i2 < i; i2++) {
            ?? r2 = this.h;
            if (AbstractC0048Bt.h(r2.get(i2), obj)) {
                r2.remove(i2);
                this.j--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.j;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.j;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.j;
        int i2 = i - 1;
        int i3 = this.i;
        if (i3 <= i2) {
            while (true) {
                ?? r3 = this.h;
                if (!collection.contains(r3.get(i2))) {
                    r3.remove(i2);
                    this.j--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        return i != this.j;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i, Object obj) {
        AbstractC1807r8.c(i, this);
        return this.h.set(i + this.i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.j - this.i;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.h.add(i + this.i, obj);
        this.j++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new XD(i, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC0048Bt.k0(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.h.addAll(this.j, collection);
        this.j = collection.size() + this.j;
        return collection.size() > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i) {
        AbstractC1807r8.c(i, this);
        this.j--;
        return this.h.remove(i + this.i);
    }
}
