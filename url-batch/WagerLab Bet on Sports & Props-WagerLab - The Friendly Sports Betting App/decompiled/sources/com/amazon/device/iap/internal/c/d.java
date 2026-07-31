package com.amazon.device.iap.internal.c;

import java.util.HashMap;
import java.util.Map;

/* compiled from: SandboxImplementationRegistry.java */
/* loaded from: classes3.dex */
public final class d implements com.amazon.device.iap.internal.c {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Class, Class> f687a;

    static {
        HashMap hashMap = new HashMap();
        f687a = hashMap;
        hashMap.put(com.amazon.device.iap.internal.e.class, e.class);
    }

    @Override // com.amazon.device.iap.internal.c
    public <T> Class<T> a(Class<T> cls) {
        return f687a.get(cls);
    }
}
