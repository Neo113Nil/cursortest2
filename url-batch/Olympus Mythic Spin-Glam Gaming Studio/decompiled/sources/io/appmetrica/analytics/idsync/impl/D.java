package io.appmetrica.analytics.idsync.impl;

import java.util.Map;

/* loaded from: classes15.dex */
public final class D {
    public final String a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final int e;
    public final byte[] f;
    public final Map g;

    public D(String str, boolean z, String str2, boolean z2, int i, byte[] bArr, Map map) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = z2;
        this.e = i;
        this.f = bArr;
        this.g = map;
    }

    public final String toString() {
        return "RequestResult(type='" + this.a + "', isCompleted=" + this.b + ", url=" + this.c + ", responseCodeIsValid=" + this.d + ", responseCode=" + this.e + ", responseBody=" + this.f + ", responseHeaders=" + this.g + ')';
    }
}
