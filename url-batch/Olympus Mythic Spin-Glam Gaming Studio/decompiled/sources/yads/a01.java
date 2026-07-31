package yads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class a01 {
    public final List a;
    public final int b;
    public final float c;
    public final String d;

    public a01(List list, int i, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = f;
        this.d = str;
    }

    public static a01 a(xb2 xb2Var) {
        int i;
        try {
            xb2Var.e(xb2Var.b + 21);
            int k = xb2Var.k() & 3;
            int k2 = xb2Var.k();
            int i2 = xb2Var.b;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < k2; i5++) {
                xb2Var.e(xb2Var.b + 1);
                int p = xb2Var.p();
                for (int i6 = 0; i6 < p; i6++) {
                    int p2 = xb2Var.p();
                    i4 += p2 + 4;
                    xb2Var.e(xb2Var.b + p2);
                }
            }
            xb2Var.e(i2);
            byte[] bArr = new byte[i4];
            float f = 1.0f;
            String str = null;
            int i7 = 0;
            int i8 = 0;
            while (i7 < k2) {
                int k3 = xb2Var.k() & 127;
                int p3 = xb2Var.p();
                int i9 = i3;
                while (i9 < p3) {
                    int p4 = xb2Var.p();
                    System.arraycopy(py1.a, i3, bArr, i8, 4);
                    int i10 = i8 + 4;
                    System.arraycopy(xb2Var.a, xb2Var.b, bArr, i10, p4);
                    if (k3 == 33 && i9 == 0) {
                        my1 a = py1.a(bArr, i10, i10 + p4);
                        float f2 = a.g;
                        i = k2;
                        str = cx.a(a.a, a.b, a.c, a.d, a.e, a.f);
                        f = f2;
                    } else {
                        i = k2;
                    }
                    i8 = i10 + p4;
                    xb2Var.e(xb2Var.b + p4);
                    i9++;
                    k2 = i;
                    i3 = 0;
                }
                i7++;
                i3 = 0;
            }
            return new a01(i4 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), k + 1, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new cc2("Error parsing HEVC config", e, true, 1);
        }
    }
}
