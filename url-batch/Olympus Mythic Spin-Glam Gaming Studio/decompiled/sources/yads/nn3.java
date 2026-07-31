package yads;

import android.util.Pair;

/* loaded from: classes8.dex */
public final class nn3 implements tp0 {
    public wp0 a;
    public c83 b;
    public ln3 e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    static {
        new yp0() { // from class: yads.nn3$$ExternalSyntheticLambda0
            @Override // yads.yp0
            public final tp0[] a() {
                return nn3.a();
            }
        };
    }

    public static /* synthetic */ tp0[] a() {
        return new tp0[]{new nn3()};
    }

    @Override // yads.tp0
    public final void release() {
    }

    @Override // yads.tp0
    public final boolean a(up0 up0Var) {
        return qn3.a((pd0) up0Var);
    }

    @Override // yads.tp0
    public final void a(wp0 wp0Var) {
        this.a = wp0Var;
        this.b = wp0Var.a(0, 1);
        wp0Var.a();
    }

    @Override // yads.tp0
    public final void a(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        ln3 ln3Var = this.e;
        if (ln3Var != null) {
            ln3Var.a(j2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x017e, code lost:
    
        if (r8 != 65534) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ab  */
    @Override // yads.tp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(up0 up0Var, dg2 dg2Var) {
        byte[] bArr;
        int b;
        if (this.b != null) {
            int i = sb3.a;
            int i2 = this.c;
            if (i2 == 0) {
                pd0 pd0Var = (pd0) up0Var;
                if (pd0Var.d == 0) {
                    int i3 = this.f;
                    if (i3 != -1) {
                        pd0Var.a(i3);
                        this.c = 4;
                    } else if (qn3.a(pd0Var)) {
                        long j = pd0Var.d;
                        pd0Var.a((int) ((pd0Var.f + j) - j));
                        this.c = 1;
                    } else {
                        throw new cc2("Unsupported or unrecognized wav file type.", null, true, 1);
                    }
                    return 0;
                }
                throw new IllegalStateException();
            }
            long j2 = -1;
            if (i2 == 1) {
                xb2 xb2Var = new xb2(8);
                pd0 pd0Var2 = (pd0) up0Var;
                pn3 a = pn3.a(pd0Var2, xb2Var);
                if (a.a != 1685272116) {
                    pd0Var2.f = 0;
                } else {
                    pd0Var2.a(false, 8);
                    xb2Var.e(0);
                    pd0Var2.b(xb2Var.a, 0, 8, false);
                    j2 = xb2Var.d();
                    pd0Var2.a(((int) a.b) + 8);
                }
                this.d = j2;
                this.c = 2;
                return 0;
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException();
                    }
                    long j3 = this.g;
                    if (j3 != -1) {
                        pd0 pd0Var3 = (pd0) up0Var;
                        long j4 = j3 - pd0Var3.d;
                        ln3 ln3Var = this.e;
                        ln3Var.getClass();
                        return ln3Var.a(pd0Var3, j4) ? -1 : 0;
                    }
                    throw new IllegalStateException();
                }
                pd0 pd0Var4 = (pd0) up0Var;
                pd0Var4.f = 0;
                pn3 a2 = qn3.a(1684108385, pd0Var4, new xb2(8));
                pd0Var4.a(8);
                Pair create = Pair.create(Long.valueOf(pd0Var4.d), Long.valueOf(a2.b));
                this.f = ((Long) create.first).intValue();
                long longValue = ((Long) create.second).longValue();
                long j5 = this.d;
                if (j5 != -1 && longValue == 4294967295L) {
                    longValue = j5;
                }
                long j6 = this.f + longValue;
                this.g = j6;
                long j7 = pd0Var4.c;
                if (j7 != -1 && j6 > j7) {
                    gh1.d("WavExtractor", "Data exceeds input length: " + this.g + ", " + j7);
                    this.g = j7;
                }
                ln3 ln3Var2 = this.e;
                ln3Var2.getClass();
                ln3Var2.a(this.f, this.g);
                this.c = 4;
                return 0;
            }
            xb2 xb2Var2 = new xb2(16);
            pd0 pd0Var5 = (pd0) up0Var;
            pn3 a3 = qn3.a(1718449184, pd0Var5, xb2Var2);
            if (a3.b >= 16) {
                pd0Var5.b(xb2Var2.a, 0, 16, false);
                xb2Var2.e(0);
                int f = xb2Var2.f();
                int f2 = xb2Var2.f();
                int c = xb2Var2.c();
                if (c >= 0) {
                    int c2 = xb2Var2.c();
                    if (c2 >= 0) {
                        int f3 = xb2Var2.f();
                        int f4 = xb2Var2.f();
                        int i4 = ((int) a3.b) - 16;
                        if (i4 > 0) {
                            bArr = new byte[i4];
                            pd0Var5.b(bArr, 0, i4, false);
                        } else {
                            bArr = sb3.f;
                        }
                        byte[] bArr2 = bArr;
                        long j8 = pd0Var5.d;
                        pd0Var5.a((int) ((pd0Var5.f + j8) - j8));
                        on3 on3Var = new on3(f, f2, c, f3, f4, bArr2);
                        if (f == 17) {
                            this.e = new kn3(this.a, this.b, on3Var);
                        } else if (f == 6) {
                            this.e = new mn3(this.a, this.b, on3Var, "audio/g711-alaw", -1);
                        } else if (f == 7) {
                            this.e = new mn3(this.a, this.b, on3Var, "audio/g711-mlaw", -1);
                        } else {
                            if (f != 1) {
                                if (f == 3) {
                                    if (f4 == 32) {
                                        b = 4;
                                        if (b != 0) {
                                            this.e = new mn3(this.a, this.b, on3Var, "audio/raw", b);
                                        } else {
                                            throw cc2.a("Unsupported WAV format type: " + f);
                                        }
                                    }
                                }
                                b = 0;
                                if (b != 0) {
                                }
                            }
                            b = sb3.b(f4);
                            if (b != 0) {
                            }
                        }
                        this.c = 3;
                        return 0;
                    }
                    throw new IllegalStateException(gg2.a(c2, "Top bit not zero: "));
                }
                throw new IllegalStateException(gg2.a(c, "Top bit not zero: "));
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }
}
