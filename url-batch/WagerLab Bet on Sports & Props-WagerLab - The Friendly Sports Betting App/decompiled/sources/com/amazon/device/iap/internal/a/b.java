package com.amazon.device.iap.internal.a;

import java.util.HashMap;
import java.util.Map;

/* compiled from: KiwiImplementationRegistry.java */
/* loaded from: classes3.dex */
public final class b implements com.amazon.device.iap.internal.c {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Class, Class> f672a;

    static {
        HashMap hashMap = new HashMap();
        f672a = hashMap;
        hashMap.put(com.amazon.device.iap.internal.e.class, d.class);
    }

    @Override // com.amazon.device.iap.internal.c
    public <T> Class<T> a(Class<T> cls) {
        return f672a.get(cls);
    }
}
