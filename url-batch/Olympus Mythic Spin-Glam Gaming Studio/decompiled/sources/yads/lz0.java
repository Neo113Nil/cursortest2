package yads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class lz0 implements zl0 {
    public final ey2 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public c83 j;
    public kz0 k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final ly1 d = new ly1(7);
    public final ly1 e = new ly1(8);
    public final ly1 f = new ly1(6);
    public long m = -9223372036854775807L;
    public final xb2 o = new xb2();

    public lz0(ey2 ey2Var, boolean z, boolean z2) {
        this.a = ey2Var;
        this.b = z;
        this.c = z2;
    }

    @Override // yads.zl0
    public final void a() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        py1.a(this.h);
        ly1 ly1Var = this.d;
        ly1Var.b = false;
        ly1Var.c = false;
        ly1 ly1Var2 = this.e;
        ly1Var2.b = false;
        ly1Var2.c = false;
        ly1 ly1Var3 = this.f;
        ly1Var3.b = false;
        ly1Var3.c = false;
        kz0 kz0Var = this.k;
        if (kz0Var != null) {
            kz0Var.k = false;
            kz0Var.o = false;
            jz0 jz0Var = kz0Var.n;
            jz0Var.b = false;
            jz0Var.a = false;
        }
    }

    @Override // yads.zl0
    public final void b() {
    }

    @Override // yads.zl0
    public final void a(wp0 wp0Var, z93 z93Var) {
        z93Var.a();
        z93Var.b();
        this.i = z93Var.e;
        z93Var.b();
        c83 a = wp0Var.a(z93Var.d, 2);
        this.j = a;
        this.k = new kz0(a, this.b, this.c);
        this.a.a(wp0Var, z93Var);
    }

    @Override // yads.zl0
    public final void a(int i, long j) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
        this.n = ((i & 2) != 0) | this.n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x030f, code lost:
    
        if (r7 != 1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x022e, code lost:
    
        if (r6.j == r8.j) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0238, code lost:
    
        if (r14 != 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x024c, code lost:
    
        if (r6.n == r8.n) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x025f, code lost:
    
        if (r6.p == r8.p) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x026d, code lost:
    
        if (r6.l == r8.l) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x032f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e4  */
    @Override // yads.zl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xb2 xb2Var) {
        int i;
        int i2;
        byte[] bArr;
        boolean z;
        boolean z2;
        kz0 kz0Var;
        int i3;
        int i4 = 3;
        c83 c83Var = this.j;
        if (c83Var != null) {
            int i5 = sb3.a;
            int i6 = xb2Var.b;
            int i7 = xb2Var.c;
            byte[] bArr2 = xb2Var.a;
            int i8 = i7 - i6;
            this.g += i8;
            c83Var.a(i8, xb2Var);
            while (true) {
                int a = py1.a(bArr2, i6, i7, this.h);
                if (a == i7) {
                    if (!this.l || this.k.c) {
                        this.d.a(bArr2, i6, i7);
                        this.e.a(bArr2, i6, i7);
                    }
                    this.f.a(bArr2, i6, i7);
                    this.k.a(bArr2, i6, i7);
                    return;
                }
                int i9 = a + 3;
                int i10 = bArr2[i9] & 31;
                int i11 = a - i6;
                if (i11 > 0) {
                    if (!this.l || this.k.c) {
                        this.d.a(bArr2, i6, a);
                        this.e.a(bArr2, i6, a);
                    }
                    this.f.a(bArr2, i6, a);
                    this.k.a(bArr2, i6, a);
                }
                int i12 = i7 - a;
                long j = this.g - i12;
                int i13 = i11 < 0 ? -i11 : 0;
                long j2 = this.m;
                if (!this.l || this.k.c) {
                    this.d.a(i13);
                    this.e.a(i13);
                    if (!this.l) {
                        if (this.d.c && this.e.c) {
                            ArrayList arrayList = new ArrayList();
                            ly1 ly1Var = this.d;
                            arrayList.add(Arrays.copyOf(ly1Var.d, ly1Var.e));
                            ly1 ly1Var2 = this.e;
                            arrayList.add(Arrays.copyOf(ly1Var2.d, ly1Var2.e));
                            ly1 ly1Var3 = this.d;
                            oy1 b = py1.b(ly1Var3.d, i4, ly1Var3.e);
                            ly1 ly1Var4 = this.e;
                            i = i9;
                            yb2 yb2Var = new yb2(ly1Var4.d, 4, ly1Var4.e);
                            int d = yb2Var.d();
                            int d2 = yb2Var.d();
                            yb2Var.f();
                            ny1 ny1Var = new ny1(d, d2, yb2Var.c());
                            i2 = i7;
                            String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(b.a), Integer.valueOf(b.b), Integer.valueOf(b.c));
                            c83 c83Var2 = this.j;
                            iw0 iw0Var = new iw0();
                            bArr = bArr2;
                            iw0Var.a = this.i;
                            iw0Var.k = "video/avc";
                            iw0Var.h = format;
                            iw0Var.p = b.e;
                            iw0Var.q = b.f;
                            iw0Var.t = b.g;
                            iw0Var.m = arrayList;
                            c83Var2.a(new jw0(iw0Var));
                            this.l = true;
                            this.k.d.append(b.d, b);
                            this.k.e.append(d, ny1Var);
                            ly1 ly1Var5 = this.d;
                            ly1Var5.b = false;
                            ly1Var5.c = false;
                            ly1 ly1Var6 = this.e;
                            ly1Var6.b = false;
                            ly1Var6.c = false;
                        } else {
                            i = i9;
                            i2 = i7;
                            bArr = bArr2;
                        }
                    } else {
                        i = i9;
                        i2 = i7;
                        bArr = bArr2;
                        ly1 ly1Var7 = this.d;
                        if (ly1Var7.c) {
                            oy1 b2 = py1.b(ly1Var7.d, 3, ly1Var7.e);
                            this.k.d.append(b2.d, b2);
                            ly1 ly1Var8 = this.d;
                            ly1Var8.b = false;
                            ly1Var8.c = false;
                        } else {
                            ly1 ly1Var9 = this.e;
                            if (ly1Var9.c) {
                                yb2 yb2Var2 = new yb2(ly1Var9.d, 4, ly1Var9.e);
                                int d3 = yb2Var2.d();
                                int d4 = yb2Var2.d();
                                yb2Var2.f();
                                this.k.e.append(d3, new ny1(d3, d4, yb2Var2.c()));
                                ly1 ly1Var10 = this.e;
                                ly1Var10.b = false;
                                ly1Var10.c = false;
                            }
                        }
                    }
                } else {
                    i = i9;
                    i2 = i7;
                    bArr = bArr2;
                }
                if (this.f.a(i13)) {
                    ly1 ly1Var11 = this.f;
                    int a2 = py1.a(ly1Var11.d, ly1Var11.e);
                    xb2 xb2Var2 = this.o;
                    xb2Var2.a = this.f.d;
                    xb2Var2.c = a2;
                    xb2Var2.b = 0;
                    xb2Var2.e(4);
                    qt.a(j2, this.o, this.a.b);
                }
                kz0 kz0Var2 = this.k;
                boolean z3 = this.l;
                boolean z4 = this.n;
                if (kz0Var2.i != 9) {
                    if (kz0Var2.c) {
                        jz0 jz0Var = kz0Var2.n;
                        jz0 jz0Var2 = kz0Var2.m;
                        if (jz0Var.a) {
                            if (jz0Var2.a) {
                                oy1 oy1Var = jz0Var.c;
                                if (oy1Var != null) {
                                    oy1 oy1Var2 = jz0Var2.c;
                                    if (oy1Var2 != null) {
                                        if (jz0Var.f == jz0Var2.f) {
                                            if (jz0Var.g == jz0Var2.g) {
                                                if (jz0Var.h == jz0Var2.h) {
                                                    if (jz0Var.i) {
                                                        if (jz0Var2.i) {
                                                        }
                                                    }
                                                    int i14 = jz0Var.d;
                                                    int i15 = jz0Var2.d;
                                                    if (i14 != i15) {
                                                        if (i14 != 0) {
                                                        }
                                                    }
                                                    int i16 = oy1Var.k;
                                                    if (i16 == 0) {
                                                        if (oy1Var2.k == 0) {
                                                            if (jz0Var.m == jz0Var2.m) {
                                                            }
                                                        }
                                                    }
                                                    if (i16 == 1) {
                                                        if (oy1Var2.k == 1) {
                                                            if (jz0Var.o == jz0Var2.o) {
                                                            }
                                                        }
                                                    }
                                                    boolean z5 = jz0Var.k;
                                                    if (z5 == jz0Var2.k) {
                                                        if (z5) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                } else {
                                    throw new IllegalStateException();
                                }
                            }
                        }
                    }
                    z = z4;
                    if (kz0Var2.b) {
                        jz0 jz0Var3 = kz0Var2.n;
                        z = jz0Var3.b && ((i3 = jz0Var3.e) == 7 || i3 == 2);
                    }
                    boolean z6 = kz0Var2.r;
                    int i17 = kz0Var2.i;
                    z2 = z6 | (i17 != 5 || (z && i17 == 1));
                    kz0Var2.r = z2;
                    if (z2) {
                        this.n = false;
                    }
                    long j3 = this.m;
                    if (this.l || this.k.c) {
                        this.d.b(i10);
                        this.e.b(i10);
                    }
                    this.f.b(i10);
                    kz0Var = this.k;
                    kz0Var.i = i10;
                    kz0Var.l = j3;
                    kz0Var.j = j;
                    int i18 = kz0Var.b ? 1 : 1;
                    if (kz0Var.c) {
                        if (i10 != 5 && i10 != i18 && i10 != 2) {
                        }
                        jz0 jz0Var4 = kz0Var.m;
                        kz0Var.m = kz0Var.n;
                        kz0Var.n = jz0Var4;
                        jz0Var4.b = false;
                        jz0Var4.a = false;
                        kz0Var.h = 0;
                        kz0Var.k = true;
                    }
                    i6 = i;
                    i7 = i2;
                    bArr2 = bArr;
                    i4 = 3;
                }
                if (z3 && kz0Var2.o) {
                    long j4 = kz0Var2.j;
                    int i19 = i12 + ((int) (j - j4));
                    long j5 = kz0Var2.q;
                    if (j5 != -9223372036854775807L) {
                        z = z4;
                        kz0Var2.a.a(j5, kz0Var2.r ? 1 : 0, (int) (j4 - kz0Var2.p), i19, null);
                        kz0Var2.p = kz0Var2.j;
                        kz0Var2.q = kz0Var2.l;
                        kz0Var2.r = false;
                        kz0Var2.o = true;
                        if (kz0Var2.b) {
                        }
                        boolean z62 = kz0Var2.r;
                        int i172 = kz0Var2.i;
                        z2 = z62 | (i172 != 5 || (z && i172 == 1));
                        kz0Var2.r = z2;
                        if (z2) {
                        }
                        long j32 = this.m;
                        if (this.l) {
                        }
                        this.d.b(i10);
                        this.e.b(i10);
                        this.f.b(i10);
                        kz0Var = this.k;
                        kz0Var.i = i10;
                        kz0Var.l = j32;
                        kz0Var.j = j;
                        if (kz0Var.b) {
                        }
                        if (kz0Var.c) {
                        }
                        i6 = i;
                        i7 = i2;
                        bArr2 = bArr;
                        i4 = 3;
                    }
                }
                z = z4;
                kz0Var2.p = kz0Var2.j;
                kz0Var2.q = kz0Var2.l;
                kz0Var2.r = false;
                kz0Var2.o = true;
                if (kz0Var2.b) {
                }
                boolean z622 = kz0Var2.r;
                int i1722 = kz0Var2.i;
                z2 = z622 | (i1722 != 5 || (z && i1722 == 1));
                kz0Var2.r = z2;
                if (z2) {
                }
                long j322 = this.m;
                if (this.l) {
                }
                this.d.b(i10);
                this.e.b(i10);
                this.f.b(i10);
                kz0Var = this.k;
                kz0Var.i = i10;
                kz0Var.l = j322;
                kz0Var.j = j;
                if (kz0Var.b) {
                }
                if (kz0Var.c) {
                }
                i6 = i;
                i7 = i2;
                bArr2 = bArr;
                i4 = 3;
            }
        } else {
            throw new IllegalStateException();
        }
    }
}
