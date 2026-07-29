package o;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class D6 extends G {
    public static final Object[] k = new Object[0];
    public int h;
    public Object[] i = k;
    public int j;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.j;
        if (i < 0 || i > i3) {
            throw new IndexOutOfBoundsException(AbstractC1888sN.g(i, i3, "index: ", ", size: "));
        }
        if (i == i3) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        r();
        m(this.j + 1);
        int q = q(this.h + i);
        int i4 = this.j;
        if (i < ((i4 + 1) >> 1)) {
            if (q == 0) {
                Object[] objArr = this.i;
                AbstractC0048Bt.n(objArr, "<this>");
                q = objArr.length;
            }
            int i5 = q - 1;
            int i6 = this.h;
            if (i6 == 0) {
                Object[] objArr2 = this.i;
                AbstractC0048Bt.n(objArr2, "<this>");
                i2 = objArr2.length - 1;
            } else {
                i2 = i6 - 1;
            }
            int i7 = this.h;
            if (i5 >= i7) {
                Object[] objArr3 = this.i;
                objArr3[i2] = objArr3[i7];
                P6.b0(objArr3, objArr3, i7, i7 + 1, i5 + 1);
            } else {
                Object[] objArr4 = this.i;
                P6.b0(objArr4, objArr4, i7 - 1, i7, objArr4.length);
                Object[] objArr5 = this.i;
                objArr5[objArr5.length - 1] = objArr5[0];
                P6.b0(objArr5, objArr5, 0, 1, i5 + 1);
            }
            this.i[i5] = obj;
            this.h = i2;
        } else {
            int q2 = q(i4 + this.h);
            if (q < q2) {
                Object[] objArr6 = this.i;
                P6.b0(objArr6, objArr6, q + 1, q, q2);
            } else {
                Object[] objArr7 = this.i;
                P6.b0(objArr7, objArr7, 1, 0, q2);
                Object[] objArr8 = this.i;
                objArr8[0] = objArr8[objArr8.length - 1];
                P6.b0(objArr8, objArr8, q + 1, q, objArr8.length - 1);
            }
            this.i[q] = obj;
        }
        this.j++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        AbstractC0048Bt.n(collection, "elements");
        int i2 = this.j;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC1888sN.g(i, i2, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.j) {
            return addAll(collection);
        }
        r();
        m(collection.size() + this.j);
        int q = q(this.j + this.h);
        int q2 = q(this.h + i);
        int size = collection.size();
        if (i >= ((this.j + 1) >> 1)) {
            int i3 = q2 + size;
            if (q2 < q) {
                int i4 = size + q;
                Object[] objArr = this.i;
                if (i4 <= objArr.length) {
                    P6.b0(objArr, objArr, i3, q2, q);
                } else if (i3 >= objArr.length) {
                    P6.b0(objArr, objArr, i3 - objArr.length, q2, q);
                } else {
                    int length = q - (i4 - objArr.length);
                    P6.b0(objArr, objArr, 0, length, q);
                    Object[] objArr2 = this.i;
                    P6.b0(objArr2, objArr2, i3, q2, length);
                }
            } else {
                Object[] objArr3 = this.i;
                P6.b0(objArr3, objArr3, size, 0, q);
                Object[] objArr4 = this.i;
                if (i3 >= objArr4.length) {
                    P6.b0(objArr4, objArr4, i3 - objArr4.length, q2, objArr4.length);
                } else {
                    P6.b0(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.i;
                    P6.b0(objArr5, objArr5, i3, q2, objArr5.length - size);
                }
            }
            l(q2, collection);
            return true;
        }
        int i5 = this.h;
        int i6 = i5 - size;
        if (q2 < i5) {
            Object[] objArr6 = this.i;
            P6.b0(objArr6, objArr6, i6, i5, objArr6.length);
            if (size >= q2) {
                Object[] objArr7 = this.i;
                P6.b0(objArr7, objArr7, objArr7.length - size, 0, q2);
            } else {
                Object[] objArr8 = this.i;
                P6.b0(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.i;
                P6.b0(objArr9, objArr9, 0, size, q2);
            }
        } else if (i6 >= 0) {
            Object[] objArr10 = this.i;
            P6.b0(objArr10, objArr10, i6, i5, q2);
        } else {
            Object[] objArr11 = this.i;
            i6 += objArr11.length;
            int i7 = q2 - i5;
            int length2 = objArr11.length - i6;
            if (length2 >= i7) {
                P6.b0(objArr11, objArr11, i6, i5, q2);
            } else {
                P6.b0(objArr11, objArr11, i6, i5, i5 + length2);
                Object[] objArr12 = this.i;
                P6.b0(objArr12, objArr12, 0, this.h + length2, q2);
            }
        }
        this.h = i6;
        l(o(q2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        r();
        m(this.j + 1);
        int i = this.h;
        if (i == 0) {
            Object[] objArr = this.i;
            AbstractC0048Bt.n(objArr, "<this>");
            i = objArr.length;
        }
        int i2 = i - 1;
        this.h = i2;
        this.i[i2] = obj;
        this.j++;
    }

    public final void addLast(Object obj) {
        r();
        m(j() + 1);
        this.i[q(j() + this.h)] = obj;
        this.j = j() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            r();
            p(this.h, q(j() + this.h));
        }
        this.h = 0;
        this.j = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int j = j();
        if (i < 0 || i >= j) {
            throw new IndexOutOfBoundsException(AbstractC1888sN.g(i, j, "index: ", ", size: "));
        }
        return this.i[q(this.h + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int q = q(j() + this.h);
        int i2 = this.h;
        if (i2 < q) {
            while (i2 < q) {
                if (AbstractC0048Bt.h(obj, this.i[i2])) {
                    i = this.h;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 < q) {
            return -1;
        }
        int length = this.i.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < q; i3++) {
                    if (AbstractC0048Bt.h(obj, this.i[i3])) {
                        i2 = i3 + this.i.length;
                        i = this.h;
                    }
                }
                return -1;
            }
            if (AbstractC0048Bt.h(obj, this.i[i2])) {
                i = this.h;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return j() == 0;
    }

    @Override // o.G
    public final int j() {
        return this.j;
    }

    @Override // o.G
    public final Object k(int i) {
        int i2 = this.j;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1888sN.g(i, i2, "index: ", ", size: "));
        }
        if (i == AbstractC0868ct.w(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        r();
        int q = q(this.h + i);
        Object[] objArr = this.i;
        Object obj = objArr[q];
        if (i < (this.j >> 1)) {
            int i3 = this.h;
            if (q >= i3) {
                P6.b0(objArr, objArr, i3 + 1, i3, q);
            } else {
                P6.b0(objArr, objArr, 1, 0, q);
                Object[] objArr2 = this.i;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.h;
                P6.b0(objArr2, objArr2, i4 + 1, i4, objArr2.length - 1);
            }
            Object[] objArr3 = this.i;
            int i5 = this.h;
            objArr3[i5] = null;
            this.h = n(i5);
        } else {
            int q2 = q(AbstractC0868ct.w(this) + this.h);
            if (q <= q2) {
                Object[] objArr4 = this.i;
                P6.b0(objArr4, objArr4, q, q + 1, q2 + 1);
            } else {
                Object[] objArr5 = this.i;
                P6.b0(objArr5, objArr5, q, q + 1, objArr5.length);
                Object[] objArr6 = this.i;
                objArr6[objArr6.length - 1] = objArr6[0];
                P6.b0(objArr6, objArr6, 0, 1, q2 + 1);
            }
            this.i[q2] = null;
        }
        this.j--;
        return obj;
    }

    public final void l(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.i.length;
        while (i < length && it.hasNext()) {
            this.i[i] = it.next();
            i++;
        }
        int i2 = this.h;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.i[i3] = it.next();
        }
        this.j = collection.size() + this.j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int q = q(this.j + this.h);
        int i2 = this.h;
        if (i2 < q) {
            length = q - 1;
            if (i2 <= length) {
                while (!AbstractC0048Bt.h(obj, this.i[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.h;
                return length - i;
            }
            return -1;
        }
        if (i2 > q) {
            int i3 = q - 1;
            while (true) {
                if (-1 >= i3) {
                    Object[] objArr = this.i;
                    AbstractC0048Bt.n(objArr, "<this>");
                    length = objArr.length - 1;
                    int i4 = this.h;
                    if (i4 <= length) {
                        while (!AbstractC0048Bt.h(obj, this.i[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.h;
                    }
                } else {
                    if (AbstractC0048Bt.h(obj, this.i[i3])) {
                        length = i3 + this.i.length;
                        i = this.h;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    public final void m(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.i;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == k) {
            if (i < 10) {
                i = 10;
            }
            this.i = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        P6.b0(objArr, objArr2, 0, this.h, objArr.length);
        Object[] objArr3 = this.i;
        int length2 = objArr3.length;
        int i3 = this.h;
        P6.b0(objArr3, objArr2, length2 - i3, 0, i3);
        this.h = 0;
        this.i = objArr2;
    }

    public final int n(int i) {
        AbstractC0048Bt.n(this.i, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int o(int i) {
        return i < 0 ? i + this.i.length : i;
    }

    public final void p(int i, int i2) {
        if (i < i2) {
            P6.g0(this.i, i, i2);
            return;
        }
        Object[] objArr = this.i;
        P6.g0(objArr, i, objArr.length);
        P6.g0(this.i, 0, i2);
    }

    public final int q(int i) {
        Object[] objArr = this.i;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void r() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        k(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int q;
        AbstractC0048Bt.n(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.i.length != 0) {
            int q2 = q(this.j + this.h);
            int i = this.h;
            if (i < q2) {
                q = i;
                while (i < q2) {
                    Object obj = this.i[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.i[q] = obj;
                        q++;
                    }
                    i++;
                }
                P6.g0(this.i, q, q2);
            } else {
                int length = this.i.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.i;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.i[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                q = q(i2);
                for (int i3 = 0; i3 < q2; i3++) {
                    Object[] objArr2 = this.i;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.i[q] = obj3;
                        q = n(q);
                    }
                }
                z = z2;
            }
            if (z) {
                r();
                this.j = o(q - this.h);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        r();
        Object[] objArr = this.i;
        int i = this.h;
        Object obj = objArr[i];
        objArr[i] = null;
        this.h = n(i);
        this.j = j() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        r();
        int q = q(AbstractC0868ct.w(this) + this.h);
        Object[] objArr = this.i;
        Object obj = objArr[q];
        objArr[q] = null;
        this.j = j() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        PX.v(i, i2, this.j);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.j) {
            clear();
            return;
        }
        if (i3 == 1) {
            k(i);
            return;
        }
        r();
        if (i < this.j - i2) {
            int q = q(this.h + (i - 1));
            int q2 = q(this.h + (i2 - 1));
            while (i > 0) {
                int i4 = q + 1;
                int min = Math.min(i, Math.min(i4, q2 + 1));
                Object[] objArr = this.i;
                int i5 = q2 - min;
                int i6 = q - min;
                P6.b0(objArr, objArr, i5 + 1, i6 + 1, i4);
                q = o(i6);
                q2 = o(i5);
                i -= min;
            }
            int q3 = q(this.h + i3);
            p(this.h, q3);
            this.h = q3;
        } else {
            int q4 = q(this.h + i2);
            int q5 = q(this.h + i);
            int i7 = this.j;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.i;
                i2 = Math.min(i7, Math.min(objArr2.length - q4, objArr2.length - q5));
                Object[] objArr3 = this.i;
                int i8 = q4 + i2;
                P6.b0(objArr3, objArr3, q5, q4, i8);
                q4 = q(i8);
                q5 = q(q5 + i2);
            }
            int q6 = q(this.j + this.h);
            p(o(q6 - i3), q6);
        }
        this.j -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int q;
        AbstractC0048Bt.n(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.i.length != 0) {
            int q2 = q(this.j + this.h);
            int i = this.h;
            if (i < q2) {
                q = i;
                while (i < q2) {
                    Object obj = this.i[i];
                    if (collection.contains(obj)) {
                        this.i[q] = obj;
                        q++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                P6.g0(this.i, q, q2);
            } else {
                int length = this.i.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.i;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.i[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                q = q(i2);
                for (int i3 = 0; i3 < q2; i3++) {
                    Object[] objArr2 = this.i;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.i[q] = obj3;
                        q = n(q);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                r();
                this.j = o(q - this.h);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int j = j();
        if (i < 0 || i >= j) {
            throw new IndexOutOfBoundsException(AbstractC1888sN.g(i, j, "index: ", ", size: "));
        }
        int q = q(this.h + i);
        Object[] objArr = this.i;
        Object obj2 = objArr[q];
        objArr[q] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[j()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "array");
        int length = objArr.length;
        int i = this.j;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            AbstractC0048Bt.l(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int q = q(this.j + this.h);
        int i2 = this.h;
        if (i2 < q) {
            P6.d0(this.i, objArr, i2, q, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.i;
            P6.b0(objArr2, objArr, 0, this.h, objArr2.length);
            Object[] objArr3 = this.i;
            P6.b0(objArr3, objArr, objArr3.length - this.h, 0, q);
        }
        int i3 = this.j;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC0048Bt.n(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        r();
        m(collection.size() + j());
        l(q(j() + this.h), collection);
        return true;
    }
}
