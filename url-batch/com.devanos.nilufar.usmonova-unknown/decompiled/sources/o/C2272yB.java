package o;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.yB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2272yB extends AbstractCollection implements Collection, InterfaceC1660ow {
    public final /* synthetic */ int h;
    public final Object i;

    public /* synthetic */ C2272yB(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.h) {
            case 0:
                AbstractC0048Bt.n(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.h) {
            case 0:
                ((C2140wB) this.i).clear();
                break;
            default:
                ((HH) this.i).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.h) {
            case 0:
                return ((C2140wB) this.i).containsValue(obj);
            default:
                return ((HH) this.i).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.h) {
            case 0:
                return ((C2140wB) this.i).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.h) {
            case 0:
                C2140wB c2140wB = (C2140wB) this.i;
                c2140wB.getClass();
                return new C1942tB(c2140wB, 2);
            default:
                HH hh = (HH) this.i;
                CW[] cwArr = new CW[8];
                for (int i = 0; i < 8; i++) {
                    cwArr[i] = new DW(2);
                }
                return new SH(hh, cwArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.h) {
            case 0:
                C2140wB c2140wB = (C2140wB) this.i;
                c2140wB.b();
                int j = c2140wB.j(obj);
                if (j < 0) {
                    return false;
                }
                c2140wB.m(j);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.h) {
            case 0:
                AbstractC0048Bt.n(collection, "elements");
                ((C2140wB) this.i).b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.h) {
            case 0:
                AbstractC0048Bt.n(collection, "elements");
                ((C2140wB) this.i).b();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.h) {
            case 0:
                return ((C2140wB) this.i).p;
            default:
                return ((HH) this.i).size();
        }
    }
}
