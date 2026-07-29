package o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.m8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1478m8 {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;

    public AbstractC1478m8(int... iArr) {
        List list;
        AbstractC0048Bt.n(iArr, "numbers");
        this.a = iArr;
        Integer l0 = P6.l0(iArr, 0);
        this.b = l0 != null ? l0.intValue() : -1;
        Integer l02 = P6.l0(iArr, 1);
        this.c = l02 != null ? l02.intValue() : -1;
        Integer l03 = P6.l0(iArr, 2);
        this.d = l03 != null ? l03.intValue() : -1;
        if (iArr.length <= 3) {
            list = C1318jk.h;
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + '.');
            }
            list = AbstractC0720ac.J0(new A(new Q6(iArr), 3, iArr.length));
        }
        this.e = list;
    }

    public final boolean a(int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.d >= i3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        AbstractC1478m8 abstractC1478m8 = (AbstractC1478m8) obj;
        return this.b == abstractC1478m8.b && this.c == abstractC1478m8.c && this.d == abstractC1478m8.d && AbstractC0048Bt.h(this.e, abstractC1478m8.e);
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i * 31) + this.c + i;
        int i3 = (i2 * 31) + this.d + i2;
        return this.e.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.a) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : AbstractC0720ac.t0(arrayList, ".", null, null, null, 62);
    }
}
