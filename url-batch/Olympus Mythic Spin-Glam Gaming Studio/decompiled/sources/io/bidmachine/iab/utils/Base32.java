package io.bidmachine.iab.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.charset.Charset;

/* loaded from: classes14.dex */
public class Base32 {
    private static final byte[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};

    private static final class b {
        long a;
        byte[] b;
        int c;
        int d;
        boolean e;
        int f;

        private b() {
        }
    }

    private int a(int i, int i2) {
        int i3 = i - 2147483648;
        int i4 = i2 - 2147483648;
        if (i3 < i4) {
            return -1;
        }
        return i3 == i4 ? 0 : 1;
    }

    @NonNull
    public String decode(@NonNull String str) {
        return decode(str.getBytes(Charset.forName("UTF-8")));
    }

    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v20 */
    private void a(byte[] bArr, int i, int i2, b bVar) {
        byte b2;
        if (bVar.e) {
            return;
        }
        ?? r3 = 1;
        if (i2 < 0) {
            bVar.e = true;
        }
        int i3 = 0;
        int i4 = i;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            if (b3 == 61) {
                bVar.e = r3;
                break;
            }
            byte[] a2 = a(7, bVar);
            if (b3 >= 0) {
                byte[] bArr2 = a;
                if (b3 < bArr2.length && (b2 = bArr2[b3]) >= 0) {
                    int i6 = (bVar.f + r3) % 8;
                    bVar.f = i6;
                    bVar.a = (bVar.a << 5) + b2;
                    if (i6 == 0) {
                        int i7 = bVar.c;
                        int i8 = i7 + 1;
                        bVar.c = i8;
                        a2[i7] = (byte) ((r12 >> 32) & 255);
                        int i9 = i7 + 2;
                        bVar.c = i9;
                        a2[i8] = (byte) ((r12 >> 24) & 255);
                        int i10 = i7 + 3;
                        bVar.c = i10;
                        a2[i9] = (byte) ((r12 >> 16) & 255);
                        int i11 = i7 + 4;
                        bVar.c = i11;
                        a2[i10] = (byte) ((r12 >> 8) & 255);
                        bVar.c = i7 + 5;
                        a2[i11] = (byte) (r12 & 255);
                    }
                }
            }
            i3++;
            i4 = i5;
            r3 = 1;
        }
        if (!bVar.e || bVar.f <= 0) {
            return;
        }
        byte[] a3 = a(7, bVar);
        switch (bVar.f) {
            case 1:
            case 2:
                int i12 = bVar.c;
                bVar.c = i12 + 1;
                a3[i12] = (byte) ((bVar.a >> 2) & 255);
                return;
            case 3:
                int i13 = bVar.c;
                bVar.c = i13 + 1;
                a3[i13] = (byte) ((bVar.a >> 7) & 255);
                return;
            case 4:
                bVar.a = bVar.a >> 4;
                int i14 = bVar.c;
                int i15 = i14 + 1;
                bVar.c = i15;
                a3[i14] = (byte) ((r5 >> 12) & 255);
                bVar.c = i14 + 2;
                a3[i15] = (byte) (r3 & 255);
                return;
            case 5:
                bVar.a = bVar.a >> 1;
                int i16 = bVar.c;
                int i17 = i16 + 1;
                bVar.c = i17;
                a3[i16] = (byte) ((r3 >> 17) & 255);
                int i18 = i16 + 2;
                bVar.c = i18;
                a3[i17] = (byte) ((r3 >> 9) & 255);
                bVar.c = i16 + 3;
                a3[i18] = (byte) (r9 & 255);
                return;
            case 6:
                bVar.a = bVar.a >> 6;
                int i19 = bVar.c;
                int i20 = i19 + 1;
                bVar.c = i20;
                a3[i19] = (byte) ((r3 >> 22) & 255);
                int i21 = i19 + 2;
                bVar.c = i21;
                a3[i20] = (byte) ((r3 >> 14) & 255);
                bVar.c = i19 + 3;
                a3[i21] = (byte) (r9 & 255);
                return;
            case 7:
                bVar.a = bVar.a >> 3;
                int i22 = bVar.c;
                int i23 = i22 + 1;
                bVar.c = i23;
                a3[i22] = (byte) ((r9 >> 27) & 255);
                int i24 = i22 + 2;
                bVar.c = i24;
                a3[i23] = (byte) ((r9 >> 19) & 255);
                int i25 = i22 + 3;
                bVar.c = i25;
                a3[i24] = (byte) ((r9 >> 11) & 255);
                bVar.c = i22 + 4;
                a3[i25] = (byte) (r5 & 255);
                return;
            default:
                throw new IllegalStateException("Impossible modulus " + bVar.f);
        }
    }

    @NonNull
    public String decode(@Nullable byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new String(bArr);
        }
        b bVar = new b();
        a(bArr, 0, bArr.length, bVar);
        a(bArr, 0, -1, bVar);
        int i = bVar.c;
        byte[] bArr2 = new byte[i];
        a(bArr2, i, bVar);
        return new String(bArr2);
    }

    private byte[] a(int i, b bVar) {
        byte[] bArr = bVar.b;
        if (bArr == null) {
            bVar.b = new byte[Math.max(i, 8192)];
            bVar.c = 0;
            bVar.d = 0;
        } else {
            int i2 = bVar.c + i;
            if (i2 - bArr.length > 0) {
                return a(bVar, i2);
            }
        }
        return bVar.b;
    }

    private byte[] a(b bVar, int i) {
        int length = bVar.b.length * 2;
        if (a(length, i) < 0) {
            length = i;
        }
        if (a(length, 2147483639) > 0) {
            length = Math.max(i, 2147483639);
        }
        byte[] bArr = new byte[length];
        byte[] bArr2 = bVar.b;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        bVar.b = bArr;
        return bArr;
    }

    private void a(byte[] bArr, int i, b bVar) {
        if (bVar.b != null) {
            int min = Math.min(a(bVar), i);
            System.arraycopy(bVar.b, bVar.d, bArr, 0, min);
            int i2 = bVar.d + min;
            bVar.d = i2;
            if (i2 >= bVar.c) {
                bVar.b = null;
            }
        }
    }

    private int a(b bVar) {
        if (bVar.b != null) {
            return bVar.c - bVar.d;
        }
        return 0;
    }
}
