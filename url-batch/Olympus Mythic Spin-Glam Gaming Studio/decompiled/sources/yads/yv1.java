package yads;

import android.util.Pair;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class yv1 implements tp0, mx2 {
    public int i;
    public long j;
    public int k;
    public xb2 l;
    public int n;
    public int o;
    public int p;
    public long[][] s;
    public int t;
    public long u;
    public int v;
    public int h = 0;
    public final sx2 f = new sx2();
    public final ArrayList g = new ArrayList();
    public final xb2 d = new xb2(16);
    public final ArrayDeque e = new ArrayDeque();
    public final xb2 a = new xb2(py1.a);
    public final xb2 b = new xb2(4);
    public final xb2 c = new xb2();
    public int m = -1;
    public wp0 q = wp0.a;
    public xv1[] r = new xv1[0];

    static {
        new yp0() { // from class: yads.yv1$$ExternalSyntheticLambda0
            @Override // yads.yp0
            public final tp0[] a() {
                return yv1.d();
            }
        };
    }

    public static /* synthetic */ u73 a(u73 u73Var) {
        return u73Var;
    }

    public static tp0[] d() {
        return new tp0[]{new yv1()};
    }

    @Override // yads.tp0
    public final boolean a(up0 up0Var) {
        return e23.a(up0Var, false, false);
    }

    @Override // yads.mx2
    public final boolean b() {
        return true;
    }

    @Override // yads.mx2
    public final long c() {
        return this.u;
    }

    @Override // yads.tp0
    public final void release() {
    }

    @Override // yads.tp0
    public final void a(wp0 wp0Var) {
        this.q = wp0Var;
    }

    @Override // yads.mx2
    public final kx2 b(long j) {
        long j2;
        long j3;
        long j4;
        boolean z;
        long j5;
        int a;
        long j6 = j;
        xv1[] xv1VarArr = this.r;
        if (xv1VarArr.length == 0) {
            ox2 ox2Var = ox2.c;
            return new kx2(ox2Var, ox2Var);
        }
        int i = this.t;
        boolean z2 = false;
        if (i != -1) {
            d83 d83Var = xv1VarArr[i].b;
            int b = sb3.b(d83Var.f, j6, false);
            while (true) {
                if (b < 0) {
                    b = -1;
                    break;
                }
                if ((d83Var.g[b] & 1) != 0) {
                    break;
                }
                b--;
            }
            if (b == -1) {
                b = d83Var.a(j6);
            }
            if (b == -1) {
                ox2 ox2Var2 = ox2.c;
                return new kx2(ox2Var2, ox2Var2);
            }
            long j7 = d83Var.f[b];
            j2 = d83Var.c[b];
            if (j7 >= j6 || b >= d83Var.b - 1 || (a = d83Var.a(j6)) == -1 || a == b) {
                j5 = -1;
                j4 = -9223372036854775807L;
            } else {
                j4 = d83Var.f[a];
                j5 = d83Var.c[a];
            }
            j3 = j5;
            j6 = j7;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            xv1[] xv1VarArr2 = this.r;
            if (i2 >= xv1VarArr2.length) {
                break;
            }
            if (i2 != this.t) {
                d83 d83Var2 = xv1VarArr2[i2].b;
                int b2 = sb3.b(d83Var2.f, j6, z2);
                while (true) {
                    if (b2 < 0) {
                        b2 = -1;
                        break;
                    }
                    if ((d83Var2.g[b2] & 1) != 0) {
                        break;
                    }
                    b2--;
                }
                if (b2 == -1) {
                    b2 = d83Var2.a(j6);
                }
                if (b2 != -1) {
                    j2 = Math.min(d83Var2.c[b2], j2);
                }
                if (j4 != -9223372036854775807L) {
                    z = false;
                    int b3 = sb3.b(d83Var2.f, j4, false);
                    while (true) {
                        if (b3 < 0) {
                            b3 = -1;
                            break;
                        }
                        if ((d83Var2.g[b3] & 1) != 0) {
                            break;
                        }
                        b3--;
                    }
                    if (b3 == -1) {
                        b3 = d83Var2.a(j4);
                    }
                    if (b3 != -1) {
                        j3 = Math.min(d83Var2.c[b3], j3);
                    }
                } else {
                    z = false;
                }
            } else {
                z = z2;
            }
            i2++;
            z2 = z;
        }
        ox2 ox2Var3 = new ox2(j6, j2);
        return j4 == -9223372036854775807L ? new kx2(ox2Var3, ox2Var3) : new kx2(ox2Var3, new ox2(j4, j3));
    }

    public final void c(long j) {
        while (!this.e.isEmpty() && ((wi) this.e.peek()).b == j) {
            wi wiVar = (wi) this.e.pop();
            if (wiVar.a == 1836019574) {
                a(wiVar);
                this.e.clear();
                this.h = 2;
            } else if (!this.e.isEmpty()) {
                ((wi) this.e.peek()).d.add(wiVar);
            }
        }
        if (this.h != 2) {
            this.h = 0;
            this.k = 0;
        }
    }

    @Override // yads.tp0
    public final void a(long j, long j2) {
        this.e.clear();
        this.k = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        if (j == 0) {
            if (this.h != 3) {
                this.h = 0;
                this.k = 0;
                return;
            } else {
                sx2 sx2Var = this.f;
                sx2Var.a.clear();
                sx2Var.b = 0;
                this.g.clear();
                return;
            }
        }
        for (xv1 xv1Var : this.r) {
            d83 d83Var = xv1Var.b;
            int b = sb3.b(d83Var.f, j2, false);
            while (true) {
                if (b < 0) {
                    b = -1;
                    break;
                } else if ((d83Var.g[b] & 1) != 0) {
                    break;
                } else {
                    b--;
                }
            }
            if (b == -1) {
                b = d83Var.a(j2);
            }
            xv1Var.e = b;
            o93 o93Var = xv1Var.d;
            if (o93Var != null) {
                o93Var.b = false;
                o93Var.c = 0;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x054a  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v34 */
    @Override // yads.tp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(up0 up0Var, dg2 dg2Var) {
        int i;
        wi wiVar;
        int i2;
        char c;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        char c2;
        boolean z3;
        int i5;
        int i6 = 3;
        int i7 = 0;
        char c3 = 7;
        int i8 = 2;
        int i9 = 8;
        while (true) {
            ?? r14 = 1;
            while (true) {
                int i10 = this.h;
                if (i10 != 0) {
                    if (i10 != r14) {
                        if (i10 == i8) {
                            long f = up0Var.f();
                            if (this.m == -1) {
                                int i11 = i7;
                                boolean z4 = r14;
                                boolean z5 = z4;
                                int i12 = -1;
                                int i13 = -1;
                                long j = Long.MAX_VALUE;
                                long j2 = Long.MAX_VALUE;
                                long j3 = Long.MAX_VALUE;
                                while (true) {
                                    xv1[] xv1VarArr = this.r;
                                    if (i11 >= xv1VarArr.length) {
                                        break;
                                    }
                                    xv1 xv1Var = xv1VarArr[i11];
                                    int i14 = xv1Var.e;
                                    d83 d83Var = xv1Var.b;
                                    if (i14 != d83Var.b) {
                                        long j4 = d83Var.c[i14];
                                        long[][] jArr = this.s;
                                        int i15 = sb3.a;
                                        long j5 = jArr[i11][i14];
                                        long j6 = j4 - f;
                                        boolean z6 = j6 < 0 || j6 >= 262144;
                                        if ((!z6 && z4) || (z6 == z4 && j6 < j3)) {
                                            z4 = z6;
                                            i13 = i11;
                                            j3 = j6;
                                            j2 = j5;
                                        }
                                        if (j5 < j) {
                                            z5 = z6;
                                            i12 = i11;
                                            j = j5;
                                        }
                                    }
                                    i11++;
                                }
                                if (j == Long.MAX_VALUE || !z5 || j2 < j + 10485760) {
                                    i12 = i13;
                                }
                                this.m = i12;
                                if (i12 == -1) {
                                    return -1;
                                }
                            }
                            xv1 xv1Var2 = this.r[this.m];
                            c83 c83Var = xv1Var2.c;
                            int i16 = xv1Var2.e;
                            d83 d83Var2 = xv1Var2.b;
                            long j7 = d83Var2.c[i16];
                            int i17 = d83Var2.d[i16];
                            o93 o93Var = xv1Var2.d;
                            long j8 = (j7 - f) + this.n;
                            if (j8 >= 0 && j8 < 262144) {
                                if (xv1Var2.a.g == 1) {
                                    j8 += 8;
                                    i17 -= 8;
                                }
                                up0Var.a((int) j8);
                                u73 u73Var = xv1Var2.a;
                                int i18 = u73Var.j;
                                if (i18 != 0) {
                                    byte[] bArr = this.b.a;
                                    bArr[0] = 0;
                                    bArr[1] = 0;
                                    bArr[2] = 0;
                                    int i19 = 4 - i18;
                                    while (this.o < i17) {
                                        int i20 = this.p;
                                        if (i20 == 0) {
                                            up0Var.b(bArr, i19, i18);
                                            this.n += i18;
                                            this.b.e(0);
                                            int a = this.b.a();
                                            if (a >= 0) {
                                                this.p = a;
                                                this.a.e(0);
                                                c83Var.a(4, this.a);
                                                this.o += 4;
                                                i17 += i19;
                                            } else {
                                                throw new cc2("Invalid NAL length", null, true, 1);
                                            }
                                        } else {
                                            int a2 = c83Var.a(up0Var, i20, false);
                                            this.n += a2;
                                            this.o += a2;
                                            this.p -= a2;
                                        }
                                    }
                                } else {
                                    if ("audio/ac4".equals(u73Var.f.m)) {
                                        if (this.o == 0) {
                                            i0.a(i17, this.c);
                                            i3 = 7;
                                            c83Var.a(7, this.c);
                                            this.o += 7;
                                        } else {
                                            i3 = 7;
                                        }
                                        i17 += i3;
                                    } else if (o93Var != null) {
                                        o93Var.a(up0Var);
                                    }
                                    while (true) {
                                        int i21 = this.o;
                                        if (i21 >= i17) {
                                            break;
                                        }
                                        int a3 = c83Var.a(up0Var, i17 - i21, false);
                                        this.n += a3;
                                        this.o += a3;
                                        this.p -= a3;
                                    }
                                }
                                int i22 = i17;
                                d83 d83Var3 = xv1Var2.b;
                                long j9 = d83Var3.f[i16];
                                int i23 = d83Var3.g[i16];
                                if (o93Var != null) {
                                    o93Var.a(c83Var, j9, i23, i22, 0, null);
                                    if (i16 + 1 == xv1Var2.b.b && o93Var.c > 0) {
                                        c83Var.a(o93Var.d, o93Var.e, o93Var.f, o93Var.g, null);
                                        o93Var.c = 0;
                                    }
                                } else {
                                    c83Var.a(j9, i23, i22, 0, null);
                                }
                                xv1Var2.e++;
                                this.m = -1;
                                this.n = 0;
                                this.o = 0;
                                this.p = 0;
                                return 0;
                            }
                            dg2Var.a = j7;
                            return 1;
                        }
                        if (i10 != i6) {
                            throw new IllegalStateException();
                        }
                        sx2 sx2Var = this.f;
                        ArrayList arrayList = this.g;
                        int i24 = sx2Var.b;
                        if (i24 == 0) {
                            long a4 = up0Var.a();
                            dg2Var.a = (a4 == -1 || a4 < 8) ? 0L : a4 - 8;
                            sx2Var.b = r14;
                        } else if (i24 == r14) {
                            xb2 xb2Var = new xb2(8);
                            up0Var.b(xb2Var.a, i7, 8);
                            sx2Var.c = xb2Var.c() + 8;
                            if (xb2Var.a() != 1397048916) {
                                dg2Var.a = 0L;
                            } else {
                                dg2Var.a = up0Var.f() - (sx2Var.c - 12);
                                sx2Var.b = 2;
                            }
                        } else if (i24 != i8) {
                            if (i24 != i6) {
                                throw new IllegalStateException();
                            }
                            long f2 = up0Var.f();
                            int a5 = (int) ((up0Var.a() - up0Var.f()) - sx2Var.c);
                            byte[] bArr2 = new byte[a5];
                            up0Var.b(bArr2, i7, a5);
                            int i25 = i7;
                            while (i25 < sx2Var.a.size()) {
                                rx2 rx2Var = (rx2) sx2Var.a.get(i25);
                                int i26 = (int) (rx2Var.a - f2);
                                if (i26 < 0 || i26 > a5) {
                                    throw new IllegalArgumentException();
                                }
                                int i27 = i26 + 4;
                                if (i27 >= 0 && i27 <= a5) {
                                    int i28 = i26 + 7;
                                    int i29 = (bArr2[i27] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr2[i26 + 5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i9) | ((bArr2[i26 + 6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
                                    int i30 = i26 + i9;
                                    int i31 = i29 | ((bArr2[i28] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
                                    Charset charset = zt.c;
                                    String str = new String(bArr2, i30, i31, charset);
                                    int i32 = i30 + i31;
                                    switch (str.hashCode()) {
                                        case -1711564334:
                                            if (str.equals("SlowMotion_Data")) {
                                                i4 = i7;
                                                break;
                                            }
                                            i4 = -1;
                                            break;
                                        case -1332107749:
                                            if (str.equals("Super_SlowMotion_Edit_Data")) {
                                                i4 = r14;
                                                break;
                                            }
                                            i4 = -1;
                                            break;
                                        case -1251387154:
                                            if (str.equals("Super_SlowMotion_Data")) {
                                                i4 = 2;
                                                break;
                                            }
                                            i4 = -1;
                                            break;
                                        case -830665521:
                                            if (str.equals("Super_SlowMotion_Deflickering_On")) {
                                                i4 = 3;
                                                break;
                                            }
                                            i4 = -1;
                                            break;
                                        case 1760745220:
                                            if (str.equals("Super_SlowMotion_BGM")) {
                                                i4 = 4;
                                                break;
                                            }
                                            i4 = -1;
                                            break;
                                        default:
                                            i4 = -1;
                                            break;
                                    }
                                    switch (i4) {
                                        case 0:
                                            c2 = 2192;
                                            break;
                                        case 1:
                                            c2 = 2819;
                                            break;
                                        case 2:
                                            c2 = 2816;
                                            break;
                                        case 3:
                                            c2 = 2820;
                                            break;
                                        case 4:
                                            c2 = 2817;
                                            break;
                                        default:
                                            throw new cc2("Invalid SEF name", null, r14, r14);
                                    }
                                    int i33 = rx2Var.b - (i31 + i9);
                                    if (c2 == 2192) {
                                        ArrayList arrayList2 = new ArrayList();
                                        String str2 = new String(bArr2, i32, i33, charset);
                                        h33 h33Var = sx2.e;
                                        h33Var.getClass();
                                        g33 g33Var = h33Var.b;
                                        g33Var.getClass();
                                        f33 f33Var = new f33(g33Var, h33Var, str2);
                                        ArrayList arrayList3 = new ArrayList();
                                        while (f33Var.hasNext()) {
                                            arrayList3.add((String) f33Var.next());
                                        }
                                        List unmodifiableList = Collections.unmodifiableList(arrayList3);
                                        for (int i34 = i7; i34 < unmodifiableList.size(); i34 += r14) {
                                            h33 h33Var2 = sx2.d;
                                            CharSequence charSequence = (CharSequence) unmodifiableList.get(i34);
                                            h33Var2.getClass();
                                            charSequence.getClass();
                                            g33 g33Var2 = h33Var2.b;
                                            g33Var2.getClass();
                                            f33 f33Var2 = new f33(g33Var2, h33Var2, charSequence);
                                            ArrayList arrayList4 = new ArrayList();
                                            while (f33Var2.hasNext()) {
                                                arrayList4.add((String) f33Var2.next());
                                            }
                                            List unmodifiableList2 = Collections.unmodifiableList(arrayList4);
                                            if (unmodifiableList2.size() == 3) {
                                                try {
                                                    arrayList2.add(new o13(r14 << (Integer.parseInt((String) unmodifiableList2.get(2)) - r14), Long.parseLong((String) unmodifiableList2.get(i7)), Long.parseLong((String) unmodifiableList2.get(r14))));
                                                } catch (NumberFormatException e) {
                                                    throw new cc2(null, e, r14, r14);
                                                }
                                            } else {
                                                throw new cc2(null, null, r14, r14);
                                            }
                                        }
                                        arrayList.add(new p13(arrayList2));
                                    } else if (c2 != 2816 && c2 != 2817 && c2 != 2819 && c2 != 2820) {
                                        throw new IllegalStateException();
                                    }
                                    i25 += r14;
                                    i9 = 8;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                            dg2Var.a = 0L;
                        } else {
                            long a6 = up0Var.a();
                            int i35 = sx2Var.c - 20;
                            xb2 xb2Var2 = new xb2(i35);
                            up0Var.b(xb2Var2.a, i7, i35);
                            for (int i36 = i7; i36 < i35 / 12; i36 += r14) {
                                xb2Var2.e(xb2Var2.b + 2);
                                byte[] bArr3 = xb2Var2.a;
                                int i37 = xb2Var2.b;
                                int i38 = i37 + 1;
                                xb2Var2.b = i38;
                                int i39 = bArr3[i37] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                xb2Var2.b = i37 + 2;
                                short s = (short) (((bArr3[i38] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i39);
                                if (s != 2192 && s != 2816) {
                                    if (s != 2817) {
                                        if (s != 2819 && s != 2820) {
                                            xb2Var2.e(i37 + 10);
                                        }
                                        sx2Var.a.add(new rx2(xb2Var2.c(), (a6 - sx2Var.c) - xb2Var2.c()));
                                    } else {
                                        sx2Var.a.add(new rx2(xb2Var2.c(), (a6 - sx2Var.c) - xb2Var2.c()));
                                    }
                                }
                                sx2Var.a.add(new rx2(xb2Var2.c(), (a6 - sx2Var.c) - xb2Var2.c()));
                            }
                            if (sx2Var.a.isEmpty()) {
                                dg2Var.a = 0L;
                            } else {
                                sx2Var.b = 3;
                                dg2Var.a = ((rx2) sx2Var.a.get(i7)).a;
                            }
                        }
                        if (dg2Var.a == 0) {
                            this.h = i7;
                            this.k = i7;
                        }
                        return r14;
                    }
                    i = i6;
                    char c4 = c3;
                    long j10 = this.j - this.k;
                    long f3 = up0Var.f() + j10;
                    xb2 xb2Var3 = this.l;
                    if (xb2Var3 != null) {
                        up0Var.b(xb2Var3.a, this.k, (int) j10);
                        if (this.i == 1718909296) {
                            xb2Var3.e(8);
                            int a7 = xb2Var3.a();
                            int i40 = a7 != 1751476579 ? a7 != 1903435808 ? 0 : 1 : 2;
                            if (i40 == 0) {
                                xb2Var3.e(xb2Var3.b + 4);
                                while (true) {
                                    if (xb2Var3.c - xb2Var3.b <= 0) {
                                        i5 = 0;
                                        break;
                                    }
                                    int a8 = xb2Var3.a();
                                    i5 = a8 != 1751476579 ? a8 != 1903435808 ? 0 : 1 : 2;
                                    if (i5 != 0) {
                                        break;
                                    }
                                }
                            } else {
                                i5 = i40;
                            }
                            this.v = i5;
                        } else if (!this.e.isEmpty()) {
                            ((wi) this.e.peek()).c.add(new xi(this.i, xb2Var3));
                        }
                    } else if (j10 < 262144) {
                        up0Var.a((int) j10);
                    } else {
                        dg2Var.a = up0Var.f() + j10;
                        z3 = true;
                        c(f3);
                        if (z3) {
                            c3 = c4;
                            i7 = 0;
                            i8 = 2;
                        } else {
                            if (this.h != 2) {
                                return 1;
                            }
                            i8 = 2;
                            c3 = c4;
                            i7 = 0;
                        }
                        i9 = 8;
                        z2 = true;
                    }
                    z3 = false;
                    c(f3);
                    if (z3) {
                    }
                    i9 = 8;
                    z2 = true;
                } else {
                    i = i6;
                    char c5 = c3;
                    int i41 = i8;
                    boolean z7 = r14;
                    if (this.k == 0) {
                        if (!up0Var.a(this.d.a, 0, 8, z7)) {
                            return -1;
                        }
                        this.k = 8;
                        this.d.e(0);
                        this.j = this.d.l();
                        this.i = this.d.a();
                    }
                    long j11 = this.j;
                    if (j11 == 1) {
                        up0Var.b(this.d.a, 8, 8);
                        this.k += 8;
                        this.j = this.d.o();
                    } else if (j11 == 0) {
                        long a9 = up0Var.a();
                        if (a9 == -1 && (wiVar = (wi) this.e.peek()) != null) {
                            a9 = wiVar.b;
                        }
                        if (a9 != -1) {
                            this.j = (a9 - up0Var.f()) + this.k;
                        }
                    }
                    long j12 = this.j;
                    int i42 = this.k;
                    if (j12 >= i42) {
                        int i43 = this.i;
                        if (i43 == 1836019574 || i43 == 1953653099 || i43 == 1835297121 || i43 == 1835626086 || i43 == 1937007212 || i43 == 1701082227 || i43 == 1835365473) {
                            break;
                        }
                        if (i43 == 1835296868 || i43 == 1836476516 || i43 == 1751411826 || i43 == 1937011556 || i43 == 1937011827 || i43 == 1937011571 || i43 == 1668576371 || i43 == 1701606260 || i43 == 1937011555 || i43 == 1937011578 || i43 == 1937013298 || i43 == 1937007471 || i43 == 1668232756 || i43 == 1953196132 || i43 == 1718909296 || i43 == 1969517665 || i43 == 1801812339 || i43 == 1768715124) {
                            if (i42 != 8) {
                                throw new IllegalStateException();
                            }
                            if (j12 <= 2147483647L) {
                                xb2 xb2Var4 = new xb2((int) j12);
                                System.arraycopy(this.d.a, 0, xb2Var4.a, 0, 8);
                                this.l = xb2Var4;
                                z = true;
                                this.h = 1;
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            long f4 = up0Var.f();
                            long j13 = this.k;
                            long j14 = f4 - j13;
                            if (this.i == 1836086884) {
                                new vv1(0L, j14, -9223372036854775807L, j14 + j13, this.j - j13);
                            }
                            this.l = null;
                            z = true;
                            this.h = 1;
                        }
                        z2 = z;
                        i8 = i41;
                        c3 = c5;
                        i7 = 0;
                        i9 = 8;
                    } else {
                        throw cc2.a("Atom size less than header length (unsupported).");
                    }
                }
                i6 = i;
                r14 = z2;
            }
            long f5 = up0Var.f();
            long j15 = this.j;
            long j16 = this.k;
            long j17 = (f5 + j15) - j16;
            if (j15 == j16 || this.i != 1835365473) {
                i2 = 8;
                c = 4;
            } else {
                i2 = 8;
                this.c.c(8);
                up0Var.a(this.c.a, 0, 8);
                xb2 xb2Var5 = this.c;
                byte[] bArr4 = fj.a;
                int i44 = xb2Var5.b;
                c = 4;
                int i45 = i44 + 4;
                xb2Var5.e(i45);
                if (xb2Var5.a() != 1751411826) {
                    i44 = i45;
                }
                xb2Var5.e(i44);
                up0Var.a(this.c.b);
                up0Var.c();
            }
            this.e.push(new wi(this.i, j17));
            if (this.j == this.k) {
                c(j17);
                i9 = i2;
                i6 = 3;
                i7 = 0;
            } else {
                this.h = 0;
                this.k = 0;
                i7 = 0;
                i9 = i2;
                i6 = 3;
            }
            c3 = 7;
            i8 = 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00c5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0276, code lost:
    
        r2.e(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0279, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ba, code lost:
    
        r5 = 16777215 & r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c1, code lost:
    
        if (r5 != 6516084) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c3, code lost:
    
        r5 = yads.lt1.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01cc, code lost:
    
        if (r5 == 7233901) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d1, code lost:
    
        if (r5 != 7631467) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d8, code lost:
    
        if (r5 == 6516589) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01dd, code lost:
    
        if (r5 != 7828084) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01e4, code lost:
    
        if (r5 != 6578553) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01e6, code lost:
    
        r3 = yads.lt1.b(r4, "TDRC", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01f1, code lost:
    
        if (r5 != 4280916) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01f3, code lost:
    
        r3 = yads.lt1.b(r4, "TPE1", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01fe, code lost:
    
        if (r5 != 7630703) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0200, code lost:
    
        r3 = yads.lt1.b(r4, "TSSE", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x020b, code lost:
    
        if (r5 != 6384738) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x020d, code lost:
    
        r3 = yads.lt1.b(r4, "TALB", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0218, code lost:
    
        if (r5 != 7108978) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x021a, code lost:
    
        r3 = yads.lt1.b(r4, "USLT", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0225, code lost:
    
        if (r5 != 6776174) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0227, code lost:
    
        r3 = yads.lt1.b(r4, "TCON", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0230, code lost:
    
        if (r5 != 6779504) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0232, code lost:
    
        r3 = yads.lt1.b(r4, "TIT1", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0252, code lost:
    
        r3 = yads.lt1.b(r4, "TCOM", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x025a, code lost:
    
        r3 = yads.lt1.b(r4, "TIT2", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x027e, code lost:
    
        if (r10.isEmpty() == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0281, code lost:
    
        r10 = new yads.ht1(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        r2.e(r6);
        r6 = r6 + r13;
        r2.e(r2.b + r9);
        r10 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        r13 = r2.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (r13 >= r6) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        r13 = r2.a() + r13;
        r4 = r2.a();
        r5 = (r4 >> 24) & 255;
        r23 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (r5 == 169) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
    
        if (r5 != 253) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        if (r4 != 1735291493) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f3, code lost:
    
        if (r4 != 1684632427) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f5, code lost:
    
        r3 = yads.lt1.a(r4, "TPOS", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0115, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0265, code lost:
    
        if (r5 == null) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0267, code lost:
    
        r10.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x026a, code lost:
    
        r6 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ff, code lost:
    
        if (r4 != 1953655662) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0101, code lost:
    
        r3 = yads.lt1.a(r4, "TRCK", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010b, code lost:
    
        if (r4 != 1953329263) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010d, code lost:
    
        r3 = yads.lt1.a(r4, "TBPM", r2, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011c, code lost:
    
        if (r4 != 1668311404) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011e, code lost:
    
        r5 = yads.lt1.a(r4, "TCMP", r2, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012a, code lost:
    
        if (r4 != 1668249202) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012c, code lost:
    
        r5 = yads.lt1.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0135, code lost:
    
        if (r4 != 1631670868) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0137, code lost:
    
        r3 = yads.lt1.b(r4, "TPE2", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0141, code lost:
    
        if (r4 != 1936682605) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0143, code lost:
    
        r3 = yads.lt1.b(r4, "TSOT", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014d, code lost:
    
        if (r4 != 1936679276) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014f, code lost:
    
        r3 = yads.lt1.b(r4, "TSO2", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0159, code lost:
    
        if (r4 != 1936679282) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015b, code lost:
    
        r3 = yads.lt1.b(r4, "TSOA", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0165, code lost:
    
        if (r4 != 1936679265) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0167, code lost:
    
        r3 = yads.lt1.b(r4, "TSOP", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0171, code lost:
    
        if (r4 != 1936679791) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0173, code lost:
    
        r3 = yads.lt1.b(r4, "TSOC", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017d, code lost:
    
        if (r4 != 1920233063) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017f, code lost:
    
        r3 = yads.lt1.a(r4, "ITUNESADVISORY", r2, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018b, code lost:
    
        if (r4 != 1885823344) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018d, code lost:
    
        r3 = yads.lt1.a(r4, "ITUNESGAPLESS", r2, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0198, code lost:
    
        if (r4 != 1936683886) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019a, code lost:
    
        r3 = yads.lt1.b(r4, "TVSHOWSORT", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a5, code lost:
    
        if (r4 != 1953919848) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a7, code lost:
    
        r3 = yads.lt1.b(r4, "TVSHOW", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b2, code lost:
    
        if (r4 != 757935405) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b4, code lost:
    
        r5 = yads.lt1.b(r13, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x023a, code lost:
    
        yads.gh1.a("MetadataUtil", "Skipped unknown metadata entry: " + yads.yi.a(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x024d, code lost:
    
        r2.e(r13);
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00a8, code lost:
    
        r2.e(r2.b + 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00b6, code lost:
    
        if (r2.a() != 1684108385) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00b8, code lost:
    
        r2.e(r2.b + 8);
        r4 = r2.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00ce, code lost:
    
        if (r4 <= 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00d0, code lost:
    
        r5 = yads.lt1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00d4, code lost:
    
        if (r4 > 192) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00d6, code lost:
    
        r4 = r5[r4 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00dc, code lost:
    
        if (r4 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00de, code lost:
    
        r5 = new yads.l63("TCON", null, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00e6, code lost:
    
        yads.gh1.d("MetadataUtil", "Failed to parse standard genre code");
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00db, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00c8, code lost:
    
        yads.gh1.d("MetadataUtil", "Failed to parse uint8 attribute value");
        r4 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:223:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0557 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0572 A[EDGE_INSN: B:294:0x0572->B:295:0x0572 BREAK  A[LOOP:7: B:221:0x0436->B:227:0x0563], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0592 A[LOOP:10: B:296:0x058f->B:298:0x0592, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(wi wiVar) {
        int i;
        ht1 ht1Var;
        ht1 ht1Var2;
        ht1 ht1Var3;
        long j;
        ArrayList a;
        int size;
        int i2;
        long j2;
        xv1[] xv1VarArr;
        int i3;
        int i4;
        ArrayList arrayList;
        int i5;
        int i6;
        int i7;
        ht1 ht1Var4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        String[] strArr;
        aj1 aj1Var;
        ArrayList arrayList2 = new ArrayList();
        boolean z = this.v == 1;
        by0 by0Var = new by0();
        xi c = wiVar.c(1969517665);
        int i13 = 1768715124;
        int i14 = 1751411826;
        int i15 = 1835365473;
        int i16 = 8;
        if (c != null) {
            byte[] bArr = fj.a;
            xb2 xb2Var = c.b;
            xb2Var.e(8);
            ht1 ht1Var5 = null;
            ht1 ht1Var6 = null;
            while (true) {
                int i17 = xb2Var.c;
                int i18 = xb2Var.b;
                if (i17 - i18 < i16) {
                    break;
                }
                int a2 = xb2Var.a();
                int a3 = xb2Var.a();
                if (a3 == i15) {
                    xb2Var.e(i18);
                    int i19 = i18 + a2;
                    xb2Var.e(xb2Var.b + i16);
                    int i20 = xb2Var.b;
                    int i21 = i20 + 4;
                    xb2Var.e(i21);
                    if (xb2Var.a() != i14) {
                        i20 = i21;
                    }
                    xb2Var.e(i20);
                    while (true) {
                        int i22 = xb2Var.b;
                        if (i22 >= i19) {
                            break;
                        }
                        int a4 = xb2Var.a();
                        if (xb2Var.a() == i13) {
                            break;
                        }
                        xb2Var.e(i22 + a4);
                        i13 = 1768715124;
                        i16 = 8;
                    }
                    ht1Var5 = null;
                } else if (a3 == 1936553057) {
                    xb2Var.e(i18);
                    int i23 = i18 + a2;
                    xb2Var.e(xb2Var.b + 12);
                    while (true) {
                        int i24 = xb2Var.b;
                        if (i24 >= i23) {
                            break;
                        }
                        int a5 = xb2Var.a();
                        if (xb2Var.a() != 1935766900) {
                            xb2Var.e(i24 + a5);
                        } else if (a5 >= 14) {
                            xb2Var.e(xb2Var.b + 5);
                            int k = xb2Var.k();
                            if (k == 12 || k == 13) {
                                float f = k == 12 ? 240.0f : 120.0f;
                                xb2Var.e(xb2Var.b + 1);
                                ht1Var6 = new ht1(new d23(xb2Var.k(), f));
                            }
                        }
                    }
                    ht1Var6 = null;
                }
                xb2Var.e(i18 + a2);
                i13 = 1768715124;
                i14 = 1751411826;
                i15 = 1835365473;
                i16 = 8;
            }
            Pair create = Pair.create(ht1Var5, ht1Var6);
            ht1 ht1Var7 = (ht1) create.first;
            ht1 ht1Var8 = (ht1) create.second;
            if (ht1Var7 != null) {
                by0Var.a(ht1Var7);
            }
            ht1Var = ht1Var8;
            ht1Var2 = ht1Var7;
            i = 1835365473;
        } else {
            i = 1835365473;
            ht1Var = null;
            ht1Var2 = null;
        }
        wi b = wiVar.b(i);
        if (b != null) {
            byte[] bArr2 = fj.a;
            xi c2 = b.c(1751411826);
            xi c3 = b.c(1801812339);
            xi c4 = b.c(1768715124);
            if (c2 != null && c3 != null && c4 != null) {
                xb2 xb2Var2 = c2.b;
                xb2Var2.e(16);
                if (xb2Var2.a() == 1835299937) {
                    xb2 xb2Var3 = c3.b;
                    xb2Var3.e(12);
                    int a6 = xb2Var3.a();
                    String[] strArr2 = new String[a6];
                    for (int i25 = 0; i25 < a6; i25++) {
                        int a7 = xb2Var3.a();
                        xb2Var3.e(xb2Var3.b + 4);
                        strArr2[i25] = xb2Var3.a(a7 - 8, zt.c);
                    }
                    int i26 = 8;
                    xb2 xb2Var4 = c4.b;
                    xb2Var4.e(8);
                    ArrayList arrayList3 = new ArrayList();
                    while (true) {
                        int i27 = xb2Var4.c;
                        int i28 = xb2Var4.b;
                        if (i27 - i28 <= i26) {
                            break;
                        }
                        int a8 = xb2Var4.a();
                        int a9 = xb2Var4.a() - 1;
                        if (a9 >= 0 && a9 < a6) {
                            String str = strArr2[a9];
                            int i29 = i28 + a8;
                            while (true) {
                                int i30 = xb2Var4.b;
                                if (i30 >= i29) {
                                    i12 = a6;
                                    strArr = strArr2;
                                    aj1Var = null;
                                    break;
                                }
                                int a10 = xb2Var4.a();
                                i12 = a6;
                                if (xb2Var4.a() == 1684108385) {
                                    int a11 = xb2Var4.a();
                                    int a12 = xb2Var4.a();
                                    int i31 = a10 - 16;
                                    byte[] bArr3 = new byte[i31];
                                    strArr = strArr2;
                                    xb2Var4.a(bArr3, 0, i31);
                                    aj1Var = new aj1(a12, a11, str, bArr3);
                                    break;
                                }
                                xb2Var4.e(i30 + a10);
                                a6 = i12;
                            }
                            if (aj1Var != null) {
                                arrayList3.add(aj1Var);
                            }
                        } else {
                            i12 = a6;
                            strArr = strArr2;
                            mf1.a(a9, "Skipped metadata with unknown key index: ", "AtomParsers");
                        }
                        xb2Var4.e(i28 + a8);
                        a6 = i12;
                        strArr2 = strArr;
                        i26 = 8;
                    }
                    if (!arrayList3.isEmpty()) {
                        ht1Var3 = new ht1(arrayList3);
                        j = -9223372036854775807L;
                        a = fj.a(wiVar, by0Var, -9223372036854775807L, null, false, z, new yx0() { // from class: yads.yv1$$ExternalSyntheticLambda1
                            @Override // yads.yx0
                            public final Object apply(Object obj) {
                                return yv1.a((u73) obj);
                            }
                        });
                        size = a.size();
                        long j3 = -9223372036854775807L;
                        i2 = 0;
                        int i32 = -1;
                        while (true) {
                            j2 = 0;
                            if (i2 < size) {
                                break;
                            }
                            d83 d83Var = (d83) a.get(i2);
                            if (d83Var.b == 0) {
                                ht1Var4 = ht1Var3;
                                arrayList = a;
                                i5 = size;
                                i9 = 1;
                            } else {
                                u73 u73Var = d83Var.a;
                                arrayList = a;
                                i5 = size;
                                long j4 = u73Var.e;
                                if (j4 == j) {
                                    j4 = d83Var.h;
                                }
                                long max = Math.max(j3, j4);
                                xv1 xv1Var = new xv1(u73Var, d83Var, this.q.a(i2, u73Var.b));
                                if ("audio/true-hd".equals(u73Var.f.m)) {
                                    i6 = d83Var.e * 16;
                                } else {
                                    i6 = d83Var.e + 30;
                                }
                                jw0 jw0Var = u73Var.f;
                                jw0Var.getClass();
                                iw0 iw0Var = new iw0(jw0Var);
                                iw0Var.l = i6;
                                int i33 = u73Var.b;
                                if (i33 != 2 || j4 <= 0) {
                                    i7 = 1;
                                } else {
                                    int i34 = d83Var.b;
                                    i7 = 1;
                                    if (i34 > 1) {
                                        iw0Var.r = i34 / (j4 / 1000000.0f);
                                    }
                                }
                                if (i33 == i7 && (i10 = by0Var.a) != -1 && (i11 = by0Var.b) != -1) {
                                    iw0Var.A = i10;
                                    iw0Var.B = i11;
                                }
                                ht1[] ht1VarArr = {ht1Var, this.g.isEmpty() ? null : new ht1(this.g)};
                                ht1 ht1Var9 = new ht1(new gt1[0]);
                                if (i33 == 1) {
                                    if (ht1Var2 != null) {
                                        ht1Var4 = ht1Var3;
                                        ht1Var9 = ht1Var2;
                                        for (i8 = 0; i8 < 2; i8++) {
                                            ht1 ht1Var10 = ht1VarArr[i8];
                                            if (ht1Var10 != null) {
                                                gt1[] gt1VarArr = ht1Var10.b;
                                                ht1Var9.getClass();
                                                if (gt1VarArr.length != 0) {
                                                    ht1Var9 = new ht1((gt1[]) sb3.a((Object[]) ht1Var9.b, (Object[]) gt1VarArr));
                                                }
                                            }
                                        }
                                        if (ht1Var9.b.length > 0) {
                                            iw0Var.i = ht1Var9;
                                        }
                                        xv1Var.c.a(new jw0(iw0Var));
                                        if (u73Var.b == 2 && i32 == -1) {
                                            i32 = arrayList2.size();
                                        }
                                        arrayList2.add(xv1Var);
                                        j3 = max;
                                        i9 = 1;
                                    }
                                    ht1Var4 = ht1Var3;
                                    while (i8 < 2) {
                                    }
                                    if (ht1Var9.b.length > 0) {
                                    }
                                    xv1Var.c.a(new jw0(iw0Var));
                                    if (u73Var.b == 2) {
                                        i32 = arrayList2.size();
                                    }
                                    arrayList2.add(xv1Var);
                                    j3 = max;
                                    i9 = 1;
                                } else {
                                    if (i33 == 2 && ht1Var3 != null) {
                                        int i35 = 0;
                                        while (true) {
                                            gt1[] gt1VarArr2 = ht1Var3.b;
                                            if (i35 >= gt1VarArr2.length) {
                                                break;
                                            }
                                            gt1 gt1Var = gt1VarArr2[i35];
                                            if (gt1Var instanceof aj1) {
                                                aj1 aj1Var2 = (aj1) gt1Var;
                                                ht1Var4 = ht1Var3;
                                                if ("com.android.capture.fps".equals(aj1Var2.b)) {
                                                    ht1Var9 = new ht1(aj1Var2);
                                                    break;
                                                }
                                            } else {
                                                ht1Var4 = ht1Var3;
                                            }
                                            i35++;
                                            ht1Var3 = ht1Var4;
                                        }
                                        while (i8 < 2) {
                                        }
                                        if (ht1Var9.b.length > 0) {
                                        }
                                        xv1Var.c.a(new jw0(iw0Var));
                                        if (u73Var.b == 2) {
                                        }
                                        arrayList2.add(xv1Var);
                                        j3 = max;
                                        i9 = 1;
                                    }
                                    ht1Var4 = ht1Var3;
                                    while (i8 < 2) {
                                    }
                                    if (ht1Var9.b.length > 0) {
                                    }
                                    xv1Var.c.a(new jw0(iw0Var));
                                    if (u73Var.b == 2) {
                                    }
                                    arrayList2.add(xv1Var);
                                    j3 = max;
                                    i9 = 1;
                                }
                            }
                            i2 += i9;
                            a = arrayList;
                            size = i5;
                            ht1Var3 = ht1Var4;
                            j = -9223372036854775807L;
                        }
                        this.t = i32;
                        this.u = j3;
                        xv1VarArr = (xv1[]) arrayList2.toArray(new xv1[0]);
                        this.r = xv1VarArr;
                        long[][] jArr = new long[xv1VarArr.length][];
                        int[] iArr = new int[xv1VarArr.length];
                        long[] jArr2 = new long[xv1VarArr.length];
                        boolean[] zArr = new boolean[xv1VarArr.length];
                        for (i3 = 0; i3 < xv1VarArr.length; i3++) {
                            jArr[i3] = new long[xv1VarArr[i3].b.b];
                            jArr2[i3] = xv1VarArr[i3].b.f[0];
                        }
                        i4 = 0;
                        while (i4 < xv1VarArr.length) {
                            int i36 = -1;
                            long j5 = Long.MAX_VALUE;
                            for (int i37 = 0; i37 < xv1VarArr.length; i37++) {
                                if (!zArr[i37]) {
                                    long j6 = jArr2[i37];
                                    if (j6 <= j5) {
                                        i36 = i37;
                                        j5 = j6;
                                    }
                                }
                            }
                            int i38 = iArr[i36];
                            long[] jArr3 = jArr[i36];
                            jArr3[i38] = j2;
                            d83 d83Var2 = xv1VarArr[i36].b;
                            j2 += d83Var2.d[i38];
                            int i39 = i38 + 1;
                            iArr[i36] = i39;
                            if (i39 < jArr3.length) {
                                jArr2[i36] = d83Var2.f[i39];
                            } else {
                                zArr[i36] = true;
                                i4++;
                            }
                        }
                        this.s = jArr;
                        this.q.a();
                        this.q.a(this);
                    }
                }
            }
        }
        ht1Var3 = null;
        j = -9223372036854775807L;
        a = fj.a(wiVar, by0Var, -9223372036854775807L, null, false, z, new yx0() { // from class: yads.yv1$$ExternalSyntheticLambda1
            @Override // yads.yx0
            public final Object apply(Object obj) {
                return yv1.a((u73) obj);
            }
        });
        size = a.size();
        long j32 = -9223372036854775807L;
        i2 = 0;
        int i322 = -1;
        while (true) {
            j2 = 0;
            if (i2 < size) {
            }
            i2 += i9;
            a = arrayList;
            size = i5;
            ht1Var3 = ht1Var4;
            j = -9223372036854775807L;
        }
        this.t = i322;
        this.u = j32;
        xv1VarArr = (xv1[]) arrayList2.toArray(new xv1[0]);
        this.r = xv1VarArr;
        long[][] jArr4 = new long[xv1VarArr.length][];
        int[] iArr2 = new int[xv1VarArr.length];
        long[] jArr22 = new long[xv1VarArr.length];
        boolean[] zArr2 = new boolean[xv1VarArr.length];
        while (i3 < xv1VarArr.length) {
        }
        i4 = 0;
        while (i4 < xv1VarArr.length) {
        }
        this.s = jArr4;
        this.q.a();
        this.q.a(this);
    }
}
