package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: o.mM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1492mM {
    public static final List a;
    public static final Map b;
    public static final Map c;
    public static final Map d;

    static {
        VM vm = UM.a;
        int i = 0;
        List<InterfaceC0517Tv> K = AbstractC0868ct.K(vm.b(Boolean.TYPE), vm.b(Byte.TYPE), vm.b(Character.TYPE), vm.b(Double.TYPE), vm.b(Float.TYPE), vm.b(Integer.TYPE), vm.b(Long.TYPE), vm.b(Short.TYPE));
        a = K;
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(K));
        for (InterfaceC0517Tv interfaceC0517Tv : K) {
            arrayList.add(new C1619oH(AbstractC1473m3.E(interfaceC0517Tv), AbstractC1473m3.F(interfaceC0517Tv)));
        }
        b = EB.V(arrayList);
        List<InterfaceC0517Tv> list = a;
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(list));
        for (InterfaceC0517Tv interfaceC0517Tv2 : list) {
            arrayList2.add(new C1619oH(AbstractC1473m3.F(interfaceC0517Tv2), AbstractC1473m3.E(interfaceC0517Tv2)));
        }
        c = EB.V(arrayList2);
        List K2 = AbstractC0868ct.K(InterfaceC1455lp.class, InterfaceC2114vp.class, InterfaceC2312yp.class, InterfaceC2378zp.class, InterfaceC0018Ap.class, InterfaceC0044Bp.class, InterfaceC0070Cp.class, InterfaceC0096Dp.class, InterfaceC0122Ep.class, InterfaceC0148Fp.class, InterfaceC1521mp.class, InterfaceC1587np.class, InterfaceC0537Up.class, InterfaceC1653op.class, InterfaceC1719pp.class, InterfaceC1785qp.class, InterfaceC1850rp.class, InterfaceC1916sp.class, InterfaceC1982tp.class, InterfaceC2048up.class, InterfaceC2180wp.class, InterfaceC2246xp.class, InterfaceC0537Up.class);
        ArrayList arrayList3 = new ArrayList(AbstractC0786bc.d0(K2));
        for (Object obj : K2) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0868ct.Y();
                throw null;
            }
            arrayList3.add(new C1619oH((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        d = EB.V(arrayList3);
    }

    public static final C1639ob a(Class cls) {
        AbstractC0048Bt.n(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null && cls.getSimpleName().length() != 0) {
            Class<?> declaringClass = cls.getDeclaringClass();
            return declaringClass != null ? a(declaringClass).d(C0827cE.e(cls.getSimpleName())) : C1639ob.j(new C2245xo(cls.getName()));
        }
        C2245xo c2245xo = new C2245xo(cls.getName());
        return new C1639ob(c2245xo.e(), C2245xo.j(c2245xo.f()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final String b(Class cls) {
        AbstractC0048Bt.n(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return AbstractC0778bU.y(cls.getName(), '.', '/');
            }
            return "L" + AbstractC0778bU.y(cls.getName(), '.', '/') + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final List c(Type type) {
        AbstractC0048Bt.n(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return C1318jk.h;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return PQ.B(new C1716pm(PQ.x(type, WI.l), WI.m, SQ.j));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        AbstractC0048Bt.m(actualTypeArguments, "actualTypeArguments");
        return P6.t0(actualTypeArguments);
    }

    public static final ClassLoader d(Class cls) {
        AbstractC0048Bt.n(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        AbstractC0048Bt.m(systemClassLoader, "getSystemClassLoader()");
        return systemClassLoader;
    }
}
