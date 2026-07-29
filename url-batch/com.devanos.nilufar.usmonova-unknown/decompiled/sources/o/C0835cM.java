package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: o.cM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0835cM extends AbstractC2225xU implements InterfaceC2378zp {
    public List h;
    public List i;
    public List j;
    public QD k;
    public QD l;
    public QD m;
    public Set n;

    /* renamed from: o, reason: collision with root package name */
    public QD f147o;
    public int p;
    public /* synthetic */ InterfaceC0957eD q;
    public final /* synthetic */ C0901dM r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0835cM(C0901dM c0901dM, InterfaceC2235xe interfaceC2235xe) {
        super(3, interfaceC2235xe);
        this.r = c0901dM;
    }

    public static final void a(C0901dM c0901dM, List list, List list2, List list3, QD qd, QD qd2, QD qd3, QD qd4) {
        char c;
        long j;
        long j2;
        synchronized (c0901dM.b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    C2036ud c2036ud = (C2036ud) list3.get(i);
                    c2036ud.a();
                    c0901dM.l(c2036ud);
                }
                list3.clear();
                Object[] objArr = qd.b;
                long[] jArr = qd.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    C2036ud c2036ud2 = (C2036ud) objArr[(i2 << 3) + i4];
                                    c2036ud2.a();
                                    c0901dM.l(c2036ud2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                qd.b();
                Object[] objArr2 = qd2.b;
                long[] jArr2 = qd2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((C2036ud) objArr2[(i5 << 3) + i7]).g();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                qd2.b();
                qd3.b();
                Object[] objArr3 = qd4.b;
                long[] jArr3 = qd4.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    C2036ud c2036ud3 = (C2036ud) objArr3[(i8 << 3) + i10];
                                    c2036ud3.a();
                                    c0901dM.l(c2036ud3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                qd4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void d(List list, C0901dM c0901dM) {
        list.clear();
        synchronized (c0901dM.b) {
            try {
                ArrayList arrayList = c0901dM.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((AbstractC1549nD) arrayList.get(i));
                }
                c0901dM.j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC2378zp
    public final Object e(Object obj, Object obj2, Object obj3) {
        C0835cM c0835cM = new C0835cM(this.r, (InterfaceC2235xe) obj3);
        c0835cM.q = (InterfaceC0957eD) obj2;
        c0835cM.invokeSuspend(C0782bY.a);
        return EnumC0448Re.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0123 -> B:6:0x012b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01d2 -> B:24:0x0094). Please report as a decompilation issue!!! */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC0957eD interfaceC0957eD;
        QD qd;
        QD qd2;
        List list;
        Set set;
        List list2;
        QD qd3;
        List list3;
        QD qd4;
        List list4;
        QD qd5;
        List list5;
        QD qd6;
        Object obj2;
        C0849ca c0849ca;
        EnumC0448Re enumC0448Re;
        InterfaceC0957eD interfaceC0957eD2;
        C1318jk c1318jk;
        C0835cM c0835cM = this;
        EnumC0448Re enumC0448Re2 = EnumC0448Re.h;
        int i = c0835cM.p;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            interfaceC0957eD = c0835cM.q;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i4 = WP.a;
            qd = new QD();
            QD qd7 = new QD();
            QD qd8 = new QD();
            YP yp = new YP(qd8);
            qd2 = new QD();
            list = arrayList;
            set = yp;
            list2 = arrayList2;
            qd3 = qd8;
            list3 = arrayList3;
            qd4 = qd7;
            synchronized (c0835cM.r.b) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                QD qd9 = c0835cM.f147o;
                set = c0835cM.n;
                qd3 = c0835cM.m;
                qd4 = c0835cM.l;
                qd = c0835cM.k;
                list3 = c0835cM.j;
                list2 = c0835cM.i;
                list = c0835cM.h;
                InterfaceC0957eD interfaceC0957eD3 = c0835cM.q;
                AbstractC1494mO.l(obj);
                qd2 = qd9;
                interfaceC0957eD = interfaceC0957eD3;
                C0901dM c0901dM = c0835cM.r;
                synchronized (c0901dM.b) {
                    try {
                        if (c0901dM.k.isEmpty()) {
                            enumC0448Re = enumC0448Re2;
                            interfaceC0957eD2 = interfaceC0957eD;
                            c1318jk = C1318jk.h;
                        } else {
                            Collection values = c0901dM.k.values();
                            AbstractC0048Bt.n(values, "<this>");
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it = values.iterator();
                            while (it.hasNext()) {
                                AbstractC1048fc.f0(arrayList4, (Iterable) it.next());
                            }
                            c0901dM.k.clear();
                            ArrayList arrayList5 = new ArrayList(arrayList4.size());
                            int size = arrayList4.size();
                            enumC0448Re = enumC0448Re2;
                            int i5 = 0;
                            while (i5 < size) {
                                int i6 = i5;
                                AbstractC1549nD abstractC1549nD = (AbstractC1549nD) arrayList4.get(i5);
                                arrayList5.add(new C1619oH(abstractC1549nD, c0901dM.l.get(abstractC1549nD)));
                                i5 = i6 + 1;
                                interfaceC0957eD = interfaceC0957eD;
                            }
                            interfaceC0957eD2 = interfaceC0957eD;
                            c0901dM.l.clear();
                            c1318jk = arrayList5;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int size2 = c1318jk.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    C1619oH c1619oH = (C1619oH) c1318jk.get(i7);
                }
                i2 = 2;
                i3 = 1;
                c0835cM = this;
                enumC0448Re2 = enumC0448Re;
                interfaceC0957eD = interfaceC0957eD2;
                synchronized (c0835cM.r.b) {
                }
                C0901dM c0901dM2 = c0835cM.r;
                c0835cM.q = interfaceC0957eD;
                c0835cM.h = list;
                c0835cM.i = list2;
                c0835cM.j = list3;
                c0835cM.k = qd;
                c0835cM.l = qd4;
                c0835cM.m = qd3;
                c0835cM.n = set;
                c0835cM.f147o = qd2;
                c0835cM.p = i3;
                if (c0901dM2.g()) {
                    obj2 = C0782bY.a;
                } else {
                    C0849ca c0849ca2 = new C0849ca(i3, AbstractC1473m3.L(c0835cM));
                    c0849ca2.r();
                    synchronized (c0901dM2.b) {
                        if (c0901dM2.g()) {
                            c0849ca = c0849ca2;
                        } else {
                            c0901dM2.f157o = c0849ca2;
                            c0849ca = null;
                        }
                    }
                    if (c0849ca != null) {
                        c0849ca.resumeWith(C0782bY.a);
                    }
                    obj2 = c0849ca2.q();
                    if (obj2 != EnumC0448Re.h) {
                        obj2 = C0782bY.a;
                    }
                }
                if (obj2 != enumC0448Re2) {
                    List list6 = list;
                    qd5 = qd;
                    qd6 = qd2;
                    list4 = list3;
                    list5 = list6;
                    Set set2 = set;
                    QD qd10 = qd4;
                    QD qd11 = qd3;
                    if (C0901dM.b(c0835cM.r)) {
                        List list7 = list4;
                        qd2 = qd6;
                        qd = qd5;
                        list = list5;
                        list3 = list7;
                        c0835cM = this;
                        qd3 = qd11;
                        qd4 = qd10;
                        set = set2;
                        synchronized (c0835cM.r.b) {
                        }
                    } else {
                        C0770bM c0770bM = new C0770bM(c0835cM.r, qd11, qd6, list5, list2, qd5, list4, qd10, set2);
                        c0835cM.q = interfaceC0957eD;
                        c0835cM.h = list5;
                        c0835cM.i = list2;
                        c0835cM.j = list4;
                        c0835cM.k = qd5;
                        c0835cM.l = qd10;
                        c0835cM.m = qd11;
                        c0835cM.n = set2;
                        c0835cM.f147o = qd6;
                        c0835cM.p = i2;
                        if (interfaceC0957eD.v(c0770bM, c0835cM) != enumC0448Re2) {
                            List list8 = list4;
                            qd2 = qd6;
                            qd = qd5;
                            list = list5;
                            list3 = list8;
                            qd3 = qd11;
                            qd4 = qd10;
                            set = set2;
                            C0901dM c0901dM3 = c0835cM.r;
                            synchronized (c0901dM3.b) {
                            }
                        }
                    }
                }
                return enumC0448Re2;
            }
            QD qd12 = c0835cM.f147o;
            set = c0835cM.n;
            qd3 = c0835cM.m;
            qd4 = c0835cM.l;
            QD qd13 = c0835cM.k;
            List list9 = c0835cM.j;
            list2 = c0835cM.i;
            List list10 = c0835cM.h;
            InterfaceC0957eD interfaceC0957eD4 = c0835cM.q;
            AbstractC1494mO.l(obj);
            qd6 = qd12;
            interfaceC0957eD = interfaceC0957eD4;
            list4 = list9;
            list5 = list10;
            qd5 = qd13;
            Set set22 = set;
            QD qd102 = qd4;
            QD qd112 = qd3;
            if (C0901dM.b(c0835cM.r)) {
            }
        }
    }
}
