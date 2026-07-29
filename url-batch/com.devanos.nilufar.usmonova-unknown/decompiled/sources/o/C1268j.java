package o;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1268j extends AbstractC1596ny implements InterfaceC2312yp {
    public static final C1268j A;
    public static final C1268j B;
    public static final C1268j C;
    public static final C1268j D;
    public static final C1268j E;
    public static final C1268j F;
    public static final C1268j G;
    public static final C1268j H;
    public static final C1268j I;
    public static final C1268j J;
    public static final C1268j K;
    public static final C1268j L;
    public static final C1268j i;
    public static final C1268j j;
    public static final C1268j k;
    public static final C1268j l;
    public static final C1268j m;
    public static final C1268j n;

    /* renamed from: o, reason: collision with root package name */
    public static final C1268j f180o;
    public static final C1268j p;
    public static final C1268j q;
    public static final C1268j r;
    public static final C1268j s;
    public static final C1268j t;
    public static final C1268j u;
    public static final C1268j v;
    public static final C1268j w;
    public static final C1268j x;
    public static final C1268j y;
    public static final C1268j z;
    public final /* synthetic */ int h;

    static {
        int i2 = 2;
        i = new C1268j(i2, 0);
        j = new C1268j(i2, 1);
        k = new C1268j(i2, 2);
        l = new C1268j(i2, 3);
        m = new C1268j(i2, 4);
        n = new C1268j(i2, 5);
        f180o = new C1268j(i2, 6);
        p = new C1268j(i2, 7);
        q = new C1268j(i2, 8);
        r = new C1268j(i2, 9);
        s = new C1268j(i2, 10);
        t = new C1268j(i2, 11);
        u = new C1268j(i2, 12);
        v = new C1268j(i2, 13);
        w = new C1268j(i2, 14);
        x = new C1268j(i2, 15);
        y = new C1268j(i2, 16);
        z = new C1268j(i2, 17);
        A = new C1268j(i2, 18);
        B = new C1268j(i2, 19);
        C = new C1268j(i2, 20);
        D = new C1268j(i2, 21);
        E = new C1268j(i2, 22);
        F = new C1268j(i2, 23);
        G = new C1268j(i2, 24);
        H = new C1268j(i2, 25);
        I = new C1268j(i2, 26);
        J = new C1268j(i2, 27);
        K = new C1268j(i2, 28);
        L = new C1268j(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1268j(int i2, int i3) {
        super(i2);
        this.h = i3;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.h;
        int i3 = 0;
        C0782bY c0782bY = C0782bY.a;
        switch (i2) {
            case 0:
                C1204i c1204i = (C1204i) obj;
                YB yb = (YB) obj2;
                AbstractC0048Bt.n(c1204i, "$this$loadConstantFromProperty");
                AbstractC0048Bt.n(yb, "it");
                return c1204i.c.get(yb);
            case 1:
                C1204i c1204i2 = (C1204i) obj;
                YB yb2 = (YB) obj2;
                AbstractC0048Bt.n(c1204i2, "$this$loadConstantFromProperty");
                AbstractC0048Bt.n(yb2, "it");
                return c1204i2.b.get(yb2);
            case 2:
                String str = (String) obj;
                SC sc = (SC) obj2;
                if (str.length() == 0) {
                    return sc.toString();
                }
                return str + ", " + sc;
            case 3:
                InterfaceC1377kd interfaceC1377kd = (InterfaceC1377kd) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C1575nd c1575nd = (C1575nd) interfaceC1377kd;
                    if (c1575nd.t()) {
                        c1575nd.F();
                    }
                }
                return c0782bY;
            case 4:
                InterfaceC1377kd interfaceC1377kd2 = (InterfaceC1377kd) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C1575nd c1575nd2 = (C1575nd) interfaceC1377kd2;
                    if (c1575nd2.t()) {
                        c1575nd2.F();
                    }
                }
                return c0782bY;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC1377kd interfaceC1377kd3 = (InterfaceC1377kd) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C1575nd c1575nd3 = (C1575nd) interfaceC1377kd3;
                    if (c1575nd3.t()) {
                        c1575nd3.F();
                    }
                }
                return c0782bY;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Number) obj2).intValue();
                ((InterfaceC1181hd) obj).getClass();
                return c0782bY;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                LB lb = (LB) obj2;
                C0027Ay c0027Ay = (C0027Ay) ((InterfaceC1181hd) obj);
                if (!AbstractC0048Bt.h(c0027Ay.p, lb)) {
                    c0027Ay.p = lb;
                    c0027Ay.s();
                }
                return c0782bY;
            case 8:
                ((C0027Ay) ((InterfaceC1181hd) obj)).K((UC) obj2);
                return c0782bY;
            case 9:
                C0027Ay c0027Ay2 = (C0027Ay) ((InterfaceC1181hd) obj);
                c0027Ay2.getClass();
                IT it = AbstractC2300yd.f;
                IH ih = (IH) ((InterfaceC2168wd) obj2);
                ih.getClass();
                c0027Ay2.I((InterfaceC1119gh) AbstractC1807r8.R(ih, it));
                EnumC2057uy enumC2057uy = (EnumC2057uy) AbstractC1807r8.R(ih, AbstractC2300yd.l);
                if (c0027Ay2.r != enumC2057uy) {
                    c0027Ay2.r = enumC2057uy;
                    c0027Ay2.s();
                    C0027Ay l2 = c0027Ay2.l();
                    if (l2 != null) {
                        l2.q();
                    }
                    c0027Ay2.r();
                    TC tc = (TC) c0027Ay2.u.f;
                    if ((tc.d & 4) != 0) {
                        while (tc != null) {
                            if ((tc.c & 4) != 0) {
                                for (Object obj3 = tc; obj3 != null; obj3 = null) {
                                    if (obj3 instanceof InterfaceC1055fj) {
                                    }
                                }
                            }
                            if ((tc.d & 4) != 0) {
                                tc = tc.f;
                            }
                        }
                    }
                }
                FZ fz = (FZ) AbstractC1807r8.R(ih, AbstractC2300yd.q);
                if (!AbstractC0048Bt.h(c0027Ay2.s, fz)) {
                    c0027Ay2.s = fz;
                    TC tc2 = (TC) c0027Ay2.u.f;
                    if ((tc2.d & 16) != 0) {
                        while (tc2 != null) {
                            if ((tc2.c & 16) != 0) {
                                for (TC tc3 = tc2; tc3 != null; tc3 = null) {
                                    if (tc3 instanceof X7) {
                                        AbstractC0048Bt.l(((X7) tc3).n, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
                                        throw new ClassCastException();
                                    }
                                }
                            }
                            if ((tc2.d & 16) != 0) {
                                tc2 = tc2.f;
                            }
                        }
                    }
                }
                TC tc4 = (TC) c0027Ay2.u.f;
                if ((tc4.d & 32768) != 0) {
                    while (tc4 != null) {
                        if ((tc4.c & 32768) != 0) {
                            for (TC tc5 = tc4; tc5 != null; tc5 = null) {
                                if (tc5 instanceof C0405Pn) {
                                    TC tc6 = ((C0405Pn) tc5).b;
                                    if (tc6.m) {
                                        NE.c(tc6);
                                    } else {
                                        tc6.j = true;
                                    }
                                }
                            }
                        }
                        if ((tc4.d & 32768) != 0) {
                            tc4 = tc4.f;
                        }
                    }
                }
                return c0782bY;
            case 10:
                return Boolean.FALSE;
            case 11:
                CH ch = (CH) obj;
                AbstractC0048Bt.n(ch, "path");
                AbstractC0048Bt.n((AbstractC0533Ul) obj2, "<anonymous parameter 1>");
                return new SR(C0218Ih.r(ch.h.o(), true).h.o());
            case 12:
                ((InterfaceC1712pi) obj).G((Matrix) obj2);
                return c0782bY;
            case 13:
                if (obj != null) {
                    throw new ClassCastException();
                }
                Y3 y3 = (Y3) obj2;
                String str2 = y3.h;
                C1818rJ c1818rJ = TP.a;
                List list = y3.i;
                List list2 = C1318jk.h;
                if (list == null) {
                    list = list2;
                }
                C1818rJ c1818rJ2 = TP.a;
                Object a = TP.a(list, c1818rJ2);
                List list3 = y3.j;
                if (list3 != null) {
                    list2 = list3;
                }
                return AbstractC0868ct.f(str2, a, TP.a(list2, c1818rJ2), TP.a(y3.k, c1818rJ2));
            case 14:
                if (obj != null) {
                    throw new ClassCastException();
                }
                List list4 = (List) obj2;
                ArrayList arrayList = new ArrayList(list4.size());
                int size = list4.size();
                while (i3 < size) {
                    arrayList.add(TP.a((X3) list4.get(i3), TP.b));
                    i3++;
                }
                return arrayList;
            case 15:
                if (obj != null) {
                    throw new ClassCastException();
                }
                X3 x3 = (X3) obj2;
                Object obj4 = x3.a;
                EnumC1342k4 enumC1342k4 = obj4 instanceof C1751qH ? EnumC1342k4.h : obj4 instanceof LS ? EnumC1342k4.i : obj4 instanceof C1111gZ ? EnumC1342k4.j : obj4 instanceof BY ? EnumC1342k4.k : obj4 instanceof C0677Zz ? EnumC1342k4.l : obj4 instanceof C0651Yz ? EnumC1342k4.m : EnumC1342k4.n;
                switch (enumC1342k4.ordinal()) {
                    case 0:
                        obj4 = TP.a((C1751qH) obj4, TP.g);
                        break;
                    case 1:
                        obj4 = TP.a((LS) obj4, TP.h);
                        break;
                    case 2:
                        obj4 = TP.a((C1111gZ) obj4, TP.c);
                        break;
                    case 3:
                        obj4 = TP.a((BY) obj4, TP.d);
                        break;
                    case 4:
                        obj4 = TP.a((C0677Zz) obj4, TP.e);
                        break;
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                        obj4 = TP.a((C0651Yz) obj4, TP.f);
                        break;
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                        C1818rJ c1818rJ3 = TP.a;
                        break;
                    default:
                        throw new C0057Cc();
                }
                return AbstractC0868ct.f(enumC1342k4, obj4, Integer.valueOf(x3.b), Integer.valueOf(x3.c), x3.d);
            case 16:
                if (obj == null) {
                    return Float.valueOf(((Z7) obj2).a);
                }
                throw new ClassCastException();
            case 17:
                if (obj != null) {
                    throw new ClassCastException();
                }
                C0651Yz c0651Yz = (C0651Yz) obj2;
                String str3 = c0651Yz.a;
                C1818rJ c1818rJ4 = TP.a;
                return AbstractC0868ct.f(str3, TP.a(c0651Yz.b, TP.i));
            case 18:
                if (obj != null) {
                    throw new ClassCastException();
                }
                long j2 = ((C1114gc) obj2).a;
                return j2 == 16 ? Boolean.FALSE : Integer.valueOf(AbstractC0022At.L(j2));
            case 19:
                if (obj == null) {
                    return Integer.valueOf(((C1586no) obj2).h);
                }
                throw new ClassCastException();
            case 20:
                if (obj != null) {
                    throw new ClassCastException();
                }
                C0677Zz c0677Zz = (C0677Zz) obj2;
                String str4 = c0677Zz.a;
                C1818rJ c1818rJ5 = TP.a;
                return AbstractC0868ct.f(str4, TP.a(c0677Zz.b, TP.i));
            case 21:
                if (obj != null) {
                    throw new ClassCastException();
                }
                List list5 = ((FA) obj2).h;
                ArrayList arrayList2 = new ArrayList(list5.size());
                int size2 = list5.size();
                while (i3 < size2) {
                    arrayList2.add(TP.a((EA) list5.get(i3), TP.t));
                    i3++;
                }
                return arrayList2;
            case 22:
                if (obj == null) {
                    return ((EA) obj2).a.toLanguageTag();
                }
                throw new ClassCastException();
            case 23:
                if (obj != null) {
                    throw new ClassCastException();
                }
                long j3 = ((BF) obj2).a;
                if (BF.a(j3, 9205357640488583168L)) {
                    return Boolean.FALSE;
                }
                Float valueOf = Float.valueOf(BF.b(j3));
                C1818rJ c1818rJ6 = TP.a;
                return AbstractC0868ct.f(valueOf, Float.valueOf(BF.c(j3)));
            case 24:
                if (obj != null) {
                    throw new ClassCastException();
                }
                C1751qH c1751qH = (C1751qH) obj2;
                XU xu = new XU(c1751qH.a);
                C1818rJ c1818rJ7 = TP.a;
                ZU zu = new ZU(c1751qH.b);
                Object a2 = TP.a(new C1830rV(c1751qH.c), TP.q);
                C0975eV c0975eV = c1751qH.d;
                int i4 = C0975eV.c;
                return AbstractC0868ct.f(xu, zu, a2, TP.a(c0975eV, TP.l));
            case 25:
                if (obj != null) {
                    throw new ClassCastException();
                }
                C0709aR c0709aR = (C0709aR) obj2;
                return AbstractC0868ct.f(TP.a(new C1114gc(c0709aR.a), TP.p), TP.a(new BF(c0709aR.b), TP.r), Float.valueOf(c0709aR.c));
            case 26:
                if (obj != null) {
                    throw new ClassCastException();
                }
                LS ls = (LS) obj2;
                C1114gc c1114gc = new C1114gc(ls.a.f());
                QP qp = TP.p;
                Object a3 = TP.a(c1114gc, qp);
                C1830rV c1830rV = new C1830rV(ls.b);
                QP qp2 = TP.q;
                Object a4 = TP.a(c1830rV, qp2);
                C1586no c1586no = ls.c;
                C1586no c1586no2 = C1586no.i;
                Object a5 = TP.a(c1586no, TP.m);
                String str5 = ls.e;
                Object a6 = TP.a(new C1830rV(ls.f), qp2);
                Object a7 = TP.a(ls.g, TP.n);
                Object a8 = TP.a(ls.h, TP.k);
                FA fa = ls.i;
                FA fa2 = FA.j;
                Object a9 = TP.a(fa, TP.s);
                Object a10 = TP.a(new C1114gc(ls.j), qp);
                Object a11 = TP.a(ls.k, TP.j);
                C0709aR c0709aR2 = ls.l;
                int i5 = C0709aR.d;
                return AbstractC0868ct.f(a3, a4, a5, null, null, -1, str5, a6, a7, a8, a9, a10, a11, TP.a(c0709aR2, TP.f111o));
            case 27:
                if (obj == null) {
                    return Integer.valueOf(((YU) obj2).a);
                }
                throw new ClassCastException();
            case 28:
                if (obj != null) {
                    throw new ClassCastException();
                }
                C0910dV c0910dV = (C0910dV) obj2;
                return AbstractC0868ct.f(Float.valueOf(c0910dV.a), Float.valueOf(c0910dV.b));
            default:
                if (obj != null) {
                    throw new ClassCastException();
                }
                C0975eV c0975eV2 = (C0975eV) obj2;
                C1830rV c1830rV2 = new C1830rV(c0975eV2.a);
                QP qp3 = TP.q;
                return AbstractC0868ct.f(TP.a(c1830rV2, qp3), TP.a(new C1830rV(c0975eV2.b), qp3));
        }
    }
}
