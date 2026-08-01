package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ia {
    public static final ia c = new ia();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, ha haVar, fp fpVar, Class cls) {
        fp fpVar2 = (fp) hashMap.get(haVar);
        if (fpVar2 == null || fpVar == fpVar2) {
            if (fpVar2 == null) {
                hashMap.put(haVar, fpVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + haVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + fpVar2 + ", new value " + fpVar);
    }

    public final ga a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            ga gaVar = (ga) hashMap2.get(superclass);
            if (gaVar == null) {
                gaVar = a(superclass, null);
            }
            hashMap.putAll(gaVar.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            ga gaVar2 = (ga) hashMap2.get(cls2);
            if (gaVar2 == null) {
                gaVar2 = a(cls2, null);
            }
            for (Map.Entry entry : gaVar2.b.entrySet()) {
                b(hashMap, (ha) entry.getKey(), (fp) entry.getValue(), cls);
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
            rv rvVar = (rv) method.getAnnotation(rv.class);
            if (rvVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!lp.class.isAssignableFrom(parameterTypes[0])) {
                        l8.l("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                fp value = rvVar.value();
                if (parameterTypes.length > 1) {
                    if (!fp.class.isAssignableFrom(parameterTypes[1])) {
                        l8.l("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != fp.ON_ANY) {
                        l8.l("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    l8.l("cannot have more than 2 params");
                    return null;
                }
                b(hashMap, new ha(i, method), value, cls);
                z = true;
            }
        }
        ga gaVar3 = new ga(hashMap);
        hashMap2.put(cls, gaVar3);
        this.b.put(cls, Boolean.valueOf(z));
        return gaVar3;
    }
}
