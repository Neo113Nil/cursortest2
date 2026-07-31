package yads;

import java.util.Arrays;

/* loaded from: classes10.dex */
public abstract class el0 {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static jw0 a(byte[] bArr, String str, String str2) {
        wb2 wb2Var;
        if (bArr[0] == Byte.MAX_VALUE) {
            wb2Var = new wb2(bArr);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b2 = copyOf[0];
            if (b2 == -2 || b2 == -1) {
                for (int i = 0; i < copyOf.length - 1; i += 2) {
                    byte b3 = copyOf[i];
                    int i2 = i + 1;
                    copyOf[i] = copyOf[i2];
                    copyOf[i2] = b3;
                }
            }
            wb2Var = new wb2(copyOf);
            if (copyOf[0] == 31) {
                wb2 wb2Var2 = new wb2(copyOf);
                while (wb2Var2.b() >= 16) {
                    wb2Var2.c(2);
                    int a2 = wb2Var2.a(14) & 16383;
                    int min = Math.min(8 - wb2Var.c, 14);
                    int i3 = wb2Var.c;
                    int i4 = (8 - i3) - min;
                    byte[] bArr2 = wb2Var.a;
                    int i5 = wb2Var.b;
                    byte b4 = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr2[i5]);
                    bArr2[i5] = b4;
                    int i6 = 14 - min;
                    bArr2[i5] = (byte) (b4 | ((a2 >>> i6) << i4));
                    int i7 = i5 + 1;
                    while (i6 > 8) {
                        wb2Var.a[i7] = (byte) (a2 >>> (i6 - 8));
                        i6 -= 8;
                        i7++;
                    }
                    int i8 = 8 - i6;
                    byte[] bArr3 = wb2Var.a;
                    byte b5 = (byte) (bArr3[i7] & ((1 << i8) - 1));
                    bArr3[i7] = b5;
                    bArr3[i7] = (byte) (((a2 & ((1 << i6) - 1)) << i8) | b5);
                    wb2Var.c(14);
                    wb2Var.a();
                }
            }
            wb2Var.b(copyOf, copyOf.length);
        }
        wb2Var.c(60);
        int i9 = a[wb2Var.a(6)];
        int i10 = b[wb2Var.a(4)];
        int a3 = wb2Var.a(5);
        int i11 = a3 < 29 ? (c[a3] * 1000) / 2 : -1;
        wb2Var.c(10);
        int i12 = i9 + (wb2Var.a(2) > 0 ? 1 : 0);
        iw0 iw0Var = new iw0();
        iw0Var.a = str;
        iw0Var.k = "audio/vnd.dts";
        iw0Var.f = i11;
        iw0Var.x = i12;
        iw0Var.y = i10;
        iw0Var.n = null;
        iw0Var.c = str2;
        return new jw0(iw0Var);
    }
}
