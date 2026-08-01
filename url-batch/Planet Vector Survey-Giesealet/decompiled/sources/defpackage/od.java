package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class od {
    public static final od c = new od();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, nd ndVar, e20 e20Var, Class cls) {
        e20 e20Var2 = (e20) hashMap.get(ndVar);
        if (e20Var2 == null || e20Var == e20Var2) {
            if (e20Var2 == null) {
                hashMap.put(ndVar, e20Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + ndVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + e20Var2 + ", new value " + e20Var);
    }

    public final md a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            md mdVar = (md) hashMap2.get(superclass);
            if (mdVar == null) {
                mdVar = a(superclass, null);
            }
            hashMap.putAll(mdVar.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            md mdVar2 = (md) hashMap2.get(cls2);
            if (mdVar2 == null) {
                mdVar2 = a(cls2, null);
            }
            for (Map.Entry entry : mdVar2.b.entrySet()) {
                b(hashMap, (nd) entry.getKey(), (e20) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            hb0 hb0Var = (hb0) method.getAnnotation(hb0.class);
            if (hb0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!o20.class.isAssignableFrom(parameterTypes[0])) {
                        g8.r("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                e20 value = hb0Var.value();
                if (parameterTypes.length > 1) {
                    if (!e20.class.isAssignableFrom(parameterTypes[1])) {
                        g8.r("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != e20.ON_ANY) {
                        g8.r("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    g8.r("cannot have more than 2 params");
                    return null;
                }
                b(hashMap, new nd(i, method), value, cls);
                z = true;
            }
        }
        md mdVar3 = new md(hashMap);
        hashMap2.put(cls, mdVar3);
        this.b.put(cls, Boolean.valueOf(z));
        return mdVar3;
    }
}
