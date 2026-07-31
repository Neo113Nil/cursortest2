package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.sf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5672sf {
    public final String a;
    public final String b;

    public C5672sf(String str, String str2) {
        this.a = str;
        this.b = a(str2);
    }

    public final String a(String str) {
        if (str == null) {
            return this.a;
        }
        return this.a + str;
    }
}
