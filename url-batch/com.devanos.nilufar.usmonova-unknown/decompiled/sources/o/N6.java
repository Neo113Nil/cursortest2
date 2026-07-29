package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class N6 implements Collection, Set, InterfaceC1660ow, InterfaceC0103Dw {
    public int[] h = AbstractC1473m3.b;
    public Object[] i = AbstractC1473m3.d;
    public int j;

    public N6(int i) {
        if (i > 0) {
            PX.j(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int a0;
        int i2 = this.j;
        if (obj == null) {
            a0 = PX.a0(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            a0 = PX.a0(this, obj, hashCode);
        }
        if (a0 >= 0) {
            return false;
        }
        int i3 = ~a0;
        int[] iArr = this.h;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.i;
            int[] iArr2 = new int[i4];
            this.h = iArr2;
            this.i = new Object[i4];
            if (i2 != this.j) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                P6.c0(0, iArr.length, 6, iArr, iArr2);
                P6.d0(objArr, this.i, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.h;
            int i5 = i3 + 1;
            P6.a0(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.i;
            P6.b0(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.j;
        if (i2 == i6) {
            int[] iArr4 = this.h;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.i[i3] = obj;
                this.j = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        AbstractC0048Bt.n(collection, "elements");
        int size = collection.size() + this.j;
        int i = this.j;
        int[] iArr = this.h;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.i;
            int[] iArr2 = new int[size];
            this.h = iArr2;
            this.i = new Object[size];
            if (i > 0) {
                P6.c0(0, i, 6, iArr, iArr2);
                P6.d0(objArr, this.i, 0, this.j, 6);
            }
        }
        if (this.j != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.j != 0) {
            this.h = AbstractC1473m3.b;
            this.i = AbstractC1473m3.d;
            this.j = 0;
        }
        if (this.j != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? PX.a0(this, null, 0) : PX.a0(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        AbstractC0048Bt.n(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.j != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.j;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.i[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.h;
        int i = this.j;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.j <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new F6(this);
    }

    public final Object j(int i) {
        int i2 = this.j;
        Object[] objArr = this.i;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.h;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                P6.a0(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.i;
                P6.b0(objArr2, objArr2, i, i4, i2);
            }
            this.i[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.h = iArr2;
            this.i = new Object[i5];
            if (i > 0) {
                P6.c0(0, i, 6, iArr, iArr2);
                P6.d0(objArr, this.i, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                P6.a0(i, i6, i2, iArr, this.h);
                P6.b0(objArr, this.i, i, i6, i2);
            }
        }
        if (i2 != this.j) {
            throw new ConcurrentModificationException();
        }
        this.j = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int a0 = obj == null ? PX.a0(this, null, 0) : PX.a0(this, obj, obj.hashCode());
        if (a0 < 0) {
            return false;
        }
        j(a0);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        AbstractC0048Bt.n(collection, "elements");
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        AbstractC0048Bt.n(collection, "elements");
        boolean z = false;
        for (int i = this.j - 1; -1 < i; i--) {
            if (!AbstractC0720ac.j0(collection, this.i[i])) {
                j(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.j;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return P6.f0(this.i, 0, this.j);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.j * 14);
        sb.append('{');
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.i[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "array");
        int i = this.j;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        P6.b0(this.i, objArr, 0, 0, this.j);
        return objArr;
    }
}
