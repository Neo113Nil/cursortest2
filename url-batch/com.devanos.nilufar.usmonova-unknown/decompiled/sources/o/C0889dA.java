package o;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: o.dA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0889dA extends G implements RandomAccess, Serializable {
    public static final C0889dA k;
    public Object[] h;
    public int i;
    public boolean j;

    static {
        C0889dA c0889dA = new C0889dA(0);
        c0889dA.j = true;
        k = c0889dA;
    }

    public C0889dA(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.h = new Object[i];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        o();
        int i = this.i;
        ((AbstractList) this).modCount++;
        p(i, 1);
        this.h[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC0048Bt.n(collection, "elements");
        o();
        int size = collection.size();
        m(this.i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        o();
        r(0, this.i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.h;
            int i = this.i;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (AbstractC0048Bt.h(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.i;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1888sN.g(i, i2, "index: ", ", size: "));
        }
        return this.h[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.h;
        int i = this.i;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.i; i++) {
            if (AbstractC0048Bt.h(this.h[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.i == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // o.G
    public final int j() {
        return this.i;
    }

    @Override // o.G
    public final Object k(int i) {
        o();
        int i2 = this.i;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1888sN.g(i, i2, "index: ", ", size: "));
        }
        return q(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.i - 1; i >= 0; i--) {
            if (AbstractC0048Bt.h(this.h[i], obj)) {
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
        p(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.h[i + i3] = it.next();
        }
    }

    public final void n(int i, Object obj) {
        ((AbstractList) this).modCount++;
        p(i, 1);
        this.h[i] = obj;
    }

    public final void o() {
        if (this.j) {
            throw new UnsupportedOperationException();
        }
    }

    public final void p(int i, int i2) {
        int i3 = this.i + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.h;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr, i4);
            AbstractC0048Bt.m(copyOf, "copyOf(...)");
            this.h = copyOf;
        }
        Object[] objArr2 = this.h;
        P6.b0(objArr2, objArr2, i + i2, i, this.i);
        this.i += i2;
    }

    public final Object q(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.h;
        Object obj = objArr[i];
        P6.b0(objArr, objArr, i, i + 1, this.i);
        Object[] objArr2 = this.h;
        int i2 = this.i - 1;
        AbstractC0048Bt.n(objArr2, "<this>");
        objArr2[i2] = null;
        this.i--;
        return obj;
    }

    public final void r(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.h;
        P6.b0(objArr, objArr, i, i + i2, this.i);
        Object[] objArr2 = this.h;
        int i3 = this.i;
        AbstractC1807r8.V(objArr2, i3 - i2, i3);
        this.i -= i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        o();
        return s(0, this.i, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        AbstractC0048Bt.n(collection, "elements");
        o();
        return s(0, this.i, collection, true) > 0;
    }

    public final int s(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.h[i5]) == z) {
                Object[] objArr = this.h;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.h;
        P6.b0(objArr2, objArr2, i + i4, i2 + i, this.i);
        Object[] objArr3 = this.h;
        int i7 = this.i;
        AbstractC1807r8.V(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.i -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        o();
        int i2 = this.i;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1888sN.g(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.h;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        PX.v(i, i2, this.i);
        return new C0823cA(this.h, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "array");
        int length = objArr.length;
        int i = this.i;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.h, 0, i, objArr.getClass());
            AbstractC0048Bt.m(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        P6.b0(this.h, objArr, 0, 0, i);
        int i2 = this.i;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC1807r8.f(this.h, 0, this.i, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.i;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC1888sN.g(i, i2, "index: ", ", size: "));
        }
        return new C2050ur(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        AbstractC0048Bt.n(collection, "elements");
        o();
        int i2 = this.i;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            m(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC1888sN.g(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        o();
        int i2 = this.i;
        if (i >= 0 && i <= i2) {
            ((AbstractList) this).modCount++;
            p(i, 1);
            this.h[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC1888sN.g(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return P6.f0(this.h, 0, this.i);
    }
}
