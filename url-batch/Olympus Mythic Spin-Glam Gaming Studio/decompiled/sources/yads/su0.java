package yads;

import java.util.Arrays;

/* loaded from: classes15.dex */
public abstract class su0 {
    public static wu0 a(xb2 xb2Var) {
        xb2Var.e(xb2Var.b + 1);
        int m = xb2Var.m();
        long j = xb2Var.b + m;
        int i = m / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long g = xb2Var.g();
            if (g == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = g;
            jArr2[i2] = xb2Var.g();
            xb2Var.e(xb2Var.b + 2);
            i2++;
        }
        int i3 = xb2Var.b;
        xb2Var.e(i3 + ((int) (j - i3)));
        return new wu0(jArr, jArr2);
    }
}
