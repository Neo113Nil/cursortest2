package com.google.gson.internal;

/* renamed from: com.google.gson.internal.$Gson$Preconditions, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C$Gson$Preconditions {
    public static Object checkNotNull(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }
}
