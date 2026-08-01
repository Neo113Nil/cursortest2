package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class qh implements ih {
    public int A;
    public boolean B;
    public final oh C;
    public final ArrayList D;
    public boolean E;
    public ir0 F;
    public jr0 G;
    public mr0 H;
    public boolean I;
    public gf0 J;
    public rc K;
    public final jh L;
    public h2 M;
    public gr N;
    public final yh O;
    public final rj P;
    public boolean Q;
    public long R;
    public xh S;
    public final t7 a;
    public final vh b;
    public final jr0 c;
    public final d70 d;
    public final rc e;
    public final rc f;
    public final bi g;
    public df0 i;
    public int j;
    public int k;
    public int l;
    public int[] n;
    public n60 o;
    public boolean p;
    public boolean q;
    public p60 u;
    public boolean v;
    public boolean x;
    public int z;
    public final ArrayList h = new ArrayList();
    public final jz m = new jz();
    public final ArrayList r = new ArrayList();
    public final jz s = new jz();
    public gf0 t = gf0.g;
    public final jz w = new jz();
    public int y = -1;

    public qh(t7 t7Var, vh vhVar, jr0 jr0Var, d70 d70Var, rc rcVar, rc rcVar2, y7 y7Var, bi biVar) {
        this.a = t7Var;
        this.b = vhVar;
        this.c = jr0Var;
        this.d = d70Var;
        this.e = rcVar;
        this.f = rcVar2;
        this.g = biVar;
        this.B = vhVar.e() || vhVar.c();
        this.C = new oh(0, this);
        this.D = new ArrayList();
        ir0 c = jr0Var.c();
        c.c();
        this.F = c;
        jr0 jr0Var2 = new jr0();
        if (vhVar.e()) {
            jr0Var2.b();
        }
        if (vhVar.c()) {
            jr0Var2.n = new p60();
        }
        this.G = jr0Var2;
        mr0 d = jr0Var2.d();
        d.e(true);
        this.H = d;
        this.L = new jh(this, rcVar);
        ir0 c2 = this.G.c();
        try {
            h2 a = c2.a(0);
            c2.c();
            this.M = a;
            this.N = new gr();
            this.O = new yh(this);
            rj i = vhVar.i();
            rj y = y();
            this.P = i.i(y == null ? up.d : y);
        } catch (Throwable th) {
            c2.c();
            throw th;
        }
    }

    public static final int M(qh qhVar, int i, boolean z, int i2) {
        ir0 ir0Var = qhVar.F;
        if (ir0Var.j(i)) {
            int i3 = ir0Var.i(i);
            Object p = ir0Var.p(ir0Var.b, i);
            if (i3 == 206 && nz.l(p, th.e)) {
                Object h = ir0Var.h(i, 0);
                mh mhVar = h instanceof mh ? (mh) h : null;
                if (mhVar != null) {
                    for (qh qhVar2 : mhVar.d.e) {
                        jr0 jr0Var = qhVar2.c;
                        if (jr0Var.e > 0 && (jr0Var.d[1] & 67108864) != 0) {
                            bi biVar = qhVar2.g;
                            synchronized (biVar.g) {
                                biVar.l();
                                a70 a70Var = biVar.q;
                                biVar.q = ld0.g();
                                try {
                                    biVar.w.a0(a70Var);
                                } finally {
                                }
                            }
                            rc rcVar = new rc();
                            qhVar2.K = rcVar;
                            ir0 c = qhVar2.c.c();
                            try {
                                qhVar2.F = c;
                                jh jhVar = qhVar2.L;
                                rc rcVar2 = jhVar.b;
                                try {
                                    jhVar.b = rcVar;
                                    qhVar2.L(0);
                                    jh jhVar2 = qhVar2.L;
                                    jhVar2.b();
                                    if (jhVar2.c) {
                                        jhVar2.b.h.R(hc0.c);
                                        if (jhVar2.c) {
                                            jhVar2.d(false);
                                            jhVar2.d(false);
                                            jhVar2.b.h.R(sb0.c);
                                            jhVar2.c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                c.c();
                            }
                        }
                        qhVar.b.n(qhVar2.g);
                    }
                }
                return ir0Var.o(i);
            }
            if (!ir0Var.l(i)) {
                return ir0Var.o(i);
            }
        } else if (ir0Var.d(i)) {
            int i4 = ir0Var.b[(i * 5) + 3] + i;
            int i5 = 0;
            for (int i6 = i + 1; i6 < i4; i6 += ir0Var.b[(i6 * 5) + 3]) {
                boolean l = ir0Var.l(i6);
                if (l) {
                    qhVar.L.c();
                    jh jhVar3 = qhVar.L;
                    Object n = ir0Var.n(i6);
                    jhVar3.c();
                    jhVar3.h.add(n);
                }
                i5 += M(qhVar, i6, l || z, l ? 0 : i2 + i5);
                if (l) {
                    qhVar.L.c();
                    qhVar.L.a();
                }
            }
            if (!ir0Var.l(i)) {
                return i5;
            }
        } else if (!ir0Var.l(i)) {
            return ir0Var.o(i);
        }
        return 1;
    }

    public final void A(ArrayList arrayList) {
        rc rcVar = this.f;
        jh jhVar = this.L;
        rc rcVar2 = jhVar.b;
        try {
            jhVar.b = rcVar;
            rcVar.h.R(fc0.c);
            if (arrayList.size() <= 0) {
                jhVar.b.h.R(tb0.c);
                jhVar.f = 0;
            } else {
                pd0 pd0Var = (pd0) arrayList.get(0);
                i60 i60Var = (i60) pd0Var.d;
                i60Var.getClass();
                throw null;
            }
        } finally {
            jhVar.b = rcVar2;
        }
    }

    public final void B(gf0 gf0Var, Object obj) {
        R(126665345, 0, null, null);
        C();
        f0(obj);
        long j = this.R;
        try {
            this.R = 126665345L;
            if (this.Q) {
                mr0.x(this.H);
            }
            boolean z = (this.Q || nz.l(this.F.f(), gf0Var)) ? false : true;
            if (z) {
                I(gf0Var);
            }
            R(202, 0, th.c, gf0Var);
            this.J = null;
            boolean z2 = this.v;
            this.v = z;
            nz.G(this, new eg(316014703, true, new ph(obj)));
            this.v = z2;
        } finally {
        }
    }

    public final Object C() {
        boolean z = this.Q;
        y7 y7Var = hh.a;
        if (!z) {
            Object m = this.F.m();
            if (!this.x || (m instanceof mh)) {
                return m;
            }
        } else if (this.q) {
            th.c("A call to createNode(), emitNode() or useNode() expected");
            return y7Var;
        }
        return y7Var;
    }

    public final List D() {
        vh vhVar = this.b;
        uh g = vhVar.g();
        bi biVar = y6.C(g) ? (bi) g : null;
        if (biVar != null) {
            jr0 jr0Var = biVar.i;
            ir0 c = jr0Var.c();
            try {
                Integer r = d31.r(c, vhVar, 0, c.c);
                if (r != null) {
                    try {
                        return d31.J(jr0Var.c(), r.intValue(), 0);
                    } finally {
                    }
                }
            } finally {
            }
        }
        return wp.d;
    }

    public final int E(int i) {
        int q = this.F.q(i) + 1;
        int i2 = 0;
        while (q < i) {
            if (!this.F.k(q)) {
                i2++;
            }
            q += this.F.b[(q * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r10 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(bi biVar, bi biVar2, Integer num, List list, bu buVar) {
        Object a;
        boolean z = this.E;
        int i = this.j;
        try {
            this.E = true;
            this.j = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                pd0 pd0Var = (pd0) list.get(i2);
                ri0 ri0Var = (ri0) pd0Var.d;
                Object obj = pd0Var.e;
                if (obj != null) {
                    Z(ri0Var, obj);
                } else {
                    Z(ri0Var, null);
                }
            }
            if (biVar != null) {
                int intValue = num != null ? num.intValue() : -1;
                if (biVar2 == null || biVar2 == biVar || intValue < 0) {
                    a = buVar.a();
                } else {
                    biVar.s = biVar2;
                    biVar.t = intValue;
                    try {
                        a = buVar.a();
                        biVar.s = null;
                        biVar.t = 0;
                    } catch (Throwable th) {
                        biVar.s = null;
                        biVar.t = 0;
                        throw th;
                    }
                }
            }
            a = buVar.a();
            this.E = z;
            this.j = i;
            return a;
        } catch (Throwable th2) {
            this.E = z;
            this.j = i;
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r3.b < r5) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        uz uzVar;
        int i;
        boolean z;
        ri0 ri0Var;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        w60 w60Var;
        long j;
        int e;
        long rotateLeft;
        int hashCode;
        Object b;
        boolean z3 = this.E;
        boolean z4 = true;
        this.E = true;
        ir0 ir0Var = this.F;
        int i6 = ir0Var.i;
        int i7 = (i6 * 5) + 3;
        int i8 = ir0Var.b[i7] + i6;
        int i9 = this.j;
        long j2 = this.R;
        int i10 = this.k;
        int i11 = this.l;
        int i12 = ir0Var.g;
        ArrayList arrayList = this.r;
        int e2 = th.e(arrayList, i12);
        if (e2 < 0) {
            e2 = -(e2 + 1);
        }
        if (e2 < arrayList.size()) {
            uzVar = (uz) arrayList.get(e2);
        }
        uzVar = null;
        boolean z5 = false;
        int i13 = i6;
        while (uzVar != null) {
            boolean z6 = z4;
            ri0 ri0Var2 = uzVar.a;
            int i14 = uzVar.b;
            int e3 = th.e(arrayList, i14);
            if (e3 >= 0) {
            }
            Object obj = uzVar.c;
            if (obj == null) {
                ri0Var2.getClass();
                z = z3;
                ri0Var = ri0Var2;
                i = i7;
            } else {
                int i15 = 8;
                a70 a70Var = ri0Var2.g;
                if (a70Var == null) {
                    z = z3;
                    ri0Var = ri0Var2;
                    i = i7;
                } else {
                    i = i7;
                    if (obj instanceof yl) {
                        yl ylVar = (yl) obj;
                        z2 = !nz.l(ylVar.h().f, a70Var.g(ylVar));
                        z = z3;
                        ri0Var = ri0Var2;
                        i2 = i9;
                        i3 = i10;
                        i4 = i11;
                    } else if (obj instanceof b70) {
                        b70 b70Var = (b70) obj;
                        if (b70Var.h()) {
                            Object[] objArr = b70Var.b;
                            long[] jArr = b70Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                i3 = i10;
                                i4 = i11;
                                int i16 = 0;
                                while (true) {
                                    long j3 = jArr[i16];
                                    z = z3;
                                    ri0Var = ri0Var2;
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                                        int i18 = 0;
                                        while (i18 < i17) {
                                            if ((j3 & 255) < 128) {
                                                i5 = i18;
                                                Object obj2 = objArr[(i16 << 3) + i18];
                                                i2 = i9;
                                                if (!(obj2 instanceof yl)) {
                                                    break;
                                                }
                                                yl ylVar2 = (yl) obj2;
                                                if (!nz.l(ylVar2.h().f, a70Var.g(ylVar2))) {
                                                    break;
                                                }
                                            } else {
                                                i5 = i18;
                                                i2 = i9;
                                            }
                                            j3 >>= i15;
                                            i18 = i5 + 1;
                                            i9 = i2;
                                        }
                                        i2 = i9;
                                        if (i17 != i15) {
                                            break;
                                        }
                                    } else {
                                        i2 = i9;
                                    }
                                    if (i16 == length) {
                                        break;
                                    }
                                    i16++;
                                    z3 = z;
                                    ri0Var2 = ri0Var;
                                    i9 = i2;
                                    i15 = 8;
                                }
                                z2 = false;
                            }
                        }
                        z = z3;
                        ri0Var = ri0Var2;
                        i2 = i9;
                        i3 = i10;
                        i4 = i11;
                        z2 = false;
                    } else {
                        z = z3;
                        ri0Var = ri0Var2;
                    }
                    if (z2) {
                        ri0 ri0Var3 = ri0Var;
                        ArrayList arrayList2 = this.D;
                        arrayList2.add(ri0Var3);
                        bi biVar = ri0Var3.a;
                        if (biVar != null && (w60Var = ri0Var3.f) != null) {
                            ri0Var3.d(z6);
                            try {
                                Object[] objArr2 = w60Var.b;
                                int[] iArr = w60Var.c;
                                long[] jArr2 = w60Var.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i19 = 0;
                                    while (true) {
                                        try {
                                            long j4 = jArr2[i19];
                                            Object[] objArr3 = objArr2;
                                            int[] iArr2 = iArr;
                                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                                int i21 = 0;
                                                while (i21 < i20) {
                                                    if ((j4 & 255) < 128) {
                                                        int i22 = (i19 << 3) + i21;
                                                        j = j4;
                                                        Object obj3 = objArr3[i22];
                                                        int i23 = iArr2[i22];
                                                        biVar.u(obj3);
                                                    } else {
                                                        j = j4;
                                                    }
                                                    i21++;
                                                    j4 = j >> 8;
                                                }
                                                if (i20 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i19 == length2) {
                                                break;
                                            }
                                            i19++;
                                            objArr2 = objArr3;
                                            iArr = iArr2;
                                        } catch (Throwable th) {
                                            th = th;
                                            ri0Var3 = ri0Var3;
                                            ri0Var3.d(false);
                                            throw th;
                                        }
                                    }
                                }
                                ri0Var3.d(false);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        z6 = true;
                        arrayList2.remove(arrayList2.size() - 1);
                    } else {
                        this.F.r(i14);
                        int i24 = this.F.g;
                        J(i13, i24, i6);
                        int q = this.F.q(i24);
                        while (q != i6 && !this.F.l(q)) {
                            q = this.F.q(q);
                        }
                        int i25 = this.F.l(q) ? 0 : i2;
                        if (q != i24) {
                            int g0 = (g0(q) - this.F.o(i24)) + i25;
                            while (i25 < g0 && q != i14) {
                                q++;
                                while (q < i14) {
                                    ir0 ir0Var2 = this.F;
                                    int i26 = ir0Var2.b[(q * 5) + 3] + q;
                                    if (i14 >= i26) {
                                        i25 += ir0Var2.l(q) ? z6 ? 1 : 0 : g0(q);
                                        q = i26;
                                    }
                                }
                                break;
                            }
                        }
                        this.j = i25;
                        this.l = E(i24);
                        int q2 = this.F.q(i24);
                        long j5 = 0;
                        int i27 = 3;
                        int i28 = 0;
                        while (q2 >= 0) {
                            if (q2 == i6) {
                                rotateLeft = Long.rotateLeft(j2, i28);
                            } else {
                                ir0 ir0Var3 = this.F;
                                boolean k = ir0Var3.k(q2);
                                int[] iArr3 = ir0Var3.b;
                                if (k) {
                                    Object p = ir0Var3.p(iArr3, q2);
                                    hashCode = p != null ? p instanceof Enum ? ((Enum) p).ordinal() : p.hashCode() : 0;
                                } else {
                                    int i29 = ir0Var3.i(q2);
                                    hashCode = (i29 != 207 || (b = ir0Var3.b(iArr3, q2)) == null || b.equals(hh.a)) ? i29 : b.hashCode();
                                }
                                if (hashCode == 126665345) {
                                    rotateLeft = Long.rotateLeft(hashCode, i28);
                                } else {
                                    j5 = (j5 ^ Long.rotateLeft(hashCode, i27)) ^ Long.rotateLeft(this.F.k(q2) ? 0 : E(q2), i28);
                                    i27 = (i27 + 6) % 64;
                                    i28 = (i28 + 6) % 64;
                                    q2 = this.F.q(q2);
                                }
                            }
                            j5 ^= rotateLeft;
                            break;
                        }
                        this.R = j5;
                        this.J = null;
                        qu quVar = ri0Var.d;
                        if (quVar == null) {
                            g8.s("Invalid restart scope");
                            return;
                        }
                        quVar.invoke(this, Integer.valueOf(z6 ? 1 : 0));
                        this.J = null;
                        ir0 ir0Var4 = this.F;
                        int i30 = ir0Var4.b[i] + i6;
                        int i31 = ir0Var4.g;
                        if (!((i31 < i6 || i31 > i30) ? false : z6 ? 1 : 0)) {
                            th.c("Index " + i6 + " is not a parent of " + i31);
                        }
                        ir0Var4.i = i6;
                        ir0Var4.h = i30;
                        ir0Var4.l = 0;
                        ir0Var4.m = 0;
                        i13 = i24;
                        z5 = z6 ? 1 : 0;
                    }
                    e = th.e(arrayList, this.F.g);
                    if (e < 0) {
                        e = -(e + 1);
                    }
                    if (e < arrayList.size()) {
                        uz uzVar2 = (uz) arrayList.get(e);
                        if (uzVar2.b < i8) {
                            uzVar = uzVar2;
                            z4 = z6;
                            i7 = i;
                            i10 = i3;
                            i11 = i4;
                            z3 = z;
                            i9 = i2;
                        }
                    }
                    uzVar = null;
                    z4 = z6;
                    i7 = i;
                    i10 = i3;
                    i11 = i4;
                    z3 = z;
                    i9 = i2;
                }
            }
            i2 = i9;
            i3 = i10;
            i4 = i11;
            z2 = z6 ? 1 : 0;
            if (z2) {
            }
            e = th.e(arrayList, this.F.g);
            if (e < 0) {
            }
            if (e < arrayList.size()) {
            }
            uzVar = null;
            z4 = z6;
            i7 = i;
            i10 = i3;
            i11 = i4;
            z3 = z;
            i9 = i2;
        }
        boolean z7 = z3;
        int i32 = i9;
        int i33 = i10;
        int i34 = i11;
        if (z5) {
            J(i13, i6, i6);
            this.F.t();
            int g02 = g0(i6);
            this.j = i32 + g02;
            this.k = i33 + g02;
            this.l = i34;
        } else {
            P();
        }
        this.R = j2;
        this.E = z7;
    }

    public final void H() {
        int i;
        L(this.F.g);
        jh jhVar = this.L;
        jhVar.d(false);
        jz jzVar = jhVar.d;
        qh qhVar = jhVar.a;
        ir0 ir0Var = qhVar.F;
        if (ir0Var.c > 0 && jzVar.a(-2) != (i = ir0Var.i)) {
            if (!jhVar.c && jhVar.e) {
                jhVar.d(false);
                jhVar.b.h.R(wb0.c);
                jhVar.c = true;
            }
            if (i > 0) {
                h2 a = ir0Var.a(i);
                jzVar.c(i);
                jhVar.d(false);
                rc0 rc0Var = jhVar.b.h;
                rc0Var.R(vb0.c);
                px0.S(rc0Var, 0, a);
                jhVar.c = true;
            }
        }
        jhVar.b.h.R(dc0.c);
        int i2 = jhVar.f;
        ir0 ir0Var2 = qhVar.F;
        jhVar.f = ir0Var2.b[(ir0Var2.g * 5) + 3] + i2;
    }

    public final void I(gf0 gf0Var) {
        p60 p60Var = this.u;
        if (p60Var == null) {
            p60Var = new p60();
            this.u = p60Var;
        }
        p60Var.h(this.F.g, gf0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(int i, int i2, int i3) {
        ir0 ir0Var = this.F;
        if (i != i2) {
            if (i != i3 && i2 != i3) {
                if (ir0Var.q(i) == i2) {
                    i3 = i2;
                } else if (ir0Var.q(i2) != i) {
                    if (ir0Var.q(i) == ir0Var.q(i2)) {
                        i3 = ir0Var.q(i);
                    } else {
                        int i4 = i;
                        int i5 = 0;
                        while (i4 > 0 && i4 != i3) {
                            i4 = ir0Var.q(i4);
                            i5++;
                        }
                        int i6 = i2;
                        int i7 = 0;
                        while (i6 > 0 && i6 != i3) {
                            i6 = ir0Var.q(i6);
                            i7++;
                        }
                        int i8 = i5 - i7;
                        int i9 = i;
                        for (int i10 = 0; i10 < i8; i10++) {
                            i9 = ir0Var.q(i9);
                        }
                        int i11 = i7 - i5;
                        int i12 = i2;
                        for (int i13 = 0; i13 < i11; i13++) {
                            i12 = ir0Var.q(i12);
                        }
                        i3 = i9;
                        for (int i14 = i12; i3 != i14; i14 = ir0Var.q(i14)) {
                            i3 = ir0Var.q(i3);
                        }
                    }
                }
            }
            while (i > 0 && i != i3) {
                if (!ir0Var.l(i)) {
                    this.L.a();
                }
                i = ir0Var.q(i);
            }
            p(i2, i3);
        }
        i3 = i;
        while (i > 0) {
            if (!ir0Var.l(i)) {
            }
            i = ir0Var.q(i);
        }
        p(i2, i3);
    }

    public final Object K() {
        boolean z = this.Q;
        y7 y7Var = hh.a;
        if (!z) {
            Object m = this.F.m();
            if (!this.x || (m instanceof mh)) {
                return m instanceof dk0 ? ((dk0) m).a : m;
            }
        } else if (this.q) {
            th.c("A call to createNode(), emitNode() or useNode() expected");
            return y7Var;
        }
        return y7Var;
    }

    public final void L(int i) {
        boolean l = this.F.l(i);
        jh jhVar = this.L;
        if (l) {
            jhVar.c();
            Object n = this.F.n(i);
            jhVar.c();
            jhVar.h.add(n);
        }
        M(this, i, l, 0);
        jhVar.c();
        if (l) {
            jhVar.a();
        }
    }

    public final boolean N(int i, boolean z) {
        return ((i & 1) == 0 && (this.Q || this.x)) || z || !z();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O() {
        long rotateLeft;
        if (this.r.isEmpty()) {
            this.k = this.F.s() + this.k;
            return;
        }
        ir0 ir0Var = this.F;
        int g = ir0Var.g();
        int[] iArr = ir0Var.b;
        int i = ir0Var.g;
        Object p = i < ir0Var.h ? ir0Var.p(iArr, i) : null;
        Object f = ir0Var.f();
        int i2 = this.l;
        y7 y7Var = hh.a;
        if (p != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.R, 3) ^ (p instanceof Enum ? ((Enum) p).ordinal() : p.hashCode()), 3);
        } else {
            if (f != null && g == 207 && !f.equals(y7Var)) {
                this.R = Long.rotateLeft(Long.rotateLeft(this.R, 3) ^ f.hashCode(), 3) ^ i2;
                U(null, (iArr[(ir0Var.g * 5) + 1] & 1073741824) != 0);
                G();
                ir0Var.e();
                if (p == null) {
                    if (p instanceof Enum) {
                        this.R = Long.rotateRight(Long.rotateRight(this.R, 3) ^ ((Enum) p).ordinal(), 3);
                        return;
                    } else {
                        this.R = Long.rotateRight(Long.rotateRight(this.R, 3) ^ p.hashCode(), 3);
                        return;
                    }
                }
                if (f == null || g != 207 || f.equals(y7Var)) {
                    this.R = Long.rotateRight(g ^ Long.rotateRight(this.R ^ i2, 3), 3);
                    return;
                } else {
                    this.R = Long.rotateRight(Long.rotateRight(this.R ^ i2, 3) ^ f.hashCode(), 3);
                    return;
                }
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.R, 3) ^ g, 3) ^ i2;
        }
        this.R = rotateLeft;
        U(null, (iArr[(ir0Var.g * 5) + 1] & 1073741824) != 0);
        G();
        ir0Var.e();
        if (p == null) {
        }
    }

    public final void P() {
        ir0 ir0Var = this.F;
        int i = ir0Var.i;
        this.k = i >= 0 ? ir0Var.b[(i * 5) + 1] & 67108863 : 0;
        ir0Var.t();
    }

    public final void Q() {
        if (this.k != 0) {
            th.c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.Q) {
            return;
        }
        ri0 w = w();
        if (w != null) {
            int i = w.b;
            if ((i & 128) == 0) {
                w.b = i | 16;
            }
        }
        if (this.r.isEmpty()) {
            P();
        } else {
            G();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(int i, int i2, Object obj, Object obj2) {
        long rotateLeft;
        boolean z;
        df0 df0Var;
        df0 df0Var2;
        int i3;
        int i4;
        Object[] objArr;
        Object[] objArr2;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        Object obj3 = obj;
        if (this.q) {
            th.c("A call to createNode(), emitNode() or useNode() expected");
        }
        int i9 = this.l;
        Object obj4 = hh.a;
        if (obj3 != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.R, 3) ^ (obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj3.hashCode()), 3);
        } else {
            if (obj2 != null && i == 207 && !obj2.equals(obj4)) {
                this.R = Long.rotateLeft(Long.rotateLeft(this.R, 3) ^ obj2.hashCode(), 3) ^ i9;
                if (obj3 == null) {
                    this.l++;
                }
                boolean z3 = i2 == 0;
                if (!this.Q) {
                    this.F.k++;
                    mr0 mr0Var = this.H;
                    int i10 = mr0Var.t;
                    if (z3) {
                        mr0Var.O(i, obj4, true, obj4);
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        mr0Var.O(i, obj3, false, obj2);
                    } else {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        mr0Var.O(i, obj3, false, obj4);
                    }
                    df0 df0Var3 = this.i;
                    if (df0Var3 != null) {
                        int i11 = (-2) - i10;
                        r00 r00Var = new r00(-1, i, i11, -1);
                        df0Var3.e.h(i11, new xv(-1, this.j - df0Var3.b, 0));
                        df0Var3.d.add(r00Var);
                    }
                    u(z3, null);
                    return;
                }
                boolean z4 = i2 == 1 && this.x;
                if (this.i == null) {
                    int g = this.F.g();
                    if (!z4 && g == i) {
                        ir0 ir0Var = this.F;
                        int i12 = ir0Var.g;
                        if (nz.l(obj3, i12 < ir0Var.h ? ir0Var.p(ir0Var.b, i12) : null)) {
                            U(obj2, z3);
                        }
                    }
                    ir0 ir0Var2 = this.F;
                    int[] iArr = ir0Var2.b;
                    ArrayList arrayList = new ArrayList();
                    if (ir0Var2.k <= 0) {
                        int i13 = ir0Var2.g;
                        while (i13 < ir0Var2.h) {
                            int i14 = i13 * 5;
                            int i15 = iArr[i14];
                            Object p = ir0Var2.p(iArr, i13);
                            int i16 = iArr[i14 + 1];
                            if ((i16 & 1073741824) != 0) {
                                z2 = z4;
                                i8 = 1;
                            } else {
                                z2 = z4;
                                i8 = i16 & 67108863;
                            }
                            arrayList.add(new r00(p, i15, i13, i8));
                            i13 += iArr[i14 + 3];
                            z4 = z2;
                        }
                    }
                    z = z4;
                    this.i = new df0(this.j, arrayList);
                    df0Var = this.i;
                    if (df0Var != null) {
                        ArrayList arrayList2 = df0Var.d;
                        p60 p60Var = df0Var.e;
                        int i17 = df0Var.b;
                        Object h00Var = obj3 != null ? new h00(Integer.valueOf(i), obj3) : Integer.valueOf(i);
                        a70 a70Var = ((l60) df0Var.f.getValue()).a;
                        Object g2 = a70Var.g(h00Var);
                        if (g2 == null) {
                            g2 = null;
                        } else if (g2 instanceof x60) {
                            x60 x60Var = (x60) g2;
                            Object j = x60Var.j(0);
                            if (x60Var.g()) {
                                a70Var.k(h00Var);
                            }
                            if (x60Var.b == 1) {
                                a70Var.m(h00Var, x60Var.d());
                            }
                            g2 = j;
                        } else {
                            a70Var.k(h00Var);
                        }
                        r00 r00Var2 = (r00) g2;
                        if (z || r00Var2 == null) {
                            this.F.k++;
                            this.Q = true;
                            this.J = null;
                            if (this.H.w) {
                                mr0 d = this.G.d();
                                this.H = d;
                                d.K();
                                this.I = false;
                                this.J = null;
                            }
                            this.H.d();
                            mr0 mr0Var2 = this.H;
                            int i18 = mr0Var2.t;
                            if (z3) {
                                mr0Var2.O(i, obj4, true, obj4);
                                i3 = 0;
                            } else if (obj2 != null) {
                                if (obj != null) {
                                    obj4 = obj;
                                }
                                i3 = 0;
                                mr0Var2.O(i, obj4, false, obj2);
                            } else {
                                i3 = 0;
                                mr0Var2.O(i, obj == null ? obj4 : obj, false, obj4);
                            }
                            this.M = this.H.b(i18);
                            int i19 = (-2) - i18;
                            r00 r00Var3 = new r00(-1, i, i19, -1);
                            p60Var.h(i19, new xv(-1, this.j - i17, i3));
                            arrayList2.add(r00Var3);
                            df0Var2 = new df0(z3 ? i3 : this.j, new ArrayList());
                            u(z3, df0Var2);
                            return;
                        }
                        int i20 = r00Var2.c;
                        arrayList2.add(r00Var2);
                        xv xvVar = (xv) p60Var.b(i20);
                        this.j = (xvVar != null ? xvVar.b : -1) + i17;
                        xv xvVar2 = (xv) p60Var.b(i20);
                        int i21 = xvVar2 != null ? xvVar2.a : -1;
                        int i22 = df0Var.c;
                        int i23 = i21 - i22;
                        int i24 = 8;
                        if (i21 > i22) {
                            Object[] objArr3 = p60Var.c;
                            long[] jArr = p60Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j2 = jArr[i25];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            if ((j2 & 255) < 128) {
                                                i7 = i24;
                                                xv xvVar3 = (xv) objArr3[(i25 << 3) + i27];
                                                i6 = i23;
                                                int i28 = xvVar3.a;
                                                if (i28 == i21) {
                                                    xvVar3.a = i22;
                                                } else if (i22 <= i28 && i28 < i21) {
                                                    xvVar3.a = i28 + 1;
                                                }
                                            } else {
                                                i6 = i23;
                                                i7 = i24;
                                            }
                                            j2 >>= i7;
                                            i27++;
                                            i23 = i6;
                                            i24 = i7;
                                        }
                                        i4 = i23;
                                        if (i26 != i24) {
                                            break;
                                        }
                                    } else {
                                        i4 = i23;
                                    }
                                    if (i25 == length) {
                                        break;
                                    }
                                    i25++;
                                    i23 = i4;
                                    i24 = 8;
                                }
                            } else {
                                i4 = i23;
                            }
                        } else {
                            i4 = i23;
                            if (i22 > i21) {
                                Object[] objArr4 = p60Var.c;
                                long[] jArr2 = p60Var.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i29 = 0;
                                    while (true) {
                                        long j3 = jArr2[i29];
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                            int i31 = 0;
                                            while (i31 < i30) {
                                                if ((j3 & 255) < 128) {
                                                    xv xvVar4 = (xv) objArr4[(i29 << 3) + i31];
                                                    int i32 = xvVar4.a;
                                                    if (i32 == i21) {
                                                        xvVar4.a = i22;
                                                    } else {
                                                        objArr2 = objArr4;
                                                        if (i21 + 1 <= i32 && i32 < i22) {
                                                            xvVar4.a = i32 - 1;
                                                        }
                                                        j3 >>= 8;
                                                        i31++;
                                                        objArr4 = objArr2;
                                                    }
                                                }
                                                objArr2 = objArr4;
                                                j3 >>= 8;
                                                i31++;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            if (i30 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        if (i29 == length2) {
                                            break;
                                        }
                                        i29++;
                                        objArr4 = objArr;
                                    }
                                }
                            }
                        }
                        jh jhVar = this.L;
                        int i33 = jhVar.f;
                        qh qhVar = jhVar.a;
                        jhVar.f = (i20 - qhVar.F.g) + i33;
                        this.F.r(i20);
                        if (i4 > 0) {
                            jhVar.d(false);
                            jz jzVar = jhVar.d;
                            ir0 ir0Var3 = qhVar.F;
                            if (ir0Var3.c > 0 && jzVar.a(-2) != (i5 = ir0Var3.i)) {
                                if (!jhVar.c && jhVar.e) {
                                    jhVar.d(false);
                                    jhVar.b.h.R(wb0.c);
                                    jhVar.c = true;
                                }
                                if (i5 > 0) {
                                    h2 a = ir0Var3.a(i5);
                                    jzVar.c(i5);
                                    jhVar.d(false);
                                    rc0 rc0Var = jhVar.b.h;
                                    rc0Var.R(vb0.c);
                                    px0.S(rc0Var, 0, a);
                                    jhVar.c = true;
                                }
                            }
                            rc0 rc0Var2 = jhVar.b.h;
                            rc0Var2.R(ac0.c);
                            rc0Var2.j[rc0Var2.k - rc0Var2.h[rc0Var2.i - 1].a] = i4;
                        }
                        U(obj2, z3);
                    }
                    df0Var2 = null;
                    u(z3, df0Var2);
                    return;
                }
                z = z4;
                df0Var = this.i;
                if (df0Var != null) {
                }
                df0Var2 = null;
                u(z3, df0Var2);
                return;
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.R, 3) ^ i, 3) ^ i9;
        }
        this.R = rotateLeft;
        if (obj3 == null) {
        }
        if (i2 == 0) {
        }
        if (!this.Q) {
        }
    }

    public final void S() {
        R(-127, 0, null, null);
    }

    public final void T(int i, jb0 jb0Var) {
        R(i, 0, jb0Var, null);
    }

    public final void U(Object obj, boolean z) {
        if (z) {
            ir0 ir0Var = this.F;
            if (ir0Var.k <= 0) {
                if ((ir0Var.b[(ir0Var.g * 5) + 1] & 1073741824) == 0) {
                    gh0.a("Expected a node group");
                }
                ir0Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.F.f() != obj) {
            jh jhVar = this.L;
            jhVar.getClass();
            jhVar.d(false);
            rc0 rc0Var = jhVar.b.h;
            rc0Var.R(kc0.c);
            px0.S(rc0Var, 0, obj);
        }
        this.F.u();
    }

    public final void V(int i) {
        int i2;
        int i3;
        if (this.i != null) {
            R(i, 0, null, null);
            return;
        }
        if (this.q) {
            th.c("A call to createNode(), emitNode() or useNode() expected");
        }
        this.R = Long.rotateLeft(Long.rotateLeft(this.R, 3) ^ i, 3) ^ this.l;
        this.l++;
        ir0 ir0Var = this.F;
        boolean z = this.Q;
        y7 y7Var = hh.a;
        if (z) {
            ir0Var.k++;
            this.H.O(i, y7Var, false, y7Var);
            u(false, null);
            return;
        }
        if (ir0Var.g() == i && ((i3 = ir0Var.g) >= ir0Var.h || (ir0Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            ir0Var.u();
            u(false, null);
            return;
        }
        if (ir0Var.k <= 0 && (i2 = ir0Var.g) != ir0Var.h) {
            int i4 = this.j;
            H();
            this.L.e(i4, ir0Var.s());
            th.a(this.r, i2, ir0Var.g);
        }
        ir0Var.k++;
        this.Q = true;
        this.J = null;
        if (this.H.w) {
            mr0 d = this.G.d();
            this.H = d;
            d.K();
            this.I = false;
            this.J = null;
        }
        mr0 mr0Var = this.H;
        mr0Var.d();
        int i5 = mr0Var.t;
        mr0Var.O(i, y7Var, false, y7Var);
        this.M = mr0Var.b(i5);
        u(false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qh W(int i) {
        ri0 ri0Var;
        boolean z;
        int i2;
        V(i);
        boolean z2 = this.Q;
        ArrayList arrayList = this.D;
        bi biVar = this.g;
        if (z2) {
            ri0 ri0Var2 = new ri0(biVar);
            arrayList.add(ri0Var2);
            f0(ri0Var2);
            ri0Var2.e = this.A;
            ri0Var2.b &= -17;
            return this;
        }
        int i3 = this.F.i;
        ArrayList arrayList2 = this.r;
        int e = th.e(arrayList2, i3);
        uz uzVar = e >= 0 ? (uz) arrayList2.remove(e) : null;
        Object m = this.F.m();
        if (nz.l(m, hh.a)) {
            ri0Var = new ri0(biVar);
            f0(ri0Var);
        } else {
            m.getClass();
            ri0Var = (ri0) m;
        }
        if (uzVar == null) {
            int i4 = ri0Var.b;
            boolean z3 = (i4 & 64) != 0;
            if (z3) {
                ri0Var.b = i4 & (-65);
            }
            if (!z3) {
                z = false;
                int i5 = ri0Var.b;
                ri0Var.b = !z ? i5 | 8 : i5 & (-9);
                arrayList.add(ri0Var);
                ri0Var.e = this.A;
                i2 = ri0Var.b;
                ri0Var.b = i2 & (-17);
                if ((i2 & 256) != 0) {
                    ri0Var.b = (i2 & (-273)) | 512;
                    rc0 rc0Var = this.L.b.h;
                    rc0Var.R(ic0.c);
                    px0.S(rc0Var, 0, ri0Var);
                    if (!this.x) {
                        int i6 = ri0Var.b;
                        if ((i6 & 128) != 0) {
                            this.x = true;
                            ri0Var.b = i6 | 1024;
                        }
                    }
                }
                return this;
            }
        }
        z = true;
        int i52 = ri0Var.b;
        ri0Var.b = !z ? i52 | 8 : i52 & (-9);
        arrayList.add(ri0Var);
        ri0Var.e = this.A;
        i2 = ri0Var.b;
        ri0Var.b = i2 & (-17);
        if ((i2 & 256) != 0) {
        }
        return this;
    }

    public final void X() {
        R(125, 2, null, null);
        this.q = true;
    }

    public final void Y() {
        this.l = 0;
        this.F = this.c.c();
        R(100, 0, null, null);
        vh vhVar = this.b;
        vhVar.o();
        gf0 h = vhVar.h();
        this.w.c(this.v ? 1 : 0);
        this.v = f(h);
        this.J = null;
        if (!this.p) {
            this.p = vhVar.d();
        }
        if (!this.B) {
            this.B = vhVar.e();
        }
        if (this.B) {
            lt0 lt0Var = ai.a;
            lt0Var.getClass();
            h = h.b(lt0Var, new mt0(y()));
        }
        this.t = h;
        Set set = (Set) a50.D(h, vy.a);
        if (set != null) {
            xh xhVar = this.S;
            if (xhVar == null) {
                xhVar = new xh(this.g);
                this.S = xhVar;
            }
            set.add(xhVar);
            vhVar.l(set);
        }
        long f = vhVar.f();
        R((int) (f ^ (f >>> 32)), 0, null, null);
    }

    public final boolean Z(ri0 ri0Var, Object obj) {
        h2 h2Var = ri0Var.c;
        if (h2Var == null) {
            return false;
        }
        int a = this.F.a.a(h2Var);
        if (!this.E || a < this.F.g) {
            return false;
        }
        ArrayList arrayList = this.r;
        int e = th.e(arrayList, a);
        if (e < 0) {
            int i = -(e + 1);
            if (!(obj instanceof yl)) {
                obj = null;
            }
            arrayList.add(i, new uz(ri0Var, a, obj));
            return true;
        }
        uz uzVar = (uz) arrayList.get(e);
        if (!(obj instanceof yl)) {
            uzVar.c = null;
            return true;
        }
        Object obj2 = uzVar.c;
        if (obj2 == null) {
            uzVar.c = obj;
            return true;
        }
        if (obj2 instanceof b70) {
            ((b70) obj2).a(obj);
            return true;
        }
        int i2 = wn0.a;
        b70 b70Var = new b70(2);
        b70Var.j(obj2);
        b70Var.j(obj);
        uzVar.c = b70Var;
        return true;
    }

    public final void a() {
        i();
        this.h.clear();
        this.m.b = 0;
        this.s.b = 0;
        this.w.b = 0;
        this.u = null;
        gr grVar = this.N;
        grVar.i.N();
        grVar.h.N();
        this.R = 0L;
        this.z = 0;
        this.q = false;
        this.Q = false;
        this.x = false;
        this.E = false;
        this.y = -1;
        ir0 ir0Var = this.F;
        if (!ir0Var.f) {
            ir0Var.c();
        }
        if (this.H.w) {
            return;
        }
        v();
    }

    public final void a0(a70 a70Var) {
        ArrayList arrayList = this.r;
        for (int B = px0.B(arrayList); -1 < B; B--) {
            uz uzVar = (uz) arrayList.get(B);
            h2 h2Var = uzVar.a.c;
            if (h2Var == null || !h2Var.a()) {
                arrayList.remove(B);
            } else {
                int i = uzVar.b;
                int i2 = h2Var.a;
                if (i != i2) {
                    uzVar.b = i2;
                }
            }
        }
        Object[] objArr = a70Var.b;
        Object[] objArr2 = a70Var.c;
        long[] jArr = a70Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            ri0 ri0Var = (ri0) obj;
                            h2 h2Var2 = ri0Var.c;
                            if (h2Var2 != null) {
                                int i7 = h2Var2.a;
                                if (obj2 == b2.L) {
                                    obj2 = null;
                                }
                                arrayList.add(new uz(ri0Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        de.Z(arrayList, th.f);
    }

    public final void b(qu quVar, Object obj) {
        if (this.Q) {
            rc0 rc0Var = this.N.h;
            rc0Var.R(lc0.c);
            px0.S(rc0Var, 0, obj);
            quVar.getClass();
            px0.k(2, quVar);
            px0.S(rc0Var, 1, quVar);
            return;
        }
        jh jhVar = this.L;
        jhVar.b();
        rc0 rc0Var2 = jhVar.b.h;
        rc0Var2.R(lc0.c);
        quVar.getClass();
        px0.k(2, quVar);
        px0.T(rc0Var2, 0, obj, 1, quVar);
    }

    public final void b0(int i, int i2) {
        if (g0(i) != i2) {
            if (i < 0) {
                n60 n60Var = this.o;
                if (n60Var == null) {
                    n60Var = new n60();
                    this.o = n60Var;
                }
                n60Var.f(i, i2);
                return;
            }
            int[] iArr = this.n;
            if (iArr == null) {
                int i3 = this.F.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.n = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final boolean c(float f) {
        Object C = C();
        if ((C instanceof Float) && f == ((Number) C).floatValue()) {
            return false;
        }
        f0(Float.valueOf(f));
        return true;
    }

    public final void c0(int i, int i2) {
        int g0 = g0(i);
        if (g0 != i2) {
            int i3 = i2 - g0;
            ArrayList arrayList = this.h;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int g02 = g0(i) + i3;
                b0(i, g02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        df0 df0Var = (df0) arrayList.get(i4);
                        if (df0Var != null && df0Var.a(i, g02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                ir0 ir0Var = this.F;
                if (i < 0) {
                    i = ir0Var.i;
                } else if (ir0Var.l(i)) {
                    return;
                } else {
                    i = this.F.q(i);
                }
            }
        }
    }

    public final boolean d(int i) {
        Object C = C();
        if ((C instanceof Integer) && i == ((Number) C).intValue()) {
            return false;
        }
        f0(Integer.valueOf(i));
        return true;
    }

    public final gf0 d0(gf0 gf0Var, gf0 gf0Var2) {
        gf0Var.getClass();
        ff0 ff0Var = new ff0(gf0Var);
        ff0Var.putAll(gf0Var2);
        gf0 b = ff0Var.b();
        T(204, th.d);
        C();
        f0(b);
        C();
        f0(gf0Var2);
        q(false);
        return b;
    }

    public final boolean e(long j) {
        Object C = C();
        if ((C instanceof Long) && j == ((Number) C).longValue()) {
            return false;
        }
        f0(Long.valueOf(j));
        return true;
    }

    public final void e0(Object obj) {
        int i;
        ir0 ir0Var;
        int i2;
        mr0 mr0Var;
        if (obj instanceof ck0) {
            ck0 ck0Var = (ck0) obj;
            h2 h2Var = null;
            if (this.Q) {
                mr0 mr0Var2 = this.H;
                int i3 = mr0Var2.t;
                if (i3 > mr0Var2.v + 1) {
                    int i4 = i3 - 1;
                    int C = mr0Var2.C(mr0Var2.b, i4);
                    while (true) {
                        i2 = i4;
                        i4 = C;
                        mr0Var = this.H;
                        if (i4 == mr0Var.v || i4 < 0) {
                            break;
                        } else {
                            C = mr0Var.C(mr0Var.b, i4);
                        }
                    }
                    h2Var = mr0Var.b(i2);
                }
            } else {
                ir0 ir0Var2 = this.F;
                int i5 = ir0Var2.g;
                if (i5 > ir0Var2.i + 1) {
                    int i6 = i5 - 1;
                    int q = ir0Var2.q(i6);
                    while (true) {
                        i = i6;
                        i6 = q;
                        ir0Var = this.F;
                        if (i6 == ir0Var.i || i6 < 0) {
                            break;
                        } else {
                            q = ir0Var.q(i6);
                        }
                    }
                    h2Var = ir0Var.a(i);
                }
            }
            dk0 dk0Var = new dk0(ck0Var, h2Var);
            if (this.Q) {
                rc0 rc0Var = this.L.b.h;
                rc0Var.R(cc0.c);
                px0.S(rc0Var, 0, dk0Var);
            }
            this.d.add(obj);
            obj = dk0Var;
        }
        f0(obj);
    }

    public final boolean f(Object obj) {
        if (nz.l(C(), obj)) {
            return false;
        }
        f0(obj);
        return true;
    }

    public final void f0(Object obj) {
        if (this.Q) {
            mr0 mr0Var = this.H;
            if (mr0Var.n <= 0 || mr0Var.i == mr0Var.k) {
                mr0Var.D(obj);
                return;
            }
            p60 p60Var = mr0Var.s;
            if (p60Var == null) {
                p60Var = new p60();
            }
            mr0Var.s = p60Var;
            int i = mr0Var.v;
            Object b = p60Var.b(i);
            if (b == null) {
                b = new x60();
                p60Var.h(i, b);
            }
            ((x60) b).a(obj);
            return;
        }
        ir0 ir0Var = this.F;
        boolean z = ir0Var.n;
        jh jhVar = this.L;
        if (!z) {
            h2 a = ir0Var.a(ir0Var.i);
            rc0 rc0Var = jhVar.b.h;
            rc0Var.R(lb0.c);
            px0.T(rc0Var, 0, a, 1, obj);
            return;
        }
        int b2 = (ir0Var.l - lr0.b(ir0Var.b, ir0Var.i)) - 1;
        if (jhVar.a.F.i - jhVar.f >= 0) {
            jhVar.d(true);
            rc0 rc0Var2 = jhVar.b.h;
            rc0Var2.R(xb0.g);
            px0.S(rc0Var2, 0, obj);
            rc0Var2.j[rc0Var2.k - rc0Var2.h[rc0Var2.i - 1].a] = b2;
            return;
        }
        ir0 ir0Var2 = this.F;
        h2 a2 = ir0Var2.a(ir0Var2.i);
        rc0 rc0Var3 = jhVar.b.h;
        rc0Var3.R(xb0.f);
        px0.T(rc0Var3, 0, obj, 1, a2);
        rc0Var3.j[rc0Var3.k - rc0Var3.h[rc0Var3.i - 1].a] = b2;
    }

    public final boolean g(boolean z) {
        Object C = C();
        if ((C instanceof Boolean) && z == ((Boolean) C).booleanValue()) {
            return false;
        }
        f0(Boolean.valueOf(z));
        return true;
    }

    public final int g0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.n;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.F.o(i) : i2;
        }
        n60 n60Var = this.o;
        if (n60Var == null || n60Var.c(i) < 0) {
            return 0;
        }
        int c = n60Var.c(i);
        if (c >= 0) {
            return n60Var.c[c];
        }
        throw new NoSuchElementException("Cannot find value for key " + i);
    }

    public final boolean h(Object obj) {
        if (C() == obj) {
            return false;
        }
        f0(obj);
        return true;
    }

    public final void h0() {
        if (!this.q) {
            th.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.q = false;
        if (this.Q) {
            th.c("useNode() called while inserting");
        }
        ir0 ir0Var = this.F;
        Object n = ir0Var.n(ir0Var.i);
        jh jhVar = this.L;
        jhVar.c();
        jhVar.h.add(n);
        if (this.x && (n instanceof p10)) {
            jhVar.b();
            jhVar.b.h.R(nc0.c);
        }
    }

    public final void i() {
        this.i = null;
        this.j = 0;
        this.k = 0;
        this.R = 0L;
        this.q = false;
        jh jhVar = this.L;
        jhVar.c = false;
        jhVar.d.b = 0;
        jhVar.f = 0;
        jhVar.e = true;
        jhVar.g = 0;
        jhVar.h.clear();
        jhVar.i = -1;
        jhVar.j = -1;
        jhVar.k = -1;
        jhVar.l = 0;
        this.D.clear();
        this.n = null;
        this.o = null;
    }

    public final Object j(ii0 ii0Var) {
        return a50.D(l(), ii0Var);
    }

    public final void k(bu buVar) {
        if (!this.q) {
            th.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.q = false;
        if (!this.Q) {
            th.c("createNode() can only be called when inserting");
        }
        jz jzVar = this.m;
        int i = jzVar.a[jzVar.b - 1];
        mr0 mr0Var = this.H;
        h2 b = mr0Var.b(mr0Var.v);
        this.k++;
        gr grVar = this.N;
        rc0 rc0Var = grVar.h;
        rc0Var.R(xb0.d);
        px0.S(rc0Var, 0, buVar);
        rc0Var.j[rc0Var.k - rc0Var.h[rc0Var.i - 1].a] = i;
        px0.S(rc0Var, 1, b);
        rc0 rc0Var2 = grVar.i;
        rc0Var2.R(xb0.e);
        rc0Var2.j[rc0Var2.k - rc0Var2.h[rc0Var2.i - 1].a] = i;
        px0.S(rc0Var2, 0, b);
    }

    public final gf0 l() {
        gf0 gf0Var;
        gf0 gf0Var2 = this.J;
        if (gf0Var2 != null) {
            return gf0Var2;
        }
        int i = this.F.i;
        boolean z = this.Q;
        jb0 jb0Var = th.c;
        if (z && this.I) {
            int i2 = this.H.v;
            while (i2 > 0) {
                mr0 mr0Var = this.H;
                if (mr0Var.b[mr0Var.q(i2) * 5] == 202 && nz.l(this.H.r(i2), jb0Var)) {
                    Object p = this.H.p(i2);
                    p.getClass();
                    gf0 gf0Var3 = (gf0) p;
                    this.J = gf0Var3;
                    return gf0Var3;
                }
                mr0 mr0Var2 = this.H;
                i2 = mr0Var2.C(mr0Var2.b, i2);
            }
        }
        if (this.F.c > 0) {
            while (i > 0) {
                if (this.F.i(i) == 202) {
                    ir0 ir0Var = this.F;
                    if (nz.l(ir0Var.p(ir0Var.b, i), jb0Var)) {
                        p60 p60Var = this.u;
                        if (p60Var == null || (gf0Var = (gf0) p60Var.b(i)) == null) {
                            ir0 ir0Var2 = this.F;
                            Object b = ir0Var2.b(ir0Var2.b, i);
                            b.getClass();
                            gf0Var = (gf0) b;
                        }
                        this.J = gf0Var;
                        return gf0Var;
                    }
                }
                i = this.F.q(i);
            }
        }
        gf0 gf0Var4 = this.t;
        this.J = gf0Var4;
        return gf0Var4;
    }

    public final List m() {
        boolean z = this.B;
        List list = wp.d;
        if (!z) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        mr0 mr0Var = this.H;
        arrayList.addAll(d31.l(mr0Var, null, mr0Var.t, null));
        ir0 ir0Var = this.F;
        if (!ir0Var.f && ir0Var.c != 0) {
            ni0 ni0Var = new ni0(ir0Var);
            int i = ir0Var.i;
            Object valueOf = Integer.valueOf(ir0Var.l - lr0.b(ir0Var.b, i));
            while (i >= 0) {
                ni0Var.d(ir0Var.a.f(i), valueOf);
                valueOf = ir0Var.a(i);
                i = ir0Var.q(i);
            }
            list = (ArrayList) ni0Var.a;
        }
        arrayList.addAll(list);
        arrayList.addAll(D());
        return arrayList;
    }

    public final void n() {
        Trace.beginSection("Compose:Composer.dispose");
        try {
            this.b.p(this);
            this.D.clear();
            this.r.clear();
            this.e.h.N();
            this.u = null;
            this.a.j();
        } finally {
            Trace.endSection();
        }
    }

    public final void o(a70 a70Var, eg egVar) {
        ArrayList arrayList = this.r;
        if (this.E) {
            th.c("Reentrant composition is not supported");
        }
        Trace.beginSection("Compose:recompose");
        try {
            long g = ur0.k().g();
            this.A = (int) (g ^ (g >>> 32));
            this.u = null;
            a0(a70Var);
            this.j = 0;
            this.E = true;
            try {
                Y();
                Object C = C();
                if (C != egVar && egVar != null) {
                    f0(egVar);
                }
                oh ohVar = this.C;
                l70 h = ud0.h();
                try {
                    h.b(ohVar);
                    jb0 jb0Var = th.a;
                    if (egVar != null) {
                        T(200, jb0Var);
                        nz.G(this, egVar);
                        q(false);
                    } else if (!this.v || C == null || C.equals(hh.a)) {
                        O();
                    } else {
                        T(200, jb0Var);
                        px0.k(2, C);
                        nz.G(this, (qu) C);
                        q(false);
                    }
                    h.j(h.f - 1);
                    t();
                    this.E = false;
                    arrayList.clear();
                    if (!this.H.w) {
                        th.c("Check failed");
                    }
                    v();
                } catch (Throwable th) {
                    h.j(h.f - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void p(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        p(this.F.q(i), i2);
        if (this.F.l(i)) {
            Object n = this.F.n(i);
            jh jhVar = this.L;
            jhVar.c();
            jhVar.h.add(n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05b7  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(boolean z) {
        long rotateRight;
        jz jzVar;
        ArrayList arrayList;
        int i;
        boolean z2;
        int i2;
        ir0 ir0Var;
        df0 df0Var;
        ?? r3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        jz jzVar2;
        int i8;
        int i9;
        ArrayList arrayList2;
        LinkedHashSet linkedHashSet;
        int i10;
        int i11;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet;
        int i12;
        df0 df0Var2;
        int i13;
        Object[] objArr;
        long[] jArr;
        int i14;
        Object[] objArr2;
        long[] jArr2;
        int i15;
        Object[] objArr3;
        long[] jArr3;
        int i16;
        Object[] objArr4;
        long[] jArr4;
        long rotateRight2;
        jz jzVar3 = this.m;
        int i17 = jzVar3.a[jzVar3.b - 2] - 1;
        boolean z3 = this.Q;
        y7 y7Var = hh.a;
        if (z3) {
            mr0 mr0Var = this.H;
            int i18 = mr0Var.v;
            int i19 = mr0Var.b[mr0Var.q(i18) * 5];
            Object r = this.H.r(i18);
            Object p = this.H.p(i18);
            if (r != null) {
                rotateRight2 = Long.rotateRight(Long.rotateRight(this.R, 3) ^ (r instanceof Enum ? ((Enum) r).ordinal() : r.hashCode()), 3);
            } else if (p == null || i19 != 207 || p.equals(y7Var)) {
                rotateRight2 = Long.rotateRight(Long.rotateRight(this.R ^ i17, 3) ^ i19, 3);
            } else {
                this.R = Long.rotateRight(Long.rotateRight(this.R ^ i17, 3) ^ p.hashCode(), 3);
            }
            this.R = rotateRight2;
        } else {
            ir0 ir0Var2 = this.F;
            int i20 = ir0Var2.i;
            int i21 = ir0Var2.i(i20);
            ir0 ir0Var3 = this.F;
            Object p2 = ir0Var3.p(ir0Var3.b, i20);
            ir0 ir0Var4 = this.F;
            Object b = ir0Var4.b(ir0Var4.b, i20);
            if (p2 != null) {
                rotateRight = Long.rotateRight(Long.rotateRight(this.R, 3) ^ (p2 instanceof Enum ? ((Enum) p2).ordinal() : p2.hashCode()), 3);
            } else if (b == null || i21 != 207 || b.equals(y7Var)) {
                rotateRight = Long.rotateRight(Long.rotateRight(this.R ^ i17, 3) ^ i21, 3);
            } else {
                this.R = Long.rotateRight(Long.rotateRight(this.R ^ i17, 3) ^ b.hashCode(), 3);
            }
            this.R = rotateRight;
        }
        int i22 = this.k;
        df0 df0Var3 = this.i;
        ArrayList arrayList5 = this.r;
        jh jhVar = this.L;
        if (df0Var3 != null) {
            p60 p60Var = df0Var3.e;
            int i23 = df0Var3.b;
            ArrayList arrayList6 = df0Var3.a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = df0Var3.d;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i24 = 0; i24 < size; i24++) {
                    hashSet2.add(arrayList7.get(i24));
                }
                i = -1;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                while (i25 < size3) {
                    r00 r00Var = (r00) arrayList6.get(i25);
                    if (hashSet2.contains(r00Var)) {
                        jzVar2 = jzVar3;
                        i8 = i25;
                        if (!linkedHashSet2.contains(r00Var)) {
                            int i28 = i26;
                            if (i28 < size2) {
                                r00 r00Var2 = (r00) arrayList7.get(i28);
                                if (r00Var2 != r00Var) {
                                    xv xvVar = (xv) p60Var.b(r00Var2.c);
                                    int i29 = xvVar != null ? xvVar.b : -1;
                                    linkedHashSet2.add(r00Var2);
                                    i9 = i28;
                                    i12 = i27;
                                    df0Var2 = df0Var3;
                                    if (i29 != i12) {
                                        xv xvVar2 = (xv) p60Var.b(r00Var2.c);
                                        int i30 = xvVar2 != null ? xvVar2.c : r00Var2.d;
                                        linkedHashSet = linkedHashSet2;
                                        int i31 = i29 + i23;
                                        i10 = size2;
                                        int i32 = i12 + i23;
                                        if (i30 > 0) {
                                            i11 = i23;
                                            int i33 = jhVar.l;
                                            if (i33 > 0) {
                                                arrayList3 = arrayList6;
                                                if (jhVar.j == i31 - i33 && jhVar.k == i32 - i33) {
                                                    jhVar.l = i33 + i30;
                                                }
                                            } else {
                                                arrayList3 = arrayList6;
                                            }
                                            jhVar.c();
                                            jhVar.j = i31;
                                            jhVar.k = i32;
                                            jhVar.l = i30;
                                        } else {
                                            i11 = i23;
                                            arrayList3 = arrayList6;
                                            jhVar.getClass();
                                        }
                                        if (i29 > i12) {
                                            Object[] objArr5 = p60Var.c;
                                            long[] jArr5 = p60Var.a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                arrayList4 = arrayList7;
                                                hashSet = hashSet2;
                                                int i34 = 0;
                                                while (true) {
                                                    long j = jArr5[i34];
                                                    int i35 = i30;
                                                    arrayList2 = arrayList5;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i36 = 8 - ((~(i34 - length)) >>> 31);
                                                        int i37 = 0;
                                                        while (i37 < i36) {
                                                            if ((j & 255) < 128) {
                                                                i16 = i37;
                                                                xv xvVar3 = (xv) objArr5[(i34 << 3) + i37];
                                                                objArr4 = objArr5;
                                                                int i38 = xvVar3.b;
                                                                jArr4 = jArr5;
                                                                if (i29 <= i38 && i38 < i29 + i35) {
                                                                    xvVar3.b = (i38 - i29) + i12;
                                                                } else if (i12 <= i38 && i38 < i29) {
                                                                    xvVar3.b = i38 + i35;
                                                                }
                                                            } else {
                                                                i16 = i37;
                                                                objArr4 = objArr5;
                                                                jArr4 = jArr5;
                                                            }
                                                            j >>= 8;
                                                            i37 = i16 + 1;
                                                            objArr5 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                        if (i36 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i34 == length) {
                                                        break;
                                                    }
                                                    i34++;
                                                    arrayList5 = arrayList2;
                                                    i30 = i35;
                                                    objArr5 = objArr3;
                                                    jArr5 = jArr3;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                        } else {
                                            int i39 = i30;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            hashSet = hashSet2;
                                            if (i12 > i29) {
                                                Object[] objArr6 = p60Var.c;
                                                long[] jArr6 = p60Var.a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i40 = 0;
                                                    while (true) {
                                                        long j2 = jArr6[i40];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i41 = 8 - ((~(i40 - length2)) >>> 31);
                                                            int i42 = 0;
                                                            while (i42 < i41) {
                                                                if ((j2 & 255) < 128) {
                                                                    objArr2 = objArr6;
                                                                    xv xvVar4 = (xv) objArr6[(i40 << 3) + i42];
                                                                    jArr2 = jArr6;
                                                                    int i43 = xvVar4.b;
                                                                    i15 = i29;
                                                                    if (i29 <= i43 && i43 < i15 + i39) {
                                                                        xvVar4.b = (i43 - i15) + i12;
                                                                    } else if (i15 + 1 <= i43 && i43 < i12) {
                                                                        xvVar4.b = i43 - i39;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                    i15 = i29;
                                                                }
                                                                j2 >>= 8;
                                                                i42++;
                                                                jArr6 = jArr2;
                                                                objArr6 = objArr2;
                                                                i29 = i15;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i14 = i29;
                                                            if (i41 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i14 = i29;
                                                        }
                                                        if (i40 == length2) {
                                                            break;
                                                        }
                                                        i40++;
                                                        jArr6 = jArr;
                                                        objArr6 = objArr;
                                                        i29 = i14;
                                                    }
                                                }
                                            }
                                        }
                                        i13 = i8;
                                    } else {
                                        arrayList2 = arrayList5;
                                        linkedHashSet = linkedHashSet2;
                                        i10 = size2;
                                        i11 = i23;
                                        arrayList3 = arrayList6;
                                    }
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i13 = i8;
                                } else {
                                    i9 = i28;
                                    arrayList2 = arrayList5;
                                    linkedHashSet = linkedHashSet2;
                                    i10 = size2;
                                    i11 = i23;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i12 = i27;
                                    df0Var2 = df0Var3;
                                    i13 = i8 + 1;
                                }
                                i26 = i9 + 1;
                                xv xvVar5 = (xv) p60Var.b(r00Var2.c);
                                int i44 = i12 + (xvVar5 != null ? xvVar5.c : r00Var2.d);
                                i25 = i13;
                                df0Var3 = df0Var2;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i10;
                                i23 = i11;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList4;
                                hashSet2 = hashSet;
                                arrayList5 = arrayList2;
                                i27 = i44;
                                jzVar3 = jzVar2;
                            } else {
                                i26 = i28;
                                jzVar3 = jzVar2;
                                i25 = i8;
                            }
                        }
                    } else {
                        jzVar2 = jzVar3;
                        xv xvVar6 = (xv) p60Var.b(r00Var.c);
                        int i45 = xvVar6 != null ? xvVar6.b : -1;
                        int i46 = r00Var.c;
                        i8 = i25;
                        jhVar.e(i45 + i23, r00Var.d);
                        df0Var3.a(i46, 0);
                        jhVar.f = (i46 - jhVar.a.F.g) + jhVar.f;
                        this.F.r(i46);
                        H();
                        this.F.s();
                        th.a(arrayList5, i46, this.F.b[(i46 * 5) + 3] + i46);
                    }
                    i25 = i8 + 1;
                    jzVar3 = jzVar2;
                }
                jzVar = jzVar3;
                arrayList = arrayList5;
                jhVar.c();
                if (arrayList6.size() > 0) {
                    ir0 ir0Var5 = this.F;
                    jhVar.f = (ir0Var5.h - jhVar.a.F.g) + jhVar.f;
                    ir0Var5.t();
                }
                z2 = this.Q;
                if (!z2) {
                    ir0 ir0Var6 = this.F;
                    int i47 = ir0Var6.m - ir0Var6.l;
                    if (i47 > 0) {
                        if (i47 > 0) {
                            jhVar.d(false);
                            jz jzVar4 = jhVar.d;
                            ir0 ir0Var7 = jhVar.a.F;
                            if (ir0Var7.c > 0 && jzVar4.a(-2) != (i7 = ir0Var7.i)) {
                                if (!jhVar.c && jhVar.e) {
                                    jhVar.d(false);
                                    jhVar.b.h.R(wb0.c);
                                    jhVar.c = true;
                                }
                                if (i7 > 0) {
                                    h2 a = ir0Var7.a(i7);
                                    jzVar4.c(i7);
                                    jhVar.d(false);
                                    rc0 rc0Var = jhVar.b.h;
                                    rc0Var.R(vb0.c);
                                    px0.S(rc0Var, 0, a);
                                    jhVar.c = true;
                                }
                            }
                            rc0 rc0Var2 = jhVar.b.h;
                            rc0Var2.R(jc0.c);
                            rc0Var2.j[rc0Var2.k - rc0Var2.h[rc0Var2.i - 1].a] = i47;
                        } else {
                            jhVar.getClass();
                        }
                    }
                }
                i2 = this.j;
                while (true) {
                    ir0Var = this.F;
                    if (ir0Var.k > 0 && (i6 = ir0Var.g) != ir0Var.h) {
                        H();
                        jhVar.e(i2, this.F.s());
                        th.a(arrayList, i6, this.F.g);
                    }
                }
                if (z2) {
                    if (z) {
                        jhVar.a();
                    }
                    int i48 = jhVar.a.F.i;
                    jz jzVar5 = jhVar.d;
                    int i49 = i;
                    if (jzVar5.a(i49) > i48) {
                        th.c("Missed recording an endGroup");
                    }
                    if (jzVar5.a(i49) == i48) {
                        jhVar.d(false);
                        jzVar5.b();
                        jhVar.b.h.R(sb0.c);
                    }
                    int i50 = this.F.i;
                    if (i22 != g0(i50)) {
                        c0(i50, i22);
                    }
                    if (z) {
                        i22 = 1;
                    }
                    this.F.e();
                    jhVar.c();
                } else {
                    if (z) {
                        gr grVar = this.N;
                        rc0 rc0Var3 = grVar.i;
                        if (!rc0Var3.Q()) {
                            th.c("Cannot end node insertion, there are no pending operations that can be realized.");
                        }
                        rc0 rc0Var4 = grVar.h;
                        oc0[] oc0VarArr = rc0Var3.h;
                        int i51 = rc0Var3.i - 1;
                        rc0Var3.i = i51;
                        oc0 oc0Var = oc0VarArr[i51];
                        oc0VarArr[i51] = null;
                        rc0Var4.R(oc0Var);
                        Object[] objArr7 = rc0Var3.l;
                        Object[] objArr8 = rc0Var4.l;
                        int i52 = rc0Var4.m;
                        int i53 = oc0Var.b;
                        int i54 = rc0Var3.m;
                        int i55 = i54 - i53;
                        System.arraycopy(objArr7, i55, objArr8, i52 - i53, i54 - i55);
                        Object[] objArr9 = rc0Var3.l;
                        int i56 = rc0Var3.m;
                        Arrays.fill(objArr9, i56 - i53, i56, (Object) null);
                        int[] iArr = rc0Var3.j;
                        int[] iArr2 = rc0Var4.j;
                        int i57 = rc0Var4.k;
                        int i58 = oc0Var.a;
                        int i59 = rc0Var3.k;
                        p8.R(iArr, iArr2, i57 - i58, i59 - i58, i59);
                        rc0Var3.m -= i53;
                        rc0Var3.k -= i58;
                        i22 = 1;
                    }
                    if (this.F.k <= 0) {
                        gh0.a("Unbalanced begin/end empty");
                    }
                    r4.k--;
                    mr0 mr0Var2 = this.H;
                    int i60 = mr0Var2.v;
                    mr0Var2.j();
                    if (this.F.k <= 0) {
                        int i61 = (-2) - i60;
                        this.H.k();
                        this.H.e(true);
                        h2 h2Var = this.M;
                        boolean P = this.N.h.P();
                        jr0 jr0Var = this.G;
                        if (P) {
                            jhVar.b();
                            jhVar.d(false);
                            jz jzVar6 = jhVar.d;
                            ir0 ir0Var8 = jhVar.a.F;
                            if (ir0Var8.c > 0 && jzVar6.a(-2) != (i5 = ir0Var8.i)) {
                                if (!jhVar.c && jhVar.e) {
                                    jhVar.d(false);
                                    jhVar.b.h.R(wb0.c);
                                    jhVar.c = true;
                                }
                                if (i5 > 0) {
                                    h2 a2 = ir0Var8.a(i5);
                                    jzVar6.c(i5);
                                    jhVar.d(false);
                                    rc0 rc0Var5 = jhVar.b.h;
                                    rc0Var5.R(vb0.c);
                                    px0.S(rc0Var5, 0, a2);
                                    i4 = 1;
                                    jhVar.c = true;
                                    jhVar.c();
                                    rc0 rc0Var6 = jhVar.b.h;
                                    rc0Var6.R(yb0.c);
                                    px0.T(rc0Var6, 0, h2Var, i4, jr0Var);
                                    r3 = 0;
                                }
                            }
                            i4 = 1;
                            jhVar.c();
                            rc0 rc0Var62 = jhVar.b.h;
                            rc0Var62.R(yb0.c);
                            px0.T(rc0Var62, 0, h2Var, i4, jr0Var);
                            r3 = 0;
                        } else {
                            gr grVar2 = this.N;
                            jhVar.b();
                            jhVar.d(false);
                            jz jzVar7 = jhVar.d;
                            ir0 ir0Var9 = jhVar.a.F;
                            if (ir0Var9.c > 0 && jzVar7.a(-2) != (i3 = ir0Var9.i)) {
                                if (!jhVar.c && jhVar.e) {
                                    jhVar.d(false);
                                    jhVar.b.h.R(wb0.c);
                                    jhVar.c = true;
                                }
                                if (i3 > 0) {
                                    h2 a3 = ir0Var9.a(i3);
                                    jzVar7.c(i3);
                                    jhVar.d(false);
                                    rc0 rc0Var7 = jhVar.b.h;
                                    rc0Var7.R(vb0.c);
                                    px0.S(rc0Var7, 0, a3);
                                    jhVar.c = true;
                                }
                            }
                            jhVar.c();
                            rc0 rc0Var8 = jhVar.b.h;
                            rc0Var8.R(zb0.c);
                            int i62 = rc0Var8.m - rc0Var8.h[rc0Var8.i - 1].b;
                            Object[] objArr10 = rc0Var8.l;
                            objArr10[i62] = h2Var;
                            objArr10[i62 + 1] = jr0Var;
                            objArr10[i62 + 2] = grVar2;
                            this.N = new gr();
                            r3 = 0;
                        }
                        this.Q = r3;
                        if (this.c.e != 0) {
                            b0(i61, r3);
                            c0(i61, i22);
                        }
                    }
                }
                df0Var = (df0) this.h.remove(r3.size() - 1);
                if (df0Var != null && !z2) {
                    df0Var.c++;
                }
                this.i = df0Var;
                this.j = jzVar.b() + i22;
                this.l = jzVar.b();
                this.k = jzVar.b() + i22;
            }
        }
        jzVar = jzVar3;
        arrayList = arrayList5;
        i = -1;
        z2 = this.Q;
        if (!z2) {
        }
        i2 = this.j;
        while (true) {
            ir0Var = this.F;
            if (ir0Var.k > 0) {
                break;
            }
            H();
            jhVar.e(i2, this.F.s());
            th.a(arrayList, i6, this.F.g);
        }
        if (z2) {
        }
        df0Var = (df0) this.h.remove(r3.size() - 1);
        if (df0Var != null) {
            df0Var.c++;
        }
        this.i = df0Var;
        this.j = jzVar.b() + i22;
        this.l = jzVar.b();
        this.k = jzVar.b() + i22;
    }

    public final void r() {
        q(false);
        ri0 w = w();
        if (w != null) {
            int i = w.b;
            if ((i & 1) != 0) {
                w.b = i | 2;
            }
        }
    }

    public final ri0 s() {
        ri0 ri0Var;
        h2 a;
        mu muVar;
        ArrayList arrayList = this.D;
        final ri0 ri0Var2 = !arrayList.isEmpty() ? (ri0) arrayList.remove(arrayList.size() - 1) : null;
        if (ri0Var2 != null) {
            int i = ri0Var2.b;
            ri0Var2.b = i & (-9);
            final int i2 = this.A;
            final w60 w60Var = ri0Var2.f;
            if (w60Var != null && (i & 16) == 0) {
                Object[] objArr = w60Var.b;
                int[] iArr = w60Var.c;
                long[] jArr = w60Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    loop0: while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((j & 255) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    Object obj = objArr[i6];
                                    if (iArr[i6] != i2) {
                                        muVar = new mu() { // from class: qi0
                                            @Override // defpackage.mu
                                            public final Object c(Object obj2) {
                                                uh uhVar;
                                                uh uhVar2;
                                                int i7;
                                                uh uhVar3 = (uh) obj2;
                                                ri0 ri0Var3 = ri0.this;
                                                int i8 = ri0Var3.e;
                                                int i9 = i2;
                                                if (i8 == i9) {
                                                    w60 w60Var2 = ri0Var3.f;
                                                    w60 w60Var3 = w60Var;
                                                    if (nz.l(w60Var3, w60Var2) && (uhVar3 instanceof bi)) {
                                                        long[] jArr2 = w60Var3.a;
                                                        int length2 = jArr2.length - 2;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                long j2 = jArr2[i10];
                                                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i11 = 8;
                                                                    int i12 = 8 - ((~(i10 - length2)) >>> 31);
                                                                    int i13 = 0;
                                                                    while (i13 < i12) {
                                                                        if ((255 & j2) < 128) {
                                                                            int i14 = (i10 << 3) + i13;
                                                                            Object obj3 = w60Var3.b[i14];
                                                                            boolean z = w60Var3.c[i14] != i9;
                                                                            if (z) {
                                                                                bi biVar = (bi) uhVar3;
                                                                                i7 = i11;
                                                                                a70 a70Var = biVar.j;
                                                                                ld0.o(a70Var, obj3, ri0Var3);
                                                                                uhVar2 = uhVar3;
                                                                                if (obj3 instanceof yl) {
                                                                                    yl ylVar = (yl) obj3;
                                                                                    if (!a70Var.c(ylVar)) {
                                                                                        ld0.p(biVar.m, ylVar);
                                                                                    }
                                                                                    a70 a70Var2 = ri0Var3.g;
                                                                                    if (a70Var2 != null) {
                                                                                        a70Var2.k(obj3);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                uhVar2 = uhVar3;
                                                                                i7 = i11;
                                                                            }
                                                                            if (z) {
                                                                                w60Var3.g(i14);
                                                                            }
                                                                        } else {
                                                                            uhVar2 = uhVar3;
                                                                            i7 = i11;
                                                                        }
                                                                        j2 >>= i7;
                                                                        i13++;
                                                                        i11 = i7;
                                                                        uhVar3 = uhVar2;
                                                                    }
                                                                    uhVar = uhVar3;
                                                                    if (i12 != i11) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    uhVar = uhVar3;
                                                                }
                                                                if (i10 == length2) {
                                                                    break;
                                                                }
                                                                i10++;
                                                                uhVar3 = uhVar;
                                                            }
                                                        }
                                                    }
                                                }
                                                return ky0.a;
                                            }
                                        };
                                        break loop0;
                                    }
                                }
                                j >>= 8;
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
            muVar = null;
            jh jhVar = this.L;
            if (muVar != null) {
                rc0 rc0Var = jhVar.b.h;
                rc0Var.R(rb0.c);
                px0.T(rc0Var, 0, muVar, 1, this.g);
            }
            int i7 = ri0Var2.b;
            if ((i7 & 512) != 0) {
                ri0Var2.b = i7 & (-513);
                rc0 rc0Var2 = jhVar.b.h;
                rc0Var2.R(ub0.c);
                px0.S(rc0Var2, 0, ri0Var2);
                int i8 = ri0Var2.b;
                ri0Var2.b = i8 & (-129);
                if ((i8 & 1024) != 0) {
                    ri0Var2.b = i8 & (-1153);
                    this.x = false;
                }
            }
        }
        if (ri0Var2 != null) {
            int i9 = ri0Var2.b;
            if ((i9 & 16) == 0 && ((i9 & 1) != 0 || this.p)) {
                if (ri0Var2.c == null) {
                    if (this.Q) {
                        mr0 mr0Var = this.H;
                        a = mr0Var.b(mr0Var.v);
                    } else {
                        ir0 ir0Var = this.F;
                        a = ir0Var.a(ir0Var.i);
                    }
                    ri0Var2.c = a;
                }
                ri0Var2.b &= -5;
                ri0Var = ri0Var2;
                q(false);
                return ri0Var;
            }
        }
        ri0Var = null;
        q(false);
        return ri0Var;
    }

    public final void t() {
        q(false);
        this.b.b();
        q(false);
        jh jhVar = this.L;
        if (jhVar.c) {
            jhVar.d(false);
            jhVar.d(false);
            jhVar.b.h.R(sb0.c);
            jhVar.c = false;
        }
        jhVar.b();
        if (jhVar.d.b != 0) {
            th.c("Missed recording an endGroup()");
        }
        if (!this.h.isEmpty()) {
            th.c("Start/end imbalance");
        }
        i();
        this.F.c();
        this.v = this.w.b() != 0;
    }

    public final void u(boolean z, df0 df0Var) {
        this.h.add(this.i);
        this.i = df0Var;
        int i = this.k;
        jz jzVar = this.m;
        jzVar.c(i);
        jzVar.c(this.l);
        jzVar.c(this.j);
        if (z) {
            this.j = 0;
        }
        this.k = 0;
        this.l = 0;
    }

    public final void v() {
        jr0 jr0Var = new jr0();
        if (this.B) {
            jr0Var.b();
        }
        if (this.b.c()) {
            jr0Var.n = new p60();
        }
        this.G = jr0Var;
        mr0 d = jr0Var.d();
        d.e(true);
        this.H = d;
    }

    public final ri0 w() {
        if (this.z != 0) {
            return null;
        }
        ArrayList arrayList = this.D;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (ri0) arrayList.get(arrayList.size() - 1);
    }

    public final boolean x() {
        if (!z() || this.v) {
            return true;
        }
        ri0 w = w();
        return (w == null || (w.b & 4) == 0) ? false : true;
    }

    public final yh y() {
        if (this.B) {
            return this.O;
        }
        return null;
    }

    public final boolean z() {
        ri0 w;
        return (this.Q || this.x || this.v || (w = w()) == null || (w.b & 8) != 0) ? false : true;
    }
}
