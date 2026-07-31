package yads;

/* loaded from: classes5.dex */
public final class vc2 implements aa3 {
    public final zl0 a;
    public final wb2 b = new wb2(new byte[10]);
    public int c = 0;
    public int d;
    public m73 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public vc2(zl0 zl0Var) {
        this.a = zl0Var;
    }

    @Override // yads.aa3
    public final void a(m73 m73Var, wp0 wp0Var, z93 z93Var) {
        this.e = m73Var;
        this.a.a(wp0Var, z93Var);
    }

    @Override // yads.aa3
    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    @Override // yads.aa3
    public final void a(int i, xb2 xb2Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.e == null) {
            throw new IllegalStateException();
        }
        int i7 = 2;
        int i8 = 3;
        int i9 = -1;
        int i10 = 0;
        if ((i & 1) != 0) {
            int i11 = this.c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    gh1.d("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        gh1.d("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    this.a.b();
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i12 = i;
        while (true) {
            int i13 = xb2Var.c;
            int i14 = xb2Var.b;
            int i15 = i13 - i14;
            if (i15 <= 0) {
                return;
            }
            int i16 = this.c;
            if (i16 == 0) {
                i2 = i7;
                i3 = i8;
                i4 = i9;
                i5 = i10;
                xb2Var.e(i15 + i14);
            } else if (i16 == 1) {
                i3 = i8;
                int i17 = i10;
                if (a(xb2Var, this.b.a, 9)) {
                    this.b.b(i17);
                    int a = this.b.a(24);
                    if (a != 1) {
                        mf1.a(a, "Unexpected start code prefix: ", "PesReader");
                        i4 = -1;
                        this.j = -1;
                        i6 = 0;
                        i2 = 2;
                    } else {
                        this.b.c(8);
                        int a2 = this.b.a(16);
                        this.b.c(5);
                        this.k = this.b.e();
                        i2 = 2;
                        this.b.c(2);
                        this.f = this.b.e();
                        this.g = this.b.e();
                        this.b.c(6);
                        int a3 = this.b.a(8);
                        this.i = a3;
                        if (a2 == 0) {
                            this.j = -1;
                            i4 = -1;
                        } else {
                            int i18 = (a2 - 3) - a3;
                            this.j = i18;
                            if (i18 < 0) {
                                gh1.d("PesReader", "Found negative packet payload size: " + this.j);
                                i4 = -1;
                                this.j = -1;
                            } else {
                                i4 = -1;
                            }
                        }
                        i6 = 2;
                    }
                    this.c = i6;
                    i5 = 0;
                    this.d = 0;
                } else {
                    i5 = i17;
                    i4 = -1;
                    i2 = 2;
                }
            } else if (i16 == i7) {
                if (a(xb2Var, this.b.a, Math.min(10, this.i)) && a(xb2Var, (byte[]) null, this.i)) {
                    this.b.b(i10);
                    this.l = -9223372036854775807L;
                    if (this.f) {
                        this.b.c(4);
                        this.b.c(1);
                        this.b.c(1);
                        long a4 = (this.b.a(15) << 15) | (this.b.a(i8) << 30) | this.b.a(15);
                        this.b.c(1);
                        if (!this.h && this.g) {
                            this.b.c(4);
                            this.b.c(1);
                            this.b.c(1);
                            this.b.c(1);
                            this.e.b((this.b.a(15) << 15) | (this.b.a(i8) << 30) | this.b.a(15));
                            this.h = true;
                        }
                        this.l = this.e.b(a4);
                    }
                    i12 |= this.k ? 4 : 0;
                    this.a.a(i12, this.l);
                    this.c = 3;
                    this.d = 0;
                    i10 = 0;
                    i9 = -1;
                    i8 = 3;
                    i7 = 2;
                } else {
                    i3 = i8;
                    i4 = i9;
                    i5 = i10;
                    i2 = 2;
                }
            } else {
                if (i16 != i8) {
                    throw new IllegalStateException();
                }
                int i19 = this.j;
                int i20 = i19 == i9 ? i10 : i15 - i19;
                if (i20 > 0) {
                    i15 -= i20;
                    xb2Var.d(i14 + i15);
                }
                this.a.a(xb2Var);
                int i21 = this.j;
                if (i21 != i9) {
                    int i22 = i21 - i15;
                    this.j = i22;
                    if (i22 == 0) {
                        this.a.b();
                        this.c = 1;
                        this.d = i10;
                    }
                }
                i2 = i7;
                i3 = i8;
                i4 = i9;
                i5 = i10;
            }
            i10 = i5;
            i9 = i4;
            i8 = i3;
            i7 = i2;
        }
    }

    public final boolean a(xb2 xb2Var, byte[] bArr, int i) {
        int min = Math.min(xb2Var.c - xb2Var.b, i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            xb2Var.e(xb2Var.b + min);
        } else {
            xb2Var.a(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }
}
