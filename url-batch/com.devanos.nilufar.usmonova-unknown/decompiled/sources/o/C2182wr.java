package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: o.wr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2182wr implements List, InterfaceC1594nw {
    public int k;
    public Object[] h = new Object[16];
    public long[] i = new long[16];
    public int j = -1;
    public boolean l = true;

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
        this.j = -1;
        l();
        this.l = true;
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
        Object obj = this.h[i];
        AbstractC0048Bt.l(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (TC) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof TC)) {
            return -1;
        }
        TC tc = (TC) obj;
        int w = AbstractC0868ct.w(this);
        if (w >= 0) {
            int i = 0;
            while (!AbstractC0048Bt.h(this.h[i], tc)) {
                if (i != w) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.k == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2050ur(this, 0, 7);
    }

    public final long j() {
        long b = EB.b(Float.POSITIVE_INFINITY, false);
        int i = this.j + 1;
        int w = AbstractC0868ct.w(this);
        if (i <= w) {
            while (true) {
                long j = this.i[i];
                if (PX.w(j, b) < 0) {
                    b = j;
                }
                if (Float.intBitsToFloat((int) (b >> 32)) < 0.0f && ((int) (4294967295L & b)) != 0) {
                    return b;
                }
                if (i == w) {
                    break;
                }
                i++;
            }
        }
        return b;
    }

    public final void k(TC tc, float f, boolean z, InterfaceC1455lp interfaceC1455lp) {
        int i = this.j;
        int i2 = i + 1;
        this.j = i2;
        Object[] objArr = this.h;
        if (i2 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            AbstractC0048Bt.m(copyOf, "copyOf(this, newSize)");
            this.h = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.i, length);
            AbstractC0048Bt.m(copyOf2, "copyOf(this, newSize)");
            this.i = copyOf2;
        }
        Object[] objArr2 = this.h;
        int i3 = this.j;
        objArr2[i3] = tc;
        this.i[i3] = EB.b(f, z);
        l();
        interfaceC1455lp.invoke();
        this.j = i;
    }

    public final void l() {
        int i = this.j + 1;
        int w = AbstractC0868ct.w(this);
        if (i <= w) {
            while (true) {
                this.h[i] = null;
                if (i == w) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.k = this.j + 1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof TC)) {
            return -1;
        }
        TC tc = (TC) obj;
        for (int w = AbstractC0868ct.w(this); -1 < w; w--) {
            if (AbstractC0048Bt.h(this.h[w], tc)) {
                return w;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C2050ur(this, 0, 7);
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
        return this.k;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new C2116vr(this, i, i2);
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
        return new C2050ur(this, i, 6);
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
