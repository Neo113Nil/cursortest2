package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class pd0 implements up0 {
    public final n30 b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        go0.a("goog.exo.extractor");
    }

    public pd0(n30 n30Var, long j, long j2) {
        this.b = n30Var;
        this.d = j;
        this.c = j2;
    }

    @Override // yads.up0
    public final void a(byte[] bArr, int i, int i2) {
        b(bArr, i, i2, false);
    }

    @Override // yads.up0
    public final void b(byte[] bArr, int i, int i2) {
        a(bArr, i, i2, false);
    }

    @Override // yads.up0
    public final void c() {
        this.f = 0;
    }

    public final int d(byte[] bArr, int i, int i2) {
        int min;
        int i3 = this.f + i2;
        byte[] bArr2 = this.e;
        if (i3 > bArr2.length) {
            int i4 = sb3.a;
            this.e = Arrays.copyOf(this.e, Math.max(65536 + i3, Math.min(bArr2.length * 2, i3 + 524288)));
        }
        int i5 = this.g;
        int i6 = this.f;
        int i7 = i5 - i6;
        if (i7 == 0) {
            min = a(this.e, i6, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            this.g += min;
        } else {
            min = Math.min(i2, i7);
        }
        System.arraycopy(this.e, this.f, bArr, i, min);
        this.f += min;
        return min;
    }

    @Override // yads.up0
    public final long e() {
        return this.d + this.f;
    }

    @Override // yads.up0
    public final long f() {
        return this.d;
    }

    @Override // yads.up0
    public final long a() {
        return this.c;
    }

    @Override // yads.up0
    public final boolean b(byte[] bArr, int i, int i2, boolean z) {
        if (!a(z, i2)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // yads.n30
    public final int c(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            c(min);
            i4 = min;
        }
        if (i4 == 0) {
            i4 = a(bArr, i, i2, 0, true);
        }
        if (i4 != -1) {
            this.d += i4;
        }
        return i4;
    }

    public final boolean a(boolean z, int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            int i3 = sb3.a;
            this.e = Arrays.copyOf(this.e, Math.max(65536 + i2, Math.min(bArr.length * 2, i2 + 524288)));
        }
        int i4 = this.g - this.f;
        while (i4 < i) {
            i4 = a(this.e, this.f, i, i4, z);
            if (i4 == -1) {
                return false;
            }
            this.g = this.f + i4;
        }
        this.f += i;
        return true;
    }

    @Override // yads.up0
    public final void b(int i) {
        a(false, i);
    }

    public final void c(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // yads.up0
    public final void a(int i) {
        int min = Math.min(this.g, i);
        c(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            i2 = a(this.a, -i2, Math.min(i, this.a.length + i2), i2, false);
        }
        if (i2 != -1) {
            this.d += i2;
        }
    }

    @Override // yads.up0
    public final boolean a(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        int i4 = this.g;
        if (i4 == 0) {
            i3 = 0;
        } else {
            int min = Math.min(i4, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            c(min);
            i3 = min;
        }
        while (i3 < i2 && i3 != -1) {
            i3 = a(bArr, i, i2, i3, z);
        }
        if (i3 != -1) {
            this.d += i3;
        }
        return i3 != -1;
    }

    public final int a(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int c = this.b.c(bArr, i + i3, i2 - i3);
            if (c != -1) {
                return i3 + c;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }
}
