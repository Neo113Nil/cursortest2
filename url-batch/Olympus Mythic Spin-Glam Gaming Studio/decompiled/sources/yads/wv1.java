package yads;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.EOFException;

/* loaded from: classes15.dex */
public final class wv1 implements tp0 {
    public final hl0 e;
    public wp0 f;
    public c83 g;
    public c83 h;
    public int i;
    public ht1 j;
    public long l;
    public long m;
    public int n;
    public qx2 o;
    public boolean p;
    public long r;
    public final xb2 a = new xb2(10);
    public final cw1 b = new cw1();
    public final by0 c = new by0();
    public long k = -9223372036854775807L;
    public final a21 d = new a21();

    static {
        new yp0() { // from class: yads.wv1$$ExternalSyntheticLambda0
            @Override // yads.yp0
            public final tp0[] a() {
                return wv1.a();
            }
        };
        new w11() { // from class: yads.wv1$$ExternalSyntheticLambda1
            @Override // yads.w11
            public final boolean a(int i, int i2, int i3, int i4, int i5) {
                return wv1.a(i, i2, i3, i4, i5);
            }
        };
    }

    public wv1() {
        hl0 hl0Var = new hl0();
        this.e = hl0Var;
        this.h = hl0Var;
    }

    public static /* synthetic */ boolean a(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    public static tp0[] a() {
        return new tp0[]{new wv1()};
    }

    @Override // yads.tp0
    public final void release() {
    }

    public final boolean a(pd0 pd0Var, boolean z) {
        int i;
        int i2;
        int a;
        int i3 = z ? 32768 : 131072;
        pd0Var.f = 0;
        if (pd0Var.d == 0) {
            ht1 a2 = this.d.a(pd0Var, null);
            this.j = a2;
            if (a2 != null) {
                this.c.a(a2);
            }
            i = (int) (pd0Var.d + pd0Var.f);
            if (!z) {
                pd0Var.a(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = i2;
        int i5 = i4;
        while (true) {
            if (!a(pd0Var)) {
                this.a.e(0);
                int a3 = this.a.a();
                if ((i2 == 0 || ((-128000) & a3) == (i2 & (-128000))) && (a = dw1.a(a3)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.b.a(a3);
                        i2 = a3;
                    }
                    pd0Var.a(false, a - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (z) {
                            return false;
                        }
                        throw new cc2("Searched too many bytes.", null, true, 1);
                    }
                    if (z) {
                        pd0Var.f = 0;
                        pd0Var.a(false, i + i6);
                    } else {
                        pd0Var.a(1);
                    }
                    i4 = 0;
                    i5 = i6;
                    i2 = 0;
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            pd0Var.a(i + i5);
        } else {
            pd0Var.f = 0;
        }
        this.i = i2;
        return true;
    }

    @Override // yads.tp0
    public final boolean a(up0 up0Var) {
        return a((pd0) up0Var, true);
    }

    @Override // yads.tp0
    public final void a(wp0 wp0Var) {
        this.f = wp0Var;
        c83 a = wp0Var.a(0, 1);
        this.g = a;
        this.h = a;
        this.f.a();
    }

    @Override // yads.tp0
    public final void a(long j, long j2) {
        this.i = 0;
        this.k = -9223372036854775807L;
        this.l = 0L;
        this.n = 0;
        this.r = j2;
    }

    public final boolean a(pd0 pd0Var) {
        qx2 qx2Var = this.o;
        if (qx2Var != null) {
            long a = qx2Var.a();
            if (a != -1 && pd0Var.d + pd0Var.f > a - 4) {
                return true;
            }
        }
        try {
            return !pd0Var.b(this.a.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (r13 != 1231971951) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x030f  */
    @Override // yads.tp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(up0 up0Var, dg2 dg2Var) {
        int i;
        int i2;
        int i3;
        int a;
        pd0 pd0Var;
        int i4;
        op3 op3Var;
        pd0 pd0Var2;
        qx2 qx2Var;
        int n;
        ht1 ht1Var;
        zt1 zt1Var;
        qx2 czVar;
        int i5;
        long j;
        pd0 pd0Var3;
        int k;
        if (this.g != null) {
            int i6 = sb3.a;
            if (this.i == 0) {
                try {
                    a((pd0) up0Var, false);
                } catch (EOFException unused) {
                }
            }
            if (this.o == null) {
                xb2 xb2Var = new xb2(this.b.c);
                pd0 pd0Var4 = (pd0) up0Var;
                pd0Var4.b(xb2Var.a, 0, this.b.c, false);
                cw1 cw1Var = this.b;
                if ((cw1Var.a & 1) != 0) {
                    if (cw1Var.e != 1) {
                        i2 = 36;
                        if (xb2Var.c >= i2 + 4) {
                            xb2Var.e(i2);
                            i3 = xb2Var.a();
                            if (i3 != 1483304551) {
                            }
                            qx2 qx2Var2 = null;
                            if (i3 != 1483304551 || i3 == 1231971951) {
                                long j2 = pd0Var4.c;
                                long j3 = pd0Var4.d;
                                cw1 cw1Var2 = this.b;
                                int i7 = cw1Var2.g;
                                int i8 = cw1Var2.d;
                                a = xb2Var.a();
                                if ((a & 1) == 1 || (n = xb2Var.n()) == 0) {
                                    pd0Var = pd0Var4;
                                    i4 = i2;
                                    op3Var = null;
                                } else {
                                    pd0Var = pd0Var4;
                                    i4 = i2;
                                    long a2 = sb3.a(n, i7 * 1000000, i8);
                                    if ((a & 6) != 6) {
                                        op3Var = new op3(j3, cw1Var2.c, a2, -1L, null);
                                    } else {
                                        long l = xb2Var.l();
                                        long[] jArr = new long[100];
                                        for (int i9 = 0; i9 < 100; i9++) {
                                            jArr[i9] = xb2Var.k();
                                        }
                                        if (j2 != -1) {
                                            long j4 = j3 + l;
                                            if (j2 != j4) {
                                                gh1.d("XingSeeker", "XING data size mismatch: " + j2 + ", " + j4);
                                            }
                                        }
                                        op3Var = new op3(j3, cw1Var2.c, a2, l, jArr);
                                    }
                                }
                                if (op3Var != null) {
                                    by0 by0Var = this.c;
                                    if (by0Var.a == -1 || by0Var.b == -1) {
                                        pd0Var2 = pd0Var;
                                        pd0Var2.f = 0;
                                        pd0Var2.a(false, i4 + ModuleDescriptor.MODULE_VERSION);
                                        pd0Var2.b(this.a.a, 0, 3, false);
                                        this.a.e(0);
                                        by0 by0Var2 = this.c;
                                        int m = this.a.m();
                                        by0Var2.getClass();
                                        int i10 = m >> 12;
                                        int i11 = m & 4095;
                                        if (i10 > 0 || i11 > 0) {
                                            by0Var2.a = i10;
                                            by0Var2.b = i11;
                                        }
                                        pd0Var2.a(this.b.c);
                                        if (op3Var == null && !op3Var.b() && i3 == 1231971951) {
                                            pd0Var2.b(this.a.a, 0, 4, false);
                                            this.a.e(0);
                                            this.b.a(this.a.a());
                                            qx2Var = new cz(pd0Var2.c, pd0Var2.d, this.b, false);
                                        } else {
                                            qx2Var = op3Var;
                                        }
                                    }
                                }
                                pd0Var2 = pd0Var;
                                pd0Var2.a(this.b.c);
                                if (op3Var == null) {
                                }
                                qx2Var = op3Var;
                            } else if (i3 == 1447187017) {
                                long j5 = pd0Var4.c;
                                long j6 = pd0Var4.d;
                                cw1 cw1Var3 = this.b;
                                xb2Var.e(xb2Var.b + 10);
                                int a3 = xb2Var.a();
                                if (a3 <= 0) {
                                    pd0Var3 = pd0Var4;
                                } else {
                                    int i12 = cw1Var3.d;
                                    pd0Var3 = pd0Var4;
                                    long a4 = sb3.a(a3, (i12 >= 32000 ? 1152 : 576) * 1000000, i12);
                                    int p = xb2Var.p();
                                    int p2 = xb2Var.p();
                                    int p3 = xb2Var.p();
                                    xb2Var.e(xb2Var.b + 2);
                                    long j7 = cw1Var3.c + j6;
                                    long[] jArr2 = new long[p];
                                    long[] jArr3 = new long[p];
                                    long j8 = j6;
                                    int i13 = 0;
                                    while (i13 < p) {
                                        long j9 = j5;
                                        int i14 = p3;
                                        jArr2[i13] = (i13 * a4) / p;
                                        jArr3[i13] = Math.max(j8, j7);
                                        if (i14 == 1) {
                                            k = xb2Var.k();
                                        } else if (i14 == 2) {
                                            k = xb2Var.p();
                                        } else if (i14 == 3) {
                                            k = xb2Var.m();
                                        } else if (i14 == 4) {
                                            k = xb2Var.n();
                                        }
                                        j8 += k * p2;
                                        i13++;
                                        j5 = j9;
                                        p3 = i14;
                                    }
                                    long j10 = j5;
                                    if (j10 != -1 && j10 != j8) {
                                        gh1.d("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + j8);
                                    }
                                    qx2Var = new qd3(jArr2, jArr3, a4, j8);
                                    pd0 pd0Var5 = pd0Var3;
                                    pd0Var5.a(this.b.c);
                                    pd0Var2 = pd0Var5;
                                }
                                qx2Var = null;
                                pd0 pd0Var52 = pd0Var3;
                                pd0Var52.a(this.b.c);
                                pd0Var2 = pd0Var52;
                            } else {
                                pd0Var4.f = 0;
                                pd0Var2 = pd0Var4;
                                qx2Var = null;
                            }
                            ht1Var = this.j;
                            long j11 = pd0Var2.d;
                            if (ht1Var != null) {
                                int length = ht1Var.b.length;
                                for (int i15 = 0; i15 < length; i15++) {
                                    gt1[] gt1VarArr = ht1Var.b;
                                    gt1 gt1Var = gt1VarArr[i15];
                                    if (gt1Var instanceof yt1) {
                                        yt1 yt1Var = (yt1) gt1Var;
                                        int length2 = gt1VarArr.length;
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 >= length2) {
                                                i5 = 1;
                                                j = -9223372036854775807L;
                                                break;
                                            }
                                            gt1 gt1Var2 = ht1Var.b[i16];
                                            if (gt1Var2 instanceof l63) {
                                                l63 l63Var = (l63) gt1Var2;
                                                if (l63Var.b.equals("TLEN")) {
                                                    j = sb3.a(Long.parseLong(l63Var.d));
                                                    i5 = 1;
                                                    break;
                                                }
                                            }
                                            i16++;
                                        }
                                        int length3 = yt1Var.f.length;
                                        int i17 = length3 + 1;
                                        long[] jArr4 = new long[i17];
                                        long[] jArr5 = new long[i17];
                                        jArr4[0] = j11;
                                        jArr5[0] = 0;
                                        int i18 = i5;
                                        long j12 = 0;
                                        while (i18 <= length3) {
                                            int i19 = i18 - 1;
                                            j11 += yt1Var.d + yt1Var.f[i19];
                                            j12 += yt1Var.e + yt1Var.g[i19];
                                            jArr4[i18] = j11;
                                            jArr5[i18] = j12;
                                            i18++;
                                            i5 = 1;
                                        }
                                        zt1Var = new zt1(j, jArr4, jArr5);
                                        if (this.p) {
                                            czVar = new px2();
                                        } else {
                                            if (zt1Var != null) {
                                                qx2Var2 = zt1Var;
                                            } else if (qx2Var != null) {
                                                qx2Var2 = qx2Var;
                                            }
                                            if (qx2Var2 != null) {
                                                qx2Var2.b();
                                                czVar = qx2Var2;
                                            } else {
                                                pd0Var2.b(this.a.a, 0, 4, false);
                                                this.a.e(0);
                                                this.b.a(this.a.a());
                                                czVar = new cz(pd0Var2.c, pd0Var2.d, this.b, false);
                                            }
                                        }
                                        this.o = czVar;
                                        this.f.a(czVar);
                                        c83 c83Var = this.h;
                                        iw0 iw0Var = new iw0();
                                        cw1 cw1Var4 = this.b;
                                        iw0Var.k = cw1Var4.b;
                                        iw0Var.l = 4096;
                                        iw0Var.x = cw1Var4.e;
                                        iw0Var.y = cw1Var4.d;
                                        by0 by0Var3 = this.c;
                                        iw0Var.A = by0Var3.a;
                                        iw0Var.B = by0Var3.b;
                                        iw0Var.i = this.j;
                                        c83Var.a(new jw0(iw0Var));
                                        this.m = pd0Var2.d;
                                    }
                                }
                            }
                            zt1Var = null;
                            if (this.p) {
                            }
                            this.o = czVar;
                            this.f.a(czVar);
                            c83 c83Var2 = this.h;
                            iw0 iw0Var2 = new iw0();
                            cw1 cw1Var42 = this.b;
                            iw0Var2.k = cw1Var42.b;
                            iw0Var2.l = 4096;
                            iw0Var2.x = cw1Var42.e;
                            iw0Var2.y = cw1Var42.d;
                            by0 by0Var32 = this.c;
                            iw0Var2.A = by0Var32.a;
                            iw0Var2.B = by0Var32.b;
                            iw0Var2.i = this.j;
                            c83Var2.a(new jw0(iw0Var2));
                            this.m = pd0Var2.d;
                        }
                        if (xb2Var.c >= 40) {
                            xb2Var.e(36);
                            if (xb2Var.a() == 1447187017) {
                                i3 = 1447187017;
                                qx2 qx2Var22 = null;
                                if (i3 != 1483304551) {
                                }
                                long j22 = pd0Var4.c;
                                long j32 = pd0Var4.d;
                                cw1 cw1Var22 = this.b;
                                int i72 = cw1Var22.g;
                                int i82 = cw1Var22.d;
                                a = xb2Var.a();
                                if ((a & 1) == 1) {
                                }
                                pd0Var = pd0Var4;
                                i4 = i2;
                                op3Var = null;
                                if (op3Var != null) {
                                }
                                pd0Var2 = pd0Var;
                                pd0Var2.a(this.b.c);
                                if (op3Var == null) {
                                }
                                qx2Var = op3Var;
                                ht1Var = this.j;
                                long j112 = pd0Var2.d;
                                if (ht1Var != null) {
                                }
                                zt1Var = null;
                                if (this.p) {
                                }
                                this.o = czVar;
                                this.f.a(czVar);
                                c83 c83Var22 = this.h;
                                iw0 iw0Var22 = new iw0();
                                cw1 cw1Var422 = this.b;
                                iw0Var22.k = cw1Var422.b;
                                iw0Var22.l = 4096;
                                iw0Var22.x = cw1Var422.e;
                                iw0Var22.y = cw1Var422.d;
                                by0 by0Var322 = this.c;
                                iw0Var22.A = by0Var322.a;
                                iw0Var22.B = by0Var322.b;
                                iw0Var22.i = this.j;
                                c83Var22.a(new jw0(iw0Var22));
                                this.m = pd0Var2.d;
                            }
                        }
                        i3 = 0;
                        qx2 qx2Var222 = null;
                        if (i3 != 1483304551) {
                        }
                        long j222 = pd0Var4.c;
                        long j322 = pd0Var4.d;
                        cw1 cw1Var222 = this.b;
                        int i722 = cw1Var222.g;
                        int i822 = cw1Var222.d;
                        a = xb2Var.a();
                        if ((a & 1) == 1) {
                        }
                        pd0Var = pd0Var4;
                        i4 = i2;
                        op3Var = null;
                        if (op3Var != null) {
                        }
                        pd0Var2 = pd0Var;
                        pd0Var2.a(this.b.c);
                        if (op3Var == null) {
                        }
                        qx2Var = op3Var;
                        ht1Var = this.j;
                        long j1122 = pd0Var2.d;
                        if (ht1Var != null) {
                        }
                        zt1Var = null;
                        if (this.p) {
                        }
                        this.o = czVar;
                        this.f.a(czVar);
                        c83 c83Var222 = this.h;
                        iw0 iw0Var222 = new iw0();
                        cw1 cw1Var4222 = this.b;
                        iw0Var222.k = cw1Var4222.b;
                        iw0Var222.l = 4096;
                        iw0Var222.x = cw1Var4222.e;
                        iw0Var222.y = cw1Var4222.d;
                        by0 by0Var3222 = this.c;
                        iw0Var222.A = by0Var3222.a;
                        iw0Var222.B = by0Var3222.b;
                        iw0Var222.i = this.j;
                        c83Var222.a(new jw0(iw0Var222));
                        this.m = pd0Var2.d;
                    }
                    i2 = 21;
                    if (xb2Var.c >= i2 + 4) {
                    }
                    if (xb2Var.c >= 40) {
                    }
                    i3 = 0;
                    qx2 qx2Var2222 = null;
                    if (i3 != 1483304551) {
                    }
                    long j2222 = pd0Var4.c;
                    long j3222 = pd0Var4.d;
                    cw1 cw1Var2222 = this.b;
                    int i7222 = cw1Var2222.g;
                    int i8222 = cw1Var2222.d;
                    a = xb2Var.a();
                    if ((a & 1) == 1) {
                    }
                    pd0Var = pd0Var4;
                    i4 = i2;
                    op3Var = null;
                    if (op3Var != null) {
                    }
                    pd0Var2 = pd0Var;
                    pd0Var2.a(this.b.c);
                    if (op3Var == null) {
                    }
                    qx2Var = op3Var;
                    ht1Var = this.j;
                    long j11222 = pd0Var2.d;
                    if (ht1Var != null) {
                    }
                    zt1Var = null;
                    if (this.p) {
                    }
                    this.o = czVar;
                    this.f.a(czVar);
                    c83 c83Var2222 = this.h;
                    iw0 iw0Var2222 = new iw0();
                    cw1 cw1Var42222 = this.b;
                    iw0Var2222.k = cw1Var42222.b;
                    iw0Var2222.l = 4096;
                    iw0Var2222.x = cw1Var42222.e;
                    iw0Var2222.y = cw1Var42222.d;
                    by0 by0Var32222 = this.c;
                    iw0Var2222.A = by0Var32222.a;
                    iw0Var2222.B = by0Var32222.b;
                    iw0Var2222.i = this.j;
                    c83Var2222.a(new jw0(iw0Var2222));
                    this.m = pd0Var2.d;
                } else {
                    if (cw1Var.e == 1) {
                        i2 = 13;
                        if (xb2Var.c >= i2 + 4) {
                        }
                        if (xb2Var.c >= 40) {
                        }
                        i3 = 0;
                        qx2 qx2Var22222 = null;
                        if (i3 != 1483304551) {
                        }
                        long j22222 = pd0Var4.c;
                        long j32222 = pd0Var4.d;
                        cw1 cw1Var22222 = this.b;
                        int i72222 = cw1Var22222.g;
                        int i82222 = cw1Var22222.d;
                        a = xb2Var.a();
                        if ((a & 1) == 1) {
                        }
                        pd0Var = pd0Var4;
                        i4 = i2;
                        op3Var = null;
                        if (op3Var != null) {
                        }
                        pd0Var2 = pd0Var;
                        pd0Var2.a(this.b.c);
                        if (op3Var == null) {
                        }
                        qx2Var = op3Var;
                        ht1Var = this.j;
                        long j112222 = pd0Var2.d;
                        if (ht1Var != null) {
                        }
                        zt1Var = null;
                        if (this.p) {
                        }
                        this.o = czVar;
                        this.f.a(czVar);
                        c83 c83Var22222 = this.h;
                        iw0 iw0Var22222 = new iw0();
                        cw1 cw1Var422222 = this.b;
                        iw0Var22222.k = cw1Var422222.b;
                        iw0Var22222.l = 4096;
                        iw0Var22222.x = cw1Var422222.e;
                        iw0Var22222.y = cw1Var422222.d;
                        by0 by0Var322222 = this.c;
                        iw0Var22222.A = by0Var322222.a;
                        iw0Var22222.B = by0Var322222.b;
                        iw0Var22222.i = this.j;
                        c83Var22222.a(new jw0(iw0Var22222));
                        this.m = pd0Var2.d;
                    }
                    i2 = 21;
                    if (xb2Var.c >= i2 + 4) {
                    }
                    if (xb2Var.c >= 40) {
                    }
                    i3 = 0;
                    qx2 qx2Var222222 = null;
                    if (i3 != 1483304551) {
                    }
                    long j222222 = pd0Var4.c;
                    long j322222 = pd0Var4.d;
                    cw1 cw1Var222222 = this.b;
                    int i722222 = cw1Var222222.g;
                    int i822222 = cw1Var222222.d;
                    a = xb2Var.a();
                    if ((a & 1) == 1) {
                    }
                    pd0Var = pd0Var4;
                    i4 = i2;
                    op3Var = null;
                    if (op3Var != null) {
                    }
                    pd0Var2 = pd0Var;
                    pd0Var2.a(this.b.c);
                    if (op3Var == null) {
                    }
                    qx2Var = op3Var;
                    ht1Var = this.j;
                    long j1122222 = pd0Var2.d;
                    if (ht1Var != null) {
                    }
                    zt1Var = null;
                    if (this.p) {
                    }
                    this.o = czVar;
                    this.f.a(czVar);
                    c83 c83Var222222 = this.h;
                    iw0 iw0Var222222 = new iw0();
                    cw1 cw1Var4222222 = this.b;
                    iw0Var222222.k = cw1Var4222222.b;
                    iw0Var222222.l = 4096;
                    iw0Var222222.x = cw1Var4222222.e;
                    iw0Var222222.y = cw1Var4222222.d;
                    by0 by0Var3222222 = this.c;
                    iw0Var222222.A = by0Var3222222.a;
                    iw0Var222222.B = by0Var3222222.b;
                    iw0Var222222.i = this.j;
                    c83Var222222.a(new jw0(iw0Var222222));
                    this.m = pd0Var2.d;
                }
                return i;
            }
            long j13 = this.m;
            if (j13 != 0) {
                pd0 pd0Var6 = (pd0) up0Var;
                long j14 = pd0Var6.d;
                if (j14 < j13) {
                    pd0Var6.a((int) (j13 - j14));
                }
            }
            if (this.n == 0) {
                pd0 pd0Var7 = (pd0) up0Var;
                pd0Var7.f = 0;
                if (!a(pd0Var7)) {
                    this.a.e(0);
                    int a5 = this.a.a();
                    if (((-128000) & a5) == (this.i & (-128000)) && dw1.a(a5) != -1) {
                        this.b.a(a5);
                        if (this.k == -9223372036854775807L) {
                            this.k = this.o.a(pd0Var7.d);
                        }
                        this.n = this.b.c;
                    } else {
                        pd0Var7.a(1);
                        this.i = 0;
                        return 0;
                    }
                }
                i = -1;
                return i;
            }
            int a6 = this.h.a(up0Var, this.n, true);
            i = -1;
            if (a6 != -1) {
                int i20 = this.n - a6;
                this.n = i20;
                if (i20 <= 0) {
                    c83 c83Var3 = this.h;
                    long j15 = this.l;
                    c83Var3.a(this.k + ((j15 * 1000000) / r6.d), 1, this.b.c, 0, null);
                    this.l += this.b.g;
                    this.n = 0;
                    return 0;
                }
                return 0;
            }
            return i;
        }
        throw new IllegalStateException();
    }
}
