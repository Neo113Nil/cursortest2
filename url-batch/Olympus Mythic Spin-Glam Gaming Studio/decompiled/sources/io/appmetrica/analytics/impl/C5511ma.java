package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ma, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5511ma {
    public final String a;
    public final int b;
    public final boolean c;

    public C5511ma(JSONObject jSONObject) {
        this.a = jSONObject.getString("name");
        this.c = jSONObject.getBoolean("required");
        this.b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5511ma.class != obj.getClass()) {
            return false;
        }
        C5511ma c5511ma = (C5511ma) obj;
        if (this.b != c5511ma.b || this.c != c5511ma.c) {
            return false;
        }
        String str = this.a;
        String str2 = c5511ma.a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        String str = this.a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.b) * 31) + (this.c ? 1 : 0);
    }

    public C5511ma(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }
}
