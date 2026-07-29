package o;

import java.util.Arrays;

/* renamed from: o.yD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2274yD {
    public int[] a;
    public int b;

    public C2274yD(int i) {
        this.a = i == 0 ? AbstractC1393kt.a : new int[i];
    }

    public final void a(int i) {
        b(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
            AbstractC0048Bt.m(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    public final int c(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        StringBuilder i2 = AbstractC2188wx.i(i, "Index ", " must be in 0..");
        i2.append(this.b - 1);
        throw new IndexOutOfBoundsException(i2.toString());
    }

    public final int d(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            StringBuilder i3 = AbstractC2188wx.i(i, "Index ", " must be in 0..");
            i3.append(this.b - 1);
            throw new IndexOutOfBoundsException(i3.toString());
        }
        int[] iArr = this.a;
        int i4 = iArr[i];
        if (i != i2 - 1) {
            P6.a0(i, i + 1, i2, iArr, iArr);
        }
        this.b--;
        return i4;
    }

    public final void e(int i, int i2) {
        if (i < 0 || i >= this.b) {
            StringBuilder i3 = AbstractC2188wx.i(i, "set index ", " must be between 0 .. ");
            i3.append(this.b - 1);
            throw new IndexOutOfBoundsException(i3.toString());
        }
        int[] iArr = this.a;
        int i4 = iArr[i];
        iArr[i] = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2274yD) {
            C2274yD c2274yD = (C2274yD) obj;
            int i = c2274yD.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = c2274yD.a;
                C1197ht c0 = AbstractC1807r8.c0(0, i2);
                int i3 = c0.h;
                int i4 = c0.i;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Integer.hashCode(iArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ C2274yD() {
        this(16);
    }
}
