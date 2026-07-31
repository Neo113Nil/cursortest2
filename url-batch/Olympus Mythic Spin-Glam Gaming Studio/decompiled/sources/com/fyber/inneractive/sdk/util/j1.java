package com.fyber.inneractive.sdk.util;

/* loaded from: classes8.dex */
public abstract class j1 {
    public static boolean a(String str) {
        int i = com.fyber.inneractive.sdk.config.k.a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.response");
        return property != null && property.trim().length() > 0 && str != null && str.toLowerCase().startsWith("fyberInternalTesting".toLowerCase()) && str.contains("crash");
    }
}
