package o;

import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: o.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1139h0 extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1139h0(int i, Object obj) {
        super(0);
        this.h = i;
        this.i = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [o.Bh] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v26, types: [o.jk] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.lang.String] */
    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        Collection collection;
        EnumC0873cy enumC0873cy;
        O6 o6;
        int i = this.h;
        C1384kk c1384kk = C1384kk.h;
        ?? r5 = 0;
        C0782bY c0782bY = C0782bY.a;
        Object obj = this.i;
        switch (i) {
            case 0:
                return new C1073g0(((AbstractC1205i0) obj).e());
            case 1:
                ((C1364kQ) obj).getClass();
                return c0782bY;
            case 2:
                int i2 = 0;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    i2 += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(i2);
            case 3:
                O8 o8 = (O8) obj;
                return o8.a.i(o8.b).i();
            case 4:
                AbstractC1004ey b = ((AbstractC1701pX) obj).b();
                AbstractC0048Bt.m(b, "this@createCapturedIfNeeded.type");
                return b;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                C0062Ch c0062Ch = ((C2304yh) obj).a;
                C0062Ch c0062Ch2 = new C0062Ch();
                Field[] declaredFields = C0062Ch.class.getDeclaredFields();
                AbstractC0048Bt.m(declaredFields, "this::class.java.declaredFields");
                int length = declaredFields.length;
                int i3 = 0;
                while (i3 < length) {
                    Field field = declaredFields[i3];
                    if ((field.getModifiers() & 8) == 0) {
                        field.setAccessible(true);
                        Object obj2 = field.get(c0062Ch);
                        ?? r11 = obj2 instanceof C0036Bh ? (C0036Bh) obj2 : r7;
                        if (r11 != 0) {
                            String name = field.getName();
                            AbstractC0048Bt.m(name, "field.name");
                            AbstractC0778bU.B(name, "is", r5);
                            InterfaceC0517Tv b2 = UM.a.b(C0062Ch.class);
                            String name2 = field.getName();
                            StringBuilder sb = new StringBuilder("get");
                            ?? name3 = field.getName();
                            AbstractC0048Bt.m(name3, "field.name");
                            int length2 = name3.length();
                            String str2 = name3;
                            if (length2 > 0) {
                                char upperCase = Character.toUpperCase(name3.charAt(r5));
                                String substring = name3.substring(1);
                                AbstractC0048Bt.m(substring, "this as java.lang.String).substring(startIndex)");
                                str2 = upperCase + substring;
                            }
                            sb.append(str2);
                            new UJ(b2, name2, sb.toString());
                            field.set(c0062Ch2, new C0036Bh(r11.a, c0062Ch2));
                        }
                    }
                    i3++;
                    r5 = 0;
                    r7 = null;
                }
                c0062Ch2.i(WQ.n(c0062Ch2.h(), AbstractC0868ct.K(AbstractC1433lT.p, AbstractC1433lT.q)));
                c0062Ch2.a = true;
                return new C2304yh(c0062Ch2);
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                HashSet hashSet = new HashSet();
                C0581Wh c0581Wh = (C0581Wh) ((C1334k) obj).l;
                C0555Vh c0555Vh = c0581Wh.u;
                C0321Mh c0321Mh = c0581Wh.s;
                C1030fK c1030fK = c0581Wh.l;
                Iterator it = c0555Vh.d().iterator();
                while (it.hasNext()) {
                    for (InterfaceC1118gg interfaceC1118gg : ON.h(((AbstractC1004ey) it.next()).r0(), null, 3)) {
                        if ((interfaceC1118gg instanceof HR) || (interfaceC1118gg instanceof PJ)) {
                            hashSet.add(interfaceC1118gg.getName());
                        }
                    }
                }
                List list = c1030fK.x;
                AbstractC0048Bt.m(list, "classProto.functionList");
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    hashSet.add(AbstractC1052fg.C(c0321Mh.b, ((C2017uK) it2.next()).m));
                }
                List list2 = c1030fK.y;
                AbstractC0048Bt.m(list2, "classProto.propertyList");
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    hashSet.add(AbstractC1052fg.C(c0321Mh.b, ((CK) it3.next()).m));
                }
                return WQ.n(hashSet, hashSet);
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC1054fi abstractC1054fi = (AbstractC1054fi) obj;
                Set n = abstractC1054fi.n();
                if (n == null) {
                    return null;
                }
                return WQ.n(WQ.n(abstractC1054fi.m(), abstractC1054fi.c.c.keySet()), n);
            case 8:
                Set keySet = ((LinkedHashMap) ((W8) obj).p.l).keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : keySet) {
                    C1639ob c1639ob = (C1639ob) obj3;
                    if (c1639ob.b.e().d() && !C1573nb.c.contains(c1639ob)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(arrayList));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((C1639ob) it4.next()).i());
                }
                return arrayList2;
            case 9:
                C1382ki c1382ki = (C1382ki) obj;
                C0321Mh c0321Mh2 = c1382ki.r;
                return AbstractC0720ac.J0(c0321Mh2.a.e.w(c1382ki.s, c0321Mh2.b));
            case 10:
                AbstractC0071Cq abstractC0071Cq = (AbstractC0071Cq) obj;
                List h = abstractC0071Cq.h();
                ArrayList arrayList3 = new ArrayList(3);
                AbstractC1598o abstractC1598o = abstractC0071Cq.b;
                Collection d = abstractC1598o.z().d();
                AbstractC0048Bt.m(d, "containingClass.typeConstructor.supertypes");
                ArrayList arrayList4 = new ArrayList();
                Iterator it5 = d.iterator();
                while (it5.hasNext()) {
                    AbstractC1048fc.f0(arrayList4, ON.h(((AbstractC1004ey) it5.next()).r0(), null, 3));
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it6 = arrayList4.iterator();
                while (it6.hasNext()) {
                    Object next = it6.next();
                    if (next instanceof InterfaceC2204x9) {
                        arrayList5.add(next);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it7 = arrayList5.iterator();
                while (it7.hasNext()) {
                    Object next2 = it7.next();
                    C0827cE name4 = ((InterfaceC2204x9) next2).getName();
                    Object obj4 = linkedHashMap.get(name4);
                    if (obj4 == null) {
                        obj4 = new ArrayList();
                        linkedHashMap.put(name4, obj4);
                    }
                    ((List) obj4).add(next2);
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    C0827cE c0827cE = (C0827cE) entry2.getKey();
                    List list3 = (List) entry2.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj5 : list3) {
                        Boolean valueOf = Boolean.valueOf(((InterfaceC2204x9) obj5) instanceof InterfaceC0381Op);
                        Object obj6 = linkedHashMap2.get(valueOf);
                        if (obj6 == null) {
                            obj6 = new ArrayList();
                            linkedHashMap2.put(valueOf, obj6);
                        }
                        ((List) obj6).add(obj5);
                    }
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        boolean booleanValue = ((Boolean) entry3.getKey()).booleanValue();
                        List list4 = (List) entry3.getValue();
                        XG xg = XG.c;
                        if (booleanValue) {
                            collection = new ArrayList();
                            for (Object obj7 : h) {
                                if (AbstractC0048Bt.h(((AbstractC1184hg) ((InterfaceC0381Op) obj7)).getName(), c0827cE)) {
                                    collection.add(obj7);
                                }
                            }
                        } else {
                            collection = C1318jk.h;
                        }
                        xg.h(c0827cE, list4, collection, abstractC1598o, new C0045Bq(arrayList3, abstractC0071Cq));
                    }
                }
                return AbstractC0720ac.A0(h, AbstractC1052fg.i(arrayList3));
            case 11:
                return (List) obj;
            case 12:
                return Float.valueOf(AbstractC0773bP.b(((InterfaceC0422Qe) obj).m()));
            case 13:
                Object systemService = ((C0540Us) obj).a.getContext().getSystemService("input_method");
                AbstractC0048Bt.l(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 14:
                Object obj8 = AbstractC0515Tt.a;
                InterfaceC0411Pt interfaceC0411Pt = ((C1262iu) obj).d;
                CM cm = interfaceC0411Pt instanceof CM ? (CM) interfaceC0411Pt : null;
                C2175wk c2175wk = (cm == null || (enumC0873cy = (EnumC0873cy) AbstractC0515Tt.b.get(C0827cE.e(cm.b.name()).b())) == null) ? null : new C2175wk(C1639ob.j(AbstractC1433lT.v), C0827cE.e(enumC0873cy.name()));
                r7 = c2175wk != null ? EB.F(new C1619oH(AbstractC0463Rt.c, c2175wk)) : null;
                return r7 == null ? c1384kk : r7;
            case 15:
                InterfaceC0411Pt interfaceC0411Pt2 = ((C1328ju) obj).d;
                if (interfaceC0411Pt2 instanceof C1756qM) {
                    Object obj9 = AbstractC0515Tt.a;
                    o6 = AbstractC0515Tt.a(((C1756qM) interfaceC0411Pt2).a());
                } else if (interfaceC0411Pt2 instanceof CM) {
                    Object obj10 = AbstractC0515Tt.a;
                    o6 = AbstractC0515Tt.a(AbstractC0868ct.J(interfaceC0411Pt2));
                } else {
                    o6 = null;
                }
                r7 = o6 != null ? EB.F(new C1619oH(AbstractC0463Rt.b, o6)) : null;
                return r7 == null ? c1384kk : r7;
            case 16:
                C0386Ou c0386Ou = (C0386Ou) obj;
                C0889dA c0889dA = new C0889dA(10);
                c0889dA.add(c0386Ou.a.h);
                DN dn = c0386Ou.b;
                if (dn != null) {
                    c0889dA.add("under-migration:".concat(dn.h));
                }
                for (Map.Entry entry4 : c0386Ou.c.entrySet()) {
                    c0889dA.add("@" + entry4.getKey() + ':' + ((DN) entry4.getValue()).h);
                }
                return (String[]) AbstractC0868ct.j(c0889dA).toArray(new String[0]);
            case 17:
                C0568Vu c0568Vu = (C0568Vu) obj;
                C0542Uu c0542Uu = c0568Vu.f;
                if (c0542Uu == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                C0516Tu c0516Tu = (C0516Tu) c0542Uu.invoke();
                c0568Vu.f = null;
                return c0516Tu;
            case 18:
                C1725pv c1725pv = (C1725pv) obj;
                C0546Uy c0546Uy = c1725pv.c;
                Collection values = ((Map) AbstractC0772bO.o(c0546Uy.p, C0546Uy.t[0])).values();
                ArrayList arrayList6 = new ArrayList();
                Iterator it8 = values.iterator();
                while (it8.hasNext()) {
                    C1120gi a = ((C1198hu) c1725pv.b.i).d.a(c0546Uy, (OM) it8.next());
                    if (a != null) {
                        arrayList6.add(a);
                    }
                }
                return (WB[]) ON.l(arrayList6).toArray(new WB[0]);
            case 19:
                return ZC.a(((AbstractC1330jw) obj).e());
            case 20:
                return new C2055uw((C2121vw) obj);
            case 21:
                return new C2319yw((C2385zw) obj);
            case 22:
                return new C0025Aw((C0051Bw) obj);
            case 23:
                List upperBounds = ((C1793qx) obj).h.getUpperBounds();
                AbstractC0048Bt.m(upperBounds, "descriptor.upperBounds");
                ArrayList arrayList7 = new ArrayList(AbstractC0786bc.d0(upperBounds));
                Iterator it9 = upperBounds.iterator();
                while (it9.hasNext()) {
                    arrayList7.add(new C1661ox((AbstractC1004ey) it9.next(), null));
                }
                return arrayList7;
            case 24:
                C0209Hy c0209Hy = ((C0027Ay) obj).v;
                c0209Hy.q.s = true;
                C0131Ey c0131Ey = c0209Hy.r;
                if (c0131Ey != null) {
                    c0131Ey.s = true;
                }
                return c0782bY;
            case 25:
                C0157Fy c0157Fy = (C0157Fy) obj;
                C0209Hy c0209Hy2 = c0157Fy.B;
                C0027Ay c0027Ay = c0209Hy2.a;
                c0209Hy2.j = 0;
                YD o2 = c0209Hy2.a.o();
                int i4 = o2.j;
                if (i4 > 0) {
                    Object[] objArr = o2.h;
                    int i5 = 0;
                    do {
                        C0157Fy c0157Fy2 = ((C0027Ay) objArr[i5]).v.q;
                        c0157Fy2.h = c0157Fy2.i;
                        c0157Fy2.i = Integer.MAX_VALUE;
                        c0157Fy2.p = false;
                        if (c0157Fy2.l == 2) {
                            c0157Fy2.l = 3;
                        }
                        i5++;
                    } while (i5 < i4);
                }
                YD o3 = c0027Ay.o();
                int i6 = o3.j;
                if (i6 > 0) {
                    Object[] objArr2 = o3.h;
                    int i7 = 0;
                    do {
                        ((C0027Ay) objArr2[i7]).v.q.q.getClass();
                        i7++;
                    } while (i7 < i6);
                }
                c0157Fy.n().P().r();
                YD o4 = c0027Ay.o();
                int i8 = o4.j;
                if (i8 > 0) {
                    Object[] objArr3 = o4.h;
                    int i9 = 0;
                    do {
                        C0027Ay c0027Ay2 = (C0027Ay) objArr3[i9];
                        if (c0027Ay2.v.q.h != c0027Ay2.m()) {
                            c0027Ay.z();
                            c0027Ay.q();
                            if (c0027Ay2.m() == Integer.MAX_VALUE) {
                                c0027Ay2.v.q.I();
                            }
                        }
                        i9++;
                    } while (i9 < i8);
                }
                YD o5 = c0027Ay.o();
                int i10 = o5.j;
                if (i10 > 0) {
                    Object[] objArr4 = o5.h;
                    int i11 = 0;
                    do {
                        C0053By c0053By = ((C0027Ay) objArr4[i11]).v.q.q;
                        c0053By.getClass();
                        c0053By.c = false;
                        i11++;
                    } while (i11 < i10);
                }
                return c0782bY;
            case 26:
                C0209Hy c0209Hy3 = (C0209Hy) obj;
                c0209Hy3.a().a(c0209Hy3.s);
                return c0782bY;
            case 27:
                WB wb = (WB) ((InterfaceC1455lp) obj).invoke();
                return wb instanceof C1531mz ? ((C1531mz) wb).h() : wb;
            case 28:
                InterfaceC1455lp interfaceC1455lp = ((C2077vE) obj).b;
                if (interfaceC1455lp != null) {
                    return (List) interfaceC1455lp.invoke();
                }
                return null;
            default:
                ME me = ((ME) obj).n;
                if (me != null) {
                    me.n0();
                }
                return c0782bY;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1139h0(C1364kQ c1364kQ, C1013f3 c1013f3) {
        super(0);
        this.h = 1;
        this.i = c1364kQ;
    }
}
