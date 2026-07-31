package com.mbridge.msdk.mbnative.cache;

import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;

/* compiled from: AbsNativeCache.java */
/* loaded from: classes10.dex */
public abstract class b<K, V> {
    public long a() {
        g f = i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        if (f == null) {
            f = i.b().a();
        }
        return f.c0() * 1000;
    }

    public abstract V a(K k, int i);

    public abstract void a(K k, V v);

    public abstract void a(K k, V v, String str);

    public abstract void a(String str, Campaign campaign, String str2);

    public long b() {
        g f = i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        if (f == null) {
            f = i.b().a();
        }
        return f.d0() * 1000;
    }

    public V b(K k, int i) {
        return null;
    }
}
