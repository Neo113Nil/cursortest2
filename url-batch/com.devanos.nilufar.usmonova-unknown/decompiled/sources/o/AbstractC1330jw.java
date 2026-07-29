package o;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: o.jw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1330jw implements InterfaceC0916db {
    public static final C0705aN h = new C0705aN("<v#(\\d+)>");

    public static Method t(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        Class L;
        Method t;
        if (z) {
            clsArr[0] = cls;
        }
        Method v = v(cls, str, clsArr, cls2);
        if (v != null) {
            return v;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (t = t(superclass, str, clsArr, cls2, z)) != null) {
            return t;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        AbstractC0048Bt.m(interfaces, "interfaces");
        for (Class<?> cls3 : interfaces) {
            AbstractC0048Bt.m(cls3, "superInterface");
            Method t2 = t(cls3, str, clsArr, cls2, z);
            if (t2 != null) {
                return t2;
            }
            if (z && (L = AbstractC1305jX.L(AbstractC1492mM.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method v2 = v(L, str, clsArr, cls2);
                if (v2 != null) {
                    return v2;
                }
            }
        }
        return null;
    }

    public static Method v(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (AbstractC0048Bt.h(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            AbstractC0048Bt.m(declaredMethods, "declaredMethods");
            for (Method method : declaredMethods) {
                if (AbstractC0048Bt.h(method.getName(), str) && AbstractC0048Bt.h(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final void i(ArrayList arrayList, String str, boolean z) {
        ArrayList s = s(str);
        arrayList.addAll(s);
        int size = (s.size() + 31) / 32;
        for (int i = 0; i < size; i++) {
            Class cls = Integer.TYPE;
            AbstractC0048Bt.m(cls, "TYPE");
            arrayList.add(cls);
        }
        if (!z) {
            arrayList.add(Object.class);
        } else {
            arrayList.remove(AbstractC1973tg.class);
            arrayList.add(AbstractC1973tg.class);
        }
    }

    public final Method l(String str, String str2) {
        Method t;
        AbstractC0048Bt.n(str, "name");
        AbstractC0048Bt.n(str2, "desc");
        if (str.equals("<init>")) {
            return null;
        }
        Class[] clsArr = (Class[]) s(str2).toArray(new Class[0]);
        Class u = u(str2, UT.H(str2, ')', 0, 6) + 1, str2.length());
        Method t2 = t(q(), str, clsArr, u, false);
        if (t2 != null) {
            return t2;
        }
        if (!q().isInterface() || (t = t(Object.class, str, clsArr, u, false)) == null) {
            return null;
        }
        return t;
    }

    public abstract Collection m();

    public abstract Collection n(C0827cE c0827cE);

    public abstract PJ o(int i);

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0022 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List p(WB wb, int i) {
        AbstractC0491Sv abstractC0491Sv;
        AbstractC0048Bt.n(wb, "scope");
        AbstractC1888sN.p(i, "belonginess");
        C1264iw c1264iw = new C1264iw(15, this);
        Collection<InterfaceC1118gg> h2 = ON.h(wb, null, 3);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1118gg interfaceC1118gg : h2) {
            if (interfaceC1118gg instanceof InterfaceC2204x9) {
                InterfaceC2204x9 interfaceC2204x9 = (InterfaceC2204x9) interfaceC1118gg;
                if (!AbstractC0048Bt.h(interfaceC2204x9.getVisibility(), AbstractC0270Kh.h)) {
                    if ((interfaceC2204x9.M() != 2) == (i == 1)) {
                        abstractC0491Sv = (AbstractC0491Sv) interfaceC1118gg.t(c1264iw, C0782bY.a);
                        if (abstractC0491Sv == null) {
                            arrayList.add(abstractC0491Sv);
                        }
                    }
                }
            }
            abstractC0491Sv = null;
            if (abstractC0491Sv == null) {
            }
        }
        return AbstractC0720ac.J0(arrayList);
    }

    public Class q() {
        Class e = e();
        List list = AbstractC1492mM.a;
        AbstractC0048Bt.n(e, "<this>");
        Class cls = (Class) AbstractC1492mM.c.get(e);
        return cls == null ? e() : cls;
    }

    public abstract Collection r(C0827cE c0827cE);

    public final ArrayList s(String str) {
        int H;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char charAt = str.charAt(i2);
            if (UT.D("VZCBSIFJD", charAt)) {
                H = i2 + 1;
            } else {
                if (charAt != 'L') {
                    throw new C0526Ue("Unknown type prefix in the method signature: ".concat(str));
                }
                H = UT.H(str, ';', i, 4) + 1;
            }
            arrayList.add(u(str, i, H));
            i = H;
        }
        return arrayList;
    }

    public final Class u(String str, int i, int i2) {
        char charAt = str.charAt(i);
        if (charAt == 'L') {
            ClassLoader d = AbstractC1492mM.d(e());
            String substring = str.substring(i + 1, i2 - 1);
            AbstractC0048Bt.m(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Class<?> loadClass = d.loadClass(AbstractC0778bU.y(substring, '/', '.'));
            AbstractC0048Bt.m(loadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return loadClass;
        }
        if (charAt == '[') {
            Class u = u(str, i + 1, i2);
            C2245xo c2245xo = JY.a;
            AbstractC0048Bt.n(u, "<this>");
            return Array.newInstance((Class<?>) u, 0).getClass();
        }
        if (charAt == 'V') {
            Class cls = Void.TYPE;
            AbstractC0048Bt.m(cls, "TYPE");
            return cls;
        }
        if (charAt == 'Z') {
            return Boolean.TYPE;
        }
        if (charAt == 'C') {
            return Character.TYPE;
        }
        if (charAt == 'B') {
            return Byte.TYPE;
        }
        if (charAt == 'S') {
            return Short.TYPE;
        }
        if (charAt == 'I') {
            return Integer.TYPE;
        }
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'J') {
            return Long.TYPE;
        }
        if (charAt == 'D') {
            return Double.TYPE;
        }
        throw new C0526Ue("Unknown type prefix in the method signature: ".concat(str));
    }
}
