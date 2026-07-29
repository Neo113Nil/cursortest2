package o;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.wb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2166wb {
    public static final C2166wb c = new C2166wb();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, C2100vb c2100vb, EnumC0054Bz enumC0054Bz, Class cls) {
        EnumC0054Bz enumC0054Bz2 = (EnumC0054Bz) hashMap.get(c2100vb);
        if (enumC0054Bz2 == null || enumC0054Bz == enumC0054Bz2) {
            if (enumC0054Bz2 == null) {
                hashMap.put(c2100vb, enumC0054Bz);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c2100vb.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0054Bz2 + ", new value " + enumC0054Bz);
    }

    public final C2034ub a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            C2034ub c2034ub = (C2034ub) hashMap2.get(superclass);
            if (c2034ub == null) {
                c2034ub = a(superclass, null);
            }
            hashMap.putAll(c2034ub.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C2034ub c2034ub2 = (C2034ub) hashMap2.get(cls2);
            if (c2034ub2 == null) {
                c2034ub2 = a(cls2, null);
            }
            for (Map.Entry entry : c2034ub2.b.entrySet()) {
                b(hashMap, (C2100vb) entry.getKey(), (EnumC0054Bz) entry.getValue(), cls);
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
            InterfaceC1026fG interfaceC1026fG = (InterfaceC1026fG) method.getAnnotation(InterfaceC1026fG.class);
            if (interfaceC1026fG != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0365Nz.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0054Bz value = interfaceC1026fG.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0054Bz.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0054Bz.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C2100vb(method, i), value, cls);
                z = true;
            }
        }
        C2034ub c2034ub3 = new C2034ub(hashMap);
        hashMap2.put(cls, c2034ub3);
        this.b.put(cls, Boolean.valueOf(z));
        return c2034ub3;
    }
}
