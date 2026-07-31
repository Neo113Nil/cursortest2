package com.unity3d.player;

import bitter.jnibridge.a$$ExternalSyntheticApiModelOutline0;
import bitter.jnibridge.a$$ExternalSyntheticApiModelOutline5;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
final class L implements InvocationHandler {
    private Runnable a;
    private UnityPlayer b;
    private long c;
    final /* synthetic */ long d;

    L(UnityPlayer unityPlayer, long j) {
        long j2;
        this.d = j;
        j2 = ReflectionHelper.b;
        this.a = new O(j2, j);
        this.b = unityPlayer;
        this.c = j2;
    }

    private static Object a(Object obj, Method method, Object[] objArr, N n) {
        long j;
        long j2;
        MethodHandles.Lookup in;
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        long j3;
        if (objArr == null) {
            try {
                try {
                    objArr = new Object[0];
                } catch (NoClassDefFoundError unused) {
                    AbstractC5179z.Log(6, String.format("Java interface default methods are only supported since Android Oreo", new Object[0]));
                    j2 = n.a;
                    ReflectionHelper.nativeProxyLogJNIInvokeException(j2);
                    n.a = 0L;
                    return null;
                }
            } catch (Throwable th) {
                j = n.a;
                if (j != 0) {
                    ReflectionHelper.nativeProxyJNIFreeGCHandle(j);
                }
                throw th;
            }
        }
        Class<?> declaringClass = method.getDeclaringClass();
        Constructor declaredConstructor = a$$ExternalSyntheticApiModelOutline5.m().getDeclaredConstructor(Class.class, Integer.TYPE);
        declaredConstructor.setAccessible(true);
        in = a$$ExternalSyntheticApiModelOutline0.m(declaredConstructor.newInstance(declaringClass, 2)).in(declaringClass);
        unreflectSpecial = in.unreflectSpecial(method, declaringClass);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        j3 = n.a;
        if (j3 != 0) {
            ReflectionHelper.nativeProxyJNIFreeGCHandle(j3);
        }
        return invokeWithArguments;
    }

    protected void finalize() {
        this.b.queueGLThreadEvent(this.a);
        super.finalize();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object nativeProxyInvoke;
        boolean z;
        long j;
        if (!ReflectionHelper.beginProxyCall(this.c)) {
            AbstractC5179z.Log(6, "Scripting proxy object was destroyed, because Unity player was unloaded.");
            return null;
        }
        try {
            nativeProxyInvoke = ReflectionHelper.nativeProxyInvoke(this.d, method.getName(), objArr);
            if (!(nativeProxyInvoke instanceof N)) {
                return nativeProxyInvoke;
            }
            N n = (N) nativeProxyInvoke;
            z = n.b;
            if (z && (method.getModifiers() & 1024) == 0) {
                return a(obj, method, objArr, n);
            }
            j = n.a;
            ReflectionHelper.nativeProxyLogJNIInvokeException(j);
            return null;
        } finally {
            ReflectionHelper.endProxyCall();
        }
    }
}
