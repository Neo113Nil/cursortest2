package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class yp extends m implements RandomAccess, Serializable {
    public Object[] f;
    public final int g;
    public int h;
    public final yp i;
    public final zp j;

    public yp(Object[] objArr, int i, int i2, yp ypVar, zp zpVar) {
        int i3;
        objArr.getClass();
        zpVar.getClass();
        this.f = objArr;
        this.g = i;
        this.h = i2;
        this.i = ypVar;
        this.j = zpVar;
        i3 = ((AbstractList) zpVar).modCount;
        ((AbstractList) this).modCount = i3;
    }

    @Override // defpackage.m
    public final int a() {
        f();
        return this.h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        f();
        int i2 = this.h;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(n20.d(i, i2, "index: ", ", size: "));
        }
        e(this.g + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        g();
        f();
        int i2 = this.h;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(n20.d(i, i2, "index: ", ", size: "));
        }
        int size = collection.size();
        d(this.g + i, collection, size);
        return size > 0;
    }

    @Override // defpackage.m
    public final Object b(int i) {
        g();
        f();
        int i2 = this.h;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(n20.d(i, i2, "index: ", ", size: "));
        }
        return h(this.g + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.g, this.h);
    }

    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        zp zpVar = this.j;
        yp ypVar = this.i;
        if (ypVar != null) {
            ypVar.d(i, collection, i2);
        } else {
            zp zpVar2 = zp.i;
            zpVar.d(i, collection, i2);
        }
        this.f = zpVar.f;
        this.h += i2;
    }

    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        zp zpVar = this.j;
        yp ypVar = this.i;
        if (ypVar != null) {
            ypVar.e(i, obj);
        } else {
            zp zpVar2 = zp.i;
            zpVar.e(i, obj);
        }
        this.f = zpVar.f;
        this.h++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f;
            int i = this.h;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (oo.b(objArr[this.g + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        int i;
        i = ((AbstractList) this.j).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (this.j.h) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f();
        int i2 = this.h;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(n20.d(i, i2, "index: ", ", size: "));
        }
        return this.f[this.g + i];
    }

    public final Object h(int i) {
        Object h;
        ((AbstractList) this).modCount++;
        yp ypVar = this.i;
        if (ypVar != null) {
            h = ypVar.h(i);
        } else {
            zp zpVar = zp.i;
            h = this.j.h(i);
        }
        this.h--;
        return h;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.f;
        int i = this.h;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.g + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        yp ypVar = this.i;
        if (ypVar != null) {
            ypVar.i(i, i2);
        } else {
            zp zpVar = zp.i;
            this.j.i(i, i2);
        }
        this.h -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i = 0; i < this.h; i++) {
            if (oo.b(this.f[this.g + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.h == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i, int i2, Collection collection, boolean z) {
        int j;
        yp ypVar = this.i;
        if (ypVar != null) {
            j = ypVar.j(i, i2, collection, z);
        } else {
            zp zpVar = zp.i;
            j = this.j.j(i, i2, collection, z);
        }
        if (j > 0) {
            ((AbstractList) this).modCount++;
        }
        this.h -= j;
        return j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i = this.h - 1; i >= 0; i--) {
            if (oo.b(this.f[this.g + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        f();
        int i2 = this.h;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(n20.d(i, i2, "index: ", ", size: "));
        }
        return new xp(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        f();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        g();
        f();
        return j(this.g, this.h, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        g();
        f();
        return j(this.g, this.h, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        f();
        int i2 = this.h;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(n20.d(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.f;
        int i3 = this.g;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        m60.j(i, i2, this.h);
        return new yp(this.f, this.g + i, i2 - i, this, this.j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        f();
        int length = objArr.length;
        int i = this.h;
        Object[] objArr2 = this.f;
        int i2 = this.g;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        o6.o0(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.h;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return g8.c(this.f, this.g, this.h, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.g + this.h, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.f;
        int i = this.h;
        int i2 = this.g;
        int i3 = i + i2;
        objArr.getClass();
        g8.r(i3, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i2, i3);
        copyOfRange.getClass();
        return copyOfRange;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        g();
        f();
        int size = collection.size();
        d(this.g + this.h, collection, size);
        return size > 0;
    }
}
