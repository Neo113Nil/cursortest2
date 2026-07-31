package yads;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes5.dex */
public final class gb implements zl0 {
    public static final byte[] v = {73, 68, 51};
    public final boolean a;
    public final String d;
    public String e;
    public c83 f;
    public c83 g;
    public boolean k;
    public boolean l;
    public int o;
    public boolean p;
    public int r;
    public c83 t;
    public long u;
    public final wb2 b = new wb2(new byte[7]);
    public final xb2 c = new xb2(Arrays.copyOf(v, 10));
    public int h = 0;
    public int i = 0;
    public int j = 256;
    public int m = -1;
    public int n = -1;
    public long q = -9223372036854775807L;
    public long s = -9223372036854775807L;

    public gb(String str, boolean z) {
        this.a = z;
        this.d = str;
    }

    @Override // yads.zl0
    public final void a() {
        this.s = -9223372036854775807L;
        this.l = false;
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    @Override // yads.zl0
    public final void b() {
    }

    @Override // yads.zl0
    public final void a(wp0 wp0Var, z93 z93Var) {
        z93Var.a();
        z93Var.b();
        this.e = z93Var.e;
        z93Var.b();
        c83 a = wp0Var.a(z93Var.d, 1);
        this.f = a;
        this.t = a;
        if (this.a) {
            z93Var.a();
            z93Var.b();
            c83 a2 = wp0Var.a(z93Var.d, 5);
            this.g = a2;
            iw0 iw0Var = new iw0();
            z93Var.b();
            iw0Var.a = z93Var.e;
            iw0Var.k = "application/id3";
            a2.a(new jw0(iw0Var));
            return;
        }
        this.g = new hl0();
    }

    @Override // yads.zl0
    public final void a(int i, long j) {
        if (j != -9223372036854775807L) {
            this.s = j;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x02f8, code lost:
    
        r3 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0219, code lost:
    
        r13 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x030d A[SYNTHETIC] */
    @Override // yads.zl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xb2 xb2Var) {
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        char c;
        char c2;
        int i5 = 7;
        int i6 = -1;
        int i7 = 2;
        this.f.getClass();
        int i8 = sb3.a;
        while (true) {
            int i9 = xb2Var.c;
            int i10 = xb2Var.b;
            int i11 = i9 - i10;
            if (i11 <= 0) {
                return;
            }
            int i12 = this.h;
            int i13 = 4;
            if (i12 == 0) {
                byte[] bArr = xb2Var.a;
                while (true) {
                    if (i10 < i9) {
                        i = i10 + 1;
                        b = bArr[i10];
                        int i14 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if (this.j == 512 && (((((byte) i14) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | 65280) & 65526) == 65520) {
                            if (this.l) {
                                i2 = i6;
                                break;
                            }
                            int i15 = i10 - 1;
                            xb2Var.e(i10);
                            byte[] bArr2 = this.b.a;
                            if (xb2Var.c - xb2Var.b >= 1) {
                                xb2Var.a(bArr2, 0, 1);
                                this.b.b(i13);
                                int a = this.b.a(1);
                                int i16 = this.m;
                                if (i16 == i6 || a == i16) {
                                    if (this.n != i6) {
                                        byte[] bArr3 = this.b.a;
                                        if (xb2Var.c - xb2Var.b < 1) {
                                            break;
                                        }
                                        xb2Var.a(bArr3, 0, 1);
                                        this.b.b(2);
                                        if (this.b.a(i13) == this.n) {
                                            xb2Var.e(i);
                                        }
                                        i2 = -1;
                                        int i17 = this.j;
                                        i3 = i17 | i14;
                                        if (i3 == 329) {
                                            i4 = 2;
                                            c = 256;
                                            c2 = 3;
                                            this.j = 768;
                                        } else if (i3 == 511) {
                                            i4 = 2;
                                            c = 256;
                                            c2 = 3;
                                            this.j = 512;
                                        } else if (i3 == 836) {
                                            i4 = 2;
                                            c = 256;
                                            c2 = 3;
                                            this.j = 1024;
                                        } else {
                                            if (i3 == 1075) {
                                                this.h = 2;
                                                this.i = 3;
                                                this.r = 0;
                                                this.c.e(0);
                                                xb2Var.e(i);
                                                i7 = 2;
                                                i6 = i2;
                                                break;
                                            }
                                            c = 256;
                                            if (i17 != 256) {
                                                this.j = 256;
                                                i6 = i2;
                                                i7 = 2;
                                                i13 = 4;
                                            } else {
                                                i4 = 2;
                                                c2 = 3;
                                            }
                                        }
                                        i10 = i;
                                        i6 = i2;
                                        i13 = 4;
                                        i7 = i4;
                                    }
                                    byte[] bArr4 = this.b.a;
                                    if (xb2Var.c - xb2Var.b < i13) {
                                        break;
                                    }
                                    xb2Var.a(bArr4, 0, i13);
                                    this.b.b(14);
                                    int a2 = this.b.a(13);
                                    if (a2 >= 7) {
                                        byte[] bArr5 = xb2Var.a;
                                        int i18 = xb2Var.c;
                                        int i19 = i15 + a2;
                                        if (i19 >= i18) {
                                            break;
                                        }
                                        byte b2 = bArr5[i19];
                                        i2 = -1;
                                        if (b2 == -1) {
                                            int i20 = i19 + 1;
                                            if (i20 == i18) {
                                                break;
                                            }
                                            byte b3 = bArr5[i20];
                                            if ((((b3 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | 65280) & 65526) == 65520 && ((b3 & 8) >> 3) == a) {
                                                break;
                                            }
                                            int i172 = this.j;
                                            i3 = i172 | i14;
                                            if (i3 == 329) {
                                            }
                                            i10 = i;
                                            i6 = i2;
                                            i13 = 4;
                                            i7 = i4;
                                        } else {
                                            if (b2 == 73) {
                                                int i21 = i19 + 1;
                                                if (i21 != i18) {
                                                    if (bArr5[i21] == 68) {
                                                        int i22 = i19 + 2;
                                                        if (i22 != i18) {
                                                            if (bArr5[i22] == 51) {
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                            int i1722 = this.j;
                                            i3 = i1722 | i14;
                                            if (i3 == 329) {
                                            }
                                            i10 = i;
                                            i6 = i2;
                                            i13 = 4;
                                            i7 = i4;
                                        }
                                    }
                                    i2 = -1;
                                    int i17222 = this.j;
                                    i3 = i17222 | i14;
                                    if (i3 == 329) {
                                    }
                                    i10 = i;
                                    i6 = i2;
                                    i13 = 4;
                                    i7 = i4;
                                }
                            }
                        }
                        i2 = i6;
                        int i172222 = this.j;
                        i3 = i172222 | i14;
                        if (i3 == 329) {
                        }
                        i10 = i;
                        i6 = i2;
                        i13 = 4;
                        i7 = i4;
                    } else {
                        xb2Var.e(i10);
                        break;
                    }
                }
                this.o = (b & 8) >> 3;
                this.k = (b & 1) == 0;
                if (!this.l) {
                    this.h = 1;
                    this.i = 0;
                } else {
                    this.h = 3;
                    this.i = 0;
                }
                xb2Var.e(i);
                i6 = i2;
                i5 = 7;
                i7 = 2;
            } else if (i12 != 1) {
                if (i12 == i7) {
                    byte[] bArr6 = this.c.a;
                    int min = Math.min(i11, 10 - this.i);
                    xb2Var.a(bArr6, this.i, min);
                    int i23 = this.i + min;
                    this.i = i23;
                    if (i23 == 10) {
                        this.g.a(10, this.c);
                        this.c.e(6);
                        c83 c83Var = this.g;
                        int j = this.c.j() + 10;
                        this.h = 4;
                        this.i = 10;
                        this.t = c83Var;
                        this.u = 0L;
                        this.r = j;
                    }
                } else if (i12 == 3) {
                    int i24 = this.k ? i5 : 5;
                    byte[] bArr7 = this.b.a;
                    int min2 = Math.min(i11, i24 - this.i);
                    xb2Var.a(bArr7, this.i, min2);
                    int i25 = this.i + min2;
                    this.i = i25;
                    if (i25 == i24) {
                        this.b.b(0);
                        if (!this.p) {
                            int a3 = this.b.a(i7) + 1;
                            if (a3 != i7) {
                                gh1.d("AdtsReader", "Detected audio object type: " + a3 + ", but assuming AAC LC.");
                                a3 = i7;
                            }
                            this.b.c(5);
                            int a4 = this.b.a(3);
                            int i26 = this.n;
                            byte b4 = (byte) (((a3 << 3) & 248) | ((i26 >> 1) & i5));
                            byte b5 = (byte) (((a4 << 3) & 120) | ((i26 << i5) & 128));
                            byte[] bArr8 = new byte[i7];
                            bArr8[0] = b4;
                            bArr8[1] = b5;
                            a a5 = b.a(new wb2(bArr8), false);
                            iw0 iw0Var = new iw0();
                            iw0Var.a = this.e;
                            iw0Var.k = "audio/mp4a-latm";
                            iw0Var.h = a5.c;
                            iw0Var.x = a5.b;
                            iw0Var.y = a5.a;
                            iw0Var.m = Collections.singletonList(bArr8);
                            iw0Var.c = this.d;
                            jw0 jw0Var = new jw0(iw0Var);
                            this.q = 1024000000 / jw0Var.A;
                            this.f.a(jw0Var);
                            this.p = true;
                        } else {
                            this.b.c(10);
                        }
                        this.b.c(4);
                        int a6 = this.b.a(13);
                        int i27 = a6 - 7;
                        if (this.k) {
                            i27 = a6 - 9;
                        }
                        c83 c83Var2 = this.f;
                        long j2 = this.q;
                        this.h = 4;
                        this.i = 0;
                        this.t = c83Var2;
                        this.u = j2;
                        this.r = i27;
                    }
                } else {
                    if (i12 != 4) {
                        throw new IllegalStateException();
                    }
                    int min3 = Math.min(i11, this.r - this.i);
                    this.t.a(min3, xb2Var);
                    int i28 = this.i + min3;
                    this.i = i28;
                    int i29 = this.r;
                    if (i28 == i29) {
                        long j3 = this.s;
                        if (j3 != -9223372036854775807L) {
                            this.t.a(j3, 1, i29, 0, null);
                            this.s += this.u;
                        }
                        this.h = 0;
                        this.i = 0;
                        this.j = 256;
                    }
                }
            } else if (i11 != 0) {
                wb2 wb2Var = this.b;
                wb2Var.a[0] = xb2Var.a[i10];
                wb2Var.b(i7);
                int a7 = this.b.a(4);
                int i30 = this.n;
                if (i30 != i6 && a7 != i30) {
                    this.l = false;
                    this.h = 0;
                    this.i = 0;
                    this.j = 256;
                } else {
                    if (!this.l) {
                        this.l = true;
                        this.m = this.o;
                        this.n = a7;
                    }
                    this.h = 3;
                    this.i = 0;
                }
            }
        }
    }
}
