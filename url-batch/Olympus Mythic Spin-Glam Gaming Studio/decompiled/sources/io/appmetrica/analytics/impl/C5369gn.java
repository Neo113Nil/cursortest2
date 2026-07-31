package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.gn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5369gn {
    public final HashMap a;

    public C5369gn() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        C5214an c5214an = new C5214an();
        C5240bn c5240bn = new C5240bn();
        C5266cn c5266cn = new C5266cn();
        C5292dn c5292dn = new C5292dn();
        hashMap.put(Am.class, c5214an);
        hashMap.put(C5348g2.class, c5240bn);
        hashMap.put(C5802xf.class, c5266cn);
        hashMap.put(J3.class, c5292dn);
    }

    public static InterfaceC5395hn a(Class cls) {
        return (InterfaceC5395hn) AbstractC5343fn.a.a.get(cls);
    }
}
