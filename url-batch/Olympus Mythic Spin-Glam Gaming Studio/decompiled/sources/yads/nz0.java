package yads;

import java.util.Collections;

/* loaded from: classes15.dex */
public final class nz0 implements zl0 {
    public final ey2 a;
    public String b;
    public c83 c;
    public mz0 d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final ly1 g = new ly1(32);
    public final ly1 h = new ly1(33);
    public final ly1 i = new ly1(34);
    public final ly1 j = new ly1(39);
    public final ly1 k = new ly1(40);
    public long m = -9223372036854775807L;
    public final xb2 n = new xb2();

    public nz0(ey2 ey2Var) {
        this.a = ey2Var;
    }

    @Override // yads.zl0
    public final void a() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        py1.a(this.f);
        ly1 ly1Var = this.g;
        ly1Var.b = false;
        ly1Var.c = false;
        ly1 ly1Var2 = this.h;
        ly1Var2.b = false;
        ly1Var2.c = false;
        ly1 ly1Var3 = this.i;
        ly1Var3.b = false;
        ly1Var3.c = false;
        ly1 ly1Var4 = this.j;
        ly1Var4.b = false;
        ly1Var4.c = false;
        ly1 ly1Var5 = this.k;
        ly1Var5.b = false;
        ly1Var5.c = false;
        mz0 mz0Var = this.d;
        if (mz0Var != null) {
            mz0Var.f = false;
            mz0Var.g = false;
            mz0Var.h = false;
            mz0Var.i = false;
            mz0Var.j = false;
        }
    }

    @Override // yads.zl0
    public final void b() {
    }

    @Override // yads.zl0
    public final void a(wp0 wp0Var, z93 z93Var) {
        z93Var.a();
        z93Var.b();
        this.b = z93Var.e;
        z93Var.b();
        c83 a = wp0Var.a(z93Var.d, 2);
        this.c = a;
        this.d = new mz0(a);
        this.a.a(wp0Var, z93Var);
    }

    @Override // yads.zl0
    public final void a(int i, long j) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
    }

    public final void a(byte[] bArr, int i, int i2) {
        mz0 mz0Var = this.d;
        if (mz0Var.f) {
            int i3 = mz0Var.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                mz0Var.g = (bArr[i4] & 128) != 0;
                mz0Var.f = false;
            } else {
                mz0Var.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x0486, code lost:
    
        if (r2 <= 9) goto L225;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x049e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // yads.zl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xb2 xb2Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte[] bArr;
        long j;
        int i6;
        ?? r2;
        int i7;
        boolean z;
        int i8;
        char c;
        int i9;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i10;
        int i11;
        long j2;
        int i12;
        xb2 xb2Var2 = xb2Var;
        int i13 = 1;
        if (this.c != null) {
            int i14 = sb3.a;
            while (true) {
                int i15 = xb2Var2.c;
                int i16 = xb2Var2.b;
                int i17 = i15 - i16;
                if (i17 <= 0) {
                    return;
                }
                byte[] bArr2 = xb2Var2.a;
                this.l += i17;
                this.c.a(i17, xb2Var2);
                while (i16 < i15) {
                    int a = py1.a(bArr2, i16, i15, this.f);
                    if (a == i15) {
                        a(bArr2, i16, i15);
                        return;
                    }
                    int i18 = a + 3;
                    int i19 = (bArr2[i18] & 126) >> i13;
                    int i20 = a - i16;
                    if (i20 > 0) {
                        a(bArr2, i16, a);
                    }
                    int i21 = i15 - a;
                    long j3 = this.l - i21;
                    int i22 = i20 < 0 ? -i20 : 0;
                    byte[] bArr3 = bArr2;
                    long j4 = this.m;
                    mz0 mz0Var = this.d;
                    boolean z7 = this.e;
                    if (mz0Var.j && mz0Var.g) {
                        mz0Var.m = mz0Var.c;
                        mz0Var.j = false;
                    } else if (mz0Var.h || mz0Var.g) {
                        if (z7 && mz0Var.i) {
                            long j5 = mz0Var.b;
                            i = i22;
                            int i23 = i21 + ((int) (j3 - j5));
                            long j6 = mz0Var.l;
                            if (j6 != -9223372036854775807L) {
                                i3 = i15;
                                i2 = i21;
                                mz0Var.a.a(j6, mz0Var.m ? 1 : 0, (int) (j5 - mz0Var.k), i23, null);
                                mz0Var.k = mz0Var.b;
                                mz0Var.l = mz0Var.e;
                                mz0Var.m = mz0Var.c;
                                mz0Var.i = true;
                                if (this.e) {
                                    i4 = i18;
                                    i5 = i19;
                                    bArr = bArr3;
                                    j = j3;
                                    i6 = i;
                                } else {
                                    i6 = i;
                                    this.g.a(i6);
                                    this.h.a(i6);
                                    this.i.a(i6);
                                    ly1 ly1Var = this.g;
                                    if (ly1Var.c) {
                                        ly1 ly1Var2 = this.h;
                                        if (ly1Var2.c) {
                                            ly1 ly1Var3 = this.i;
                                            if (ly1Var3.c) {
                                                c83 c83Var = this.c;
                                                String str = this.b;
                                                int i24 = ly1Var.e;
                                                i4 = i18;
                                                byte[] bArr4 = new byte[ly1Var2.e + i24 + ly1Var3.e];
                                                bArr = bArr3;
                                                System.arraycopy(ly1Var.d, 0, bArr4, 0, i24);
                                                i5 = i19;
                                                System.arraycopy(ly1Var2.d, 0, bArr4, ly1Var.e, ly1Var2.e);
                                                System.arraycopy(ly1Var3.d, 0, bArr4, ly1Var.e + ly1Var2.e, ly1Var3.e);
                                                yb2 yb2Var = new yb2(ly1Var2.d, 0, ly1Var2.e);
                                                yb2Var.d(44);
                                                int b = yb2Var.b(3);
                                                yb2Var.f();
                                                int b2 = yb2Var.b(2);
                                                boolean c2 = yb2Var.c();
                                                int b3 = yb2Var.b(5);
                                                int i25 = 0;
                                                int i26 = 0;
                                                for (int i27 = 32; i25 < i27; i27 = 32) {
                                                    if (yb2Var.c()) {
                                                        i12 = 1;
                                                        i26 |= 1 << i25;
                                                    } else {
                                                        i12 = 1;
                                                    }
                                                    i25 += i12;
                                                }
                                                int[] iArr = new int[6];
                                                for (int i28 = 0; i28 < 6; i28++) {
                                                    iArr[i28] = yb2Var.b(8);
                                                }
                                                int b4 = yb2Var.b(8);
                                                int i29 = 0;
                                                for (int i30 = 0; i30 < b; i30++) {
                                                    if (yb2Var.c()) {
                                                        i29 += 89;
                                                    }
                                                    if (yb2Var.c()) {
                                                        i29 += 8;
                                                    }
                                                }
                                                yb2Var.d(i29);
                                                if (b > 0) {
                                                    yb2Var.d((8 - b) * 2);
                                                }
                                                yb2Var.d();
                                                int d = yb2Var.d();
                                                if (d == 3) {
                                                    yb2Var.f();
                                                }
                                                int d2 = yb2Var.d();
                                                int d3 = yb2Var.d();
                                                if (yb2Var.c()) {
                                                    int d4 = yb2Var.d();
                                                    int d5 = yb2Var.d();
                                                    int d6 = yb2Var.d();
                                                    int d7 = yb2Var.d();
                                                    d2 -= (d4 + d5) * ((d == 1 || d == 2) ? 2 : 1);
                                                    d3 -= (d6 + d7) * (d == 1 ? 2 : 1);
                                                }
                                                yb2Var.d();
                                                yb2Var.d();
                                                int d8 = yb2Var.d();
                                                for (int i31 = yb2Var.c() ? 0 : b; i31 <= b; i31++) {
                                                    yb2Var.d();
                                                    yb2Var.d();
                                                    yb2Var.d();
                                                }
                                                yb2Var.d();
                                                yb2Var.d();
                                                yb2Var.d();
                                                yb2Var.d();
                                                yb2Var.d();
                                                yb2Var.d();
                                                if (yb2Var.c() && yb2Var.c()) {
                                                    int i32 = 0;
                                                    for (int i33 = 4; i32 < i33; i33 = 4) {
                                                        int i34 = 0;
                                                        while (i34 < 6) {
                                                            if (!yb2Var.c()) {
                                                                yb2Var.d();
                                                                j2 = j3;
                                                                i11 = 1;
                                                            } else {
                                                                i11 = 1;
                                                                j2 = j3;
                                                                int min = Math.min(64, 1 << ((i32 << 1) + 4));
                                                                if (i32 > 1) {
                                                                    yb2Var.e();
                                                                }
                                                                for (int i35 = 0; i35 < min; i35++) {
                                                                    yb2Var.e();
                                                                }
                                                            }
                                                            i34 += i32 == 3 ? 3 : i11;
                                                            j3 = j2;
                                                        }
                                                        i32++;
                                                        j3 = j3;
                                                    }
                                                }
                                                j = j3;
                                                yb2Var.d(2);
                                                if (yb2Var.c()) {
                                                    yb2Var.d(8);
                                                    yb2Var.d();
                                                    yb2Var.d();
                                                    yb2Var.f();
                                                }
                                                int d9 = yb2Var.d();
                                                int i36 = 0;
                                                int i37 = 0;
                                                boolean z8 = false;
                                                while (i37 < d9) {
                                                    if (i37 != 0) {
                                                        z8 = yb2Var.c();
                                                    }
                                                    if (z8) {
                                                        yb2Var.f();
                                                        yb2Var.d();
                                                        for (int i38 = 0; i38 <= i36; i38++) {
                                                            if (yb2Var.c()) {
                                                                yb2Var.f();
                                                            }
                                                        }
                                                        i10 = d9;
                                                    } else {
                                                        int d10 = yb2Var.d();
                                                        int d11 = yb2Var.d();
                                                        int i39 = d10 + d11;
                                                        i10 = d9;
                                                        for (int i40 = 0; i40 < d10; i40++) {
                                                            yb2Var.d();
                                                            yb2Var.f();
                                                        }
                                                        for (int i41 = 0; i41 < d11; i41++) {
                                                            yb2Var.d();
                                                            yb2Var.f();
                                                        }
                                                        i36 = i39;
                                                    }
                                                    i37++;
                                                    d9 = i10;
                                                }
                                                if (yb2Var.c()) {
                                                    for (int i42 = 0; i42 < yb2Var.d(); i42++) {
                                                        yb2Var.d(d8 + 5);
                                                    }
                                                }
                                                yb2Var.d(2);
                                                float f = 1.0f;
                                                if (yb2Var.c()) {
                                                    if (yb2Var.c()) {
                                                        int b5 = yb2Var.b(8);
                                                        if (b5 == 255) {
                                                            int b6 = yb2Var.b(16);
                                                            int b7 = yb2Var.b(16);
                                                            if (b6 != 0 && b7 != 0) {
                                                                f = b6 / b7;
                                                            }
                                                        } else {
                                                            float[] fArr = py1.b;
                                                            if (b5 < 17) {
                                                                f = fArr[b5];
                                                            } else {
                                                                mf1.a(b5, "Unexpected aspect_ratio_idc value: ", "H265Reader");
                                                            }
                                                        }
                                                    }
                                                    if (yb2Var.c()) {
                                                        yb2Var.f();
                                                    }
                                                    if (yb2Var.c()) {
                                                        yb2Var.d(4);
                                                        if (yb2Var.c()) {
                                                            yb2Var.d(24);
                                                        }
                                                    }
                                                    if (yb2Var.c()) {
                                                        yb2Var.d();
                                                        yb2Var.d();
                                                    }
                                                    yb2Var.f();
                                                    if (yb2Var.c()) {
                                                        d3 *= 2;
                                                    }
                                                }
                                                int i43 = d3;
                                                String a2 = cx.a(b2, c2, b3, i26, iArr, b4);
                                                iw0 iw0Var = new iw0();
                                                iw0Var.a = str;
                                                iw0Var.k = "video/hevc";
                                                iw0Var.h = a2;
                                                iw0Var.p = d2;
                                                iw0Var.q = i43;
                                                iw0Var.t = f;
                                                iw0Var.m = Collections.singletonList(bArr4);
                                                c83Var.a(new jw0(iw0Var));
                                                this.e = true;
                                                if (this.j.a(i6)) {
                                                    ly1 ly1Var4 = this.j;
                                                    int a3 = py1.a(ly1Var4.d, ly1Var4.e);
                                                    xb2 xb2Var3 = this.n;
                                                    xb2Var3.a = this.j.d;
                                                    xb2Var3.c = a3;
                                                    xb2Var3.b = 0;
                                                    xb2Var3.e(5);
                                                    qt.a(j4, this.n, this.a.b);
                                                }
                                                if (this.k.a(i6)) {
                                                    r2 = 0;
                                                } else {
                                                    ly1 ly1Var5 = this.k;
                                                    int a4 = py1.a(ly1Var5.d, ly1Var5.e);
                                                    xb2 xb2Var4 = this.n;
                                                    xb2Var4.a = this.k.d;
                                                    xb2Var4.c = a4;
                                                    r2 = 0;
                                                    xb2Var4.b = 0;
                                                    xb2Var4.e(5);
                                                    qt.a(j4, this.n, this.a.b);
                                                }
                                                long j7 = this.m;
                                                mz0 mz0Var2 = this.d;
                                                boolean z9 = this.e;
                                                mz0Var2.g = r2;
                                                mz0Var2.h = r2;
                                                mz0Var2.e = j7;
                                                mz0Var2.d = r2;
                                                long j8 = j;
                                                mz0Var2.b = j8;
                                                i7 = i5;
                                                if (i7 >= 32) {
                                                    z = false;
                                                    i8 = 1;
                                                    c = 3;
                                                } else if (i7 != 40) {
                                                    if (!mz0Var2.i || mz0Var2.j) {
                                                        z5 = false;
                                                        c = 3;
                                                    } else {
                                                        if (z9) {
                                                            long j9 = mz0Var2.l;
                                                            if (j9 != -9223372036854775807L) {
                                                                c = 3;
                                                                mz0Var2.a.a(j9, mz0Var2.m ? 1 : 0, (int) (j8 - mz0Var2.k), i2, null);
                                                            } else {
                                                                z6 = false;
                                                                c = 3;
                                                                mz0Var2.i = z6;
                                                                z5 = z6;
                                                            }
                                                        } else {
                                                            c = 3;
                                                        }
                                                        z6 = false;
                                                        mz0Var2.i = z6;
                                                        z5 = z6;
                                                    }
                                                    if ((32 > i7 || i7 > 35) && i7 != 39) {
                                                        i8 = 1;
                                                        z = z5;
                                                    } else {
                                                        i8 = 1;
                                                        mz0Var2.h = !mz0Var2.j;
                                                        mz0Var2.j = true;
                                                        z = z5;
                                                    }
                                                } else {
                                                    z2 = false;
                                                    i9 = 16;
                                                    i8 = 1;
                                                    c = 3;
                                                    z3 = (i7 >= i9 || i7 > 21) ? z2 ? 1 : 0 : i8;
                                                    mz0Var2.c = z3;
                                                    if (z3 == 0) {
                                                        z4 = z2;
                                                    }
                                                    z4 = i8;
                                                    mz0Var2.f = z4;
                                                    if (!this.e) {
                                                        this.g.b(i7);
                                                        this.h.b(i7);
                                                        this.i.b(i7);
                                                    }
                                                    this.j.b(i7);
                                                    this.k.b(i7);
                                                    i13 = i8;
                                                    i16 = i4;
                                                    bArr2 = bArr;
                                                    i15 = i3;
                                                }
                                                i9 = 16;
                                                z2 = z;
                                                if (i7 >= i9) {
                                                }
                                                mz0Var2.c = z3;
                                                if (z3 == 0) {
                                                }
                                                z4 = i8;
                                                mz0Var2.f = z4;
                                                if (!this.e) {
                                                }
                                                this.j.b(i7);
                                                this.k.b(i7);
                                                i13 = i8;
                                                i16 = i4;
                                                bArr2 = bArr;
                                                i15 = i3;
                                            }
                                        }
                                    }
                                    i4 = i18;
                                    i5 = i19;
                                    bArr = bArr3;
                                    j = j3;
                                }
                                if (this.j.a(i6)) {
                                }
                                if (this.k.a(i6)) {
                                }
                                long j72 = this.m;
                                mz0 mz0Var22 = this.d;
                                boolean z92 = this.e;
                                mz0Var22.g = r2;
                                mz0Var22.h = r2;
                                mz0Var22.e = j72;
                                mz0Var22.d = r2;
                                long j82 = j;
                                mz0Var22.b = j82;
                                i7 = i5;
                                if (i7 >= 32) {
                                }
                                i9 = 16;
                                z2 = z;
                                if (i7 >= i9) {
                                }
                                mz0Var22.c = z3;
                                if (z3 == 0) {
                                }
                                z4 = i8;
                                mz0Var22.f = z4;
                                if (!this.e) {
                                }
                                this.j.b(i7);
                                this.k.b(i7);
                                i13 = i8;
                                i16 = i4;
                                bArr2 = bArr;
                                i15 = i3;
                            }
                        } else {
                            i = i22;
                        }
                        i3 = i15;
                        i2 = i21;
                        mz0Var.k = mz0Var.b;
                        mz0Var.l = mz0Var.e;
                        mz0Var.m = mz0Var.c;
                        mz0Var.i = true;
                        if (this.e) {
                        }
                        if (this.j.a(i6)) {
                        }
                        if (this.k.a(i6)) {
                        }
                        long j722 = this.m;
                        mz0 mz0Var222 = this.d;
                        boolean z922 = this.e;
                        mz0Var222.g = r2;
                        mz0Var222.h = r2;
                        mz0Var222.e = j722;
                        mz0Var222.d = r2;
                        long j822 = j;
                        mz0Var222.b = j822;
                        i7 = i5;
                        if (i7 >= 32) {
                        }
                        i9 = 16;
                        z2 = z;
                        if (i7 >= i9) {
                        }
                        mz0Var222.c = z3;
                        if (z3 == 0) {
                        }
                        z4 = i8;
                        mz0Var222.f = z4;
                        if (!this.e) {
                        }
                        this.j.b(i7);
                        this.k.b(i7);
                        i13 = i8;
                        i16 = i4;
                        bArr2 = bArr;
                        i15 = i3;
                    }
                    i = i22;
                    i3 = i15;
                    i2 = i21;
                    if (this.e) {
                    }
                    if (this.j.a(i6)) {
                    }
                    if (this.k.a(i6)) {
                    }
                    long j7222 = this.m;
                    mz0 mz0Var2222 = this.d;
                    boolean z9222 = this.e;
                    mz0Var2222.g = r2;
                    mz0Var2222.h = r2;
                    mz0Var2222.e = j7222;
                    mz0Var2222.d = r2;
                    long j8222 = j;
                    mz0Var2222.b = j8222;
                    i7 = i5;
                    if (i7 >= 32) {
                    }
                    i9 = 16;
                    z2 = z;
                    if (i7 >= i9) {
                    }
                    mz0Var2222.c = z3;
                    if (z3 == 0) {
                    }
                    z4 = i8;
                    mz0Var2222.f = z4;
                    if (!this.e) {
                    }
                    this.j.b(i7);
                    this.k.b(i7);
                    i13 = i8;
                    i16 = i4;
                    bArr2 = bArr;
                    i15 = i3;
                }
                xb2Var2 = xb2Var;
            }
        } else {
            throw new IllegalStateException();
        }
    }
}
