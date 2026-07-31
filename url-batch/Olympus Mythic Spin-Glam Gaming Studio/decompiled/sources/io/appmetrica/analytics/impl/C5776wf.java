package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.wf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5776wf {
    public final String a;
    public final JSONObject b;
    public final EnumC5483l8 c;

    public C5776wf(String str, JSONObject jSONObject, EnumC5483l8 enumC5483l8) {
        this.a = str;
        this.b = jSONObject;
        this.c = enumC5483l8;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.a + "', additionalParams=" + this.b + ", source=" + this.c + '}';
    }
}
