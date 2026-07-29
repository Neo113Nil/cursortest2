package o;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.ud, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2036ud implements InterfaceC1773qd {
    public final AbstractC1838rd h;
    public final C0950e6 i;
    public final AtomicReference j = new AtomicReference(null);
    public final Object k = new Object();
    public final PD l;
    public final C0841cS m;
    public final C1818rJ n;

    /* renamed from: o, reason: collision with root package name */
    public final QD f230o;
    public final QD p;
    public final C1818rJ q;
    public final C2231xa r;
    public final C2231xa s;
    public final C1818rJ t;
    public C1818rJ u;
    public boolean v;
    public final C1623oL w;
    public final C1575nd x;
    public boolean y;

    public C2036ud(AbstractC1838rd abstractC1838rd, C0950e6 c0950e6) {
        this.h = abstractC1838rd;
        this.i = c0950e6;
        PD pd = new PD(new QD());
        this.l = pd;
        C0841cS c0841cS = new C0841cS();
        if (((Boolean) C0901dM.w.get()).booleanValue()) {
            c0841cS.q = new C2340zD();
        }
        this.m = c0841cS;
        this.n = new C1818rJ(9);
        this.f230o = new QD();
        this.p = new QD();
        this.q = new C1818rJ(9);
        C2231xa c2231xa = new C2231xa();
        this.r = c2231xa;
        C2231xa c2231xa2 = new C2231xa();
        this.s = c2231xa2;
        this.t = new C1818rJ(9);
        this.u = new C1818rJ(9);
        this.w = new C1623oL(24);
        this.x = new C1575nd(c0950e6, abstractC1838rd, c0841cS, pd, c2231xa, c2231xa2, this);
        C0721ad c0721ad = AbstractC0787bd.a;
    }

    public final void a() {
        this.j.set(null);
        this.r.s.e0();
        this.s.s.e0();
        PD pd = this.l;
        if (pd.h.g()) {
            return;
        }
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        if (pd.h.g()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = pd.iterator();
            while (true) {
                C2247xq c2247xq = (C2247xq) it;
                if (!c2247xq.hasNext()) {
                    return;
                }
                InterfaceC0771bN interfaceC0771bN = (InterfaceC0771bN) c2247xq.next();
                c2247xq.remove();
                interfaceC0771bN.b();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void b(Object obj, boolean z) {
        int i;
        Object e = ((MD) this.n.i).e(obj);
        if (e == null) {
            return;
        }
        boolean z2 = e instanceof QD;
        QD qd = this.f230o;
        QD qd2 = this.p;
        C1818rJ c1818rJ = this.t;
        if (!z2) {
            WL wl = (WL) e;
            if (c1818rJ.e(obj, wl) || wl.c(obj) == 1) {
                return;
            }
            if (wl.g == null || z) {
                qd.a(wl);
                return;
            } else {
                qd2.a(wl);
                return;
            }
        }
        QD qd3 = (QD) e;
        Object[] objArr = qd3.b;
        long[] jArr = qd3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        WL wl2 = (WL) objArr[(i2 << 3) + i5];
                        if (!c1818rJ.e(obj, wl2)) {
                            i = i3;
                            if (wl2.c(obj) != 1) {
                                if (wl2.g == null || z) {
                                    qd.a(wl2);
                                } else {
                                    qd2.a(wl2);
                                }
                            }
                            j >>= i;
                            i5++;
                            i3 = i;
                        }
                    }
                    i = i3;
                    j >>= i;
                    i5++;
                    i3 = i;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void c(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        int i;
        long[] jArr;
        String str;
        long[] jArr2;
        String str2;
        long j4;
        boolean c2;
        String str3;
        long j5;
        long[] jArr3;
        long[] jArr4;
        int i2;
        long j6;
        boolean z2;
        int i3;
        long j7;
        long[] jArr5;
        long[] jArr6;
        char c3;
        long j8;
        int i4;
        int i5;
        long[] jArr7;
        boolean z3 = set instanceof YP;
        C1818rJ c1818rJ = this.q;
        Object obj = null;
        int i6 = 8;
        if (z3) {
            QD qd = ((YP) set).h;
            Object[] objArr = qd.b;
            long[] jArr8 = qd.a;
            int length = jArr8.length - 2;
            if (length >= 0) {
                int i7 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr8[i7];
                    char c4 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i7 << 3) + i9];
                                c3 = c4;
                                if (obj2 instanceof WL) {
                                    ((WL) obj2).c(obj);
                                } else {
                                    b(obj2, z);
                                    Object e = ((MD) c1818rJ.i).e(obj2);
                                    if (e != null) {
                                        if (e instanceof QD) {
                                            QD qd2 = (QD) e;
                                            Object[] objArr2 = qd2.b;
                                            long[] jArr9 = qd2.a;
                                            int length2 = jArr9.length - 2;
                                            if (length2 >= 0) {
                                                int i10 = i6;
                                                i4 = length;
                                                int i11 = 0;
                                                while (true) {
                                                    long j10 = jArr9[i11];
                                                    j8 = j9;
                                                    long[] jArr10 = jArr9;
                                                    if ((((~j10) << c3) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                                        int i13 = 0;
                                                        while (i13 < i12) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr7 = jArr8;
                                                                b((C1645oh) objArr2[(i11 << 3) + i13], z);
                                                            } else {
                                                                jArr7 = jArr8;
                                                            }
                                                            j10 >>= i10;
                                                            i13++;
                                                            jArr8 = jArr7;
                                                        }
                                                        jArr6 = jArr8;
                                                        if (i12 != i10) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr6 = jArr8;
                                                    }
                                                    if (i11 == length2) {
                                                        break;
                                                    }
                                                    i11++;
                                                    jArr9 = jArr10;
                                                    j9 = j8;
                                                    jArr8 = jArr6;
                                                    i10 = 8;
                                                }
                                            }
                                        } else {
                                            jArr6 = jArr8;
                                            j8 = j9;
                                            i4 = length;
                                            b((C1645oh) e, z);
                                        }
                                        i5 = 8;
                                    }
                                }
                                jArr6 = jArr8;
                                j8 = j9;
                                i4 = length;
                                i5 = 8;
                            } else {
                                jArr6 = jArr8;
                                c3 = c4;
                                j8 = j9;
                                i4 = length;
                                i5 = i6;
                            }
                            j9 = j8 >> i5;
                            i9++;
                            length = i4;
                            i6 = i5;
                            c4 = c3;
                            jArr8 = jArr6;
                            obj = null;
                        }
                        jArr5 = jArr8;
                        c = c4;
                        int i14 = length;
                        if (i8 != i6) {
                            break;
                        } else {
                            length = i14;
                        }
                    } else {
                        jArr5 = jArr8;
                        c = 7;
                    }
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                    jArr8 = jArr5;
                    obj = null;
                    i6 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof WL) {
                    ((WL) obj3).c(null);
                } else {
                    b(obj3, z);
                    Object e2 = ((MD) c1818rJ.i).e(obj3);
                    if (e2 != null) {
                        if (e2 instanceof QD) {
                            QD qd3 = (QD) e2;
                            Object[] objArr3 = qd3.b;
                            long[] jArr11 = qd3.a;
                            int length3 = jArr11.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j11 = jArr11[i];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i15 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            if ((j11 & 255) < 128) {
                                                b((C1645oh) objArr3[(i << 3) + i16], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i15 != 8) {
                                            break;
                                        }
                                    }
                                    i = i != length3 ? i + 1 : 0;
                                }
                            }
                        } else {
                            b((C1645oh) e2, z);
                        }
                    }
                }
            }
        }
        String str4 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        C1818rJ c1818rJ2 = this.n;
        QD qd4 = this.f230o;
        if (z) {
            QD qd5 = this.p;
            if (qd5.h()) {
                MD md = (MD) c1818rJ2.i;
                long[] jArr12 = md.a;
                int length4 = jArr12.length - 2;
                if (length4 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j12 = jArr12[i17];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i18 = 8 - ((~(i17 - length4)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j12 & j2) < j) {
                                    int i20 = (i17 << 3) + i19;
                                    Object obj4 = md.b[i20];
                                    Object obj5 = md.c[i20];
                                    if (obj5 instanceof QD) {
                                        AbstractC0048Bt.l(obj5, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                        QD qd6 = (QD) obj5;
                                        Object[] objArr4 = qd6.b;
                                        long[] jArr13 = qd6.a;
                                        int length5 = jArr13.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i21 = 0;
                                            while (true) {
                                                long j13 = jArr13[i21];
                                                jArr4 = jArr12;
                                                i2 = length4;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i22 = 8 - ((~(i21 - length5)) >>> 31);
                                                    for (int i23 = 0; i23 < i22; i23 = i3 + 1) {
                                                        if ((j13 & j2) < j) {
                                                            i3 = i23;
                                                            int i24 = (i21 << 3) + i3;
                                                            j7 = j13;
                                                            WL wl = (WL) objArr4[i24];
                                                            if (qd5.c(wl) || qd4.c(wl)) {
                                                                qd6.k(i24);
                                                            }
                                                        } else {
                                                            i3 = i23;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                    }
                                                    if (i22 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i21 == length5) {
                                                    break;
                                                }
                                                i21++;
                                                length4 = i2;
                                                jArr12 = jArr4;
                                            }
                                        } else {
                                            jArr4 = jArr12;
                                            i2 = length4;
                                            j6 = j12;
                                        }
                                        z2 = qd6.g();
                                    } else {
                                        jArr4 = jArr12;
                                        i2 = length4;
                                        j6 = j12;
                                        AbstractC0048Bt.l(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                        WL wl2 = (WL) obj5;
                                        z2 = qd5.c(wl2) || qd4.c(wl2);
                                    }
                                    if (z2) {
                                        md.h(i20);
                                    }
                                } else {
                                    jArr4 = jArr12;
                                    i2 = length4;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i19++;
                                length4 = i2;
                                jArr12 = jArr4;
                            }
                            jArr3 = jArr12;
                            int i25 = length4;
                            if (i18 != 8) {
                                break;
                            } else {
                                length4 = i25;
                            }
                        } else {
                            jArr3 = jArr12;
                        }
                        if (i17 == length4) {
                            break;
                        }
                        i17++;
                        jArr12 = jArr3;
                    }
                }
                qd5.b();
                h();
                return;
            }
        }
        if (qd4.h()) {
            MD md2 = (MD) c1818rJ2.i;
            long[] jArr14 = md2.a;
            int length6 = jArr14.length - 2;
            if (length6 >= 0) {
                int i26 = 0;
                while (true) {
                    long j14 = jArr14[i26];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i27 = 8 - ((~(i26 - length6)) >>> 31);
                        int i28 = 0;
                        while (i28 < i27) {
                            if ((j14 & j2) < j) {
                                int i29 = (i26 << 3) + i28;
                                Object obj6 = md2.b[i29];
                                Object obj7 = md2.c[i29];
                                if (obj7 instanceof QD) {
                                    AbstractC0048Bt.l(obj7, str4);
                                    QD qd7 = (QD) obj7;
                                    Object[] objArr5 = qd7.b;
                                    long[] jArr15 = qd7.a;
                                    int length7 = jArr15.length - 2;
                                    jArr2 = jArr14;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i30 = 0;
                                        while (true) {
                                            long j15 = jArr15[i30];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr16 = jArr15;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i31 = 8 - ((~(i30 - length7)) >>> 31);
                                                int i32 = 0;
                                                while (i32 < i31) {
                                                    if ((j15 & j2) < j) {
                                                        str3 = str4;
                                                        int i33 = (i30 << 3) + i32;
                                                        j5 = j15;
                                                        if (qd4.c((WL) objArr6[i33])) {
                                                            qd7.k(i33);
                                                        }
                                                    } else {
                                                        str3 = str4;
                                                        j5 = j15;
                                                    }
                                                    i32++;
                                                    str4 = str3;
                                                    j15 = j5 >> 8;
                                                }
                                                str2 = str4;
                                                if (i31 != 8) {
                                                    break;
                                                }
                                            } else {
                                                str2 = str4;
                                            }
                                            if (i30 == length7) {
                                                break;
                                            }
                                            i30++;
                                            objArr5 = objArr6;
                                            jArr15 = jArr16;
                                            str4 = str2;
                                        }
                                    } else {
                                        str2 = str4;
                                        j4 = j14;
                                    }
                                    c2 = qd7.g();
                                } else {
                                    jArr2 = jArr14;
                                    str2 = str4;
                                    j4 = j14;
                                    AbstractC0048Bt.l(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                    c2 = qd4.c((WL) obj7);
                                }
                                if (c2) {
                                    md2.h(i29);
                                }
                            } else {
                                jArr2 = jArr14;
                                str2 = str4;
                                j4 = j14;
                            }
                            i28++;
                            j14 = j4 >> 8;
                            jArr14 = jArr2;
                            str4 = str2;
                        }
                        jArr = jArr14;
                        str = str4;
                        if (i27 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr14;
                        str = str4;
                    }
                    if (i26 == length6) {
                        break;
                    }
                    i26++;
                    jArr14 = jArr;
                    str4 = str;
                }
            }
            h();
            qd4.b();
        }
    }

    public final void d() {
        synchronized (this.k) {
            try {
                e(this.r);
                k();
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.l.h.g()) {
                            PD pd = this.l;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!pd.h.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = pd.iterator();
                                    while (true) {
                                        C2247xq c2247xq = (C2247xq) it;
                                        if (!c2247xq.hasNext()) {
                                            break;
                                        }
                                        InterfaceC0771bN interfaceC0771bN = (InterfaceC0771bN) c2247xq.next();
                                        c2247xq.remove();
                                        interfaceC0771bN.b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e) {
                        a();
                        throw e;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(C2231xa c2231xa) {
        C1970td c1970td;
        long[] jArr;
        int i;
        C1970td c1970td2;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i2;
        boolean z;
        C0950e6 c0950e6 = this.i;
        C2231xa c2231xa2 = this.s;
        C1970td c1970td3 = new C1970td(this.l);
        try {
            if (c2231xa.s.g0()) {
                if (c2231xa2.s.g0()) {
                    c1970td3.d();
                    return;
                }
                return;
            }
            try {
                Trace.beginSection("Compose:applyChanges");
                try {
                    C0972eS l = this.m.l();
                    int i3 = 0;
                    try {
                        c2231xa.s.f0(c0950e6, l, c1970td3);
                        l.e(true);
                        c0950e6.H();
                        Trace.endSection();
                        c1970td3.e();
                        ArrayList arrayList = (ArrayList) c1970td3.e;
                        if (!arrayList.isEmpty()) {
                            Trace.beginSection("Compose:sideeffects");
                            try {
                                int size = arrayList.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    ((InterfaceC1455lp) arrayList.get(i4)).invoke();
                                }
                                arrayList.clear();
                                Trace.endSection();
                            } catch (Throwable th) {
                                Trace.endSection();
                                throw th;
                            }
                        }
                        if (this.v) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.v = false;
                                MD md = (MD) this.n.i;
                                long[] jArr3 = md.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i5 = 0;
                                    while (true) {
                                        long j3 = jArr3[i5];
                                        char c2 = 7;
                                        long j4 = -9187201950435737472L;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i6 = 8;
                                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                                            int i8 = i3;
                                            while (i8 < i7) {
                                                if ((j3 & 255) < 128) {
                                                    c = c2;
                                                    int i9 = (i5 << 3) + i8;
                                                    j2 = j4;
                                                    Object obj = md.b[i9];
                                                    Object obj2 = md.c[i9];
                                                    if (obj2 instanceof QD) {
                                                        AbstractC0048Bt.l(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                                        QD qd = (QD) obj2;
                                                        Object[] objArr = qd.b;
                                                        long[] jArr4 = qd.a;
                                                        int i10 = i6;
                                                        int length2 = jArr4.length - 2;
                                                        i = i8;
                                                        c1970td2 = c1970td3;
                                                        jArr2 = jArr3;
                                                        if (length2 >= 0) {
                                                            int i11 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j5 = jArr4[i11];
                                                                    j = j3;
                                                                    if ((((~j5) << c) & j5 & j2) != j2) {
                                                                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                                                        for (int i13 = 0; i13 < i12; i13++) {
                                                                            if ((j5 & 255) < 128) {
                                                                                int i14 = (i11 << 3) + i13;
                                                                                if (!((WL) objArr[i14]).b()) {
                                                                                    qd.k(i14);
                                                                                }
                                                                            }
                                                                            j5 >>= i10;
                                                                        }
                                                                        if (i12 != i10) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i11 == length2) {
                                                                        break;
                                                                    }
                                                                    i11++;
                                                                    i10 = 8;
                                                                    j3 = j;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j3;
                                                        }
                                                        z = qd.g();
                                                    } else {
                                                        i = i8;
                                                        c1970td2 = c1970td3;
                                                        jArr2 = jArr3;
                                                        j = j3;
                                                        AbstractC0048Bt.l(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                                        z = !((WL) obj2).b();
                                                    }
                                                    if (z) {
                                                        md.h(i9);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i8;
                                                    c1970td2 = c1970td3;
                                                    jArr2 = jArr3;
                                                    j = j3;
                                                    c = c2;
                                                    j2 = j4;
                                                    i2 = i6;
                                                }
                                                j3 = j >> i2;
                                                i8 = i + 1;
                                                i6 = i2;
                                                c2 = c;
                                                j4 = j2;
                                                c1970td3 = c1970td2;
                                                jArr3 = jArr2;
                                            }
                                            c1970td = c1970td3;
                                            jArr = jArr3;
                                            if (i7 != i6) {
                                                break;
                                            }
                                        } else {
                                            c1970td = c1970td3;
                                            jArr = jArr3;
                                        }
                                        if (i5 == length) {
                                            break;
                                        }
                                        i5++;
                                        c1970td3 = c1970td;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    c1970td = c1970td3;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            c1970td = c1970td3;
                        }
                        if (c2231xa2.s.g0()) {
                            c1970td.d();
                        }
                    } catch (Throwable th4) {
                        try {
                            l.e(false);
                            throw th4;
                        } catch (Throwable th5) {
                            th = th5;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                if (c2231xa2.s.g0()) {
                    c1970td3.d();
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            if (c2231xa2.s.g0()) {
            }
            throw th;
        }
    }

    public final void f() {
        synchronized (this.k) {
            try {
                if (this.s.s.h0()) {
                    e(this.s);
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.l.h.g()) {
                            PD pd = this.l;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!pd.h.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = pd.iterator();
                                    while (true) {
                                        C2247xq c2247xq = (C2247xq) it;
                                        if (!c2247xq.hasNext()) {
                                            break;
                                        }
                                        InterfaceC0771bN interfaceC0771bN = (InterfaceC0771bN) c2247xq.next();
                                        c2247xq.remove();
                                        interfaceC0771bN.b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e) {
                        a();
                        throw e;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.k) {
            try {
                this.x.u = null;
                if (!this.l.h.g()) {
                    PD pd = this.l;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!pd.h.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = pd.iterator();
                            while (true) {
                                C2247xq c2247xq = (C2247xq) it;
                                if (!c2247xq.hasNext()) {
                                    break;
                                }
                                InterfaceC0771bN interfaceC0771bN = (InterfaceC0771bN) c2247xq.next();
                                c2247xq.remove();
                                interfaceC0771bN.b();
                            }
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.l.h.g()) {
                            PD pd2 = this.l;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!pd2.h.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it2 = pd2.iterator();
                                    while (true) {
                                        C2247xq c2247xq2 = (C2247xq) it2;
                                        if (!c2247xq2.hasNext()) {
                                            break;
                                        }
                                        InterfaceC0771bN interfaceC0771bN2 = (InterfaceC0771bN) c2247xq2.next();
                                        c2247xq2.remove();
                                        interfaceC0771bN2.b();
                                    }
                                    Trace.endSection();
                                } finally {
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e) {
                        a();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void h() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        char c2;
        long j5;
        long j6;
        int i2;
        boolean z;
        int i3;
        long j7;
        MD md = (MD) this.q.i;
        long[] jArr3 = md.a;
        int length = jArr3.length - 2;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            long j9 = 128;
            while (true) {
                long j10 = jArr3[i5];
                j2 = 255;
                if ((((~j10) << c3) & j10 & j8) != j8) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j10 & 255) < j9) {
                            c2 = c3;
                            int i8 = (i5 << 3) + i7;
                            j5 = j8;
                            Object obj = md.b[i8];
                            Object obj2 = md.c[i8];
                            boolean z2 = obj2 instanceof QD;
                            C1818rJ c1818rJ = this.n;
                            if (z2) {
                                AbstractC0048Bt.l(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                QD qd = (QD) obj2;
                                Object[] objArr = qd.b;
                                long[] jArr4 = qd.a;
                                j6 = j9;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j4 = j10;
                                    int i9 = i4;
                                    int i10 = 0;
                                    while (true) {
                                        long j11 = jArr4[i10];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j11) << c2) & j11 & j5) != j5) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                if ((j11 & 255) < j6) {
                                                    i3 = i12;
                                                    int i13 = (i10 << 3) + i3;
                                                    j7 = j11;
                                                    if (!((MD) c1818rJ.i).b((C1645oh) objArr[i13])) {
                                                        qd.k(i13);
                                                    }
                                                } else {
                                                    i3 = i12;
                                                    j7 = j11;
                                                }
                                                j11 = j7 >> i9;
                                                i12 = i3 + 1;
                                            }
                                            if (i11 != i9) {
                                                break;
                                            }
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    j4 = j10;
                                }
                                z = qd.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                j4 = j10;
                                j6 = j9;
                                AbstractC0048Bt.l(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                z = !((MD) c1818rJ.i).b((C1645oh) obj2);
                            }
                            if (z) {
                                md.h(i8);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            j4 = j10;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i2 = i4;
                        }
                        j10 = j4 >> i2;
                        i7++;
                        i4 = i2;
                        c3 = c2;
                        j8 = j5;
                        j9 = j6;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i14 = length;
                    c = c3;
                    j = j8;
                    j3 = j9;
                    if (i6 != i4) {
                        break;
                    } else {
                        length = i14;
                    }
                } else {
                    jArr = jArr3;
                    c = c3;
                    j = j8;
                    j3 = j9;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                c3 = c;
                j8 = j;
                j9 = j3;
                jArr3 = jArr;
                i4 = 8;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        QD qd2 = this.p;
        if (!qd2.h()) {
            return;
        }
        Object[] objArr2 = qd2.b;
        long[] jArr5 = qd2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j12 = jArr5[i15];
            if ((((~j12) << c) & j12 & j) != j) {
                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((j12 & j2) < j3) {
                        int i18 = (i15 << 3) + i17;
                        if (!(((WL) objArr2[i18]).g != null)) {
                            qd2.k(i18);
                        }
                    }
                    j12 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length3) {
                return;
            } else {
                i15++;
            }
        }
    }

    public final void i(C0721ad c0721ad) {
        try {
            synchronized (this.k) {
                j();
                C1818rJ c1818rJ = this.u;
                this.u = new C1818rJ(9);
                try {
                    this.w.getClass();
                    C1575nd c1575nd = this.x;
                    if (!c1575nd.e.s.g0()) {
                        EB.h("Expected applyChanges() to have been called");
                        throw null;
                    }
                    c1575nd.l(c1818rJ, c0721ad);
                } catch (Exception e) {
                    this.u = c1818rJ;
                    throw e;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.l.h.g()) {
                    PD pd = this.l;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!pd.h.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = pd.iterator();
                            while (true) {
                                C2247xq c2247xq = (C2247xq) it;
                                if (!c2247xq.hasNext()) {
                                    break;
                                }
                                InterfaceC0771bN interfaceC0771bN = (InterfaceC0771bN) c2247xq.next();
                                c2247xq.remove();
                                interfaceC0771bN.b();
                            }
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                }
                throw th;
            } catch (Exception e2) {
                a();
                throw e2;
            }
        }
    }

    public final void j() {
        Object obj = AbstractC1305jX.h;
        AtomicReference atomicReference = this.j;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                EB.i("pending composition has not been applied");
                throw null;
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                EB.i("corrupt pendingModifications drain: " + atomicReference);
                throw null;
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void k() {
        AtomicReference atomicReference = this.j;
        Object andSet = atomicReference.getAndSet(null);
        if (AbstractC0048Bt.h(andSet, AbstractC1305jX.h)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            EB.i("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw null;
        }
        EB.i("corrupt pendingModifications drain: " + atomicReference);
        throw null;
    }

    public final void l(ArrayList arrayList) {
        PD pd = this.l;
        if (arrayList.size() > 0) {
            ((AbstractC1549nD) ((C1619oH) arrayList.get(0)).h).getClass();
            throw null;
        }
        EB.T(true);
        try {
            C1575nd c1575nd = this.x;
            c1575nd.getClass();
            try {
                c1575nd.u(arrayList);
                c1575nd.f();
            } catch (Throwable th) {
                c1575nd.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!pd.h.g()) {
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!pd.h.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = pd.iterator();
                            while (true) {
                                C2247xq c2247xq = (C2247xq) it;
                                if (!c2247xq.hasNext()) {
                                    break;
                                }
                                InterfaceC0771bN interfaceC0771bN = (InterfaceC0771bN) c2247xq.next();
                                c2247xq.remove();
                                interfaceC0771bN.b();
                            }
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                }
                throw th2;
            } catch (Exception e) {
                a();
                throw e;
            }
        }
    }

    public final int m(WL wl, Object obj) {
        InterfaceC0718aa interfaceC0718aa;
        int A;
        int i = wl.a;
        if ((i & 2) != 0) {
            wl.a = i | 4;
        }
        C1471m2 c1471m2 = wl.c;
        if (c1471m2 != null && c1471m2.a()) {
            C0841cS c0841cS = this.m;
            c0841cS.getClass();
            if (!(c1471m2.a() && (A = TM.A(c0841cS.f148o, c1471m2.a, c0841cS.i)) >= 0 && AbstractC0048Bt.h(c0841cS.f148o.get(A), c1471m2))) {
                synchronized (this.k) {
                }
                return 1;
            }
            if (wl.d != null) {
                synchronized (this.k) {
                    try {
                        C1575nd c1575nd = this.x;
                        if (c1575nd.C && c1575nd.L(wl, obj)) {
                            return 4;
                        }
                        this.w.getClass();
                        if (obj == null) {
                            ((MD) this.u.i).i(wl, C1623oL.k);
                        } else if (obj instanceof C1645oh) {
                            Object e = ((MD) this.u.i).e(wl);
                            if (e != null) {
                                if (e instanceof QD) {
                                    QD qd = (QD) e;
                                    Object[] objArr = qd.b;
                                    long[] jArr = qd.a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i2 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i2];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                                for (int i4 = 0; i4 < i3; i4++) {
                                                    if ((255 & j) < 128 && objArr[(i2 << 3) + i4] == C1623oL.k) {
                                                        break loop0;
                                                    }
                                                    j >>= 8;
                                                }
                                                if (i3 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i2 == length) {
                                                break;
                                            }
                                            i2++;
                                        }
                                    }
                                } else if (e == C1623oL.k) {
                                }
                            }
                            this.u.b(wl, obj);
                        } else {
                            ((MD) this.u.i).i(wl, C1623oL.k);
                        }
                        C0901dM c0901dM = (C0901dM) this.h;
                        synchronized (c0901dM.b) {
                            if (c0901dM.h.i(this)) {
                                interfaceC0718aa = null;
                            } else {
                                c0901dM.h.b(this);
                                interfaceC0718aa = c0901dM.e();
                            }
                        }
                        if (interfaceC0718aa != null) {
                            ((C0849ca) interfaceC0718aa).resumeWith(C0782bY.a);
                        }
                        return this.x.C ? 3 : 2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return 1;
    }

    public final void n() {
        C2036ud c2036ud;
        synchronized (this.k) {
            try {
                for (Object obj : this.m.j) {
                    WL wl = obj instanceof WL ? (WL) obj : null;
                    if (wl != null && (c2036ud = wl.b) != null) {
                        c2036ud.m(wl, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(Object obj) {
        Object e = ((MD) this.n.i).e(obj);
        if (e == null) {
            return;
        }
        boolean z = e instanceof QD;
        C1818rJ c1818rJ = this.t;
        if (!z) {
            WL wl = (WL) e;
            if (wl.c(obj) == 4) {
                c1818rJ.b(obj, wl);
                return;
            }
            return;
        }
        QD qd = (QD) e;
        Object[] objArr = qd.b;
        long[] jArr = qd.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        WL wl2 = (WL) objArr[(i << 3) + i3];
                        if (wl2.c(obj) == 4) {
                            c1818rJ.b(obj, wl2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(Set set) {
        boolean z = set instanceof YP;
        C1818rJ c1818rJ = this.q;
        C1818rJ c1818rJ2 = this.n;
        if (z) {
            QD qd = ((YP) set).h;
            Object[] objArr = qd.b;
            long[] jArr = qd.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (((MD) c1818rJ2.i).b(obj) || ((MD) c1818rJ.i).b(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (((MD) c1818rJ2.i).b(obj2) || ((MD) c1818rJ.i).b(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean q() {
        boolean x;
        synchronized (this.k) {
            try {
                j();
                try {
                    C1818rJ c1818rJ = this.u;
                    this.u = new C1818rJ(9);
                    try {
                        this.w.getClass();
                        x = this.x.x(c1818rJ);
                        if (!x) {
                            k();
                        }
                    } catch (Exception e) {
                        this.u = c1818rJ;
                        throw e;
                    }
                } catch (Throwable th) {
                    try {
                        if (!this.l.h.g()) {
                            PD pd = this.l;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!pd.h.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = pd.iterator();
                                    while (true) {
                                        C2247xq c2247xq = (C2247xq) it;
                                        if (!c2247xq.hasNext()) {
                                            break;
                                        }
                                        InterfaceC0771bN interfaceC0771bN = (InterfaceC0771bN) c2247xq.next();
                                        c2247xq.remove();
                                        interfaceC0771bN.b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e2) {
                        a();
                        throw e2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object[]] */
    public final void r(YP yp) {
        Object obj;
        boolean z;
        YP yp2;
        do {
            obj = this.j.get();
            z = true;
            if (obj == null ? true : obj.equals(AbstractC1305jX.h)) {
                yp2 = yp;
            } else if (obj instanceof Set) {
                yp2 = new Set[]{obj, yp};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.j).toString());
                }
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                Set[] setArr = (Set[]) obj;
                AbstractC0048Bt.n(setArr, "<this>");
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = yp;
                yp2 = copyOf;
            }
            AtomicReference atomicReference = this.j;
            while (true) {
                if (atomicReference.compareAndSet(obj, yp2)) {
                    break;
                } else if (atomicReference.get() != obj) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (obj == null) {
            synchronized (this.k) {
                k();
            }
        }
    }

    public final void s(Object obj) {
        WL s;
        int i;
        int i2;
        C1575nd c1575nd = this.x;
        if (c1575nd.x <= 0 && (s = c1575nd.s()) != null) {
            int i3 = s.a | 1;
            s.a = i3;
            if ((i3 & 32) == 0) {
                GD gd = s.f;
                if (gd == null) {
                    gd = new GD();
                    s.f = gd;
                }
                int i4 = s.e;
                int b = gd.b(obj);
                if (b < 0) {
                    b = ~b;
                    i2 = -1;
                } else {
                    i2 = gd.c[b];
                }
                gd.b[b] = obj;
                gd.c[b] = i4;
                if (i2 == s.e) {
                    return;
                }
            }
            if (obj instanceof GT) {
                ((GT) obj).f(1);
            }
            this.n.b(obj, s);
            if (obj instanceof C1645oh) {
                C1645oh c1645oh = (C1645oh) obj;
                C1513mh h = c1645oh.h();
                C1818rJ c1818rJ = this.q;
                c1818rJ.f(obj);
                GD gd2 = h.e;
                Object[] objArr = gd2.b;
                long[] jArr = gd2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8;
                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                            int i8 = 0;
                            while (i8 < i7) {
                                if ((j & 255) < 128) {
                                    i = i6;
                                    GT gt = (GT) objArr[(i5 << 3) + i8];
                                    if (gt instanceof GT) {
                                        gt.f(1);
                                    }
                                    c1818rJ.b(gt, obj);
                                } else {
                                    i = i6;
                                }
                                j >>= i;
                                i8++;
                                i6 = i;
                            }
                            if (i7 != i6) {
                                break;
                            }
                        }
                        if (i5 == length) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                Object obj2 = h.f;
                MD md = s.g;
                if (md == null) {
                    md = new MD();
                    s.g = md;
                }
                md.i(c1645oh, obj2);
            }
        }
    }

    public final void t(Object obj) {
        synchronized (this.k) {
            try {
                o(obj);
                Object e = ((MD) this.q.i).e(obj);
                if (e != null) {
                    if (e instanceof QD) {
                        QD qd = (QD) e;
                        Object[] objArr = qd.b;
                        long[] jArr = qd.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            o((C1645oh) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                }
                                if (i == length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else {
                        o((C1645oh) e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
