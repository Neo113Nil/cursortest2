package yads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class mc1 extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    public final int[] b;
    public final int c;
    public final int d;

    public mc1(int[] iArr) {
        int length = iArr.length;
        this.b = iArr;
        this.c = 0;
        this.d = length;
    }

    public final int[] a() {
        return Arrays.copyOfRange(this.b, this.c, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.b;
            int intValue = ((Integer) obj).intValue();
            int i = this.c;
            int i2 = this.d;
            while (true) {
                if (i >= i2) {
                    i = -1;
                    break;
                }
                if (iArr[i] == intValue) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mc1)) {
            return super.equals(obj);
        }
        mc1 mc1Var = (mc1) obj;
        int i = this.d - this.c;
        if (mc1Var.d - mc1Var.c != i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[this.c + i2] != mc1Var.b[mc1Var.c + i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        hg2.a(i, this.d - this.c);
        return Integer.valueOf(this.b[this.c + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.c; i2 < this.d; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.b;
            int intValue = ((Integer) obj).intValue();
            int i = this.c;
            int i2 = this.d;
            while (true) {
                if (i >= i2) {
                    i = -1;
                    break;
                }
                if (iArr[i] == intValue) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                return i - this.c;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.b;
            int intValue = ((Integer) obj).intValue();
            int i = this.c;
            int i2 = this.d - 1;
            while (true) {
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
                if (iArr[i2] == intValue) {
                    break;
                }
                i2--;
            }
            if (i2 >= 0) {
                return i2 - this.c;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        hg2.a(i, this.d - this.c);
        int[] iArr = this.b;
        int i2 = this.c + i;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d - this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        hg2.a(i, i2, this.d - this.c);
        if (i == i2) {
            return Collections.emptyList();
        }
        int[] iArr = this.b;
        int i3 = this.c;
        return new mc1(i + i3, i3 + i2, iArr);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder((this.d - this.c) * 5);
        sb.append('[');
        sb.append(this.b[this.c]);
        int i = this.c;
        while (true) {
            i++;
            if (i >= this.d) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.b[i]);
        }
    }

    public mc1(int i, int i2, int[] iArr) {
        this.b = iArr;
        this.c = i;
        this.d = i2;
    }
}
