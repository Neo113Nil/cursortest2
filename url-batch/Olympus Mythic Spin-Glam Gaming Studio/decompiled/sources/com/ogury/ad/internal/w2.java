package com.ogury.ad.internal;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class w2 {
    public final String a;
    public final JSONObject b;

    public w2(String type, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = type;
        this.b = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj;
        return Intrinsics.areEqual(this.a, w2Var.a) && Intrinsics.areEqual(this.b, w2Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        JSONObject jSONObject = this.b;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final String toString() {
        return "EventError(type=" + this.a + ", content=" + this.b + ")";
    }
}
