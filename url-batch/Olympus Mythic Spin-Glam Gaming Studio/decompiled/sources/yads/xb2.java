package yads;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes15.dex */
public final class xb2 {
    public byte[] a;
    public int b;
    public int c;

    public xb2() {
        this.a = sb3.f;
    }

    public final void a(byte[] bArr) {
        int length = bArr.length;
        this.a = bArr;
        this.c = length;
        this.b = 0;
    }

    public final String b() {
        int i = this.c;
        int i2 = this.b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.c) {
            byte b = this.a[i2];
            int i3 = sb3.a;
            if (b == 10 || b == 13) {
                break;
            }
            i2++;
        }
        int i4 = this.b;
        if (i2 - i4 >= 3) {
            byte[] bArr = this.a;
            if (bArr[i4] == -17 && bArr[i4 + 1] == -69 && bArr[i4 + 2] == -65) {
                this.b = i4 + 3;
            }
        }
        byte[] bArr2 = this.a;
        int i5 = this.b;
        String a = sb3.a(bArr2, i5, i2 - i5);
        this.b = i2;
        int i6 = this.c;
        if (i2 == i6) {
            return a;
        }
        byte[] bArr3 = this.a;
        if (bArr3[i2] == 13) {
            int i7 = i2 + 1;
            this.b = i7;
            if (i7 == i6) {
                return a;
            }
        }
        int i8 = this.b;
        if (bArr3[i8] == 10) {
            this.b = i8 + 1;
        }
        return a;
    }

    public final void c(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void d(int i) {
        if (i < 0 || i > this.a.length) {
            throw new IllegalArgumentException();
        }
        this.c = i;
    }

    public final void e(int i) {
        if (i < 0 || i > this.c) {
            throw new IllegalArgumentException();
        }
        this.b = i;
    }

    public final int f() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.b = i + 2;
        return ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i3;
    }

    public final long g() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.b = i + 4;
        long j2 = j | ((bArr[r4] & 255) << 32);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 24);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r4] & 255) << 16);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 8);
        this.b = i + 8;
        return (bArr[r4] & 255) | j5;
    }

    public final String h() {
        int i = this.c;
        int i2 = this.b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.c && this.a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.a;
        int i3 = this.b;
        String a = sb3.a(bArr, i3, i2 - i3);
        this.b = i2;
        if (i2 >= this.c) {
            return a;
        }
        this.b = i2 + 1;
        return a;
    }

    public final short i() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i3);
    }

    public final int j() {
        return (k() << 21) | (k() << 14) | (k() << 7) | k();
    }

    public final int k() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final long l() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.b = i + 4;
        return (bArr[r4] & 255) | j;
    }

    public final int m() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i5;
    }

    public final int n() {
        int a = a();
        if (a >= 0) {
            return a;
        }
        throw new IllegalStateException(gg2.a(a, "Top bit not zero: "));
    }

    public final long o() {
        long g = g();
        if (g >= 0) {
            return g;
        }
        throw new IllegalStateException("Top bit not zero: " + g);
    }

    public final int p() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.b = i + 2;
        return (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i3;
    }

    public final long q() {
        int i;
        int i2;
        long j = this.a[this.b];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r6 - 1;
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i = 1; i < i2; i++) {
            if ((this.a[this.b + i] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | (r3 & 63);
        }
        this.b += i2;
        return j;
    }

    public xb2(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public final long d() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        long j2 = j | ((bArr[r8] & 255) << 24);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 32);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r8] & 255) << 40);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 48);
        this.b = i + 8;
        return ((bArr[r8] & 255) << 56) | j5;
    }

    public final long e() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        return ((bArr[r4] & 255) << 24) | j;
    }

    public final void a(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public xb2(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public final int c() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        this.b = i + 4;
        return ((bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | i7;
    }

    public final void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public xb2(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    public final int a() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        this.b = i + 4;
        return (bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i7;
    }

    public final String a(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final String b(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String a = sb3.a(this.a, i2, (i3 >= this.c || this.a[i3] != 0) ? i : i - 1);
        this.b += i;
        return a;
    }
}
