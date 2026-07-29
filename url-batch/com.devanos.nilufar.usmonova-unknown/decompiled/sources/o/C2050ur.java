package o;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: o.ur, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2050ur implements ListIterator, InterfaceC1594nw {
    public final /* synthetic */ int h;
    public int i;
    public int j;
    public int k;
    public final Object l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2050ur(C2182wr c2182wr, int i, int i2) {
        this(c2182wr, (i2 & 1) != 0 ? 0 : i, 0, c2182wr.k);
        this.h = 0;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((C0823cA) this.l).l).modCount;
        if (i != this.k) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                C0823cA c0823cA = (C0823cA) this.l;
                int i3 = this.i;
                this.i = i3 + 1;
                c0823cA.add(i3, obj);
                this.j = -1;
                i = ((AbstractList) c0823cA).modCount;
                this.k = i;
                return;
            default:
                b();
                C0889dA c0889dA = (C0889dA) this.l;
                int i4 = this.i;
                this.i = i4 + 1;
                c0889dA.add(i4, obj);
                this.j = -1;
                i2 = ((AbstractList) c0889dA).modCount;
                this.k = i2;
                return;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((C0889dA) this.l)).modCount;
        if (i != this.k) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.h) {
            case 0:
                if (this.i < this.k) {
                }
                break;
            case 1:
                if (this.i < ((C0823cA) this.l).j) {
                }
                break;
            default:
                if (this.i < ((C0889dA) this.l).i) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.h) {
            case 0:
                if (this.i > this.j) {
                }
                break;
            case 1:
                if (this.i > 0) {
                }
                break;
            default:
                if (this.i > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                Object[] objArr = ((C2182wr) this.l).h;
                int i = this.i;
                this.i = i + 1;
                Object obj = objArr[i];
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (TC) obj;
            case 1:
                a();
                int i2 = this.i;
                C0823cA c0823cA = (C0823cA) this.l;
                if (i2 >= c0823cA.j) {
                    throw new NoSuchElementException();
                }
                this.i = i2 + 1;
                this.j = i2;
                return c0823cA.h[c0823cA.i + i2];
            default:
                b();
                int i3 = this.i;
                C0889dA c0889dA = (C0889dA) this.l;
                if (i3 >= c0889dA.i) {
                    throw new NoSuchElementException();
                }
                this.i = i3 + 1;
                this.j = i3;
                return c0889dA.h[i3];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.h) {
        }
        return this.i;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.h) {
            case 0:
                Object[] objArr = ((C2182wr) this.l).h;
                int i = this.i - 1;
                this.i = i;
                Object obj = objArr[i];
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (TC) obj;
            case 1:
                a();
                int i2 = this.i;
                if (i2 <= 0) {
                    throw new NoSuchElementException();
                }
                int i3 = i2 - 1;
                this.i = i3;
                this.j = i3;
                C0823cA c0823cA = (C0823cA) this.l;
                return c0823cA.h[c0823cA.i + i3];
            default:
                b();
                int i4 = this.i;
                if (i4 <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i4 - 1;
                this.i = i5;
                this.j = i5;
                return ((C0889dA) this.l).h[i5];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.h) {
            case 0:
                i = this.i - this.j;
                break;
            case 1:
                i = this.i;
                break;
            default:
                i = this.i;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                C0823cA c0823cA = (C0823cA) this.l;
                a();
                int i3 = this.j;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c0823cA.k(i3);
                this.i = this.j;
                this.j = -1;
                i = ((AbstractList) c0823cA).modCount;
                this.k = i;
                return;
            default:
                C0889dA c0889dA = (C0889dA) this.l;
                b();
                int i4 = this.j;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c0889dA.k(i4);
                this.i = this.j;
                this.j = -1;
                i2 = ((AbstractList) c0889dA).modCount;
                this.k = i2;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i = this.j;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C0823cA) this.l).set(i, obj);
                return;
            default:
                b();
                int i2 = this.j;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C0889dA) this.l).set(i2, obj);
                return;
        }
    }

    public C2050ur(C2182wr c2182wr, int i, int i2, int i3) {
        this.h = 0;
        this.l = c2182wr;
        this.i = i;
        this.j = i2;
        this.k = i3;
    }

    public C2050ur(C0889dA c0889dA, int i) {
        int i2;
        this.h = 2;
        this.l = c0889dA;
        this.i = i;
        this.j = -1;
        i2 = ((AbstractList) c0889dA).modCount;
        this.k = i2;
    }

    public C2050ur(C0823cA c0823cA, int i) {
        int i2;
        this.h = 1;
        this.l = c0823cA;
        this.i = i;
        this.j = -1;
        i2 = ((AbstractList) c0823cA).modCount;
        this.k = i2;
    }
}
