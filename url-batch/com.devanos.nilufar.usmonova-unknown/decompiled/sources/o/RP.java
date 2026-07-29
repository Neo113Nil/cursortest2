package o;

import java.util.List;

/* loaded from: classes.dex */
public final class RP extends AbstractC1596ny implements InterfaceC2114vp {
    public static final RP A;
    public static final RP B;
    public static final RP C;
    public static final RP D;
    public static final RP E;
    public static final RP F;
    public static final RP G;
    public static final RP H;
    public static final RP I;
    public static final RP J;
    public static final RP K;
    public static final RP L;
    public static final RP i;
    public static final RP j;
    public static final RP k;
    public static final RP l;
    public static final RP m;
    public static final RP n;

    /* renamed from: o, reason: collision with root package name */
    public static final RP f97o;
    public static final RP p;
    public static final RP q;
    public static final RP r;
    public static final RP s;
    public static final RP t;
    public static final RP u;
    public static final RP v;
    public static final RP w;
    public static final RP x;
    public static final RP y;
    public static final RP z;
    public final /* synthetic */ int h;

    static {
        int i2 = 1;
        i = new RP(i2, 0);
        j = new RP(i2, 1);
        k = new RP(i2, 2);
        l = new RP(i2, 3);
        m = new RP(i2, 4);
        n = new RP(i2, 5);
        f97o = new RP(i2, 6);
        p = new RP(i2, 7);
        q = new RP(i2, 8);
        r = new RP(i2, 9);
        s = new RP(i2, 10);
        t = new RP(i2, 11);
        u = new RP(i2, 12);
        v = new RP(i2, 13);
        w = new RP(i2, 14);
        x = new RP(i2, 15);
        y = new RP(i2, 16);
        z = new RP(i2, 17);
        A = new RP(i2, 18);
        B = new RP(i2, 19);
        C = new RP(i2, 20);
        D = new RP(i2, 21);
        E = new RP(i2, 22);
        F = new RP(i2, 23);
        G = new RP(i2, 24);
        H = new RP(i2, 25);
        I = new RP(i2, 26);
        J = new RP(i2, 27);
        K = new RP(i2, 28);
        L = new RP(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RP(int i2, int i3) {
        super(i2);
        this.h = i3;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        InterfaceC2204x9 b;
        String z2;
        int i2 = this.h;
        C0782bY c0782bY = C0782bY.a;
        r4 = null;
        LS ls = null;
        boolean z3 = false;
        switch (i2) {
            case 0:
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                C1896sV[] c1896sVArr = C1830rV.b;
                C1818rJ c1818rJ = TP.a;
                Boolean bool = Boolean.FALSE;
                AbstractC0048Bt.h(obj2, bool);
                RP rp = l;
                C1830rV c1830rV = obj2 != null ? (C1830rV) rp.invoke(obj2) : null;
                AbstractC0048Bt.k(c1830rV);
                long j2 = c1830rV.a;
                Object obj3 = list.get(1);
                AbstractC0048Bt.h(obj3, bool);
                C1830rV c1830rV2 = obj3 != null ? (C1830rV) rp.invoke(obj3) : null;
                AbstractC0048Bt.k(c1830rV2);
                return new C0975eV(j2, c1830rV2.a);
            case 1:
                WI wi = WI.J;
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                C1818rJ c1818rJ2 = TP.h;
                Boolean bool2 = Boolean.FALSE;
                LS ls2 = (AbstractC0048Bt.h(obj4, bool2) || obj4 == null) ? null : (LS) wi.invoke(obj4);
                Object obj5 = list2.get(1);
                LS ls3 = (AbstractC0048Bt.h(obj5, bool2) || obj5 == null) ? null : (LS) wi.invoke(obj5);
                Object obj6 = list2.get(2);
                LS ls4 = (AbstractC0048Bt.h(obj6, bool2) || obj6 == null) ? null : (LS) wi.invoke(obj6);
                Object obj7 = list2.get(3);
                if (!AbstractC0048Bt.h(obj7, bool2) && obj7 != null) {
                    ls = (LS) wi.invoke(obj7);
                }
                return new C1435lV(ls2, ls3, ls4, ls);
            case 2:
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list3 = (List) obj;
                Object obj8 = list3.get(0);
                Integer num = obj8 != null ? (Integer) obj8 : null;
                AbstractC0048Bt.k(num);
                int intValue = num.intValue();
                Object obj9 = list3.get(1);
                Integer num2 = obj9 != null ? (Integer) obj9 : null;
                AbstractC0048Bt.k(num2);
                return new C1501mV(AbstractC1494mO.a(intValue, num2.intValue()));
            case 3:
                if (AbstractC0048Bt.h(obj, Boolean.FALSE)) {
                    return new C1830rV(C1830rV.c);
                }
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list4 = (List) obj;
                Object obj10 = list4.get(0);
                Float f = obj10 != null ? (Float) obj10 : null;
                AbstractC0048Bt.k(f);
                float floatValue = f.floatValue();
                Object obj11 = list4.get(1);
                C1896sV c1896sV = obj11 != null ? (C1896sV) obj11 : null;
                AbstractC0048Bt.k(c1896sV);
                return new C1830rV(AbstractC2219xO.s(c1896sV.a, floatValue));
            case 4:
                String str = obj != null ? (String) obj : null;
                AbstractC0048Bt.k(str);
                return new BY(str);
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                String str2 = obj != null ? (String) obj : null;
                AbstractC0048Bt.k(str2);
                return new C1111gZ(str2);
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                throw null;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC1888sN.q(obj);
                throw null;
            case 8:
                String str3 = (String) obj;
                AbstractC0048Bt.n(str3, "it");
                if (str3.length() <= 1) {
                    return str3;
                }
                return "L" + str3 + ';';
            case 9:
                InterfaceC2364zb c = ((AbstractC2097vY) obj).B0().c();
                if (c == null) {
                    return Boolean.FALSE;
                }
                C0827cE name = c.getName();
                C2245xo c2245xo = C1460lu.f;
                if (AbstractC0048Bt.h(name, c2245xo.f()) && AbstractC0048Bt.h(AbstractC0192Hh.c(c), c2245xo)) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 10:
                InterfaceC2204x9 interfaceC2204x9 = (InterfaceC2204x9) obj;
                AbstractC0048Bt.n(interfaceC2204x9, "it");
                C0261Jy J2 = interfaceC2204x9.J();
                AbstractC0048Bt.k(J2);
                return J2.c();
            case 11:
                InterfaceC2204x9 interfaceC2204x92 = (InterfaceC2204x9) obj;
                AbstractC0048Bt.n(interfaceC2204x92, "it");
                AbstractC1004ey returnType = interfaceC2204x92.getReturnType();
                AbstractC0048Bt.k(returnType);
                return returnType;
            case 12:
                AbstractC2097vY abstractC2097vY = (AbstractC2097vY) obj;
                AbstractC0048Bt.n(abstractC2097vY, "it");
                return Boolean.valueOf(abstractC2097vY instanceof C2216xL);
            case 13:
                return c0782bY;
            case 14:
                return c0782bY;
            case 15:
                return c0782bY;
            case 16:
                InterfaceC2204x9 interfaceC2204x93 = (InterfaceC2204x9) obj;
                AbstractC0048Bt.n(interfaceC2204x93, "it");
                return Boolean.valueOf(EB.y(AbstractC0192Hh.k(interfaceC2204x93)));
            case 17:
                InterfaceC2204x9 interfaceC2204x94 = (InterfaceC2204x9) obj;
                AbstractC0048Bt.n(interfaceC2204x94, "it");
                int i3 = Z8.l;
                HR hr = (HR) interfaceC2204x94;
                if (AbstractC0545Ux.z(hr) && AbstractC0192Hh.b(hr, new C1400l(9, hr)) != null) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 18:
                InterfaceC2204x9 interfaceC2204x95 = (InterfaceC2204x9) obj;
                AbstractC0048Bt.n(interfaceC2204x95, "it");
                if (AbstractC0545Ux.z(interfaceC2204x95)) {
                    int i4 = C0691a9.l;
                    if (WS.e.contains(interfaceC2204x95.getName()) && (b = AbstractC0192Hh.b(interfaceC2204x95, I2.f48o)) != null && (z2 = PX.z(b)) != null) {
                        if (!WS.b.contains(z2)) {
                        }
                        z3 = true;
                    }
                }
                return Boolean.valueOf(z3);
            case 19:
                return c0782bY;
            case 20:
                throw null;
            case 21:
                MK mk = (MK) obj;
                AbstractC0048Bt.n(mk, "it");
                return Integer.valueOf(mk.k.size());
            case 22:
                InterfaceC2072v9 interfaceC2072v9 = (InterfaceC2072v9) obj;
                AbstractC0048Bt.n(interfaceC2072v9, "$this$selectMostSpecificInEachOverridableGroup");
                return interfaceC2072v9;
            case 23:
                HR hr2 = (HR) obj;
                AbstractC0048Bt.n(hr2, "$this$selectMostSpecificInEachOverridableGroup");
                return hr2;
            case 24:
                PJ pj = (PJ) obj;
                AbstractC0048Bt.n(pj, "$this$selectMostSpecificInEachOverridableGroup");
                return pj;
            case 25:
                AbstractC0048Bt.n((InterfaceC1118gg) obj, "it");
                return Boolean.valueOf(!(r10 instanceof InterfaceC0629Yd));
            case 26:
                InterfaceC1118gg interfaceC1118gg = (InterfaceC1118gg) obj;
                AbstractC0048Bt.n(interfaceC1118gg, "it");
                List typeParameters = ((InterfaceC2072v9) interfaceC1118gg).getTypeParameters();
                AbstractC0048Bt.m(typeParameters, "it as CallableDescriptor).typeParameters");
                return AbstractC0720ac.i0(typeParameters);
            case 27:
                AbstractC2097vY abstractC2097vY2 = (AbstractC2097vY) obj;
                AbstractC0048Bt.n(abstractC2097vY2, "it");
                InterfaceC2364zb c2 = abstractC2097vY2.B0().c();
                if (c2 != null && (c2 instanceof InterfaceC1437lX) && (((InterfaceC1437lX) c2).n() instanceof C1316ji)) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 28:
                AbstractC2097vY abstractC2097vY3 = (AbstractC2097vY) obj;
                AbstractC0048Bt.n(abstractC2097vY3, "it");
                InterfaceC2364zb c3 = abstractC2097vY3.B0().c();
                if (c3 != null && ((c3 instanceof C1316ji) || (c3 instanceof InterfaceC1437lX))) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            default:
                return new V3(((Number) obj).floatValue());
        }
    }
}
