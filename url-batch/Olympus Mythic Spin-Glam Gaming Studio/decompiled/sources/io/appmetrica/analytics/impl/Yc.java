package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class Yc {
    public final Map a;
    public final Object b;

    public Yc(Object obj) {
        this(new HashMap(), obj);
    }

    public final void a(Object obj, Object obj2) {
        this.a.put(obj, obj2);
    }

    public Yc(HashMap hashMap, Object obj) {
        this.a = hashMap;
        this.b = obj;
    }

    public final Object a(Object obj) {
        Object obj2 = this.a.get(obj);
        return obj2 == null ? this.b : obj2;
    }
}
