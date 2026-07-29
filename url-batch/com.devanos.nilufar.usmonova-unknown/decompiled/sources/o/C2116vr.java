package o;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: o.vr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2116vr implements List, InterfaceC1594nw {
    public final int h;
    public final int i;
    public final /* synthetic */ C2182wr j;

    public C2116vr(C2182wr c2182wr, int i, int i2) {
        this.j = c2182wr;
        this.h = i;
        this.i = i2;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof TC) && indexOf((TC) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((TC) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object obj = this.j.h[i + this.h];
        AbstractC0048Bt.l(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (TC) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof TC)) {
            return -1;
        }
        TC tc = (TC) obj;
        int i = this.h;
        int i2 = this.i;
        if (i <= i2) {
            int i3 = i;
            while (!AbstractC0048Bt.h(this.j.h[i3], tc)) {
                if (i3 != i2) {
                    i3++;
                }
            }
            return i3 - i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.h;
        return new C2050ur(this.j, i, i, this.i);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof TC)) {
            return -1;
        }
        TC tc = (TC) obj;
        int i = this.i;
        int i2 = this.h;
        if (i2 <= i) {
            while (!AbstractC0048Bt.h(this.j.h[i], tc)) {
                if (i != i2) {
                    i--;
                }
            }
            return i - i2;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i = this.h;
        return new C2050ur(this.j, i, i, this.i);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.i - this.h;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.h;
        return new C2116vr(this.j, i + i3, i3 + i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0048Bt.j0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.h;
        int i3 = this.i;
        return new C2050ur(this.j, i + i2, i2, i3);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC0048Bt.k0(this, objArr);
    }
}
