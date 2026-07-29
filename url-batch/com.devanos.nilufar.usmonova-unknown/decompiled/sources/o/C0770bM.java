package o;

import android.os.Trace;
import java.util.List;
import java.util.Set;

/* renamed from: o.bM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0770bM extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ C0901dM h;
    public final /* synthetic */ QD i;
    public final /* synthetic */ QD j;
    public final /* synthetic */ List k;
    public final /* synthetic */ List l;
    public final /* synthetic */ QD m;
    public final /* synthetic */ List n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ QD f141o;
    public final /* synthetic */ Set p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0770bM(C0901dM c0901dM, QD qd, QD qd2, List list, List list2, QD qd3, List list3, QD qd4, Set set) {
        super(1);
        this.h = c0901dM;
        this.i = qd;
        this.j = qd2;
        this.k = list;
        this.l = list2;
        this.m = qd3;
        this.n = list3;
        this.f141o = qd4;
        this.p = set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r0.h() == true) goto L19;
     */
    @Override // o.InterfaceC2114vp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean f;
        long j;
        int i;
        boolean z;
        long longValue = ((Number) obj).longValue();
        C0901dM c0901dM = this.h;
        synchronized (c0901dM.b) {
            f = c0901dM.f();
        }
        if (f) {
            C0901dM c0901dM2 = this.h;
            Trace.beginSection("Recomposer:animation");
            try {
                c0901dM2.a.a(longValue);
                synchronized (AbstractC2025uS.b) {
                    QD qd = ((C0201Hq) AbstractC2025uS.i.get()).h;
                    z = qd != null;
                }
                if (z) {
                    AbstractC2025uS.a();
                }
            } finally {
            }
        }
        C0901dM c0901dM3 = this.h;
        QD qd2 = this.i;
        QD qd3 = this.j;
        List list = this.k;
        List list2 = this.l;
        QD qd4 = this.m;
        List list3 = this.n;
        QD qd5 = this.f141o;
        Set set = this.p;
        Trace.beginSection("Recomposer:recompose");
        try {
            C0901dM.b(c0901dM3);
            synchronized (c0901dM3.b) {
                try {
                    YD yd = c0901dM3.h;
                    int i2 = yd.j;
                    if (i2 > 0) {
                        Object[] objArr = yd.h;
                        int i3 = 0;
                        do {
                            list.add((C2036ud) objArr[i3]);
                            i3++;
                        } while (i3 < i2);
                    }
                    c0901dM3.h.h();
                } finally {
                }
            }
            qd2.b();
            qd3.b();
            while (true) {
                if (list.isEmpty() && list2.isEmpty()) {
                    break;
                }
                try {
                    try {
                        int size = list.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            C2036ud c2036ud = (C2036ud) list.get(i4);
                            C2036ud a = C0901dM.a(c0901dM3, c2036ud, qd2);
                            if (a != null) {
                                list3.add(a);
                            }
                            qd3.a(c2036ud);
                        }
                        list.clear();
                        if (qd2.h() || c0901dM3.h.l()) {
                            synchronized (c0901dM3.b) {
                                try {
                                    List h = c0901dM3.h();
                                    int size2 = h.size();
                                    for (int i5 = 0; i5 < size2; i5++) {
                                        C2036ud c2036ud2 = (C2036ud) h.get(i5);
                                        if (!qd3.c(c2036ud2) && c2036ud2.p(set)) {
                                            list.add(c2036ud2);
                                        }
                                    }
                                    YD yd2 = c0901dM3.h;
                                    int i6 = yd2.j;
                                    int i7 = 0;
                                    for (int i8 = 0; i8 < i6; i8++) {
                                        C2036ud c2036ud3 = (C2036ud) yd2.h[i8];
                                        if (!qd3.c(c2036ud3) && !list.contains(c2036ud3)) {
                                            list.add(c2036ud3);
                                            i7++;
                                        } else if (i7 > 0) {
                                            Object[] objArr2 = yd2.h;
                                            objArr2[i8 - i7] = objArr2[i8];
                                        }
                                    }
                                    int i9 = i6 - i7;
                                    P6.g0(yd2.h, i9, i6);
                                    yd2.j = i9;
                                } finally {
                                }
                            }
                        }
                        if (list.isEmpty()) {
                            try {
                                C0835cM.d(list2, c0901dM3);
                                while (!list2.isEmpty()) {
                                    List j2 = c0901dM3.j(list2, qd2);
                                    qd4.getClass();
                                    for (Object obj2 : j2) {
                                        qd4.b[qd4.d(obj2)] = obj2;
                                    }
                                    C0835cM.d(list2, c0901dM3);
                                }
                            } catch (Exception e) {
                                c0901dM3.k(e, null);
                                C0835cM.a(c0901dM3, list, list2, list3, qd4, qd5, qd2, qd3);
                            }
                        }
                    } catch (Exception e2) {
                        c0901dM3.k(e2, null);
                        C0835cM.a(c0901dM3, list, list2, list3, qd4, qd5, qd2, qd3);
                        list.clear();
                    }
                } finally {
                    list.clear();
                }
            }
            if (!list3.isEmpty()) {
                try {
                    try {
                        int size3 = list3.size();
                        for (int i10 = 0; i10 < size3; i10++) {
                            qd5.a((C2036ud) list3.get(i10));
                        }
                        int size4 = list3.size();
                        for (int i11 = 0; i11 < size4; i11++) {
                            ((C2036ud) list3.get(i11)).d();
                        }
                        list3.clear();
                    } catch (Exception e3) {
                        c0901dM3.k(e3, null);
                        C0835cM.a(c0901dM3, list, list2, list3, qd4, qd5, qd2, qd3);
                        list3.clear();
                    }
                } finally {
                    list3.clear();
                }
            }
            int i12 = 8;
            if (qd4.h()) {
                try {
                    try {
                        qd5.i(qd4);
                        Object[] objArr3 = qd4.b;
                        long[] jArr = qd4.a;
                        j = 128;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i13 = 0;
                            while (true) {
                                long j3 = jArr[i13];
                                Object[] objArr4 = objArr3;
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                                    for (int i15 = 0; i15 < i14; i15++) {
                                        if ((j3 & 255) < 128) {
                                            ((C2036ud) objArr4[(i13 << 3) + i15]).f();
                                        }
                                        j3 >>= 8;
                                    }
                                    if (i14 != 8) {
                                        break;
                                    }
                                }
                                if (i13 == length) {
                                    break;
                                }
                                i13++;
                                objArr3 = objArr4;
                            }
                        }
                    } catch (Exception e4) {
                        c0901dM3.k(e4, null);
                        C0835cM.a(c0901dM3, list, list2, list3, qd4, qd5, qd2, qd3);
                        qd4.b();
                    }
                } finally {
                    qd4.b();
                }
            } else {
                j = 128;
            }
            if (qd5.h()) {
                try {
                    try {
                        Object[] objArr5 = qd5.b;
                        long[] jArr2 = qd5.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i16 = 0;
                            while (true) {
                                long j4 = jArr2[i16];
                                int i17 = i12;
                                int i18 = length2;
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i19 = 8 - ((~(i16 - i18)) >>> 31);
                                    for (int i20 = 0; i20 < i19; i20++) {
                                        if ((j4 & 255) < j) {
                                            ((C2036ud) objArr5[(i16 << 3) + i20]).g();
                                        }
                                        j4 >>= i17;
                                    }
                                    i = i17;
                                    if (i19 != i) {
                                        break;
                                    }
                                } else {
                                    i = i17;
                                }
                                if (i16 == i18) {
                                    break;
                                }
                                i16++;
                                int i21 = i;
                                length2 = i18;
                                i12 = i21;
                            }
                        }
                    } catch (Exception e5) {
                        c0901dM3.k(e5, null);
                        C0835cM.a(c0901dM3, list, list2, list3, qd4, qd5, qd2, qd3);
                        qd5.b();
                    }
                } finally {
                    qd5.b();
                }
            }
            synchronized (c0901dM3.b) {
                c0901dM3.e();
            }
            AbstractC2025uS.k().m();
            qd3.b();
            qd2.b();
            c0901dM3.n = null;
            return C0782bY.a;
        } finally {
        }
    }
}
