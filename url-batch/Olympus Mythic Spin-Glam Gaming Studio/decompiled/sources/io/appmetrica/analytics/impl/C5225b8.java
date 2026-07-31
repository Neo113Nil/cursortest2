package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.b8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5225b8 {
    public final Map a;
    public final String b;
    public final String c;

    public C5225b8(String str, HashMap hashMap, String str2) {
        this.b = str;
        this.a = hashMap;
        this.c = str2;
    }

    public final String toString() {
        return "DeferredDeeplinkState{mParameters=" + this.a + ", mDeeplink='" + this.b + "', mUnparsedReferrer='" + this.c + "'}";
    }
}
