package yads;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes11.dex */
public final class iz0 implements zl0 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final qb3 a;
    public hz0 f;
    public long g;
    public String h;
    public c83 i;
    public boolean j;
    public final boolean[] c = new boolean[4];
    public final gz0 d = new gz0();
    public long k = -9223372036854775807L;
    public final ly1 e = new ly1(178);
    public final xb2 b = new xb2();

    public iz0(qb3 qb3Var) {
        this.a = qb3Var;
    }

    @Override // yads.zl0
    public final void a() {
        py1.a(this.c);
        gz0 gz0Var = this.d;
        gz0Var.a = false;
        gz0Var.c = 0;
        gz0Var.b = 0;
        hz0 hz0Var = this.f;
        if (hz0Var != null) {
            hz0Var.b = false;
            hz0Var.c = false;
            hz0Var.d = false;
            hz0Var.e = -1;
        }
        ly1 ly1Var = this.e;
        if (ly1Var != null) {
            ly1Var.b = false;
            ly1Var.c = false;
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // yads.zl0
    public final void b() {
    }

    @Override // yads.zl0
    public final void a(wp0 wp0Var, z93 z93Var) {
        z93Var.a();
        z93Var.b();
        this.h = z93Var.e;
        z93Var.b();
        c83 a = wp0Var.a(z93Var.d, 2);
        this.i = a;
        this.f = new hz0(a);
        this.a.a(wp0Var, z93Var);
    }

    @Override // yads.zl0
    public final void a(int i, long j) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0106  */
    @Override // yads.zl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xb2 xb2Var) {
        int i;
        int i2;
        char c;
        int i3;
        hz0 hz0Var;
        long j;
        int i4;
        int i5;
        float f;
        int i6 = 2;
        boolean z = true;
        if (this.f != null) {
            c83 c83Var = this.i;
            if (c83Var != null) {
                int i7 = xb2Var.b;
                int i8 = xb2Var.c;
                byte[] bArr = xb2Var.a;
                int i9 = i8 - i7;
                this.g += i9;
                c83Var.a(i9, xb2Var);
                while (true) {
                    int a = py1.a(bArr, i7, i8, this.c);
                    if (a == i8) {
                        if (!this.j) {
                            this.d.a(bArr, i7, i8);
                        }
                        hz0 hz0Var2 = this.f;
                        if (hz0Var2.c) {
                            int i10 = hz0Var2.f;
                            int i11 = (i7 + 1) - i10;
                            if (i11 < i8) {
                                if (((bArr[i11] & 192) >> 6) != 0) {
                                    z = false;
                                }
                                hz0Var2.d = z;
                                hz0Var2.c = false;
                            } else {
                                hz0Var2.f = (i8 - i7) + i10;
                            }
                        }
                        ly1 ly1Var = this.e;
                        if (ly1Var != null) {
                            ly1Var.a(bArr, i7, i8);
                            return;
                        }
                        return;
                    }
                    int i12 = a + 3;
                    byte b = xb2Var.a[i12];
                    int i13 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    int i14 = a - i7;
                    if (this.j) {
                        i = i8;
                        i2 = i12;
                    } else {
                        if (i14 > 0) {
                            this.d.a(bArr, i7, a);
                        }
                        int i15 = i14 < 0 ? -i14 : 0;
                        gz0 gz0Var = this.d;
                        int i16 = gz0Var.b;
                        if (i16 != 0) {
                            i2 = i12;
                            if (i16 == z) {
                                i = i8;
                                i5 = 0;
                                if (i13 != 181) {
                                    gh1.d("H263Reader", "Unexpected start code value");
                                    gz0Var.a = false;
                                    gz0Var.c = 0;
                                    gz0Var.b = 0;
                                } else {
                                    gz0Var.b = 2;
                                }
                            } else if (i16 == i6) {
                                i = i8;
                                i5 = 0;
                                if (i13 > 31) {
                                    gh1.d("H263Reader", "Unexpected start code value");
                                    gz0Var.a = false;
                                    gz0Var.c = 0;
                                    gz0Var.b = 0;
                                } else {
                                    gz0Var.b = 3;
                                }
                            } else if (i16 == 3) {
                                i = i8;
                                if ((b & 240) != 32) {
                                    gh1.d("H263Reader", "Unexpected start code value");
                                    i5 = 0;
                                    gz0Var.a = false;
                                    gz0Var.c = 0;
                                    gz0Var.b = 0;
                                } else {
                                    i5 = 0;
                                    gz0Var.d = gz0Var.c;
                                    gz0Var.b = 4;
                                }
                            } else {
                                if (i16 != 4) {
                                    throw new IllegalStateException();
                                }
                                if (i13 == 179 || i13 == 181) {
                                    gz0Var.c -= i15;
                                    gz0Var.a = false;
                                    c83 c83Var2 = this.i;
                                    int i17 = gz0Var.d;
                                    String str = this.h;
                                    str.getClass();
                                    byte[] copyOf = Arrays.copyOf(gz0Var.e, gz0Var.c);
                                    wb2 wb2Var = new wb2(copyOf);
                                    wb2Var.d(i17);
                                    wb2Var.d(4);
                                    wb2Var.f();
                                    wb2Var.c(8);
                                    if (wb2Var.e()) {
                                        wb2Var.c(4);
                                        wb2Var.c(3);
                                    }
                                    int a2 = wb2Var.a(4);
                                    i = i8;
                                    if (a2 == 15) {
                                        int a3 = wb2Var.a(8);
                                        int a4 = wb2Var.a(8);
                                        if (a4 == 0) {
                                            gh1.d("H263Reader", "Invalid aspect ratio");
                                            f = 1.0f;
                                            if (wb2Var.e()) {
                                                wb2Var.c(2);
                                                wb2Var.c(1);
                                                if (wb2Var.e()) {
                                                    wb2Var.c(15);
                                                    wb2Var.f();
                                                    wb2Var.c(15);
                                                    wb2Var.f();
                                                    wb2Var.c(15);
                                                    wb2Var.f();
                                                    wb2Var.c(3);
                                                    wb2Var.c(11);
                                                    wb2Var.f();
                                                    wb2Var.c(15);
                                                    wb2Var.f();
                                                }
                                            }
                                            if (wb2Var.a(2) != 0) {
                                                gh1.d("H263Reader", "Unhandled video object layer shape");
                                            }
                                            wb2Var.f();
                                            int a5 = wb2Var.a(16);
                                            wb2Var.f();
                                            if (wb2Var.e()) {
                                                if (a5 == 0) {
                                                    gh1.d("H263Reader", "Invalid vop_increment_time_resolution");
                                                } else {
                                                    int i18 = 0;
                                                    for (int i19 = a5 - 1; i19 > 0; i19 >>= 1) {
                                                        i18++;
                                                    }
                                                    wb2Var.c(i18);
                                                }
                                            }
                                            wb2Var.f();
                                            int a6 = wb2Var.a(13);
                                            wb2Var.f();
                                            int a7 = wb2Var.a(13);
                                            wb2Var.f();
                                            wb2Var.f();
                                            iw0 iw0Var = new iw0();
                                            iw0Var.a = str;
                                            iw0Var.k = "video/mp4v-es";
                                            iw0Var.p = a6;
                                            iw0Var.q = a7;
                                            iw0Var.t = f;
                                            iw0Var.m = Collections.singletonList(copyOf);
                                            c83Var2.a(new jw0(iw0Var));
                                            this.j = true;
                                        } else {
                                            f = a3 / a4;
                                            if (wb2Var.e()) {
                                            }
                                            if (wb2Var.a(2) != 0) {
                                            }
                                            wb2Var.f();
                                            int a52 = wb2Var.a(16);
                                            wb2Var.f();
                                            if (wb2Var.e()) {
                                            }
                                            wb2Var.f();
                                            int a62 = wb2Var.a(13);
                                            wb2Var.f();
                                            int a72 = wb2Var.a(13);
                                            wb2Var.f();
                                            wb2Var.f();
                                            iw0 iw0Var2 = new iw0();
                                            iw0Var2.a = str;
                                            iw0Var2.k = "video/mp4v-es";
                                            iw0Var2.p = a62;
                                            iw0Var2.q = a72;
                                            iw0Var2.t = f;
                                            iw0Var2.m = Collections.singletonList(copyOf);
                                            c83Var2.a(new jw0(iw0Var2));
                                            this.j = true;
                                        }
                                    } else {
                                        float[] fArr = l;
                                        if (a2 < 7) {
                                            f = fArr[a2];
                                            if (wb2Var.e()) {
                                            }
                                            if (wb2Var.a(2) != 0) {
                                            }
                                            wb2Var.f();
                                            int a522 = wb2Var.a(16);
                                            wb2Var.f();
                                            if (wb2Var.e()) {
                                            }
                                            wb2Var.f();
                                            int a622 = wb2Var.a(13);
                                            wb2Var.f();
                                            int a722 = wb2Var.a(13);
                                            wb2Var.f();
                                            wb2Var.f();
                                            iw0 iw0Var22 = new iw0();
                                            iw0Var22.a = str;
                                            iw0Var22.k = "video/mp4v-es";
                                            iw0Var22.p = a622;
                                            iw0Var22.q = a722;
                                            iw0Var22.t = f;
                                            iw0Var22.m = Collections.singletonList(copyOf);
                                            c83Var2.a(new jw0(iw0Var22));
                                            this.j = true;
                                        } else {
                                            gh1.d("H263Reader", "Invalid aspect ratio");
                                            f = 1.0f;
                                            if (wb2Var.e()) {
                                            }
                                            if (wb2Var.a(2) != 0) {
                                            }
                                            wb2Var.f();
                                            int a5222 = wb2Var.a(16);
                                            wb2Var.f();
                                            if (wb2Var.e()) {
                                            }
                                            wb2Var.f();
                                            int a6222 = wb2Var.a(13);
                                            wb2Var.f();
                                            int a7222 = wb2Var.a(13);
                                            wb2Var.f();
                                            wb2Var.f();
                                            iw0 iw0Var222 = new iw0();
                                            iw0Var222.a = str;
                                            iw0Var222.k = "video/mp4v-es";
                                            iw0Var222.p = a6222;
                                            iw0Var222.q = a7222;
                                            iw0Var222.t = f;
                                            iw0Var222.m = Collections.singletonList(copyOf);
                                            c83Var2.a(new jw0(iw0Var222));
                                            this.j = true;
                                        }
                                    }
                                } else {
                                    i = i8;
                                    i5 = 0;
                                }
                            }
                        } else {
                            i = i8;
                            i2 = i12;
                            i5 = 0;
                            if (i13 == 176) {
                                gz0Var.b = 1;
                                gz0Var.a = true;
                                gz0Var.a(gz0.f, i5, 3);
                            }
                        }
                        gz0Var.a(gz0.f, i5, 3);
                    }
                    hz0 hz0Var3 = this.f;
                    if (hz0Var3.c) {
                        int i20 = hz0Var3.f;
                        int i21 = (i7 + 1) - i20;
                        if (i21 < a) {
                            hz0Var3.d = ((bArr[i21] & 192) >> 6) == 0;
                            hz0Var3.c = false;
                        } else {
                            hz0Var3.f = i20 + i14;
                        }
                    }
                    ly1 ly1Var2 = this.e;
                    if (ly1Var2 != null) {
                        if (i14 > 0) {
                            ly1Var2.a(bArr, i7, a);
                            i4 = 0;
                        } else {
                            i4 = -i14;
                        }
                        if (this.e.a(i4)) {
                            ly1 ly1Var3 = this.e;
                            int a8 = py1.a(ly1Var3.d, ly1Var3.e);
                            xb2 xb2Var2 = this.b;
                            int i22 = sb3.a;
                            xb2Var2.a = this.e.d;
                            xb2Var2.c = a8;
                            xb2Var2.b = 0;
                            qb3 qb3Var = this.a;
                            long j2 = this.k;
                            if (a8 >= 9) {
                                int a9 = xb2Var2.a();
                                int a10 = xb2Var2.a();
                                int k = xb2Var2.k();
                                if (a9 == 434 && a10 == 1195456820) {
                                    c = 3;
                                    if (k == 3) {
                                        qt.b(j2, xb2Var2, qb3Var.b);
                                    }
                                    if (i13 == 178) {
                                        i3 = 2;
                                        if (xb2Var.a[a + 2] == 1) {
                                            this.e.b(i13);
                                        }
                                        int i23 = i - a;
                                        long j3 = this.g - i23;
                                        hz0Var = this.f;
                                        boolean z2 = this.j;
                                        if (hz0Var.e == 182 && z2 && hz0Var.b) {
                                            j = hz0Var.h;
                                            if (j != -9223372036854775807L) {
                                                hz0Var.a.a(j, hz0Var.d ? 1 : 0, (int) (j3 - hz0Var.g), i23, null);
                                            }
                                        }
                                        if (hz0Var.e != 179) {
                                            hz0Var.g = j3;
                                        }
                                        hz0 hz0Var4 = this.f;
                                        long j4 = this.k;
                                        hz0Var4.e = i13;
                                        hz0Var4.d = false;
                                        hz0Var4.b = i13 != 182 || i13 == 179;
                                        hz0Var4.c = i13 != 182;
                                        hz0Var4.f = 0;
                                        hz0Var4.h = j4;
                                        i6 = i3;
                                        i7 = i2;
                                        i8 = i;
                                        z = true;
                                    }
                                }
                            }
                        }
                        c = 3;
                        if (i13 == 178) {
                        }
                    } else {
                        c = 3;
                    }
                    i3 = 2;
                    int i232 = i - a;
                    long j32 = this.g - i232;
                    hz0Var = this.f;
                    boolean z22 = this.j;
                    if (hz0Var.e == 182) {
                        j = hz0Var.h;
                        if (j != -9223372036854775807L) {
                        }
                    }
                    if (hz0Var.e != 179) {
                    }
                    hz0 hz0Var42 = this.f;
                    long j42 = this.k;
                    hz0Var42.e = i13;
                    hz0Var42.d = false;
                    hz0Var42.b = i13 != 182 || i13 == 179;
                    hz0Var42.c = i13 != 182;
                    hz0Var42.f = 0;
                    hz0Var42.h = j42;
                    i6 = i3;
                    i7 = i2;
                    i8 = i;
                    z = true;
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            throw new IllegalStateException();
        }
    }
}
