package o;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class WI extends AbstractC1596ny implements InterfaceC2114vp {
    public static final WI A;
    public static final WI B;
    public static final WI C;
    public static final WI D;
    public static final WI E;
    public static final WI F;
    public static final WI G;
    public static final WI H;
    public static final WI I;
    public static final WI J;
    public static final WI K;
    public static final WI L;
    public static final WI i;
    public static final WI j;
    public static final WI k;
    public static final WI l;
    public static final WI m;
    public static final WI n;

    /* renamed from: o, reason: collision with root package name */
    public static final WI f124o;
    public static final WI p;
    public static final WI q;
    public static final WI r;
    public static final WI s;
    public static final WI t;
    public static final WI u;
    public static final WI v;
    public static final WI w;
    public static final WI x;
    public static final WI y;
    public static final WI z;
    public final /* synthetic */ int h;

    static {
        int i2 = 1;
        i = new WI(i2, 0);
        j = new WI(i2, 1);
        k = new WI(i2, 2);
        l = new WI(i2, 3);
        m = new WI(i2, 4);
        n = new WI(i2, 5);
        f124o = new WI(i2, 6);
        p = new WI(i2, 7);
        q = new WI(i2, 8);
        r = new WI(i2, 9);
        s = new WI(i2, 10);
        t = new WI(i2, 11);
        u = new WI(i2, 12);
        v = new WI(i2, 13);
        w = new WI(i2, 14);
        x = new WI(i2, 15);
        y = new WI(i2, 16);
        z = new WI(i2, 17);
        A = new WI(i2, 18);
        B = new WI(i2, 19);
        C = new WI(i2, 20);
        D = new WI(i2, 21);
        E = new WI(i2, 22);
        F = new WI(i2, 23);
        G = new WI(i2, 24);
        H = new WI(i2, 25);
        I = new WI(i2, 26);
        J = new WI(i2, 27);
        K = new WI(i2, 28);
        L = new WI(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WI(int i2, int i3) {
        super(i2);
        this.h = i3;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        X3 x3;
        C1830rV c1830rV;
        BF bf;
        C1830rV c1830rV2;
        C1830rV c1830rV3;
        C0910dV c0910dV;
        int i2 = this.h;
        C0782bY c0782bY = C0782bY.a;
        WI wi = y;
        C1751qH c1751qH = null;
        r16 = null;
        C0709aR c0709aR = null;
        r16 = null;
        C0975eV c0975eV = null;
        r16 = null;
        C1435lV c1435lV = null;
        r16 = null;
        C1435lV c1435lV2 = null;
        r16 = null;
        C0651Yz c0651Yz = null;
        r16 = null;
        C0677Zz c0677Zz = null;
        r16 = null;
        LS ls = null;
        c1751qH = null;
        switch (i2) {
            case 0:
                AbstractC0048Bt.n((Context) obj, "it");
                return C1318jk.h;
            case 1:
                GJ gj = GJ.b;
                InterfaceC0937dx[] interfaceC0937dxArr = EQ.a;
                FQ fq = CQ.c;
                InterfaceC0937dx interfaceC0937dx = EQ.a[1];
                fq.getClass();
                ((C2023uQ) obj).k(fq, gj);
                return c0782bY;
            case 2:
                String str = (String) obj;
                AbstractC0048Bt.n(str, "it");
                return "(raw) ".concat(str);
            case 3:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                AbstractC0048Bt.n(parameterizedType, "it");
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 4:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                AbstractC0048Bt.n(parameterizedType2, "it");
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                AbstractC0048Bt.m(actualTypeArguments, "it.actualTypeArguments");
                return P6.X(actualTypeArguments);
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                String simpleName = ((Class) obj).getSimpleName();
                if (!C0827cE.f(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return C0827cE.e(simpleName);
                }
                return null;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                C2304yh c2304yh = XM.a;
                AbstractC1004ey c = ((RY) obj).c();
                AbstractC0048Bt.m(c, "it.type");
                return XM.d(c);
            case 8:
                C2304yh c2304yh2 = XM.a;
                AbstractC1004ey c2 = ((RY) obj).c();
                AbstractC0048Bt.m(c2, "it.type");
                return XM.d(c2);
            case 9:
                AbstractC0545Ux abstractC0545Ux = (AbstractC0545Ux) obj;
                AbstractC0048Bt.n(abstractC0545Ux, "$this$null");
                return abstractC0545Ux.s(EnumC1423lJ.m);
            case 10:
                AbstractC0545Ux abstractC0545Ux2 = (AbstractC0545Ux) obj;
                AbstractC0048Bt.n(abstractC0545Ux2, "$this$null");
                return abstractC0545Ux2.s(EnumC1423lJ.q);
            case 11:
                AbstractC0545Ux abstractC0545Ux3 = (AbstractC0545Ux) obj;
                AbstractC0048Bt.n(abstractC0545Ux3, "$this$null");
                return abstractC0545Ux3.w();
            case 12:
                return c0782bY;
            case 13:
                Class cls = (Class) obj;
                AbstractC0048Bt.m(cls, "it");
                return AbstractC1492mM.b(cls);
            case 14:
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(1);
                C1818rJ c1818rJ = TP.a;
                Boolean bool = Boolean.FALSE;
                if (AbstractC0048Bt.h(obj2, bool) || obj2 == null) {
                    arrayList = null;
                } else {
                    List list2 = (List) obj2;
                    arrayList = new ArrayList(list2.size());
                    int size = list2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        Object obj3 = list2.get(i3);
                        C1818rJ c1818rJ2 = TP.b;
                        X3 x32 = (AbstractC0048Bt.h(obj3, Boolean.FALSE) || obj3 == null) ? null : (X3) wi.invoke(obj3);
                        AbstractC0048Bt.k(x32);
                        arrayList.add(x32);
                    }
                }
                Object obj4 = list.get(2);
                if (AbstractC0048Bt.h(obj4, bool) || obj4 == null) {
                    arrayList2 = null;
                } else {
                    List list3 = (List) obj4;
                    arrayList2 = new ArrayList(list3.size());
                    int size2 = list3.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        Object obj5 = list3.get(i4);
                        C1818rJ c1818rJ3 = TP.b;
                        X3 x33 = (AbstractC0048Bt.h(obj5, Boolean.FALSE) || obj5 == null) ? null : (X3) wi.invoke(obj5);
                        AbstractC0048Bt.k(x33);
                        arrayList2.add(x33);
                    }
                }
                Object obj6 = list.get(0);
                String str2 = obj6 != null ? (String) obj6 : null;
                AbstractC0048Bt.k(str2);
                if (arrayList == null || arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    arrayList2 = null;
                }
                Object obj7 = list.get(3);
                if (AbstractC0048Bt.h(obj7, bool) || obj7 == null) {
                    arrayList3 = null;
                } else {
                    List list4 = (List) obj7;
                    arrayList3 = new ArrayList(list4.size());
                    int size3 = list4.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        Object obj8 = list4.get(i5);
                        C1818rJ c1818rJ4 = TP.b;
                        X3 x34 = (AbstractC0048Bt.h(obj8, Boolean.FALSE) || obj8 == null) ? null : (X3) wi.invoke(obj8);
                        AbstractC0048Bt.k(x34);
                        arrayList3.add(x34);
                    }
                }
                return new Y3(str2, arrayList, arrayList2, arrayList3);
            case 15:
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                ArrayList arrayList4 = new ArrayList(list5.size());
                int size4 = list5.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    Object obj9 = list5.get(i6);
                    C1818rJ c1818rJ5 = TP.b;
                    X3 x35 = (AbstractC0048Bt.h(obj9, Boolean.FALSE) || obj9 == null) ? null : (X3) wi.invoke(obj9);
                    AbstractC0048Bt.k(x35);
                    arrayList4.add(x35);
                }
                return arrayList4;
            case 16:
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                EnumC1342k4 enumC1342k4 = obj10 != null ? (EnumC1342k4) obj10 : null;
                AbstractC0048Bt.k(enumC1342k4);
                Object obj11 = list6.get(2);
                Integer num = obj11 != null ? (Integer) obj11 : null;
                AbstractC0048Bt.k(num);
                int intValue = num.intValue();
                Object obj12 = list6.get(3);
                Integer num2 = obj12 != null ? (Integer) obj12 : null;
                AbstractC0048Bt.k(num2);
                int intValue2 = num2.intValue();
                Object obj13 = list6.get(4);
                String str3 = obj13 != null ? (String) obj13 : null;
                AbstractC0048Bt.k(str3);
                switch (enumC1342k4.ordinal()) {
                    case 0:
                        Object obj14 = list6.get(1);
                        C1818rJ c1818rJ6 = TP.g;
                        if (!AbstractC0048Bt.h(obj14, Boolean.FALSE) && obj14 != null) {
                            c1751qH = (C1751qH) H.invoke(obj14);
                        }
                        C1751qH c1751qH2 = c1751qH;
                        AbstractC0048Bt.k(c1751qH2);
                        return new X3(c1751qH2, intValue, intValue2, str3);
                    case 1:
                        Object obj15 = list6.get(1);
                        C1818rJ c1818rJ7 = TP.h;
                        if (!AbstractC0048Bt.h(obj15, Boolean.FALSE) && obj15 != null) {
                            ls = (LS) J.invoke(obj15);
                        }
                        LS ls2 = ls;
                        AbstractC0048Bt.k(ls2);
                        return new X3(ls2, intValue, intValue2, str3);
                    case 2:
                        Object obj16 = list6.get(1);
                        C1818rJ c1818rJ8 = TP.c;
                        C1111gZ c1111gZ = (AbstractC0048Bt.h(obj16, Boolean.FALSE) || obj16 == null) ? null : new C1111gZ((String) obj16);
                        AbstractC0048Bt.k(c1111gZ);
                        x3 = new X3(c1111gZ, intValue, intValue2, str3);
                        break;
                    case 3:
                        Object obj17 = list6.get(1);
                        C1818rJ c1818rJ9 = TP.d;
                        BY by = (AbstractC0048Bt.h(obj17, Boolean.FALSE) || obj17 == null) ? null : new BY((String) obj17);
                        AbstractC0048Bt.k(by);
                        x3 = new X3(by, intValue, intValue2, str3);
                        break;
                    case 4:
                        Object obj18 = list6.get(1);
                        C1818rJ c1818rJ10 = TP.e;
                        if (!AbstractC0048Bt.h(obj18, Boolean.FALSE) && obj18 != null) {
                            c0677Zz = (C0677Zz) D.invoke(obj18);
                        }
                        C0677Zz c0677Zz2 = c0677Zz;
                        AbstractC0048Bt.k(c0677Zz2);
                        return new X3(c0677Zz2, intValue, intValue2, str3);
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                        Object obj19 = list6.get(1);
                        C1818rJ c1818rJ11 = TP.f;
                        if (!AbstractC0048Bt.h(obj19, Boolean.FALSE) && obj19 != null) {
                            c0651Yz = (C0651Yz) A.invoke(obj19);
                        }
                        C0651Yz c0651Yz2 = c0651Yz;
                        AbstractC0048Bt.k(c0651Yz2);
                        return new X3(c0651Yz2, intValue, intValue2, str3);
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                        Object obj20 = list6.get(1);
                        String str4 = obj20 != null ? (String) obj20 : null;
                        AbstractC0048Bt.k(str4);
                        return new X3(str4, intValue, intValue2, str3);
                    default:
                        throw new C0057Cc();
                }
                return x3;
            case 17:
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.Float");
                return new Z7(((Float) obj).floatValue());
            case 18:
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list7 = (List) obj;
                Object obj21 = list7.get(0);
                String str5 = obj21 != null ? (String) obj21 : null;
                AbstractC0048Bt.k(str5);
                Object obj22 = list7.get(1);
                C1818rJ c1818rJ12 = TP.i;
                if (!AbstractC0048Bt.h(obj22, Boolean.FALSE) && obj22 != null) {
                    c1435lV2 = (C1435lV) RP.j.invoke(obj22);
                }
                return new C0651Yz(str5, c1435lV2);
            case 19:
                if (AbstractC0048Bt.h(obj, Boolean.FALSE)) {
                    return new C1114gc(C1114gc.f);
                }
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C1114gc(AbstractC0022At.b(((Integer) obj).intValue()));
            case 20:
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C1586no(((Integer) obj).intValue());
            case 21:
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list8 = (List) obj;
                Object obj23 = list8.get(0);
                String str6 = obj23 != null ? (String) obj23 : null;
                AbstractC0048Bt.k(str6);
                Object obj24 = list8.get(1);
                C1818rJ c1818rJ13 = TP.i;
                if (!AbstractC0048Bt.h(obj24, Boolean.FALSE) && obj24 != null) {
                    c1435lV = (C1435lV) RP.j.invoke(obj24);
                }
                return new C0677Zz(str6, c1435lV);
            case 22:
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list9 = (List) obj;
                ArrayList arrayList5 = new ArrayList(list9.size());
                int size5 = list9.size();
                for (int i7 = 0; i7 < size5; i7++) {
                    Object obj25 = list9.get(i7);
                    C1818rJ c1818rJ14 = TP.t;
                    EA ea = (AbstractC0048Bt.h(obj25, Boolean.FALSE) || obj25 == null) ? null : (EA) F.invoke(obj25);
                    AbstractC0048Bt.k(ea);
                    arrayList5.add(ea);
                }
                return new FA(arrayList5);
            case 23:
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.String");
                String str7 = (String) obj;
                AbstractC0868ct.i.getClass();
                Locale forLanguageTag = Locale.forLanguageTag(str7);
                if (AbstractC0048Bt.h(forLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str7 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new EA(forLanguageTag);
            case 24:
                if (AbstractC0048Bt.h(obj, Boolean.FALSE)) {
                    return new BF(9205357640488583168L);
                }
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list10 = (List) obj;
                Object obj26 = list10.get(0);
                Float f = obj26 != null ? (Float) obj26 : null;
                AbstractC0048Bt.k(f);
                float floatValue = f.floatValue();
                Object obj27 = list10.get(1);
                Float f2 = obj27 != null ? (Float) obj27 : null;
                AbstractC0048Bt.k(f2);
                return new BF(PX.h(floatValue, f2.floatValue()));
            case 25:
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list11 = (List) obj;
                Object obj28 = list11.get(0);
                XU xu = obj28 != null ? (XU) obj28 : null;
                AbstractC0048Bt.k(xu);
                int i8 = xu.a;
                Object obj29 = list11.get(1);
                ZU zu = obj29 != null ? (ZU) obj29 : null;
                AbstractC0048Bt.k(zu);
                int i9 = zu.a;
                Object obj30 = list11.get(2);
                C1896sV[] c1896sVArr = C1830rV.b;
                C1818rJ c1818rJ15 = TP.a;
                Boolean bool2 = Boolean.FALSE;
                AbstractC0048Bt.h(obj30, bool2);
                if (obj30 == null) {
                    c1830rV = null;
                } else if (obj30.equals(bool2)) {
                    c1830rV = new C1830rV(C1830rV.c);
                } else {
                    List list12 = (List) obj30;
                    Object obj31 = list12.get(0);
                    Float f3 = obj31 != null ? (Float) obj31 : null;
                    AbstractC0048Bt.k(f3);
                    float floatValue2 = f3.floatValue();
                    Object obj32 = list12.get(1);
                    C1896sV c1896sV = obj32 != null ? (C1896sV) obj32 : null;
                    AbstractC0048Bt.k(c1896sV);
                    c1830rV = new C1830rV(AbstractC2219xO.s(c1896sV.a, floatValue2));
                }
                AbstractC0048Bt.k(c1830rV);
                long j2 = c1830rV.a;
                Object obj33 = list11.get(3);
                int i10 = C0975eV.c;
                C1818rJ c1818rJ16 = TP.l;
                if (!AbstractC0048Bt.h(obj33, bool2) && obj33 != null) {
                    c0975eV = (C0975eV) RP.i.invoke(obj33);
                }
                return new C1751qH(i8, i9, j2, c0975eV, null, null, 0, Integer.MIN_VALUE);
            case 26:
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list13 = (List) obj;
                Object obj34 = list13.get(0);
                int i11 = C1114gc.g;
                C1818rJ c1818rJ17 = TP.a;
                Boolean bool3 = Boolean.FALSE;
                AbstractC0048Bt.h(obj34, bool3);
                C1114gc c1114gc = obj34 != null ? AbstractC0048Bt.h(obj34, Boolean.FALSE) ? new C1114gc(C1114gc.f) : new C1114gc(AbstractC0022At.b(((Integer) obj34).intValue())) : null;
                AbstractC0048Bt.k(c1114gc);
                long j3 = c1114gc.a;
                Object obj35 = list13.get(1);
                AbstractC0048Bt.h(obj35, bool3);
                if (obj35 == null) {
                    bf = null;
                } else if (obj35.equals(bool3)) {
                    bf = new BF(9205357640488583168L);
                } else {
                    List list14 = (List) obj35;
                    Object obj36 = list14.get(0);
                    Float f4 = obj36 != null ? (Float) obj36 : null;
                    AbstractC0048Bt.k(f4);
                    float floatValue3 = f4.floatValue();
                    Object obj37 = list14.get(1);
                    Float f5 = obj37 != null ? (Float) obj37 : null;
                    AbstractC0048Bt.k(f5);
                    bf = new BF(PX.h(floatValue3, f5.floatValue()));
                }
                AbstractC0048Bt.k(bf);
                long j4 = bf.a;
                Object obj38 = list13.get(2);
                Float f6 = obj38 != null ? (Float) obj38 : null;
                AbstractC0048Bt.k(f6);
                return new C0709aR(j3, j4, f6.floatValue());
            case 27:
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list15 = (List) obj;
                Object obj39 = list15.get(0);
                int i12 = C1114gc.g;
                C1818rJ c1818rJ18 = TP.a;
                Boolean bool4 = Boolean.FALSE;
                AbstractC0048Bt.h(obj39, bool4);
                C1114gc c1114gc2 = obj39 != null ? obj39.equals(bool4) ? new C1114gc(C1114gc.f) : new C1114gc(AbstractC0022At.b(((Integer) obj39).intValue())) : null;
                AbstractC0048Bt.k(c1114gc2);
                long j5 = c1114gc2.a;
                Object obj40 = list15.get(1);
                C1896sV[] c1896sVArr2 = C1830rV.b;
                AbstractC0048Bt.h(obj40, bool4);
                if (obj40 == null) {
                    c1830rV2 = null;
                } else if (obj40.equals(bool4)) {
                    c1830rV2 = new C1830rV(C1830rV.c);
                } else {
                    List list16 = (List) obj40;
                    Object obj41 = list16.get(0);
                    Float f7 = obj41 != null ? (Float) obj41 : null;
                    AbstractC0048Bt.k(f7);
                    float floatValue4 = f7.floatValue();
                    Object obj42 = list16.get(1);
                    C1896sV c1896sV2 = obj42 != null ? (C1896sV) obj42 : null;
                    AbstractC0048Bt.k(c1896sV2);
                    c1830rV2 = new C1830rV(AbstractC2219xO.s(c1896sV2.a, floatValue4));
                }
                AbstractC0048Bt.k(c1830rV2);
                long j6 = c1830rV2.a;
                Object obj43 = list15.get(2);
                C1586no c1586no = C1586no.i;
                C1818rJ c1818rJ19 = TP.m;
                C1586no c1586no2 = (AbstractC0048Bt.h(obj43, bool4) || obj43 == null) ? null : new C1586no(((Integer) obj43).intValue());
                if (list15.get(3) != null) {
                    throw new ClassCastException();
                }
                if (list15.get(4) != null) {
                    throw new ClassCastException();
                }
                Object obj44 = list15.get(6);
                String str8 = obj44 != null ? (String) obj44 : null;
                Object obj45 = list15.get(7);
                AbstractC0048Bt.h(obj45, bool4);
                if (obj45 == null) {
                    c1830rV3 = null;
                } else if (obj45.equals(bool4)) {
                    c1830rV3 = new C1830rV(C1830rV.c);
                } else {
                    List list17 = (List) obj45;
                    Object obj46 = list17.get(0);
                    Float f8 = obj46 != null ? (Float) obj46 : null;
                    AbstractC0048Bt.k(f8);
                    float floatValue5 = f8.floatValue();
                    Object obj47 = list17.get(1);
                    C1896sV c1896sV3 = obj47 != null ? (C1896sV) obj47 : null;
                    AbstractC0048Bt.k(c1896sV3);
                    c1830rV3 = new C1830rV(AbstractC2219xO.s(c1896sV3.a, floatValue5));
                }
                AbstractC0048Bt.k(c1830rV3);
                long j7 = c1830rV3.a;
                Object obj48 = list15.get(8);
                C1818rJ c1818rJ20 = TP.n;
                Z7 z7 = (AbstractC0048Bt.h(obj48, bool4) || obj48 == null) ? null : new Z7(((Float) obj48).floatValue());
                Object obj49 = list15.get(9);
                C1818rJ c1818rJ21 = TP.k;
                if (AbstractC0048Bt.h(obj49, bool4) || obj49 == null) {
                    c0910dV = null;
                } else {
                    List list18 = (List) obj49;
                    c0910dV = new C0910dV(((Number) list18.get(0)).floatValue(), ((Number) list18.get(1)).floatValue());
                }
                Object obj50 = list15.get(10);
                FA fa = FA.j;
                C1818rJ c1818rJ22 = TP.s;
                FA fa2 = (AbstractC0048Bt.h(obj50, bool4) || obj50 == null) ? null : (FA) E.invoke(obj50);
                Object obj51 = list15.get(11);
                AbstractC0048Bt.h(obj51, bool4);
                C1114gc c1114gc3 = obj51 != null ? obj51.equals(bool4) ? new C1114gc(C1114gc.f) : new C1114gc(AbstractC0022At.b(((Integer) obj51).intValue())) : null;
                AbstractC0048Bt.k(c1114gc3);
                long j8 = c1114gc3.a;
                Object obj52 = list15.get(12);
                C1818rJ c1818rJ23 = TP.j;
                YU yu = (AbstractC0048Bt.h(obj52, bool4) || obj52 == null) ? null : new YU(((Integer) obj52).intValue());
                Object obj53 = list15.get(13);
                int i13 = C0709aR.d;
                C1818rJ c1818rJ24 = TP.f111o;
                if (!AbstractC0048Bt.h(obj53, bool4) && obj53 != null) {
                    c0709aR = (C0709aR) I.invoke(obj53);
                }
                return new LS(j5, j6, c1586no2, str8, j7, z7, c0910dV, fa2, j8, yu, c0709aR);
            case 28:
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.Int");
                return new YU(((Integer) obj).intValue());
            default:
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list19 = (List) obj;
                return new C0910dV(((Number) list19.get(0)).floatValue(), ((Number) list19.get(1)).floatValue());
        }
    }
}
