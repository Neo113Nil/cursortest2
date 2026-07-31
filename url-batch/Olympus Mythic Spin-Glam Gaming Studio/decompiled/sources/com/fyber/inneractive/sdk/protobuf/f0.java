package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes8.dex */
public abstract class f0 {
    public static final Class a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
    }
}
