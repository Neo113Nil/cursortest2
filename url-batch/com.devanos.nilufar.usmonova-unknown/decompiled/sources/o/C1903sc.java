package o;

/* renamed from: o.sc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1903sc implements InterfaceC2312yp {
    public final /* synthetic */ int h;

    public /* synthetic */ C1903sc(int i) {
        this.h = i;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        C1969tc c1969tc;
        switch (this.h) {
            case 0:
                String str = (String) obj;
                InterfaceC0137Fe interfaceC0137Fe = (InterfaceC0137Fe) obj2;
                AbstractC0048Bt.n(str, "acc");
                AbstractC0048Bt.n(interfaceC0137Fe, "element");
                if (str.length() == 0) {
                    return interfaceC0137Fe.toString();
                }
                return str + ", " + interfaceC0137Fe;
            case 1:
                InterfaceC0189He interfaceC0189He = (InterfaceC0189He) obj;
                InterfaceC0137Fe interfaceC0137Fe2 = (InterfaceC0137Fe) obj2;
                AbstractC0048Bt.n(interfaceC0189He, "acc");
                AbstractC0048Bt.n(interfaceC0137Fe2, "element");
                InterfaceC0189He j = interfaceC0189He.j(interfaceC0137Fe2.getKey());
                C1188hk c1188hk = C1188hk.h;
                if (j == c1188hk) {
                    return interfaceC0137Fe2;
                }
                C0460Rq c0460Rq = C0460Rq.w;
                InterfaceC0007Ae interfaceC0007Ae = (InterfaceC0007Ae) j.k(c0460Rq);
                if (interfaceC0007Ae == null) {
                    c1969tc = new C1969tc(interfaceC0137Fe2, j);
                } else {
                    InterfaceC0189He j2 = j.j(c0460Rq);
                    if (j2 == c1188hk) {
                        return new C1969tc(interfaceC0007Ae, interfaceC0137Fe2);
                    }
                    c1969tc = new C1969tc(interfaceC0007Ae, new C1969tc(interfaceC0137Fe2, j2));
                }
                return c1969tc;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 3:
                return ((InterfaceC0189He) obj).D((InterfaceC0137Fe) obj2);
            case 4:
                return ((InterfaceC0189He) obj).D((InterfaceC0137Fe) obj2);
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0137Fe interfaceC0137Fe3 = (InterfaceC0137Fe) obj2;
                if (!(interfaceC0137Fe3 instanceof DV)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? interfaceC0137Fe3 : Integer.valueOf(intValue + 1);
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                DV dv = (DV) obj;
                InterfaceC0137Fe interfaceC0137Fe4 = (InterfaceC0137Fe) obj2;
                if (dv != null) {
                    return dv;
                }
                if (interfaceC0137Fe4 instanceof DV) {
                    return (DV) interfaceC0137Fe4;
                }
                return null;
            default:
                return (HV) obj;
        }
    }
}
