package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class zp extends m implements RandomAccess, Serializable {
    public static final zp i;
    public Object[] f;
    public int g;
    public boolean h;

    static {
        zp zpVar = new zp(0);
        zpVar.h = true;
        i = zpVar;
    }

    public zp(int i2) {
        if (i2 >= 0) {
            this.f = new Object[i2];
        } else {
            l8.l("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // defpackage.m
    public final int a() {
        return this.g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        f();
        int i3 = this.g;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(n20.d(i2, i3, "index: ", ", size: "));
        }
        ((AbstractList) this).modCount++;
        g(i2, 1);
        this.f[i2] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        collection.getClass();
        f();
        int i3 = this.g;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(n20.d(i2, i3, "index: ", ", size: "));
        }
        int size = collection.size();
        d(i2, collection, size);
        return size > 0;
    }

    @Override // defpackage.m
    public final Object b(int i2) {
        f();
        int i3 = this.g;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(n20.d(i2, i3, "index: ", ", size: "));
        }
        return h(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        i(0, this.g);
    }

    public final void d(int i2, Collection collection, int i3) {
        ((AbstractList) this).modCount++;
        g(i2, i3);
        Iterator it = collection.iterator();
        for (int i4 = 0; i4 < i3; i4++) {
            this.f[i2 + i4] = it.next();
        }
    }

    public final void e(int i2, Object obj) {
        ((AbstractList) this).modCount++;
        g(i2, 1);
        this.f[i2] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f;
            int i2 = this.g;
            if (i2 == list.size()) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (oo.b(objArr[i3], list.get(i3))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.h) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(int i2, int i3) {
        int i4 = this.g + i3;
        if (i4 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f;
        if (i4 > objArr.length) {
            int length = objArr.length;
            int i5 = length + (length >> 1);
            if (i5 - i4 < 0) {
                i5 = i4;
            }
            if (i5 - 2147483639 > 0) {
                i5 = i4 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f = Arrays.copyOf(objArr, i5);
        }
        Object[] objArr2 = this.f;
        o6.o0(objArr2, objArr2, i2 + i3, i2, this.g);
        this.g += i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int i3 = this.g;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(n20.d(i2, i3, "index: ", ", size: "));
        }
        return this.f[i2];
    }

    public final Object h(int i2) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f;
        Object obj = objArr[i2];
        o6.o0(objArr, objArr, i2, i2 + 1, this.g);
        Object[] objArr2 = this.f;
        int i3 = this.g - 1;
        objArr2.getClass();
        objArr2[i3] = null;
        this.g--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f;
        int i2 = this.g;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            i3 = (i3 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i3;
    }

    public final void i(int i2, int i3) {
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f;
        o6.o0(objArr, objArr, i2, i2 + i3, this.g);
        Object[] objArr2 = this.f;
        int i4 = this.g;
        objArr2.getClass();
        for (int i5 = i4 - i3; i5 < i4; i5++) {
            objArr2[i5] = null;
        }
        this.g -= i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i2 = 0; i2 < this.g; i2++) {
            if (oo.b(this.f[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.g == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i2, int i3, Collection collection, boolean z) {
        Object[] objArr;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr = this.f;
            if (i4 >= i3) {
                break;
            }
            int i6 = i2 + i4;
            if (collection.contains(objArr[i6]) == z) {
                Object[] objArr2 = this.f;
                i4++;
                objArr2[i5 + i2] = objArr2[i6];
                i5++;
            } else {
                i4++;
            }
        }
        int i7 = i3 - i5;
        o6.o0(objArr, objArr, i2 + i5, i3 + i2, this.g);
        Object[] objArr3 = this.f;
        int i8 = this.g;
        objArr3.getClass();
        for (int i9 = i8 - i7; i9 < i8; i9++) {
            objArr3[i9] = null;
        }
        if (i7 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.g -= i7;
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i2 = this.g - 1; i2 >= 0; i2--) {
            if (oo.b(this.f[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        int i3 = this.g;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(n20.d(i2, i3, "index: ", ", size: "));
        }
        return new xp(this, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        f();
        return j(0, this.g, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        f();
        return j(0, this.g, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        f();
        int i3 = this.g;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(n20.d(i2, i3, "index: ", ", size: "));
        }
        Object[] objArr = this.f;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i3) {
        m60.j(i2, i3, this.g);
        return new yp(this.f, i2, i3 - i2, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i2 = this.g;
        Object[] objArr2 = this.f;
        if (length < i2) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        o6.o0(objArr2, objArr, 0, 0, i2);
        int i3 = this.g;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return g8.c(this.f, 0, this.g, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        Object[] objArr = this.f;
        int i2 = this.g;
        objArr.getClass();
        g8.r(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i2 = this.g;
        ((AbstractList) this).modCount++;
        g(i2, 1);
        this.f[i2] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        f();
        int size = collection.size();
        d(this.g, collection, size);
        return size > 0;
    }
}
