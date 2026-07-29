package o;

import android.graphics.Typeface;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;

/* renamed from: o.Ih, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218Ih implements UL, InterfaceC2374zl, IE, InterfaceC1523mr, InterfaceC2015uI, InterfaceC2346zJ {
    public final /* synthetic */ int h;

    public /* synthetic */ C0218Ih(int i) {
        this.h = i;
    }

    public static final TS e(String str, String str2, String str3, String str4) {
        ArrayList arrayList = WS.a;
        C0827cE e = C0827cE.e(str2);
        String str5 = str2 + '(' + str3 + ')' + str4;
        AbstractC0048Bt.n(str, "internalName");
        AbstractC0048Bt.n(str5, "jvmDescriptor");
        return new TS(e, str + '.' + str5);
    }

    public static AbstractC1701pX f(InterfaceC1437lX interfaceC1437lX, C1658ou c1658ou, C0208Hx c0208Hx, AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(c1658ou, "typeAttr");
        AbstractC0048Bt.n(c0208Hx, "typeParameterUpperBoundEraser");
        if (!c1658ou.c) {
            c1658ou = c1658ou.b(1);
        }
        int v = AbstractC1888sN.v(c1658ou.b);
        if (v != 0 && v != 1) {
            if (v == 2) {
                return new C1767qX(1, abstractC1004ey);
            }
            throw new C0057Cc();
        }
        int Y = interfaceC1437lX.Y();
        boolean z = true;
        if (Y != 1) {
            if (Y == 2) {
                z = false;
            } else if (Y != 3) {
                throw null;
            }
        }
        if (!z) {
            return new C1767qX(1, AbstractC0192Hh.e(interfaceC1437lX).n());
        }
        List parameters = abstractC1004ey.B0().getParameters();
        AbstractC0048Bt.m(parameters, "erasedUpperBound.constructor.parameters");
        return !parameters.isEmpty() ? new C1767qX(3, abstractC1004ey) : AbstractC2228xX.k(interfaceC1437lX, c1658ou);
    }

    public static Typeface g(String str, C1586no c1586no, int i) {
        Typeface create;
        if (i == 0 && AbstractC0048Bt.h(c1586no, C1586no.j) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        create = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), c1586no.h, i == 1);
        return create;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0219  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1006f o(JR jr, C0810c0 c0810c0, int i, int i2, boolean z, boolean z2) {
        InterfaceC1245ib interfaceC1245ib;
        Boolean bool;
        SW B0;
        int i3;
        Iterator it;
        ArrayList arrayList;
        int i4;
        int size;
        C1143h2 c1143h2;
        AbstractC1004ey abstractC1004ey;
        AbstractC1701pX j;
        AbstractC1888sN.p(i2, "<this>");
        ?? r4 = 0;
        int i5 = 1;
        boolean z3 = i2 != 3;
        boolean z4 = (z2 && z) ? false : true;
        Object obj = null;
        if (!z3 && jr.w0().isEmpty()) {
            return new C1006f(null, 1, false);
        }
        InterfaceC2364zb c = jr.B0().c();
        if (c == null) {
            return new C1006f(null, 1, false);
        }
        C1921su c1921su = (C1921su) c0810c0.invoke(Integer.valueOf(i));
        C1803r4 c1803r4 = AbstractC0781bX.a;
        AbstractC1888sN.p(i2, "<this>");
        if (i2 != 3 && (c instanceof InterfaceC1245ib)) {
            if (c1921su.b == EnumC2010uD.h && i2 == 1) {
                InterfaceC1245ib interfaceC1245ib2 = (InterfaceC1245ib) c;
                String str = C1460lu.a;
                C2377zo g = AbstractC0114Eh.g(interfaceC1245ib2);
                HashMap hashMap = C1460lu.j;
                if (hashMap.containsKey(g)) {
                    C2245xo c2245xo = (C2245xo) hashMap.get(AbstractC0114Eh.g(interfaceC1245ib2));
                    if (c2245xo == null) {
                        throw new IllegalArgumentException("Given class " + interfaceC1245ib2 + " is not a mutable collection");
                    }
                    interfaceC1245ib = AbstractC0192Hh.e(interfaceC1245ib2).i(c2245xo);
                    AbstractC1888sN.p(i2, "<this>");
                    if (i2 != 3) {
                        EnumC2078vF enumC2078vF = c1921su.a;
                        int i6 = enumC2078vF == null ? -1 : AbstractC0715aX.a[enumC2078vF.ordinal()];
                        if (i6 == 1) {
                            bool = Boolean.TRUE;
                        } else if (i6 == 2) {
                            bool = Boolean.FALSE;
                        }
                        if (interfaceC1245ib != null || (B0 = interfaceC1245ib.z()) == null) {
                            B0 = jr.B0();
                        }
                        AbstractC0048Bt.m(B0, "enhancedClassifier?.typeConstructor ?: constructor");
                        i3 = i + 1;
                        List w0 = jr.w0();
                        List parameters = B0.getParameters();
                        AbstractC0048Bt.m(parameters, "typeConstructor.parameters");
                        it = parameters.iterator();
                        arrayList = new ArrayList(Math.min(AbstractC0786bc.d0(w0), AbstractC0786bc.d0(parameters)));
                        while (r15.hasNext() && it.hasNext()) {
                            InterfaceC1437lX interfaceC1437lX = (InterfaceC1437lX) it.next();
                            AbstractC1701pX abstractC1701pX = (AbstractC1701pX) r13;
                            if (z4) {
                                c1143h2 = new C1143h2((int) r4, obj);
                            } else if (!abstractC1701pX.c()) {
                                c1143h2 = p(abstractC1701pX.b().E0(), c0810c0, i3, z2);
                            } else if (((C1921su) c0810c0.invoke(Integer.valueOf(i3))).a == EnumC2078vF.h) {
                                AbstractC2097vY E0 = abstractC1701pX.b().E0();
                                c1143h2 = new C1143h2(1, HO.m(AbstractC0868ct.M(E0).F0(r4), AbstractC0868ct.a0(E0).F0(true)));
                            } else {
                                c1143h2 = new C1143h2(i5, (Object) null);
                            }
                            i3 += c1143h2.h;
                            abstractC1004ey = (AbstractC1004ey) c1143h2.i;
                            if (abstractC1004ey == null) {
                                int a = abstractC1701pX.a();
                                AbstractC1888sN.t(a, "arg.projectionKind");
                                j = AbstractC0772bO.f(abstractC1004ey, a, interfaceC1437lX);
                            } else if (interfaceC1245ib == null || abstractC1701pX.c()) {
                                j = interfaceC1245ib != null ? AbstractC2228xX.j(interfaceC1437lX) : null;
                            } else {
                                AbstractC1004ey b = abstractC1701pX.b();
                                AbstractC0048Bt.m(b, "arg.type");
                                int a2 = abstractC1701pX.a();
                                AbstractC1888sN.t(a2, "arg.projectionKind");
                                j = AbstractC0772bO.f(b, a2, interfaceC1437lX);
                            }
                            arrayList.add(j);
                            r4 = 0;
                            i5 = 1;
                            obj = null;
                        }
                        i4 = i3 - i;
                        if (interfaceC1245ib == null && bool == null) {
                            if (!arrayList.isEmpty()) {
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    if (((AbstractC1701pX) it2.next()) == null) {
                                    }
                                }
                            }
                            return new C1006f(null, i4, false);
                        }
                        InterfaceC1738q4 annotations = jr.getAnnotations();
                        C1803r4 c1803r42 = AbstractC0781bX.b;
                        if (interfaceC1245ib == null) {
                            c1803r42 = null;
                        }
                        int i7 = 1;
                        ArrayList i0 = P6.i0(new InterfaceC1738q4[]{annotations, c1803r42, bool == null ? AbstractC0781bX.a : null});
                        size = i0.size();
                        if (size != 0) {
                            throw new IllegalStateException("At least one Annotations object expected");
                        }
                        OW m = AbstractC1494mO.m(size != 1 ? new C1803r4(i7, AbstractC0720ac.J0(i0)) : (InterfaceC1738q4) AbstractC0720ac.D0(i0));
                        List w02 = jr.w0();
                        Iterator it3 = arrayList.iterator();
                        Iterator it4 = w02.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(AbstractC0786bc.d0(arrayList), AbstractC0786bc.d0(w02)));
                        while (it3.hasNext() && it4.hasNext()) {
                            Object next = it3.next();
                            AbstractC1701pX abstractC1701pX2 = (AbstractC1701pX) it4.next();
                            AbstractC1701pX abstractC1701pX3 = (AbstractC1701pX) next;
                            if (abstractC1701pX3 != null) {
                                abstractC1701pX2 = abstractC1701pX3;
                            }
                            arrayList2.add(abstractC1701pX2);
                        }
                        JR r = HO.r(arrayList2, m, B0, bool != null ? bool.booleanValue() : jr.C0());
                        if (c1921su.c) {
                            r = new ZE(r);
                        }
                        return new C1006f(r, i4, bool != null && c1921su.d);
                    }
                    bool = null;
                    if (interfaceC1245ib != null) {
                    }
                    B0 = jr.B0();
                    AbstractC0048Bt.m(B0, "enhancedClassifier?.typeConstructor ?: constructor");
                    i3 = i + 1;
                    List w03 = jr.w0();
                    List parameters2 = B0.getParameters();
                    AbstractC0048Bt.m(parameters2, "typeConstructor.parameters");
                    it = parameters2.iterator();
                    arrayList = new ArrayList(Math.min(AbstractC0786bc.d0(w03), AbstractC0786bc.d0(parameters2)));
                    for (Object obj2 : w03) {
                        InterfaceC1437lX interfaceC1437lX2 = (InterfaceC1437lX) it.next();
                        AbstractC1701pX abstractC1701pX4 = (AbstractC1701pX) obj2;
                        if (z4) {
                        }
                        i3 += c1143h2.h;
                        abstractC1004ey = (AbstractC1004ey) c1143h2.i;
                        if (abstractC1004ey == null) {
                        }
                        arrayList.add(j);
                        r4 = 0;
                        i5 = 1;
                        obj = null;
                    }
                    i4 = i3 - i;
                    if (interfaceC1245ib == null) {
                        if (!arrayList.isEmpty()) {
                        }
                        return new C1006f(null, i4, false);
                    }
                    InterfaceC1738q4 annotations2 = jr.getAnnotations();
                    C1803r4 c1803r422 = AbstractC0781bX.b;
                    if (interfaceC1245ib == null) {
                    }
                    int i72 = 1;
                    ArrayList i02 = P6.i0(new InterfaceC1738q4[]{annotations2, c1803r422, bool == null ? AbstractC0781bX.a : null});
                    size = i02.size();
                    if (size != 0) {
                    }
                }
            }
            if (c1921su.b == EnumC2010uD.i && i2 == 2) {
                InterfaceC1245ib interfaceC1245ib3 = (InterfaceC1245ib) c;
                String str2 = C1460lu.a;
                if (C1460lu.k.containsKey(AbstractC0114Eh.g(interfaceC1245ib3))) {
                    interfaceC1245ib = HO.j(interfaceC1245ib3);
                    AbstractC1888sN.p(i2, "<this>");
                    if (i2 != 3) {
                    }
                    bool = null;
                    if (interfaceC1245ib != null) {
                    }
                    B0 = jr.B0();
                    AbstractC0048Bt.m(B0, "enhancedClassifier?.typeConstructor ?: constructor");
                    i3 = i + 1;
                    List w032 = jr.w0();
                    List parameters22 = B0.getParameters();
                    AbstractC0048Bt.m(parameters22, "typeConstructor.parameters");
                    it = parameters22.iterator();
                    arrayList = new ArrayList(Math.min(AbstractC0786bc.d0(w032), AbstractC0786bc.d0(parameters22)));
                    while (r15.hasNext()) {
                    }
                    i4 = i3 - i;
                    if (interfaceC1245ib == null) {
                    }
                    InterfaceC1738q4 annotations22 = jr.getAnnotations();
                    C1803r4 c1803r4222 = AbstractC0781bX.b;
                    if (interfaceC1245ib == null) {
                    }
                    int i722 = 1;
                    ArrayList i022 = P6.i0(new InterfaceC1738q4[]{annotations22, c1803r4222, bool == null ? AbstractC0781bX.a : null});
                    size = i022.size();
                    if (size != 0) {
                    }
                }
            }
        }
        interfaceC1245ib = null;
        AbstractC1888sN.p(i2, "<this>");
        if (i2 != 3) {
        }
        bool = null;
        if (interfaceC1245ib != null) {
        }
        B0 = jr.B0();
        AbstractC0048Bt.m(B0, "enhancedClassifier?.typeConstructor ?: constructor");
        i3 = i + 1;
        List w0322 = jr.w0();
        List parameters222 = B0.getParameters();
        AbstractC0048Bt.m(parameters222, "typeConstructor.parameters");
        it = parameters222.iterator();
        arrayList = new ArrayList(Math.min(AbstractC0786bc.d0(w0322), AbstractC0786bc.d0(parameters222)));
        while (r15.hasNext()) {
        }
        i4 = i3 - i;
        if (interfaceC1245ib == null) {
        }
        InterfaceC1738q4 annotations222 = jr.getAnnotations();
        C1803r4 c1803r42222 = AbstractC0781bX.b;
        if (interfaceC1245ib == null) {
        }
        int i7222 = 1;
        ArrayList i0222 = P6.i0(new InterfaceC1738q4[]{annotations222, c1803r42222, bool == null ? AbstractC0781bX.a : null});
        size = i0222.size();
        if (size != 0) {
        }
    }

    public static C1143h2 p(AbstractC2097vY abstractC2097vY, C0810c0 c0810c0, int i, boolean z) {
        AbstractC1004ey abstractC1004ey;
        Object obj = null;
        if (AbstractC1473m3.P(abstractC2097vY)) {
            return new C1143h2(1, obj);
        }
        if (!(abstractC2097vY instanceof AbstractC1782qm)) {
            if (!(abstractC2097vY instanceof JR)) {
                throw new C0057Cc();
            }
            C1006f o2 = o((JR) abstractC2097vY, c0810c0, i, 3, false, z);
            AbstractC1004ey abstractC1004ey2 = (JR) o2.c;
            if (o2.b) {
                abstractC1004ey2 = AbstractC1494mO.n(abstractC2097vY, abstractC1004ey2);
            }
            return new C1143h2(o2.a, abstractC1004ey2);
        }
        boolean z2 = abstractC2097vY instanceof C2216xL;
        AbstractC1782qm abstractC1782qm = (AbstractC1782qm) abstractC2097vY;
        JR jr = abstractC1782qm.j;
        JR jr2 = abstractC1782qm.i;
        C1006f o3 = o(abstractC1782qm.i, c0810c0, i, 1, z2, z);
        C1006f o4 = o(abstractC1782qm.j, c0810c0, i, 2, z2, z);
        JR jr3 = (JR) o4.c;
        JR jr4 = (JR) o3.c;
        if (jr4 != null || jr3 != null) {
            if (o3.b || o4.b) {
                if (jr3 != null) {
                    if (jr4 == null) {
                        jr4 = jr3;
                    }
                    abstractC1004ey = HO.m(jr4, jr3);
                } else {
                    AbstractC0048Bt.k(jr4);
                    abstractC1004ey = jr4;
                }
                obj = AbstractC1494mO.n(abstractC2097vY, abstractC1004ey);
            } else if (z2) {
                if (jr4 != null) {
                    jr2 = jr4;
                }
                if (jr3 != null) {
                    jr = jr3;
                }
                obj = new C2216xL(jr2, jr);
            } else {
                if (jr4 != null) {
                    jr2 = jr4;
                }
                if (jr3 != null) {
                    jr = jr3;
                }
                obj = HO.m(jr2, jr);
            }
        }
        return new C1143h2(o3.a, obj);
    }

    public static CH r(String str, boolean z) {
        AbstractC0048Bt.n(str, "<this>");
        C1347k9 c1347k9 = AbstractC0809c.a;
        G8 g8 = new G8();
        g8.S(str);
        return AbstractC0809c.d(g8, z);
    }

    public static CH s(File file) {
        String str = CH.i;
        String file2 = file.toString();
        AbstractC0048Bt.m(file2, "toString(...)");
        return r(file2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0278Kp t(String str, C2245xo c2245xo) {
        EnumC0304Lp enumC0304Lp;
        Integer valueOf;
        AbstractC0048Bt.n(c2245xo, "packageFqName");
        EnumC0304Lp[] values = EnumC0304Lp.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                enumC0304Lp = null;
                break;
            }
            enumC0304Lp = values[i];
            if (AbstractC0048Bt.h(enumC0304Lp.h, c2245xo) && AbstractC0778bU.B(str, enumC0304Lp.i, false)) {
                break;
            }
            i++;
        }
        if (enumC0304Lp != null) {
            String substring = str.substring(enumC0304Lp.i.length());
            AbstractC0048Bt.m(substring, "this as java.lang.String).substring(startIndex)");
            if (substring.length() != 0) {
                int length2 = substring.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length2; i3++) {
                    int charAt = substring.charAt(i3) - '0';
                    if (charAt >= 0 && charAt < 10) {
                        i2 = (i2 * 10) + charAt;
                    }
                }
                valueOf = Integer.valueOf(i2);
                if (valueOf != null) {
                    return new C0278Kp(enumC0304Lp, valueOf.intValue());
                }
            }
            valueOf = null;
            if (valueOf != null) {
            }
        }
        return null;
    }

    @Override // o.IE
    public int b() {
        return 8;
    }

    @Override // o.UL
    public AbstractC1004ey c() {
        switch (this.h) {
            case 0:
                throw new IllegalStateException("This method should not be called");
            default:
                throw new IllegalStateException("This method should not be called");
        }
    }

    @Override // o.IE
    public boolean d(C0027Ay c0027Ay) {
        C2023uQ i = c0027Ay.i();
        boolean z = false;
        if (i != null && i.j) {
            z = true;
        }
        return !z;
    }

    @Override // o.InterfaceC1557nL
    public Object get() {
        switch (this.h) {
            case 4:
                return new ExecutorC0729al(1, Executors.newSingleThreadExecutor());
            default:
                CU cu = new CU();
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(EnumC1489mJ.h, new E7(30000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(EnumC1489mJ.j, new E7(1000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(EnumC0708aQ.i)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(EnumC1489mJ.i, new E7(86400000L, 86400000L, unmodifiableSet));
                if (hashMap.keySet().size() < EnumC1489mJ.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new D7(cu, hashMap);
        }
    }

    public AbstractC1004ey i(InterfaceC2204x9 interfaceC2204x9, InterfaceC2072v9 interfaceC2072v9, boolean z, C1216i8 c1216i8, EnumC1212i4 enumC1212i4, ZW zw, boolean z2, InterfaceC2114vp interfaceC2114vp) {
        DR dr = new DR(interfaceC2072v9, z, c1216i8, enumC1212i4, false);
        AbstractC1004ey abstractC1004ey = (AbstractC1004ey) interfaceC2114vp.invoke(interfaceC2204x9);
        Collection o2 = interfaceC2204x9.o();
        AbstractC0048Bt.m(o2, "overriddenDescriptors");
        Collection<InterfaceC2204x9> collection = o2;
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(collection));
        for (InterfaceC2204x9 interfaceC2204x92 : collection) {
            AbstractC0048Bt.m(interfaceC2204x92, "it");
            arrayList.add((AbstractC1004ey) interfaceC2114vp.invoke(interfaceC2204x92));
        }
        return l(dr, abstractC1004ey, arrayList, zw, z2);
    }

    @Override // o.InterfaceC2015uI
    public Typeface k(C1586no c1586no, int i) {
        return g(null, c1586no, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:235:0x0272, code lost:
    
        if (r14 == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0277, code lost:
    
        if (r14 == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0285, code lost:
    
        if (r3.compareTo(r10) <= 0) goto L177;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0407 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0329 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0380  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC1004ey l(DR dr, AbstractC1004ey abstractC1004ey, List list, ZW zw, boolean z) {
        int size;
        InterfaceC1437lX interfaceC1437lX;
        boolean z2;
        Iterable iterable;
        boolean z3;
        Iterable iterable2;
        EnumC1212i4 enumC1212i4;
        C1216i8 c1216i8;
        C1921su[] c1921suArr;
        InterfaceC1437lX interfaceC1437lX2;
        EnumC2078vF enumC2078vF;
        C2144wF c2144wF;
        C2144wF c2144wF2;
        boolean z4;
        C1921su c1921su;
        C2144wF b;
        C1408l4 c1408l4;
        C2144wF c2144wF3;
        C2144wF c2144wF4;
        boolean z5;
        EnumC2010uD enumC2010uD;
        SW a;
        Iterator it;
        Iterator it2;
        EnumC2078vF enumC2078vF2;
        Iterator it3;
        EnumC2078vF enumC2078vF3;
        boolean z6;
        C1921su c1921su2;
        InterfaceC1266iy interfaceC1266iy;
        EnumC2078vF enumC2078vF4;
        int i;
        DR dr2 = dr;
        W3 w3 = dr2.a;
        C1216i8 c1216i82 = dr2.c;
        C1097gL c1097gL = C1097gL.k;
        boolean z7 = dr2.b;
        AbstractC0048Bt.n(abstractC1004ey, "<this>");
        ArrayList e = dr.e(abstractC1004ey);
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(list));
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            arrayList.add(dr2.e((InterfaceC1266iy) it4.next()));
        }
        if (z7 && !list.isEmpty()) {
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                InterfaceC1266iy interfaceC1266iy2 = (InterfaceC1266iy) it5.next();
                AbstractC0048Bt.n(interfaceC1266iy2, "other");
                if (!((AE) ((C1198hu) c1216i82.i).u).a(abstractC1004ey, (AbstractC1004ey) interfaceC1266iy2)) {
                    size = 1;
                    break;
                }
            }
        }
        size = e.size();
        C1921su[] c1921suArr2 = new C1921su[size];
        int i2 = 0;
        while (i2 < size) {
            C0745b0 c0745b0 = (C0745b0) e.get(i2);
            EnumC1212i4 enumC1212i42 = dr2.d;
            InterfaceC1266iy interfaceC1266iy3 = c0745b0.a;
            InterfaceC1437lX interfaceC1437lX3 = c0745b0.c;
            EnumC2078vF enumC2078vF5 = EnumC2078vF.h;
            EnumC2078vF enumC2078vF6 = EnumC2078vF.i;
            boolean z8 = z7;
            EnumC2078vF enumC2078vF7 = EnumC2078vF.j;
            ArrayList arrayList2 = e;
            EnumC2010uD enumC2010uD2 = EnumC2010uD.i;
            ArrayList arrayList3 = arrayList;
            EnumC2010uD enumC2010uD3 = EnumC2010uD.h;
            int i3 = size;
            if (interfaceC1266iy3 == null) {
                if (interfaceC1437lX3 != null) {
                    int Y = interfaceC1437lX3.Y();
                    interfaceC1437lX = interfaceC1437lX3;
                    AbstractC1888sN.t(Y, "this.variance");
                    i = ON.f(Y);
                } else {
                    interfaceC1437lX = interfaceC1437lX3;
                    i = 0;
                }
                if (i == 1) {
                    c1921su = C1921su.e;
                    c1216i8 = c1216i82;
                    c1921suArr = c1921suArr2;
                    ArrayList arrayList4 = new ArrayList();
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                        C0745b0 c0745b02 = (C0745b0) AbstractC0720ac.q0(i2, (List) it.next());
                        if (c0745b02 == null || (interfaceC1266iy = c0745b02.a) == null) {
                            c1921su2 = null;
                        } else {
                            EnumC2078vF d = DR.d(interfaceC1266iy);
                            if (d == null) {
                                AbstractC1004ey e2 = AbstractC1494mO.e((AbstractC1004ey) interfaceC1266iy);
                                enumC2078vF4 = e2 != null ? DR.d(e2) : null;
                            } else {
                                enumC2078vF4 = d;
                            }
                            String str = C1460lu.a;
                            c1921su2 = new C1921su(enumC2078vF4, C1460lu.k.containsKey(DR.c(c1097gL.b(interfaceC1266iy))) ? enumC2010uD3 : C1460lu.j.containsKey(DR.c(c1097gL.j0(interfaceC1266iy))) ? enumC2010uD2 : null, c1097gL.N(interfaceC1266iy) || (((AbstractC1004ey) interfaceC1266iy).E0() instanceof ZE), enumC2078vF4 != d);
                        }
                        if (c1921su2 != null) {
                            arrayList4.add(c1921su2);
                        }
                    }
                    boolean z9 = i2 != 0 && z8;
                    boolean z10 = (i2 == 0 || !(w3 instanceof RY) || ((RY) w3).q == null) ? false : true;
                    EnumC2078vF enumC2078vF8 = c1921su.a;
                    ArrayList arrayList5 = new ArrayList();
                    it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        C1921su c1921su3 = (C1921su) it2.next();
                        ArrayList arrayList6 = arrayList4;
                        EnumC2078vF enumC2078vF9 = c1921su3.d ? null : c1921su3.a;
                        if (enumC2078vF9 != null) {
                            arrayList5.add(enumC2078vF9);
                        }
                        arrayList4 = arrayList6;
                    }
                    ArrayList arrayList7 = arrayList4;
                    Set M0 = AbstractC0720ac.M0(arrayList5);
                    EnumC2078vF enumC2078vF10 = !c1921su.d ? null : enumC2078vF8;
                    enumC2078vF2 = enumC2078vF10 != enumC2078vF5 ? enumC2078vF5 : (EnumC2078vF) AbstractC0773bP.h(M0, enumC2078vF7, enumC2078vF6, enumC2078vF10, z9);
                    if (enumC2078vF2 != null) {
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it6 = arrayList7.iterator();
                        while (it6.hasNext()) {
                            EnumC2078vF enumC2078vF11 = ((C1921su) it6.next()).a;
                            if (enumC2078vF11 != null) {
                                arrayList8.add(enumC2078vF11);
                            }
                        }
                        Set M02 = AbstractC0720ac.M0(arrayList8);
                        if (enumC2078vF8 != enumC2078vF5) {
                            enumC2078vF5 = (EnumC2078vF) AbstractC0773bP.h(M02, enumC2078vF7, enumC2078vF6, enumC2078vF8, z9);
                        }
                    } else {
                        enumC2078vF5 = enumC2078vF2;
                    }
                    ArrayList arrayList9 = new ArrayList();
                    it3 = arrayList7.iterator();
                    while (it3.hasNext()) {
                        EnumC2010uD enumC2010uD4 = ((C1921su) it3.next()).b;
                        if (enumC2010uD4 != null) {
                            arrayList9.add(enumC2010uD4);
                        }
                    }
                    EnumC2010uD enumC2010uD5 = (EnumC2010uD) AbstractC0773bP.h(AbstractC0720ac.M0(arrayList9), enumC2010uD2, enumC2010uD3, c1921su.b, z9);
                    enumC2078vF3 = (enumC2078vF5 != null || z || (z10 && enumC2078vF5 == enumC2078vF6)) ? null : enumC2078vF5;
                    if (enumC2078vF3 == enumC2078vF7) {
                        if (!c1921su.c) {
                            if (!arrayList7.isEmpty()) {
                                Iterator it7 = arrayList7.iterator();
                                while (it7.hasNext()) {
                                    if (((C1921su) it7.next()).c) {
                                    }
                                }
                            }
                        }
                        z6 = true;
                        c1921suArr[i2] = new C1921su(enumC2078vF3, enumC2010uD5, z6, enumC2078vF3 == null && enumC2078vF2 != enumC2078vF5);
                        i2++;
                        dr2 = dr;
                        z7 = z8;
                        e = arrayList2;
                        arrayList = arrayList3;
                        size = i3;
                        c1216i82 = c1216i8;
                        c1921suArr2 = c1921suArr;
                    }
                    z6 = false;
                    c1921suArr[i2] = new C1921su(enumC2078vF3, enumC2010uD5, z6, enumC2078vF3 == null && enumC2078vF2 != enumC2078vF5);
                    i2++;
                    dr2 = dr;
                    z7 = z8;
                    e = arrayList2;
                    arrayList = arrayList3;
                    size = i3;
                    c1216i82 = c1216i8;
                    c1921suArr2 = c1921suArr;
                }
            } else {
                interfaceC1437lX = interfaceC1437lX3;
            }
            boolean z11 = interfaceC1437lX == null;
            Iterable iterable3 = C1318jk.h;
            if (interfaceC1266iy3 != null) {
                z2 = z11;
                iterable = ((AbstractC1004ey) interfaceC1266iy3).getAnnotations();
            } else {
                z2 = z11;
                iterable = iterable3;
            }
            InterfaceC1437lX V = (interfaceC1266iy3 == null || (a = c1097gL.a(interfaceC1266iy3)) == null) ? null : PX.V(a);
            boolean z12 = enumC1212i42 == EnumC1212i4.m;
            if (z2) {
                z3 = z12;
                if (!z12) {
                    ((C1198hu) c1216i82.i).t.getClass();
                }
                if (w3 == null || (iterable2 = w3.getAnnotations()) == null) {
                    iterable2 = iterable3;
                }
                iterable = AbstractC0720ac.y0(iterable2, iterable);
            } else {
                z3 = z12;
            }
            ((C1198hu) c1216i82.i).q.getClass();
            Iterator it8 = iterable.iterator();
            Iterable iterable4 = iterable;
            EnumC2010uD enumC2010uD6 = null;
            while (true) {
                if (!it8.hasNext()) {
                    enumC1212i4 = enumC1212i42;
                    break;
                }
                Iterator it9 = it8;
                C2245xo d2 = C1408l4.d(it8.next());
                enumC1212i4 = enumC1212i42;
                if (AbstractC0464Ru.f102o.contains(d2)) {
                    enumC2010uD = enumC2010uD3;
                } else if (AbstractC0464Ru.p.contains(d2)) {
                    enumC2010uD = enumC2010uD2;
                } else {
                    continue;
                    enumC1212i42 = enumC1212i4;
                    it8 = it9;
                }
                if (enumC2010uD6 != null && enumC2010uD6 != enumC2010uD) {
                    enumC2010uD6 = null;
                    break;
                }
                enumC2010uD6 = enumC2010uD;
                enumC1212i42 = enumC1212i4;
                it8 = it9;
            }
            C1408l4 c1408l42 = ((C1198hu) c1216i82.i).q;
            c1216i8 = c1216i82;
            C0810c0 c0810c0 = new C0810c0(dr2, 1, c0745b0);
            c1408l42.getClass();
            C2144wF c2144wF5 = null;
            for (Object obj : iterable4) {
                interfaceC1437lX2 = V;
                C2144wF g = c1408l42.g(obj, ((Boolean) c0810c0.invoke(obj)).booleanValue());
                if (g != null) {
                    c1921suArr = c1921suArr2;
                    c1408l4 = c1408l42;
                    c2144wF3 = g;
                } else {
                    Object i4 = c1408l42.i(obj);
                    if (i4 == null) {
                        c1921suArr = c1921suArr2;
                    } else {
                        DN h = c1408l42.h(obj);
                        if (h == null) {
                            h = c1408l42.a.a.a;
                        }
                        c1921suArr = c1921suArr2;
                        if (h == DN.i) {
                            c1408l4 = c1408l42;
                            c2144wF3 = null;
                        } else {
                            C2144wF g2 = c1408l42.g(i4, ((Boolean) c0810c0.invoke(i4)).booleanValue());
                            if (g2 != null) {
                                boolean z13 = h == DN.j;
                                c1408l4 = c1408l42;
                                enumC2078vF = null;
                                c2144wF4 = C2144wF.a(g2, null, z13, 1);
                                if (c2144wF5 != null) {
                                    boolean z14 = c2144wF5.b;
                                    if (c2144wF4 != null && !c2144wF4.equals(c2144wF5) && (!(z5 = c2144wF4.b) || z14)) {
                                        if (z5 || !z14) {
                                            c2144wF = enumC2078vF;
                                            break;
                                        }
                                    }
                                    c1408l42 = c1408l4;
                                    V = interfaceC1437lX2;
                                    c1921suArr2 = c1921suArr;
                                    c2144wF5 = c2144wF5;
                                }
                                c2144wF5 = c2144wF4;
                                c1408l42 = c1408l4;
                                V = interfaceC1437lX2;
                                c1921suArr2 = c1921suArr;
                                c2144wF5 = c2144wF5;
                            }
                        }
                    }
                    c1408l4 = c1408l42;
                    enumC2078vF = null;
                    c2144wF4 = null;
                    if (c2144wF5 != null) {
                    }
                    c2144wF5 = c2144wF4;
                    c1408l42 = c1408l4;
                    V = interfaceC1437lX2;
                    c1921suArr2 = c1921suArr;
                    c2144wF5 = c2144wF5;
                }
                enumC2078vF = null;
                c2144wF4 = c2144wF3;
                if (c2144wF5 != null) {
                }
                c2144wF5 = c2144wF4;
                c1408l42 = c1408l4;
                V = interfaceC1437lX2;
                c1921suArr2 = c1921suArr;
                c2144wF5 = c2144wF5;
            }
            c1921suArr = c1921suArr2;
            interfaceC1437lX2 = V;
            enumC2078vF = null;
            c2144wF = c2144wF5;
            if (c2144wF != 0) {
                EnumC2078vF enumC2078vF12 = c2144wF.a;
                c1921su = new C1921su(enumC2078vF12, enumC2010uD6, enumC2078vF12 == enumC2078vF7 && interfaceC1437lX2 != null, c2144wF.b);
                ArrayList arrayList42 = new ArrayList();
                it = arrayList3.iterator();
                while (it.hasNext()) {
                }
                if (i2 != 0) {
                }
                if (i2 == 0) {
                }
                EnumC2078vF enumC2078vF82 = c1921su.a;
                ArrayList arrayList52 = new ArrayList();
                it2 = arrayList42.iterator();
                while (it2.hasNext()) {
                }
                ArrayList arrayList72 = arrayList42;
                Set M03 = AbstractC0720ac.M0(arrayList52);
                if (!c1921su.d) {
                }
                if (enumC2078vF10 != enumC2078vF5) {
                }
                if (enumC2078vF2 != null) {
                }
                ArrayList arrayList92 = new ArrayList();
                it3 = arrayList72.iterator();
                while (it3.hasNext()) {
                }
                EnumC2010uD enumC2010uD52 = (EnumC2010uD) AbstractC0773bP.h(AbstractC0720ac.M0(arrayList92), enumC2010uD2, enumC2010uD3, c1921su.b, z9);
                if (enumC2078vF5 != null) {
                }
                if (enumC2078vF3 == enumC2078vF7) {
                }
                z6 = false;
                c1921suArr[i2] = new C1921su(enumC2078vF3, enumC2010uD52, z6, enumC2078vF3 == null && enumC2078vF2 != enumC2078vF5);
                i2++;
                dr2 = dr;
                z7 = z8;
                e = arrayList2;
                arrayList = arrayList3;
                size = i3;
                c1216i82 = c1216i8;
                c1921suArr2 = c1921suArr;
            } else {
                EnumC1212i4 enumC1212i43 = (z2 || z3) ? enumC1212i4 : EnumC1212i4.l;
                C1987tu c1987tu = c0745b0.b;
                C0619Xt c0619Xt = c1987tu != null ? (C0619Xt) c1987tu.a.get(enumC1212i43) : enumC2078vF;
                C2144wF b2 = interfaceC1437lX2 != null ? DR.b(interfaceC1437lX2) : enumC2078vF;
                C2144wF a2 = b2 != 0 ? C2144wF.a(b2, enumC2078vF7, false, 2) : c0619Xt != 0 ? c0619Xt.a : enumC2078vF;
                boolean z15 = (b2 != 0 ? b2.a : enumC2078vF) == enumC2078vF7 || !(interfaceC1437lX2 == null || c0619Xt == 0 || !c0619Xt.c);
                if (interfaceC1437lX == null || (b = DR.b(interfaceC1437lX)) == null) {
                    c2144wF2 = enumC2078vF;
                } else {
                    EnumC2078vF enumC2078vF13 = b.a;
                    c2144wF2 = b;
                    if (enumC2078vF13 == enumC2078vF6) {
                        c2144wF2 = C2144wF.a(b, enumC2078vF5, false, 2);
                    }
                }
                if (c2144wF2 != 0) {
                    EnumC2078vF enumC2078vF14 = c2144wF2.a;
                    if (a2 != 0) {
                        EnumC2078vF enumC2078vF15 = a2.a;
                        boolean z16 = a2.b;
                        boolean z17 = c2144wF2.b;
                        if (z17) {
                        }
                        if (!z17) {
                        }
                        if (enumC2078vF14.compareTo(enumC2078vF15) >= 0) {
                        }
                    }
                    a2 = c2144wF2;
                }
                EnumC2078vF enumC2078vF16 = a2 != 0 ? a2.a : null;
                if (a2 != 0 && a2.b) {
                    z4 = true;
                    c1921su = new C1921su(enumC2078vF16, enumC2010uD6, z15, z4);
                    ArrayList arrayList422 = new ArrayList();
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                    }
                    if (i2 != 0) {
                    }
                    if (i2 == 0) {
                    }
                    EnumC2078vF enumC2078vF822 = c1921su.a;
                    ArrayList arrayList522 = new ArrayList();
                    it2 = arrayList422.iterator();
                    while (it2.hasNext()) {
                    }
                    ArrayList arrayList722 = arrayList422;
                    Set M032 = AbstractC0720ac.M0(arrayList522);
                    if (!c1921su.d) {
                    }
                    if (enumC2078vF10 != enumC2078vF5) {
                    }
                    if (enumC2078vF2 != null) {
                    }
                    ArrayList arrayList922 = new ArrayList();
                    it3 = arrayList722.iterator();
                    while (it3.hasNext()) {
                    }
                    EnumC2010uD enumC2010uD522 = (EnumC2010uD) AbstractC0773bP.h(AbstractC0720ac.M0(arrayList922), enumC2010uD2, enumC2010uD3, c1921su.b, z9);
                    if (enumC2078vF5 != null) {
                    }
                    if (enumC2078vF3 == enumC2078vF7) {
                    }
                    z6 = false;
                    c1921suArr[i2] = new C1921su(enumC2078vF3, enumC2010uD522, z6, enumC2078vF3 == null && enumC2078vF2 != enumC2078vF5);
                    i2++;
                    dr2 = dr;
                    z7 = z8;
                    e = arrayList2;
                    arrayList = arrayList3;
                    size = i3;
                    c1216i82 = c1216i8;
                    c1921suArr2 = c1921suArr;
                }
                z4 = false;
                c1921su = new C1921su(enumC2078vF16, enumC2010uD6, z15, z4);
                ArrayList arrayList4222 = new ArrayList();
                it = arrayList3.iterator();
                while (it.hasNext()) {
                }
                if (i2 != 0) {
                }
                if (i2 == 0) {
                }
                EnumC2078vF enumC2078vF8222 = c1921su.a;
                ArrayList arrayList5222 = new ArrayList();
                it2 = arrayList4222.iterator();
                while (it2.hasNext()) {
                }
                ArrayList arrayList7222 = arrayList4222;
                Set M0322 = AbstractC0720ac.M0(arrayList5222);
                if (!c1921su.d) {
                }
                if (enumC2078vF10 != enumC2078vF5) {
                }
                if (enumC2078vF2 != null) {
                }
                ArrayList arrayList9222 = new ArrayList();
                it3 = arrayList7222.iterator();
                while (it3.hasNext()) {
                }
                EnumC2010uD enumC2010uD5222 = (EnumC2010uD) AbstractC0773bP.h(AbstractC0720ac.M0(arrayList9222), enumC2010uD2, enumC2010uD3, c1921su.b, z9);
                if (enumC2078vF5 != null) {
                }
                if (enumC2078vF3 == enumC2078vF7) {
                }
                z6 = false;
                c1921suArr[i2] = new C1921su(enumC2078vF3, enumC2010uD5222, z6, enumC2078vF3 == null && enumC2078vF2 != enumC2078vF5);
                i2++;
                dr2 = dr;
                z7 = z8;
                e = arrayList2;
                arrayList = arrayList3;
                size = i3;
                c1216i82 = c1216i8;
                c1921suArr2 = c1921suArr;
            }
        }
        return (AbstractC1004ey) p(abstractC1004ey.E0(), new C0810c0(zw, 0, c1921suArr2), 0, dr.e).i;
    }

    @Override // o.InterfaceC2015uI
    public Typeface m(C2379zq c2379zq, C1586no c1586no, int i) {
        c2379zq.getClass();
        return g("sans-serif", c1586no, i);
    }

    @Override // o.IE
    public void n(C0027Ay c0027Ay, long j, C2182wr c2182wr, boolean z, boolean z2) {
        C1970td c1970td = c0027Ay.u;
        ME me = (ME) c1970td.d;
        C1823rO c1823rO = ME.D;
        ((ME) c1970td.d).l0(ME.G, me.e0(j), c2182wr, true, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0282 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028d  */
    /* JADX WARN: Type inference failed for: r27v0, types: [o.Ih] */
    /* JADX WARN: Type inference failed for: r6v1, types: [o.gg, o.v9, o.x9] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [o.Ut] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList q(C1216i8 c1216i8, Collection collection) {
        InterfaceC1738q4 annotations;
        AbstractC1004ey abstractC1004ey;
        UI ui;
        int i;
        boolean z;
        AbstractC1004ey returnType;
        boolean z2;
        AbstractC1004ey abstractC1004ey2;
        ArrayList arrayList;
        Iterator it;
        boolean z3;
        SJ sj;
        RP rp = RP.r;
        AbstractC0048Bt.n(c1216i8, "c");
        Collection<??> collection2 = collection;
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(collection2));
        for (?? r6 : collection2) {
            if (r6 instanceof InterfaceC0541Ut) {
                InterfaceC0541Ut interfaceC0541Ut = (InterfaceC0541Ut) r6;
                boolean z4 = true;
                if (interfaceC0541Ut.M() != 2 || interfaceC0541Ut.a().o().size() != 1) {
                    InterfaceC2364zb u = AbstractC0022At.u(r6);
                    if (u == null) {
                        annotations = ((L) r6).getAnnotations();
                    } else {
                        C0390Oy c0390Oy = u instanceof C0390Oy ? (C0390Oy) u : null;
                        List list = c0390Oy != null ? (List) c0390Oy.r.getValue() : null;
                        if (list == null || list.isEmpty()) {
                            annotations = ((L) r6).getAnnotations();
                        } else {
                            ArrayList arrayList3 = new ArrayList(AbstractC0786bc.d0(list));
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(new C0312Ly(c1216i8, (C1558nM) it2.next(), true));
                            }
                            ArrayList y0 = AbstractC0720ac.y0(((L) r6).getAnnotations(), arrayList3);
                            annotations = y0.isEmpty() ? C0460Rq.t : new C1803r4(0, y0);
                        }
                    }
                    C1216i8 y = AbstractC0048Bt.y(c1216i8, annotations);
                    SJ sj2 = (!(r6 instanceof C1132gu) || (sj = ((C1132gu) r6).D) == null || sj.l) ? r6 : sj;
                    C0261Jy J = interfaceC0541Ut.J();
                    EnumC1212i4 enumC1212i4 = EnumC1212i4.j;
                    if (J != null) {
                        SJ sj3 = sj2 instanceof InterfaceC0381Op ? sj2 : null;
                        RY ry = sj3 != null ? (RY) sj3.C(C0934du.M) : null;
                        abstractC1004ey = i((InterfaceC0541Ut) r6, ry, false, ry != null ? AbstractC0048Bt.y(y, ry.getAnnotations()) : y, enumC1212i4, null, false, RP.s);
                    } else {
                        abstractC1004ey = null;
                    }
                    C0934du c0934du = r6 instanceof C0934du ? (C0934du) r6 : null;
                    if (c0934du != null) {
                        InterfaceC1118gg n = c0934du.n();
                        AbstractC0048Bt.l(n, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        String H = AbstractC1305jX.H((InterfaceC1245ib) n, PX.y(c0934du, 3));
                        if (H != null) {
                            ui = (UI) TI.d.get(H);
                            if (ui != null) {
                                ui.b.size();
                                interfaceC0541Ut.t0().size();
                            }
                            AbstractC0048Bt.n(((C1198hu) c1216i8.i).v, "javaTypeEnhancementState");
                            i = 0;
                            if (C1724pu.j.invoke(AbstractC1000eu.a) == DN.k) {
                                ((C1198hu) y.i).t.getClass();
                            } else if ((r6 instanceof InterfaceC0381Op) && AbstractC0048Bt.h(r6.C(C0934du.N), Boolean.TRUE)) {
                                z = true;
                                List<RY> t0 = sj2.t0();
                                AbstractC0048Bt.m(t0, "annotationOwnerForMember.valueParameters");
                                ArrayList arrayList4 = new ArrayList(AbstractC0786bc.d0(t0));
                                for (RY ry2 : t0) {
                                    arrayList4.add(i((InterfaceC0541Ut) r6, ry2, false, ry2 != null ? AbstractC0048Bt.y(y, ry2.getAnnotations()) : y, enumC1212i4, ui != null ? (ZW) AbstractC0720ac.q0(ry2.m, ui.b) : null, z, new C2084vL(6, ry2)));
                                }
                                PJ pj = r6 instanceof PJ ? (PJ) r6 : null;
                                AbstractC1004ey i2 = i(r6, sj2, true, y, (pj == null && AbstractC0048Bt.K(pj)) ? EnumC1212i4.k : EnumC1212i4.i, ui != null ? ui.a : null, false, RP.t);
                                returnType = interfaceC0541Ut.getReturnType();
                                AbstractC0048Bt.k(returnType);
                                if (!AbstractC2228xX.c(returnType, rp, null)) {
                                    C0261Jy J2 = interfaceC0541Ut.J();
                                    if (!(J2 != null ? AbstractC2228xX.c(J2.c(), rp, null) : false)) {
                                        List t02 = interfaceC0541Ut.t0();
                                        AbstractC0048Bt.m(t02, "valueParameters");
                                        if (!t02.isEmpty()) {
                                            Iterator it3 = t02.iterator();
                                            while (it3.hasNext()) {
                                                AbstractC1004ey c = ((RY) it3.next()).c();
                                                AbstractC0048Bt.m(c, "it.type");
                                                if (AbstractC2228xX.c(c, rp, null)) {
                                                    z3 = true;
                                                    break;
                                                }
                                            }
                                        }
                                        z3 = false;
                                        if (!z3) {
                                            z2 = false;
                                            C1619oH c1619oH = !z2 ? new C1619oH(AbstractC0868ct.g, new C1381kh()) : null;
                                            if (abstractC1004ey == null && i2 == null) {
                                                if (!arrayList4.isEmpty()) {
                                                    Iterator it4 = arrayList4.iterator();
                                                    while (it4.hasNext()) {
                                                        if (((AbstractC1004ey) it4.next()) != null) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                z4 = false;
                                                if (!z4 && c1619oH == null) {
                                                }
                                            }
                                            if (abstractC1004ey == null) {
                                                C0261Jy J3 = interfaceC0541Ut.J();
                                                if (J3 != null) {
                                                    abstractC1004ey = J3.c();
                                                } else {
                                                    abstractC1004ey2 = null;
                                                    arrayList = new ArrayList(AbstractC0786bc.d0(arrayList4));
                                                    it = arrayList4.iterator();
                                                    while (true) {
                                                        int i3 = i;
                                                        if (it.hasNext()) {
                                                            Object next = it.next();
                                                            i = i3 + 1;
                                                            if (i3 < 0) {
                                                                AbstractC0868ct.Y();
                                                                throw null;
                                                            }
                                                            AbstractC1004ey abstractC1004ey3 = (AbstractC1004ey) next;
                                                            if (abstractC1004ey3 == null) {
                                                                abstractC1004ey3 = ((RY) interfaceC0541Ut.t0().get(i3)).c();
                                                                AbstractC0048Bt.m(abstractC1004ey3, "valueParameters[index].type");
                                                            }
                                                            arrayList.add(abstractC1004ey3);
                                                        } else {
                                                            if (i2 == null) {
                                                                i2 = interfaceC0541Ut.getReturnType();
                                                                AbstractC0048Bt.k(i2);
                                                            }
                                                            r6 = interfaceC0541Ut.x0(abstractC1004ey2, arrayList, i2, c1619oH);
                                                        }
                                                    }
                                                }
                                            }
                                            abstractC1004ey2 = abstractC1004ey;
                                            arrayList = new ArrayList(AbstractC0786bc.d0(arrayList4));
                                            it = arrayList4.iterator();
                                            while (true) {
                                                int i32 = i;
                                                if (it.hasNext()) {
                                                }
                                                arrayList.add(abstractC1004ey3);
                                            }
                                        }
                                    }
                                }
                                z2 = true;
                                if (!z2) {
                                }
                                if (abstractC1004ey == null) {
                                    if (!arrayList4.isEmpty()) {
                                    }
                                    z4 = false;
                                    if (!z4) {
                                    }
                                }
                                if (abstractC1004ey == null) {
                                }
                                abstractC1004ey2 = abstractC1004ey;
                                arrayList = new ArrayList(AbstractC0786bc.d0(arrayList4));
                                it = arrayList4.iterator();
                                while (true) {
                                    int i322 = i;
                                    if (it.hasNext()) {
                                    }
                                    arrayList.add(abstractC1004ey3);
                                }
                            }
                            z = false;
                            List<RY> t03 = sj2.t0();
                            AbstractC0048Bt.m(t03, "annotationOwnerForMember.valueParameters");
                            ArrayList arrayList42 = new ArrayList(AbstractC0786bc.d0(t03));
                            while (r8.hasNext()) {
                            }
                            if (r6 instanceof PJ) {
                            }
                            AbstractC1004ey i22 = i(r6, sj2, true, y, (pj == null && AbstractC0048Bt.K(pj)) ? EnumC1212i4.k : EnumC1212i4.i, ui != null ? ui.a : null, false, RP.t);
                            returnType = interfaceC0541Ut.getReturnType();
                            AbstractC0048Bt.k(returnType);
                            if (!AbstractC2228xX.c(returnType, rp, null)) {
                            }
                            z2 = true;
                            if (!z2) {
                            }
                            if (abstractC1004ey == null) {
                            }
                            if (abstractC1004ey == null) {
                            }
                            abstractC1004ey2 = abstractC1004ey;
                            arrayList = new ArrayList(AbstractC0786bc.d0(arrayList42));
                            it = arrayList42.iterator();
                            while (true) {
                                int i3222 = i;
                                if (it.hasNext()) {
                                }
                                arrayList.add(abstractC1004ey3);
                            }
                        }
                    }
                    ui = null;
                    if (ui != null) {
                    }
                    AbstractC0048Bt.n(((C1198hu) c1216i8.i).v, "javaTypeEnhancementState");
                    i = 0;
                    if (C1724pu.j.invoke(AbstractC1000eu.a) == DN.k) {
                    }
                    z = false;
                    List<RY> t032 = sj2.t0();
                    AbstractC0048Bt.m(t032, "annotationOwnerForMember.valueParameters");
                    ArrayList arrayList422 = new ArrayList(AbstractC0786bc.d0(t032));
                    while (r8.hasNext()) {
                    }
                    if (r6 instanceof PJ) {
                    }
                    AbstractC1004ey i222 = i(r6, sj2, true, y, (pj == null && AbstractC0048Bt.K(pj)) ? EnumC1212i4.k : EnumC1212i4.i, ui != null ? ui.a : null, false, RP.t);
                    returnType = interfaceC0541Ut.getReturnType();
                    AbstractC0048Bt.k(returnType);
                    if (!AbstractC2228xX.c(returnType, rp, null)) {
                    }
                    z2 = true;
                    if (!z2) {
                    }
                    if (abstractC1004ey == null) {
                    }
                    if (abstractC1004ey == null) {
                    }
                    abstractC1004ey2 = abstractC1004ey;
                    arrayList = new ArrayList(AbstractC0786bc.d0(arrayList422));
                    it = arrayList422.iterator();
                    while (true) {
                        int i32222 = i;
                        if (it.hasNext()) {
                        }
                        arrayList.add(abstractC1004ey3);
                    }
                }
            }
            arrayList2.add(r6);
        }
        return arrayList2;
    }

    public String toString() {
        switch (this.h) {
            case 28:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    public C0218Ih(VA va) {
        this.h = 23;
        String str = VA.d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    public C0218Ih(C0218Ih c0218Ih) {
        this.h = 26;
    }

    @Override // o.InterfaceC2346zJ
    public void h() {
    }

    @Override // o.IE
    public void a(TC tc) {
    }

    @Override // o.InterfaceC2346zJ
    public void j(int i, Object obj) {
    }
}
