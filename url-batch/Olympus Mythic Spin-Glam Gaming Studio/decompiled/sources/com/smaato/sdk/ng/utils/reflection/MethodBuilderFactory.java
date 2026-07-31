package com.smaato.sdk.ng.utils.reflection;

import com.smaato.sdk.ng.utils.reflection.ReflectionUtils;

/* loaded from: classes14.dex */
public class MethodBuilderFactory {
    protected static MethodBuilderFactory a = new MethodBuilderFactory();

    public static ReflectionUtils.MethodBuilder create(Object obj, String str) {
        return a.a(obj, str);
    }

    @Deprecated
    public static void setInstance(MethodBuilderFactory methodBuilderFactory) {
        a = methodBuilderFactory;
    }

    protected ReflectionUtils.MethodBuilder a(Object obj, String str) {
        return new ReflectionUtils.MethodBuilder(obj, str);
    }
}
