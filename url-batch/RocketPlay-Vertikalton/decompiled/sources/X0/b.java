package X0;

import E1.AbstractC0001b;
import F1.l;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class b extends W0.e implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f1293a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1294b;

    /* renamed from: c, reason: collision with root package name */
    public int f1295c;
    public final b d;

    /* renamed from: e, reason: collision with root package name */
    public final c f1296e;

    public b(Object[] objArr, int i, int i2, b bVar, c cVar) {
        int i3;
        i1.f.e(objArr, "backing");
        i1.f.e(cVar, "root");
        this.f1293a = objArr;
        this.f1294b = i;
        this.f1295c = i2;
        this.d = bVar;
        this.f1296e = cVar;
        i3 = ((AbstractList) cVar).modCount;
        ((AbstractList) this).modCount = i3;
    }

    @Override // W0.e
    public final int a() {
        f();
        return this.f1295c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.f1294b + this.f1295c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        i1.f.e(collection, "elements");
        g();
        f();
        int size = collection.size();
        d(this.f1294b + this.f1295c, collection, size);
        return size > 0;
    }

    @Override // W0.e
    public final Object b(int i) {
        g();
        f();
        int i2 = this.f1295c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
        }
        return h(this.f1294b + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.f1294b, this.f1295c);
    }

    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        c cVar = this.f1296e;
        b bVar = this.d;
        if (bVar != null) {
            bVar.d(i, collection, i2);
        } else {
            c cVar2 = c.d;
            cVar.d(i, collection, i2);
        }
        this.f1293a = cVar.f1297a;
        this.f1295c += i2;
    }

    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f1296e;
        b bVar = this.d;
        if (bVar != null) {
            bVar.e(i, obj);
        } else {
            c cVar2 = c.d;
            cVar.e(i, obj);
        }
        this.f1293a = cVar.f1297a;
        this.f1295c++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj != this) {
            if (obj instanceof List) {
                if (F1.d.i(this.f1293a, this.f1294b, this.f1295c, (List) obj)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f() {
        int i;
        i = ((AbstractList) this.f1296e).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (this.f1296e.f1299c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f();
        int i2 = this.f1295c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
        }
        return this.f1293a[this.f1294b + i];
    }

    public final Object h(int i) {
        Object h;
        ((AbstractList) this).modCount++;
        b bVar = this.d;
        if (bVar != null) {
            h = bVar.h(i);
        } else {
            c cVar = c.d;
            h = this.f1296e.h(i);
        }
        this.f1295c--;
        return h;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.f1293a;
        int i = this.f1295c;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.f1294b + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.d;
        if (bVar != null) {
            bVar.i(i, i2);
        } else {
            c cVar = c.d;
            this.f1296e.i(i, i2);
        }
        this.f1295c -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i = 0; i < this.f1295c; i++) {
            if (i1.f.a(this.f1293a[this.f1294b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.f1295c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i, int i2, Collection collection, boolean z2) {
        int j2;
        b bVar = this.d;
        if (bVar != null) {
            j2 = bVar.j(i, i2, collection, z2);
        } else {
            c cVar = c.d;
            j2 = this.f1296e.j(i, i2, collection, z2);
        }
        if (j2 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f1295c -= j2;
        return j2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i = this.f1295c - 1; i >= 0; i--) {
            if (i1.f.a(this.f1293a[this.f1294b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
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
        i1.f.e(collection, "elements");
        g();
        f();
        return j(this.f1294b, this.f1295c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        i1.f.e(collection, "elements");
        g();
        f();
        return j(this.f1294b, this.f1295c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        f();
        int i2 = this.f1295c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.f1293a;
        int i3 = this.f1294b;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        l.k(i, i2, this.f1295c);
        return new b(this.f1293a, this.f1294b + i, i2 - i, this, this.f1296e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        i1.f.e(objArr, "array");
        f();
        int length = objArr.length;
        int i = this.f1295c;
        int i2 = this.f1294b;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f1293a, i2, i + i2, objArr.getClass());
            i1.f.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        W0.i.t0(this.f1293a, objArr, 0, i2, i + i2);
        int i3 = this.f1295c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return F1.d.j(this.f1293a, this.f1294b, this.f1295c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        f();
        int i2 = this.f1295c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
        }
        return new a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        f();
        int i2 = this.f1295c;
        if (i >= 0 && i <= i2) {
            e(this.f1294b + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        i1.f.e(collection, "elements");
        g();
        f();
        int i2 = this.f1295c;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            d(this.f1294b + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.f1293a;
        int i = this.f1295c;
        int i2 = this.f1294b;
        int i3 = i + i2;
        i1.f.e(objArr, "<this>");
        F1.d.s(i3, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i2, i3);
        i1.f.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }
}
