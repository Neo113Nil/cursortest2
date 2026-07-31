package com.amazon.a.a.o;

import java.lang.reflect.Method;

/* compiled from: ReflectionUtils.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final c f607a = new c("Reflection");

    public static Class<?> a(String str) {
        com.amazon.a.a.o.a.a.a((Object) str, "String className");
        try {
            return Thread.currentThread().getContextClassLoader().loadClass(str);
        } catch (ClassNotFoundException unused) {
            if (!c.f599a) {
                return null;
            }
            f607a.a("ClassNoFound: " + str);
            return null;
        }
    }

    public static boolean a(Method method) {
        com.amazon.a.a.o.a.a.a((Object) method, "Method m");
        return method.getParameterTypes().length > 0;
    }

    public static boolean b(Method method) {
        com.amazon.a.a.o.a.a.a((Object) method, "Method m");
        return method.getReturnType().equals(Void.TYPE);
    }

    public static boolean c(Method method) {
        com.amazon.a.a.o.a.a.a((Object) method, "Method m");
        return (method.getModifiers() & 8) != 0;
    }
}
