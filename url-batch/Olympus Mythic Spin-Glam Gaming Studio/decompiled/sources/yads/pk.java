package yads;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class pk {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    public pk(ArrayList arrayList, int i, int i2, int i3, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = str;
    }

    public static pk a(xb2 xb2Var) {
        int i;
        int i2;
        float f;
        String str;
        try {
            xb2Var.e(xb2Var.b + 4);
            int k = (xb2Var.k() & 3) + 1;
            if (k == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int k2 = xb2Var.k() & 31;
            for (int i3 = 0; i3 < k2; i3++) {
                int p = xb2Var.p();
                int i4 = xb2Var.b;
                xb2Var.e(i4 + p);
                byte[] bArr = xb2Var.a;
                byte[] bArr2 = new byte[p + 4];
                System.arraycopy(cx.a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i4, bArr2, 4, p);
                arrayList.add(bArr2);
            }
            int k3 = xb2Var.k();
            for (int i5 = 0; i5 < k3; i5++) {
                int p2 = xb2Var.p();
                int i6 = xb2Var.b;
                xb2Var.e(i6 + p2);
                byte[] bArr3 = xb2Var.a;
                byte[] bArr4 = new byte[p2 + 4];
                System.arraycopy(cx.a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i6, bArr4, 4, p2);
                arrayList.add(bArr4);
            }
            if (k2 > 0) {
                oy1 b = py1.b((byte[]) arrayList.get(0), k, ((byte[]) arrayList.get(0)).length);
                int i7 = b.e;
                int i8 = b.f;
                float f2 = b.g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(b.a), Integer.valueOf(b.b), Integer.valueOf(b.c));
                i = i7;
                i2 = i8;
                f = f2;
            } else {
                i = -1;
                i2 = -1;
                f = 1.0f;
                str = null;
            }
            return new pk(arrayList, k, i, i2, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new cc2("Error parsing AVC config", e, true, 1);
        }
    }
}
