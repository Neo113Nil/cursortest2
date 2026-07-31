package yads;

import android.util.Pair;
import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes5.dex */
public final class fz0 implements zl0 {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public c83 b;
    public final qb3 c;
    public final xb2 d;
    public final ly1 e;
    public final boolean[] f = new boolean[4];
    public final ez0 g = new ez0();
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    public fz0(qb3 qb3Var) {
        this.c = qb3Var;
        if (qb3Var != null) {
            this.e = new ly1(178);
            this.d = new xb2();
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    @Override // yads.zl0
    public final void a() {
        py1.a(this.f);
        ez0 ez0Var = this.g;
        ez0Var.a = false;
        ez0Var.b = 0;
        ez0Var.c = 0;
        ly1 ly1Var = this.e;
        if (ly1Var != null) {
            ly1Var.b = false;
            ly1Var.c = false;
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    @Override // yads.zl0
    public final void b() {
    }

    @Override // yads.zl0
    public final void a(wp0 wp0Var, z93 z93Var) {
        z93Var.a();
        z93Var.b();
        this.a = z93Var.e;
        z93Var.b();
        this.b = wp0Var.a(z93Var.d, 2);
        qb3 qb3Var = this.c;
        if (qb3Var != null) {
            qb3Var.a(wp0Var, z93Var);
        }
    }

    @Override // yads.zl0
    public final void a(int i, long j) {
        this.l = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x01bd, code lost:
    
        if (r11 != 179) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01c2, code lost:
    
        if (r11 != 184) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01c4, code lost:
    
        r27.o = true;
        r16 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01cc, code lost:
    
        r16 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e1  */
    @Override // yads.zl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xb2 xb2Var) {
        int i;
        int i2;
        long j;
        boolean z;
        boolean z2;
        int i3;
        float f;
        int i4;
        float f2;
        int i5;
        long j2;
        int i6 = 4;
        c83 c83Var = this.b;
        if (c83Var != null) {
            int i7 = xb2Var.b;
            int i8 = xb2Var.c;
            byte[] bArr = xb2Var.a;
            int i9 = i8 - i7;
            this.h += i9;
            c83Var.a(i9, xb2Var);
            while (true) {
                int a = py1.a(bArr, i7, i8, this.f);
                if (a == i8) {
                    break;
                }
                int i10 = a + 3;
                int i11 = xb2Var.a[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i12 = a - i7;
                if (this.j) {
                    i = i10;
                } else {
                    if (i12 > 0) {
                        this.g.a(bArr, i7, a);
                    }
                    int i13 = i12 < 0 ? -i12 : 0;
                    ez0 ez0Var = this.g;
                    if (ez0Var.a) {
                        int i14 = ez0Var.b - i13;
                        ez0Var.b = i14;
                        if (ez0Var.c == 0 && i11 == 181) {
                            ez0Var.c = i14;
                            i = i10;
                        } else {
                            ez0Var.a = false;
                            String str = this.a;
                            str.getClass();
                            byte[] copyOf = Arrays.copyOf(ez0Var.d, ez0Var.b);
                            int i15 = copyOf[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                            byte b = copyOf[5];
                            i = i10;
                            int i16 = ((b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> i6) | (i15 << i6);
                            int i17 = ((b & 15) << 8) | (copyOf[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                            int i18 = (copyOf[7] & 240) >> i6;
                            if (i18 == 2) {
                                f = i17 * 4;
                                i4 = i16 * 3;
                            } else if (i18 != 3) {
                                f2 = i18 != i6 ? 1.0f : (i17 * Sdk.SDKError.Reason.TPAT_ERROR_VALUE) / (i16 * 100);
                                iw0 iw0Var = new iw0();
                                iw0Var.a = str;
                                iw0Var.k = "video/mpeg2";
                                iw0Var.p = i16;
                                iw0Var.q = i17;
                                iw0Var.t = f2;
                                iw0Var.m = Collections.singletonList(copyOf);
                                jw0 jw0Var = new jw0(iw0Var);
                                i5 = (copyOf[7] & 15) - 1;
                                if (i5 >= 0) {
                                    double[] dArr = q;
                                    if (i5 < 8) {
                                        double d = dArr[i5];
                                        byte b2 = copyOf[ez0Var.c + 9];
                                        int i19 = (b2 & 96) >> 5;
                                        if (i19 != (b2 & 31)) {
                                            d *= (i19 + 1.0d) / (r3 + 1);
                                        }
                                        j2 = (long) (1000000.0d / d);
                                        Pair create = Pair.create(jw0Var, Long.valueOf(j2));
                                        this.b.a((jw0) create.first);
                                        this.k = ((Long) create.second).longValue();
                                        this.j = true;
                                    }
                                }
                                j2 = 0;
                                Pair create2 = Pair.create(jw0Var, Long.valueOf(j2));
                                this.b.a((jw0) create2.first);
                                this.k = ((Long) create2.second).longValue();
                                this.j = true;
                            } else {
                                f = i17 * 16;
                                i4 = i16 * 9;
                            }
                            f2 = f / i4;
                            iw0 iw0Var2 = new iw0();
                            iw0Var2.a = str;
                            iw0Var2.k = "video/mpeg2";
                            iw0Var2.p = i16;
                            iw0Var2.q = i17;
                            iw0Var2.t = f2;
                            iw0Var2.m = Collections.singletonList(copyOf);
                            jw0 jw0Var2 = new jw0(iw0Var2);
                            i5 = (copyOf[7] & 15) - 1;
                            if (i5 >= 0) {
                            }
                            j2 = 0;
                            Pair create22 = Pair.create(jw0Var2, Long.valueOf(j2));
                            this.b.a((jw0) create22.first);
                            this.k = ((Long) create22.second).longValue();
                            this.j = true;
                        }
                    } else {
                        i = i10;
                        if (i11 == 179) {
                            ez0Var.a = true;
                        }
                    }
                    ez0Var.a(ez0.e, 0, 3);
                }
                ly1 ly1Var = this.e;
                if (ly1Var != null) {
                    if (i12 > 0) {
                        ly1Var.a(bArr, i7, a);
                        i3 = 0;
                    } else {
                        i3 = -i12;
                    }
                    if (this.e.a(i3)) {
                        ly1 ly1Var2 = this.e;
                        int a2 = py1.a(ly1Var2.d, ly1Var2.e);
                        xb2 xb2Var2 = this.d;
                        int i20 = sb3.a;
                        xb2Var2.a = this.e.d;
                        xb2Var2.c = a2;
                        xb2Var2.b = 0;
                        qb3 qb3Var = this.c;
                        long j3 = this.n;
                        qb3Var.getClass();
                        if (xb2Var2.c - xb2Var2.b >= 9) {
                            int a3 = xb2Var2.a();
                            int a4 = xb2Var2.a();
                            int k = xb2Var2.k();
                            if (a3 == 434 && a4 == 1195456820) {
                                if (k == 3) {
                                    qt.b(j3, xb2Var2, qb3Var.b);
                                }
                            }
                        }
                    }
                    if (i11 == 178 && xb2Var.a[a + 2] == 1) {
                        this.e.b(i11);
                    }
                }
                int i21 = i8 - a;
                if (this.p && this.j) {
                    long j4 = this.n;
                    if (j4 != -9223372036854775807L) {
                        i2 = i8;
                        this.b.a(j4, this.o ? 1 : 0, ((int) (this.h - this.m)) - i21, i21, null);
                        if (this.i || this.p) {
                            this.m = this.h - i21;
                            j = this.l;
                            if (j == -9223372036854775807L) {
                                long j5 = this.n;
                                j = j5 != -9223372036854775807L ? j5 + this.k : -9223372036854775807L;
                            }
                            this.n = j;
                            z = false;
                            this.o = false;
                            this.l = -9223372036854775807L;
                            z2 = true;
                            this.i = true;
                        } else {
                            z = false;
                            z2 = true;
                        }
                        this.p = i11 != 0 ? z2 : z;
                        i8 = i2;
                        i7 = i;
                        i6 = 4;
                    }
                }
                i2 = i8;
                if (this.i) {
                }
                this.m = this.h - i21;
                j = this.l;
                if (j == -9223372036854775807L) {
                }
                this.n = j;
                z = false;
                this.o = false;
                this.l = -9223372036854775807L;
                z2 = true;
                this.i = true;
                this.p = i11 != 0 ? z2 : z;
                i8 = i2;
                i7 = i;
                i6 = 4;
            }
            if (!this.j) {
                this.g.a(bArr, i7, i8);
            }
            ly1 ly1Var3 = this.e;
            if (ly1Var3 != null) {
                ly1Var3.a(bArr, i7, i8);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }
}
