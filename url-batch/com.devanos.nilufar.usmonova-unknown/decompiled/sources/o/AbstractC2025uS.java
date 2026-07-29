package o;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.uS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2025uS {
    public static final C0950e6 a = new C0950e6(22);
    public static final Object b = new Object();
    public static C1959tS c;
    public static int d;
    public static final C1378ke e;
    public static final C1739q5 f;
    public static Object g;
    public static Object h;
    public static final AtomicReference i;
    public static final AbstractC1696pS j;
    public static final Z6 k;

    /* JADX WARN: Type inference failed for: r3v2, types: [int[], java.lang.Cloneable] */
    static {
        C1959tS c1959tS = C1959tS.l;
        c = c1959tS;
        d = 2;
        C1378ke c1378ke = new C1378ke(2);
        c1378ke.i = new int[16];
        c1378ke.l = new int[16];
        ?? r3 = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            r3[i2] = i3;
            i2 = i3;
        }
        c1378ke.m = r3;
        e = c1378ke;
        C1739q5 c1739q5 = new C1739q5();
        c1739q5.c = new int[16];
        c1739q5.d = new G00[16];
        f = c1739q5;
        C1318jk c1318jk = C1318jk.h;
        g = c1318jk;
        h = c1318jk;
        int i4 = d;
        d = i4 + 1;
        C0201Hq c0201Hq = new C0201Hq(i4, c1959tS);
        c = c.n(c0201Hq.b);
        AtomicReference atomicReference = new AtomicReference(c0201Hq);
        i = atomicReference;
        j = (AbstractC1696pS) atomicReference.get();
        k = new Z6(0);
    }

    public static final void a() {
        f(RP.v);
    }

    public static final InterfaceC2114vp b(InterfaceC2114vp interfaceC2114vp, InterfaceC2114vp interfaceC2114vp2) {
        return (interfaceC2114vp == null || interfaceC2114vp2 == null || interfaceC2114vp == interfaceC2114vp2) ? interfaceC2114vp == null ? interfaceC2114vp2 : interfaceC2114vp : new C0149Fq(interfaceC2114vp, interfaceC2114vp2, 2);
    }

    public static final HashMap c(SD sd, SD sd2, C1959tS c1959tS) {
        long[] jArr;
        int i2;
        C1959tS c1959tS2;
        long[] jArr2;
        int i3;
        C1959tS c1959tS3;
        int i4;
        QD w = sd2.w();
        int d2 = sd.d();
        if (w != null) {
            C1959tS m = sd2.e().n(sd2.d()).m(sd2.j);
            Object[] objArr = w.b;
            long[] jArr3 = w.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i5 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j2 = jArr3[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j2) < 128) {
                                GT gt = (GT) objArr[(i5 << 3) + i8];
                                HT b2 = gt.b();
                                i4 = i6;
                                HT q = q(b2, d2, c1959tS);
                                if (q == null) {
                                    jArr2 = jArr3;
                                } else {
                                    jArr2 = jArr3;
                                    HT q2 = q(b2, d2, m);
                                    if (q2 != null && !q.equals(q2)) {
                                        i3 = d2;
                                        c1959tS3 = m;
                                        HT q3 = q(b2, sd2.d(), sd2.e());
                                        if (q3 == null) {
                                            throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                                        }
                                        HT d3 = gt.d(q2, q, q3);
                                        if (d3 == null) {
                                            return null;
                                        }
                                        if (hashMap == null) {
                                            hashMap = new HashMap();
                                        }
                                        hashMap.put(q, d3);
                                        hashMap = hashMap;
                                    }
                                }
                                i3 = d2;
                                c1959tS3 = m;
                            } else {
                                jArr2 = jArr3;
                                i3 = d2;
                                c1959tS3 = m;
                                i4 = i6;
                            }
                            j2 >>= i4;
                            i8++;
                            i6 = i4;
                            jArr3 = jArr2;
                            d2 = i3;
                            m = c1959tS3;
                        }
                        jArr = jArr3;
                        i2 = d2;
                        c1959tS2 = m;
                        if (i7 != i6) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        i2 = d2;
                        c1959tS2 = m;
                    }
                    if (i5 == length) {
                        return hashMap;
                    }
                    i5++;
                    jArr3 = jArr;
                    d2 = i2;
                    m = c1959tS2;
                }
            }
        }
        return null;
    }

    public static final void d(AbstractC1696pS abstractC1696pS) {
        int i2;
        if (c.l(abstractC1696pS.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: id=");
        sb.append(abstractC1696pS.d());
        sb.append(", disposed=");
        sb.append(abstractC1696pS.c);
        sb.append(", applied=");
        SD sd = abstractC1696pS instanceof SD ? (SD) abstractC1696pS : null;
        sb.append(sd != null ? Boolean.valueOf(sd.m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (b) {
            C1378ke c1378ke = e;
            i2 = c1378ke.j > 0 ? ((int[]) c1378ke.i)[0] : -1;
        }
        sb.append(i2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final C1959tS e(C1959tS c1959tS, int i2, int i3) {
        while (i2 < i3) {
            c1959tS = c1959tS.n(i2);
            i2++;
        }
        return c1959tS;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    public static final Object f(InterfaceC2114vp interfaceC2114vp) {
        Object obj;
        QD qd;
        Object t;
        AbstractC1696pS abstractC1696pS = j;
        AbstractC0048Bt.l(abstractC1696pS, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (b) {
            try {
                obj = i.get();
                qd = ((C0201Hq) obj).h;
                if (qd != null) {
                    k.addAndGet(1);
                }
                t = t((AbstractC1696pS) obj, interfaceC2114vp);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (qd != null) {
            try {
                ?? r4 = g;
                int size = r4.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC2312yp) r4.get(i2)).invoke(new YP(qd), obj);
                }
            } finally {
                k.addAndGet(-1);
            }
        }
        synchronized (b) {
            g();
            if (qd != null) {
                Object[] objArr = qd.b;
                long[] jArr = qd.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    p((GT) objArr[(i3 << 3) + i5]);
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
        return t;
    }

    public static final void g() {
        C1739q5 c1739q5 = f;
        int i2 = c1739q5.b;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            G00 g00 = ((G00[]) c1739q5.d)[i3];
            Object obj = g00 != null ? g00.get() : null;
            if (obj != null && o((GT) obj)) {
                if (i4 != i3) {
                    ((G00[]) c1739q5.d)[i4] = g00;
                    int[] iArr = (int[]) c1739q5.c;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((G00[]) c1739q5.d)[i5] = null;
            ((int[]) c1739q5.c)[i5] = 0;
        }
        if (i4 != i2) {
            c1739q5.b = i4;
        }
    }

    public static final AbstractC1696pS h(AbstractC1696pS abstractC1696pS, InterfaceC2114vp interfaceC2114vp, boolean z) {
        boolean z2 = abstractC1696pS instanceof SD;
        if (z2 || abstractC1696pS == null) {
            return new C1963tW(z2 ? (SD) abstractC1696pS : null, interfaceC2114vp, null, false, z);
        }
        return new C2029uW(abstractC1696pS, interfaceC2114vp, z);
    }

    public static final HT i(HT ht) {
        HT q;
        AbstractC1696pS k2 = k();
        HT q2 = q(ht, k2.d(), k2.e());
        if (q2 != null) {
            return q2;
        }
        synchronized (b) {
            AbstractC1696pS k3 = k();
            q = q(ht, k3.d(), k3.e());
        }
        if (q != null) {
            return q;
        }
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final HT j(HT ht, AbstractC1696pS abstractC1696pS) {
        HT q = q(ht, abstractC1696pS.d(), abstractC1696pS.e());
        if (q != null) {
            return q;
        }
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final AbstractC1696pS k() {
        AbstractC1696pS abstractC1696pS = (AbstractC1696pS) a.get();
        return abstractC1696pS == null ? (AbstractC1696pS) i.get() : abstractC1696pS;
    }

    public static final InterfaceC2114vp l(InterfaceC2114vp interfaceC2114vp, InterfaceC2114vp interfaceC2114vp2, boolean z) {
        if (!z) {
            interfaceC2114vp2 = null;
        }
        return (interfaceC2114vp == null || interfaceC2114vp2 == null || interfaceC2114vp == interfaceC2114vp2) ? interfaceC2114vp == null ? interfaceC2114vp2 : interfaceC2114vp : new C0149Fq(interfaceC2114vp, interfaceC2114vp2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final HT m(HT ht, GT gt) {
        HT b2 = gt.b();
        int i2 = d;
        C1378ke c1378ke = e;
        if (c1378ke.j > 0) {
            i2 = ((int[]) c1378ke.i)[0];
        }
        int i3 = i2 - 1;
        HT ht2 = null;
        HT ht3 = null;
        while (true) {
            if (b2 != null) {
                int i4 = b2.a;
                if (i4 == 0) {
                    break;
                }
                if (i4 != 0 && i4 <= i3) {
                    if ((r6 = i4 + 0) >= 0) {
                    }
                    boolean z = false;
                    if (z) {
                        continue;
                    } else if (ht3 == null) {
                        ht3 = b2;
                    } else if (b2.a >= ht3.a) {
                        ht2 = ht3;
                    }
                }
                b2 = b2.b;
            } else {
                break;
            }
        }
        ht2 = b2;
        if (ht2 != null) {
            ht2.a = Integer.MAX_VALUE;
            return ht2;
        }
        HT b3 = ht.b();
        b3.a = Integer.MAX_VALUE;
        b3.b = gt.b();
        gt.e(b3);
        return b3;
    }

    public static final HT n(HT ht, GT gt, AbstractC1696pS abstractC1696pS, HT ht2) {
        HT m;
        if (abstractC1696pS.g()) {
            abstractC1696pS.n(gt);
        }
        int d2 = abstractC1696pS.d();
        if (ht2.a == d2) {
            return ht2;
        }
        synchronized (b) {
            m = m(ht, gt);
        }
        m.a = d2;
        if (ht2.a != 1) {
            abstractC1696pS.n(gt);
        }
        return m;
    }

    public static final boolean o(GT gt) {
        HT ht;
        int i2 = d;
        C1378ke c1378ke = e;
        if (c1378ke.j > 0) {
            i2 = ((int[]) c1378ke.i)[0];
        }
        HT ht2 = null;
        HT ht3 = null;
        int i3 = 0;
        for (HT b2 = gt.b(); b2 != null; b2 = b2.b) {
            int i4 = b2.a;
            if (i4 != 0) {
                if (i4 >= i2) {
                    i3++;
                } else if (ht2 == null) {
                    i3++;
                    ht2 = b2;
                } else {
                    if (i4 < ht2.a) {
                        ht = ht2;
                        ht2 = b2;
                    } else {
                        ht = b2;
                    }
                    if (ht3 == null) {
                        ht3 = gt.b();
                        HT ht4 = ht3;
                        while (true) {
                            if (ht3 == null) {
                                ht3 = ht4;
                                break;
                            }
                            int i5 = ht3.a;
                            if (i5 >= i2) {
                                break;
                            }
                            if (ht4.a < i5) {
                                ht4 = ht3;
                            }
                            ht3 = ht3.b;
                        }
                    }
                    ht2.a = 0;
                    ht2.a(ht3);
                    ht2 = ht;
                }
            }
        }
        return i3 > 1;
    }

    public static final void p(GT gt) {
        if (o(gt)) {
            C1739q5 c1739q5 = f;
            int i2 = c1739q5.b;
            int identityHashCode = System.identityHashCode(gt);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = c1739q5.b - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) c1739q5.c)[i6];
                    if (i7 < identityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > identityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        G00 g00 = ((G00[]) c1739q5.d)[i6];
                        if (gt != (g00 != null ? g00.get() : null)) {
                            for (int i8 = i6 - 1; -1 < i8 && ((int[]) c1739q5.c)[i8] == identityHashCode; i8--) {
                                G00 g002 = ((G00[]) c1739q5.d)[i8];
                                if ((g002 != null ? g002.get() : null) == gt) {
                                    i3 = i8;
                                    break;
                                }
                            }
                            i6++;
                            int i9 = c1739q5.b;
                            while (true) {
                                if (i6 >= i9) {
                                    i3 = -(c1739q5.b + 1);
                                    break;
                                } else {
                                    if (((int[]) c1739q5.c)[i6] != identityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    G00 g003 = ((G00[]) c1739q5.d)[i6];
                                    if ((g003 != null ? g003.get() : null) == gt) {
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
            G00[] g00Arr = (G00[]) c1739q5.d;
            int length = g00Arr.length;
            if (i2 == length) {
                int i11 = length * 2;
                G00[] g00Arr2 = new G00[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                P6.b0(g00Arr, g00Arr2, i12, i10, i2);
                P6.d0((G00[]) c1739q5.d, g00Arr2, 0, i10, 6);
                P6.a0(i12, i10, i2, (int[]) c1739q5.c, iArr);
                P6.c0(0, i10, 6, (int[]) c1739q5.c, iArr);
                c1739q5.d = g00Arr2;
                c1739q5.c = iArr;
            } else {
                int i13 = i10 + 1;
                P6.b0(g00Arr, g00Arr, i13, i10, i2);
                int[] iArr2 = (int[]) c1739q5.c;
                P6.a0(i13, i10, i2, iArr2, iArr2);
            }
            ((G00[]) c1739q5.d)[i10] = new G00(gt);
            ((int[]) c1739q5.c)[i10] = identityHashCode;
            c1739q5.b++;
        }
    }

    public static final HT q(HT ht, int i2, C1959tS c1959tS) {
        HT ht2 = null;
        while (ht != null) {
            int i3 = ht.a;
            if (i3 != 0 && i3 <= i2 && !c1959tS.l(i3) && (ht2 == null || ht2.a < ht.a)) {
                ht2 = ht;
            }
            ht = ht.b;
        }
        if (ht2 != null) {
            return ht2;
        }
        return null;
    }

    public static final HT r(HT ht, GT gt) {
        HT q;
        AbstractC1696pS k2 = k();
        InterfaceC2114vp f2 = k2.f();
        if (f2 != null) {
            f2.invoke(gt);
        }
        HT q2 = q(ht, k2.d(), k2.e());
        if (q2 != null) {
            return q2;
        }
        synchronized (b) {
            AbstractC1696pS k3 = k();
            HT b2 = gt.b();
            AbstractC0048Bt.l(b2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            q = q(b2, k3.d(), k3.e());
            if (q == null) {
                throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
            }
        }
        return q;
    }

    public static final void s(int i2) {
        int i3;
        C1378ke c1378ke = e;
        int i4 = ((int[]) c1378ke.m)[i2];
        c1378ke.b(i4, c1378ke.j - 1);
        c1378ke.j--;
        int[] iArr = (int[]) c1378ke.i;
        int i5 = iArr[i4];
        int i6 = i4;
        while (i6 > 0) {
            int i7 = ((i6 + 1) >> 1) - 1;
            if (iArr[i7] <= i5) {
                break;
            }
            c1378ke.b(i7, i6);
            i6 = i7;
        }
        int[] iArr2 = (int[]) c1378ke.i;
        int i8 = c1378ke.j >> 1;
        while (i4 < i8) {
            int i9 = (i4 + 1) << 1;
            int i10 = i9 - 1;
            if (i9 < c1378ke.j && (i3 = iArr2[i9]) < iArr2[i10]) {
                if (i3 >= iArr2[i4]) {
                    break;
                }
                c1378ke.b(i9, i4);
                i4 = i9;
            } else {
                if (iArr2[i10] >= iArr2[i4]) {
                    break;
                }
                c1378ke.b(i10, i4);
                i4 = i10;
            }
        }
        ((int[]) c1378ke.m)[i2] = c1378ke.k;
        c1378ke.k = i2;
    }

    public static final Object t(AbstractC1696pS abstractC1696pS, InterfaceC2114vp interfaceC2114vp) {
        Object invoke = interfaceC2114vp.invoke(c.k(abstractC1696pS.d()));
        synchronized (b) {
            int i2 = d;
            d = i2 + 1;
            C1959tS k2 = c.k(abstractC1696pS.d());
            c = k2;
            i.set(new C0201Hq(i2, k2));
            abstractC1696pS.c();
            c = c.n(i2);
        }
        return invoke;
    }
}
