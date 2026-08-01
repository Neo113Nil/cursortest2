package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class h8 extends t {
    public static final Object[] g = new Object[0];
    public int d;
    public Object[] e;
    public int f;

    public h8(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = g;
        } else {
            if (i <= 0) {
                g8.f("Illegal Capacity: ", i);
                throw null;
            }
            objArr = new Object[i];
        }
        this.e = objArr;
    }

    @Override // defpackage.t
    public final int a() {
        return this.f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.f;
        if (i < 0 || i > i3) {
            g8.m(y6.v("index: ", i, ", size: ", i3));
            return;
        }
        if (i == i3) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        j();
        d(this.f + 1);
        int i4 = i(this.d + i);
        int i5 = this.f;
        if (i < ((i5 + 1) >> 1)) {
            if (i4 == 0) {
                Object[] objArr = this.e;
                objArr.getClass();
                i2 = objArr.length - 1;
            } else {
                i2 = i4 - 1;
            }
            int i6 = this.d;
            if (i6 == 0) {
                Object[] objArr2 = this.e;
                objArr2.getClass();
                i6 = objArr2.length;
            }
            int i7 = i6 - 1;
            int i8 = this.d;
            Object[] objArr3 = this.e;
            if (i2 >= i8) {
                objArr3[i7] = objArr3[i8];
                p8.T(objArr3, objArr3, i8, i8 + 1, i2 + 1);
            } else {
                p8.T(objArr3, objArr3, i8 - 1, i8, objArr3.length);
                Object[] objArr4 = this.e;
                objArr4[objArr4.length - 1] = objArr4[0];
                p8.T(objArr4, objArr4, 0, 1, i2 + 1);
            }
            this.e[i2] = obj;
            this.d = i7;
        } else {
            int i9 = i(i5 + this.d);
            Object[] objArr5 = this.e;
            if (i4 < i9) {
                p8.T(objArr5, objArr5, i4 + 1, i4, i9);
            } else {
                p8.T(objArr5, objArr5, 1, 0, i9);
                Object[] objArr6 = this.e;
                objArr6[0] = objArr6[objArr6.length - 1];
                p8.T(objArr6, objArr6, i4 + 1, i4, objArr6.length - 1);
            }
            this.e[i4] = obj;
        }
        this.f++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.f;
        if (i < 0 || i > i2) {
            g8.m(y6.v("index: ", i, ", size: ", i2));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f) {
            return addAll(collection);
        }
        j();
        d(collection.size() + this.f);
        int i3 = i(this.f + this.d);
        int i4 = i(this.d + i);
        int size = collection.size();
        if (i >= ((this.f + 1) >> 1)) {
            int i5 = i4 + size;
            Object[] objArr = this.e;
            if (i4 < i3) {
                int i6 = size + i3;
                if (i6 <= objArr.length) {
                    p8.T(objArr, objArr, i5, i4, i3);
                } else if (i5 >= objArr.length) {
                    p8.T(objArr, objArr, i5 - objArr.length, i4, i3);
                } else {
                    int length = i3 - (i6 - objArr.length);
                    p8.T(objArr, objArr, 0, length, i3);
                    Object[] objArr2 = this.e;
                    p8.T(objArr2, objArr2, i5, i4, length);
                }
            } else {
                p8.T(objArr, objArr, size, 0, i3);
                Object[] objArr3 = this.e;
                if (i5 >= objArr3.length) {
                    p8.T(objArr3, objArr3, i5 - objArr3.length, i4, objArr3.length);
                } else {
                    p8.T(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.e;
                    p8.T(objArr4, objArr4, i5, i4, objArr4.length - size);
                }
            }
            c(i4, collection);
            return true;
        }
        int i7 = this.d;
        int i8 = i7 - size;
        Object[] objArr5 = this.e;
        if (i4 < i7) {
            p8.T(objArr5, objArr5, i8, i7, objArr5.length);
            Object[] objArr6 = this.e;
            if (size >= i4) {
                p8.T(objArr6, objArr6, objArr6.length - size, 0, i4);
            } else {
                p8.T(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.e;
                p8.T(objArr7, objArr7, 0, size, i4);
            }
        } else if (i8 >= 0) {
            p8.T(objArr5, objArr5, i8, i7, i4);
        } else {
            i8 += objArr5.length;
            int i9 = i4 - i7;
            int length2 = objArr5.length - i8;
            if (length2 >= i9) {
                p8.T(objArr5, objArr5, i8, i7, i4);
            } else {
                p8.T(objArr5, objArr5, i8, i7, i7 + length2);
                Object[] objArr8 = this.e;
                p8.T(objArr8, objArr8, 0, this.d + length2, i4);
            }
        }
        this.d = i8;
        c(g(i4 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        j();
        d(this.f + 1);
        int i = this.d;
        if (i == 0) {
            Object[] objArr = this.e;
            objArr.getClass();
            i = objArr.length;
        }
        int i2 = i - 1;
        this.d = i2;
        this.e[i2] = obj;
        this.f++;
    }

    public final void addLast(Object obj) {
        j();
        d(a() + 1);
        this.e[i(a() + this.d)] = obj;
        this.f = a() + 1;
    }

    @Override // defpackage.t
    public final Object b(int i) {
        int i2 = this.f;
        if (i < 0 || i >= i2) {
            g8.m(y6.v("index: ", i, ", size: ", i2));
            return null;
        }
        if (i == a() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        j();
        int i3 = i(this.d + i);
        Object[] objArr = this.e;
        Object obj = objArr[i3];
        int i4 = this.f >> 1;
        int i5 = this.d;
        if (i < i4) {
            if (i3 >= i5) {
                p8.T(objArr, objArr, i5 + 1, i5, i3);
            } else {
                p8.T(objArr, objArr, 1, 0, i3);
                Object[] objArr2 = this.e;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i6 = this.d;
                p8.T(objArr2, objArr2, i6 + 1, i6, objArr2.length - 1);
            }
            Object[] objArr3 = this.e;
            int i7 = this.d;
            objArr3[i7] = null;
            this.d = e(i7);
        } else {
            int i8 = i((a() - 1) + i5);
            Object[] objArr4 = this.e;
            if (i3 <= i8) {
                p8.T(objArr4, objArr4, i3, i3 + 1, i8 + 1);
            } else {
                p8.T(objArr4, objArr4, i3, i3 + 1, objArr4.length);
                Object[] objArr5 = this.e;
                objArr5[objArr5.length - 1] = objArr5[0];
                p8.T(objArr5, objArr5, 0, 1, i8 + 1);
            }
            this.e[i8] = null;
        }
        this.f--;
        return obj;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.e.length;
        while (i < length && it.hasNext()) {
            this.e[i] = it.next();
            i++;
        }
        int i2 = this.d;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.e[i3] = it.next();
        }
        this.f = collection.size() + this.f;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            j();
            h(this.d, i(a() + this.d));
        }
        this.d = 0;
        this.f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i < 0) {
            g8.s("Deque is too big.");
            return;
        }
        Object[] objArr = this.e;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == g) {
            if (i < 10) {
                i = 10;
            }
            this.e = new Object[i];
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
        p8.T(objArr, objArr2, 0, this.d, objArr.length);
        Object[] objArr3 = this.e;
        int length2 = objArr3.length;
        int i3 = this.d;
        p8.T(objArr3, objArr2, length2 - i3, 0, i3);
        this.d = 0;
        this.e = objArr2;
    }

    public final int e(int i) {
        this.e.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.e[i((size() - 1) + this.d)];
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.e[this.d];
        }
        g8.e("ArrayDeque is empty.");
        return null;
    }

    public final int g(int i) {
        return i < 0 ? i + this.e.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int a = a();
        if (i >= 0 && i < a) {
            return this.e[i(this.d + i)];
        }
        g8.m(y6.v("index: ", i, ", size: ", a));
        return null;
    }

    public final void h(int i, int i2) {
        Object[] objArr = this.e;
        if (i < i2) {
            p8.X(objArr, i, i2);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            p8.X(this.e, 0, i2);
        }
    }

    public final int i(int i) {
        Object[] objArr = this.e;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int i2 = i(a() + this.d);
        int i3 = this.d;
        if (i3 < i2) {
            while (i3 < i2) {
                if (nz.l(obj, this.e[i3])) {
                    i = this.d;
                } else {
                    i3++;
                }
            }
            return -1;
        }
        if (i3 < i2) {
            return -1;
        }
        int length = this.e.length;
        while (true) {
            if (i3 >= length) {
                for (int i4 = 0; i4 < i2; i4++) {
                    if (nz.l(obj, this.e[i4])) {
                        i3 = i4 + this.e.length;
                        i = this.d;
                    }
                }
                return -1;
            }
            if (nz.l(obj, this.e[i3])) {
                i = this.d;
                break;
            }
            i3++;
        }
        return i3 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final void j() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            g8.e("ArrayDeque is empty.");
            return null;
        }
        return this.e[i((size() - 1) + this.d)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int i2 = i(this.f + this.d);
        int i3 = this.d;
        if (i3 < i2) {
            length = i2 - 1;
            if (i3 <= length) {
                while (!nz.l(obj, this.e[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i = this.d;
                return length - i;
            }
            return -1;
        }
        if (i3 > i2) {
            while (true) {
                i2--;
                Object[] objArr = this.e;
                if (-1 >= i2) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i4 = this.d;
                    if (i4 <= length) {
                        while (!nz.l(obj, this.e[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.d;
                    }
                } else if (nz.l(obj, objArr[i2])) {
                    length = i2 + this.e.length;
                    i = this.d;
                    break;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int i;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.e.length != 0) {
            int i2 = i(this.f + this.d);
            int i3 = this.d;
            if (i3 < i2) {
                i = i3;
                while (true) {
                    objArr = this.e;
                    if (i3 >= i2) {
                        break;
                    }
                    Object obj = objArr[i3];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.e[i] = obj;
                        i++;
                    }
                    i3++;
                }
                p8.X(objArr, i, i2);
            } else {
                int length = this.e.length;
                boolean z2 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr2 = this.e;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.e[i4] = obj2;
                        i4++;
                    }
                    i3++;
                }
                i = i(i4);
                for (int i5 = 0; i5 < i2; i5++) {
                    Object[] objArr3 = this.e;
                    Object obj3 = objArr3[i5];
                    objArr3[i5] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.e[i] = obj3;
                        i = e(i);
                    }
                }
                z = z2;
            }
            if (z) {
                j();
                this.f = g(i - this.d);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            g8.e("ArrayDeque is empty.");
            return null;
        }
        j();
        Object[] objArr = this.e;
        int i = this.d;
        Object obj = objArr[i];
        objArr[i] = null;
        this.d = e(i);
        this.f = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            g8.e("ArrayDeque is empty.");
            return null;
        }
        j();
        int i = i((size() - 1) + this.d);
        Object[] objArr = this.e;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a50.m(i, i2, this.f);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f) {
            clear();
            return;
        }
        if (i3 == 1) {
            b(i);
            return;
        }
        j();
        int i4 = this.f - i2;
        int i5 = this.d;
        if (i < i4) {
            int i6 = i((i - 1) + i5);
            int i7 = i(this.d + (i2 - 1));
            while (i > 0) {
                int i8 = i6 + 1;
                int min = Math.min(i, Math.min(i8, i7 + 1));
                Object[] objArr = this.e;
                int i9 = i7 - min;
                int i10 = i6 - min;
                p8.T(objArr, objArr, i9 + 1, i10 + 1, i8);
                i6 = g(i10);
                i7 = g(i9);
                i -= min;
            }
            int i11 = i(this.d + i3);
            h(this.d, i11);
            this.d = i11;
        } else {
            int i12 = i(i5 + i2);
            int i13 = i(this.d + i);
            int i14 = this.f;
            while (true) {
                i14 -= i2;
                if (i14 <= 0) {
                    break;
                }
                Object[] objArr2 = this.e;
                i2 = Math.min(i14, Math.min(objArr2.length - i12, objArr2.length - i13));
                Object[] objArr3 = this.e;
                int i15 = i12 + i2;
                p8.T(objArr3, objArr3, i13, i12, i15);
                i12 = i(i15);
                i13 = i(i13 + i2);
            }
            int i16 = i(this.f + this.d);
            h(g(i16 - i3), i16);
        }
        this.f -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int i;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.e.length != 0) {
            int i2 = i(this.f + this.d);
            int i3 = this.d;
            if (i3 < i2) {
                i = i3;
                while (true) {
                    objArr = this.e;
                    if (i3 >= i2) {
                        break;
                    }
                    Object obj = objArr[i3];
                    if (collection.contains(obj)) {
                        this.e[i] = obj;
                        i++;
                    } else {
                        z = true;
                    }
                    i3++;
                }
                p8.X(objArr, i, i2);
            } else {
                int length = this.e.length;
                boolean z2 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr2 = this.e;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj2)) {
                        this.e[i4] = obj2;
                        i4++;
                    } else {
                        z2 = true;
                    }
                    i3++;
                }
                i = i(i4);
                for (int i5 = 0; i5 < i2; i5++) {
                    Object[] objArr3 = this.e;
                    Object obj3 = objArr3[i5];
                    objArr3[i5] = null;
                    if (collection.contains(obj3)) {
                        this.e[i] = obj3;
                        i = e(i);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                j();
                this.f = g(i - this.d);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int a = a();
        if (i < 0 || i >= a) {
            g8.m(y6.v("index: ", i, ", size: ", a));
            return null;
        }
        int i2 = i(this.d + i);
        Object[] objArr = this.e;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.f;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int i2 = i(this.f + this.d);
        int i3 = this.d;
        if (i3 < i2) {
            p8.V(this.e, objArr, i3, i2, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.e;
            p8.T(objArr2, objArr, 0, this.d, objArr2.length);
            Object[] objArr3 = this.e;
            p8.T(objArr3, objArr, objArr3.length - this.d, 0, i2);
        }
        int i4 = this.f;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    public h8() {
        this.e = g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        j();
        d(collection.size() + a());
        c(i(a() + this.d), collection);
        return true;
    }
}
