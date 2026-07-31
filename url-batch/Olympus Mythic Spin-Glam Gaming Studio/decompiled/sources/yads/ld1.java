package yads;

import java.util.Collections;

/* loaded from: classes3.dex */
public final class ld1 implements zl0 {
    public final String a;
    public final xb2 b;
    public final wb2 c;
    public c83 d;
    public String e;
    public jw0 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    public String u;

    public ld1(String str) {
        this.a = str;
        xb2 xb2Var = new xb2(1024);
        this.b = xb2Var;
        this.c = new wb2(xb2Var.a);
        this.k = -9223372036854775807L;
    }

    @Override // yads.zl0
    public final void a() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }

    @Override // yads.zl0
    public final void b() {
    }

    @Override // yads.zl0
    public final void a(wp0 wp0Var, z93 z93Var) {
        z93Var.a();
        z93Var.b();
        this.d = wp0Var.a(z93Var.d, 1);
        z93Var.b();
        this.e = z93Var.e;
    }

    @Override // yads.zl0
    public final void a(int i, long j) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0180, code lost:
    
        throw new yads.cc2(null, null, true, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x018f, code lost:
    
        if (r17.l == false) goto L89;
     */
    @Override // yads.zl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xb2 xb2Var) {
        int i;
        boolean e;
        if (this.d == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i2 = xb2Var.c - xb2Var.b;
            if (i2 <= 0) {
                return;
            }
            int i3 = this.g;
            if (i3 != 0) {
                if (i3 == 1) {
                    int k = xb2Var.k();
                    if ((k & 224) == 224) {
                        this.j = k;
                        this.g = 2;
                    } else if (k != 86) {
                        this.g = 0;
                    }
                } else if (i3 == 2) {
                    int k2 = ((this.j & (-225)) << 8) | xb2Var.k();
                    this.i = k2;
                    xb2 xb2Var2 = this.b;
                    if (k2 > xb2Var2.a.length) {
                        xb2Var2.c(k2);
                        wb2 wb2Var = this.c;
                        byte[] bArr = this.b.a;
                        wb2Var.b(bArr, bArr.length);
                    }
                    this.h = 0;
                    this.g = 3;
                } else {
                    if (i3 != 3) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(i2, this.i - this.h);
                    xb2Var.a(this.c.a, this.h, min);
                    int i4 = this.h + min;
                    this.h = i4;
                    if (i4 == this.i) {
                        this.c.b(0);
                        wb2 wb2Var2 = this.c;
                        if (!wb2Var2.e()) {
                            this.l = true;
                            int a = wb2Var2.a(1);
                            int a2 = a == 1 ? wb2Var2.a(1) : 0;
                            this.m = a2;
                            if (a2 == 0) {
                                if (a == 1) {
                                    wb2Var2.a((wb2Var2.a(2) + 1) * 8);
                                }
                                if (wb2Var2.e()) {
                                    this.n = wb2Var2.a(6);
                                    int a3 = wb2Var2.a(4);
                                    int a4 = wb2Var2.a(3);
                                    if (a3 != 0 || a4 != 0) {
                                        break;
                                    }
                                    if (a == 0) {
                                        int d = wb2Var2.d();
                                        int b = wb2Var2.b();
                                        a a5 = b.a(wb2Var2, true);
                                        this.u = a5.c;
                                        this.r = a5.a;
                                        this.t = a5.b;
                                        int b2 = b - wb2Var2.b();
                                        wb2Var2.b(d);
                                        byte[] bArr2 = new byte[(b2 + 7) / 8];
                                        wb2Var2.a(bArr2, b2);
                                        iw0 iw0Var = new iw0();
                                        iw0Var.a = this.e;
                                        iw0Var.k = "audio/mp4a-latm";
                                        iw0Var.h = this.u;
                                        iw0Var.x = this.t;
                                        iw0Var.y = this.r;
                                        iw0Var.m = Collections.singletonList(bArr2);
                                        iw0Var.c = this.a;
                                        jw0 jw0Var = new jw0(iw0Var);
                                        if (!jw0Var.equals(this.f)) {
                                            this.f = jw0Var;
                                            this.s = 1024000000 / jw0Var.A;
                                            this.d.a(jw0Var);
                                        }
                                    } else {
                                        int b3 = wb2Var2.b();
                                        a a6 = b.a(wb2Var2, true);
                                        this.u = a6.c;
                                        this.r = a6.a;
                                        this.t = a6.b;
                                        wb2Var2.c(wb2Var2.a((wb2Var2.a(2) + 1) * 8) - (b3 - wb2Var2.b()));
                                    }
                                    int a7 = wb2Var2.a(3);
                                    this.o = a7;
                                    if (a7 == 0) {
                                        wb2Var2.c(8);
                                    } else if (a7 == 1) {
                                        wb2Var2.c(9);
                                    } else if (a7 == 3 || a7 == 4 || a7 == 5) {
                                        wb2Var2.c(6);
                                    } else {
                                        if (a7 != 6 && a7 != 7) {
                                            throw new IllegalStateException();
                                        }
                                        wb2Var2.c(1);
                                    }
                                    boolean e2 = wb2Var2.e();
                                    this.p = e2;
                                    this.q = 0L;
                                    if (e2) {
                                        if (a == 1) {
                                            this.q = wb2Var2.a((wb2Var2.a(2) + 1) * 8);
                                        } else {
                                            do {
                                                e = wb2Var2.e();
                                                this.q = (this.q << 8) + wb2Var2.a(8);
                                            } while (e);
                                        }
                                    }
                                    if (wb2Var2.e()) {
                                        wb2Var2.c(8);
                                    }
                                } else {
                                    throw new cc2(null, null, true, 1);
                                }
                            } else {
                                throw new cc2(null, null, true, 1);
                            }
                        }
                        if (this.m == 0) {
                            if (this.n == 0) {
                                if (this.o == 0) {
                                    int i5 = 0;
                                    while (true) {
                                        int a8 = wb2Var2.a(8);
                                        i = i5 + a8;
                                        if (a8 != 255) {
                                            break;
                                        } else {
                                            i5 = i;
                                        }
                                    }
                                    int d2 = wb2Var2.d();
                                    if ((d2 & 7) == 0) {
                                        this.b.e(d2 >> 3);
                                    } else {
                                        wb2Var2.a(this.b.a, i * 8);
                                        this.b.e(0);
                                    }
                                    this.d.a(i, this.b);
                                    long j = this.k;
                                    if (j != -9223372036854775807L) {
                                        this.d.a(j, 1, i, 0, null);
                                        this.k += this.s;
                                    }
                                    if (this.p) {
                                        wb2Var2.c((int) this.q);
                                    }
                                    this.g = 0;
                                } else {
                                    throw new cc2(null, null, true, 1);
                                }
                            } else {
                                throw new cc2(null, null, true, 1);
                            }
                        } else {
                            throw new cc2(null, null, true, 1);
                        }
                    } else {
                        continue;
                    }
                }
            } else if (xb2Var.k() == 86) {
                this.g = 1;
            }
        }
    }
}
