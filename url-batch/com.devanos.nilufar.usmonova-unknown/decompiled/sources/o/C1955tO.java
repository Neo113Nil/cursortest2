package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: o.tO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1955tO extends G {
    public final ArrayList h;

    public C1955tO(ArrayList arrayList) {
        this.h = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.h.add(AbstractC0720ac.h0(this, i), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.h.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.h.get(AbstractC0720ac.g0(this, i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C1889sO(this, 0);
    }

    @Override // o.G
    public final int j() {
        return this.h.size();
    }

    @Override // o.G
    public final Object k(int i) {
        return this.h.remove(AbstractC0720ac.g0(this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new C1889sO(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.h.set(AbstractC0720ac.g0(this, i), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C1889sO(this, i);
    }
}
