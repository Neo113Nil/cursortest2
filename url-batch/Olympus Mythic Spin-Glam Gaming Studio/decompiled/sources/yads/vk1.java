package yads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.common.Scopes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class vk1 extends gk1 {
    public static final int[] p1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean q1;
    public static boolean r1;
    public final Context G0;
    public final ei3 H0;
    public final bj3 I0;
    public final long J0;
    public final int K0;
    public final boolean L0;
    public tk1 M0;
    public boolean N0;
    public boolean O0;
    public Surface P0;
    public td2 Q0;
    public boolean R0;
    public int S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public long W0;
    public long X0;
    public long Y0;
    public int Z0;
    public int a1;
    public int b1;
    public long c1;
    public long d1;
    public long e1;
    public int f1;
    public int g1;
    public int h1;
    public int i1;
    public float j1;
    public mj3 k1;
    public boolean l1;
    public int m1;
    public uk1 n1;
    public xh3 o1;

    public vk1(Context context, vj1 vj1Var, ik1 ik1Var, boolean z, Handler handler, un0 un0Var) {
        super(2, vj1Var, ik1Var, z, 30.0f);
        this.J0 = 5000L;
        this.K0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.G0 = applicationContext;
        this.H0 = new ei3(applicationContext);
        this.I0 = new bj3(handler, un0Var);
        this.L0 = tk2.f.Z0().equals(sb3.c);
        this.X0 = -9223372036854775807L;
        this.g1 = -1;
        this.h1 = -1;
        this.j1 = -1.0f;
        this.S0 = 1;
        this.m1 = 0;
        this.k1 = null;
    }

    public static boolean z() {
        int i = sb3.a;
        if (i <= 28) {
            wk1 wk1Var = tk2.f;
            String r = wk1Var.r();
            String str = sb3.b;
            if (r.equals(str) || wk1Var.I().equals(str) || wk1Var.K().equals(str) || wk1Var.J().equals(str) || wk1Var.Q0().equals(str) || wk1Var.P0().equals(str) || wk1Var.d1().equals(str) || wk1Var.e1().equals(str)) {
                return true;
            }
        }
        if (i <= 27 && tk2.f.w0().equals(sb3.b)) {
            return true;
        }
        if (i > 26) {
            return false;
        }
        wk1 wk1Var2 = tk2.f;
        String a = wk1Var2.a();
        String str2 = sb3.b;
        if (!a.equals(str2) && !wk1Var2.b().equals(str2) && !wk1Var2.c().equals(str2) && !wk1Var2.d().equals(str2) && !wk1Var2.e().equals(str2) && !wk1Var2.f().equals(str2) && !wk1Var2.g().equals(str2) && !wk1Var2.h().equals(str2) && !wk1Var2.i().equals(str2) && !wk1Var2.j().equals(str2) && !wk1Var2.k().equals(str2) && !wk1Var2.l().equals(str2) && !wk1Var2.m().equals(str2) && !wk1Var2.s().equals(str2) && !wk1Var2.t().equals(str2) && !wk1Var2.u().equals(str2) && !wk1Var2.v().equals(str2) && !wk1Var2.w().equals(str2) && !wk1Var2.y().equals(str2) && !wk1Var2.z().equals(str2) && !wk1Var2.A().equals(str2) && !wk1Var2.B().equals(str2) && !wk1Var2.C().equals(str2) && !wk1Var2.D().equals(str2) && !wk1Var2.E().equals(str2) && !wk1Var2.F().equals(str2) && !wk1Var2.G().equals(str2) && !wk1Var2.H().equals(str2) && !wk1Var2.L().equals(str2) && !wk1Var2.M().equals(str2) && !wk1Var2.N().equals(str2) && !wk1Var2.O().equals(str2) && !wk1Var2.P().equals(str2) && !wk1Var2.Q().equals(str2) && !wk1Var2.R().equals(str2) && !wk1Var2.S().equals(str2) && !wk1Var2.T().equals(str2) && !wk1Var2.U().equals(str2) && !wk1Var2.V().equals(str2) && !wk1Var2.W().equals(str2) && !wk1Var2.X().equals(str2) && !wk1Var2.Y().equals(str2) && !wk1Var2.Z().equals(str2) && !wk1Var2.a0().equals(str2) && !wk1Var2.b0().equals(str2) && !wk1Var2.c0().equals(str2) && !wk1Var2.d0().equals(str2) && !wk1Var2.e0().equals(str2) && !wk1Var2.f0().equals(str2) && !wk1Var2.g0().equals(str2) && !wk1Var2.h0().equals(str2) && !wk1Var2.i0().equals(str2) && !wk1Var2.j0().equals(str2) && !wk1Var2.k0().equals(str2) && !wk1Var2.l0().equals(str2) && !wk1Var2.m0().equals(str2) && !wk1Var2.n0().equals(str2) && !wk1Var2.o0().equals(str2) && !wk1Var2.p0().equals(str2) && !wk1Var2.q0().equals(str2) && !wk1Var2.r0().equals(str2) && !wk1Var2.s0().equals(str2) && !wk1Var2.t0().equals(str2) && !wk1Var2.u0().equals(str2) && !wk1Var2.v0().equals(str2) && !wk1Var2.x0().equals(str2) && !wk1Var2.y0().equals(str2) && !wk1Var2.z0().equals(str2) && !wk1Var2.A0().equals(str2) && !wk1Var2.B0().equals(str2) && !wk1Var2.C0().equals(str2) && !wk1Var2.D0().equals(str2) && !wk1Var2.E0().equals(str2) && !wk1Var2.F0().equals(str2) && !wk1Var2.H0().equals(str2) && !wk1Var2.I0().equals(str2) && !wk1Var2.K0().equals(str2) && !wk1Var2.L0().equals(str2) && !wk1Var2.M0().equals(str2) && !wk1Var2.N0().equals(str2) && !wk1Var2.O0().equals(str2) && !wk1Var2.R0().equals(str2) && !wk1Var2.S0().equals(str2) && !wk1Var2.T0().equals(str2) && !wk1Var2.U0().equals(str2) && !wk1Var2.V0().equals(str2) && !wk1Var2.W0().equals(str2) && !wk1Var2.X0().equals(str2) && !wk1Var2.Y0().equals(str2) && !wk1Var2.a1().equals(str2) && !wk1Var2.b1().equals(str2) && !wk1Var2.f1().equals(str2) && !wk1Var2.g1().equals(str2) && !wk1Var2.h1().equals(str2) && !wk1Var2.i1().equals(str2) && !wk1Var2.j1().equals(str2) && !wk1Var2.k1().equals(str2) && !wk1Var2.l1().equals(str2) && !wk1Var2.m1().equals(str2) && !wk1Var2.n1().equals(str2) && !wk1Var2.o1().equals(str2) && !wk1Var2.p1().equals(str2) && !wk1Var2.q1().equals(str2) && !wk1Var2.r1().equals(str2) && !wk1Var2.s1().equals(str2) && !wk1Var2.t1().equals(str2) && !wk1Var2.u1().equals(str2) && !wk1Var2.v1().equals(str2) && !wk1Var2.w1().equals(str2) && !wk1Var2.x1().equals(str2) && !wk1Var2.y1().equals(str2) && !wk1Var2.z1().equals(str2) && !wk1Var2.A1().equals(str2) && !wk1Var2.B1().equals(str2) && !wk1Var2.C1().equals(str2) && !wk1Var2.D1().equals(str2) && !wk1Var2.E1().equals(str2) && !wk1Var2.G1().equals(str2) && !wk1Var2.H1().equals(str2) && !wk1Var2.I1().equals(str2) && !wk1Var2.F1().equals(str2) && !wk1Var2.J1().equals(str2) && !wk1Var2.K1().equals(str2) && !wk1Var2.L1().equals(str2) && !wk1Var2.M1().equals(str2) && !wk1Var2.N1().equals(str2) && !wk1Var2.O1().equals(str2) && !wk1Var2.P1().equals(str2) && !wk1Var2.Q1().equals(str2) && !wk1Var2.R1().equals(str2) && !wk1Var2.S1().equals(str2) && !wk1Var2.T1().equals(str2) && !wk1Var2.U1().equals(str2) && !wk1Var2.V1().equals(str2) && !wk1Var2.W1().equals(str2) && !wk1Var2.X1().equals(str2) && !wk1Var2.Y1().equals(str2) && !wk1Var2.Z1().equals(str2) && !wk1Var2.a2().equals(str2) && !wk1Var2.b2().equals(str2)) {
            String n = wk1Var2.n();
            String str3 = sb3.d;
            if (!n.equals(str3) && !wk1Var2.o().equals(str3) && !wk1Var2.G0().equals(str3)) {
                return false;
            }
        }
        return true;
    }

    public final void A() {
        int i = this.g1;
        if (i == -1 && this.h1 == -1) {
            return;
        }
        mj3 mj3Var = this.k1;
        if (mj3Var != null && mj3Var.b == i && mj3Var.c == this.h1 && mj3Var.d == this.i1 && mj3Var.e == this.j1) {
            return;
        }
        mj3 mj3Var2 = new mj3(this.g1, this.h1, this.i1, this.j1);
        this.k1 = mj3Var2;
        this.I0.b(mj3Var2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if ((r9 == 0 ? false : r1.g[(int) ((r9 - 1) % 15)]) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015c, code lost:
    
        if ((((r5 > (-30000) ? 1 : (r5 == (-30000) ? 0 : -1)) < 0) && r12 > 100000) != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e3  */
    @Override // yads.gk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(long j, long j2, xj1 xj1Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, jw0 jw0Var) {
        boolean z3;
        String str;
        long j4;
        long j5;
        long j6;
        int i4;
        int i5;
        boolean z4;
        long j7;
        long j8;
        boolean z5;
        xj1Var.getClass();
        if (this.W0 == -9223372036854775807L) {
            this.W0 = j;
        }
        if (j3 != this.c1) {
            ei3 ei3Var = this.H0;
            long j9 = ei3Var.n;
            if (j9 != -1) {
                ei3Var.p = j9;
                ei3Var.q = ei3Var.o;
            }
            ei3Var.m++;
            hu0 hu0Var = ei3Var.a;
            long j10 = j3 * 1000;
            hu0Var.a.a(j10);
            if (hu0Var.a.a()) {
                hu0Var.c = false;
            } else if (hu0Var.d != -9223372036854775807L) {
                if (hu0Var.c) {
                    gu0 gu0Var = hu0Var.b;
                    long j11 = gu0Var.d;
                }
                gu0 gu0Var2 = hu0Var.b;
                gu0Var2.d = 0L;
                gu0Var2.e = 0L;
                gu0Var2.f = 0L;
                gu0Var2.h = 0;
                Arrays.fill(gu0Var2.g, false);
                hu0Var.b.a(hu0Var.d);
                hu0Var.c = true;
                hu0Var.b.a(j10);
            }
            if (hu0Var.c && hu0Var.b.a()) {
                gu0 gu0Var3 = hu0Var.a;
                hu0Var.a = hu0Var.b;
                hu0Var.b = gu0Var3;
                hu0Var.c = false;
            }
            hu0Var.d = j10;
            hu0Var.e = hu0Var.a.a() ? 0 : hu0Var.e + 1;
            ei3Var.b();
            this.c1 = j3;
        }
        long j12 = this.D0;
        long j13 = j3 - j12;
        if (z && !z2) {
            t73.a("skipVideoBuffer");
            xj1Var.a(false, i);
            t73.a();
            this.B0.f++;
            return true;
        }
        double d = this.I;
        boolean z6 = this.g == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j14 = (long) ((j3 - j) / d);
        if (z6) {
            j14 -= elapsedRealtime - j2;
        }
        if (this.P0 == this.Q0) {
            if (!(j14 < -30000)) {
                return false;
            }
            t73.a("skipVideoBuffer");
            xj1Var.a(false, i);
            t73.a();
            this.B0.f++;
            c(j14);
            return true;
        }
        long j15 = elapsedRealtime - this.d1;
        boolean z7 = this.V0 ? !this.T0 : z6 || this.U0;
        if (this.X0 == -9223372036854775807L && j >= j12) {
            if (!z7) {
                if (z6) {
                }
            }
            z3 = true;
            if (!z3) {
                long nanoTime = System.nanoTime();
                xh3 xh3Var = this.o1;
                if (xh3Var != null) {
                    xh3Var.a(j13, nanoTime, jw0Var, this.M);
                }
                if (sb3.a >= 21) {
                    A();
                    t73.a("releaseOutputBuffer");
                    xj1Var.a(i, nanoTime);
                    t73.a();
                    this.d1 = SystemClock.elapsedRealtime() * 1000;
                    z5 = true;
                    this.B0.e++;
                    this.a1 = 0;
                    this.V0 = true;
                    if (!this.T0) {
                        this.T0 = true;
                        this.I0.a(this.P0);
                        this.R0 = true;
                    }
                } else {
                    z5 = true;
                    A();
                    t73.a("releaseOutputBuffer");
                    xj1Var.a(true, i);
                    t73.a();
                    this.d1 = SystemClock.elapsedRealtime() * 1000;
                    this.B0.e++;
                    this.a1 = 0;
                    this.V0 = true;
                    if (!this.T0) {
                        this.T0 = true;
                        this.I0.a(this.P0);
                        this.R0 = true;
                    }
                }
                c(j14);
                return z5;
            }
            if (!z6 || j == this.W0) {
                return false;
            }
            long nanoTime2 = System.nanoTime();
            long j16 = (j14 * 1000) + nanoTime2;
            ei3 ei3Var2 = this.H0;
            if (ei3Var2.p == -1 || !ei3Var2.a.a.a()) {
                str = "releaseOutputBuffer";
                j4 = nanoTime2;
            } else {
                hu0 hu0Var2 = ei3Var2.a;
                if (hu0Var2.a.a()) {
                    gu0 gu0Var4 = hu0Var2.a;
                    long j17 = gu0Var4.e;
                    j8 = j17 == 0 ? 0L : gu0Var4.f / j17;
                } else {
                    j8 = -9223372036854775807L;
                }
                j4 = nanoTime2;
                str = "releaseOutputBuffer";
                long j18 = ei3Var2.q + ((long) (((ei3Var2.m - ei3Var2.p) * j8) / ei3Var2.i));
                if (Math.abs(j16 - j18) <= 20000000) {
                    j16 = j18;
                } else {
                    ei3Var2.m = 0L;
                    ei3Var2.p = -1L;
                    ei3Var2.n = -1L;
                }
            }
            ei3Var2.n = ei3Var2.m;
            ei3Var2.o = j16;
            di3 di3Var = ei3Var2.c;
            if (di3Var != null && ei3Var2.k != -9223372036854775807L) {
                long j19 = di3Var.b;
                if (j19 != -9223372036854775807L) {
                    long j20 = ei3Var2.k;
                    long j21 = (((j16 - j19) / j20) * j20) + j19;
                    if (j16 <= j21) {
                        j7 = j21 - j20;
                    } else {
                        j7 = j21;
                        j21 = j20 + j21;
                    }
                    if (j21 - j16 >= j16 - j7) {
                        j21 = j7;
                    }
                    long j22 = j21 - ei3Var2.l;
                    j5 = j4;
                    j16 = j22;
                    j6 = (j16 - j5) / 1000;
                    boolean z8 = this.X0 == -9223372036854775807L;
                    if (j6 >= -500000 && !z2) {
                        ys2 ys2Var = this.h;
                        ys2Var.getClass();
                        int b = ys2Var.b(j - this.j);
                        if (b == 0) {
                            z4 = false;
                        } else {
                            if (z8) {
                                cb0 cb0Var = this.B0;
                                cb0Var.d += b;
                                cb0Var.f += this.b1;
                            } else {
                                cb0 cb0Var2 = this.B0;
                                cb0Var2.j++;
                                int i6 = this.b1;
                                cb0Var2.h += b;
                                int i7 = b + i6;
                                cb0Var2.g += i7;
                                this.Z0 += i7;
                                int i8 = this.a1 + i7;
                                this.a1 = i8;
                                cb0Var2.i = Math.max(i8, cb0Var2.i);
                                int i9 = this.K0;
                                if (i9 > 0 && (i5 = this.Z0) >= i9 && i5 > 0) {
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                    this.I0.a(this.Z0, elapsedRealtime2 - this.Y0);
                                    this.Z0 = 0;
                                    this.Y0 = elapsedRealtime2;
                                }
                            }
                            if (o()) {
                                q();
                            }
                            z4 = true;
                        }
                        if (z4) {
                            return false;
                        }
                    }
                    if (!((((j6 > (-30000L) ? 1 : (j6 == (-30000L) ? 0 : -1)) >= 0) || z2) ? false : true)) {
                        if (z8) {
                            t73.a("skipVideoBuffer");
                            xj1Var.a(false, i);
                            t73.a();
                            this.B0.f++;
                        } else {
                            t73.a("dropVideoBuffer");
                            xj1Var.a(false, i);
                            t73.a();
                            cb0 cb0Var3 = this.B0;
                            cb0Var3.h = cb0Var3.h;
                            cb0Var3.g++;
                            this.Z0++;
                            int i10 = this.a1 + 1;
                            this.a1 = i10;
                            cb0Var3.i = Math.max(i10, cb0Var3.i);
                            int i11 = this.K0;
                            if (i11 > 0 && (i4 = this.Z0) >= i11 && i4 > 0) {
                                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                                this.I0.a(this.Z0, elapsedRealtime3 - this.Y0);
                                this.Z0 = 0;
                                this.Y0 = elapsedRealtime3;
                            }
                        }
                        c(j6);
                        return true;
                    }
                    if (sb3.a >= 21) {
                        if (j6 < 50000) {
                            xh3 xh3Var2 = this.o1;
                            if (xh3Var2 != null) {
                                xh3Var2.a(j13, j16, jw0Var, this.M);
                            }
                            A();
                            t73.a(str);
                            xj1Var.a(i, j16);
                            t73.a();
                            this.d1 = SystemClock.elapsedRealtime() * 1000;
                            this.B0.e++;
                            this.a1 = 0;
                            this.V0 = true;
                            if (!this.T0) {
                                this.T0 = true;
                                this.I0.a(this.P0);
                                this.R0 = true;
                            }
                            c(j6);
                            return true;
                        }
                    } else if (j6 < 30000) {
                        if (j6 > 11000) {
                            try {
                                Thread.sleep((j6 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        xh3 xh3Var3 = this.o1;
                        if (xh3Var3 != null) {
                            xh3Var3.a(j13, j16, jw0Var, this.M);
                        }
                        A();
                        t73.a(str);
                        xj1Var.a(true, i);
                        t73.a();
                        this.d1 = SystemClock.elapsedRealtime() * 1000;
                        this.B0.e++;
                        this.a1 = 0;
                        this.V0 = true;
                        if (!this.T0) {
                            this.T0 = true;
                            this.I0.a(this.P0);
                            this.R0 = true;
                        }
                        c(j6);
                        return true;
                    }
                    return false;
                }
            }
            j5 = j4;
            j6 = (j16 - j5) / 1000;
            if (this.X0 == -9223372036854775807L) {
            }
            if (j6 >= -500000 && !z2) {
            }
            if (!((((j6 > (-30000L) ? 1 : (j6 == (-30000L) ? 0 : -1)) >= 0) || z2) ? false : true)) {
            }
        }
        z3 = false;
        if (!z3) {
        }
    }

    @Override // yads.gk1
    public final void b(fb0 fb0Var) {
        boolean z = this.l1;
        if (!z) {
            this.b1++;
        }
        if (sb3.a >= 23 || !z) {
            return;
        }
        long j = fb0Var.f;
        b(j);
        A();
        this.B0.e++;
        this.V0 = true;
        if (!this.T0) {
            this.T0 = true;
            this.I0.a(this.P0);
            this.R0 = true;
        }
        a(j);
    }

    @Override // yads.fo
    public final String c() {
        return "MediaCodecVideoRenderer";
    }

    @Override // yads.gk1, yads.fo
    public final boolean f() {
        td2 td2Var;
        if (super.f() && (this.T0 || (((td2Var = this.Q0) != null && this.P0 == td2Var) || this.K == null || this.l1))) {
            this.X0 = -9223372036854775807L;
            return true;
        }
        if (this.X0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.X0) {
            return true;
        }
        this.X0 = -9223372036854775807L;
        return false;
    }

    @Override // yads.fo
    public final void g() {
        this.k1 = null;
        y();
        this.R0 = false;
        this.n1 = null;
        try {
            this.B = null;
            this.C0 = -9223372036854775807L;
            this.D0 = -9223372036854775807L;
            this.E0 = 0;
            o();
        } finally {
            this.I0.a(this.B0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.fo
    public final void h() {
        try {
            try {
                this.m0 = false;
                this.u.b();
                this.t.b();
                this.l0 = false;
                this.k0 = false;
                t();
            } finally {
                um0.a(this.E, null);
                this.E = null;
            }
        } finally {
            td2 td2Var = this.Q0;
            if (td2Var != null) {
                if (this.P0 == td2Var) {
                    this.P0 = null;
                }
                td2Var.release();
                this.Q0 = null;
            }
        }
    }

    @Override // yads.fo
    public final void i() {
        this.Z0 = 0;
        this.Y0 = SystemClock.elapsedRealtime();
        this.d1 = SystemClock.elapsedRealtime() * 1000;
        this.e1 = 0L;
        this.f1 = 0;
        this.H0.a();
    }

    @Override // yads.fo
    public final void j() {
        Surface surface;
        this.X0 = -9223372036854775807L;
        if (this.Z0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.I0.a(this.Z0, elapsedRealtime - this.Y0);
            this.Z0 = 0;
            this.Y0 = elapsedRealtime;
        }
        int i = this.f1;
        if (i != 0) {
            this.I0.c(i, this.e1);
            this.e1 = 0L;
            this.f1 = 0;
        }
        ei3 ei3Var = this.H0;
        ei3Var.d = false;
        ai3 ai3Var = ei3Var.b;
        if (ai3Var != null) {
            ai3Var.a();
            di3 di3Var = ei3Var.c;
            di3Var.getClass();
            di3Var.c.sendEmptyMessage(2);
        }
        if (sb3.a < 30 || (surface = ei3Var.e) == null || ei3Var.j == Integer.MIN_VALUE || ei3Var.h == 0.0f) {
            return;
        }
        ei3Var.h = 0.0f;
        yh3.a(surface, 0.0f);
    }

    @Override // yads.gk1
    public final boolean p() {
        return this.l1 && sb3.a < 23;
    }

    @Override // yads.gk1
    public final void r() {
        y();
    }

    @Override // yads.gk1
    public final void v() {
        super.v();
        this.b1 = 0;
    }

    public final void y() {
        xj1 xj1Var;
        this.T0 = false;
        if (sb3.a < 23 || !this.l1 || (xj1Var = this.K) == null) {
            return;
        }
        this.n1 = new uk1(this, xj1Var);
    }

    public final void c(long j) {
        cb0 cb0Var = this.B0;
        cb0Var.k += j;
        cb0Var.l++;
        this.e1 += j;
        this.f1++;
    }

    public final boolean b(ck1 ck1Var) {
        boolean z;
        int i;
        if (sb3.a < 23 || this.l1 || b(ck1Var.a)) {
            return false;
        }
        if (ck1Var.f) {
            Context context = this.G0;
            synchronized (td2.class) {
                try {
                    if (!td2.f) {
                        if (uy0.a(context)) {
                            i = uy0.c() ? 1 : 2;
                        } else {
                            i = 0;
                        }
                        td2.e = i;
                        td2.f = true;
                    }
                    z = td2.e != 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static int b(jw0 jw0Var, ck1 ck1Var) {
        if (jw0Var.n != -1) {
            int size = jw0Var.o.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += ((byte[]) jw0Var.o.get(i2)).length;
            }
            return jw0Var.n + i;
        }
        return a(jw0Var, ck1Var);
    }

    public static boolean b(String str) {
        if (str.startsWith(tk2.f.c1())) {
            return false;
        }
        synchronized (vk1.class) {
            try {
                if (!q1) {
                    r1 = z();
                    q1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r1;
    }

    @Override // yads.gk1
    public final int a(ik1 ik1Var, jw0 jw0Var) {
        boolean z;
        int i = 0;
        if (!"video".equals(vt1.c(jw0Var.m))) {
            return fo.a(0, 0, 0);
        }
        boolean z2 = jw0Var.p != null;
        l41 a = a(ik1Var, jw0Var, z2, false);
        if (z2 && a.isEmpty()) {
            a = a(ik1Var, jw0Var, false, false);
        }
        if (a.isEmpty()) {
            return fo.a(1, 0, 0);
        }
        int i2 = jw0Var.F;
        if (i2 != 0 && i2 != 2) {
            return fo.a(2, 0, 0);
        }
        ck1 ck1Var = (ck1) a.get(0);
        boolean a2 = ck1Var.a(jw0Var);
        if (!a2) {
            for (int i3 = 1; i3 < a.size(); i3++) {
                ck1 ck1Var2 = (ck1) a.get(i3);
                if (ck1Var2.a(jw0Var)) {
                    z = false;
                    a2 = true;
                    ck1Var = ck1Var2;
                    break;
                }
            }
        }
        z = true;
        int i4 = a2 ? 4 : 3;
        int i5 = ck1Var.b(jw0Var) ? 16 : 8;
        int i6 = ck1Var.g ? 64 : 0;
        int i7 = z ? 128 : 0;
        if (a2) {
            l41 a3 = a(ik1Var, jw0Var, z2, true);
            if (!a3.isEmpty()) {
                ck1 ck1Var3 = (ck1) qk1.a(a3, jw0Var).get(0);
                if (ck1Var3.a(jw0Var) && ck1Var3.b(jw0Var)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // yads.gk1
    public final ArrayList a(ik1 ik1Var, jw0 jw0Var, boolean z) {
        return qk1.a(a(ik1Var, jw0Var, z, this.l1), jw0Var);
    }

    public static l41 a(ik1 ik1Var, jw0 jw0Var, boolean z, boolean z2) {
        String str = jw0Var.m;
        if (str == null) {
            i41 i41Var = l41.c;
            return um2.f;
        }
        List a = ik1Var.a(str, z, z2);
        String a2 = qk1.a(jw0Var);
        if (a2 == null) {
            return l41.a(a);
        }
        List a3 = ik1Var.a(a2, z, z2);
        i41 i41Var2 = l41.c;
        return new h41().a(a).a(a3).a();
    }

    @Override // yads.gk1, yads.fo
    public final void a(long j, boolean z) {
        super.a(j, z);
        y();
        ei3 ei3Var = this.H0;
        ei3Var.m = 0L;
        ei3Var.p = -1L;
        ei3Var.n = -1L;
        this.c1 = -9223372036854775807L;
        this.W0 = -9223372036854775807L;
        this.a1 = 0;
        if (z) {
            this.X0 = this.J0 > 0 ? SystemClock.elapsedRealtime() + this.J0 : -9223372036854775807L;
        } else {
            this.X0 = -9223372036854775807L;
        }
    }

    @Override // yads.fo, yads.hf2
    public final void a(int i, Object obj) {
        boolean z;
        int i2;
        if (i != 1) {
            if (i == 7) {
                this.o1 = (xh3) obj;
                return;
            }
            if (i == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.m1 != intValue) {
                    this.m1 = intValue;
                    if (this.l1) {
                        t();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 4) {
                int intValue2 = ((Integer) obj).intValue();
                this.S0 = intValue2;
                xj1 xj1Var = this.K;
                if (xj1Var != null) {
                    xj1Var.a(intValue2);
                    return;
                }
                return;
            }
            if (i != 5) {
                return;
            }
            ei3 ei3Var = this.H0;
            int intValue3 = ((Integer) obj).intValue();
            if (ei3Var.j == intValue3) {
                return;
            }
            ei3Var.j = intValue3;
            ei3Var.a(true);
            return;
        }
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = surface;
        if (surface == null) {
            td2 td2Var = this.Q0;
            if (td2Var != null) {
                surface2 = td2Var;
            } else {
                ck1 ck1Var = this.R;
                surface2 = surface;
                if (ck1Var != null) {
                    surface2 = surface;
                    if (b(ck1Var)) {
                        Context context = this.G0;
                        boolean z2 = ck1Var.f;
                        int i3 = td2.e;
                        if (z2) {
                            synchronized (td2.class) {
                                try {
                                    if (!td2.f) {
                                        if (uy0.a(context)) {
                                            i2 = uy0.c() ? 1 : 2;
                                        } else {
                                            i2 = 0;
                                        }
                                        td2.e = i2;
                                        td2.f = true;
                                    }
                                    z = td2.e != 0;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (!z) {
                                throw new IllegalStateException();
                            }
                        }
                        td2 a = new sd2().a(z2 ? td2.e : 0);
                        this.Q0 = a;
                        surface2 = a;
                    }
                }
            }
        }
        if (this.P0 != surface2) {
            this.P0 = surface2;
            ei3 ei3Var2 = this.H0;
            ei3Var2.getClass();
            Surface surface3 = surface2 instanceof td2 ? null : surface2;
            Surface surface4 = ei3Var2.e;
            if (surface4 != surface3) {
                if (sb3.a >= 30 && surface4 != null && ei3Var2.j != Integer.MIN_VALUE && ei3Var2.h != 0.0f) {
                    ei3Var2.h = 0.0f;
                    yh3.a(surface4, 0.0f);
                }
                ei3Var2.e = surface3;
                ei3Var2.a(true);
            }
            this.R0 = false;
            int i4 = this.g;
            xj1 xj1Var2 = this.K;
            if (xj1Var2 != null) {
                if (sb3.a >= 23 && surface2 != null && !this.N0) {
                    xj1Var2.a(surface2);
                } else {
                    t();
                    q();
                }
            }
            if (surface2 != null && surface2 != this.Q0) {
                mj3 mj3Var = this.k1;
                if (mj3Var != null) {
                    this.I0.b(mj3Var);
                }
                y();
                if (i4 == 2) {
                    this.X0 = this.J0 > 0 ? SystemClock.elapsedRealtime() + this.J0 : -9223372036854775807L;
                    return;
                }
                return;
            }
            this.k1 = null;
            y();
            return;
        }
        if (surface2 == null || surface2 == this.Q0) {
            return;
        }
        mj3 mj3Var2 = this.k1;
        if (mj3Var2 != null) {
            this.I0.b(mj3Var2);
        }
        if (this.R0) {
            this.I0.a(this.P0);
        }
    }

    @Override // yads.gk1
    public final void a(jw0 jw0Var, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        xj1 xj1Var = this.K;
        if (xj1Var != null) {
            xj1Var.a(this.S0);
        }
        if (this.l1) {
            this.g1 = jw0Var.r;
            this.h1 = jw0Var.s;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.g1 = integer;
            if (z) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.h1 = integer2;
        }
        float f = jw0Var.v;
        this.j1 = f;
        if (sb3.a >= 21) {
            int i = jw0Var.u;
            if (i == 90 || i == 270) {
                int i2 = this.g1;
                this.g1 = this.h1;
                this.h1 = i2;
                this.j1 = 1.0f / f;
            }
        } else {
            this.i1 = jw0Var.u;
        }
        ei3 ei3Var = this.H0;
        ei3Var.f = jw0Var.t;
        hu0 hu0Var = ei3Var.a;
        gu0 gu0Var = hu0Var.a;
        gu0Var.d = 0L;
        gu0Var.e = 0L;
        gu0Var.f = 0L;
        gu0Var.h = 0;
        Arrays.fill(gu0Var.g, false);
        gu0 gu0Var2 = hu0Var.b;
        gu0Var2.d = 0L;
        gu0Var2.e = 0L;
        gu0Var2.f = 0L;
        gu0Var2.h = 0;
        Arrays.fill(gu0Var2.g, false);
        hu0Var.c = false;
        hu0Var.d = -9223372036854775807L;
        hu0Var.e = 0;
        ei3Var.b();
    }

    @Override // yads.fo
    public final void a(boolean z) {
        this.B0 = new cb0();
        on2 on2Var = this.d;
        on2Var.getClass();
        boolean z2 = on2Var.a;
        if (z2 && this.m1 == 0) {
            throw new IllegalStateException();
        }
        if (this.l1 != z2) {
            this.l1 = z2;
            t();
        }
        this.I0.b(this.B0);
        this.U0 = z;
        this.V0 = false;
    }

    @Override // yads.gk1
    public final boolean a(ck1 ck1Var) {
        return this.P0 != null || b(ck1Var);
    }

    @Override // yads.gk1
    public final uj1 a(ck1 ck1Var, jw0 jw0Var, MediaCrypto mediaCrypto, float f) {
        tk1 tk1Var;
        Point point;
        int i;
        int[] iArr;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z;
        int i2;
        int i3;
        int i4;
        Pair b;
        int a;
        int i5 = 1;
        td2 td2Var = this.Q0;
        if (td2Var != null && td2Var.b != ck1Var.f) {
            if (this.P0 == td2Var) {
                this.P0 = null;
            }
            td2Var.release();
            this.Q0 = null;
        }
        String str = ck1Var.c;
        jw0[] jw0VarArr = this.i;
        jw0VarArr.getClass();
        int i6 = jw0Var.r;
        int i7 = jw0Var.s;
        int b2 = b(jw0Var, ck1Var);
        if (jw0VarArr.length == 1) {
            if (b2 != -1 && (a = a(jw0Var, ck1Var)) != -1) {
                b2 = Math.min((int) (b2 * 1.5f), a);
            }
            tk1Var = new tk1(i6, i7, b2);
        } else {
            int length = jw0VarArr.length;
            boolean z2 = false;
            for (int i8 = 0; i8 < length; i8 += i5) {
                jw0 jw0Var2 = jw0VarArr[i8];
                if (jw0Var.y != null && jw0Var2.y == null) {
                    iw0 iw0Var = new iw0(jw0Var2);
                    iw0Var.w = jw0Var.y;
                    jw0Var2 = new jw0(iw0Var);
                }
                if (ck1Var.a(jw0Var, jw0Var2).d != 0) {
                    int i9 = jw0Var2.r;
                    z2 |= i9 == -1 || jw0Var2.s == -1;
                    int max = Math.max(i6, i9);
                    int max2 = Math.max(i7, jw0Var2.s);
                    b2 = Math.max(b2, b(jw0Var2, ck1Var));
                    i7 = max2;
                    i6 = max;
                    i5 = 1;
                }
            }
            if (z2) {
                gh1.d("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i6 + VastAttributes.HORIZONTAL_POSITION + i7);
                int i10 = jw0Var.s;
                int i11 = jw0Var.r;
                boolean z3 = i10 > i11;
                int i12 = z3 ? i10 : i11;
                if (z3) {
                    i10 = i11;
                }
                float f2 = i10 / i12;
                int[] iArr2 = p1;
                int i13 = 0;
                while (i13 < 9) {
                    int i14 = iArr2[i13];
                    int i15 = (int) (i14 * f2);
                    if (i14 <= i12 || i15 <= i10) {
                        break;
                    }
                    int i16 = i10;
                    float f3 = f2;
                    if (sb3.a >= 21) {
                        int i17 = z3 ? i15 : i14;
                        if (!z3) {
                            i14 = i15;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = ck1Var.d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            i = i12;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            i = i12;
                            point2 = new Point((((i17 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i14 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
                        }
                        Point point3 = point2;
                        iArr = iArr2;
                        if (ck1Var.a(point2.x, point2.y, jw0Var.t)) {
                            point = point3;
                            break;
                        }
                        i13++;
                        i10 = i16;
                        f2 = f3;
                        i12 = i;
                        iArr2 = iArr;
                    } else {
                        i = i12;
                        iArr = iArr2;
                        try {
                            int i18 = ((i14 + 15) / 16) * 16;
                            int i19 = ((i15 + 15) / 16) * 16;
                            if (i18 * i19 <= qk1.a()) {
                                int i20 = z3 ? i19 : i18;
                                if (!z3) {
                                    i18 = i19;
                                }
                                point = new Point(i20, i18);
                            }
                            i13++;
                            i10 = i16;
                            f2 = f3;
                            i12 = i;
                            iArr2 = iArr;
                        } catch (lk1 unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i6 = Math.max(i6, point.x);
                    i7 = Math.max(i7, point.y);
                    iw0 iw0Var2 = new iw0(jw0Var);
                    iw0Var2.p = i6;
                    iw0Var2.q = i7;
                    b2 = Math.max(b2, a(new jw0(iw0Var2), ck1Var));
                    gh1.d("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i6 + VastAttributes.HORIZONTAL_POSITION + i7);
                }
            }
            tk1Var = new tk1(i6, i7, b2);
        }
        this.M0 = tk1Var;
        boolean z4 = this.L0;
        int i21 = this.l1 ? this.m1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", jw0Var.r);
        mediaFormat.setInteger("height", jw0Var.s);
        List list = jw0Var.o;
        for (int i22 = 0; i22 < list.size(); i22++) {
            mediaFormat.setByteBuffer(gg2.a(i22, "csd-"), ByteBuffer.wrap((byte[]) list.get(i22)));
        }
        float f4 = jw0Var.t;
        if (f4 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f4);
        }
        kl1.a(mediaFormat, "rotation-degrees", jw0Var.u);
        fx fxVar = jw0Var.y;
        if (fxVar != null) {
            kl1.a(mediaFormat, "color-transfer", fxVar.d);
            kl1.a(mediaFormat, "color-standard", fxVar.b);
            kl1.a(mediaFormat, "color-range", fxVar.c);
            byte[] bArr = fxVar.e;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(jw0Var.m) && (b = qk1.b(jw0Var)) != null) {
            kl1.a(mediaFormat, Scopes.PROFILE, ((Integer) b.first).intValue());
        }
        mediaFormat.setInteger("max-width", tk1Var.a);
        mediaFormat.setInteger("max-height", tk1Var.b);
        kl1.a(mediaFormat, "max-input-size", tk1Var.c);
        if (sb3.a >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z4) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            i2 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
            i2 = 0;
        }
        if (i21 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i21);
        }
        if (this.P0 == null) {
            if (b(ck1Var)) {
                if (this.Q0 == null) {
                    Context context = this.G0;
                    boolean z5 = ck1Var.f;
                    int i23 = td2.e;
                    if (z5) {
                        synchronized (td2.class) {
                            try {
                                if (td2.f) {
                                    i3 = 1;
                                } else {
                                    if (uy0.a(context)) {
                                        i4 = uy0.c() ? 1 : 2;
                                    } else {
                                        i4 = i2;
                                    }
                                    td2.e = i4;
                                    i3 = 1;
                                    td2.f = true;
                                }
                                if (td2.e == 0) {
                                    i3 = i2;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (i3 == 0) {
                            throw new IllegalStateException();
                        }
                    }
                    this.Q0 = new sd2().a(z5 ? td2.e : i2);
                }
                this.P0 = this.Q0;
            } else {
                throw new IllegalStateException();
            }
        }
        return new uj1(ck1Var, mediaFormat, jw0Var, this.P0, mediaCrypto);
    }

    @Override // yads.gk1, yads.fo
    public final void a(float f, float f2) {
        this.I = f;
        this.J = f2;
        c(this.L);
        ei3 ei3Var = this.H0;
        ei3Var.i = f;
        ei3Var.m = 0L;
        ei3Var.p = -1L;
        ei3Var.n = -1L;
        ei3Var.a(false);
    }

    @Override // yads.gk1
    public final hb0 a(ck1 ck1Var, jw0 jw0Var, jw0 jw0Var2) {
        hb0 a = ck1Var.a(jw0Var, jw0Var2);
        int i = a.e;
        int i2 = jw0Var2.r;
        tk1 tk1Var = this.M0;
        if (i2 > tk1Var.a || jw0Var2.s > tk1Var.b) {
            i |= 256;
        }
        if (b(jw0Var2, ck1Var) > this.M0.c) {
            i |= 64;
        }
        int i3 = i;
        return new hb0(ck1Var.a, jw0Var, jw0Var2, i3 != 0 ? 0 : a.d, i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007b, code lost:
    
        if (r9.equals("video/av01") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(jw0 jw0Var, ck1 ck1Var) {
        int i;
        int intValue;
        int i2 = 4;
        char c = 1;
        int i3 = jw0Var.r;
        int i4 = jw0Var.s;
        if (i3 == -1 || i4 == -1) {
            return -1;
        }
        String str = jw0Var.m;
        if ("video/dolby-vision".equals(str)) {
            Pair b = qk1.b(jw0Var);
            str = (b == null || !((intValue = ((Integer) b.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662735862:
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 3:
            case 5:
                i = i4 * i3;
                i2 = 2;
                break;
            case 2:
            case 6:
                i = i4 * i3;
                break;
            case 4:
                wk1 wk1Var = tk2.f;
                String x = wk1Var.x();
                String str2 = sb3.d;
                if (!x.equals(str2) && (!wk1Var.q().equals(sb3.c) || (!wk1Var.J0().equals(str2) && (!wk1Var.p().equals(str2) || !ck1Var.f)))) {
                    i = ((i4 + 15) / 16) * ((i3 + 15) / 16) * 256;
                    i2 = 2;
                    break;
                }
                break;
        }
        return -1;
    }

    @Override // yads.gk1
    public final float a(float f, jw0[] jw0VarArr) {
        float f2 = -1.0f;
        for (jw0 jw0Var : jw0VarArr) {
            float f3 = jw0Var.t;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // yads.gk1
    public final void a(String str, long j, long j2) {
        this.I0.a(str, j, j2);
        this.N0 = b(str);
        ck1 ck1Var = this.R;
        ck1Var.getClass();
        this.O0 = ck1Var.a();
        if (sb3.a < 23 || !this.l1) {
            return;
        }
        xj1 xj1Var = this.K;
        xj1Var.getClass();
        this.n1 = new uk1(this, xj1Var);
    }

    @Override // yads.gk1
    public final void a(String str) {
        this.I0.a(str);
    }

    @Override // yads.gk1
    public final void a(Exception exc) {
        gh1.b("MediaCodecVideoRenderer", gh1.a("Video codec error", exc));
        this.I0.b(exc);
    }

    @Override // yads.gk1
    public final hb0 a(kw0 kw0Var) {
        hb0 a = super.a(kw0Var);
        this.I0.a(kw0Var.b, a);
        return a;
    }

    @Override // yads.gk1
    public final void a(fb0 fb0Var) {
        if (this.O0) {
            ByteBuffer byteBuffer = fb0Var.g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    xj1 xj1Var = this.K;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    xj1Var.a(bundle);
                }
            }
        }
    }

    @Override // yads.gk1
    public final void a(long j) {
        super.a(j);
        if (this.l1) {
            return;
        }
        this.b1--;
    }

    @Override // yads.gk1
    public final bk1 a(IllegalStateException illegalStateException, ck1 ck1Var) {
        return new sk1(illegalStateException, ck1Var, this.P0);
    }
}
