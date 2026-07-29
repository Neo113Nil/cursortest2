package o;

import com.google.firebase.messaging.Constants;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class JY {
    public static final C2245xo a = new C2245xo("kotlin.jvm.JvmStatic");

    public static final AbstractC0491Sv a(Object obj) {
        AbstractC0491Sv abstractC0491Sv = obj instanceof AbstractC0491Sv ? (AbstractC0491Sv) obj : null;
        if (abstractC0491Sv != null) {
            return abstractC0491Sv;
        }
        C1528mw b = b(obj);
        return b != null ? b : c(obj);
    }

    public static final C1528mw b(Object obj) {
        C1528mw c1528mw = obj instanceof C1528mw ? (C1528mw) obj : null;
        if (c1528mw != null) {
            return c1528mw;
        }
        AbstractC0485Sp abstractC0485Sp = obj instanceof AbstractC0485Sp ? (AbstractC0485Sp) obj : null;
        InterfaceC0387Ov compute = abstractC0485Sp != null ? abstractC0485Sp.compute() : null;
        if (compute instanceof C1528mw) {
            return (C1528mw) compute;
        }
        return null;
    }

    public static final AbstractC1397kx c(Object obj) {
        AbstractC1397kx abstractC1397kx = obj instanceof AbstractC1397kx ? (AbstractC1397kx) obj : null;
        if (abstractC1397kx != null) {
            return abstractC1397kx;
        }
        VJ vj = obj instanceof VJ ? (VJ) obj : null;
        InterfaceC0387Ov compute = vj != null ? vj.compute() : null;
        if (compute instanceof AbstractC1397kx) {
            return (AbstractC1397kx) compute;
        }
        return null;
    }

    public static final ArrayList d(W3 w3) {
        List J;
        AbstractC0048Bt.n(w3, "<this>");
        InterfaceC1738q4 annotations = w3.getAnnotations();
        ArrayList arrayList = new ArrayList();
        Iterator it = annotations.iterator();
        while (true) {
            Annotation annotation = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC0948e4 interfaceC0948e4 = (InterfaceC0948e4) it.next();
            IS d = interfaceC0948e4.d();
            if (d instanceof C1426lM) {
                annotation = ((C1426lM) d).h;
            } else if (d instanceof C0904dP) {
                BM bm = ((C0904dP) d).h;
                C1558nM c1558nM = bm instanceof C1558nM ? (C1558nM) bm : null;
                if (c1558nM != null) {
                    annotation = c1558nM.a;
                }
            } else {
                annotation = i(interfaceC0948e4);
            }
            if (annotation != null) {
                arrayList.add(annotation);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (AbstractC1473m3.D(AbstractC1473m3.B((Annotation) it2.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        Annotation annotation2 = (Annotation) it3.next();
                        Class D = AbstractC1473m3.D(AbstractC1473m3.B(annotation2));
                        if (!D.getSimpleName().equals("Container") || D.getAnnotation(InterfaceC2284yN.class) == null) {
                            J = AbstractC0868ct.J(annotation2);
                        } else {
                            Object invoke = D.getDeclaredMethod("value", null).invoke(annotation2, null);
                            AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            J = P6.W((Annotation[]) invoke);
                        }
                        AbstractC1048fc.f0(arrayList2, J);
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }

    public static final Object e(Type type) {
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (type.equals(Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (type.equals(Character.TYPE)) {
            return (char) 0;
        }
        if (type.equals(Byte.TYPE)) {
            return (byte) 0;
        }
        if (type.equals(Short.TYPE)) {
            return (short) 0;
        }
        if (type.equals(Integer.TYPE)) {
            return 0;
        }
        if (type.equals(Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (type.equals(Long.TYPE)) {
            return 0L;
        }
        if (type.equals(Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (type.equals(Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final InterfaceC2072v9 f(Class cls, AbstractC1917sq abstractC1917sq, InterfaceC0893dE interfaceC0893dE, C0695aD c0695aD, AbstractC1478m8 abstractC1478m8, InterfaceC2312yp interfaceC2312yp) {
        List list;
        AbstractC0048Bt.n(cls, "moduleAnchor");
        AbstractC0048Bt.n(abstractC1917sq, "proto");
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        AbstractC0048Bt.n(abstractC1478m8, "metadataVersion");
        C0838cP a2 = ZC.a(cls);
        if (abstractC1917sq instanceof C2017uK) {
            list = ((C2017uK) abstractC1917sq).p;
        } else {
            if (!(abstractC1917sq instanceof CK)) {
                throw new IllegalStateException(("Unsupported message: " + abstractC1917sq).toString());
            }
            list = ((CK) abstractC1917sq).p;
        }
        List list2 = list;
        C0296Lh c0296Lh = a2.a;
        InterfaceC0761bD interfaceC0761bD = c0296Lh.b;
        C1097gL c1097gL = C1097gL.p;
        AbstractC0048Bt.m(list2, "typeParameters");
        return (InterfaceC2072v9) interfaceC2312yp.invoke(new SB(new C0321Mh(c0296Lh, interfaceC0893dE, interfaceC0761bD, c0695aD, c1097gL, abstractC1478m8, null, null, list2)), abstractC1917sq);
    }

    public static final C0261Jy g(InterfaceC2072v9 interfaceC2072v9) {
        AbstractC0048Bt.n(interfaceC2072v9, "<this>");
        if (interfaceC2072v9.x() == null) {
            return null;
        }
        InterfaceC1118gg n = interfaceC2072v9.n();
        AbstractC0048Bt.l(n, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((InterfaceC1245ib) n).z0();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class h(ClassLoader classLoader, C1639ob c1639ob, int i) {
        String str = C1460lu.a;
        C2377zo i2 = c1639ob.b().i();
        AbstractC0048Bt.m(i2, "kotlinClassId.asSingleFqName().toUnsafe()");
        C1639ob f = C1460lu.f(i2);
        if (f != null) {
            c1639ob = f;
        }
        String b = c1639ob.g().b();
        String b2 = c1639ob.h().b();
        if (b.equals("kotlin")) {
            switch (b2.hashCode()) {
                case -901856463:
                    if (b2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (b2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (b2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (b2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (b2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (b2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (b2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (b2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (b2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i3 = 0; i3 < i; i3++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (b.length() > 0) {
            sb.append(b.concat("."));
        }
        sb.append(AbstractC0778bU.y(b2, '.', '$'));
        if (i > 0) {
            sb.append(";");
        }
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
        return AbstractC1305jX.L(classLoader, sb2);
    }

    public static final Annotation i(InterfaceC0948e4 interfaceC0948e4) {
        InterfaceC1245ib d = AbstractC0192Hh.d(interfaceC0948e4);
        Class j = d != null ? j(d) : null;
        if (j == null) {
            j = null;
        }
        if (j == null) {
            return null;
        }
        Set<Map.Entry> entrySet = interfaceC0948e4.f().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : entrySet) {
            C0827cE c0827cE = (C0827cE) entry.getKey();
            AbstractC0551Vd abstractC0551Vd = (AbstractC0551Vd) entry.getValue();
            ClassLoader classLoader = j.getClassLoader();
            AbstractC0048Bt.m(classLoader, "annotationClass.classLoader");
            Object k = k(abstractC0551Vd, classLoader);
            C1619oH c1619oH = k != null ? new C1619oH(c0827cE.b(), k) : null;
            if (c1619oH != null) {
                arrayList.add(c1619oH);
            }
        }
        Map V = EB.V(arrayList);
        Set keySet = V.keySet();
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(keySet));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList2.add(j.getDeclaredMethod((String) it.next(), null));
        }
        return (Annotation) AbstractC1807r8.t(j, V, arrayList2);
    }

    public static final Class j(InterfaceC1245ib interfaceC1245ib) {
        AbstractC0048Bt.n(interfaceC1245ib, "<this>");
        IS d = interfaceC1245ib.d();
        AbstractC0048Bt.m(d, Constants.ScionAnalytics.PARAM_SOURCE);
        if (d instanceof C0675Zx) {
            return ((C0675Zx) d).h.a;
        }
        if (d instanceof C0904dP) {
            BM bm = ((C0904dP) d).h;
            AbstractC0048Bt.l(bm, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((C2217xM) bm).a;
        }
        C1639ob f = AbstractC0192Hh.f(interfaceC1245ib);
        if (f == null) {
            return null;
        }
        return h(AbstractC1492mM.d(interfaceC1245ib.getClass()), f, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object k(AbstractC0551Vd abstractC0551Vd, ClassLoader classLoader) {
        AbstractC1004ey abstractC1004ey;
        Class h;
        if (abstractC0551Vd instanceof C1606o4) {
            return i((InterfaceC0948e4) ((C1606o4) abstractC0551Vd).a);
        }
        int i = 0;
        if (abstractC0551Vd instanceof O6) {
            O6 o6 = (O6) abstractC0551Vd;
            AX ax = o6 instanceof AX ? (AX) o6 : null;
            if (ax != null && (abstractC1004ey = ax.c) != null) {
                Object obj = o6.a;
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(iterable));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(k((AbstractC0551Vd) it.next(), classLoader));
                }
                C0827cE c0827cE = AbstractC0545Ux.e;
                InterfaceC2364zb c = abstractC1004ey.B0().c();
                EnumC1423lJ r = c == null ? null : AbstractC0545Ux.r(c);
                switch (r == null ? -1 : IY.a[r.ordinal()]) {
                    case -1:
                        if (!AbstractC0545Ux.y(abstractC1004ey)) {
                            throw new IllegalStateException(("Not an array type: " + abstractC1004ey).toString());
                        }
                        AbstractC1004ey b = ((AbstractC1701pX) AbstractC0720ac.D0(abstractC1004ey.w0())).b();
                        AbstractC0048Bt.m(b, "type.arguments.single().type");
                        InterfaceC2364zb c2 = b.B0().c();
                        InterfaceC1245ib interfaceC1245ib = c2 instanceof InterfaceC1245ib ? (InterfaceC1245ib) c2 : null;
                        if (interfaceC1245ib == null) {
                            throw new IllegalStateException(("Not a class type: " + b).toString());
                        }
                        if (AbstractC0545Ux.G(b)) {
                            int size = ((List) obj).size();
                            String[] strArr = new String[size];
                            while (i < size) {
                                Object obj2 = arrayList.get(i);
                                AbstractC0048Bt.l(obj2, "null cannot be cast to non-null type kotlin.String");
                                strArr[i] = obj2;
                                i++;
                            }
                            return strArr;
                        }
                        if (AbstractC0545Ux.b(interfaceC1245ib, AbstractC1433lT.P)) {
                            int size2 = ((List) obj).size();
                            Class[] clsArr = new Class[size2];
                            while (i < size2) {
                                Object obj3 = arrayList.get(i);
                                AbstractC0048Bt.l(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                                clsArr[i] = obj3;
                                i++;
                            }
                            return clsArr;
                        }
                        C1639ob f = AbstractC0192Hh.f(interfaceC1245ib);
                        if (f != null && (h = h(classLoader, f, 0)) != null) {
                            Object newInstance = Array.newInstance((Class<?>) h, ((List) obj).size());
                            AbstractC0048Bt.l(newInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                            Object[] objArr = (Object[]) newInstance;
                            int size3 = arrayList.size();
                            while (i < size3) {
                                objArr[i] = arrayList.get(i);
                                i++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        throw new C0057Cc();
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i < size4) {
                            Object obj4 = arrayList.get(i);
                            AbstractC0048Bt.l(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            zArr[i] = ((Boolean) obj4).booleanValue();
                            i++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i < size5) {
                            Object obj5 = arrayList.get(i);
                            AbstractC0048Bt.l(obj5, "null cannot be cast to non-null type kotlin.Char");
                            cArr[i] = ((Character) obj5).charValue();
                            i++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i < size6) {
                            Object obj6 = arrayList.get(i);
                            AbstractC0048Bt.l(obj6, "null cannot be cast to non-null type kotlin.Byte");
                            bArr[i] = ((Byte) obj6).byteValue();
                            i++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i < size7) {
                            Object obj7 = arrayList.get(i);
                            AbstractC0048Bt.l(obj7, "null cannot be cast to non-null type kotlin.Short");
                            sArr[i] = ((Short) obj7).shortValue();
                            i++;
                        }
                        return sArr;
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i < size8) {
                            Object obj8 = arrayList.get(i);
                            AbstractC0048Bt.l(obj8, "null cannot be cast to non-null type kotlin.Int");
                            iArr[i] = ((Integer) obj8).intValue();
                            i++;
                        }
                        return iArr;
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i < size9) {
                            Object obj9 = arrayList.get(i);
                            AbstractC0048Bt.l(obj9, "null cannot be cast to non-null type kotlin.Float");
                            fArr[i] = ((Float) obj9).floatValue();
                            i++;
                        }
                        return fArr;
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i < size10) {
                            Object obj10 = arrayList.get(i);
                            AbstractC0048Bt.l(obj10, "null cannot be cast to non-null type kotlin.Long");
                            jArr[i] = ((Long) obj10).longValue();
                            i++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i < size11) {
                            Object obj11 = arrayList.get(i);
                            AbstractC0048Bt.l(obj11, "null cannot be cast to non-null type kotlin.Double");
                            dArr[i] = ((Double) obj11).doubleValue();
                            i++;
                        }
                        return dArr;
                }
            }
        } else if (abstractC0551Vd instanceof C2175wk) {
            C1619oH c1619oH = (C1619oH) ((C2175wk) abstractC0551Vd).a;
            C1639ob c1639ob = (C1639ob) c1619oH.h;
            C0827cE c0827cE2 = (C0827cE) c1619oH.i;
            Class h2 = h(classLoader, c1639ob, 0);
            if (h2 != null) {
                return Enum.valueOf(h2, c0827cE2.b());
            }
        } else if (abstractC0551Vd instanceof C1002ew) {
            AbstractC0936dw abstractC0936dw = (AbstractC0936dw) ((C1002ew) abstractC0551Vd).a;
            if (abstractC0936dw instanceof C0871cw) {
                C1705pb c1705pb = ((C0871cw) abstractC0936dw).a;
                return h(classLoader, c1705pb.a, c1705pb.b);
            }
            if (!(abstractC0936dw instanceof C0806bw)) {
                throw new C0057Cc();
            }
            InterfaceC2364zb c3 = ((C0806bw) abstractC0936dw).a.B0().c();
            InterfaceC1245ib interfaceC1245ib2 = c3 instanceof InterfaceC1245ib ? (InterfaceC1245ib) c3 : null;
            if (interfaceC1245ib2 != null) {
                return j(interfaceC1245ib2);
            }
        } else {
            if (!(abstractC0551Vd instanceof C0299Lk ? true : abstractC0551Vd instanceof C1880sF)) {
                return abstractC0551Vd.b();
            }
        }
        return null;
    }
}
