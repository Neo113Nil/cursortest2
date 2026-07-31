package yads;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class ei1 {
    public final int a;
    public final int[] b;
    public final y73[] c;
    public final int[] d;
    public final int[][][] e;
    public final y73 f;

    public ei1(int[] iArr, y73[] y73VarArr, int[] iArr2, int[][][] iArr3, y73 y73Var) {
        this.b = iArr;
        this.c = y73VarArr;
        this.e = iArr3;
        this.d = iArr2;
        this.f = y73Var;
        this.a = iArr.length;
    }

    public final int a(int i, int i2) {
        int i3 = this.c[i].a(i2).b;
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if ((this.e[i][i2][i6] & 7) == 4) {
                iArr[i5] = i6;
                i5++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i5);
        int i7 = 16;
        int i8 = 0;
        String str = null;
        boolean z = false;
        while (i4 < copyOf.length) {
            String str2 = this.c[i].a(i2).e[copyOf[i4]].m;
            int i9 = i8 + 1;
            if (i8 == 0) {
                str = str2;
            } else {
                z |= !sb3.a(str, str2);
            }
            i7 = Math.min(i7, this.e[i][i2][i4] & 24);
            i4++;
            i8 = i9;
        }
        return z ? Math.min(i7, this.d[i]) : i7;
    }
}
