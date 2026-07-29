package o;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: o.Vh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0555Vh extends AbstractC1664p {
    public final /* synthetic */ int c = 1;
    public final SA d;
    public final /* synthetic */ AbstractC1598o e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0555Vh(C0390Oy c0390Oy) {
        super(((C1198hu) r0.i).a);
        this.e = c0390Oy;
        C1216i8 c1216i8 = c0390Oy.q;
        OT ot = ((C1198hu) c1216i8.i).a;
        C0364Ny c0364Ny = new C0364Ny(c0390Oy, 0);
        VA va = (VA) ot;
        va.getClass();
        this.d = new SA(va, c0364Ny);
    }

    @Override // o.SW
    public final boolean a() {
        switch (this.c) {
        }
        return true;
    }

    @Override // o.AbstractC1664p, o.SW
    public final InterfaceC2364zb c() {
        switch (this.c) {
            case 0:
                return (C0581Wh) this.e;
            default:
                return (C0390Oy) this.e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0108, code lost:
    
        if (r6 == null) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x025c  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v31 */
    @Override // o.AbstractC1205i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection e() {
        Class cls;
        ?? arrayList;
        String str;
        C2245xo c2245xo;
        C2245xo c2245xo2;
        ArrayList arrayList2;
        JR q;
        int i = this.c;
        AbstractC1598o abstractC1598o = this.e;
        switch (i) {
            case 0:
                C0581Wh c0581Wh = (C0581Wh) abstractC1598o;
                C1030fK c1030fK = c0581Wh.l;
                C0321Mh c0321Mh = c0581Wh.s;
                C0695aD c0695aD = c0321Mh.d;
                AbstractC0048Bt.n(c1030fK, "<this>");
                List list = c1030fK.f164o;
                boolean isEmpty = list.isEmpty();
                ?? r14 = list;
                if (isEmpty) {
                    r14 = 0;
                }
                if (r14 == 0) {
                    List<Integer> list2 = c1030fK.p;
                    AbstractC0048Bt.m(list2, "supertypeIdList");
                    r14 = new ArrayList(AbstractC0786bc.d0(list2));
                    for (Integer num : list2) {
                        AbstractC0048Bt.m(num, "it");
                        r14.add(c0695aD.a(num.intValue()));
                    }
                }
                ArrayList arrayList3 = new ArrayList(AbstractC0786bc.d0(r14));
                Iterator it = r14.iterator();
                while (it.hasNext()) {
                    arrayList3.add(c0321Mh.h.g((MK) it.next()));
                }
                ArrayList A0 = AbstractC0720ac.A0(arrayList3, c0321Mh.a.n.f(c0581Wh));
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = A0.iterator();
                while (it2.hasNext()) {
                    InterfaceC2364zb c = ((AbstractC1004ey) it2.next()).B0().c();
                    UE ue = c instanceof UE ? (UE) c : null;
                    if (ue != null) {
                        arrayList4.add(ue);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    InterfaceC0143Fk interfaceC0143Fk = c0321Mh.a.h;
                    ArrayList arrayList5 = new ArrayList(AbstractC0786bc.d0(arrayList4));
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        UE ue2 = (UE) it3.next();
                        C1639ob f = AbstractC0192Hh.f(ue2);
                        arrayList5.add(f != null ? f.b().b() : ue2.getName().b());
                    }
                    interfaceC0143Fk.i(c0581Wh, arrayList5);
                }
                return AbstractC0720ac.J0(A0);
            default:
                C0390Oy c0390Oy = (C0390Oy) abstractC1598o;
                C1216i8 c1216i8 = c0390Oy.q;
                Class cls2 = c0390Oy.f79o.a;
                cls = Object.class;
                boolean h = AbstractC0048Bt.h(cls2, cls);
                C1318jk c1318jk = C1318jk.h;
                if (h) {
                    arrayList = c1318jk;
                } else {
                    C1621oJ c1621oJ = new C1621oJ(2);
                    Type genericSuperclass = cls2.getGenericSuperclass();
                    c1621oJ.b(genericSuperclass != null ? genericSuperclass : Object.class);
                    Type[] genericInterfaces = cls2.getGenericInterfaces();
                    AbstractC0048Bt.m(genericInterfaces, "klass.genericInterfaces");
                    c1621oJ.c(genericInterfaces);
                    ArrayList arrayList6 = c1621oJ.a;
                    List K = AbstractC0868ct.K(arrayList6.toArray(new Type[arrayList6.size()]));
                    arrayList = new ArrayList(AbstractC0786bc.d0(K));
                    Iterator it4 = K.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(new C2349zM((Type) it4.next()));
                    }
                }
                ArrayList arrayList7 = new ArrayList(arrayList.size());
                ArrayList arrayList8 = new ArrayList(0);
                C0338My c0338My = c0390Oy.B;
                C2245xo c2245xo3 = AbstractC0438Qu.n;
                AbstractC0048Bt.m(c2245xo3, "PURELY_IMPLEMENTS_ANNOTATION");
                InterfaceC0948e4 c2 = c0338My.c(c2245xo3);
                int i2 = 1;
                if (c2 != null) {
                    Object E0 = AbstractC0720ac.E0(c2.f().values());
                    ST st = E0 instanceof ST ? (ST) E0 : null;
                    if (st != null && (str = (String) st.a) != null) {
                        int i3 = 0;
                        int i4 = 1;
                        while (true) {
                            if (i3 < str.length()) {
                                char charAt = str.charAt(i3);
                                int v = AbstractC1888sN.v(i4);
                                if (v != 0) {
                                    if (v != 1) {
                                        if (v != 2) {
                                            continue;
                                        }
                                    } else if (charAt == '.') {
                                        i4 = 3;
                                    } else if (!Character.isJavaIdentifierPart(charAt)) {
                                    }
                                    i3++;
                                }
                                if (Character.isJavaIdentifierStart(charAt)) {
                                    i4 = 2;
                                    i3++;
                                }
                            } else {
                                c2245xo = i4 != 3 ? new C2245xo(str) : null;
                            }
                        }
                    }
                }
                if (c2245xo == null || c2245xo.d() || !c2245xo.h(AbstractC1499mT.i)) {
                    c2245xo = null;
                }
                if (c2245xo == null) {
                    LinkedHashMap linkedHashMap = AbstractC0040Bl.a;
                    c2245xo2 = (C2245xo) AbstractC0040Bl.b.get(AbstractC0192Hh.g(c0390Oy));
                    break;
                } else {
                    c2245xo2 = c2245xo;
                }
                InterfaceC0761bD interfaceC0761bD = ((C1198hu) c1216i8.i).f177o;
                int i5 = AbstractC0192Hh.a;
                AbstractC0048Bt.n(interfaceC0761bD, "<this>");
                c2245xo2.d();
                C1531mz c1531mz = ((C1465lz) interfaceC0761bD.S(c2245xo2.e())).n;
                C0827cE f2 = c2245xo2.f();
                AbstractC0048Bt.m(f2, "topLevelClassFqName.shortName()");
                InterfaceC2364zb g = c1531mz.g(f2, DE.f27o);
                InterfaceC1245ib interfaceC1245ib = g instanceof InterfaceC1245ib ? (InterfaceC1245ib) g : null;
                if (interfaceC1245ib != null) {
                    int size = interfaceC1245ib.z().getParameters().size();
                    List parameters = c0390Oy.w.getParameters();
                    AbstractC0048Bt.m(parameters, "getTypeConstructor().parameters");
                    int size2 = parameters.size();
                    if (size2 == size) {
                        arrayList2 = new ArrayList(AbstractC0786bc.d0(parameters));
                        Iterator it5 = parameters.iterator();
                        while (it5.hasNext()) {
                            arrayList2.add(new C1767qX(1, ((InterfaceC1437lX) it5.next()).i()));
                        }
                    } else if (size2 == 1 && size > 1 && c2245xo == null) {
                        C1767qX c1767qX = new C1767qX(1, ((InterfaceC1437lX) AbstractC0720ac.D0(parameters)).i());
                        C1197ht c1197ht = new C1197ht(1, size, 1);
                        ArrayList arrayList9 = new ArrayList(AbstractC0786bc.d0(c1197ht));
                        Iterator it6 = c1197ht.iterator();
                        while (((C1131gt) it6).j) {
                            ((C1131gt) it6).nextInt();
                            arrayList9.add(c1767qX);
                        }
                        arrayList2 = arrayList9;
                    }
                    OW.i.getClass();
                    q = HO.q(OW.j, interfaceC1245ib, arrayList2);
                    for (C2349zM c2349zM : arrayList) {
                        AbstractC1004ey S = ((C0950e6) c1216i8.m).S(c2349zM, AbstractC1305jX.J(i2, false, null, 7));
                        C0218Ih c0218Ih = ((C1198hu) c1216i8.i).r;
                        c0218Ih.getClass();
                        int i6 = i2;
                        AbstractC1004ey l = c0218Ih.l(new DR(null, false, c1216i8, EnumC1212i4.l, true), S, c1318jk, null, false);
                        if (l == null) {
                            l = S;
                        }
                        if (l.B0().c() instanceof UE) {
                            arrayList8.add(c2349zM);
                        }
                        if (!AbstractC0048Bt.h(l.B0(), q != null ? q.B0() : null) && !AbstractC0545Ux.x(l)) {
                            arrayList7.add(l);
                        }
                        i2 = i6;
                    }
                    int i7 = i2;
                    InterfaceC1245ib interfaceC1245ib2 = c0390Oy.p;
                    AbstractC1052fg.e(arrayList7, interfaceC1245ib2 == null ? new C2096vX(AbstractC0048Bt.C(interfaceC1245ib2, c0390Oy)).i(i7, interfaceC1245ib2.i()) : null);
                    AbstractC1052fg.e(arrayList7, q);
                    if (!arrayList8.isEmpty()) {
                        InterfaceC0143Fk interfaceC0143Fk2 = ((C1198hu) c1216i8.i).f;
                        ArrayList arrayList10 = new ArrayList(AbstractC0786bc.d0(arrayList8));
                        Iterator it7 = arrayList8.iterator();
                        while (it7.hasNext()) {
                            InterfaceC1526mu interfaceC1526mu = (InterfaceC1526mu) it7.next();
                            AbstractC0048Bt.l(interfaceC1526mu, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                            arrayList10.add(((C2349zM) interfaceC1526mu).a.toString());
                        }
                        interfaceC0143Fk2.i(c0390Oy, arrayList10);
                    }
                    return arrayList7.isEmpty() ? AbstractC0720ac.J0(arrayList7) : AbstractC0868ct.J(((C1198hu) c1216i8.i).f177o.l().e());
                }
                q = null;
                while (r4.hasNext()) {
                }
                int i72 = i2;
                InterfaceC1245ib interfaceC1245ib22 = c0390Oy.p;
                AbstractC1052fg.e(arrayList7, interfaceC1245ib22 == null ? new C2096vX(AbstractC0048Bt.C(interfaceC1245ib22, c0390Oy)).i(i72, interfaceC1245ib22.i()) : null);
                AbstractC1052fg.e(arrayList7, q);
                if (!arrayList8.isEmpty()) {
                }
                if (arrayList7.isEmpty()) {
                }
                break;
        }
    }

    @Override // o.AbstractC1205i0
    public final C1097gL g() {
        switch (this.c) {
            case 0:
                return C1097gL.m;
            default:
                return ((C1198hu) ((C0390Oy) this.e).q.i).m;
        }
    }

    @Override // o.SW
    public final List getParameters() {
        switch (this.c) {
        }
        return (List) this.d.invoke();
    }

    @Override // o.AbstractC1664p
    /* renamed from: m */
    public final InterfaceC1245ib c() {
        switch (this.c) {
            case 0:
                return (C0581Wh) this.e;
            default:
                return (C0390Oy) this.e;
        }
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                String str = ((C0581Wh) this.e).getName().h;
                AbstractC0048Bt.m(str, "name.toString()");
                return str;
            default:
                String b = ((C0390Oy) this.e).getName().b();
                AbstractC0048Bt.m(b, "name.asString()");
                return b;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0555Vh(C0581Wh c0581Wh) {
        super(r0.a.a);
        this.e = c0581Wh;
        C0321Mh c0321Mh = c0581Wh.s;
        VA va = c0321Mh.a.a;
        C0529Uh c0529Uh = new C0529Uh(c0581Wh, 0);
        va.getClass();
        this.d = new SA(va, c0529Uh);
    }
}
