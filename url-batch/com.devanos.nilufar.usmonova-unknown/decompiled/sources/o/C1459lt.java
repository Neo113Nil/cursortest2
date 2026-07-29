package o;

import java.util.Arrays;

/* renamed from: o.lt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1459lt {
    public int[] a;
    public int b;

    public C1459lt() {
        this.a = new int[10];
    }

    public int a() {
        int[] iArr = this.a;
        int i = this.b - 1;
        this.b = i;
        return iArr[i];
    }

    public void b(int i) {
        int i2 = this.b;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC0048Bt.m(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
        int[] iArr2 = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        iArr2[i3] = i;
    }

    public void c(int i, int i2, int i3) {
        int i4 = this.b;
        int i5 = i4 + 3;
        int[] iArr = this.a;
        if (i5 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC0048Bt.m(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
        int[] iArr2 = this.a;
        iArr2[i4] = i + i3;
        iArr2[i4 + 1] = i2 + i3;
        iArr2[i4 + 2] = i3;
        this.b = i5;
    }

    public void d(int i, int i2, int i3, int i4) {
        int i5 = this.b;
        int i6 = i5 + 4;
        int[] iArr = this.a;
        if (i6 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC0048Bt.m(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
        int[] iArr2 = this.a;
        iArr2[i5] = i;
        iArr2[i5 + 1] = i2;
        iArr2[i5 + 2] = i3;
        iArr2[i5 + 3] = i4;
        this.b = i6;
    }

    public void e(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.a;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    f(i3, i4);
                }
            }
            f(i3 + 3, i2);
            e(i, i3);
            e(i3 + 6, i2);
        }
    }

    public void f(int i, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    public C1459lt(int i) {
        this.a = new int[i];
    }
}
