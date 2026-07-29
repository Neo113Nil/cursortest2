package o;

import java.util.Arrays;

/* renamed from: o.Sb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0471Sb extends AbstractC0549Vb {
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public int h;
    public int i = Integer.MAX_VALUE;

    public C0471Sb(byte[] bArr, int i, int i2, boolean z) {
        this.c = bArr;
        this.d = i2 + i;
        this.f = i;
        this.g = i;
    }

    public final int A() {
        int i;
        int i2 = this.f;
        int i3 = this.d;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.c;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f = i5;
                return i;
            }
        }
        return (int) C();
    }

    public final long B() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f;
        int i2 = this.d;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.c;
            byte b = bArr[i];
            if (b >= 0) {
                this.f = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f = i4;
                return j;
            }
        }
        return C();
    }

    public final long C() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f;
            if (i2 == this.d) {
                throw C0230It.e();
            }
            this.f = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.c[i2] & 128) == 0) {
                return j;
            }
        }
        throw C0230It.c();
    }

    public final void D() {
        int i = this.d + this.e;
        this.d = i;
        int i2 = i - this.g;
        int i3 = this.i;
        if (i2 <= i3) {
            this.e = 0;
            return;
        }
        int i4 = i2 - i3;
        this.e = i4;
        this.d = i - i4;
    }

    public final void E(int i) {
        if (i >= 0) {
            int i2 = this.d;
            int i3 = this.f;
            if (i <= i2 - i3) {
                this.f = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw C0230It.e();
        }
        throw C0230It.d();
    }

    @Override // o.AbstractC0549Vb
    public final void a(int i) {
        if (this.h != i) {
            throw new C0230It("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // o.AbstractC0549Vb
    public final int b() {
        return this.f - this.g;
    }

    @Override // o.AbstractC0549Vb
    public final boolean c() {
        return this.f == this.d;
    }

    @Override // o.AbstractC0549Vb
    public final void d(int i) {
        this.i = i;
        D();
    }

    @Override // o.AbstractC0549Vb
    public final int e(int i) {
        if (i < 0) {
            throw C0230It.d();
        }
        int b = b() + i;
        if (b < 0) {
            throw new C0230It("Failed to parse the message.");
        }
        int i2 = this.i;
        if (b > i2) {
            throw C0230It.e();
        }
        this.i = b;
        D();
        return i2;
    }

    @Override // o.AbstractC0549Vb
    public final boolean f() {
        return B() != 0;
    }

    @Override // o.AbstractC0549Vb
    public final C1151h9 g() {
        byte[] bArr;
        int A = A();
        byte[] bArr2 = this.c;
        if (A > 0) {
            int i = this.d;
            int i2 = this.f;
            if (A <= i - i2) {
                C1151h9 l = C1151h9.l(bArr2, i2, A);
                this.f += A;
                return l;
            }
        }
        if (A == 0) {
            return C1151h9.j;
        }
        if (A > 0) {
            int i3 = this.d;
            int i4 = this.f;
            if (A <= i3 - i4) {
                int i5 = A + i4;
                this.f = i5;
                bArr = Arrays.copyOfRange(bArr2, i4, i5);
                C1151h9 c1151h9 = C1151h9.j;
                return new C1151h9(bArr);
            }
        }
        if (A > 0) {
            throw C0230It.e();
        }
        if (A != 0) {
            throw C0230It.d();
        }
        bArr = AbstractC2052ut.b;
        C1151h9 c1151h92 = C1151h9.j;
        return new C1151h9(bArr);
    }

    @Override // o.AbstractC0549Vb
    public final double h() {
        return Double.longBitsToDouble(z());
    }

    @Override // o.AbstractC0549Vb
    public final int i() {
        return A();
    }

    @Override // o.AbstractC0549Vb
    public final int j() {
        return y();
    }

    @Override // o.AbstractC0549Vb
    public final long k() {
        return z();
    }

    @Override // o.AbstractC0549Vb
    public final float l() {
        return Float.intBitsToFloat(y());
    }

    @Override // o.AbstractC0549Vb
    public final int m() {
        return A();
    }

    @Override // o.AbstractC0549Vb
    public final long n() {
        return B();
    }

    @Override // o.AbstractC0549Vb
    public final int o() {
        return y();
    }

    @Override // o.AbstractC0549Vb
    public final long p() {
        return z();
    }

    @Override // o.AbstractC0549Vb
    public final int q() {
        int A = A();
        return (-(A & 1)) ^ (A >>> 1);
    }

    @Override // o.AbstractC0549Vb
    public final long r() {
        long B = B();
        return (-(B & 1)) ^ (B >>> 1);
    }

    @Override // o.AbstractC0549Vb
    public final String s() {
        int A = A();
        if (A > 0) {
            int i = this.d;
            int i2 = this.f;
            if (A <= i - i2) {
                String str = new String(this.c, i2, A, AbstractC2052ut.a);
                this.f += A;
                return str;
            }
        }
        if (A == 0) {
            return "";
        }
        if (A < 0) {
            throw C0230It.d();
        }
        throw C0230It.e();
    }

    @Override // o.AbstractC0549Vb
    public final String t() {
        int A = A();
        if (A > 0) {
            int i = this.d;
            int i2 = this.f;
            if (A <= i - i2) {
                String g = FY.a.g(this.c, i2, A);
                this.f += A;
                return g;
            }
        }
        if (A == 0) {
            return "";
        }
        if (A <= 0) {
            throw C0230It.d();
        }
        throw C0230It.e();
    }

    @Override // o.AbstractC0549Vb
    public final int u() {
        if (c()) {
            this.h = 0;
            return 0;
        }
        int A = A();
        this.h = A;
        if ((A >>> 3) != 0) {
            return A;
        }
        throw new C0230It("Protocol message contained an invalid tag (zero).");
    }

    @Override // o.AbstractC0549Vb
    public final int v() {
        return A();
    }

    @Override // o.AbstractC0549Vb
    public final long w() {
        return B();
    }

    @Override // o.AbstractC0549Vb
    public final boolean x(int i) {
        int u;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.d - this.f;
            byte[] bArr = this.c;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.f;
                    this.f = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw C0230It.c();
            }
            while (i3 < 10) {
                int i6 = this.f;
                if (i6 == this.d) {
                    throw C0230It.e();
                }
                this.f = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw C0230It.c();
            return true;
        }
        if (i2 == 1) {
            E(8);
            return true;
        }
        if (i2 == 2) {
            E(A());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw C0230It.b();
            }
            E(4);
            return true;
        }
        do {
            u = u();
            if (u == 0) {
                break;
            }
        } while (x(u));
        a(((i >>> 3) << 3) | 4);
        return true;
    }

    public final int y() {
        int i = this.f;
        if (this.d - i < 4) {
            throw C0230It.e();
        }
        this.f = i + 4;
        byte[] bArr = this.c;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long z() {
        int i = this.f;
        if (this.d - i < 8) {
            throw C0230It.e();
        }
        this.f = i + 8;
        byte[] bArr = this.c;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
