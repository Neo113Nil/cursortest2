package yads;

import com.inmobi.media.core.config.models.AdConfig;

/* loaded from: classes5.dex */
public final class dl0 implements zl0 {
    public final String b;
    public String c;
    public c83 d;
    public int f;
    public int g;
    public long h;
    public jw0 i;
    public int j;
    public final xb2 a = new xb2(new byte[18]);
    public int e = 0;
    public long k = -9223372036854775807L;

    public dl0(String str) {
        this.b = str;
    }

    @Override // yads.zl0
    public final void a() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = -9223372036854775807L;
    }

    @Override // yads.zl0
    public final void b() {
    }

    @Override // yads.zl0
    public final void a(wp0 wp0Var, z93 z93Var) {
        z93Var.a();
        z93Var.b();
        this.c = z93Var.e;
        z93Var.b();
        this.d = wp0Var.a(z93Var.d, 1);
    }

    @Override // yads.zl0
    public final void a(int i, long j) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010e  */
    @Override // yads.zl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xb2 xb2Var) {
        int i;
        byte b;
        boolean z;
        int i2;
        int i3;
        byte b2;
        int i4;
        byte b3;
        int i5;
        if (this.d == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i6 = xb2Var.c - xb2Var.b;
            if (i6 <= 0) {
                return;
            }
            int i7 = this.e;
            if (i7 == 0) {
                while (xb2Var.c - xb2Var.b > 0) {
                    int i8 = this.g << 8;
                    this.g = i8;
                    int k = i8 | xb2Var.k();
                    this.g = k;
                    if (k == 2147385345 || k == -25230976 || k == 536864768 || k == -14745368) {
                        byte[] bArr = this.a.a;
                        bArr[0] = (byte) ((k >> 24) & 255);
                        bArr[1] = (byte) ((k >> 16) & 255);
                        bArr[2] = (byte) ((k >> 8) & 255);
                        bArr[3] = (byte) (k & 255);
                        this.f = 4;
                        this.g = 0;
                        this.e = 1;
                        break;
                    }
                }
            } else if (i7 == 1) {
                byte[] bArr2 = this.a.a;
                int min = Math.min(i6, 18 - this.f);
                xb2Var.a(bArr2, this.f, min);
                int i9 = this.f + min;
                this.f = i9;
                if (i9 == 18) {
                    byte[] bArr3 = this.a.a;
                    if (this.i == null) {
                        jw0 a = el0.a(bArr3, this.c, this.b);
                        this.i = a;
                        this.d.a(a);
                    }
                    byte b4 = bArr3[0];
                    if (b4 == -2) {
                        i = ((bArr3[4] & 3) << 12) | ((bArr3[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                        b = bArr3[6];
                    } else {
                        if (b4 == -1) {
                            i5 = ((bArr3[7] & 3) << 12) | ((bArr3[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4) | ((bArr3[9] & 60) >> 2);
                        } else if (b4 != 31) {
                            i = ((bArr3[5] & 3) << 12) | ((bArr3[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                            b = bArr3[7];
                        } else {
                            i5 = ((bArr3[8] & 60) >> 2) | ((bArr3[6] & 3) << 12) | ((bArr3[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                        }
                        i2 = i5 + 1;
                        z = true;
                        if (z) {
                            i2 = (i2 * 16) / 14;
                        }
                        this.j = i2;
                        if (b4 != -2) {
                            i3 = (bArr3[5] & 1) << 6;
                            b2 = bArr3[4];
                        } else {
                            if (b4 == -1) {
                                i3 = (bArr3[4] & 7) << 4;
                                b3 = bArr3[7];
                            } else if (b4 != 31) {
                                i3 = (bArr3[4] & 1) << 6;
                                b2 = bArr3[5];
                            } else {
                                i3 = (bArr3[5] & 7) << 4;
                                b3 = bArr3[6];
                            }
                            i4 = b3 & 60;
                            this.h = (int) ((((((i4 >> 2) | i3) + 1) * 32) * 1000000) / this.i.A);
                            this.a.e(0);
                            this.d.a(18, this.a);
                            this.e = 2;
                        }
                        i4 = b2 & 252;
                        this.h = (int) ((((((i4 >> 2) | i3) + 1) * 32) * 1000000) / this.i.A);
                        this.a.e(0);
                        this.d.a(18, this.a);
                        this.e = 2;
                    }
                    i2 = (i | ((b & 240) >> 4)) + 1;
                    z = false;
                    if (z) {
                    }
                    this.j = i2;
                    if (b4 != -2) {
                    }
                    i4 = b2 & 252;
                    this.h = (int) ((((((i4 >> 2) | i3) + 1) * 32) * 1000000) / this.i.A);
                    this.a.e(0);
                    this.d.a(18, this.a);
                    this.e = 2;
                }
            } else if (i7 == 2) {
                int min2 = Math.min(i6, this.j - this.f);
                this.d.a(min2, xb2Var);
                int i10 = this.f + min2;
                this.f = i10;
                int i11 = this.j;
                if (i10 == i11) {
                    long j = this.k;
                    if (j != -9223372036854775807L) {
                        this.d.a(j, 1, i11, 0, null);
                        this.k += this.h;
                    }
                    this.e = 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }
}
