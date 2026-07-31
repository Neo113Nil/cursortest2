package yads;

/* loaded from: classes5.dex */
public final class d0 implements zl0 {
    public final wb2 a;
    public final xb2 b;
    public final String c;
    public String d;
    public c83 e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public jw0 j;
    public int k;
    public long l;

    public d0(String str) {
        wb2 wb2Var = new wb2(new byte[128]);
        this.a = wb2Var;
        this.b = new xb2(wb2Var.a);
        this.f = 0;
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // yads.zl0
    public final void a() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = -9223372036854775807L;
    }

    @Override // yads.zl0
    public final void b() {
    }

    @Override // yads.zl0
    public final void a(wp0 wp0Var, z93 z93Var) {
        z93Var.a();
        z93Var.b();
        this.d = z93Var.e;
        z93Var.b();
        this.e = wp0Var.a(z93Var.d, 1);
    }

    @Override // yads.zl0
    public final void a(int i, long j) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ff  */
    @Override // yads.zl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xb2 xb2Var) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        if (this.e == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i13 = xb2Var.c - xb2Var.b;
            if (i13 <= 0) {
                return;
            }
            int i14 = this.f;
            if (i14 == 0) {
                while (true) {
                    if (xb2Var.c - xb2Var.b <= 0) {
                        break;
                    }
                    if (!this.h) {
                        this.h = xb2Var.k() == 11;
                    } else {
                        int k = xb2Var.k();
                        if (k == 119) {
                            this.h = false;
                            this.f = 1;
                            byte[] bArr = this.b.a;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.g = 2;
                            break;
                        }
                        this.h = k == 11;
                    }
                }
            } else if (i14 == 1) {
                byte[] bArr2 = this.b.a;
                int min = Math.min(i13, 128 - this.g);
                xb2Var.a(bArr2, this.g, min);
                int i15 = this.g + min;
                this.g = i15;
                if (i15 == 128) {
                    this.a.b(0);
                    wb2 wb2Var = this.a;
                    int d = wb2Var.d();
                    wb2Var.c(40);
                    Object[] objArr = wb2Var.a(5) > 10;
                    wb2Var.b(d);
                    if (objArr != false) {
                        wb2Var.c(16);
                        int a = wb2Var.a(2);
                        if (a == 0) {
                            r3 = 0;
                        } else if (a == 1) {
                            r3 = 1;
                        } else if (a == 2) {
                            r3 = 2;
                        }
                        wb2Var.c(3);
                        i4 = (wb2Var.a(11) + 1) * 2;
                        int a2 = wb2Var.a(2);
                        if (a2 == 3) {
                            i7 = e0.c[wb2Var.a(2)];
                            i5 = 3;
                            i6 = 6;
                        } else {
                            int a3 = wb2Var.a(2);
                            i5 = a3;
                            i6 = e0.a[a3];
                            i7 = e0.b[a2];
                        }
                        i3 = i6 * 256;
                        int a4 = wb2Var.a(3);
                        boolean e = wb2Var.e();
                        i2 = e0.d[a4] + (e ? 1 : 0);
                        wb2Var.c(10);
                        if (wb2Var.e()) {
                            wb2Var.c(8);
                        }
                        if (a4 == 0) {
                            wb2Var.c(5);
                            if (wb2Var.e()) {
                                wb2Var.c(8);
                            }
                        }
                        if (r3 == 1 && wb2Var.e()) {
                            wb2Var.c(16);
                        }
                        if (wb2Var.e()) {
                            if (a4 > 2) {
                                wb2Var.c(2);
                            }
                            if ((a4 & 1) == 0 || a4 <= 2) {
                                i10 = 6;
                            } else {
                                i10 = 6;
                                wb2Var.c(6);
                            }
                            if ((a4 & 4) != 0) {
                                wb2Var.c(i10);
                            }
                            if (e && wb2Var.e()) {
                                wb2Var.c(5);
                            }
                            if (r3 == 0) {
                                if (wb2Var.e()) {
                                    i11 = 6;
                                    wb2Var.c(6);
                                } else {
                                    i11 = 6;
                                }
                                if (a4 == 0 && wb2Var.e()) {
                                    wb2Var.c(i11);
                                }
                                if (wb2Var.e()) {
                                    wb2Var.c(i11);
                                }
                                int i16 = 2;
                                int a5 = wb2Var.a(2);
                                if (a5 == 1) {
                                    wb2Var.c(5);
                                } else {
                                    if (a5 == 2) {
                                        wb2Var.c(12);
                                    } else if (a5 == 3) {
                                        int a6 = wb2Var.a(5);
                                        if (wb2Var.e()) {
                                            wb2Var.c(5);
                                            if (wb2Var.e()) {
                                                wb2Var.c(4);
                                            }
                                            if (wb2Var.e()) {
                                                wb2Var.c(4);
                                            }
                                            if (wb2Var.e()) {
                                                wb2Var.c(4);
                                            }
                                            if (wb2Var.e()) {
                                                wb2Var.c(4);
                                            }
                                            if (wb2Var.e()) {
                                                wb2Var.c(4);
                                            }
                                            if (wb2Var.e()) {
                                                wb2Var.c(4);
                                            }
                                            if (wb2Var.e()) {
                                                wb2Var.c(4);
                                            }
                                            if (wb2Var.e()) {
                                                if (wb2Var.e()) {
                                                    wb2Var.c(4);
                                                }
                                                if (wb2Var.e()) {
                                                    wb2Var.c(4);
                                                }
                                            }
                                        }
                                        if (wb2Var.e()) {
                                            wb2Var.c(5);
                                            if (wb2Var.e()) {
                                                wb2Var.c(7);
                                                if (wb2Var.e()) {
                                                    i12 = 8;
                                                    wb2Var.c(8);
                                                    wb2Var.c((a6 + 2) * i12);
                                                    if (wb2Var.c != 0) {
                                                        wb2Var.c = 0;
                                                        wb2Var.b++;
                                                        wb2Var.a();
                                                    }
                                                }
                                            }
                                        }
                                        i12 = 8;
                                        wb2Var.c((a6 + 2) * i12);
                                        if (wb2Var.c != 0) {
                                        }
                                    }
                                    i16 = 2;
                                }
                                if (a4 < i16) {
                                    if (wb2Var.e()) {
                                        wb2Var.c(14);
                                    }
                                    if (a4 == 0 && wb2Var.e()) {
                                        wb2Var.c(14);
                                    }
                                }
                                if (wb2Var.e()) {
                                    if (i5 == 0) {
                                        wb2Var.c(5);
                                    } else {
                                        for (int i17 = 0; i17 < i6; i17++) {
                                            if (wb2Var.e()) {
                                                wb2Var.c(5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (wb2Var.e()) {
                            wb2Var.c(5);
                            if (a4 == 2) {
                                wb2Var.c(4);
                            }
                            if (a4 >= 6) {
                                wb2Var.c(2);
                            }
                            if (wb2Var.e()) {
                                i9 = 8;
                                wb2Var.c(8);
                            } else {
                                i9 = 8;
                            }
                            if (a4 == 0 && wb2Var.e()) {
                                wb2Var.c(i9);
                            }
                            if (a2 < 3) {
                                wb2Var.f();
                            }
                        }
                        if (r3 == 0 && i5 != 3) {
                            wb2Var.f();
                        }
                        if (r3 == 2 && (i5 == 3 || wb2Var.e())) {
                            i8 = 6;
                            wb2Var.c(6);
                        } else {
                            i8 = 6;
                        }
                        if (wb2Var.e() && wb2Var.a(i8) == 1 && wb2Var.a(8) == 1) {
                            str = "audio/eac3-joc";
                        } else {
                            str = "audio/eac3";
                        }
                        r3 = i7;
                    } else {
                        wb2Var.c(32);
                        int a7 = wb2Var.a(2);
                        String str2 = a7 == 3 ? null : "audio/ac3";
                        int a8 = e0.a(a7, wb2Var.a(6));
                        wb2Var.c(8);
                        int a9 = wb2Var.a(3);
                        if ((a9 & 1) == 0 || a9 == 1) {
                            i = 2;
                        } else {
                            i = 2;
                            wb2Var.c(2);
                        }
                        if ((a9 & 4) != 0) {
                            wb2Var.c(i);
                        }
                        if (a9 == i) {
                            wb2Var.c(i);
                        }
                        r3 = a7 < 3 ? e0.b[a7] : -1;
                        i2 = e0.d[a9] + (wb2Var.e() ? 1 : 0);
                        i3 = 1536;
                        str = str2;
                        i4 = a8;
                    }
                    int i18 = i2;
                    jw0 jw0Var = this.j;
                    if (jw0Var == null || i18 != jw0Var.z || r3 != jw0Var.A || !sb3.a(str, jw0Var.m)) {
                        iw0 iw0Var = new iw0();
                        iw0Var.a = this.d;
                        iw0Var.k = str;
                        iw0Var.x = i18;
                        iw0Var.y = r3;
                        iw0Var.c = this.c;
                        jw0 jw0Var2 = new jw0(iw0Var);
                        this.j = jw0Var2;
                        this.e.a(jw0Var2);
                    }
                    this.k = i4;
                    this.i = (i3 * 1000000) / this.j.A;
                    this.b.e(0);
                    this.e.a(128, this.b);
                    this.f = 2;
                }
            } else if (i14 == 2) {
                int min2 = Math.min(i13, this.k - this.g);
                this.e.a(min2, xb2Var);
                int i19 = this.g + min2;
                this.g = i19;
                int i20 = this.k;
                if (i19 == i20) {
                    long j = this.l;
                    if (j != -9223372036854775807L) {
                        this.e.a(j, 1, i20, 0, null);
                        this.l += this.i;
                    }
                    this.f = 0;
                }
            }
        }
    }
}
