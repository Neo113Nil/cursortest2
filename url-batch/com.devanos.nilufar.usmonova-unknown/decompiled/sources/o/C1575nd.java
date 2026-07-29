package o;

import android.os.Trace;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.nd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1575nd implements InterfaceC1377kd {
    public final C1509md A;
    public final C1621oJ B;
    public boolean C;
    public C0776bS D;
    public C0841cS E;
    public C0972eS F;
    public boolean G;
    public JH H;
    public final C1443ld I;
    public C1471m2 J;
    public C1386km K;
    public boolean L;
    public int M;
    public final C0950e6 a;
    public final AbstractC1838rd b;
    public final C0841cS c;
    public final PD d;
    public final C2231xa e;
    public final C2231xa f;
    public final C2036ud g;
    public GH i;
    public int j;
    public int k;
    public int l;
    public int[] n;

    /* renamed from: o, reason: collision with root package name */
    public C2208xD f203o;
    public boolean p;
    public boolean q;
    public C1590ns u;
    public boolean v;
    public int x;
    public int y;
    public boolean z;
    public final C1621oJ h = new C1621oJ(2, false);
    public final C1459lt m = new C1459lt();
    public final ArrayList r = new ArrayList();
    public final C1459lt s = new C1459lt();
    public IH t = IH.k;
    public final C1459lt w = new C1459lt();

    public C1575nd(C0950e6 c0950e6, AbstractC1838rd abstractC1838rd, C0841cS c0841cS, PD pd, C2231xa c2231xa, C2231xa c2231xa2, C2036ud c2036ud) {
        this.a = c0950e6;
        this.b = abstractC1838rd;
        this.c = c0841cS;
        this.d = pd;
        this.e = c2231xa;
        this.f = c2231xa2;
        this.g = c2036ud;
        AtomicReference atomicReference = C0901dM.w;
        this.z = ((Boolean) atomicReference.get()).booleanValue();
        this.A = new C1509md(0, this);
        this.B = new C1621oJ(2, false);
        C0776bS k = c0841cS.k();
        k.c();
        this.D = k;
        C0841cS c0841cS2 = new C0841cS();
        if (((Boolean) atomicReference.get()).booleanValue()) {
            c0841cS2.q = new C2340zD();
        }
        this.E = c0841cS2;
        C0972eS l = c0841cS2.l();
        l.e(true);
        this.F = l;
        this.I = new C1443ld(this, c2231xa);
        C0776bS k2 = this.E.k();
        try {
            C1471m2 a = k2.a(0);
            k2.c();
            this.J = a;
            this.K = new C1386km();
        } catch (Throwable th) {
            k2.c();
            throw th;
        }
    }

    public static final int D(C1575nd c1575nd, int i, boolean z, int i2) {
        C1443ld c1443ld = c1575nd.I;
        C0776bS c0776bS = c1575nd.D;
        int[] iArr = c0776bS.b;
        int[] iArr2 = c0776bS.b;
        int i3 = i * 5;
        if ((iArr[i3 + 1] & 134217728) != 0) {
            int i4 = iArr[i3];
            Object j = c0776bS.j(iArr, i);
            if (i4 == 206 && AbstractC0048Bt.h(j, EB.e)) {
                c0776bS.g(i, 0);
                return TM.h(iArr2, i);
            }
            if (!TM.f(iArr2, i)) {
                return TM.h(iArr2, i);
            }
        } else if (TM.a(iArr, i)) {
            int i5 = iArr2[i3 + 3] + i;
            int i6 = 0;
            for (int i7 = i + 1; i7 < i5; i7 += iArr2[(i7 * 5) + 3]) {
                boolean f = TM.f(iArr2, i7);
                if (f) {
                    c1443ld.c();
                    Object i8 = c0776bS.i(i7);
                    c1443ld.c();
                    c1443ld.h.a.add(i8);
                }
                i6 += D(c1575nd, i7, f || z, f ? 0 : i2 + i6);
                if (f) {
                    c1443ld.c();
                    c1443ld.a();
                }
            }
            if (!TM.f(iArr2, i)) {
                return i6;
            }
        } else if (!TM.f(iArr2, i)) {
            return TM.h(iArr2, i);
        }
        return 1;
    }

    public final void A(JH jh) {
        C1590ns c1590ns = this.u;
        if (c1590ns == null) {
            c1590ns = new C1590ns(3, (byte) 0);
            this.u = c1590ns;
        }
        ((SparseArray) c1590ns.i).put(this.D.g, jh);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i, int i2, int i3) {
        C0776bS c0776bS = this.D;
        if (i != i2) {
            if (i != i3 && i2 != i3) {
                int[] iArr = c0776bS.b;
                int[] iArr2 = c0776bS.b;
                int i4 = iArr[(i * 5) + 2];
                if (i4 == i2) {
                    i3 = i2;
                } else {
                    int i5 = iArr[(i2 * 5) + 2];
                    if (i5 != i) {
                        if (i4 == i5) {
                            i3 = i4;
                        } else {
                            int i6 = i;
                            int i7 = 0;
                            while (i6 > 0 && i6 != i3) {
                                i6 = TM.i(iArr2, i6);
                                i7++;
                            }
                            int i8 = i2;
                            int i9 = 0;
                            while (i8 > 0 && i8 != i3) {
                                i8 = TM.i(iArr2, i8);
                                i9++;
                            }
                            int i10 = i7 - i9;
                            int i11 = i;
                            for (int i12 = 0; i12 < i10; i12++) {
                                i11 = iArr[(i11 * 5) + 2];
                            }
                            int i13 = i9 - i7;
                            int i14 = i2;
                            for (int i15 = 0; i15 < i13; i15++) {
                                i14 = iArr[(i14 * 5) + 2];
                            }
                            i3 = i11;
                            for (int i16 = i14; i3 != i16; i16 = iArr[(i16 * 5) + 2]) {
                                i3 = iArr[(i3 * 5) + 2];
                            }
                        }
                    }
                }
            }
            while (i > 0 && i != i3) {
                if (!TM.f(c0776bS.b, i)) {
                    this.I.a();
                }
                i = c0776bS.b[(i * 5) + 2];
            }
            m(i2, i3);
        }
        i3 = i;
        while (i > 0) {
            if (!TM.f(c0776bS.b, i)) {
            }
            i = c0776bS.b[(i * 5) + 2];
        }
        m(i2, i3);
    }

    public final Object C() {
        if (!this.L) {
            Object h = this.D.h();
            return h instanceof C0836cN ? ((C0836cN) h).a : h;
        }
        if (!this.q) {
            return C1311jd.a;
        }
        EB.h("A call to createNode(), emitNode() or useNode() expected");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E() {
        int rotateLeft;
        if (this.r.isEmpty()) {
            this.k = this.D.l() + this.k;
            return;
        }
        C0776bS c0776bS = this.D;
        int f = c0776bS.f();
        int[] iArr = c0776bS.b;
        int i = c0776bS.g;
        Object j = i < c0776bS.h ? c0776bS.j(iArr, i) : null;
        Object e = c0776bS.e();
        int i2 = this.l;
        C1623oL c1623oL = C1311jd.a;
        if (j != null) {
            rotateLeft = Integer.rotateLeft((j instanceof Enum ? ((Enum) j).ordinal() : j.hashCode()) ^ Integer.rotateLeft(this.M, 3), 3);
        } else {
            if (e != null && f == 207 && !e.equals(c1623oL)) {
                this.M = Integer.rotateLeft(e.hashCode() ^ Integer.rotateLeft(this.M, 3), 3) ^ i2;
                H(null, TM.f(iArr, c0776bS.g));
                y();
                c0776bS.d();
                if (j == null) {
                    if (j instanceof Enum) {
                        this.M = Integer.rotateRight(Integer.hashCode(((Enum) j).ordinal()) ^ Integer.rotateRight(this.M, 3), 3);
                        return;
                    } else {
                        this.M = Integer.rotateRight(Integer.hashCode(j.hashCode()) ^ Integer.rotateRight(this.M, 3), 3);
                        return;
                    }
                }
                if (e == null || f != 207 || e.equals(c1623oL)) {
                    this.M = Integer.rotateRight(Integer.rotateRight(this.M ^ i2, 3) ^ Integer.hashCode(f), 3);
                    return;
                } else {
                    this.M = Integer.rotateRight(Integer.hashCode(e.hashCode()) ^ Integer.rotateRight(this.M ^ i2, 3), 3);
                    return;
                }
            }
            rotateLeft = Integer.rotateLeft(Integer.rotateLeft(this.M, 3) ^ f, 3) ^ i2;
        }
        this.M = rotateLeft;
        H(null, TM.f(iArr, c0776bS.g));
        y();
        c0776bS.d();
        if (j == null) {
        }
    }

    public final void F() {
        if (this.k != 0) {
            EB.h("No nodes can be emitted before calling skipAndEndGroup");
            throw null;
        }
        WL s = s();
        if (s != null) {
            s.a |= 16;
        }
        if (!this.r.isEmpty()) {
            y();
            return;
        }
        C0776bS c0776bS = this.D;
        int i = c0776bS.i;
        this.k = i >= 0 ? TM.h(c0776bS.b, i) : 0;
        this.D.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Type inference failed for: r10v5, types: [o.JH] */
    /* JADX WARN: Type inference failed for: r10v7, types: [o.eS] */
    /* JADX WARN: Type inference failed for: r11v29, types: [o.eS] */
    /* JADX WARN: Type inference failed for: r31v0, types: [java.lang.Object, o.JH] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, o.oL] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(int i, C1420lG c1420lG, int i2, JH jh) {
        int rotateLeft;
        boolean z;
        Throwable th;
        int i3;
        GH gh;
        boolean z2;
        GH gh2;
        int i4;
        int i5;
        Object[] objArr;
        int i6;
        Object[] objArr2;
        boolean z3;
        KG kg;
        C2277yG c2277yG;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Object[] objArr3;
        Object[] objArr4;
        int i12;
        C1575nd c1575nd = this;
        C1420lG c1420lG2 = c1420lG;
        Throwable th2 = null;
        if (c1575nd.q) {
            EB.h("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        int i13 = c1575nd.l;
        ?? r8 = C1311jd.a;
        if (c1420lG2 != null) {
            rotateLeft = Integer.rotateLeft(c1420lG2.a.hashCode() ^ Integer.rotateLeft(c1575nd.M, 3), 3);
        } else {
            if (jh != 0 && i == 207 && !jh.equals(r8)) {
                c1575nd.M = i13 ^ Integer.rotateLeft(jh.hashCode() ^ Integer.rotateLeft(c1575nd.M, 3), 3);
                boolean z4 = true;
                if (c1420lG2 == null) {
                    c1575nd.l++;
                }
                boolean z5 = i2 == 0;
                if (!c1575nd.L) {
                    c1575nd.D.k++;
                    ?? r11 = c1575nd.F;
                    int i14 = r11.t;
                    if (z5) {
                        r11.G(i, r8, r8, true);
                    } else if (jh != 0) {
                        if (c1420lG2 == null) {
                            c1420lG2 = r8;
                        }
                        r11.G(i, c1420lG2, jh, false);
                    } else {
                        if (c1420lG2 == null) {
                            c1420lG2 = r8;
                        }
                        r11.G(i, c1420lG2, r8, false);
                    }
                    GH gh3 = c1575nd.i;
                    if (gh3 != null) {
                        int i15 = (-2) - i14;
                        C0156Fx c0156Fx = new C0156Fx(-1, i, i15, -1);
                        gh3.e.h(i15, new C0866cr(-1, c1575nd.j - gh3.b, 0));
                        gh3.d.add(c0156Fx);
                    }
                    c1575nd.q(z5, null);
                    return;
                }
                if (c1575nd.i == null) {
                    if (c1575nd.D.f() == i) {
                        C0776bS c0776bS = c1575nd.D;
                        int i16 = c0776bS.g;
                        if (AbstractC0048Bt.h(c1420lG2, i16 < c0776bS.h ? c0776bS.j(c0776bS.b, i16) : null)) {
                            c1575nd.H(jh, z5);
                        }
                    }
                    C0776bS c0776bS2 = c1575nd.D;
                    int[] iArr = c0776bS2.b;
                    ArrayList arrayList = new ArrayList();
                    i3 = -2;
                    if (c0776bS2.k <= 0) {
                        int i17 = c0776bS2.g;
                        while (i17 < c0776bS2.h) {
                            int i18 = i17 * 5;
                            Throwable th3 = th2;
                            boolean z6 = z4;
                            arrayList.add(new C0156Fx(c0776bS2.j(iArr, i17), iArr[i18], i17, TM.f(iArr, i17) ? z6 : TM.h(iArr, i17)));
                            i17 += iArr[i18 + 3];
                            th2 = th3;
                            z4 = z6;
                        }
                    }
                    z = z4;
                    th = th2;
                    c1575nd.i = new GH(c1575nd.j, arrayList);
                    gh = c1575nd.i;
                    if (gh == null) {
                        ArrayList arrayList2 = gh.d;
                        C2340zD c2340zD = gh.e;
                        int i19 = gh.b;
                        Object c0308Lu = c1420lG2 != null ? new C0308Lu(Integer.valueOf(i), c1420lG2) : Integer.valueOf(i);
                        MD md = ((ND) gh.f.getValue()).a;
                        Object e = md.e(c0308Lu);
                        if (e != null) {
                            if (!(e instanceof List) || ((e instanceof InterfaceC1594nw) && !(e instanceof InterfaceC1726pw))) {
                                md.g(c0308Lu);
                            } else {
                                List e2 = AbstractC1305jX.e(e);
                                Object remove = e2.remove(0);
                                if (e2.isEmpty()) {
                                    md.g(c0308Lu);
                                }
                                e = remove;
                            }
                            AbstractC0048Bt.l(e, "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1");
                        } else {
                            e = th;
                        }
                        C0156Fx c0156Fx2 = (C0156Fx) e;
                        if (c0156Fx2 == null) {
                            z2 = z5;
                            c1575nd.D.k++;
                            c1575nd.L = true;
                            ?? r10 = th;
                            c1575nd.H = r10;
                            if (c1575nd.F.w) {
                                C0972eS l = c1575nd.E.l();
                                c1575nd.F = l;
                                l.C();
                                c1575nd.G = false;
                                c1575nd.H = r10;
                            }
                            c1575nd.F.d();
                            ?? r102 = c1575nd.F;
                            int i20 = r102.t;
                            if (z2) {
                                r102.G(i, r8, r8, true);
                                i4 = 0;
                            } else if (jh != 0) {
                                if (c1420lG2 == null) {
                                    c1420lG2 = r8;
                                }
                                i4 = 0;
                                r102.G(i, c1420lG2, jh, false);
                            } else {
                                i4 = 0;
                                if (c1420lG2 == null) {
                                    c1420lG2 = r8;
                                }
                                r102.G(i, c1420lG2, r8, false);
                            }
                            c1575nd.J = c1575nd.F.b(i20);
                            int i21 = (-2) - i20;
                            C0156Fx c0156Fx3 = new C0156Fx(-1, i, i21, -1);
                            c2340zD.h(i21, new C0866cr(-1, c1575nd.j - i19, i4));
                            arrayList2.add(c0156Fx3);
                            gh2 = new GH(z2 ? i4 : c1575nd.j, new ArrayList());
                            c1575nd.q(z2, gh2);
                            return;
                        }
                        int i22 = c0156Fx2.c;
                        arrayList2.add(c0156Fx2);
                        C0866cr c0866cr = (C0866cr) c2340zD.e(i22);
                        c1575nd.j = (c0866cr != null ? c0866cr.b : -1) + i19;
                        C0866cr c0866cr2 = (C0866cr) c2340zD.e(i22);
                        int i23 = c0866cr2 != null ? c0866cr2.a : -1;
                        int i24 = gh.c;
                        int i25 = i23 - i24;
                        int i26 = 8;
                        if (i23 > i24) {
                            Object[] objArr5 = c2340zD.c;
                            long[] jArr = c2340zD.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i27 = 0;
                                while (true) {
                                    long j = jArr[i27];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i28 = 8 - ((~(i27 - length)) >>> 31);
                                        int i29 = 0;
                                        while (i29 < i28) {
                                            if ((j & 255) < 128) {
                                                i12 = i26;
                                                C0866cr c0866cr3 = (C0866cr) objArr5[(i27 << 3) + i29];
                                                objArr4 = objArr5;
                                                int i30 = c0866cr3.a;
                                                if (i30 == i23) {
                                                    c0866cr3.a = i24;
                                                } else if (i24 <= i30 && i30 < i23) {
                                                    c0866cr3.a = i30 + 1;
                                                }
                                            } else {
                                                objArr4 = objArr5;
                                                i12 = i26;
                                            }
                                            j >>= i12;
                                            i29++;
                                            i26 = i12;
                                            objArr5 = objArr4;
                                        }
                                        objArr3 = objArr5;
                                        if (i28 != i26) {
                                            break;
                                        }
                                    } else {
                                        objArr3 = objArr5;
                                    }
                                    if (i27 == length) {
                                        break;
                                    }
                                    i27++;
                                    objArr5 = objArr3;
                                    i26 = 8;
                                }
                            }
                        } else if (i24 > i23) {
                            Object[] objArr6 = c2340zD.c;
                            long[] jArr2 = c2340zD.a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i31 = 0;
                                while (true) {
                                    long j2 = jArr2[i31];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i32 = 8 - ((~(i31 - length2)) >>> 31);
                                        int i33 = 0;
                                        while (i33 < i32) {
                                            if ((j2 & 255) < 128) {
                                                C0866cr c0866cr4 = (C0866cr) objArr6[(i31 << 3) + i33];
                                                objArr2 = objArr6;
                                                int i34 = c0866cr4.a;
                                                if (i34 == i23) {
                                                    c0866cr4.a = i24;
                                                    i6 = i23;
                                                } else {
                                                    i6 = i23;
                                                    if (i6 + 1 <= i34 && i34 < i24) {
                                                        c0866cr4.a = i34 - 1;
                                                    }
                                                }
                                            } else {
                                                i6 = i23;
                                                objArr2 = objArr6;
                                            }
                                            j2 >>= 8;
                                            i33++;
                                            objArr6 = objArr2;
                                            i23 = i6;
                                        }
                                        i5 = i23;
                                        objArr = objArr6;
                                        if (i32 != 8) {
                                            break;
                                        }
                                    } else {
                                        i5 = i23;
                                        objArr = objArr6;
                                    }
                                    if (i31 == length2) {
                                        break;
                                    }
                                    i31++;
                                    objArr6 = objArr;
                                    i23 = i5;
                                }
                            }
                        }
                        C1443ld c1443ld = c1575nd.I;
                        int i35 = c1443ld.f;
                        C1575nd c1575nd2 = c1443ld.a;
                        c1443ld.f = (i22 - c1575nd2.D.g) + i35;
                        c1575nd.D.k(i22);
                        if (i25 > 0) {
                            c1443ld.d(false);
                            C1459lt c1459lt = c1443ld.d;
                            C0776bS c0776bS3 = c1575nd2.D;
                            if (c0776bS3.c > 0) {
                                int i36 = c0776bS3.i;
                                int i37 = c1459lt.b;
                                if ((i37 > 0 ? c1459lt.a[i37 - 1] : i3) != i36) {
                                    if (!c1443ld.c && c1443ld.e) {
                                        c1443ld.d(false);
                                        c1443ld.b.s.j0(C2013uG.c);
                                        c1443ld.c = z;
                                    }
                                    if (i36 > 0) {
                                        C1471m2 a = c0776bS3.a(i36);
                                        c1459lt.b(i36);
                                        c1443ld.d(false);
                                        KG kg2 = c1443ld.b.s;
                                        C1947tG c1947tG = C1947tG.c;
                                        int i38 = c1947tG.b;
                                        kg2.k0(c1947tG);
                                        AbstractC1052fg.R(kg2, 0, a);
                                        int i39 = kg2.y;
                                        int i40 = c1947tG.a;
                                        z3 = z5;
                                        if (i39 != KG.d0(kg2, i40) || kg2.z != KG.d0(kg2, i38)) {
                                            int i41 = 1;
                                            StringBuilder sb = new StringBuilder();
                                            int i42 = 0;
                                            int i43 = 0;
                                            while (i42 < i40) {
                                                if (((i41 << i42) & kg2.y) != 0) {
                                                    if (i43 > 0) {
                                                        sb.append(", ");
                                                    }
                                                    sb.append(c1947tG.b(i42));
                                                    i43++;
                                                }
                                                i42++;
                                                i41 = 1;
                                            }
                                            String sb2 = sb.toString();
                                            StringBuilder n = AbstractC1888sN.n(sb2, "StringBuilder().apply(builderAction).toString()");
                                            int i44 = 0;
                                            int i45 = 0;
                                            while (i44 < i38) {
                                                int i46 = i38;
                                                if (((1 << i44) & kg2.z) != 0) {
                                                    if (i43 > 0) {
                                                        n.append(", ");
                                                    }
                                                    n.append(c1947tG.c(i44));
                                                    i45++;
                                                }
                                                i44++;
                                                i38 = i46;
                                            }
                                            String sb3 = n.toString();
                                            AbstractC0048Bt.m(sb3, "StringBuilder().apply(builderAction).toString()");
                                            StringBuilder sb4 = new StringBuilder("Error while pushing ");
                                            sb4.append(c1947tG);
                                            sb4.append(". Not all arguments were provided. Missing ");
                                            AbstractC1888sN.r(sb4, i43, " int arguments (", sb2, ") and ");
                                            AbstractC1888sN.u(sb4, i45, " object arguments (", sb3, ").");
                                            throw th;
                                        }
                                        c1443ld.c = true;
                                        kg = c1443ld.b.s;
                                        c2277yG = C2277yG.c;
                                        i7 = c2277yG.b;
                                        kg.k0(c2277yG);
                                        AbstractC1052fg.Q(kg, 0, i25);
                                        i8 = kg.y;
                                        i9 = c2277yG.a;
                                        if (i8 == KG.d0(kg, i9) || kg.z != KG.d0(kg, i7)) {
                                            StringBuilder sb5 = new StringBuilder();
                                            i10 = 0;
                                            int i47 = 0;
                                            while (i10 < i9) {
                                                int i48 = i9;
                                                if ((kg.y & (1 << i10)) != 0) {
                                                    if (i47 > 0) {
                                                        sb5.append(", ");
                                                    }
                                                    sb5.append(c2277yG.b(i10));
                                                    i47++;
                                                }
                                                i10++;
                                                i9 = i48;
                                            }
                                            String sb6 = sb5.toString();
                                            StringBuilder n2 = AbstractC1888sN.n(sb6, "StringBuilder().apply(builderAction).toString()");
                                            i11 = 0;
                                            int i49 = 0;
                                            while (i11 < i7) {
                                                int i50 = i7;
                                                if (((1 << i11) & kg.z) != 0) {
                                                    if (i47 > 0) {
                                                        n2.append(", ");
                                                    }
                                                    n2.append(c2277yG.c(i11));
                                                    i49++;
                                                }
                                                i11++;
                                                i7 = i50;
                                            }
                                            String sb7 = n2.toString();
                                            AbstractC0048Bt.m(sb7, "StringBuilder().apply(builderAction).toString()");
                                            StringBuilder sb8 = new StringBuilder("Error while pushing ");
                                            sb8.append(c2277yG);
                                            sb8.append(". Not all arguments were provided. Missing ");
                                            AbstractC1888sN.r(sb8, i47, " int arguments (", sb6, ") and ");
                                            AbstractC1888sN.u(sb8, i49, " object arguments (", sb7, ").");
                                            throw th;
                                        }
                                        z2 = z3;
                                    }
                                }
                            }
                            z3 = z5;
                            kg = c1443ld.b.s;
                            c2277yG = C2277yG.c;
                            i7 = c2277yG.b;
                            kg.k0(c2277yG);
                            AbstractC1052fg.Q(kg, 0, i25);
                            i8 = kg.y;
                            i9 = c2277yG.a;
                            if (i8 == KG.d0(kg, i9)) {
                            }
                            StringBuilder sb52 = new StringBuilder();
                            i10 = 0;
                            int i472 = 0;
                            while (i10 < i9) {
                            }
                            String sb62 = sb52.toString();
                            StringBuilder n22 = AbstractC1888sN.n(sb62, "StringBuilder().apply(builderAction).toString()");
                            i11 = 0;
                            int i492 = 0;
                            while (i11 < i7) {
                            }
                            String sb72 = n22.toString();
                            AbstractC0048Bt.m(sb72, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb82 = new StringBuilder("Error while pushing ");
                            sb82.append(c2277yG);
                            sb82.append(". Not all arguments were provided. Missing ");
                            AbstractC1888sN.r(sb82, i472, " int arguments (", sb62, ") and ");
                            AbstractC1888sN.u(sb82, i492, " object arguments (", sb72, ").");
                            throw th;
                        }
                        z2 = z5;
                        c1575nd = this;
                        c1575nd.H(jh, z2);
                    } else {
                        z2 = z5;
                    }
                    gh2 = null;
                    c1575nd.q(z2, gh2);
                    return;
                }
                z = true;
                th = null;
                i3 = -2;
                gh = c1575nd.i;
                if (gh == null) {
                }
                gh2 = null;
                c1575nd.q(z2, gh2);
                return;
            }
            rotateLeft = i13 ^ Integer.rotateLeft(Integer.rotateLeft(c1575nd.M, 3) ^ i, 3);
        }
        c1575nd.M = rotateLeft;
        boolean z42 = true;
        if (c1420lG2 == null) {
        }
        if (i2 == 0) {
        }
        if (!c1575nd.L) {
        }
    }

    public final void H(Object obj, boolean z) {
        if (z) {
            C0776bS c0776bS = this.D;
            if (c0776bS.k <= 0) {
                if (TM.f(c0776bS.b, c0776bS.g)) {
                    c0776bS.n();
                    return;
                } else {
                    AbstractC1052fg.S("Expected a node group");
                    throw null;
                }
            }
            return;
        }
        if (obj != null && this.D.e() != obj) {
            C1443ld c1443ld = this.I;
            c1443ld.getClass();
            c1443ld.d(false);
            KG kg = c1443ld.b.s;
            GG gg = GG.c;
            int i = gg.b;
            kg.k0(gg);
            AbstractC1052fg.R(kg, 0, obj);
            int i2 = kg.y;
            int i3 = gg.a;
            if (i2 != KG.d0(kg, i3) || kg.z != KG.d0(kg, i)) {
                StringBuilder sb = new StringBuilder();
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    if (((1 << i5) & kg.y) != 0) {
                        if (i4 > 0) {
                            sb.append(", ");
                        }
                        sb.append(gg.b(i5));
                        i4++;
                    }
                }
                String sb2 = sb.toString();
                StringBuilder n = AbstractC1888sN.n(sb2, "StringBuilder().apply(builderAction).toString()");
                int i6 = 0;
                for (int i7 = 0; i7 < i; i7++) {
                    if (((1 << i7) & kg.z) != 0) {
                        if (i4 > 0) {
                            n.append(", ");
                        }
                        n.append(gg.c(i7));
                        i6++;
                    }
                }
                String sb3 = n.toString();
                AbstractC0048Bt.m(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(gg);
                sb4.append(". Not all arguments were provided. Missing ");
                AbstractC1888sN.r(sb4, i4, " int arguments (", sb2, ") and ");
                AbstractC1888sN.u(sb4, i6, " object arguments (", sb3, ").");
                throw null;
            }
        }
        this.D.n();
    }

    public final void I(int i) {
        int i2;
        int i3;
        if (this.i != null) {
            G(i, null, 0, null);
            return;
        }
        if (this.q) {
            EB.h("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        this.M = this.l ^ Integer.rotateLeft(Integer.rotateLeft(this.M, 3) ^ i, 3);
        this.l++;
        C0776bS c0776bS = this.D;
        boolean z = this.L;
        C1623oL c1623oL = C1311jd.a;
        if (z) {
            c0776bS.k++;
            this.F.G(i, c1623oL, c1623oL, false);
            q(false, null);
            return;
        }
        if (c0776bS.f() == i && ((i3 = c0776bS.g) >= c0776bS.h || !TM.e(c0776bS.b, i3))) {
            c0776bS.n();
            q(false, null);
            return;
        }
        if (c0776bS.k <= 0 && (i2 = c0776bS.g) != c0776bS.h) {
            int i4 = this.j;
            z();
            this.I.e(i4, c0776bS.l());
            EB.d(this.r, i2, c0776bS.g);
        }
        c0776bS.k++;
        this.L = true;
        this.H = null;
        if (this.F.w) {
            C0972eS l = this.E.l();
            this.F = l;
            l.C();
            this.G = false;
            this.H = null;
        }
        C0972eS c0972eS = this.F;
        c0972eS.d();
        int i5 = c0972eS.t;
        c0972eS.G(i, c1623oL, c1623oL, false);
        this.J = c0972eS.b(i5);
        q(false, null);
    }

    public final C1575nd J(int i) {
        WL wl;
        I(i);
        boolean z = this.L;
        C1621oJ c1621oJ = this.B;
        C2036ud c2036ud = this.g;
        if (z) {
            WL wl2 = new WL(c2036ud);
            c1621oJ.a.add(wl2);
            Q(wl2);
            wl2.e = this.y;
            wl2.a &= -17;
            return this;
        }
        int i2 = this.D.i;
        ArrayList arrayList = this.r;
        int q = EB.q(i2, arrayList);
        C0256Jt c0256Jt = q >= 0 ? (C0256Jt) arrayList.remove(q) : null;
        Object h = this.D.h();
        if (AbstractC0048Bt.h(h, C1311jd.a)) {
            wl = new WL(c2036ud);
            Q(wl);
        } else {
            AbstractC0048Bt.l(h, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            wl = (WL) h;
        }
        if (c0256Jt == null) {
            int i3 = wl.a;
            boolean z2 = (i3 & 64) != 0;
            if (z2) {
                wl.a = i3 & (-65);
            }
            if (!z2) {
                wl.a &= -9;
                c1621oJ.a.add(wl);
                wl.e = this.y;
                wl.a &= -17;
                return this;
            }
        }
        wl.a |= 8;
        c1621oJ.a.add(wl);
        wl.e = this.y;
        wl.a &= -17;
        return this;
    }

    public final void K() {
        this.l = 0;
        C0841cS c0841cS = this.c;
        this.D = c0841cS.k();
        G(100, null, 0, null);
        this.t = AbstractC1904sd.a;
        this.w.b(this.v ? 1 : 0);
        this.v = d(this.t);
        this.H = null;
        if (!this.p) {
            this.p = false;
        }
        if (!this.z) {
            this.z = false;
        }
        Set set = (Set) AbstractC1807r8.R(this.t, AbstractC0670Zs.a);
        if (set != null) {
            set.add(c0841cS);
        }
        G(1000, null, 0, null);
    }

    public final boolean L(WL wl, Object obj) {
        C1471m2 c1471m2 = wl.c;
        if (c1471m2 == null) {
            return false;
        }
        int j = this.D.a.j(c1471m2);
        if (!this.C || j < this.D.g) {
            return false;
        }
        ArrayList arrayList = this.r;
        int q = EB.q(j, arrayList);
        if (q < 0) {
            int i = -(q + 1);
            if (!(obj instanceof C1645oh)) {
                obj = null;
            }
            arrayList.add(i, new C0256Jt(wl, j, obj));
            return true;
        }
        C0256Jt c0256Jt = (C0256Jt) arrayList.get(q);
        if (!(obj instanceof C1645oh)) {
            c0256Jt.c = null;
            return true;
        }
        Object obj2 = c0256Jt.c;
        if (obj2 == null) {
            c0256Jt.c = obj;
            return true;
        }
        if (obj2 instanceof QD) {
            ((QD) obj2).a(obj);
            return true;
        }
        int i2 = WP.a;
        QD qd = new QD(2);
        qd.b[qd.d(obj2)] = obj2;
        qd.b[qd.d(obj)] = obj;
        c0256Jt.c = qd;
        return true;
    }

    public final void M(int i, int i2) {
        if (R(i) != i2) {
            if (i < 0) {
                C2208xD c2208xD = this.f203o;
                if (c2208xD == null) {
                    c2208xD = new C2208xD();
                    this.f203o = c2208xD;
                }
                c2208xD.f(i, i2);
                return;
            }
            int[] iArr = this.n;
            if (iArr == null) {
                int i3 = this.D.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.n = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final void N(int i, int i2) {
        int R = R(i);
        if (R != i2) {
            int i3 = i2 - R;
            C1621oJ c1621oJ = this.h;
            int size = c1621oJ.a.size() - 1;
            while (i != -1) {
                int R2 = R(i) + i3;
                M(i, R2);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        GH gh = (GH) c1621oJ.a.get(i4);
                        if (gh != null && gh.a(i, R2)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.D.i;
                } else if (TM.f(this.D.b, i)) {
                    return;
                } else {
                    i = TM.i(this.D.b, i);
                }
            }
        }
    }

    public final IH O(JH jh, IH ih) {
        IH ih2 = (IH) jh;
        ih2.getClass();
        HH hh = new HH(ih2);
        hh.putAll(ih);
        IH a = hh.a();
        G(204, EB.d, 0, null);
        v();
        Q(a);
        v();
        Q(ih);
        n(false);
        return a;
    }

    public final void P(Object obj) {
        int i;
        C0776bS c0776bS;
        int i2;
        C0972eS c0972eS;
        if (obj instanceof InterfaceC0771bN) {
            C1471m2 c1471m2 = null;
            if (this.L) {
                KG kg = this.I.b.s;
                AG ag = AG.c;
                int i3 = ag.b;
                kg.k0(ag);
                AbstractC1052fg.R(kg, 0, (InterfaceC0771bN) obj);
                int i4 = kg.y;
                int i5 = ag.a;
                if (i4 != KG.d0(kg, i5) || kg.z != KG.d0(kg, i3)) {
                    StringBuilder sb = new StringBuilder();
                    int i6 = 0;
                    for (int i7 = 0; i7 < i5; i7++) {
                        if (((1 << i7) & kg.y) != 0) {
                            if (i6 > 0) {
                                sb.append(", ");
                            }
                            sb.append(ag.b(i7));
                            i6++;
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder n = AbstractC1888sN.n(sb2, "StringBuilder().apply(builderAction).toString()");
                    int i8 = 0;
                    for (int i9 = 0; i9 < i3; i9++) {
                        if (((1 << i9) & kg.z) != 0) {
                            if (i6 > 0) {
                                n.append(", ");
                            }
                            n.append(ag.c(i9));
                            i8++;
                        }
                    }
                    String sb3 = n.toString();
                    AbstractC0048Bt.m(sb3, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(ag);
                    sb4.append(". Not all arguments were provided. Missing ");
                    AbstractC1888sN.r(sb4, i6, " int arguments (", sb2, ") and ");
                    AbstractC1888sN.u(sb4, i8, " object arguments (", sb3, ").");
                    throw null;
                }
            }
            this.d.add(obj);
            InterfaceC0771bN interfaceC0771bN = (InterfaceC0771bN) obj;
            if (this.L) {
                C0972eS c0972eS2 = this.F;
                int i10 = c0972eS2.t;
                if (i10 > c0972eS2.v + 1) {
                    int i11 = i10 - 1;
                    int w = c0972eS2.w(c0972eS2.b, i11);
                    while (true) {
                        i2 = i11;
                        i11 = w;
                        c0972eS = this.F;
                        if (i11 == c0972eS.v || i11 < 0) {
                            break;
                        } else {
                            w = c0972eS.w(c0972eS.b, i11);
                        }
                    }
                    c1471m2 = c0972eS.b(i2);
                }
            } else {
                C0776bS c0776bS2 = this.D;
                int i12 = c0776bS2.g;
                if (i12 > c0776bS2.i + 1) {
                    int i13 = i12 - 1;
                    int i14 = c0776bS2.b[(i13 * 5) + 2];
                    while (true) {
                        i = i13;
                        i13 = i14;
                        c0776bS = this.D;
                        if (i13 == c0776bS.i || i13 < 0) {
                            break;
                        } else {
                            i14 = c0776bS.b[(i13 * 5) + 2];
                        }
                    }
                    c1471m2 = c0776bS.a(i);
                }
            }
            C0836cN c0836cN = new C0836cN();
            c0836cN.a = interfaceC0771bN;
            c0836cN.b = c1471m2;
            obj = c0836cN;
        }
        Q(obj);
    }

    public final void Q(Object obj) {
        int i;
        int i2;
        int i3;
        if (this.L) {
            C0972eS c0972eS = this.F;
            if (c0972eS.n <= 0 || c0972eS.i == c0972eS.k) {
                c0972eS.x(obj);
                return;
            }
            C2340zD c2340zD = c0972eS.s;
            if (c2340zD == null) {
                c2340zD = new C2340zD();
            }
            c0972eS.s = c2340zD;
            int i4 = c0972eS.v;
            Object e = c2340zD.e(i4);
            if (e == null) {
                e = new HD(0);
                c2340zD.h(i4, e);
            }
            ((HD) e).a(obj);
            return;
        }
        C0776bS c0776bS = this.D;
        boolean z = c0776bS.n;
        C1443ld c1443ld = this.I;
        if (!z) {
            C1471m2 a = c0776bS.a(c0776bS.i);
            KG kg = c1443ld.b.s;
            C1618oG c1618oG = C1618oG.c;
            int i5 = c1618oG.b;
            kg.k0(c1618oG);
            AbstractC1052fg.R(kg, 0, a);
            AbstractC1052fg.R(kg, 1, obj);
            int i6 = kg.y;
            int i7 = c1618oG.a;
            if (i6 == KG.d0(kg, i7) && kg.z == KG.d0(kg, i5)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                if (((1 << i9) & kg.y) != 0) {
                    if (i8 > 0) {
                        sb.append(", ");
                    }
                    sb.append(c1618oG.b(i9));
                    i8++;
                }
            }
            String sb2 = sb.toString();
            StringBuilder n = AbstractC1888sN.n(sb2, "StringBuilder().apply(builderAction).toString()");
            int i10 = 0;
            int i11 = 0;
            while (i10 < i5) {
                int i12 = i5;
                if (((1 << i10) & kg.z) != 0) {
                    if (i8 > 0) {
                        n.append(", ");
                    }
                    n.append(c1618oG.c(i10));
                    i11++;
                }
                i10++;
                i5 = i12;
            }
            String sb3 = n.toString();
            AbstractC0048Bt.m(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(c1618oG);
            sb4.append(". Not all arguments were provided. Missing ");
            AbstractC1888sN.r(sb4, i8, " int arguments (", sb2, ") and ");
            AbstractC1888sN.u(sb4, i11, " object arguments (", sb3, ").");
            throw null;
        }
        int j = (c0776bS.l - TM.j(c0776bS.b, c0776bS.i)) - 1;
        if (c1443ld.a.D.i - c1443ld.f >= 0) {
            c1443ld.d(true);
            KG kg2 = c1443ld.b.s;
            C2079vG c2079vG = C2079vG.g;
            kg2.k0(c2079vG);
            AbstractC1052fg.R(kg2, 0, obj);
            AbstractC1052fg.Q(kg2, 0, j);
            if (kg2.y == KG.d0(kg2, 1) && kg2.z == KG.d0(kg2, 1)) {
                return;
            }
            StringBuilder sb5 = new StringBuilder();
            if ((kg2.y & 1) != 0) {
                sb5.append(c2079vG.b(0));
                i = 1;
            } else {
                i = 0;
            }
            String sb6 = sb5.toString();
            StringBuilder n2 = AbstractC1888sN.n(sb6, "StringBuilder().apply(builderAction).toString()");
            if ((kg2.z & 1) != 0) {
                if (i > 0) {
                    n2.append(", ");
                }
                n2.append(c2079vG.c(0));
                i2 = 1;
            } else {
                i2 = 0;
            }
            String sb7 = n2.toString();
            AbstractC0048Bt.m(sb7, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb8 = new StringBuilder("Error while pushing ");
            sb8.append(c2079vG);
            sb8.append(". Not all arguments were provided. Missing ");
            AbstractC1888sN.r(sb8, i, " int arguments (", sb6, ") and ");
            AbstractC1888sN.u(sb8, i2, " object arguments (", sb7, ").");
            throw null;
        }
        C0776bS c0776bS2 = this.D;
        C1471m2 a2 = c0776bS2.a(c0776bS2.i);
        KG kg3 = c1443ld.b.s;
        C2079vG c2079vG2 = C2079vG.f;
        kg3.k0(c2079vG2);
        AbstractC1052fg.R(kg3, 0, obj);
        AbstractC1052fg.R(kg3, 1, a2);
        AbstractC1052fg.Q(kg3, 0, j);
        if (kg3.y == KG.d0(kg3, 1) && kg3.z == KG.d0(kg3, 2)) {
            return;
        }
        StringBuilder sb9 = new StringBuilder();
        if ((kg3.y & 1) != 0) {
            sb9.append(c2079vG2.b(0));
            i3 = 1;
        } else {
            i3 = 0;
        }
        String sb10 = sb9.toString();
        StringBuilder n3 = AbstractC1888sN.n(sb10, "StringBuilder().apply(builderAction).toString()");
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 2; i14 < i15; i15 = 2) {
            if (((1 << i14) & kg3.z) != 0) {
                if (i3 > 0) {
                    n3.append(", ");
                }
                n3.append(c2079vG2.c(i14));
                i13++;
            }
            i14++;
        }
        String sb11 = n3.toString();
        AbstractC0048Bt.m(sb11, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb12 = new StringBuilder("Error while pushing ");
        sb12.append(c2079vG2);
        sb12.append(". Not all arguments were provided. Missing ");
        AbstractC1888sN.r(sb12, i3, " int arguments (", sb10, ") and ");
        AbstractC1888sN.u(sb12, i13, " object arguments (", sb11, ").");
        throw null;
    }

    public final int R(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.n;
            return (iArr == null || (i2 = iArr[i]) < 0) ? TM.h(this.D.b, i) : i2;
        }
        C2208xD c2208xD = this.f203o;
        if (c2208xD == null || c2208xD.c(i) < 0) {
            return 0;
        }
        return c2208xD.d(i);
    }

    public final void a() {
        f();
        this.h.a.clear();
        this.m.b = 0;
        this.s.b = 0;
        this.w.b = 0;
        this.u = null;
        C1386km c1386km = this.K;
        c1386km.t.e0();
        c1386km.s.e0();
        this.M = 0;
        this.x = 0;
        this.q = false;
        this.L = false;
        this.C = false;
        C0776bS c0776bS = this.D;
        if (!c0776bS.f) {
            c0776bS.c();
        }
        if (this.F.w) {
            return;
        }
        r();
    }

    public final void b(Object obj, InterfaceC2312yp interfaceC2312yp) {
        int i = 0;
        if (this.L) {
            KG kg = this.K.s;
            HG hg = HG.c;
            int i2 = hg.b;
            kg.k0(hg);
            AbstractC1052fg.R(kg, 0, obj);
            AbstractC0048Bt.l(interfaceC2312yp, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            AbstractC1305jX.i(2, interfaceC2312yp);
            AbstractC1052fg.R(kg, 1, interfaceC2312yp);
            int i3 = kg.y;
            int i4 = hg.a;
            if (i3 == KG.d0(kg, i4) && kg.z == KG.d0(kg, i2)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i4;
                if (((1 << i5) & kg.y) != 0) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(hg.b(i5));
                    i++;
                }
                i5++;
                i4 = i6;
            }
            String sb2 = sb.toString();
            StringBuilder n = AbstractC1888sN.n(sb2, "StringBuilder().apply(builderAction).toString()");
            int i7 = 0;
            int i8 = 0;
            while (i8 < i2) {
                int i9 = i2;
                if (((1 << i8) & kg.z) != 0) {
                    if (i > 0) {
                        n.append(", ");
                    }
                    n.append(hg.c(i8));
                    i7++;
                }
                i8++;
                i2 = i9;
            }
            String sb3 = n.toString();
            AbstractC0048Bt.m(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(hg);
            sb4.append(". Not all arguments were provided. Missing ");
            AbstractC1888sN.r(sb4, i, " int arguments (", sb2, ") and ");
            AbstractC1888sN.u(sb4, i7, " object arguments (", sb3, ").");
            throw null;
        }
        C1443ld c1443ld = this.I;
        c1443ld.b();
        KG kg2 = c1443ld.b.s;
        HG hg2 = HG.c;
        int i10 = hg2.b;
        kg2.k0(hg2);
        int i11 = 0;
        AbstractC1052fg.R(kg2, 0, obj);
        AbstractC0048Bt.l(interfaceC2312yp, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        AbstractC1305jX.i(2, interfaceC2312yp);
        AbstractC1052fg.R(kg2, 1, interfaceC2312yp);
        int i12 = kg2.y;
        int i13 = hg2.a;
        if (i12 == KG.d0(kg2, i13) && kg2.z == KG.d0(kg2, i10)) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        for (int i14 = 0; i14 < i13; i14++) {
            if (((1 << i14) & kg2.y) != 0) {
                if (i11 > 0) {
                    sb5.append(", ");
                }
                sb5.append(hg2.b(i14));
                i11++;
            }
        }
        String sb6 = sb5.toString();
        StringBuilder n2 = AbstractC1888sN.n(sb6, "StringBuilder().apply(builderAction).toString()");
        int i15 = 0;
        int i16 = 0;
        while (i15 < i10) {
            int i17 = i10;
            if (((1 << i15) & kg2.z) != 0) {
                if (i11 > 0) {
                    n2.append(", ");
                }
                n2.append(hg2.c(i15));
                i16++;
            }
            i15++;
            i10 = i17;
        }
        String sb7 = n2.toString();
        AbstractC0048Bt.m(sb7, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb8 = new StringBuilder("Error while pushing ");
        sb8.append(hg2);
        sb8.append(". Not all arguments were provided. Missing ");
        AbstractC1888sN.r(sb8, i11, " int arguments (", sb6, ") and ");
        AbstractC1888sN.u(sb8, i16, " object arguments (", sb7, ").");
        throw null;
    }

    public final boolean c(long j) {
        Object v = v();
        if ((v instanceof Long) && j == ((Number) v).longValue()) {
            return false;
        }
        Q(Long.valueOf(j));
        return true;
    }

    public final boolean d(Object obj) {
        if (AbstractC0048Bt.h(v(), obj)) {
            return false;
        }
        Q(obj);
        return true;
    }

    public final boolean e(Object obj) {
        if (v() == obj) {
            return false;
        }
        Q(obj);
        return true;
    }

    public final void f() {
        this.i = null;
        this.j = 0;
        this.k = 0;
        this.M = 0;
        this.q = false;
        C1443ld c1443ld = this.I;
        c1443ld.c = false;
        c1443ld.d.b = 0;
        c1443ld.f = 0;
        this.B.a.clear();
        this.n = null;
        this.f203o = null;
    }

    public final int g(int i, int i2, int i3, int i4) {
        int hashCode;
        Object b;
        if (i == i3) {
            return i4;
        }
        C0776bS c0776bS = this.D;
        int[] iArr = c0776bS.b;
        if (TM.e(iArr, i)) {
            Object j = c0776bS.j(iArr, i);
            hashCode = j != null ? j instanceof Enum ? ((Enum) j).ordinal() : j.hashCode() : 0;
        } else {
            int i5 = c0776bS.b[i * 5];
            hashCode = (i5 != 207 || (b = c0776bS.b(iArr, i)) == null || b.equals(C1311jd.a)) ? i5 : b.hashCode();
        }
        if (hashCode == 126665345) {
            return hashCode;
        }
        int i6 = this.D.b[(i * 5) + 2];
        if (i6 != i3) {
            i4 = g(i6, w(i6), i3, i4);
        }
        if (TM.e(this.D.b, i)) {
            i2 = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(i4, 3) ^ hashCode, 3) ^ i2;
    }

    public final Object h(AbstractC1425lL abstractC1425lL) {
        return AbstractC1807r8.R(j(), abstractC1425lL);
    }

    public final void i(InterfaceC1455lp interfaceC1455lp) {
        int i;
        int i2;
        int i3;
        int i4;
        if (!this.q) {
            EB.h("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.q = false;
        if (!this.L) {
            EB.h("createNode() can only be called when inserting");
            throw null;
        }
        C1459lt c1459lt = this.m;
        int i5 = c1459lt.a[c1459lt.b - 1];
        C0972eS c0972eS = this.F;
        C1471m2 b = c0972eS.b(c0972eS.v);
        this.k++;
        C1386km c1386km = this.K;
        KG kg = c1386km.s;
        C2079vG c2079vG = C2079vG.d;
        kg.k0(c2079vG);
        AbstractC1052fg.R(kg, 0, interfaceC1455lp);
        AbstractC1052fg.Q(kg, 0, i5);
        AbstractC1052fg.R(kg, 1, b);
        if (kg.y != KG.d0(kg, 1) || kg.z != KG.d0(kg, 2)) {
            StringBuilder sb = new StringBuilder();
            if ((1 & kg.y) != 0) {
                i = 0;
                sb.append(c2079vG.b(0));
                i2 = 1;
            } else {
                i = 0;
                i2 = 0;
            }
            String sb2 = sb.toString();
            StringBuilder n = AbstractC1888sN.n(sb2, "StringBuilder().apply(builderAction).toString()");
            int i6 = i;
            while (i < 2) {
                if (((1 << i) & kg.z) != 0) {
                    if (i2 > 0) {
                        n.append(", ");
                    }
                    n.append(c2079vG.c(i));
                    i6++;
                }
                i++;
            }
            String sb3 = n.toString();
            AbstractC0048Bt.m(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(c2079vG);
            sb4.append(". Not all arguments were provided. Missing ");
            AbstractC1888sN.r(sb4, i2, " int arguments (", sb2, ") and ");
            AbstractC1888sN.u(sb4, i6, " object arguments (", sb3, ").");
            throw null;
        }
        KG kg2 = c1386km.t;
        C2079vG c2079vG2 = C2079vG.e;
        kg2.k0(c2079vG2);
        AbstractC1052fg.Q(kg2, 0, i5);
        AbstractC1052fg.R(kg2, 0, b);
        if (kg2.y == KG.d0(kg2, 1) && kg2.z == KG.d0(kg2, 1)) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        if ((kg2.y & 1) != 0) {
            sb5.append(c2079vG2.b(0));
            i3 = 1;
        } else {
            i3 = 0;
        }
        String sb6 = sb5.toString();
        StringBuilder n2 = AbstractC1888sN.n(sb6, "StringBuilder().apply(builderAction).toString()");
        if ((kg2.z & 1) != 0) {
            if (i3 > 0) {
                n2.append(", ");
            }
            n2.append(c2079vG2.c(0));
            i4 = 1;
        } else {
            i4 = 0;
        }
        String sb7 = n2.toString();
        AbstractC0048Bt.m(sb7, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb8 = new StringBuilder("Error while pushing ");
        sb8.append(c2079vG2);
        sb8.append(". Not all arguments were provided. Missing ");
        AbstractC1888sN.r(sb8, i3, " int arguments (", sb6, ") and ");
        AbstractC1888sN.u(sb8, i4, " object arguments (", sb7, ").");
        throw null;
    }

    public final JH j() {
        JH jh;
        Object obj;
        Object obj2;
        int i;
        JH jh2 = this.H;
        if (jh2 != null) {
            return jh2;
        }
        int i2 = this.D.i;
        C1420lG c1420lG = EB.c;
        if (this.L && this.G) {
            int i3 = this.F.v;
            while (i3 > 0) {
                C0972eS c0972eS = this.F;
                if (c0972eS.b[c0972eS.p(i3) * 5] == 202) {
                    C0972eS c0972eS2 = this.F;
                    int p = c0972eS2.p(i3);
                    int i4 = 0;
                    if (TM.e(c0972eS2.b, p)) {
                        Object[] objArr = c0972eS2.c;
                        int[] iArr = c0972eS2.b;
                        int i5 = p * 5;
                        int i6 = iArr[i5 + 4];
                        switch (iArr[i5 + 1] >> 30) {
                            case 0:
                                i = 0;
                                break;
                            case 1:
                            case 2:
                            case 4:
                                i = 1;
                                break;
                            case 3:
                            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                                i = 2;
                                break;
                            default:
                                i = 3;
                                break;
                        }
                        obj = objArr[i + i6];
                    } else {
                        obj = null;
                    }
                    if (AbstractC0048Bt.h(obj, c1420lG)) {
                        C0972eS c0972eS3 = this.F;
                        int p2 = c0972eS3.p(i3);
                        if (TM.d(c0972eS3.b, p2)) {
                            Object[] objArr2 = c0972eS3.c;
                            int[] iArr2 = c0972eS3.b;
                            int f = c0972eS3.f(iArr2, p2);
                            switch (iArr2[(p2 * 5) + 1] >> 29) {
                                case 0:
                                    break;
                                case 1:
                                case 2:
                                case 4:
                                    i4 = 1;
                                    break;
                                case 3:
                                case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                                case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                                    i4 = 2;
                                    break;
                                default:
                                    i4 = 3;
                                    break;
                            }
                            obj2 = objArr2[i4 + f];
                        } else {
                            obj2 = C1311jd.a;
                        }
                        AbstractC0048Bt.l(obj2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        JH jh3 = (JH) obj2;
                        this.H = jh3;
                        return jh3;
                    }
                }
                C0972eS c0972eS4 = this.F;
                i3 = c0972eS4.w(c0972eS4.b, i3);
            }
        }
        if (this.D.c > 0) {
            while (i2 > 0) {
                C0776bS c0776bS = this.D;
                int[] iArr3 = c0776bS.b;
                int i7 = i2 * 5;
                if (iArr3[i7] == 202 && AbstractC0048Bt.h(c0776bS.j(iArr3, i2), c1420lG)) {
                    C1590ns c1590ns = this.u;
                    if (c1590ns == null || (jh = (JH) ((SparseArray) c1590ns.i).get(i2)) == null) {
                        C0776bS c0776bS2 = this.D;
                        Object b = c0776bS2.b(c0776bS2.b, i2);
                        AbstractC0048Bt.l(b, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        jh = (JH) b;
                    }
                    this.H = jh;
                    return jh;
                }
                i2 = this.D.b[i7 + 2];
            }
        }
        IH ih = this.t;
        this.H = ih;
        return ih;
    }

    public final void k() {
        Trace.beginSection("Compose:Composer.dispose");
        try {
            this.B.a.clear();
            this.r.clear();
            this.e.s.e0();
            this.u = null;
            this.a.m();
        } finally {
            Trace.endSection();
        }
    }

    public final void l(C1818rJ c1818rJ, C0721ad c0721ad) {
        long[] jArr;
        long[] jArr2;
        int i;
        C1420lG c1420lG = EB.a;
        if (this.C) {
            EB.h("Reentrant composition is not supported");
            throw null;
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.y = AbstractC2025uS.k().d();
            this.u = null;
            MD md = (MD) c1818rJ.i;
            Object[] objArr = md.b;
            Object[] objArr2 = md.c;
            long[] jArr3 = md.a;
            int length = jArr3.length - 2;
            ArrayList arrayList = this.r;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr3[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((j & 255) < 128) {
                                int i6 = (i2 << 3) + i5;
                                Object obj = objArr[i6];
                                Object obj2 = objArr2[i6];
                                i = i3;
                                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                                C1471m2 c1471m2 = ((WL) obj).c;
                                if (c1471m2 != null) {
                                    int i7 = c1471m2.a;
                                    WL wl = (WL) obj;
                                    jArr2 = jArr3;
                                    if (obj2 == C1623oL.k) {
                                        obj2 = null;
                                    }
                                    arrayList.add(new C0256Jt(wl, i7, obj2));
                                } else {
                                    jArr2 = jArr3;
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i3;
                            }
                            j >>= i;
                            i5++;
                            i3 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i4 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                    jArr3 = jArr;
                }
            }
            AbstractC0982ec.e0(arrayList, EB.f);
            this.j = 0;
            this.C = true;
            try {
                K();
                Object v = v();
                if (v != c0721ad && c0721ad != null) {
                    Q(c0721ad);
                }
                C1509md c1509md = this.A;
                YD k = AbstractC2219xO.k();
                try {
                    k.b(c1509md);
                    if (c0721ad != null) {
                        G(200, c1420lG, 0, null);
                        AbstractC0868ct.D(this, c0721ad);
                        n(false);
                    } else if (!this.v || v == null || v.equals(C1311jd.a)) {
                        E();
                    } else {
                        G(200, c1420lG, 0, null);
                        AbstractC1305jX.i(2, v);
                        AbstractC0868ct.D(this, (InterfaceC2312yp) v);
                        n(false);
                    }
                    k.n(k.j - 1);
                    p();
                    this.C = false;
                    arrayList.clear();
                    EB.T(this.F.w);
                    r();
                    Trace.endSection();
                } finally {
                    k.n(k.j - 1);
                }
            } finally {
                this.C = false;
                arrayList.clear();
                a();
                EB.T(this.F.w);
                r();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void m(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        m(this.D.b[(i * 5) + 2], i2);
        if (TM.f(this.D.b, i)) {
            Object i3 = this.D.i(i);
            C1443ld c1443ld = this.I;
            c1443ld.c();
            c1443ld.h.a.add(i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x094d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(boolean z) {
        int hashCode;
        C1459lt c1459lt;
        int i;
        int i2;
        Throwable th;
        int i3;
        C0776bS c0776bS;
        boolean z2;
        boolean z3;
        int i4;
        C1575nd c1575nd;
        KG kg;
        FG fg;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        GH gh;
        int i10;
        int i11;
        int i12;
        C0841cS c0841cS;
        C1386km c1386km;
        KG kg2;
        C2211xG c2211xG;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        C1575nd c1575nd2;
        C0841cS c0841cS2;
        KG kg3;
        C2145wG c2145wG;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        C1459lt c1459lt2;
        int i24;
        int i25;
        GH gh2;
        HashSet hashSet;
        int i26;
        int i27;
        int i28;
        ArrayList arrayList;
        int i29;
        LinkedHashSet linkedHashSet;
        int i30;
        int i31;
        Object[] objArr;
        int i32;
        int i33;
        Object[] objArr2;
        long[] jArr;
        long j;
        long[] jArr2;
        Object obj;
        Object obj2;
        int hashCode2;
        int i34;
        int i35;
        C1459lt c1459lt3 = this.m;
        int i36 = 2;
        int i37 = c1459lt3.a[c1459lt3.b - 2] - 1;
        boolean z4 = this.L;
        C1623oL c1623oL = C1311jd.a;
        if (z4) {
            C0972eS c0972eS = this.F;
            int i38 = c0972eS.v;
            int i39 = c0972eS.b[c0972eS.p(i38) * 5];
            C0972eS c0972eS2 = this.F;
            int p = c0972eS2.p(i38);
            if (TM.e(c0972eS2.b, p)) {
                Object[] objArr3 = c0972eS2.c;
                int[] iArr = c0972eS2.b;
                int i40 = p * 5;
                int i41 = iArr[i40 + 4];
                switch (iArr[i40 + 1] >> 30) {
                    case 0:
                        i35 = 0;
                        break;
                    case 1:
                    case 2:
                    case 4:
                        i35 = 1;
                        break;
                    case 3:
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                        i35 = 2;
                        break;
                    default:
                        i35 = 3;
                        break;
                }
                obj = objArr3[i35 + i41];
            } else {
                obj = null;
            }
            C0972eS c0972eS3 = this.F;
            int p2 = c0972eS3.p(i38);
            if (TM.d(c0972eS3.b, p2)) {
                Object[] objArr4 = c0972eS3.c;
                int[] iArr2 = c0972eS3.b;
                int f = c0972eS3.f(iArr2, p2);
                switch (iArr2[(p2 * 5) + 1] >> 29) {
                    case 0:
                        i34 = 0;
                        break;
                    case 1:
                    case 2:
                    case 4:
                        i34 = 1;
                        break;
                    case 3:
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                        i34 = 2;
                        break;
                    default:
                        i34 = 3;
                        break;
                }
                obj2 = objArr4[i34 + f];
            } else {
                obj2 = c1623oL;
            }
            if (obj != null) {
                hashCode2 = Integer.hashCode(obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode()) ^ Integer.rotateRight(this.M, 3);
            } else if (obj2 == null || i39 != 207 || obj2.equals(c1623oL)) {
                hashCode2 = Integer.rotateRight(i37 ^ this.M, 3) ^ Integer.hashCode(i39);
            } else {
                this.M = Integer.rotateRight(Integer.rotateRight(i37 ^ this.M, 3) ^ Integer.hashCode(obj2.hashCode()), 3);
            }
            this.M = Integer.rotateRight(hashCode2, 3);
        } else {
            C0776bS c0776bS2 = this.D;
            int i42 = c0776bS2.i;
            int[] iArr3 = c0776bS2.b;
            int i43 = iArr3[i42 * 5];
            Object j2 = c0776bS2.j(iArr3, i42);
            C0776bS c0776bS3 = this.D;
            Object b = c0776bS3.b(c0776bS3.b, i42);
            if (j2 != null) {
                hashCode = Integer.hashCode(j2 instanceof Enum ? ((Enum) j2).ordinal() : j2.hashCode()) ^ Integer.rotateRight(this.M, 3);
            } else if (b == null || i43 != 207 || b.equals(c1623oL)) {
                hashCode = Integer.rotateRight(i37 ^ this.M, 3) ^ Integer.hashCode(i43);
            } else {
                this.M = Integer.rotateRight(Integer.rotateRight(i37 ^ this.M, 3) ^ Integer.hashCode(b.hashCode()), 3);
            }
            this.M = Integer.rotateRight(hashCode, 3);
        }
        int i44 = this.k;
        GH gh3 = this.i;
        ArrayList arrayList2 = this.r;
        C1443ld c1443ld = this.I;
        if (gh3 != null) {
            C2340zD c2340zD = gh3.e;
            int i45 = gh3.b;
            ArrayList arrayList3 = gh3.a;
            if (arrayList3.size() > 0) {
                ArrayList arrayList4 = gh3.d;
                i2 = -1;
                th = null;
                HashSet hashSet2 = new HashSet(arrayList4.size());
                int size = arrayList4.size();
                int i46 = 0;
                while (i46 < size) {
                    hashSet2.add(arrayList4.get(i46));
                    i46++;
                    i36 = i36;
                }
                i = i36;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList4.size();
                int size3 = arrayList3.size();
                int i47 = 0;
                int i48 = 0;
                int i49 = 0;
                while (i47 < size3) {
                    C0156Fx c0156Fx = (C0156Fx) arrayList3.get(i47);
                    if (hashSet2.contains(c0156Fx)) {
                        c1459lt2 = c1459lt3;
                        i24 = i47;
                        if (!linkedHashSet2.contains(c0156Fx)) {
                            int i50 = i48;
                            if (i50 < size2) {
                                C0156Fx c0156Fx2 = (C0156Fx) arrayList4.get(i50);
                                if (c0156Fx2 != c0156Fx) {
                                    C0866cr c0866cr = (C0866cr) c2340zD.e(c0156Fx2.c);
                                    int i51 = c0866cr != null ? c0866cr.b : -1;
                                    linkedHashSet2.add(c0156Fx2);
                                    i25 = i50;
                                    i29 = i49;
                                    linkedHashSet = linkedHashSet2;
                                    if (i51 != i29) {
                                        C0866cr c0866cr2 = (C0866cr) c2340zD.e(c0156Fx2.c);
                                        int i52 = c0866cr2 != null ? c0866cr2.c : c0156Fx2.d;
                                        gh2 = gh3;
                                        int i53 = i51 + i45;
                                        hashSet = hashSet2;
                                        int i54 = i29 + i45;
                                        if (i52 > 0) {
                                            i26 = size2;
                                            int i55 = c1443ld.l;
                                            if (i55 > 0) {
                                                i27 = size3;
                                                if (c1443ld.j == i53 - i55 && c1443ld.k == i54 - i55) {
                                                    c1443ld.l = i55 + i52;
                                                }
                                            } else {
                                                i27 = size3;
                                            }
                                            c1443ld.c();
                                            c1443ld.j = i53;
                                            c1443ld.k = i54;
                                            c1443ld.l = i52;
                                        } else {
                                            i26 = size2;
                                            i27 = size3;
                                            c1443ld.getClass();
                                        }
                                        if (i51 > i29) {
                                            Object[] objArr5 = c2340zD.c;
                                            long[] jArr3 = c2340zD.a;
                                            int length = jArr3.length - 2;
                                            if (length >= 0) {
                                                int i56 = i52;
                                                int i57 = 0;
                                                while (true) {
                                                    long j3 = jArr3[i57];
                                                    i28 = i45;
                                                    arrayList = arrayList3;
                                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i58 = 8 - ((~(i57 - length)) >>> 31);
                                                        int i59 = 0;
                                                        while (i59 < i58) {
                                                            if ((j3 & 255) < 128) {
                                                                j = j3;
                                                                C0866cr c0866cr3 = (C0866cr) objArr5[(i57 << 3) + i59];
                                                                int i60 = c0866cr3.b;
                                                                jArr2 = jArr3;
                                                                if (i51 <= i60 && i60 < i51 + i56) {
                                                                    c0866cr3.b = (i60 - i51) + i29;
                                                                } else if (i29 <= i60 && i60 < i51) {
                                                                    c0866cr3.b = i60 + i56;
                                                                }
                                                            } else {
                                                                j = j3;
                                                                jArr2 = jArr3;
                                                            }
                                                            j3 = j >> 8;
                                                            i59++;
                                                            jArr3 = jArr2;
                                                        }
                                                        jArr = jArr3;
                                                        if (i58 != 8) {
                                                        }
                                                    } else {
                                                        jArr = jArr3;
                                                    }
                                                    if (i57 != length) {
                                                        i57++;
                                                        i45 = i28;
                                                        arrayList3 = arrayList;
                                                        jArr3 = jArr;
                                                    }
                                                }
                                            }
                                        } else {
                                            int i61 = i52;
                                            i28 = i45;
                                            arrayList = arrayList3;
                                            if (i29 > i51) {
                                                Object[] objArr6 = c2340zD.c;
                                                long[] jArr4 = c2340zD.a;
                                                int length2 = jArr4.length - 2;
                                                if (length2 >= 0) {
                                                    int i62 = 0;
                                                    while (true) {
                                                        long j4 = jArr4[i62];
                                                        Object[] objArr7 = objArr6;
                                                        long[] jArr5 = jArr4;
                                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i63 = 8 - ((~(i62 - length2)) >>> 31);
                                                            int i64 = 0;
                                                            while (i64 < i63) {
                                                                if ((j4 & 255) < 128) {
                                                                    i32 = i64;
                                                                    C0866cr c0866cr4 = (C0866cr) objArr7[(i62 << 3) + i64];
                                                                    objArr2 = objArr7;
                                                                    int i65 = c0866cr4.b;
                                                                    i33 = i51;
                                                                    if (i51 <= i65 && i65 < i33 + i61) {
                                                                        c0866cr4.b = (i65 - i33) + i29;
                                                                    } else if (i33 + 1 <= i65 && i65 < i29) {
                                                                        c0866cr4.b = i65 - i61;
                                                                    }
                                                                } else {
                                                                    i32 = i64;
                                                                    i33 = i51;
                                                                    objArr2 = objArr7;
                                                                }
                                                                j4 >>= 8;
                                                                i64 = i32 + 1;
                                                                objArr7 = objArr2;
                                                                i51 = i33;
                                                            }
                                                            i31 = i51;
                                                            objArr = objArr7;
                                                            if (i63 != 8) {
                                                            }
                                                        } else {
                                                            i31 = i51;
                                                            objArr = objArr7;
                                                        }
                                                        if (i62 != length2) {
                                                            i62++;
                                                            jArr4 = jArr5;
                                                            objArr6 = objArr;
                                                            i51 = i31;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i30 = i24;
                                    } else {
                                        gh2 = gh3;
                                        hashSet = hashSet2;
                                        i26 = size2;
                                        i27 = size3;
                                    }
                                    i28 = i45;
                                    arrayList = arrayList3;
                                    i30 = i24;
                                } else {
                                    i25 = i50;
                                    gh2 = gh3;
                                    hashSet = hashSet2;
                                    i26 = size2;
                                    i27 = size3;
                                    i28 = i45;
                                    arrayList = arrayList3;
                                    i29 = i49;
                                    linkedHashSet = linkedHashSet2;
                                    i30 = i24 + 1;
                                }
                                i48 = i25 + 1;
                                C0866cr c0866cr5 = (C0866cr) c2340zD.e(c0156Fx2.c);
                                int i66 = i29 + (c0866cr5 != null ? c0866cr5.c : c0156Fx2.d);
                                i47 = i30;
                                linkedHashSet2 = linkedHashSet;
                                gh3 = gh2;
                                hashSet2 = hashSet;
                                size2 = i26;
                                size3 = i27;
                                i45 = i28;
                                arrayList3 = arrayList;
                                i49 = i66;
                                c1459lt3 = c1459lt2;
                            } else {
                                i48 = i50;
                                c1459lt3 = c1459lt2;
                                i47 = i24;
                            }
                        }
                    } else {
                        c1459lt2 = c1459lt3;
                        C0866cr c0866cr6 = (C0866cr) c2340zD.e(c0156Fx.c);
                        int i67 = c0866cr6 != null ? c0866cr6.b : -1;
                        int i68 = c0156Fx.c;
                        i24 = i47;
                        c1443ld.e(i67 + i45, c0156Fx.d);
                        gh3.a(i68, 0);
                        c1443ld.f = (i68 - c1443ld.a.D.g) + c1443ld.f;
                        this.D.k(i68);
                        z();
                        this.D.l();
                        EB.d(arrayList2, i68, this.D.b[(i68 * 5) + 3] + i68);
                    }
                    i47 = i24 + 1;
                    c1459lt3 = c1459lt2;
                }
                c1459lt = c1459lt3;
                c1443ld.c();
                if (arrayList3.size() > 0) {
                    C0776bS c0776bS4 = this.D;
                    c1443ld.f = (c0776bS4.h - c1443ld.a.D.g) + c1443ld.f;
                    c0776bS4.m();
                }
                i3 = this.j;
                while (true) {
                    c0776bS = this.D;
                    if (c0776bS.k <= 0 && (i23 = c0776bS.g) != c0776bS.h) {
                        z();
                        c1443ld.e(i3, this.D.l());
                        EB.d(arrayList2, i23, this.D.g);
                        i44 = i44;
                    }
                }
                z2 = this.L;
                if (z2) {
                    z3 = z2;
                    if (z) {
                        c1443ld.a();
                    }
                    C0776bS c0776bS5 = this.D;
                    int i69 = c0776bS5.m - c0776bS5.l;
                    if (i69 <= 0) {
                        i4 = i44;
                    } else {
                        if (i69 > 0) {
                            c1443ld.d(false);
                            C1459lt c1459lt4 = c1443ld.d;
                            C0776bS c0776bS6 = c1443ld.a.D;
                            if (c0776bS6.c > 0) {
                                int i70 = c0776bS6.i;
                                int i71 = c1459lt4.b;
                                if ((i71 > 0 ? c1459lt4.a[i71 - 1] : -2) != i70) {
                                    if (c1443ld.c || !c1443ld.e) {
                                        i4 = i44;
                                    } else {
                                        c1443ld.d(false);
                                        i4 = i44;
                                        c1443ld.b.s.j0(C2013uG.c);
                                        c1443ld.c = true;
                                    }
                                    if (i70 > 0) {
                                        C1471m2 a = c0776bS6.a(i70);
                                        c1459lt4.b(i70);
                                        c1443ld.d(false);
                                        KG kg4 = c1443ld.b.s;
                                        C1947tG c1947tG = C1947tG.c;
                                        int i72 = c1947tG.b;
                                        kg4.k0(c1947tG);
                                        AbstractC1052fg.R(kg4, 0, a);
                                        int i73 = kg4.y;
                                        int i74 = c1947tG.a;
                                        if (i73 != KG.d0(kg4, i74) || kg4.z != KG.d0(kg4, i72)) {
                                            int i75 = 1;
                                            StringBuilder sb = new StringBuilder();
                                            int i76 = 0;
                                            int i77 = 0;
                                            while (i76 < i74) {
                                                if (((i75 << i76) & kg4.y) != 0) {
                                                    if (i77 > 0) {
                                                        sb.append(", ");
                                                    }
                                                    sb.append(c1947tG.b(i76));
                                                    i77++;
                                                }
                                                i76++;
                                                i75 = 1;
                                            }
                                            String sb2 = sb.toString();
                                            StringBuilder n = AbstractC1888sN.n(sb2, "StringBuilder().apply(builderAction).toString()");
                                            int i78 = 0;
                                            int i79 = 0;
                                            while (i78 < i72) {
                                                int i80 = i72;
                                                if (((1 << i78) & kg4.z) != 0) {
                                                    if (i77 > 0) {
                                                        n.append(", ");
                                                    }
                                                    n.append(c1947tG.c(i78));
                                                    i79++;
                                                }
                                                i78++;
                                                i72 = i80;
                                            }
                                            String sb3 = n.toString();
                                            AbstractC0048Bt.m(sb3, "StringBuilder().apply(builderAction).toString()");
                                            StringBuilder sb4 = new StringBuilder("Error while pushing ");
                                            sb4.append(c1947tG);
                                            sb4.append(". Not all arguments were provided. Missing ");
                                            AbstractC1888sN.r(sb4, i77, " int arguments (", sb2, ") and ");
                                            AbstractC1888sN.u(sb4, i79, " object arguments (", sb3, ").");
                                            throw th;
                                        }
                                        c1443ld.c = true;
                                    }
                                    kg = c1443ld.b.s;
                                    fg = FG.c;
                                    i5 = fg.b;
                                    kg.k0(fg);
                                    AbstractC1052fg.Q(kg, 0, i69);
                                    i6 = kg.y;
                                    i7 = fg.a;
                                    if (i6 == KG.d0(kg, i7) || kg.z != KG.d0(kg, i5)) {
                                        StringBuilder sb5 = new StringBuilder();
                                        i8 = 0;
                                        int i81 = 0;
                                        while (i8 < i7) {
                                            int i82 = i7;
                                            if ((kg.y & (1 << i8)) != 0) {
                                                if (i81 > 0) {
                                                    sb5.append(", ");
                                                }
                                                sb5.append(fg.b(i8));
                                                i81++;
                                            }
                                            i8++;
                                            i7 = i82;
                                        }
                                        String sb6 = sb5.toString();
                                        StringBuilder n2 = AbstractC1888sN.n(sb6, "StringBuilder().apply(builderAction).toString()");
                                        i9 = 0;
                                        int i83 = 0;
                                        while (i9 < i5) {
                                            int i84 = i5;
                                            if (((1 << i9) & kg.z) != 0) {
                                                if (i81 > 0) {
                                                    n2.append(", ");
                                                }
                                                n2.append(fg.c(i9));
                                                i83++;
                                            }
                                            i9++;
                                            i5 = i84;
                                        }
                                        String sb7 = n2.toString();
                                        AbstractC0048Bt.m(sb7, "StringBuilder().apply(builderAction).toString()");
                                        StringBuilder sb8 = new StringBuilder("Error while pushing ");
                                        sb8.append(fg);
                                        sb8.append(". Not all arguments were provided. Missing ");
                                        AbstractC1888sN.r(sb8, i81, " int arguments (", sb6, ") and ");
                                        AbstractC1888sN.u(sb8, i83, " object arguments (", sb7, ").");
                                        throw th;
                                    }
                                }
                            }
                            i4 = i44;
                            kg = c1443ld.b.s;
                            fg = FG.c;
                            i5 = fg.b;
                            kg.k0(fg);
                            AbstractC1052fg.Q(kg, 0, i69);
                            i6 = kg.y;
                            i7 = fg.a;
                            if (i6 == KG.d0(kg, i7)) {
                            }
                            StringBuilder sb52 = new StringBuilder();
                            i8 = 0;
                            int i812 = 0;
                            while (i8 < i7) {
                            }
                            String sb62 = sb52.toString();
                            StringBuilder n22 = AbstractC1888sN.n(sb62, "StringBuilder().apply(builderAction).toString()");
                            i9 = 0;
                            int i832 = 0;
                            while (i9 < i5) {
                            }
                            String sb72 = n22.toString();
                            AbstractC0048Bt.m(sb72, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb82 = new StringBuilder("Error while pushing ");
                            sb82.append(fg);
                            sb82.append(". Not all arguments were provided. Missing ");
                            AbstractC1888sN.r(sb82, i812, " int arguments (", sb62, ") and ");
                            AbstractC1888sN.u(sb82, i832, " object arguments (", sb72, ").");
                            throw th;
                        }
                        i4 = i44;
                        c1443ld.getClass();
                    }
                    int i85 = c1443ld.a.D.i;
                    C1459lt c1459lt5 = c1443ld.d;
                    int i86 = c1459lt5.b;
                    if ((i86 > 0 ? c1459lt5.a[i86 - 1] : i2) > i85) {
                        EB.h("Missed recording an endGroup");
                        throw th;
                    }
                    if ((i86 > 0 ? c1459lt5.a[i86 - 1] : i2) == i85) {
                        c1443ld.d(false);
                        c1459lt5.a();
                        c1443ld.b.s.j0(C1815rG.c);
                    }
                    c1575nd = this;
                    int i87 = c1575nd.D.i;
                    int i88 = i4;
                    if (i88 != c1575nd.R(i87)) {
                        c1575nd.N(i87, i88);
                    }
                    i44 = z ? 1 : i88;
                    c1575nd.D.d();
                    c1443ld.c();
                } else {
                    if (z) {
                        C1386km c1386km2 = this.K;
                        KG kg5 = c1386km2.t;
                        if (!kg5.h0()) {
                            EB.h("Cannot end node insertion, there are no pending operations that can be realized.");
                            throw th;
                        }
                        KG kg6 = c1386km2.s;
                        if (kg5.g0()) {
                            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
                        }
                        JG[] jgArr = kg5.s;
                        int i89 = kg5.t - 1;
                        kg5.t = i89;
                        JG jg = jgArr[i89];
                        AbstractC0048Bt.k(jg);
                        int i90 = jg.a;
                        i10 = -2;
                        int i91 = jg.b;
                        z3 = z2;
                        kg5.s[kg5.t] = th;
                        kg6.k0(jg);
                        int i92 = kg5.x;
                        int i93 = kg6.x;
                        int i94 = i92;
                        int i95 = 0;
                        while (i95 < i91) {
                            i93--;
                            int i96 = i94 - 1;
                            int i97 = i95;
                            Object[] objArr8 = kg6.w;
                            Object[] objArr9 = kg5.w;
                            objArr8[i93] = objArr9[i96];
                            objArr9[i96] = th;
                            i95 = i97 + 1;
                            i94 = i96;
                        }
                        int i98 = kg5.v;
                        int i99 = kg6.v;
                        int i100 = i98;
                        int i101 = 0;
                        while (i101 < i90) {
                            i99--;
                            int i102 = i100 - 1;
                            int i103 = i101;
                            int[] iArr4 = kg6.u;
                            int[] iArr5 = kg5.u;
                            iArr4[i99] = iArr5[i102];
                            iArr5[i102] = 0;
                            i101 = i103 + 1;
                            i100 = i102;
                        }
                        kg5.x -= i91;
                        kg5.v -= i90;
                        i44 = 1;
                    } else {
                        z3 = z2;
                        i10 = -2;
                    }
                    C0776bS c0776bS7 = this.D;
                    int i104 = c0776bS7.k;
                    if (i104 <= 0) {
                        AbstractC1052fg.S("Unbalanced begin/end empty");
                        throw th;
                    }
                    c0776bS7.k = i104 - 1;
                    C0972eS c0972eS4 = this.F;
                    int i105 = c0972eS4.v;
                    c0972eS4.i();
                    if (this.D.k > 0) {
                        c1575nd2 = this;
                    } else {
                        int i106 = (-2) - i105;
                        this.F.j();
                        this.F.e(true);
                        C1471m2 c1471m2 = this.J;
                        if (this.K.s.g0()) {
                            C0841cS c0841cS3 = this.E;
                            c1443ld.b();
                            c1443ld.d(false);
                            C1459lt c1459lt6 = c1443ld.d;
                            C0776bS c0776bS8 = c1443ld.a.D;
                            i11 = i44;
                            if (c0776bS8.c > 0) {
                                int i107 = c0776bS8.i;
                                i12 = i106;
                                int i108 = c1459lt6.b;
                                if ((i108 > 0 ? c1459lt6.a[i108 - 1] : i10) != i107) {
                                    if (!c1443ld.c && c1443ld.e) {
                                        c1443ld.d(false);
                                        c1443ld.b.s.j0(C2013uG.c);
                                        c1443ld.c = true;
                                    }
                                    if (i107 > 0) {
                                        C1471m2 a2 = c0776bS8.a(i107);
                                        c1459lt6.b(i107);
                                        c1443ld.d(false);
                                        KG kg7 = c1443ld.b.s;
                                        C1947tG c1947tG2 = C1947tG.c;
                                        int i109 = c1947tG2.b;
                                        kg7.k0(c1947tG2);
                                        AbstractC1052fg.R(kg7, 0, a2);
                                        int i110 = kg7.y;
                                        int i111 = c1947tG2.a;
                                        c0841cS2 = c0841cS3;
                                        if (i110 != KG.d0(kg7, i111) || kg7.z != KG.d0(kg7, i109)) {
                                            int i112 = 1;
                                            StringBuilder sb9 = new StringBuilder();
                                            int i113 = 0;
                                            int i114 = 0;
                                            while (i113 < i111) {
                                                if (((i112 << i113) & kg7.y) != 0) {
                                                    if (i114 > 0) {
                                                        sb9.append(", ");
                                                    }
                                                    sb9.append(c1947tG2.b(i113));
                                                    i114++;
                                                }
                                                i113++;
                                                i112 = 1;
                                            }
                                            String sb10 = sb9.toString();
                                            StringBuilder n3 = AbstractC1888sN.n(sb10, "StringBuilder().apply(builderAction).toString()");
                                            int i115 = 0;
                                            int i116 = 0;
                                            while (i115 < i109) {
                                                int i117 = i109;
                                                if (((1 << i115) & kg7.z) != 0) {
                                                    if (i114 > 0) {
                                                        n3.append(", ");
                                                    }
                                                    n3.append(c1947tG2.c(i115));
                                                    i116++;
                                                }
                                                i115++;
                                                i109 = i117;
                                            }
                                            String sb11 = n3.toString();
                                            AbstractC0048Bt.m(sb11, "StringBuilder().apply(builderAction).toString()");
                                            StringBuilder sb12 = new StringBuilder("Error while pushing ");
                                            sb12.append(c1947tG2);
                                            sb12.append(". Not all arguments were provided. Missing ");
                                            AbstractC1888sN.r(sb12, i114, " int arguments (", sb10, ") and ");
                                            AbstractC1888sN.u(sb12, i116, " object arguments (", sb11, ").");
                                            throw th;
                                        }
                                        c1443ld.c = true;
                                        c1443ld.c();
                                        kg3 = c1443ld.b.s;
                                        c2145wG = C2145wG.c;
                                        i18 = c2145wG.b;
                                        kg3.k0(c2145wG);
                                        AbstractC1052fg.R(kg3, 0, c1471m2);
                                        AbstractC1052fg.R(kg3, 1, c0841cS2);
                                        i19 = kg3.y;
                                        i20 = c2145wG.a;
                                        if (i19 == KG.d0(kg3, i20) || kg3.z != KG.d0(kg3, i18)) {
                                            StringBuilder sb13 = new StringBuilder();
                                            i21 = 0;
                                            int i118 = 0;
                                            while (i21 < i20) {
                                                int i119 = i20;
                                                if ((kg3.y & (1 << i21)) != 0) {
                                                    if (i118 > 0) {
                                                        sb13.append(", ");
                                                    }
                                                    sb13.append(c2145wG.b(i21));
                                                    i118++;
                                                }
                                                i21++;
                                                i20 = i119;
                                            }
                                            String sb14 = sb13.toString();
                                            StringBuilder n4 = AbstractC1888sN.n(sb14, "StringBuilder().apply(builderAction).toString()");
                                            i22 = 0;
                                            int i120 = 0;
                                            while (i22 < i18) {
                                                int i121 = i18;
                                                if (((1 << i22) & kg3.z) != 0) {
                                                    if (i118 > 0) {
                                                        n4.append(", ");
                                                    }
                                                    n4.append(c2145wG.c(i22));
                                                    i120++;
                                                }
                                                i22++;
                                                i18 = i121;
                                            }
                                            String sb15 = n4.toString();
                                            AbstractC0048Bt.m(sb15, "StringBuilder().apply(builderAction).toString()");
                                            StringBuilder sb16 = new StringBuilder("Error while pushing ");
                                            sb16.append(c2145wG);
                                            sb16.append(". Not all arguments were provided. Missing ");
                                            AbstractC1888sN.r(sb16, i118, " int arguments (", sb14, ") and ");
                                            AbstractC1888sN.u(sb16, i120, " object arguments (", sb15, ").");
                                            throw th;
                                        }
                                        c1575nd2 = this;
                                    }
                                }
                            } else {
                                i12 = i106;
                            }
                            c0841cS2 = c0841cS3;
                            c1443ld.c();
                            kg3 = c1443ld.b.s;
                            c2145wG = C2145wG.c;
                            i18 = c2145wG.b;
                            kg3.k0(c2145wG);
                            AbstractC1052fg.R(kg3, 0, c1471m2);
                            AbstractC1052fg.R(kg3, 1, c0841cS2);
                            i19 = kg3.y;
                            i20 = c2145wG.a;
                            if (i19 == KG.d0(kg3, i20)) {
                            }
                            StringBuilder sb132 = new StringBuilder();
                            i21 = 0;
                            int i1182 = 0;
                            while (i21 < i20) {
                            }
                            String sb142 = sb132.toString();
                            StringBuilder n42 = AbstractC1888sN.n(sb142, "StringBuilder().apply(builderAction).toString()");
                            i22 = 0;
                            int i1202 = 0;
                            while (i22 < i18) {
                            }
                            String sb152 = n42.toString();
                            AbstractC0048Bt.m(sb152, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb162 = new StringBuilder("Error while pushing ");
                            sb162.append(c2145wG);
                            sb162.append(". Not all arguments were provided. Missing ");
                            AbstractC1888sN.r(sb162, i1182, " int arguments (", sb142, ") and ");
                            AbstractC1888sN.u(sb162, i1202, " object arguments (", sb152, ").");
                            throw th;
                        }
                        i11 = i44;
                        i12 = i106;
                        C0841cS c0841cS4 = this.E;
                        C1386km c1386km3 = this.K;
                        c1443ld.b();
                        c1443ld.d(false);
                        C1459lt c1459lt7 = c1443ld.d;
                        C0776bS c0776bS9 = c1443ld.a.D;
                        if (c0776bS9.c > 0) {
                            int i122 = c0776bS9.i;
                            int i123 = c1459lt7.b;
                            if ((i123 > 0 ? c1459lt7.a[i123 - 1] : i10) != i122) {
                                if (c1443ld.c || !c1443ld.e) {
                                    c1386km = c1386km3;
                                } else {
                                    c1443ld.d(false);
                                    c1386km = c1386km3;
                                    c1443ld.b.s.j0(C2013uG.c);
                                    c1443ld.c = true;
                                }
                                if (i122 > 0) {
                                    C1471m2 a3 = c0776bS9.a(i122);
                                    c1459lt7.b(i122);
                                    c1443ld.d(false);
                                    KG kg8 = c1443ld.b.s;
                                    C1947tG c1947tG3 = C1947tG.c;
                                    int i124 = c1947tG3.b;
                                    kg8.k0(c1947tG3);
                                    AbstractC1052fg.R(kg8, 0, a3);
                                    int i125 = kg8.y;
                                    int i126 = c1947tG3.a;
                                    c0841cS = c0841cS4;
                                    if (i125 != KG.d0(kg8, i126) || kg8.z != KG.d0(kg8, i124)) {
                                        int i127 = 1;
                                        StringBuilder sb17 = new StringBuilder();
                                        int i128 = 0;
                                        int i129 = 0;
                                        while (i128 < i126) {
                                            if (((i127 << i128) & kg8.y) != 0) {
                                                if (i129 > 0) {
                                                    sb17.append(", ");
                                                }
                                                sb17.append(c1947tG3.b(i128));
                                                i129++;
                                            }
                                            i128++;
                                            i127 = 1;
                                        }
                                        String sb18 = sb17.toString();
                                        StringBuilder n5 = AbstractC1888sN.n(sb18, "StringBuilder().apply(builderAction).toString()");
                                        int i130 = 0;
                                        int i131 = 0;
                                        while (i130 < i124) {
                                            int i132 = i124;
                                            if (((1 << i130) & kg8.z) != 0) {
                                                if (i129 > 0) {
                                                    n5.append(", ");
                                                }
                                                n5.append(c1947tG3.c(i130));
                                                i131++;
                                            }
                                            i130++;
                                            i124 = i132;
                                        }
                                        String sb19 = n5.toString();
                                        AbstractC0048Bt.m(sb19, "StringBuilder().apply(builderAction).toString()");
                                        StringBuilder sb20 = new StringBuilder("Error while pushing ");
                                        sb20.append(c1947tG3);
                                        sb20.append(". Not all arguments were provided. Missing ");
                                        AbstractC1888sN.r(sb20, i129, " int arguments (", sb18, ") and ");
                                        AbstractC1888sN.u(sb20, i131, " object arguments (", sb19, ").");
                                        throw th;
                                    }
                                    c1443ld.c = true;
                                } else {
                                    c0841cS = c0841cS4;
                                }
                                c1443ld.c();
                                kg2 = c1443ld.b.s;
                                c2211xG = C2211xG.c;
                                i13 = c2211xG.b;
                                kg2.k0(c2211xG);
                                AbstractC1052fg.R(kg2, 0, c1471m2);
                                AbstractC1052fg.R(kg2, 1, c0841cS);
                                AbstractC1052fg.R(kg2, i, c1386km);
                                i14 = kg2.y;
                                i15 = c2211xG.a;
                                if (i14 == KG.d0(kg2, i15) || kg2.z != KG.d0(kg2, i13)) {
                                    StringBuilder sb21 = new StringBuilder();
                                    i16 = 0;
                                    int i133 = 0;
                                    while (i16 < i15) {
                                        int i134 = i15;
                                        if (((1 << i16) & kg2.y) != 0) {
                                            if (i133 > 0) {
                                                sb21.append(", ");
                                            }
                                            sb21.append(c2211xG.b(i16));
                                            i133++;
                                        }
                                        i16++;
                                        i15 = i134;
                                    }
                                    String sb22 = sb21.toString();
                                    StringBuilder n6 = AbstractC1888sN.n(sb22, "StringBuilder().apply(builderAction).toString()");
                                    i17 = 0;
                                    int i135 = 0;
                                    while (i17 < i13) {
                                        int i136 = i13;
                                        if (((1 << i17) & kg2.z) != 0) {
                                            if (i133 > 0) {
                                                n6.append(", ");
                                            }
                                            n6.append(c2211xG.c(i17));
                                            i135++;
                                        }
                                        i17++;
                                        i13 = i136;
                                    }
                                    String sb23 = n6.toString();
                                    AbstractC0048Bt.m(sb23, "StringBuilder().apply(builderAction).toString()");
                                    StringBuilder sb24 = new StringBuilder("Error while pushing ");
                                    sb24.append(c2211xG);
                                    sb24.append(". Not all arguments were provided. Missing ");
                                    AbstractC1888sN.r(sb24, i133, " int arguments (", sb22, ") and ");
                                    AbstractC1888sN.u(sb24, i135, " object arguments (", sb23, ").");
                                    throw th;
                                }
                                c1575nd2 = this;
                                c1575nd2.K = new C1386km();
                            }
                        }
                        c0841cS = c0841cS4;
                        c1386km = c1386km3;
                        c1443ld.c();
                        kg2 = c1443ld.b.s;
                        c2211xG = C2211xG.c;
                        i13 = c2211xG.b;
                        kg2.k0(c2211xG);
                        AbstractC1052fg.R(kg2, 0, c1471m2);
                        AbstractC1052fg.R(kg2, 1, c0841cS);
                        AbstractC1052fg.R(kg2, i, c1386km);
                        i14 = kg2.y;
                        i15 = c2211xG.a;
                        if (i14 == KG.d0(kg2, i15)) {
                        }
                        StringBuilder sb212 = new StringBuilder();
                        i16 = 0;
                        int i1332 = 0;
                        while (i16 < i15) {
                        }
                        String sb222 = sb212.toString();
                        StringBuilder n62 = AbstractC1888sN.n(sb222, "StringBuilder().apply(builderAction).toString()");
                        i17 = 0;
                        int i1352 = 0;
                        while (i17 < i13) {
                        }
                        String sb232 = n62.toString();
                        AbstractC0048Bt.m(sb232, "StringBuilder().apply(builderAction).toString()");
                        StringBuilder sb242 = new StringBuilder("Error while pushing ");
                        sb242.append(c2211xG);
                        sb242.append(". Not all arguments were provided. Missing ");
                        AbstractC1888sN.r(sb242, i1332, " int arguments (", sb222, ") and ");
                        AbstractC1888sN.u(sb242, i1352, " object arguments (", sb232, ").");
                        throw th;
                        c1575nd2.L = false;
                        if (c1575nd2.c.i == 0) {
                            i44 = i11;
                        } else {
                            int i137 = i12;
                            c1575nd2.M(i137, 0);
                            i44 = i11;
                            c1575nd2.N(i137, i44);
                        }
                    }
                    c1575nd = c1575nd2;
                }
                gh = (GH) c1575nd.h.a.remove(r1.size() - 1);
                if (gh != null && !z3) {
                    gh.c++;
                }
                c1575nd.i = gh;
                c1575nd.j = c1459lt.a() + i44;
                c1575nd.l = c1459lt.a();
                c1575nd.k = c1459lt.a() + i44;
            }
        }
        c1459lt = c1459lt3;
        i = 2;
        i2 = -1;
        th = null;
        i3 = this.j;
        while (true) {
            c0776bS = this.D;
            if (c0776bS.k <= 0) {
                z();
                c1443ld.e(i3, this.D.l());
                EB.d(arrayList2, i23, this.D.g);
                i44 = i44;
            }
        }
        z2 = this.L;
        if (z2) {
        }
        gh = (GH) c1575nd.h.a.remove(r1.size() - 1);
        if (gh != null) {
            gh.c++;
        }
        c1575nd.i = gh;
        c1575nd.j = c1459lt.a() + i44;
        c1575nd.l = c1459lt.a();
        c1575nd.k = c1459lt.a() + i44;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v4, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WL o() {
        WL wl;
        ?? r16;
        WL wl2;
        C1471m2 a;
        VL vl;
        VL vl2;
        C1621oJ c1621oJ = this.B;
        if (c1621oJ.a.isEmpty()) {
            wl = null;
        } else {
            ArrayList arrayList = c1621oJ.a;
            wl = (WL) arrayList.remove(arrayList.size() - 1);
        }
        if (wl != null) {
            wl.a &= -9;
        }
        if (wl != null) {
            int i = this.y;
            GD gd = wl.f;
            if (gd != null && (wl.a & 16) == 0) {
                Object[] objArr = gd.b;
                int[] iArr = gd.c;
                long[] jArr = gd.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    loop0: while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            vl = null;
                            r16 = 0;
                            vl = null;
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j & 255) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj = objArr[i5];
                                    if (iArr[i5] != i) {
                                        vl2 = new VL(wl, i, gd);
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        } else {
                            vl = null;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                    if (vl2 != null) {
                        KG kg = this.I.b.s;
                        C1750qG c1750qG = C1750qG.c;
                        int i6 = c1750qG.b;
                        kg.k0(c1750qG);
                        AbstractC1052fg.R(kg, 0, vl2);
                        AbstractC1052fg.R(kg, 1, this.g);
                        int i7 = kg.y;
                        int i8 = c1750qG.a;
                        if (i7 != KG.d0(kg, i8) || kg.z != KG.d0(kg, i6)) {
                            StringBuilder sb = new StringBuilder();
                            int i9 = 0;
                            for (int i10 = 0; i10 < i8; i10++) {
                                if (((1 << i10) & kg.y) != 0) {
                                    if (i9 > 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(c1750qG.b(i10));
                                    i9++;
                                }
                            }
                            String sb2 = sb.toString();
                            StringBuilder n = AbstractC1888sN.n(sb2, "StringBuilder().apply(builderAction).toString()");
                            int i11 = 0;
                            for (int i12 = 0; i12 < i6; i12++) {
                                if (((1 << i12) & kg.z) != 0) {
                                    if (i9 > 0) {
                                        n.append(", ");
                                    }
                                    n.append(c1750qG.c(i12));
                                    i11++;
                                }
                            }
                            String sb3 = n.toString();
                            AbstractC0048Bt.m(sb3, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb4 = new StringBuilder("Error while pushing ");
                            sb4.append(c1750qG);
                            sb4.append(". Not all arguments were provided. Missing ");
                            AbstractC1888sN.r(sb4, i9, " int arguments (", sb2, ") and ");
                            AbstractC1888sN.u(sb4, i11, " object arguments (", sb3, ").");
                            throw r16;
                        }
                    }
                }
            }
            vl = null;
            vl2 = vl;
            r16 = vl;
            if (vl2 != null) {
            }
        } else {
            r16 = 0;
        }
        if (wl != null) {
            int i13 = wl.a;
            if ((i13 & 16) == 0 && ((i13 & 1) != 0 || this.p)) {
                if (wl.c == null) {
                    if (this.L) {
                        C0972eS c0972eS = this.F;
                        a = c0972eS.b(c0972eS.v);
                    } else {
                        C0776bS c0776bS = this.D;
                        a = c0776bS.a(c0776bS.i);
                    }
                    wl.c = a;
                }
                wl.a &= -5;
                wl2 = wl;
                n(false);
                return wl2;
            }
        }
        wl2 = r16;
        n(false);
        return wl2;
    }

    public final void p() {
        n(false);
        n(false);
        C1443ld c1443ld = this.I;
        if (c1443ld.c) {
            c1443ld.d(false);
            c1443ld.d(false);
            c1443ld.b.s.j0(C1815rG.c);
            c1443ld.c = false;
        }
        c1443ld.b();
        if (c1443ld.d.b != 0) {
            EB.h("Missed recording an endGroup()");
            throw null;
        }
        if (!this.h.a.isEmpty()) {
            EB.h("Start/end imbalance");
            throw null;
        }
        f();
        this.D.c();
        this.v = this.w.a() != 0;
    }

    public final void q(boolean z, GH gh) {
        this.h.a.add(this.i);
        this.i = gh;
        int i = this.k;
        C1459lt c1459lt = this.m;
        c1459lt.b(i);
        c1459lt.b(this.l);
        c1459lt.b(this.j);
        if (z) {
            this.j = 0;
        }
        this.k = 0;
        this.l = 0;
    }

    public final void r() {
        C0841cS c0841cS = new C0841cS();
        if (this.z) {
            c0841cS.p = new HashMap();
        }
        if (((Boolean) C0901dM.w.get()).booleanValue()) {
            c0841cS.q = new C2340zD();
        }
        this.E = c0841cS;
        C0972eS l = c0841cS.l();
        l.e(true);
        this.F = l;
    }

    public final WL s() {
        if (this.x != 0) {
            return null;
        }
        C1621oJ c1621oJ = this.B;
        if (c1621oJ.a.isEmpty()) {
            return null;
        }
        return (WL) c1621oJ.a.get(r0.size() - 1);
    }

    public final boolean t() {
        WL s;
        return (this.L || this.v || (s = s()) == null || (s.a & 8) != 0) ? false : true;
    }

    public final void u(ArrayList arrayList) {
        C2231xa c2231xa = this.f;
        C1443ld c1443ld = this.I;
        C2231xa c2231xa2 = c1443ld.b;
        try {
            c1443ld.b = c2231xa;
            c2231xa.s.j0(DG.c);
            if (arrayList.size() <= 0) {
                c1443ld.b.s.j0(C1881sG.c);
                c1443ld.f = 0;
            } else {
                C1619oH c1619oH = (C1619oH) arrayList.get(0);
                AbstractC1549nD abstractC1549nD = (AbstractC1549nD) c1619oH.h;
                abstractC1549nD.getClass();
                throw null;
            }
        } finally {
            c1443ld.b = c2231xa2;
        }
    }

    public final Object v() {
        if (!this.L) {
            return this.D.h();
        }
        if (!this.q) {
            return C1311jd.a;
        }
        EB.h("A call to createNode(), emitNode() or useNode() expected");
        throw null;
    }

    public final int w(int i) {
        int i2 = TM.i(this.D.b, i) + 1;
        int i3 = 0;
        while (i2 < i) {
            if (!TM.e(this.D.b, i2)) {
                i3++;
            }
            i2 += TM.c(this.D.b, i2);
        }
        return i3;
    }

    public final boolean x(C1818rJ c1818rJ) {
        KG kg = this.e.s;
        if (!kg.g0()) {
            EB.h("Expected applyChanges() to have been called");
            throw null;
        }
        if (((MD) c1818rJ.i).e <= 0 && this.r.isEmpty()) {
            return false;
        }
        l(c1818rJ, null);
        return kg.h0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r3.b < r5) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y() {
        C0256Jt c0256Jt;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        long j;
        C0256Jt c0256Jt2;
        int i7;
        GD gd;
        int i8;
        int q;
        C0782bY c0782bY;
        boolean z2 = this.C;
        boolean z3 = true;
        this.C = true;
        C0776bS c0776bS = this.D;
        int i9 = c0776bS.i;
        int i10 = (i9 * 5) + 3;
        int i11 = c0776bS.b[i10] + i9;
        int i12 = this.j;
        int i13 = this.M;
        int i14 = this.k;
        int i15 = this.l;
        int i16 = c0776bS.g;
        ArrayList arrayList = this.r;
        int q2 = EB.q(i16, arrayList);
        if (q2 < 0) {
            q2 = -(q2 + 1);
        }
        if (q2 < arrayList.size()) {
            c0256Jt = (C0256Jt) arrayList.get(q2);
        }
        c0256Jt = null;
        int i17 = i9;
        boolean z4 = false;
        while (c0256Jt != null) {
            boolean z5 = z3;
            WL wl = c0256Jt.a;
            int i18 = c0256Jt.b;
            int q3 = EB.q(i18, arrayList);
            if (q3 >= 0) {
            }
            Object obj = c0256Jt.c;
            if (obj == null) {
                wl.getClass();
                i = i10;
            } else {
                int i19 = 8;
                MD md = wl.g;
                if (md == null) {
                    i = i10;
                } else {
                    i = i10;
                    if (obj instanceof C1645oh) {
                        z = WL.a((C1645oh) obj, md);
                        i2 = i12;
                        i3 = i13;
                        i4 = i14;
                        i5 = i15;
                    } else if (obj instanceof QD) {
                        QD qd = (QD) obj;
                        if (qd.h()) {
                            Object[] objArr = qd.b;
                            long[] jArr = qd.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                i4 = i14;
                                i5 = i15;
                                int i20 = 0;
                                while (true) {
                                    long j2 = jArr[i20];
                                    i2 = i12;
                                    i3 = i13;
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i21 = 8 - ((~(i20 - length)) >>> 31);
                                        int i22 = 0;
                                        while (i22 < i21) {
                                            if ((j2 & 255) < 128) {
                                                i6 = i22;
                                                Object obj2 = objArr[(i20 << 3) + i22];
                                                j = j2;
                                                if (!(obj2 instanceof C1645oh) || WL.a((C1645oh) obj2, md)) {
                                                    break;
                                                }
                                            } else {
                                                i6 = i22;
                                                j = j2;
                                            }
                                            j2 = j >> i19;
                                            i22 = i6 + 1;
                                        }
                                        if (i21 != i19) {
                                            break;
                                        }
                                    }
                                    if (i20 == length) {
                                        break;
                                    }
                                    i20++;
                                    i12 = i2;
                                    i13 = i3;
                                    i19 = 8;
                                }
                                z = z5 ? 1 : 0;
                            }
                        }
                        i2 = i12;
                        i3 = i13;
                        i4 = i14;
                        i5 = i15;
                        z = false;
                    }
                    if (z) {
                        int i23 = i3;
                        c0256Jt2 = null;
                        C1621oJ c1621oJ = this.B;
                        c1621oJ.a.add(wl);
                        C2036ud c2036ud = wl.b;
                        if (c2036ud == null || (gd = wl.f) == null) {
                            i7 = i23;
                        } else {
                            wl.e(z5);
                            try {
                                Object[] objArr2 = gd.b;
                                int[] iArr = gd.c;
                                long[] jArr2 = gd.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i24 = 0;
                                    while (true) {
                                        long j3 = jArr2[i24];
                                        long[] jArr3 = jArr2;
                                        i7 = i23;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i25 = 8 - ((~(i24 - length2)) >>> 31);
                                            for (int i26 = 0; i26 < i25; i26 = i8 + 1) {
                                                if ((j3 & 255) < 128) {
                                                    int i27 = (i24 << 3) + i26;
                                                    i8 = i26;
                                                    Object obj3 = objArr2[i27];
                                                    int i28 = iArr[i27];
                                                    c2036ud.s(obj3);
                                                } else {
                                                    i8 = i26;
                                                }
                                                j3 >>= 8;
                                            }
                                            if (i25 != 8) {
                                                break;
                                            }
                                        }
                                        if (i24 == length2) {
                                            break;
                                        }
                                        i24++;
                                        i23 = i7;
                                        jArr2 = jArr3;
                                    }
                                } else {
                                    i7 = i23;
                                }
                                wl.e(false);
                            } catch (Throwable th) {
                                wl.e(false);
                                throw th;
                            }
                        }
                        z5 = true;
                        c1621oJ.a.remove(r2.size() - 1);
                    } else {
                        this.D.k(i18);
                        int i29 = this.D.g;
                        B(i17, i29, i9);
                        int i30 = (i29 * 5) + 2;
                        int i31 = this.D.b[i30];
                        while (i31 != i9 && !TM.f(this.D.b, i31)) {
                            i31 = this.D.b[(i31 * 5) + 2];
                        }
                        int i32 = TM.f(this.D.b, i31) ? 0 : i2;
                        if (i31 != i29) {
                            int R = (R(i31) - TM.h(this.D.b, i29)) + i32;
                            while (i32 < R && i31 != i18) {
                                i31++;
                                while (i31 < i18) {
                                    int[] iArr2 = this.D.b;
                                    int i33 = iArr2[(i31 * 5) + 3] + i31;
                                    if (i18 >= i33) {
                                        i32 += TM.f(iArr2, i31) ? z5 ? 1 : 0 : R(i31);
                                        i31 = i33;
                                    }
                                }
                                break;
                            }
                        }
                        this.j = i32;
                        this.l = w(i29);
                        int i34 = this.D.b[i30];
                        int i35 = i3;
                        this.M = g(i34, w(i34), i9, i35);
                        this.H = null;
                        InterfaceC2312yp interfaceC2312yp = wl.d;
                        if (interfaceC2312yp != null) {
                            interfaceC2312yp.invoke(this, Integer.valueOf(z5 ? 1 : 0));
                            c0782bY = C0782bY.a;
                        } else {
                            c0782bY = null;
                        }
                        if (c0782bY == null) {
                            throw new IllegalStateException("Invalid restart scope");
                        }
                        this.H = null;
                        C0776bS c0776bS2 = this.D;
                        int i36 = c0776bS2.b[i] + i9;
                        int i37 = c0776bS2.g;
                        if (!((i37 < i9 || i37 > i36) ? false : z5 ? 1 : 0)) {
                            EB.h("Index " + i9 + " is not a parent of " + i37);
                            throw null;
                        }
                        c0776bS2.i = i9;
                        c0776bS2.h = i36;
                        c0776bS2.l = 0;
                        c0776bS2.m = 0;
                        i17 = i29;
                        i7 = i35;
                        z4 = z5 ? 1 : 0;
                        c0256Jt2 = null;
                    }
                    q = EB.q(this.D.g, arrayList);
                    if (q < 0) {
                        q = -(q + 1);
                    }
                    if (q < arrayList.size()) {
                        C0256Jt c0256Jt3 = (C0256Jt) arrayList.get(q);
                        if (c0256Jt3.b < i11) {
                            c0256Jt = c0256Jt3;
                            z3 = z5;
                            i10 = i;
                            i14 = i4;
                            i15 = i5;
                            i12 = i2;
                            i13 = i7;
                        }
                    }
                    c0256Jt = c0256Jt2;
                    z3 = z5;
                    i10 = i;
                    i14 = i4;
                    i15 = i5;
                    i12 = i2;
                    i13 = i7;
                }
            }
            i2 = i12;
            i3 = i13;
            i4 = i14;
            i5 = i15;
            z = z5 ? 1 : 0;
            if (z) {
            }
            q = EB.q(this.D.g, arrayList);
            if (q < 0) {
            }
            if (q < arrayList.size()) {
            }
            c0256Jt = c0256Jt2;
            z3 = z5;
            i10 = i;
            i14 = i4;
            i15 = i5;
            i12 = i2;
            i13 = i7;
        }
        int i38 = i12;
        int i39 = i13;
        int i40 = i14;
        int i41 = i15;
        if (z4) {
            B(i17, i9, i9);
            this.D.m();
            int R2 = R(i9);
            this.j = i38 + R2;
            this.k = i40 + R2;
            this.l = i41;
        } else {
            C0776bS c0776bS3 = this.D;
            int i42 = c0776bS3.i;
            this.k = i42 >= 0 ? TM.h(c0776bS3.b, i42) : 0;
            this.D.m();
        }
        this.M = i39;
        this.C = z2;
    }

    public final void z() {
        D(this, this.D.g, false, 0);
        C1443ld c1443ld = this.I;
        c1443ld.c();
        c1443ld.d(false);
        C1459lt c1459lt = c1443ld.d;
        C1575nd c1575nd = c1443ld.a;
        C0776bS c0776bS = c1575nd.D;
        if (c0776bS.c > 0) {
            int i = c0776bS.i;
            int i2 = c1459lt.b;
            if ((i2 > 0 ? c1459lt.a[i2 - 1] : -2) != i) {
                if (!c1443ld.c && c1443ld.e) {
                    c1443ld.d(false);
                    c1443ld.b.s.j0(C2013uG.c);
                    c1443ld.c = true;
                }
                if (i > 0) {
                    C1471m2 a = c0776bS.a(i);
                    c1459lt.b(i);
                    c1443ld.d(false);
                    KG kg = c1443ld.b.s;
                    C1947tG c1947tG = C1947tG.c;
                    int i3 = c1947tG.b;
                    kg.k0(c1947tG);
                    AbstractC1052fg.R(kg, 0, a);
                    int i4 = kg.y;
                    int i5 = c1947tG.a;
                    if (i4 != KG.d0(kg, i5) || kg.z != KG.d0(kg, i3)) {
                        StringBuilder sb = new StringBuilder();
                        int i6 = 0;
                        for (int i7 = 0; i7 < i5; i7++) {
                            if (((1 << i7) & kg.y) != 0) {
                                if (i6 > 0) {
                                    sb.append(", ");
                                }
                                sb.append(c1947tG.b(i7));
                                i6++;
                            }
                        }
                        String sb2 = sb.toString();
                        StringBuilder n = AbstractC1888sN.n(sb2, "StringBuilder().apply(builderAction).toString()");
                        int i8 = 0;
                        for (int i9 = 0; i9 < i3; i9++) {
                            if (((1 << i9) & kg.z) != 0) {
                                if (i6 > 0) {
                                    n.append(", ");
                                }
                                n.append(c1947tG.c(i9));
                                i8++;
                            }
                        }
                        String sb3 = n.toString();
                        AbstractC0048Bt.m(sb3, "StringBuilder().apply(builderAction).toString()");
                        StringBuilder sb4 = new StringBuilder("Error while pushing ");
                        sb4.append(c1947tG);
                        sb4.append(". Not all arguments were provided. Missing ");
                        AbstractC1888sN.r(sb4, i6, " int arguments (", sb2, ") and ");
                        AbstractC1888sN.u(sb4, i8, " object arguments (", sb3, ").");
                        throw null;
                    }
                    c1443ld.c = true;
                }
            }
        }
        c1443ld.b.s.j0(BG.c);
        int i10 = c1443ld.f;
        C0776bS c0776bS2 = c1575nd.D;
        c1443ld.f = c0776bS2.b[(c0776bS2.g * 5) + 3] + i10;
    }
}
