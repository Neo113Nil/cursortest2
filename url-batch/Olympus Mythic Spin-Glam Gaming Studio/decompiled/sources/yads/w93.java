package yads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class w93 implements tp0 {
    public final int a;
    public final int b;
    public final List c;
    public final xb2 d;
    public final SparseIntArray e;
    public final qf0 f;
    public final SparseArray g;
    public final SparseBooleanArray h;
    public final SparseBooleanArray i;
    public final t93 j;
    public s93 k;
    public wp0 l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public aa3 q;
    public int r;
    public int s;

    static {
        new yp0() { // from class: yads.w93$$ExternalSyntheticLambda0
            @Override // yads.yp0
            public final tp0[] a() {
                return w93.a();
            }
        };
    }

    public w93() {
        m73 m73Var = new m73(0L);
        this.f = new qf0();
        this.b = 112800;
        this.a = 1;
        this.c = Collections.singletonList(m73Var);
        this.d = new xb2(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.h = sparseBooleanArray;
        this.i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.g = sparseArray;
        this.e = new SparseIntArray();
        this.j = new t93();
        this.l = wp0.a;
        this.s = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            this.g.put(sparseArray2.keyAt(i), (aa3) sparseArray2.valueAt(i));
        }
        this.g.put(0, new jx2(new u93(this)));
        this.q = null;
    }

    public static tp0[] a() {
        return new tp0[]{new w93()};
    }

    @Override // yads.tp0
    public final void release() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // yads.tp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(up0 up0Var) {
        byte[] bArr = this.d.a;
        pd0 pd0Var = (pd0) up0Var;
        pd0Var.b(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
            }
            pd0Var.a(i);
            return true;
        }
        return false;
    }

    @Override // yads.tp0
    public final void a(wp0 wp0Var) {
        this.l = wp0Var;
    }

    @Override // yads.tp0
    public final void a(long j, long j2) {
        s93 s93Var;
        long j3;
        if (this.a != 2) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                m73 m73Var = (m73) this.c.get(i);
                synchronized (m73Var) {
                    j3 = m73Var.b;
                }
                boolean z = true;
                boolean z2 = j3 == -9223372036854775807L;
                if (z2) {
                    z = z2;
                } else {
                    long a = m73Var.a();
                    if (a == -9223372036854775807L || a == 0 || a == j2) {
                        z = false;
                    }
                }
                if (z) {
                    m73Var.c(j2);
                }
            }
            if (j2 != 0 && (s93Var = this.k) != null) {
                s93Var.a(j2);
            }
            this.d.c(0);
            this.e.clear();
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                ((aa3) this.g.valueAt(i2)).a();
            }
            this.r = 0;
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // yads.tp0
    public final int a(up0 up0Var, dg2 dg2Var) {
        pd0 pd0Var;
        ?? r3;
        ?? r15;
        int i;
        pd0 pd0Var2;
        long j;
        boolean z;
        boolean z2;
        dg2 dg2Var2;
        long j2;
        long j3;
        pd0 pd0Var3 = (pd0) up0Var;
        long j4 = pd0Var3.c;
        if (this.n) {
            if (j4 != -1 && this.a != 2) {
                t93 t93Var = this.j;
                if (!t93Var.c) {
                    int i2 = this.s;
                    if (i2 <= 0) {
                        t93Var.b.a(sb3.f);
                        t93Var.c = true;
                        pd0Var3.f = 0;
                    } else if (!t93Var.e) {
                        int min = (int) Math.min(112800, j4);
                        long j5 = j4 - min;
                        if (pd0Var3.d != j5) {
                            dg2Var.a = j5;
                            return 1;
                        }
                        t93Var.b.c(min);
                        pd0Var3.f = 0;
                        pd0Var3.b(t93Var.b.a, 0, min, false);
                        xb2 xb2Var = t93Var.b;
                        int i3 = xb2Var.b;
                        int i4 = xb2Var.c;
                        int i5 = i4 - 188;
                        while (true) {
                            if (i5 < i3) {
                                j3 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr = xb2Var.a;
                            int i6 = -4;
                            int i7 = 0;
                            while (true) {
                                if (i6 > 4) {
                                    break;
                                }
                                int i8 = (i6 * 188) + i5;
                                if (i8 < i3 || i8 >= i4 || bArr[i8] != 71) {
                                    i7 = 0;
                                } else {
                                    i7++;
                                    if (i7 == 5) {
                                        long a = ba3.a(xb2Var, i5, i2);
                                        if (a != -9223372036854775807L) {
                                            j3 = a;
                                            break;
                                        }
                                    }
                                }
                                i6++;
                            }
                            i5--;
                        }
                        t93Var.g = j3;
                        t93Var.e = true;
                    } else if (t93Var.g == -9223372036854775807L) {
                        t93Var.b.a(sb3.f);
                        t93Var.c = true;
                        pd0Var3.f = 0;
                    } else if (!t93Var.d) {
                        int min2 = (int) Math.min(112800, j4);
                        long j6 = 0;
                        if (pd0Var3.d != j6) {
                            dg2Var.a = j6;
                            return 1;
                        }
                        t93Var.b.c(min2);
                        pd0Var3.f = 0;
                        pd0Var3.b(t93Var.b.a, 0, min2, false);
                        xb2 xb2Var2 = t93Var.b;
                        int i9 = xb2Var2.b;
                        int i10 = xb2Var2.c;
                        while (true) {
                            if (i9 >= i10) {
                                j2 = -9223372036854775807L;
                                break;
                            }
                            if (xb2Var2.a[i9] == 71) {
                                long a2 = ba3.a(xb2Var2, i9, i2);
                                if (a2 != -9223372036854775807L) {
                                    j2 = a2;
                                    break;
                                }
                            }
                            i9++;
                        }
                        t93Var.f = j2;
                        t93Var.d = true;
                    } else {
                        long j7 = t93Var.f;
                        if (j7 == -9223372036854775807L) {
                            t93Var.b.a(sb3.f);
                            t93Var.c = true;
                            pd0Var3.f = 0;
                        } else {
                            long b = t93Var.a.b(t93Var.g) - t93Var.a.b(j7);
                            t93Var.h = b;
                            if (b < 0) {
                                gh1.d("TsDurationReader", "Invalid duration: " + t93Var.h + ". Using TIME_UNSET instead.");
                                t93Var.h = -9223372036854775807L;
                            }
                            t93Var.b.a(sb3.f);
                            t93Var.c = true;
                            pd0Var3.f = 0;
                        }
                    }
                    return 0;
                }
            }
            if (this.o) {
                pd0Var2 = pd0Var3;
                j = 0;
                z = false;
                z2 = true;
            } else {
                this.o = true;
                t93 t93Var2 = this.j;
                long j8 = t93Var2.h;
                if (j8 != -9223372036854775807L) {
                    pd0Var2 = pd0Var3;
                    j = 0;
                    z2 = true;
                    s93 s93Var = new s93(t93Var2.a, j8, j4, this.s, this.b);
                    this.k = s93Var;
                    this.l.a(s93Var.a);
                    z = false;
                } else {
                    pd0Var2 = pd0Var3;
                    j = 0;
                    z = false;
                    z2 = true;
                    this.l.a(new lx2(j8, 0L));
                }
            }
            if (this.p) {
                this.p = z;
                a(j, j);
                pd0Var = pd0Var2;
                if (pd0Var.d != j) {
                    dg2Var.a = j;
                    return z2 ? 1 : 0;
                }
                dg2Var2 = dg2Var;
            } else {
                dg2Var2 = dg2Var;
                pd0Var = pd0Var2;
            }
            s93 s93Var2 = this.k;
            r3 = z;
            r15 = z2;
            if (s93Var2 != null) {
                r3 = z;
                r15 = z2;
                if (s93Var2.c != null) {
                    return s93Var2.a(pd0Var, dg2Var2);
                }
            }
        } else {
            pd0Var = pd0Var3;
            r3 = 0;
            r15 = 1;
        }
        xb2 xb2Var3 = this.d;
        byte[] bArr2 = xb2Var3.a;
        int i11 = xb2Var3.b;
        if (9400 - i11 < 188) {
            int i12 = xb2Var3.c - i11;
            if (i12 > 0) {
                System.arraycopy(bArr2, i11, bArr2, r3, i12);
            }
            xb2 xb2Var4 = this.d;
            xb2Var4.a = bArr2;
            xb2Var4.c = i12;
            xb2Var4.b = r3;
        }
        while (true) {
            xb2 xb2Var5 = this.d;
            int i13 = xb2Var5.c;
            int i14 = xb2Var5.b;
            if (i13 - i14 < 188) {
                int c = pd0Var.c(bArr2, i13, 9400 - i13);
                if (c == -1) {
                    return -1;
                }
                this.d.d(i13 + c);
            } else {
                byte[] bArr3 = xb2Var5.a;
                int i15 = i14;
                while (i15 < i13 && bArr3[i15] != 71) {
                    i15++;
                }
                this.d.e(i15);
                int i16 = i15 + 188;
                if (i16 > i13) {
                    int i17 = (i15 - i14) + this.r;
                    this.r = i17;
                    i = 2;
                    if (this.a == 2 && i17 > 376) {
                        throw new cc2("Cannot find sync byte. Most likely not a Transport Stream.", null, r15, r15);
                    }
                } else {
                    i = 2;
                    this.r = r3;
                }
                xb2 xb2Var6 = this.d;
                int i18 = xb2Var6.c;
                if (i16 > i18) {
                    return r3;
                }
                int a3 = xb2Var6.a();
                if ((8388608 & a3) != 0) {
                    this.d.e(i16);
                    return r3;
                }
                int i19 = (4194304 & a3) != 0 ? r15 : r3;
                int i20 = (2096896 & a3) >> 8;
                boolean z3 = (a3 & 32) != 0 ? r15 : r3;
                aa3 aa3Var = (a3 & 16) != 0 ? (aa3) this.g.get(i20) : null;
                if (aa3Var == null) {
                    this.d.e(i16);
                    return r3;
                }
                if (this.a != i) {
                    int i21 = a3 & 15;
                    int i22 = this.e.get(i20, i21 - 1);
                    this.e.put(i20, i21);
                    if (i22 == i21) {
                        this.d.e(i16);
                        return r3;
                    }
                    if (i21 != ((i22 + r15) & 15)) {
                        aa3Var.a();
                    }
                }
                if (z3) {
                    int k = this.d.k();
                    i19 |= (this.d.k() & 64) != 0 ? i : r3;
                    xb2 xb2Var7 = this.d;
                    xb2Var7.e(xb2Var7.b + (k - r15));
                }
                boolean z4 = this.n;
                if (this.a == i || z4 || !this.i.get(i20, r3)) {
                    this.d.d(i16);
                    aa3Var.a(i19, this.d);
                    this.d.d(i18);
                }
                if (this.a != i && !z4 && this.n && j4 != -1) {
                    this.p = r15;
                }
                this.d.e(i16);
                return r3;
            }
        }
    }
}
