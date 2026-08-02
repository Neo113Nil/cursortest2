package com.meta.analytics.dsp.uinode;

import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Hz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0470Hz {
    public static byte[] A03;
    public static String[] A04 = {"oSbtVRwphkTFlAHrFUFfvlQVewHH9uZD", "ke9406sA8vEe4ogcratlCLLRCygX4Y6v", "LkVrMYKeL4j", "rD3J2lWEcQES1OY4rXh7UnGCqOy7njew", "qJRaOB7ViewD6", "qa5huEKLFbsop1eqm4Yriado9DIEiYjV", "GSl3McmMnOZYTOuxGBg0tC3pnH", "ySC3qX4TjccxO5mLdOZ"};
    public byte[] A00;
    public int A01;
    public int A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            String[] strArr = A04;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[5] = "EdmI6fYX5kJGCYPfpqvG1yUufp2PCRFX";
            strArr2[3] = "bDUsxAC2PGUD72vhZpZ7z8M6PcC6y0P6";
            copyOfRange[i4] = (byte) ((b - i3) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{50, 87, 95, 74, 85, 82, 77, 9, 62, Base64.padSymbol, 47, Ascii.SYN, 33, 9, 92, 78, 90, 94, 78, 87, 76, 78, 9, 76, 88, 87, 93, 82, 87, 94, 74, 93, 82, 88, 87, 9, 75, 98, 93, 78, 35, 9, 41, 78, 86, 65, 76, 73, 68, 0, 53, 52, 38, Ascii.CR, Ascii.CAN, 0, 83, 69, 81, 85, 69, 78, 67, 69, 0, 70, 73, 82, 83, 84, 0, 66, 89, 84, 69, Ascii.SUB, 0, -35, -8, -7, -87, -21, -14, -3, -87, -9, -8, -3, -87, 3, -18, -5, -8, -61, -87, -32, -33, -47, -72, -61};
    }

    static {
        A01();
    }

    public C0470Hz() {
    }

    public C0470Hz(int i) {
        this.A00 = new byte[i];
        this.A01 = i;
    }

    public C0470Hz(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public C0470Hz(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
    }

    public final char A02() {
        byte[] bArr = this.A00;
        int i = this.A02;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public final double A03() {
        return Double.longBitsToDouble(A0L());
    }

    public final int A04() {
        return this.A01 - this.A02;
    }

    public final int A05() {
        byte[] bArr = this.A00;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int A06() {
        return this.A02;
    }

    public final int A07() {
        return this.A01;
    }

    public final int A08() {
        byte[] bArr = this.A00;
        int i = this.A02;
        int i2 = i + 1;
        this.A02 = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i2 + 1;
        this.A02 = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 16);
        int i6 = i4 + 1;
        this.A02 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.A02 = i6 + 1;
        return (bArr[i6] & 255) | i7;
    }

    public final int A09() {
        byte[] bArr = this.A00;
        int i = this.A02;
        int i2 = i + 1;
        this.A02 = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        int i4 = i2 + 1;
        this.A02 = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        this.A02 = i4 + 1;
        return (bArr[i4] & 255) | i5;
    }

    public final int A0A() {
        byte[] bArr = this.A00;
        int i = this.A02;
        int i2 = i + 1;
        this.A02 = i2;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        this.A02 = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        int i6 = i4 + 1;
        this.A02 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.A02 = i6 + 1;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public final int A0B() {
        int A0A = A0A();
        if (A0A >= 0) {
            return A0A;
        }
        throw new IllegalStateException(A00(77, 18, 21) + A0A);
    }

    public final int A0C() {
        byte[] bArr = this.A00;
        int i = this.A02;
        int i2 = i + 1;
        this.A02 = i2;
        int i3 = bArr[i] & 255;
        this.A02 = i2 + 1;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final int A0D() {
        int b2 = A0E();
        int b1 = A0E();
        int b4 = A0E();
        int b3 = A0E();
        int b22 = (b2 << 21) | (b1 << 14);
        int b12 = b4 << 7;
        return b22 | b12 | b3;
    }

    public final int A0E() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        return bArr[i] & 255;
    }

    public final int A0F() {
        byte[] bArr = this.A00;
        int i = this.A02;
        int i2 = i + 1;
        this.A02 = i2;
        int i3 = (bArr[i] & 255) << 8;
        int i4 = i2 + 1;
        this.A02 = i4;
        int i5 = (bArr[i2] & 255) | i3;
        int result = i4 + 2;
        this.A02 = result;
        return i5;
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i = this.A02;
        int i2 = i + 1;
        this.A02 = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i2 + 1;
        this.A02 = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        this.A02 = i4 + 1;
        return (bArr[i4] & 255) | i5;
    }

    public final int A0H() {
        int A08 = A08();
        if (A08 >= 0) {
            return A08;
        }
        throw new IllegalStateException(A00(77, 18, 21) + A08);
    }

    public final int A0I() {
        byte[] bArr = this.A00;
        int i = this.A02;
        int i2 = i + 1;
        this.A02 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.A02 = i2 + 1;
        return (bArr[i2] & 255) | i3;
    }

    public final long A0J() {
        byte[] bArr = this.A00;
        int i = this.A02 + 1;
        this.A02 = i;
        int i2 = i + 1;
        this.A02 = i2;
        int i3 = i2 + 1;
        this.A02 = i3;
        long j = (bArr[r0] & 255) | ((bArr[i] & 255) << 8) | ((bArr[i2] & 255) << 16);
        int i4 = i3 + 1;
        this.A02 = i4;
        long j2 = j | ((bArr[i3] & 255) << 24);
        int i5 = i4 + 1;
        this.A02 = i5;
        long j3 = j2 | ((bArr[i4] & 255) << 32);
        int i6 = i5 + 1;
        this.A02 = i6;
        long j4 = j3 | ((bArr[i5] & 255) << 40);
        int i7 = i6 + 1;
        this.A02 = i7;
        long j5 = j4 | ((bArr[i6] & 255) << 48);
        this.A02 = i7 + 1;
        return ((bArr[i7] & 255) << 56) | j5;
    }

    public final long A0K() {
        byte[] bArr = this.A00;
        int i = this.A02 + 1;
        this.A02 = i;
        int i2 = i + 1;
        this.A02 = i2;
        int i3 = i2 + 1;
        this.A02 = i3;
        long j = (bArr[r0] & 255) | ((bArr[i] & 255) << 8) | ((bArr[i2] & 255) << 16);
        this.A02 = i3 + 1;
        return ((bArr[i3] & 255) << 24) | j;
    }

    public final long A0L() {
        byte[] bArr = this.A00;
        int i = this.A02 + 1;
        this.A02 = i;
        int i2 = i + 1;
        this.A02 = i2;
        long j = ((bArr[r0] & 255) << 56) | ((bArr[i] & 255) << 48);
        int i3 = i2 + 1;
        this.A02 = i3;
        long j2 = j | ((bArr[i2] & 255) << 40);
        int i4 = i3 + 1;
        this.A02 = i4;
        long j3 = j2 | ((bArr[i3] & 255) << 32);
        int i5 = i4 + 1;
        this.A02 = i5;
        long j4 = j3 | ((bArr[i4] & 255) << 24);
        int i6 = i5 + 1;
        this.A02 = i6;
        long j5 = j4 | ((bArr[i5] & 255) << 16);
        int i7 = i6 + 1;
        this.A02 = i7;
        long j6 = j5 | ((bArr[i6] & 255) << 8);
        this.A02 = i7 + 1;
        return (bArr[i7] & 255) | j6;
    }

    public final long A0M() {
        byte[] bArr = this.A00;
        int i = this.A02 + 1;
        this.A02 = i;
        int i2 = i + 1;
        this.A02 = i2;
        long j = ((bArr[r0] & 255) << 24) | ((bArr[i] & 255) << 16);
        int i3 = i2 + 1;
        this.A02 = i3;
        long j2 = j | ((bArr[i2] & 255) << 8);
        this.A02 = i3 + 1;
        return (bArr[i3] & 255) | j2;
    }

    public final long A0N() {
        long A0L = A0L();
        if (A0L >= 0) {
            return A0L;
        }
        throw new IllegalStateException(A00(77, 18, 21) + A0L);
    }

    public final long A0O() {
        int i = 0;
        byte[] bArr = this.A00;
        int length = this.A02;
        long j = bArr[length];
        int i2 = 7;
        while (true) {
            if (i2 < 0) {
                break;
            }
            int length2 = 1 << i2;
            long value = length2;
            if ((value & j) != 0) {
                i2--;
            } else if (i2 < 6) {
                int length3 = 1 << i2;
                j &= length3 - 1;
                i = 7 - i2;
            } else if (i2 == 7) {
                i = 1;
            }
        }
        if (i != 0) {
            for (int i3 = 1; i3 < i; i3++) {
                byte[] bArr2 = this.A00;
                int i4 = this.A02;
                if (A04[2].length() != 11) {
                    throw new RuntimeException();
                }
                A04[2] = "bgE5KGMxqsO";
                byte b = bArr2[i4 + i3];
                if ((b & 192) == 128) {
                    int length4 = b & 63;
                    j = (j << 6) | length4;
                } else {
                    throw new NumberFormatException(A00(0, 42, 117) + j);
                }
            }
            int length5 = this.A02;
            this.A02 = length5 + i;
            return j;
        }
        throw new NumberFormatException(A00(42, 35, 108) + j);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String A0P() {
        if (A04() == 0) {
            return null;
        }
        int i = this.A02;
        while (i < lineLimit) {
            int lineLimit = this.A00[i];
            if (IF.A0d(lineLimit)) {
                break;
            }
            i++;
        }
        int i2 = this.A02;
        int lineLimit2 = i - i2;
        if (lineLimit2 >= 3) {
            byte[] bArr = this.A00;
            if (bArr[i2] == -17) {
                int lineLimit3 = i2 + 1;
                if (bArr[lineLimit3] == -69) {
                    int lineLimit4 = i2 + 2;
                    if (bArr[lineLimit4] == -65) {
                        this.A02 = i2 + 3;
                    }
                }
            }
        }
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        int lineLimit5 = i - i3;
        String A0R = IF.A0R(bArr2, i3, lineLimit5);
        this.A02 = i;
        int i4 = this.A01;
        if (i == i4) {
            return A0R;
        }
        byte[] bArr3 = this.A00;
        if (bArr3[i] == 13) {
            int lineLimit6 = i + 1;
            this.A02 = lineLimit6;
            if (lineLimit6 == i4) {
                return A0R;
            }
        }
        int i5 = this.A02;
        String line = A04[0];
        if (line.charAt(27) == 'i') {
            throw new RuntimeException();
        }
        A04[7] = "dK52fOK8jWv7xyi3a3n";
        if (bArr3[i5] == 10) {
            int i6 = i5 + 1;
            String line2 = A04[0];
            if (line2.charAt(27) != 'i') {
                String[] strArr = A04;
                strArr[5] = "CzkRNJa9FDUHAtzqy7ViO0FrfGLEXvBM";
                strArr[3] = "L6K2rBVJE7KS5cY2UbZwATPHMS3LrQAX";
                this.A02 = i6;
            } else {
                A04[0] = "fuXjTapUFN2iKU6xFo1uSk4UrCSPBhbp";
                this.A02 = i6;
            }
        }
        return A0R;
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String A0Q() {
        if (A04() == 0) {
            return null;
        }
        int i = this.A02;
        while (i < stringLimit) {
            int stringLimit = this.A00[i];
            if (stringLimit == 0) {
                break;
            }
            i++;
        }
        byte[] bArr = this.A00;
        int i2 = this.A02;
        int stringLimit2 = i - i2;
        String string = IF.A0R(bArr, i2, stringLimit2);
        this.A02 = i;
        int stringLimit3 = this.A01;
        if (i < stringLimit3) {
            int stringLimit4 = i + 1;
            this.A02 = stringLimit4;
        }
        return string;
    }

    public final String A0R(int i) {
        if (i == 0) {
            return A00(0, 0, 25);
        }
        int i2 = i;
        int lastIndex = this.A02;
        int stringLength = lastIndex + i;
        int i3 = stringLength - 1;
        int stringLength2 = this.A01;
        if (i3 < stringLength2) {
            int stringLength3 = this.A00[i3];
            if (stringLength3 == 0) {
                i2--;
            }
        }
        String A0R = IF.A0R(this.A00, lastIndex, i2);
        String[] strArr = A04;
        String str = strArr[6];
        String str2 = strArr[4];
        int length = str.length();
        int stringLength4 = str2.length();
        if (length == stringLength4) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[6] = "dyM2aynMSNvMWhKjh5bvH5o1wH";
        strArr2[4] = "u6o51QVZzHu50";
        int stringLength5 = this.A02;
        this.A02 = stringLength5 + i;
        return A0R;
    }

    public final String A0S(int i) {
        return A0T(i, Charset.forName(A00(95, 5, 23)));
    }

    public final String A0T(int i, Charset charset) {
        String str = new String(this.A00, this.A02, i, charset);
        this.A02 += i;
        return str;
    }

    public final short A0U() {
        byte[] bArr = this.A00;
        int i = this.A02;
        int i2 = i + 1;
        this.A02 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.A02 = i2 + 1;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public final void A0V() {
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0W(int i) {
        A0b(A05() < i ? new byte[i] : this.A00, i);
    }

    public final void A0X(int i) {
        AbstractC0445Ha.A03(i >= 0 && i <= this.A00.length);
        this.A01 = i;
    }

    public final void A0Y(int i) {
        AbstractC0445Ha.A03(i >= 0 && i <= this.A01);
        this.A02 = i;
    }

    public final void A0Z(int i) {
        A0Y(this.A02 + i);
    }

    public final void A0a(C0469Hy c0469Hy, int i) {
        A0c(c0469Hy.A00, 0, i);
        c0469Hy.A07(0);
    }

    public final void A0b(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
        this.A02 = 0;
    }

    public final void A0c(byte[] bArr, int i, int i2) {
        System.arraycopy(this.A00, this.A02, bArr, i, i2);
        this.A02 += i2;
    }
}
