package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class C6 implements Collection, InterfaceC1594nw {
    public final Object[] h;
    public final boolean i;

    public C6(Object[] objArr, boolean z) {
        AbstractC0048Bt.n(objArr, "values");
        this.h = objArr;
        this.i = z;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return P6.Y(obj, this.h);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC0048Bt.n(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!P6.Y(it.next(), this.h)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.h.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC1305jX.z(this.h);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.h.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "array");
        return AbstractC0048Bt.k0(this, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.h;
        AbstractC0048Bt.n(objArr, "<this>");
        if (this.i && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        AbstractC0048Bt.m(copyOf, "copyOf(...)");
        return copyOf;
    }
}
