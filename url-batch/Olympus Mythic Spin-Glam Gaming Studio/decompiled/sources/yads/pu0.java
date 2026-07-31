package yads;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class pu0 implements tp0 {
    public wp0 e;
    public c83 f;
    public ht1 h;
    public xu0 i;
    public int j;
    public int k;
    public ou0 l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final xb2 b = new xb2(new byte[32768], 0);
    public final boolean c = false;
    public final qu0 d = new qu0();
    public int g = 0;

    static {
        new yp0() { // from class: yads.pu0$$ExternalSyntheticLambda0
            @Override // yads.yp0
            public final tp0[] a() {
                return pu0.a();
            }
        };
    }

    public static tp0[] a() {
        return new tp0[]{new pu0()};
    }

    @Override // yads.tp0
    public final void release() {
    }

    @Override // yads.tp0
    public final boolean a(up0 up0Var) {
        pd0 pd0Var = (pd0) up0Var;
        ht1 a = new a21().a(pd0Var, y11.b);
        if (a != null) {
            int length = a.b.length;
        }
        byte[] bArr = new byte[4];
        pd0Var.b(bArr, 0, 4, false);
        return ((((long) bArr[3]) & 255) | ((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[2]) & 255) << 8))) == 1716281667;
    }

    @Override // yads.tp0
    public final void a(wp0 wp0Var) {
        this.e = wp0Var;
        this.f = wp0Var.a(0, 1);
        wp0Var.a();
    }

    @Override // yads.tp0
    public final int a(up0 up0Var, dg2 dg2Var) {
        ht1 ht1Var;
        xu0 xu0Var;
        mx2 lx2Var;
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        int i = this.g;
        ht1 ht1Var2 = null;
        if (i == 0) {
            boolean z4 = this.c;
            pd0 pd0Var = (pd0) up0Var;
            pd0Var.f = 0;
            long j2 = pd0Var.d + 0;
            ht1 a = new a21().a(pd0Var, !z4 ? null : y11.b);
            if (a != null && a.b.length != 0) {
                ht1Var2 = a;
            }
            pd0Var.a((int) ((pd0Var.d + pd0Var.f) - j2));
            this.h = ht1Var2;
            this.g = 1;
            return 0;
        }
        if (i == 1) {
            byte[] bArr = this.a;
            pd0 pd0Var2 = (pd0) up0Var;
            pd0Var2.b(bArr, 0, bArr.length, false);
            pd0Var2.f = 0;
            this.g = 2;
            return 0;
        }
        int i2 = 24;
        if (i == 2) {
            ((pd0) up0Var).a(new byte[4], 0, 4, false);
            if ((((r3[2] & 255) << 8) | ((r3[0] & 255) << 24) | ((r3[1] & 255) << 16) | (r3[3] & 255)) == 1716281667) {
                this.g = 3;
                return 0;
            }
            throw new cc2("Failed to read FLAC stream marker.", null, true, 1);
        }
        if (i == 3) {
            xu0 xu0Var2 = this.i;
            boolean z5 = false;
            while (!z5) {
                pd0 pd0Var3 = (pd0) up0Var;
                pd0Var3.f = 0;
                wb2 wb2Var = new wb2(new byte[4]);
                pd0Var3.b(wb2Var.a, 0, 4, false);
                boolean e = wb2Var.e();
                int a2 = wb2Var.a(7);
                int a3 = wb2Var.a(i2) + 4;
                if (a2 == 0) {
                    byte[] bArr2 = new byte[38];
                    pd0Var3.a(bArr2, 0, 38, false);
                    xu0Var2 = new xu0(bArr2, 4);
                } else {
                    if (xu0Var2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (a2 == 3) {
                        xb2 xb2Var = new xb2(a3);
                        pd0Var3.a(xb2Var.a, 0, a3, false);
                        xu0Var = new xu0(xu0Var2.a, xu0Var2.b, xu0Var2.c, xu0Var2.d, xu0Var2.e, xu0Var2.g, xu0Var2.h, xu0Var2.j, su0.a(xb2Var), xu0Var2.l);
                    } else if (a2 == 4) {
                        xb2 xb2Var2 = new xb2(a3);
                        pd0Var3.a(xb2Var2.a, 0, a3, false);
                        xb2Var2.e(xb2Var2.b + 4);
                        ht1 a4 = dn3.a(Arrays.asList(dn3.a(xb2Var2, false, false).a));
                        ht1 ht1Var3 = xu0Var2.l;
                        if (ht1Var3 != null) {
                            if (a4 != null) {
                                gt1[] gt1VarArr = a4.b;
                                if (gt1VarArr.length != 0) {
                                    a4 = new ht1((gt1[]) sb3.a((Object[]) ht1Var3.b, (Object[]) gt1VarArr));
                                }
                            }
                            a4 = ht1Var3;
                        }
                        xu0Var = new xu0(xu0Var2.a, xu0Var2.b, xu0Var2.c, xu0Var2.d, xu0Var2.e, xu0Var2.g, xu0Var2.h, xu0Var2.j, xu0Var2.k, a4);
                    } else if (a2 == 6) {
                        xb2 xb2Var3 = new xb2(a3);
                        pd0Var3.a(xb2Var3.a, 0, a3, false);
                        xb2Var3.e(xb2Var3.b + 4);
                        int a5 = xb2Var3.a();
                        String a6 = xb2Var3.a(xb2Var3.a(), zt.a);
                        String a7 = xb2Var3.a(xb2Var3.a(), zt.c);
                        int a8 = xb2Var3.a();
                        int a9 = xb2Var3.a();
                        int a10 = xb2Var3.a();
                        int a11 = xb2Var3.a();
                        int a12 = xb2Var3.a();
                        byte[] bArr3 = new byte[a12];
                        xb2Var3.a(bArr3, 0, a12);
                        ht1 ht1Var4 = new ht1(l41.a(new md2(a5, a6, a7, a8, a9, a10, a11, bArr3)));
                        ht1 ht1Var5 = xu0Var2.l;
                        if (ht1Var5 == null) {
                            ht1Var = ht1Var4;
                        } else {
                            gt1[] gt1VarArr2 = ht1Var4.b;
                            ht1Var = gt1VarArr2.length == 0 ? ht1Var5 : new ht1((gt1[]) sb3.a((Object[]) ht1Var5.b, (Object[]) gt1VarArr2));
                        }
                        xu0Var = new xu0(xu0Var2.a, xu0Var2.b, xu0Var2.c, xu0Var2.d, xu0Var2.e, xu0Var2.g, xu0Var2.h, xu0Var2.j, xu0Var2.k, ht1Var);
                    } else {
                        pd0Var3.a(a3);
                    }
                    xu0Var2 = xu0Var;
                }
                int i3 = sb3.a;
                this.i = xu0Var2;
                z5 = e;
                i2 = 24;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            c83 c83Var = this.f;
            int i4 = sb3.a;
            c83Var.a(this.i.a(this.a, this.h));
            this.g = 4;
            return 0;
        }
        long j3 = 0;
        if (i == 4) {
            pd0 pd0Var4 = (pd0) up0Var;
            pd0Var4.f = 0;
            byte[] bArr4 = new byte[2];
            pd0Var4.b(bArr4, 0, 2, false);
            int i5 = ((bArr4[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr4[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            if ((i5 >> 2) == 16382) {
                pd0Var4.f = 0;
                this.k = i5;
                wp0 wp0Var = this.e;
                int i6 = sb3.a;
                long j4 = pd0Var4.d;
                long j5 = pd0Var4.c;
                this.i.getClass();
                xu0 xu0Var3 = this.i;
                if (xu0Var3.k != null) {
                    lx2Var = new vu0(xu0Var3, j4);
                } else if (j5 != -1 && xu0Var3.j > 0) {
                    ou0 ou0Var = new ou0(xu0Var3, this.k, j4, j5);
                    this.l = ou0Var;
                    lx2Var = ou0Var.a;
                } else {
                    long j6 = xu0Var3.j;
                    lx2Var = new lx2(j6 == 0 ? -9223372036854775807L : (j6 * 1000000) / xu0Var3.e, 0L);
                }
                wp0Var.a(lx2Var);
                this.g = 5;
                return 0;
            }
            pd0Var4.f = 0;
            throw new cc2("First frame does not start with sync code.", null, true, 1);
        }
        if (i != 5) {
            throw new IllegalStateException();
        }
        this.f.getClass();
        this.i.getClass();
        ou0 ou0Var2 = this.l;
        if (ou0Var2 != null && ou0Var2.c != null) {
            return ou0Var2.a((pd0) up0Var, dg2Var);
        }
        if (this.n == -1) {
            xu0 xu0Var4 = this.i;
            pd0 pd0Var5 = (pd0) up0Var;
            pd0Var5.f = 0;
            pd0Var5.a(false, 1);
            byte[] bArr5 = new byte[1];
            pd0Var5.b(bArr5, 0, 1, false);
            boolean z6 = (bArr5[0] & 1) == 1;
            pd0Var5.a(false, 2);
            int i7 = z6 ? 7 : 6;
            xb2 xb2Var4 = new xb2(i7);
            byte[] bArr6 = xb2Var4.a;
            int i8 = 0;
            while (i8 < i7) {
                int d = pd0Var5.d(bArr6, i8, i7 - i8);
                if (d == -1) {
                    break;
                }
                i8 += d;
            }
            xb2Var4.d(i8);
            pd0Var5.f = 0;
            try {
                long q = xb2Var4.q();
                if (!z6) {
                    q *= xu0Var4.b;
                }
                j3 = q;
                z3 = true;
            } catch (NumberFormatException unused) {
                z3 = false;
            }
            if (z3) {
                this.n = j3;
                return 0;
            }
            throw new cc2(null, null, true, 1);
        }
        xb2 xb2Var5 = this.b;
        int i9 = xb2Var5.c;
        if (i9 < 32768) {
            int c = ((pd0) up0Var).c(xb2Var5.a, i9, 32768 - i9);
            z = c == -1;
            if (!z) {
                this.b.d(i9 + c);
            } else {
                xb2 xb2Var6 = this.b;
                if (xb2Var6.c - xb2Var6.b == 0) {
                    long j7 = this.n * 1000000;
                    xu0 xu0Var5 = this.i;
                    int i10 = sb3.a;
                    this.f.a(j7 / xu0Var5.e, 1, this.m, 0, null);
                    return -1;
                }
            }
        } else {
            z = false;
        }
        xb2 xb2Var7 = this.b;
        int i11 = xb2Var7.b;
        int i12 = this.m;
        int i13 = this.j;
        if (i12 < i13) {
            xb2Var7.e(xb2Var7.b + Math.min(i13 - i12, xb2Var7.c - i11));
        }
        xb2 xb2Var8 = this.b;
        this.i.getClass();
        int i14 = xb2Var8.b;
        while (true) {
            if (i14 <= xb2Var8.c - 16) {
                xb2Var8.e(i14);
                if (ru0.a(xb2Var8, this.i, this.k, this.d)) {
                    xb2Var8.e(i14);
                    j = this.d.a;
                    break;
                }
                i14++;
            } else {
                if (z) {
                    while (true) {
                        int i15 = xb2Var8.c;
                        if (i14 <= i15 - this.j) {
                            xb2Var8.e(i14);
                            try {
                                z2 = ru0.a(xb2Var8, this.i, this.k, this.d);
                            } catch (IndexOutOfBoundsException unused2) {
                                z2 = false;
                            }
                            if (xb2Var8.b > xb2Var8.c) {
                                z2 = false;
                            }
                            if (z2) {
                                xb2Var8.e(i14);
                                j = this.d.a;
                                break;
                            }
                            i14++;
                        } else {
                            xb2Var8.e(i15);
                            break;
                        }
                    }
                } else {
                    xb2Var8.e(i14);
                }
                j = -1;
            }
        }
        xb2 xb2Var9 = this.b;
        int i16 = xb2Var9.b - i11;
        xb2Var9.e(i11);
        this.f.a(i16, this.b);
        int i17 = this.m + i16;
        this.m = i17;
        if (j != -1) {
            long j8 = this.n * 1000000;
            xu0 xu0Var6 = this.i;
            int i18 = sb3.a;
            this.f.a(j8 / xu0Var6.e, 1, i17, 0, null);
            this.m = 0;
            this.n = j;
        }
        xb2 xb2Var10 = this.b;
        int i19 = xb2Var10.c;
        int i20 = xb2Var10.b;
        int i21 = i19 - i20;
        if (i21 >= 16) {
            return 0;
        }
        byte[] bArr7 = xb2Var10.a;
        System.arraycopy(bArr7, i20, bArr7, 0, i21);
        this.b.e(0);
        this.b.d(i21);
        return 0;
    }

    @Override // yads.tp0
    public final void a(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            ou0 ou0Var = this.l;
            if (ou0Var != null) {
                ou0Var.a(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.c(0);
    }
}
