package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ld implements kd {
    public static final Map b;
    public final Class a;

    static {
        int i = 0;
        List I = px0.I(bu.class, mu.class, qu.class, ru.class, su.class, tu.class, uu.class, vu.class, wu.class, xu.class, cu.class, du.class, eu.class, fu.class, gu.class, hu.class, iu.class, ju.class, ku.class, lu.class, nu.class, ou.class, pu.class);
        ArrayList arrayList = new ArrayList(ae.Y(I, 10));
        for (Object obj : I) {
            int i2 = i + 1;
            if (i < 0) {
                px0.V();
                throw null;
            }
            arrayList.add(new pd0((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = x40.R(arrayList);
    }

    public ld(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    public final String a() {
        String U;
        Class cls = this.a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String U2 = mz.U(cls.getName());
                return U2 == null ? cls.getSimpleName() : U2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (U = mz.U(componentType.getName())) != null) {
                str = U.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return tt0.z(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int v = tt0.v(simpleName, '$', 0, 6);
            return v == -1 ? simpleName : simpleName.substring(v + 1, simpleName.length());
        }
        return tt0.z(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ld) && nz.E(this).equals(nz.E((ld) obj));
    }

    public final int hashCode() {
        return nz.E(this).hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
