package com.unity3d.player;

import com.unity3d.player.a.AbstractC0120t;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.unity3d.player.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154r implements InvocationHandler {
    public final RunnableC0160u a;
    public final UnityPlayer b;
    public final long c;
    public final /* synthetic */ long d;

    public C0154r(long j, UnityPlayer unityPlayer) {
        long j2;
        this.d = j;
        j2 = ReflectionHelper.b;
        this.a = new RunnableC0160u(j2, j);
        this.b = unityPlayer;
        this.c = j2;
    }

    public static Object a(Object obj, Method method, Object[] objArr, C0158t c0158t) {
        try {
            if (objArr == null) {
                try {
                    objArr = new Object[0];
                } catch (NoClassDefFoundError unused) {
                    AbstractC0120t.Log(6, "Java interface default methods are only supported since Android Oreo");
                    ReflectionHelper.nativeProxyLogJNIInvokeException(c0158t.a);
                    c0158t.a = 0L;
                    return null;
                }
            }
            Class<?> declaringClass = method.getDeclaringClass();
            Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return ((MethodHandles.Lookup) declaredConstructor.newInstance(declaringClass, 2)).in(declaringClass).unreflectSpecial(method, declaringClass).bindTo(obj).invokeWithArguments(objArr);
        } finally {
            long j = c0158t.a;
            if (j != 0) {
                ReflectionHelper.nativeProxyJNIFreeGCHandle(j);
            }
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object nativeProxyInvoke;
        if (!ReflectionHelper.beginProxyCall(this.c)) {
            AbstractC0120t.Log(6, "Scripting proxy object was destroyed, because Unity player was unloaded.");
            return null;
        }
        try {
            nativeProxyInvoke = ReflectionHelper.nativeProxyInvoke(this.d, method.getName(), objArr);
            if (!(nativeProxyInvoke instanceof C0158t)) {
                return nativeProxyInvoke;
            }
            C0158t c0158t = (C0158t) nativeProxyInvoke;
            if (c0158t.b && (method.getModifiers() & 1024) == 0) {
                return a(obj, method, objArr, c0158t);
            }
            ReflectionHelper.nativeProxyLogJNIInvokeException(c0158t.a);
            return null;
        } finally {
            ReflectionHelper.endProxyCall();
        }
    }

    public void finalize() {
        this.b.invokeOnMainThread(this.a);
        super.finalize();
    }
}
