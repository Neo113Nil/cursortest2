package com.amazon.device.drm.a.b;

import java.util.HashMap;
import java.util.Map;

/* compiled from: KiwiImplementationRegistry.java */
/* loaded from: classes3.dex */
public final class a implements com.amazon.device.drm.a.b {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Class, Class> f662a;

    static {
        HashMap hashMap = new HashMap();
        f662a = hashMap;
        hashMap.put(com.amazon.device.drm.a.c.class, c.class);
    }

    @Override // com.amazon.device.drm.a.b
    public <T> Class<T> a(Class<T> cls) {
        return f662a.get(cls);
    }
}
