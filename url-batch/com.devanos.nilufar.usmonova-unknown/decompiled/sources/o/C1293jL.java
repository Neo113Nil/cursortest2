package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: o.jL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1293jL extends K implements RandomAccess {
    public static final C1293jL k;
    public Object[] i;
    public int j;

    static {
        C1293jL c1293jL = new C1293jL(new Object[0], 0);
        k = c1293jL;
        c1293jL.h = false;
    }

    public C1293jL(Object[] objArr, int i) {
        this.i = objArr;
        this.j = i;
    }

    @Override // o.K, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        j();
        int i = this.j;
        Object[] objArr = this.i;
        if (i == objArr.length) {
            this.i = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.i;
        int i2 = this.j;
        this.j = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // o.InterfaceC1920st
    public final InterfaceC1920st d(int i) {
        if (i >= this.j) {
            return new C1293jL(Arrays.copyOf(this.i, i), this.j);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        k(i);
        return this.i[i];
    }

    public final void k(int i) {
        if (i < 0 || i >= this.j) {
            StringBuilder i2 = AbstractC2188wx.i(i, "Index:", ", Size:");
            i2.append(this.j);
            throw new IndexOutOfBoundsException(i2.toString());
        }
    }

    @Override // o.K, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        j();
        k(i);
        Object[] objArr = this.i;
        Object obj = objArr[i];
        if (i < this.j - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.j--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        j();
        k(i);
        Object[] objArr = this.i;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        j();
        if (i >= 0 && i <= (i2 = this.j)) {
            Object[] objArr = this.i;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.i, i, objArr2, i + 1, this.j - i);
                this.i = objArr2;
            }
            this.i[i] = obj;
            this.j++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder i3 = AbstractC2188wx.i(i, "Index:", ", Size:");
        i3.append(this.j);
        throw new IndexOutOfBoundsException(i3.toString());
    }
}
