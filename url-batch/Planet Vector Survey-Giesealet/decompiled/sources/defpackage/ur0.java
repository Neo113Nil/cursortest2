package defpackage;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class ur0 {
    public static final tn0 a = new tn0(4);
    public static final t7 b = new t7(8);
    public static final Object c = new Object();
    public static sr0 d;
    public static long e;
    public static final j60 f;
    public static final aj0 g;
    public static List h;
    public static List i;
    public static final jv j;
    public static final q8 k;

    static {
        sr0 sr0Var = sr0.h;
        d = sr0Var;
        e = 2L;
        j60 j60Var = new j60();
        j60Var.c = new long[16];
        j60Var.d = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        j60Var.e = iArr;
        f = j60Var;
        aj0 aj0Var = new aj0();
        aj0Var.b = new int[16];
        aj0Var.c = new x01[16];
        g = aj0Var;
        wp wpVar = wp.d;
        h = wpVar;
        i = wpVar;
        long j2 = e;
        e = 1 + j2;
        jv jvVar = new jv(j2, sr0Var, null, new sj(1));
        d = d.e(jvVar.b);
        j = jvVar;
        k = new q8(0);
    }

    public static final void a() {
        f(a);
    }

    public static final mu b(mu muVar, mu muVar2) {
        return (muVar == null || muVar2 == null || muVar == muVar2) ? muVar == null ? muVar2 : muVar : new tr0(muVar, muVar2, 1);
    }

    public static final HashMap c(long j2, e70 e70Var, sr0 sr0Var) {
        long[] jArr;
        sr0 sr0Var2;
        long[] jArr2;
        sr0 sr0Var3;
        int i2;
        jt0 t;
        long j3 = j2;
        b70 x = e70Var.x();
        if (x != null) {
            sr0 d2 = e70Var.d().e(e70Var.g()).d(e70Var.j);
            Object[] objArr = x.b;
            long[] jArr3 = x.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j4 = jArr3[i3];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j4 & 255) < 128) {
                                ht0 ht0Var = (ht0) objArr[(i3 << 3) + i6];
                                jt0 a2 = ht0Var.a();
                                jArr2 = jArr3;
                                i2 = i4;
                                jt0 t2 = t(a2, j3, sr0Var);
                                if (t2 == null || (t = t(a2, j3, d2)) == null || t2.equals(t)) {
                                    sr0Var3 = d2;
                                } else {
                                    sr0Var3 = d2;
                                    jt0 t3 = t(a2, e70Var.g(), e70Var.d());
                                    if (t3 == null) {
                                        s();
                                        throw null;
                                    }
                                    jt0 b2 = ht0Var.b(t, t2, t3);
                                    if (b2 == null) {
                                        return null;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(t2, b2);
                                    hashMap = hashMap;
                                }
                            } else {
                                jArr2 = jArr3;
                                sr0Var3 = d2;
                                i2 = i4;
                            }
                            j4 >>= i2;
                            i6++;
                            j3 = j2;
                            i4 = i2;
                            jArr3 = jArr2;
                            d2 = sr0Var3;
                        }
                        jArr = jArr3;
                        sr0Var2 = d2;
                        if (i5 != i4) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        sr0Var2 = d2;
                    }
                    if (i3 == length) {
                        return hashMap;
                    }
                    i3++;
                    j3 = j2;
                    jArr3 = jArr;
                    d2 = sr0Var2;
                }
            }
        }
        return null;
    }

    public static final void d(or0 or0Var) {
        long j2;
        if (d.c(or0Var.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(or0Var.g());
        sb.append(", disposed=");
        sb.append(or0Var.c);
        sb.append(", applied=");
        e70 e70Var = or0Var instanceof e70 ? (e70) or0Var : null;
        sb.append(e70Var != null ? Boolean.valueOf(e70Var.m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (c) {
            j60 j60Var = f;
            j2 = j60Var.a > 0 ? ((long[]) j60Var.c)[0] : -1L;
        }
        sb.append(j2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final sr0 e(sr0 sr0Var, long j2, long j3) {
        while (nz.t(j2, j3) < 0) {
            sr0Var = sr0Var.e(j2);
            j2++;
        }
        return sr0Var;
    }

    public static final Object f(mu muVar) {
        b70 b70Var;
        Object w;
        jv jvVar = j;
        synchronized (c) {
            try {
                b70Var = jvVar.h;
                if (b70Var != null) {
                    k.addAndGet(1);
                }
                w = w(jvVar, muVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b70Var != null) {
            try {
                List list = h;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((qu) list.get(i2)).invoke(new xn0(b70Var), jvVar);
                }
            } finally {
                k.addAndGet(-1);
            }
        }
        synchronized (c) {
            g();
            if (b70Var != null) {
                Object[] objArr = b70Var.b;
                long[] jArr = b70Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    r((ht0) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        return w;
    }

    public static final void g() {
        aj0 aj0Var = g;
        int i2 = aj0Var.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            x01 x01Var = ((x01[]) aj0Var.c)[i3];
            Object obj = x01Var != null ? x01Var.get() : null;
            if (obj != null && q((ht0) obj)) {
                if (i4 != i3) {
                    ((x01[]) aj0Var.c)[i4] = x01Var;
                    int[] iArr = (int[]) aj0Var.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((x01[]) aj0Var.c)[i5] = null;
            ((int[]) aj0Var.b)[i5] = 0;
        }
        if (i4 != i2) {
            aj0Var.a = i4;
        }
    }

    public static final or0 h(or0 or0Var, mu muVar, boolean z) {
        boolean z2 = or0Var instanceof e70;
        if (z2 || or0Var == null) {
            return new fx0(z2 ? (e70) or0Var : null, muVar, null, false, z);
        }
        return new gx0(or0Var, muVar, false, z);
    }

    public static final jt0 i(jt0 jt0Var) {
        jt0 t;
        or0 k2 = k();
        jt0 t2 = t(jt0Var, k2.g(), k2.d());
        if (t2 != null) {
            return t2;
        }
        synchronized (c) {
            or0 k3 = k();
            t = t(jt0Var, k3.g(), k3.d());
        }
        if (t != null) {
            return t;
        }
        s();
        throw null;
    }

    public static final jt0 j(jt0 jt0Var, or0 or0Var) {
        jt0 t;
        jt0 t2 = t(jt0Var, or0Var.g(), or0Var.d());
        if (t2 != null) {
            return t2;
        }
        synchronized (c) {
            t = t(jt0Var, or0Var.g(), or0Var.d());
        }
        if (t != null) {
            return t;
        }
        s();
        throw null;
    }

    public static final or0 k() {
        or0 or0Var = (or0) b.o();
        return or0Var == null ? j : or0Var;
    }

    public static final mu l(mu muVar, mu muVar2, boolean z) {
        if (!z) {
            muVar2 = null;
        }
        return (muVar == null || muVar2 == null || muVar == muVar2) ? muVar == null ? muVar2 : muVar : new tr0(muVar, muVar2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final jt0 m(jt0 jt0Var, ht0 ht0Var) {
        jt0 a2 = ht0Var.a();
        long j2 = e;
        j60 j60Var = f;
        if (j60Var.a > 0) {
            j2 = ((long[]) j60Var.c)[0];
        }
        long j3 = j2 - 1;
        jt0 jt0Var2 = null;
        jt0 jt0Var3 = null;
        while (true) {
            if (a2 == null) {
                break;
            }
            long j4 = a2.a;
            if (j4 == 0) {
                break;
            }
            if (j4 != 0 && nz.t(j4, j3) <= 0 && !sr0.h.c(j4)) {
                if (jt0Var3 == null) {
                    jt0Var3 = a2;
                } else if (nz.t(a2.a, jt0Var3.a) >= 0) {
                    jt0Var2 = jt0Var3;
                }
            }
            a2 = a2.b;
        }
        if (jt0Var2 != null) {
            jt0Var2.a = Long.MAX_VALUE;
            return jt0Var2;
        }
        jt0 b2 = jt0Var.b(Long.MAX_VALUE);
        b2.b = ht0Var.a();
        ht0Var.c(b2);
        return b2;
    }

    public static final jt0 n(jt0 jt0Var, yl ylVar, or0 or0Var) {
        jt0 m;
        synchronized (c) {
            m = m(jt0Var, ylVar);
            m.a(jt0Var);
            m.a = or0Var.g();
        }
        return m;
    }

    public static final void o(or0 or0Var, ht0 ht0Var) {
        or0Var.t(or0Var.h() + 1);
        mu i2 = or0Var.i();
        if (i2 != null) {
            i2.c(ht0Var);
        }
    }

    public static final jt0 p(jt0 jt0Var, it0 it0Var, or0 or0Var, jt0 jt0Var2) {
        jt0 m;
        if (or0Var.f()) {
            or0Var.n(it0Var);
        }
        long g2 = or0Var.g();
        if (jt0Var2.a == g2) {
            return jt0Var2;
        }
        synchronized (c) {
            m = m(jt0Var, it0Var);
        }
        m.a = g2;
        if (jt0Var2.a != 1) {
            or0Var.n(it0Var);
        }
        return m;
    }

    public static final boolean q(ht0 ht0Var) {
        jt0 jt0Var;
        long j2 = e;
        j60 j60Var = f;
        if (j60Var.a > 0) {
            j2 = ((long[]) j60Var.c)[0];
        }
        jt0 jt0Var2 = null;
        jt0 jt0Var3 = null;
        int i2 = 0;
        for (jt0 a2 = ht0Var.a(); a2 != null; a2 = a2.b) {
            long j3 = a2.a;
            if (j3 != 0) {
                if (nz.t(j3, j2) >= 0) {
                    i2++;
                } else if (jt0Var2 == null) {
                    i2++;
                    jt0Var2 = a2;
                } else {
                    if (nz.t(a2.a, jt0Var2.a) < 0) {
                        jt0Var = jt0Var2;
                        jt0Var2 = a2;
                    } else {
                        jt0Var = a2;
                    }
                    if (jt0Var3 == null) {
                        jt0Var3 = ht0Var.a();
                        jt0 jt0Var4 = jt0Var3;
                        while (true) {
                            if (jt0Var3 == null) {
                                jt0Var3 = jt0Var4;
                                break;
                            }
                            if (nz.t(jt0Var3.a, j2) >= 0) {
                                break;
                            }
                            if (nz.t(jt0Var4.a, jt0Var3.a) < 0) {
                                jt0Var4 = jt0Var3;
                            }
                            jt0Var3 = jt0Var3.b;
                        }
                    }
                    jt0Var2.a = 0L;
                    jt0Var2.a(jt0Var3);
                    jt0Var2 = jt0Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void r(ht0 ht0Var) {
        if (q(ht0Var)) {
            aj0 aj0Var = g;
            int i2 = aj0Var.a;
            int identityHashCode = System.identityHashCode(ht0Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = aj0Var.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) aj0Var.b)[i6];
                    if (i7 < identityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > identityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        x01 x01Var = ((x01[]) aj0Var.c)[i6];
                        if (ht0Var != (x01Var != null ? x01Var.get() : null)) {
                            for (int i8 = i6 - 1; -1 < i8 && ((int[]) aj0Var.b)[i8] == identityHashCode; i8--) {
                                x01 x01Var2 = ((x01[]) aj0Var.c)[i8];
                                if ((x01Var2 != null ? x01Var2.get() : null) == ht0Var) {
                                    i3 = i8;
                                    break;
                                }
                            }
                            i6++;
                            int i9 = aj0Var.a;
                            while (true) {
                                if (i6 >= i9) {
                                    i3 = -(aj0Var.a + 1);
                                    break;
                                } else {
                                    if (((int[]) aj0Var.b)[i6] != identityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    x01 x01Var3 = ((x01[]) aj0Var.c)[i6];
                                    if ((x01Var3 != null ? x01Var3.get() : null) == ht0Var) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                        }
                        i3 = i6;
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            x01[] x01VarArr = (x01[]) aj0Var.c;
            int length = x01VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                x01[] x01VarArr2 = new x01[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(x01VarArr, i10, x01VarArr2, i12, i2 - i10);
                System.arraycopy((x01[]) aj0Var.c, 0, x01VarArr2, 0, i10);
                p8.R((int[]) aj0Var.b, iArr, i12, i10, i2);
                p8.U((int[]) aj0Var.b, iArr, 0, i10, 6);
                aj0Var.c = x01VarArr2;
                aj0Var.b = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(x01VarArr, i10, x01VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) aj0Var.b;
                p8.R(iArr2, iArr2, i13, i10, i2);
            }
            ((x01[]) aj0Var.c)[i10] = new x01(ht0Var);
            ((int[]) aj0Var.b)[i10] = identityHashCode;
            aj0Var.a++;
        }
    }

    public static final void s() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final jt0 t(jt0 jt0Var, long j2, sr0 sr0Var) {
        jt0 jt0Var2 = null;
        while (jt0Var != null) {
            long j3 = jt0Var.a;
            if (j3 != 0 && nz.t(j3, j2) <= 0 && !sr0Var.c(j3) && (jt0Var2 == null || nz.t(jt0Var2.a, jt0Var.a) < 0)) {
                jt0Var2 = jt0Var;
            }
            jt0Var = jt0Var.b;
        }
        if (jt0Var2 != null) {
            return jt0Var2;
        }
        return null;
    }

    public static final jt0 u(jt0 jt0Var, ht0 ht0Var) {
        jt0 t;
        or0 k2 = k();
        mu e2 = k2.e();
        if (e2 != null) {
            e2.c(ht0Var);
        }
        jt0 t2 = t(jt0Var, k2.g(), k2.d());
        if (t2 != null) {
            return t2;
        }
        synchronized (c) {
            or0 k3 = k();
            jt0 a2 = ht0Var.a();
            a2.getClass();
            t = t(a2, k3.g(), k3.d());
            if (t == null) {
                s();
                throw null;
            }
        }
        return t;
    }

    public static final void v(int i2) {
        j60 j60Var = f;
        int i3 = ((int[]) j60Var.e)[i2];
        j60Var.c(i3, j60Var.a - 1);
        j60Var.a--;
        long[] jArr = (long[]) j60Var.c;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (nz.t(jArr[i5], j2) <= 0) {
                break;
            }
            j60Var.c(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) j60Var.c;
        int i6 = j60Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < j60Var.a && nz.t(jArr2[i7], jArr2[i8]) < 0) {
                if (nz.t(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                j60Var.c(i7, i3);
                i3 = i7;
            } else {
                if (nz.t(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                j60Var.c(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) j60Var.e)[i2] = j60Var.b;
        j60Var.b = i2;
    }

    public static final Object w(jv jvVar, mu muVar) {
        long j2 = jvVar.b;
        Object c2 = muVar.c(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        sr0 b2 = d.b(j2);
        d = b2;
        jvVar.b = j3;
        jvVar.a = b2;
        jvVar.g = 0;
        jvVar.h = null;
        jvVar.o();
        d = d.e(j3);
        return c2;
    }

    public static final jt0 x(jt0 jt0Var, ht0 ht0Var, or0 or0Var) {
        jt0 t;
        if (or0Var.f()) {
            or0Var.n(ht0Var);
        }
        long g2 = or0Var.g();
        jt0 t2 = t(jt0Var, g2, or0Var.d());
        if (t2 == null) {
            s();
            throw null;
        }
        if (t2.a == or0Var.g()) {
            return t2;
        }
        synchronized (c) {
            t = t(ht0Var.a(), g2, or0Var.d());
            if (t == null) {
                s();
                throw null;
            }
            if (t.a != g2) {
                jt0 m = m(t, ht0Var);
                m.a(t);
                m.a = or0Var.g();
                t = m;
            }
        }
        if (t2.a != 1) {
            or0Var.n(ht0Var);
        }
        return t;
    }
}
