package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: o.sb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1902sb implements InterfaceC0517Tv, InterfaceC0916db {
    public static final Map i;
    public final Class h;

    static {
        List K = AbstractC0868ct.K(InterfaceC1455lp.class, InterfaceC2114vp.class, InterfaceC2312yp.class, InterfaceC2378zp.class, InterfaceC0018Ap.class, InterfaceC0044Bp.class, InterfaceC0070Cp.class, InterfaceC0096Dp.class, InterfaceC0122Ep.class, InterfaceC0148Fp.class, InterfaceC1521mp.class, InterfaceC1587np.class, InterfaceC0537Up.class, InterfaceC1653op.class, InterfaceC1719pp.class, InterfaceC1785qp.class, InterfaceC1850rp.class, InterfaceC1916sp.class, InterfaceC1982tp.class, InterfaceC2048up.class, InterfaceC2180wp.class, InterfaceC2246xp.class, InterfaceC0537Up.class);
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(K));
        int i2 = 0;
        for (Object obj : K) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0868ct.Y();
                throw null;
            }
            arrayList.add(new C1619oH((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        i = EB.V(arrayList);
    }

    public C1902sb(Class cls) {
        AbstractC0048Bt.n(cls, "jClass");
        this.h = cls;
    }

    public static void i() {
        throw new C0526Ue();
    }

    @Override // o.InterfaceC0517Tv
    public final String a() {
        String r;
        Class cls = this.h;
        AbstractC0048Bt.n(cls, "jClass");
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String r2 = AbstractC0048Bt.r(cls.getName());
            return r2 == null ? cls.getCanonicalName() : r2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (r = AbstractC0048Bt.r(componentType.getName())) != null) {
            str = r.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    @Override // o.InterfaceC0517Tv
    public final boolean d() {
        i();
        throw null;
    }

    @Override // o.InterfaceC0916db
    public final Class e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1902sb) && AbstractC1473m3.E(this).equals(AbstractC1473m3.E((InterfaceC0517Tv) obj));
    }

    @Override // o.InterfaceC0517Tv
    public final boolean f(Object obj) {
        Class cls = this.h;
        AbstractC0048Bt.n(cls, "jClass");
        Map map = i;
        AbstractC0048Bt.l(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return AbstractC1305jX.w(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = AbstractC1473m3.E(AbstractC1473m3.G(cls));
        }
        return cls.isInstance(obj);
    }

    @Override // o.InterfaceC0517Tv
    public final String g() {
        String f0;
        Class cls = this.h;
        AbstractC0048Bt.n(cls, "jClass");
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String f02 = AbstractC0048Bt.f0(cls.getName());
                return f02 == null ? cls.getSimpleName() : f02;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (f0 = AbstractC0048Bt.f0(componentType.getName())) != null) {
                str = f0.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return UT.O(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return UT.P(simpleName);
        }
        return UT.O(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    @Override // o.InterfaceC0361Nv
    public final List getAnnotations() {
        throw null;
    }

    @Override // o.InterfaceC0517Tv
    public final Object h() {
        i();
        throw null;
    }

    public final int hashCode() {
        return AbstractC1473m3.E(this).hashCode();
    }

    @Override // o.InterfaceC0517Tv
    public final boolean isAbstract() {
        i();
        throw null;
    }

    @Override // o.InterfaceC0517Tv
    public final boolean j() {
        i();
        throw null;
    }

    @Override // o.InterfaceC0517Tv
    public final boolean k() {
        i();
        throw null;
    }

    public final String toString() {
        return this.h.toString() + " (Kotlin reflection is not available)";
    }
}
