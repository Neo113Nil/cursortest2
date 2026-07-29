package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class VQ extends I implements Serializable {
    public static final VQ i;
    public final C2140wB h;

    static {
        C2140wB c2140wB = C2140wB.u;
        i = new VQ(C2140wB.u);
    }

    public VQ(C2140wB c2140wB) {
        AbstractC0048Bt.n(c2140wB, "backing");
        this.h = c2140wB;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.h.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        AbstractC0048Bt.n(collection, "elements");
        this.h.b();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.h.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.h.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.h.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C2140wB c2140wB = this.h;
        c2140wB.getClass();
        return new C1942tB(c2140wB, 1);
    }

    @Override // o.I
    public final int j() {
        return this.h.p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C2140wB c2140wB = this.h;
        c2140wB.b();
        int h = c2140wB.h(obj);
        if (h < 0) {
            return false;
        }
        c2140wB.m(h);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        AbstractC0048Bt.n(collection, "elements");
        this.h.b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        AbstractC0048Bt.n(collection, "elements");
        this.h.b();
        return super.retainAll(collection);
    }
}
