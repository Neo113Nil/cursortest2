package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class iw implements ListIterator, j00 {
    public final /* synthetic */ int d;
    public int e;
    public int f;
    public int g;
    public final Object h;

    public iw(gs0 gs0Var, int i) {
        this.d = 3;
        this.h = gs0Var;
        this.e = i - 1;
        this.f = -1;
        this.g = px0.D(gs0Var);
    }

    public void a() {
        int i;
        i = ((AbstractList) ((i30) this.h).h).modCount;
        if (i != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        int i3 = this.d;
        Object obj2 = this.h;
        switch (i3) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                i30 i30Var = (i30) obj2;
                int i4 = this.e;
                this.e = i4 + 1;
                i30Var.add(i4, obj);
                this.f = -1;
                i = ((AbstractList) i30Var).modCount;
                this.g = i;
                return;
            case 2:
                b();
                j30 j30Var = (j30) obj2;
                int i5 = this.e;
                this.e = i5 + 1;
                j30Var.add(i5, obj);
                this.f = -1;
                i2 = ((AbstractList) j30Var).modCount;
                this.g = i2;
                return;
            default:
                c();
                gs0 gs0Var = (gs0) obj2;
                gs0Var.add(this.e + 1, obj);
                this.f = -1;
                this.e++;
                this.g = px0.D(gs0Var);
                return;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((j30) this.h)).modCount;
        if (i != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (px0.D((gs0) this.h) != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        Object obj = this.h;
        switch (i) {
            case 0:
                if (this.e < this.g) {
                    break;
                }
                break;
            case 1:
                if (this.e < ((i30) obj).f) {
                    break;
                }
                break;
            case 2:
                if (this.e < ((j30) obj).e) {
                    break;
                }
                break;
            default:
                if (this.e < ((gs0) obj).size() - 1) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.d) {
            case 0:
                if (this.e > this.f) {
                }
                break;
            case 1:
                if (this.e > 0) {
                }
                break;
            case 2:
                if (this.e > 0) {
                }
                break;
            default:
                if (this.e >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.d;
        Object obj = this.h;
        switch (i) {
            case 0:
                x60 x60Var = ((kw) obj).d;
                int i2 = this.e;
                this.e = i2 + 1;
                Object e = x60Var.e(i2);
                e.getClass();
                return (t50) e;
            case 1:
                a();
                int i3 = this.e;
                i30 i30Var = (i30) obj;
                if (i3 >= i30Var.f) {
                    g8.k();
                    return null;
                }
                this.e = i3 + 1;
                this.f = i3;
                return i30Var.d[i30Var.e + i3];
            case 2:
                b();
                int i4 = this.e;
                j30 j30Var = (j30) obj;
                if (i4 >= j30Var.e) {
                    g8.k();
                    return null;
                }
                this.e = i4 + 1;
                this.f = i4;
                return j30Var.d[i4];
            default:
                c();
                int i5 = this.e + 1;
                this.f = i5;
                gs0 gs0Var = (gs0) obj;
                px0.f(i5, gs0Var.size());
                Object obj2 = gs0Var.get(i5);
                this.e = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.d) {
            case 0:
                return this.e - this.f;
            case 1:
                return this.e;
            case 2:
                return this.e;
            default:
                return this.e + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.d;
        Object obj = this.h;
        switch (i) {
            case 0:
                x60 x60Var = ((kw) obj).d;
                int i2 = this.e - 1;
                this.e = i2;
                Object e = x60Var.e(i2);
                e.getClass();
                return (t50) e;
            case 1:
                a();
                int i3 = this.e;
                if (i3 <= 0) {
                    g8.k();
                    return null;
                }
                int i4 = i3 - 1;
                this.e = i4;
                this.f = i4;
                i30 i30Var = (i30) obj;
                return i30Var.d[i30Var.e + i4];
            case 2:
                b();
                int i5 = this.e;
                if (i5 <= 0) {
                    g8.k();
                    return null;
                }
                int i6 = i5 - 1;
                this.e = i6;
                this.f = i6;
                return ((j30) obj).d[i6];
            default:
                c();
                gs0 gs0Var = (gs0) obj;
                px0.f(this.e, gs0Var.size());
                int i7 = this.e;
                this.f = i7;
                this.e--;
                return gs0Var.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.d) {
            case 0:
                return (this.e - this.f) - 1;
            case 1:
                i = this.e;
                break;
            case 2:
                i = this.e;
                break;
            default:
                return this.e;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        int i3 = this.d;
        Object obj = this.h;
        switch (i3) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                i30 i30Var = (i30) obj;
                a();
                int i4 = this.f;
                if (i4 == -1) {
                    g8.s("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                i30Var.b(i4);
                this.e = this.f;
                this.f = -1;
                i = ((AbstractList) i30Var).modCount;
                this.g = i;
                return;
            case 2:
                j30 j30Var = (j30) obj;
                b();
                int i5 = this.f;
                if (i5 == -1) {
                    g8.s("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                j30Var.b(i5);
                this.e = this.f;
                this.f = -1;
                i2 = ((AbstractList) j30Var).modCount;
                this.g = i2;
                return;
            default:
                c();
                gs0 gs0Var = (gs0) obj;
                gs0Var.remove(this.f);
                this.e--;
                this.f = -1;
                this.g = px0.D(gs0Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.d;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i2 = this.f;
                if (i2 != -1) {
                    ((i30) obj2).set(i2, obj);
                    return;
                } else {
                    g8.s("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i3 = this.f;
                if (i3 != -1) {
                    ((j30) obj2).set(i3, obj);
                    return;
                } else {
                    g8.s("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                gs0 gs0Var = (gs0) obj2;
                c();
                int i4 = this.f;
                if (i4 < 0) {
                    g8.s("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    gs0Var.set(i4, obj);
                    this.g = px0.D(gs0Var);
                    return;
                }
        }
    }

    public iw(j30 j30Var, int i) {
        int i2;
        this.d = 2;
        this.h = j30Var;
        this.e = i;
        this.f = -1;
        i2 = ((AbstractList) j30Var).modCount;
        this.g = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public iw(kw kwVar, int i, int i2) {
        this(kwVar, (i2 & 1) != 0 ? 0 : i, 0, kwVar.d.b);
        this.d = 0;
    }

    public iw(kw kwVar, int i, int i2, int i3) {
        this.d = 0;
        this.h = kwVar;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public iw(i30 i30Var, int i) {
        int i2;
        this.d = 1;
        this.h = i30Var;
        this.e = i;
        this.f = -1;
        i2 = ((AbstractList) i30Var).modCount;
        this.g = i2;
    }
}
