package com.smaato.sdk.ng.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes10.dex */
public class ProxyUtils {

    @FunctionalInterface
    public interface ProxyMethodHandler {
        Object handleMethod(Object obj, Method method, Object[] objArr) throws Throwable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object a(Class cls, ProxyMethodHandler proxyMethodHandler, Object obj, Method method, Object[] objArr) throws Throwable {
        String name = method.getName();
        name.getClass();
        switch (name) {
            case "toString":
                return "Proxy for " + cls.getName();
            case "equals":
                return Boolean.valueOf(obj == objArr[0]);
            case "hashCode":
                return Integer.valueOf(System.identityHashCode(obj));
            default:
                return proxyMethodHandler.handleMethod(obj, method, objArr);
        }
    }

    public static Object createProxy(ClassLoader classLoader, final Class<?> cls, final ProxyMethodHandler proxyMethodHandler) {
        return Proxy.newProxyInstance(classLoader, new Class[]{cls}, new InvocationHandler() { // from class: com.smaato.sdk.ng.utils.ProxyUtils$$ExternalSyntheticLambda0
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                Object a;
                a = ProxyUtils.a(cls, proxyMethodHandler, obj, method, objArr);
                return a;
            }
        });
    }
}
