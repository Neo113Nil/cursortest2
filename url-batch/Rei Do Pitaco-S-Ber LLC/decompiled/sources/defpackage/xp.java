package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class xp implements ListIterator, vo {
    public int g;
    public int i;
    public final m j;
    public final /* synthetic */ int f = 0;
    public int h = -1;

    public xp(zp zpVar, int i) {
        int i2;
        this.j = zpVar;
        this.g = i;
        i2 = ((AbstractList) zpVar).modCount;
        this.i = i2;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((yp) this.j).j).modCount;
        if (i != this.i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        int i3 = this.f;
        m mVar = this.j;
        switch (i3) {
            case 0:
                a();
                yp ypVar = (yp) mVar;
                int i4 = this.g;
                this.g = i4 + 1;
                ypVar.add(i4, obj);
                this.h = -1;
                i = ((AbstractList) ypVar).modCount;
                this.i = i;
                break;
            default:
                b();
                zp zpVar = (zp) mVar;
                int i5 = this.g;
                this.g = i5 + 1;
                zpVar.add(i5, obj);
                this.h = -1;
                i2 = ((AbstractList) zpVar).modCount;
                this.i = i2;
                break;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((zp) this.j)).modCount;
        if (i != this.i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f;
        m mVar = this.j;
        switch (i) {
            case 0:
                if (this.g < ((yp) mVar).h) {
                    break;
                }
                break;
            default:
                if (this.g < ((zp) mVar).g) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f) {
            case 0:
                if (this.g > 0) {
                }
                break;
            default:
                if (this.g > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f;
        m mVar = this.j;
        switch (i) {
            case 0:
                a();
                int i2 = this.g;
                yp ypVar = (yp) mVar;
                if (i2 >= ypVar.h) {
                    throw new NoSuchElementException();
                }
                this.g = i2 + 1;
                this.h = i2;
                return ypVar.f[ypVar.g + i2];
            default:
                b();
                int i3 = this.g;
                zp zpVar = (zp) mVar;
                if (i3 >= zpVar.g) {
                    throw new NoSuchElementException();
                }
                this.g = i3 + 1;
                this.h = i3;
                return zpVar.f[i3];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f) {
        }
        return this.g;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f;
        m mVar = this.j;
        switch (i) {
            case 0:
                a();
                int i2 = this.g;
                if (i2 <= 0) {
                    throw new NoSuchElementException();
                }
                int i3 = i2 - 1;
                this.g = i3;
                this.h = i3;
                yp ypVar = (yp) mVar;
                return ypVar.f[ypVar.g + i3];
            default:
                b();
                int i4 = this.g;
                if (i4 <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i4 - 1;
                this.g = i5;
                this.h = i5;
                return ((zp) mVar).f[i5];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f) {
            case 0:
                i = this.g;
                break;
            default:
                i = this.g;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        int i3 = this.f;
        m mVar = this.j;
        switch (i3) {
            case 0:
                yp ypVar = (yp) mVar;
                a();
                int i4 = this.h;
                if (i4 == -1) {
                    l8.u("Call next() or previous() before removing element from the iterator.");
                    break;
                } else {
                    ypVar.b(i4);
                    this.g = this.h;
                    this.h = -1;
                    i = ((AbstractList) ypVar).modCount;
                    this.i = i;
                    break;
                }
            default:
                zp zpVar = (zp) mVar;
                b();
                int i5 = this.h;
                if (i5 == -1) {
                    l8.u("Call next() or previous() before removing element from the iterator.");
                    break;
                } else {
                    zpVar.b(i5);
                    this.g = this.h;
                    this.h = -1;
                    i2 = ((AbstractList) zpVar).modCount;
                    this.i = i2;
                    break;
                }
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f;
        m mVar = this.j;
        switch (i) {
            case 0:
                a();
                int i2 = this.h;
                if (i2 == -1) {
                    l8.u("Call next() or previous() before replacing element from the iterator.");
                    break;
                } else {
                    ((yp) mVar).set(i2, obj);
                    break;
                }
            default:
                b();
                int i3 = this.h;
                if (i3 == -1) {
                    l8.u("Call next() or previous() before replacing element from the iterator.");
                    break;
                } else {
                    ((zp) mVar).set(i3, obj);
                    break;
                }
        }
    }

    public xp(yp ypVar, int i) {
        int i2;
        this.j = ypVar;
        this.g = i;
        i2 = ((AbstractList) ypVar).modCount;
        this.i = i2;
    }
}
