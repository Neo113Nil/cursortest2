package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: o.xB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2206xB extends I {
    public final /* synthetic */ int h;
    public final C2140wB i;

    public /* synthetic */ C2206xB(C2140wB c2140wB, int i) {
        this.h = i;
        this.i = c2140wB;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.h) {
            case 0:
                AbstractC0048Bt.n((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.h) {
            case 0:
                AbstractC0048Bt.n(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                AbstractC0048Bt.n(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.h) {
            case 0:
                this.i.clear();
                break;
            default:
                this.i.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                AbstractC0048Bt.n(entry, "element");
                return this.i.f(entry);
            default:
                return this.i.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.h) {
            case 0:
                AbstractC0048Bt.n(collection, "elements");
                return this.i.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.h) {
        }
        return this.i.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.h) {
            case 0:
                C2140wB c2140wB = this.i;
                c2140wB.getClass();
                return new C1942tB(c2140wB, 0);
            default:
                C2140wB c2140wB2 = this.i;
                c2140wB2.getClass();
                return new C1942tB(c2140wB2, 1);
        }
    }

    @Override // o.I
    public final int j() {
        switch (this.h) {
        }
        return this.i.p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.h) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    AbstractC0048Bt.n(entry, "element");
                    C2140wB c2140wB = this.i;
                    c2140wB.getClass();
                    c2140wB.b();
                    int h = c2140wB.h(entry.getKey());
                    if (h >= 0) {
                        Object[] objArr = c2140wB.i;
                        AbstractC0048Bt.k(objArr);
                        if (AbstractC0048Bt.h(objArr[h], entry.getValue())) {
                            c2140wB.m(h);
                            break;
                        }
                    }
                }
                break;
            default:
                C2140wB c2140wB2 = this.i;
                c2140wB2.b();
                int h2 = c2140wB2.h(obj);
                if (h2 >= 0) {
                    c2140wB2.m(h2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.h) {
            case 0:
                AbstractC0048Bt.n(collection, "elements");
                this.i.b();
                break;
            default:
                AbstractC0048Bt.n(collection, "elements");
                this.i.b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.h) {
            case 0:
                AbstractC0048Bt.n(collection, "elements");
                this.i.b();
                break;
            default:
                AbstractC0048Bt.n(collection, "elements");
                this.i.b();
                break;
        }
        return super.retainAll(collection);
    }
}
