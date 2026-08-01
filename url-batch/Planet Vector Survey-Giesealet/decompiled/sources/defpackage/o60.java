package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class o60 {
    public int[] a;
    public int b;

    public o60(int i) {
        this.a = i == 0 ? hz.a : new int[i];
    }

    public final void a(int i) {
        int i2 = this.b + 1;
        int[] iArr = this.a;
        if (iArr.length < i2) {
            this.a = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
        }
        int[] iArr2 = this.a;
        int i3 = this.b;
        iArr2[i3] = i;
        this.b = i3 + 1;
    }

    public final int b(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        g8.m("Index must be between 0 and size");
        return 0;
    }

    public final void c(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            g8.m("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            p8.R(iArr, iArr, i, i + 1, i2);
        }
        this.b--;
    }

    public final void d(int i, int i2) {
        if (i < 0 || i >= this.b) {
            g8.m("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o60) {
            o60 o60Var = (o60) obj;
            int i = o60Var.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = o60Var.a;
                ez v = rg0.v(0, i2);
                int i3 = v.d;
                int i4 = v.e;
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
            i2 += iArr[i3] * 31;
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
        return sb.toString();
    }

    public /* synthetic */ o60() {
        this(16);
    }
}
