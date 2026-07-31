package yads;

import android.util.SparseArray;
import com.inmobi.media.core.config.models.AdConfig;

/* loaded from: classes4.dex */
public final class gl2 implements tp0 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public dl2 i;
    public wp0 j;
    public boolean k;
    public final m73 a = new m73(0);
    public final xb2 c = new xb2(4096);
    public final SparseArray b = new SparseArray();
    public final el2 d = new el2();

    static {
        new yp0() { // from class: yads.gl2$$ExternalSyntheticLambda0
            @Override // yads.yp0
            public final tp0[] a() {
                return gl2.a();
            }
        };
    }

    public static /* synthetic */ tp0[] a() {
        return new tp0[]{new gl2()};
    }

    @Override // yads.tp0
    public final void release() {
    }

    @Override // yads.tp0
    public final boolean a(up0 up0Var) {
        byte[] bArr = new byte[14];
        pd0 pd0Var = (pd0) up0Var;
        pd0Var.b(bArr, 0, 14, false);
        if (442 != (((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        pd0Var.a(false, bArr[13] & 7);
        pd0Var.b(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) | (bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }

    @Override // yads.tp0
    public final void a(wp0 wp0Var) {
        this.j = wp0Var;
    }

    @Override // yads.tp0
    public final void a(long j, long j2) {
        long j3;
        m73 m73Var = this.a;
        synchronized (m73Var) {
            j3 = m73Var.b;
        }
        boolean z = true;
        boolean z2 = j3 == -9223372036854775807L;
        if (z2) {
            z = z2;
        } else {
            long a = this.a.a();
            if (a == -9223372036854775807L || a == 0 || a == j2) {
                z = false;
            }
        }
        if (z) {
            this.a.c(j2);
        }
        dl2 dl2Var = this.i;
        if (dl2Var != null) {
            dl2Var.a(j2);
        }
        for (int i = 0; i < this.b.size(); i++) {
            fl2 fl2Var = (fl2) this.b.valueAt(i);
            fl2Var.f = false;
            fl2Var.a.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x029d  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // yads.tp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(up0 up0Var, dg2 dg2Var) {
        ?? r15;
        long j;
        long j2;
        long j3;
        zl0 fz0Var;
        long j4;
        long j5;
        wp0 wp0Var = this.j;
        if (wp0Var != null) {
            pd0 pd0Var = (pd0) up0Var;
            long j6 = pd0Var.c;
            if (j6 != -1) {
                el2 el2Var = this.d;
                if (!el2Var.c) {
                    if (!el2Var.e) {
                        int min = (int) Math.min(20000L, j6);
                        long j7 = j6 - min;
                        if (pd0Var.d != j7) {
                            dg2Var.a = j7;
                            return 1;
                        }
                        el2Var.b.c(min);
                        pd0Var.f = 0;
                        pd0Var.b(el2Var.b.a, 0, min, false);
                        xb2 xb2Var = el2Var.b;
                        int i = xb2Var.b;
                        int i2 = xb2Var.c - 4;
                        while (true) {
                            if (i2 < i) {
                                j5 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr = xb2Var.a;
                            if (((bArr[i2 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) == 442) {
                                xb2Var.e(i2 + 4);
                                long a = el2.a(xb2Var);
                                if (a != -9223372036854775807L) {
                                    j5 = a;
                                    break;
                                }
                            }
                            i2--;
                        }
                        el2Var.g = j5;
                        el2Var.e = true;
                    } else if (el2Var.g == -9223372036854775807L) {
                        el2Var.b.a(sb3.f);
                        el2Var.c = true;
                        pd0Var.f = 0;
                    } else if (!el2Var.d) {
                        int min2 = (int) Math.min(20000L, j6);
                        long j8 = 0;
                        if (pd0Var.d != j8) {
                            dg2Var.a = j8;
                            return 1;
                        }
                        el2Var.b.c(min2);
                        pd0Var.f = 0;
                        pd0Var.b(el2Var.b.a, 0, min2, false);
                        xb2 xb2Var2 = el2Var.b;
                        int i3 = xb2Var2.b;
                        int i4 = xb2Var2.c;
                        while (true) {
                            if (i3 >= i4 - 3) {
                                j4 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr2 = xb2Var2.a;
                            int i5 = i3 + 1;
                            if (((bArr2[i3 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr2[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr2[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr2[i3 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) == 442) {
                                xb2Var2.e(i3 + 4);
                                long a2 = el2.a(xb2Var2);
                                if (a2 != -9223372036854775807L) {
                                    j4 = a2;
                                    break;
                                }
                            }
                            i3 = i5;
                        }
                        el2Var.f = j4;
                        el2Var.d = true;
                    } else {
                        long j9 = el2Var.f;
                        if (j9 == -9223372036854775807L) {
                            el2Var.b.a(sb3.f);
                            el2Var.c = true;
                            pd0Var.f = 0;
                        } else {
                            long b = el2Var.a.b(el2Var.g) - el2Var.a.b(j9);
                            el2Var.h = b;
                            if (b < 0) {
                                gh1.d("PsDurationReader", "Invalid duration: " + el2Var.h + ". Using TIME_UNSET instead.");
                                el2Var.h = -9223372036854775807L;
                            }
                            el2Var.b.a(sb3.f);
                            el2Var.c = true;
                            pd0Var.f = 0;
                        }
                    }
                    return 0;
                }
            }
            if (this.k) {
                r15 = 0;
                j = 0;
            } else {
                this.k = true;
                el2 el2Var2 = this.d;
                long j10 = el2Var2.h;
                if (j10 != -9223372036854775807L) {
                    j = 0;
                    r15 = 0;
                    dl2 dl2Var = new dl2(el2Var2.a, j10, j6);
                    this.i = dl2Var;
                    this.j.a(dl2Var.a);
                } else {
                    j = 0;
                    r15 = 0;
                    wp0Var.a(new lx2(j10, 0L));
                }
            }
            dl2 dl2Var2 = this.i;
            if (dl2Var2 != null && dl2Var2.c != null) {
                return dl2Var2.a(pd0Var, dg2Var);
            }
            pd0Var.f = r15;
            if (j6 != -1) {
                j3 = j6 - (pd0Var.d + ((long) r15));
                j2 = -1;
            } else {
                j2 = -1;
                j3 = -1;
            }
            if ((j3 != j2 && j3 < 4) || !pd0Var.b(this.c.a, r15, 4, true)) {
                return -1;
            }
            this.c.e(r15);
            int a3 = this.c.a();
            if (a3 == 441) {
                return -1;
            }
            if (a3 == 442) {
                pd0Var.b(this.c.a, r15, 10, r15);
                this.c.e(9);
                pd0Var.a((this.c.k() & 7) + 14);
                return r15;
            }
            if (a3 == 443) {
                pd0Var.b(this.c.a, r15, 2, r15);
                this.c.e(r15);
                pd0Var.a(this.c.p() + 6);
                return r15;
            }
            if (((a3 & (-256)) >> 8) != 1) {
                pd0Var.a(1);
                return r15;
            }
            int i6 = a3 & 255;
            fl2 fl2Var = (fl2) this.b.get(i6);
            if (!this.e) {
                if (fl2Var == null) {
                    zl0 zl0Var = null;
                    if (i6 == 189) {
                        fz0Var = new d0(null);
                        this.f = true;
                        this.h = pd0Var.d;
                    } else if ((a3 & 224) == 192) {
                        fz0Var = new bw1(null);
                        this.f = true;
                        this.h = pd0Var.d;
                    } else {
                        if ((a3 & 240) == 224) {
                            fz0Var = new fz0(null);
                            this.g = true;
                            this.h = pd0Var.d;
                        }
                        if (zl0Var != null) {
                            zl0Var.a(this.j, new z93(Integer.MIN_VALUE, i6, 256));
                            fl2Var = new fl2(zl0Var, this.a);
                            this.b.put(i6, fl2Var);
                        }
                    }
                    zl0Var = fz0Var;
                    if (zl0Var != null) {
                    }
                }
                if (pd0Var.d > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                    this.e = true;
                    this.j.a();
                }
            }
            pd0Var.b(this.c.a, r15, 2, r15);
            this.c.e(r15);
            int p = this.c.p() + 6;
            if (fl2Var == null) {
                pd0Var.a(p);
            } else {
                this.c.c(p);
                pd0Var.a(this.c.a, r15, p, r15);
                this.c.e(6);
                xb2 xb2Var3 = this.c;
                xb2Var3.a(fl2Var.c.a, r15, 3);
                fl2Var.c.b(r15);
                fl2Var.c.c(8);
                fl2Var.d = fl2Var.c.e();
                fl2Var.e = fl2Var.c.e();
                fl2Var.c.c(6);
                xb2Var3.a(fl2Var.c.a, r15, fl2Var.c.a(8));
                fl2Var.c.b(r15);
                fl2Var.g = j;
                if (fl2Var.d) {
                    fl2Var.c.c(4);
                    fl2Var.c.c(1);
                    fl2Var.c.c(1);
                    long a4 = (fl2Var.c.a(3) << 30) | (fl2Var.c.a(15) << 15) | fl2Var.c.a(15);
                    fl2Var.c.c(1);
                    if (!fl2Var.f && fl2Var.e) {
                        fl2Var.c.c(4);
                        fl2Var.c.c(1);
                        fl2Var.c.c(1);
                        fl2Var.c.c(1);
                        fl2Var.b.b((fl2Var.c.a(3) << 30) | (fl2Var.c.a(15) << 15) | fl2Var.c.a(15));
                        fl2Var.f = true;
                    }
                    fl2Var.g = fl2Var.b.b(a4);
                }
                fl2Var.a.a(4, fl2Var.g);
                fl2Var.a.a(xb2Var3);
                fl2Var.a.b();
                xb2 xb2Var4 = this.c;
                xb2Var4.d(xb2Var4.a.length);
            }
            return r15;
        }
        throw new IllegalStateException();
    }
}
