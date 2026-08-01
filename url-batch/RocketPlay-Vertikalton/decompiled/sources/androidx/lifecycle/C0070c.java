package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0070c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0070c f1888c = new C0070c();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1889a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1890b = new HashMap();

    public static void b(HashMap hashMap, C0069b c0069b, EnumC0079l enumC0079l, Class cls) {
        EnumC0079l enumC0079l2 = (EnumC0079l) hashMap.get(c0069b);
        if (enumC0079l2 == null || enumC0079l == enumC0079l2) {
            if (enumC0079l2 == null) {
                hashMap.put(c0069b, enumC0079l);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0069b.f1887b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0079l2 + ", new value " + enumC0079l);
    }

    public final C0068a a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f1889a;
        if (superclass != null) {
            C0068a c0068a = (C0068a) hashMap2.get(superclass);
            if (c0068a == null) {
                c0068a = a(superclass, null);
            }
            hashMap.putAll(c0068a.f1885b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0068a c0068a2 = (C0068a) hashMap2.get(cls2);
            if (c0068a2 == null) {
                c0068a2 = a(cls2, null);
            }
            for (Map.Entry entry : c0068a2.f1885b.entrySet()) {
                b(hashMap, (C0069b) entry.getKey(), (EnumC0079l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            z zVar = (z) method.getAnnotation(z.class);
            if (zVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!t.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0079l value = zVar.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0079l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0079l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0069b(i, method), value, cls);
                z2 = true;
            }
        }
        C0068a c0068a3 = new C0068a(hashMap);
        hashMap2.put(cls, c0068a3);
        this.f1890b.put(cls, Boolean.valueOf(z2));
        return c0068a3;
    }
}
