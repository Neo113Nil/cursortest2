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

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class i30 extends t implements RandomAccess, Serializable {
    public Object[] d;
    public final int e;
    public int f;
    public final i30 g;
    public final j30 h;

    public i30(Object[] objArr, int i, int i2, i30 i30Var, j30 j30Var) {
        int i3;
        objArr.getClass();
        j30Var.getClass();
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.g = i30Var;
        this.h = j30Var;
        i3 = ((AbstractList) j30Var).modCount;
        ((AbstractList) this).modCount = i3;
    }

    @Override // defpackage.t
    public final int a() {
        f();
        return this.f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        f();
        int i2 = this.f;
        if (i < 0 || i > i2) {
            g8.m(y6.v("index: ", i, ", size: ", i2));
        } else {
            e(this.e + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        g();
        f();
        int i2 = this.f;
        if (i < 0 || i > i2) {
            g8.m(y6.v("index: ", i, ", size: ", i2));
            return false;
        }
        int size = collection.size();
        d(this.e + i, collection, size);
        return size > 0;
    }

    @Override // defpackage.t
    public final Object b(int i) {
        g();
        f();
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            return h(this.e + i);
        }
        g8.m(y6.v("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.e, this.f);
    }

    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        j30 j30Var = this.h;
        i30 i30Var = this.g;
        if (i30Var != null) {
            i30Var.d(i, collection, i2);
        } else {
            j30 j30Var2 = j30.g;
            j30Var.d(i, collection, i2);
        }
        this.d = j30Var.d;
        this.f += i2;
    }

    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        j30 j30Var = this.h;
        i30 i30Var = this.g;
        if (i30Var != null) {
            i30Var.e(i, obj);
        } else {
            j30 j30Var2 = j30.g;
            j30Var.e(i, obj);
        }
        this.d = j30Var.d;
        this.f++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.d;
            int i = this.f;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (nz.l(objArr[this.e + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        int i;
        i = ((AbstractList) this.h).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (this.h.f) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f();
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            return this.d[this.e + i];
        }
        g8.m(y6.v("index: ", i, ", size: ", i2));
        return null;
    }

    public final Object h(int i) {
        Object h;
        ((AbstractList) this).modCount++;
        i30 i30Var = this.g;
        if (i30Var != null) {
            h = i30Var.h(i);
        } else {
            j30 j30Var = j30.g;
            h = this.h.h(i);
        }
        this.f--;
        return h;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.d;
        int i = this.f;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.e + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        i30 i30Var = this.g;
        if (i30Var != null) {
            i30Var.i(i, i2);
        } else {
            j30 j30Var = j30.g;
            this.h.i(i, i2);
        }
        this.f -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i = 0; i < this.f; i++) {
            if (nz.l(this.d[this.e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.f == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i, int i2, Collection collection, boolean z) {
        int j;
        i30 i30Var = this.g;
        if (i30Var != null) {
            j = i30Var.j(i, i2, collection, z);
        } else {
            j30 j30Var = j30.g;
            j = this.h.j(i, i2, collection, z);
        }
        if (j > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f -= j;
        return j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i = this.f - 1; i >= 0; i--) {
            if (nz.l(this.d[this.e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        f();
        int i2 = this.f;
        if (i >= 0 && i <= i2) {
            return new iw(this, i);
        }
        g8.m(y6.v("index: ", i, ", size: ", i2));
        return null;
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
        return j(this.e, this.f, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        g();
        f();
        return j(this.e, this.f, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        f();
        int i2 = this.f;
        if (i < 0 || i >= i2) {
            g8.m(y6.v("index: ", i, ", size: ", i2));
            return null;
        }
        Object[] objArr = this.d;
        int i3 = this.e;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        a50.m(i, i2, this.f);
        return new i30(this.d, this.e + i, i2 - i, this, this.h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        f();
        int length = objArr.length;
        int i = this.f;
        Object[] objArr2 = this.d;
        int i2 = this.e;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        p8.T(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.f;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return a50.i(this.d, this.e, this.f, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.e + this.f, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.d;
        int i = this.f;
        int i2 = this.e;
        return p8.W(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        g();
        f();
        int size = collection.size();
        d(this.e + this.f, collection, size);
        return size > 0;
    }
}
