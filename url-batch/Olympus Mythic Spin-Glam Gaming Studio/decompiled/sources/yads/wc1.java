package yads;

import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class wc1 implements tp0 {
    public wp0 b;
    public int c;
    public int d;
    public int e;
    public vv1 g;
    public pd0 h;
    public x33 i;
    public yv1 j;
    public final xb2 a = new xb2(6);
    public long f = -1;

    @Override // yads.tp0
    public final boolean a(up0 up0Var) {
        pd0 pd0Var = (pd0) up0Var;
        this.a.c(2);
        pd0Var.b(this.a.a, 0, 2, false);
        if (this.a.p() != 65496) {
            return false;
        }
        this.a.c(2);
        pd0Var.b(this.a.a, 0, 2, false);
        int p = this.a.p();
        this.d = p;
        if (p == 65504) {
            this.a.c(2);
            pd0Var.b(this.a.a, 0, 2, false);
            pd0Var.a(false, this.a.p() - 2);
            this.a.c(2);
            pd0Var.b(this.a.a, 0, 2, false);
            this.d = this.a.p();
        }
        if (this.d != 65505) {
            return false;
        }
        pd0Var.a(false, 2);
        this.a.c(6);
        pd0Var.b(this.a.a, 0, 6, false);
        return this.a.l() == 1165519206 && this.a.p() == 0;
    }

    @Override // yads.tp0
    public final void release() {
    }

    @Override // yads.tp0
    public final void a(wp0 wp0Var) {
        this.b = wp0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0195  */
    @Override // yads.tp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(up0 up0Var, dg2 dg2Var) {
        String a;
        String a2;
        tv1 tv1Var;
        int i;
        vv1 vv1Var;
        long j;
        int i2 = this.c;
        if (i2 == 0) {
            this.a.c(2);
            ((pd0) up0Var).a(this.a.a, 0, 2, false);
            int p = this.a.p();
            this.d = p;
            if (p == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                } else {
                    a();
                }
            } else if ((p < 65488 || p > 65497) && p != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i2 == 1) {
            this.a.c(2);
            ((pd0) up0Var).a(this.a.a, 0, 2, false);
            this.e = this.a.p() - 2;
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.i == null || up0Var != this.h) {
                    pd0 pd0Var = (pd0) up0Var;
                    this.h = pd0Var;
                    this.i = new x33(pd0Var, this.f);
                }
                yv1 yv1Var = this.j;
                yv1Var.getClass();
                int a3 = yv1Var.a(this.i, dg2Var);
                if (a3 == 1) {
                    dg2Var.a += this.f;
                }
                return a3;
            }
            pd0 pd0Var2 = (pd0) up0Var;
            long j2 = pd0Var2.d;
            long j3 = this.f;
            if (j2 != j3) {
                dg2Var.a = j3;
                return 1;
            }
            if (!pd0Var2.b(this.a.a, 0, 1, true)) {
                a();
            } else {
                pd0Var2.f = 0;
                if (this.j == null) {
                    this.j = new yv1();
                }
                x33 x33Var = new x33(pd0Var2, this.f);
                this.i = x33Var;
                this.j.getClass();
                if (e23.a(x33Var, false, false)) {
                    yv1 yv1Var2 = this.j;
                    long j4 = this.f;
                    wp0 wp0Var = this.b;
                    wp0Var.getClass();
                    yv1Var2.q = new z33(j4, wp0Var);
                    vv1 vv1Var2 = this.g;
                    vv1Var2.getClass();
                    gt1[] gt1VarArr = {vv1Var2};
                    wp0 wp0Var2 = this.b;
                    wp0Var2.getClass();
                    c83 a4 = wp0Var2.a(1024, 4);
                    iw0 iw0Var = new iw0();
                    iw0Var.j = "image/jpeg";
                    iw0Var.i = new ht1(gt1VarArr);
                    a4.a(new jw0(iw0Var));
                    this.c = 5;
                } else {
                    a();
                }
            }
            return 0;
        }
        if (this.d == 65505) {
            int i3 = this.e;
            byte[] bArr = new byte[i3];
            pd0 pd0Var3 = (pd0) up0Var;
            pd0Var3.a(bArr, 0, i3, false);
            if (this.g == null) {
                int i4 = 0;
                if (i3 == 0) {
                    a = null;
                } else {
                    while (i4 < i3 && bArr[i4] != 0) {
                        i4++;
                    }
                    a = sb3.a(bArr, 0, i4);
                    if (i4 < i3) {
                        i4++;
                    }
                }
                if ("http://ns.adobe.com/xap/1.0/".equals(a)) {
                    if (i3 - i4 == 0) {
                        a2 = null;
                    } else {
                        int i5 = i4;
                        while (i5 < i3 && bArr[i5] != 0) {
                            i5++;
                        }
                        a2 = sb3.a(bArr, i4, i5 - i4);
                    }
                    if (a2 != null) {
                        long j5 = pd0Var3.c;
                        if (j5 != -1) {
                            try {
                                tv1Var = tp3.a(a2);
                            } catch (NumberFormatException | XmlPullParserException | cc2 unused) {
                                gh1.d("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                                tv1Var = null;
                            }
                            if (tv1Var != null && (i = tv1Var.b.e) >= 2) {
                                boolean z = false;
                                long j6 = -1;
                                long j7 = -1;
                                long j8 = -1;
                                long j9 = -1;
                                for (int i6 = i - 1; i6 >= 0; i6--) {
                                    sv1 sv1Var = (sv1) tv1Var.b.get(i6);
                                    z |= "video/mp4".equals(sv1Var.a);
                                    if (i6 == 0) {
                                        j5 -= sv1Var.c;
                                        j = 0;
                                    } else {
                                        j = j5 - sv1Var.b;
                                    }
                                    long j10 = j;
                                    long j11 = j5;
                                    j5 = j10;
                                    if (z && j5 != j11) {
                                        j9 = j11 - j5;
                                        z = false;
                                        j8 = j5;
                                    }
                                    if (i6 == 0) {
                                        j7 = j11;
                                        j6 = j5;
                                    }
                                }
                                if (j8 != -1 && j9 != -1 && j6 != -1 && j7 != -1) {
                                    vv1Var = new vv1(j6, j7, tv1Var.a, j8, j9);
                                    this.g = vv1Var;
                                    if (vv1Var != null) {
                                        this.f = vv1Var.e;
                                    }
                                }
                            }
                        }
                        vv1Var = null;
                        this.g = vv1Var;
                        if (vv1Var != null) {
                        }
                    }
                }
            }
        } else {
            ((pd0) up0Var).a(this.e);
        }
        this.c = 0;
        return 0;
    }

    @Override // yads.tp0
    public final void a(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            yv1 yv1Var = this.j;
            yv1Var.getClass();
            yv1Var.a(j, j2);
        }
    }

    public final void a() {
        wp0 wp0Var = this.b;
        wp0Var.getClass();
        c83 a = wp0Var.a(1024, 4);
        iw0 iw0Var = new iw0();
        iw0Var.j = "image/jpeg";
        iw0Var.i = new ht1(new gt1[0]);
        a.a(new jw0(iw0Var));
        wp0 wp0Var2 = this.b;
        wp0Var2.getClass();
        wp0Var2.a();
        this.b.a(new lx2(-9223372036854775807L, 0L));
        this.c = 6;
    }
}
