package o;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: o.cA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0823cA extends G implements RandomAccess, Serializable {
    public Object[] h;
    public final int i;
    public int j;
    public final C0823cA k;
    public final C0889dA l;

    public C0823cA(Object[] objArr, int i, int i2, C0823cA c0823cA, C0889dA c0889dA) {
        int i3;
        AbstractC0048Bt.n(objArr, "backing");
        AbstractC0048Bt.n(c0889dA, "root");
        this.h = objArr;
        this.i = i;
        this.j = i2;
        this.k = c0823cA;
        this.l = c0889dA;
        i3 = ((AbstractList) c0889dA).modCount;
        ((AbstractList) this).modCount = i3;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        p();
        o();
        n(this.i + this.j, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC0048Bt.n(collection, "elements");
        p();
        o();
        int size = collection.size();
        m(this.i + this.j, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        p();
        o();
        r(this.i, this.j);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        o();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.h;
            int i = this.j;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (AbstractC0048Bt.h(objArr[this.i + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        o();
        int i2 = this.j;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1888sN.g(i, i2, "index: ", ", size: "));
        }
        return this.h[this.i + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        o();
        Object[] objArr = this.h;
        int i = this.j;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.i + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        o();
        for (int i = 0; i < this.j; i++) {
            if (AbstractC0048Bt.h(this.h[this.i + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        o();
        return this.j == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // o.G
    public final int j() {
        o();
        return this.j;
    }

    @Override // o.G
    public final Object k(int i) {
        p();
        o();
        int i2 = this.j;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1888sN.g(i, i2, "index: ", ", size: "));
        }
        return q(this.i + i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        o();
        for (int i = this.j - 1; i >= 0; i--) {
            if (AbstractC0048Bt.h(this.h[this.i + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void m(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        C0889dA c0889dA = this.l;
        C0823cA c0823cA = this.k;
        if (c0823cA != null) {
            c0823cA.m(i, collection, i2);
        } else {
            C0889dA c0889dA2 = C0889dA.k;
            c0889dA.m(i, collection, i2);
        }
        this.h = c0889dA.h;
        this.j += i2;
    }

    public final void n(int i, Object obj) {
        ((AbstractList) this).modCount++;
        C0889dA c0889dA = this.l;
        C0823cA c0823cA = this.k;
        if (c0823cA != null) {
            c0823cA.n(i, obj);
        } else {
            C0889dA c0889dA2 = C0889dA.k;
            c0889dA.n(i, obj);
        }
        this.h = c0889dA.h;
        this.j++;
    }

    public final void o() {
        int i;
        i = ((AbstractList) this.l).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void p() {
        if (this.l.j) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object q(int i) {
        Object q;
        ((AbstractList) this).modCount++;
        C0823cA c0823cA = this.k;
        if (c0823cA != null) {
            q = c0823cA.q(i);
        } else {
            C0889dA c0889dA = C0889dA.k;
            q = this.l.q(i);
        }
        this.j--;
        return q;
    }

    public final void r(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        C0823cA c0823cA = this.k;
        if (c0823cA != null) {
            c0823cA.r(i, i2);
        } else {
            C0889dA c0889dA = C0889dA.k;
            this.l.r(i, i2);
        }
        this.j -= i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        p();
        o();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            k(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        AbstractC0048Bt.n(collection, "elements");
        p();
        o();
        return s(this.i, this.j, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        AbstractC0048Bt.n(collection, "elements");
        p();
        o();
        return s(this.i, this.j, collection, true) > 0;
    }

    public final int s(int i, int i2, Collection collection, boolean z) {
        int s;
        C0823cA c0823cA = this.k;
        if (c0823cA != null) {
            s = c0823cA.s(i, i2, collection, z);
        } else {
            C0889dA c0889dA = C0889dA.k;
            s = this.l.s(i, i2, collection, z);
        }
        if (s > 0) {
            ((AbstractList) this).modCount++;
        }
        this.j -= s;
        return s;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        p();
        o();
        int i2 = this.j;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1888sN.g(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.h;
        int i3 = this.i;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        PX.v(i, i2, this.j);
        return new C0823cA(this.h, this.i + i, i2 - i, this, this.l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "array");
        o();
        int length = objArr.length;
        int i = this.j;
        int i2 = this.i;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.h, i2, i + i2, objArr.getClass());
            AbstractC0048Bt.m(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        P6.b0(this.h, objArr, 0, i2, i + i2);
        int i3 = this.j;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        o();
        return AbstractC1807r8.f(this.h, this.i, this.j, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        o();
        int i2 = this.j;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC1888sN.g(i, i2, "index: ", ", size: "));
        }
        return new C2050ur(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        p();
        o();
        int i2 = this.j;
        if (i >= 0 && i <= i2) {
            n(this.i + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC1888sN.g(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        AbstractC0048Bt.n(collection, "elements");
        p();
        o();
        int i2 = this.j;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            m(this.i + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC1888sN.g(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        o();
        Object[] objArr = this.h;
        int i = this.j;
        int i2 = this.i;
        return P6.f0(objArr, i2, i + i2);
    }
}
