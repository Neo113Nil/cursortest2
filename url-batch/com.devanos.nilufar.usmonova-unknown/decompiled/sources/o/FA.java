package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final class FA implements Collection, InterfaceC1594nw {
    public static final FA j = new FA(C1318jk.h);
    public final List h;
    public final int i;

    public FA(List list) {
        this.h = list;
        this.i = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
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
        if (!(obj instanceof EA)) {
            return false;
        }
        return this.h.contains((EA) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.h.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FA) {
            return AbstractC0048Bt.h(this.h, ((FA) obj).h);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.h.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.h.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.h.iterator();
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
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.i;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC0048Bt.j0(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.h + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC0048Bt.k0(this, objArr);
    }
}
