package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class tf0 extends t implements Collection, k00 {
    public w d;
    public Object[] e;
    public Object[] f;
    public int g;
    public y7 h = new y7(24);
    public Object[] i;
    public Object[] j;
    public int k;

    public tf0(w wVar, Object[] objArr, Object[] objArr2, int i) {
        this.d = wVar;
        this.e = objArr;
        this.f = objArr2;
        this.g = i;
        this.i = objArr;
        this.j = objArr2;
        this.k = wVar.a();
    }

    public static void d(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object A(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.k - i;
        Object[] objArr2 = this.j;
        if (i4 == 1) {
            Object obj = objArr2[0];
            q(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] k = k(objArr2);
        p8.T(objArr2, k, i3, i3 + 1, i4);
        k[i4 - 1] = null;
        this.i = objArr;
        this.j = k;
        this.k = (i + i4) - 1;
        this.g = i2;
        return obj2;
    }

    public final int B() {
        int i = this.k;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] C(Object[] objArr, int i, int i2, Object obj, u8 u8Var) {
        int l = od0.l(i2, i);
        Object[] k = k(objArr);
        if (i != 0) {
            Object obj2 = k[l];
            obj2.getClass();
            k[l] = C((Object[]) obj2, i - 5, i2, obj, u8Var);
            return k;
        }
        if (k != objArr) {
            ((AbstractList) this).modCount++;
        }
        u8Var.a = k[l];
        k[l] = obj;
        return k;
    }

    public final void D(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] m;
        if (i3 < 1) {
            gh0.a("requires at least one nullBuffer");
        }
        Object[] k = k(objArr);
        objArr2[0] = k;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            p8.T(k, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                m = k;
            } else {
                m = m();
                i3--;
                objArr2[i3] = m;
            }
            int i7 = i2 - i6;
            p8.T(k, objArr3, 0, i7, i2);
            p8.T(k, m, size + 1, i4, i7);
            objArr3 = m;
        }
        Iterator it = collection.iterator();
        d(k, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] m2 = m();
            d(m2, 0, it);
            objArr2[i8] = m2;
        }
        d(objArr3, 0, it);
    }

    public final int E() {
        int i = this.k;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // defpackage.t
    public final int a() {
        return this.k;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        px0.q(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int B = B();
        if (i >= B) {
            h(this.i, i - B, obj);
            return;
        }
        u8 u8Var = new u8(null);
        Object[] objArr = this.i;
        objArr.getClass();
        h(g(objArr, this.g, i, obj, u8Var), 0, u8Var.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] m;
        px0.q(i, this.k);
        if (i == this.k) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.k - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.j;
            Object[] k = k(objArr);
            p8.T(objArr, k, size2 + 1, i3, E());
            d(k, i3, collection.iterator());
            this.j = k;
            this.k = collection.size() + this.k;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int E = E();
        int size3 = collection.size() + this.k;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= B()) {
            m = m();
            collection2 = collection;
            D(collection2, i, this.j, E, objArr2, size, m);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.j;
            if (size3 > E) {
                int i4 = size3 - E;
                Object[] l = l(i4, objArr3);
                f(collection2, i, i4, objArr2, size, l);
                objArr2 = objArr2;
                m = l;
            } else {
                m = m();
                int i5 = E - size3;
                p8.T(objArr3, m, 0, i5, E);
                int i6 = 32 - i5;
                Object[] l2 = l(i6, this.j);
                int i7 = size - 1;
                objArr2[i7] = l2;
                f(collection2, i, i6, objArr2, i7, l2);
                collection2 = collection2;
            }
        }
        this.i = s(this.i, i2, objArr2);
        this.j = m;
        this.k = collection2.size() + this.k;
        return true;
    }

    @Override // defpackage.t
    public final Object b(int i) {
        px0.p(i, a());
        ((AbstractList) this).modCount++;
        int B = B();
        if (i >= B) {
            return A(this.i, B, this.g, i - B);
        }
        u8 u8Var = new u8(this.j[0]);
        Object[] objArr = this.i;
        objArr.getClass();
        A(z(objArr, this.g, i, u8Var), B, this.g, 0);
        return u8Var.a;
    }

    public final w c() {
        w nr0Var;
        Object[] objArr = this.i;
        if (objArr == this.e && this.j == this.f) {
            nr0Var = this.d;
        } else {
            this.h = new y7(24);
            this.e = objArr;
            Object[] objArr2 = this.j;
            this.f = objArr2;
            nr0Var = objArr == null ? objArr2.length == 0 ? nr0.e : new nr0(Arrays.copyOf(objArr2, this.k)) : new sf0(objArr, objArr2, this.k, this.g);
        }
        this.d = nr0Var;
        return nr0Var;
    }

    public final int e() {
        return ((AbstractList) this).modCount;
    }

    public final void f(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.i == null) {
            g8.s("root is null");
            return;
        }
        int i4 = i >> 5;
        s j = j(B() >> 5);
        int i5 = i3;
        Object[] objArr3 = objArr2;
        while (j.d - 1 != i4) {
            Object[] objArr4 = (Object[]) j.previous();
            p8.T(objArr4, objArr3, 0, 32 - i2, 32);
            objArr3 = l(i2, objArr4);
            i5--;
            objArr[i5] = objArr3;
        }
        Object[] objArr5 = (Object[]) j.previous();
        int B = i3 - (((B() >> 5) - 1) - i4);
        if (B < i3) {
            objArr2 = objArr[B];
            objArr2.getClass();
        }
        D(collection, i, objArr5, 32, objArr, B, objArr2);
    }

    public final Object[] g(Object[] objArr, int i, int i2, Object obj, u8 u8Var) {
        Object obj2;
        int l = od0.l(i2, i);
        if (i == 0) {
            u8Var.a = objArr[31];
            Object[] k = k(objArr);
            p8.T(objArr, k, l + 1, l, 31);
            k[l] = obj;
            return k;
        }
        Object[] k2 = k(objArr);
        int i3 = i - 5;
        Object obj3 = k2[l];
        obj3.getClass();
        k2[l] = g((Object[]) obj3, i3, i2, obj, u8Var);
        while (true) {
            l++;
            if (l >= 32 || (obj2 = k2[l]) == null) {
                break;
            }
            k2[l] = g((Object[]) obj2, i3, 0, u8Var.a, u8Var);
        }
        return k2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        px0.p(i, a());
        if (B() <= i) {
            objArr = this.j;
        } else {
            Object[] objArr2 = this.i;
            objArr2.getClass();
            for (int i2 = this.g; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[od0.l(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final void h(Object[] objArr, int i, Object obj) {
        int E = E();
        Object[] k = k(this.j);
        Object[] objArr2 = this.j;
        if (E >= 32) {
            Object obj2 = objArr2[31];
            p8.T(objArr2, k, i + 1, i, 31);
            k[i] = obj;
            t(objArr, k, n(obj2));
            return;
        }
        p8.T(objArr2, k, i + 1, i, E);
        k[i] = obj;
        this.i = objArr;
        this.j = k;
        this.k++;
    }

    public final boolean i(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final s j(int i) {
        Object[] objArr = this.i;
        if (objArr == null) {
            g8.s("Invalid root");
            return null;
        }
        int B = B() >> 5;
        px0.q(i, B);
        int i2 = this.g;
        return i2 == 0 ? new bb(i, objArr) : new jx0(objArr, i, B, i2 / 5);
    }

    public final Object[] k(Object[] objArr) {
        if (objArr == null) {
            return m();
        }
        if (i(objArr)) {
            return objArr;
        }
        Object[] m = m();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        p8.V(objArr, m, 0, length, 6);
        return m;
    }

    public final Object[] l(int i, Object[] objArr) {
        if (i(objArr)) {
            p8.T(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] m = m();
        p8.T(objArr, m, i, 0, 32 - i);
        return m;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        px0.q(i, this.k);
        return new vf0(this, i);
    }

    public final Object[] m() {
        Object[] objArr = new Object[33];
        objArr[32] = this.h;
        return objArr;
    }

    public final Object[] n(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.h;
        return objArr;
    }

    public final Object[] o(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            gh0.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int l = od0.l(i, i2);
        Object obj = objArr[l];
        obj.getClass();
        Object o = o((Object[]) obj, i, i2 - 5);
        if (l < 31) {
            int i3 = l + 1;
            if (objArr[i3] != null) {
                if (i(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] m = m();
                p8.T(objArr, m, 0, 0, i3);
                objArr = m;
            }
        }
        if (o == objArr[l]) {
            return objArr;
        }
        Object[] k = k(objArr);
        k[l] = o;
        return k;
    }

    public final Object[] p(Object[] objArr, int i, int i2, u8 u8Var) {
        Object[] p;
        int l = od0.l(i2 - 1, i);
        if (i == 5) {
            u8Var.a = objArr[l];
            p = null;
        } else {
            Object obj = objArr[l];
            obj.getClass();
            p = p((Object[]) obj, i - 5, i2, u8Var);
        }
        if (p == null && l == 0) {
            return null;
        }
        Object[] k = k(objArr);
        k[l] = p;
        return k;
    }

    public final void q(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.i = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.j = objArr;
            this.k = i;
            this.g = i2;
            return;
        }
        u8 u8Var = new u8(null);
        objArr.getClass();
        Object[] p = p(objArr, i2, i, u8Var);
        p.getClass();
        Object obj = u8Var.a;
        obj.getClass();
        this.j = (Object[]) obj;
        this.k = i;
        if (p[1] == null) {
            this.i = (Object[]) p[0];
            this.g = i2 - 5;
        } else {
            this.i = p;
            this.g = i2;
        }
    }

    public final Object[] r(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            gh0.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            gh0.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] k = k(objArr);
        int l = od0.l(i, i2);
        int i3 = i2 - 5;
        k[l] = r((Object[]) k[l], i, i3, it);
        while (true) {
            l++;
            if (l >= 32 || !it.hasNext()) {
                break;
            }
            k[l] = r((Object[]) k[l], 0, i3, it);
        }
        return k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return y(new v(1, collection));
    }

    public final Object[] s(Object[] objArr, int i, Object[][] objArr2) {
        o oVar = new o(objArr2);
        int i2 = i >> 5;
        int i3 = this.g;
        Object[] r = i2 < (1 << i3) ? r(objArr, i, i3, oVar) : k(objArr);
        while (oVar.hasNext()) {
            this.g += 5;
            r = n(r);
            int i4 = this.g;
            r(r, 1 << i4, i4, oVar);
        }
        return r;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        px0.p(i, a());
        if (B() > i) {
            u8 u8Var = new u8(null);
            Object[] objArr = this.i;
            objArr.getClass();
            this.i = C(objArr, this.g, i, obj, u8Var);
            return u8Var.a;
        }
        Object[] k = k(this.j);
        if (k != this.j) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = k[i2];
        k[i2] = obj;
        this.j = k;
        return obj2;
    }

    public final void t(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.k;
        int i2 = i >> 5;
        int i3 = this.g;
        if (i2 > (1 << i3)) {
            this.i = u(this.g + 5, n(objArr), objArr2);
            this.j = objArr3;
            this.g += 5;
            this.k++;
            return;
        }
        if (objArr == null) {
            this.i = objArr2;
            this.j = objArr3;
            this.k = i + 1;
        } else {
            this.i = u(i3, objArr, objArr2);
            this.j = objArr3;
            this.k++;
        }
    }

    public final Object[] u(int i, Object[] objArr, Object[] objArr2) {
        int l = od0.l(a() - 1, i);
        Object[] k = k(objArr);
        if (i == 5) {
            k[l] = objArr2;
            return k;
        }
        k[l] = u(i - 5, (Object[]) k[l], objArr2);
        return k;
    }

    public final int v(mu muVar, Object[] objArr, int i, int i2, u8 u8Var, ArrayList arrayList, ArrayList arrayList2) {
        if (i(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = u8Var.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) muVar.c(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m();
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        u8Var.a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int w(mu muVar, Object[] objArr, int i, u8 u8Var) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) muVar.c(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = k(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        u8Var.a = objArr2;
        return i2;
    }

    public final int x(mu muVar, int i, u8 u8Var) {
        int w = w(muVar, this.j, i, u8Var);
        Object obj = u8Var.a;
        if (w == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, w, i, (Object) null);
        this.j = objArr;
        this.k -= i - w;
        return w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (x(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y(mu muVar) {
        int i;
        mu muVar2 = muVar;
        int E = E();
        Object[] objArr = null;
        u8 u8Var = new u8(null);
        boolean z = false;
        if (this.i != null) {
            s j = j(0);
            int i2 = 32;
            while (i2 == 32 && j.hasNext()) {
                i2 = w(muVar2, (Object[]) j.next(), 32, u8Var);
            }
            if (i2 == 32) {
                int x = x(muVar2, E, u8Var);
                if (x == 0) {
                    q(this.i, this.k, this.g);
                }
            } else {
                int i3 = (j.d - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i4 = i2;
                while (j.hasNext()) {
                    i4 = v(muVar2, (Object[]) j.next(), 32, i4, u8Var, arrayList2, arrayList);
                    muVar2 = muVar;
                }
                int v = v(muVar, this.j, E, i4, u8Var, arrayList2, arrayList);
                Object obj = u8Var.a;
                obj.getClass();
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, v, 32, (Object) null);
                boolean isEmpty = arrayList.isEmpty();
                Object[] objArr3 = this.i;
                if (isEmpty) {
                    objArr3.getClass();
                } else {
                    objArr3 = r(objArr3, i3, this.g, arrayList.iterator());
                }
                int size = i3 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    gh0.a("invalid size");
                }
                if (size == 0) {
                    this.g = 0;
                } else {
                    int i5 = size - 1;
                    while (true) {
                        i = this.g;
                        if ((i5 >> i) != 0) {
                            break;
                        }
                        this.g = i - 5;
                        Object[] objArr4 = objArr3[0];
                        objArr4.getClass();
                        objArr3 = objArr4;
                    }
                    objArr = o(objArr3, i5, i);
                }
                this.i = objArr;
                this.j = objArr2;
                this.k = size + v;
            }
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] z(Object[] objArr, int i, int i2, u8 u8Var) {
        int l = od0.l(i2, i);
        if (i == 0) {
            Object obj = objArr[l];
            Object[] k = k(objArr);
            p8.T(objArr, k, l, l + 1, 32);
            k[31] = u8Var.a;
            u8Var.a = obj;
            return k;
        }
        int l2 = objArr[31] == null ? od0.l(B() - 1, i) : 31;
        Object[] k2 = k(objArr);
        int i3 = i - 5;
        int i4 = l + 1;
        if (i4 <= l2) {
            while (true) {
                Object obj2 = k2[l2];
                obj2.getClass();
                k2[l2] = z((Object[]) obj2, i3, 0, u8Var);
                if (l2 == i4) {
                    break;
                }
                l2--;
            }
        }
        Object obj3 = k2[l];
        obj3.getClass();
        k2[l] = z((Object[]) obj3, i3, i2, u8Var);
        return k2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int E = E();
        if (E < 32) {
            Object[] k = k(this.j);
            k[E] = obj;
            this.j = k;
            this.k = a() + 1;
        } else {
            t(this.i, this.j, n(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int E = E();
        Iterator it = collection.iterator();
        if (32 - E >= collection.size()) {
            Object[] k = k(this.j);
            d(k, E, it);
            this.j = k;
            this.k = collection.size() + this.k;
            return true;
        }
        int size = ((collection.size() + E) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] k2 = k(this.j);
        d(k2, E, it);
        objArr[0] = k2;
        for (int i = 1; i < size; i++) {
            Object[] m = m();
            d(m, 0, it);
            objArr[i] = m;
        }
        this.i = s(this.i, B(), objArr);
        Object[] m2 = m();
        d(m2, 0, it);
        this.j = m2;
        this.k = collection.size() + this.k;
        return true;
    }
}
