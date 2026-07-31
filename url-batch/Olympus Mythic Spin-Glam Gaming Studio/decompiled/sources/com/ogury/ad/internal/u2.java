package com.ogury.ad.internal;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public final class u2 {
    public final String a;
    public final String b;
    public final JSONArray c;
    public final v2 d;

    public u2(String str, String str2, JSONArray jSONArray, v2 v2Var) {
        this.a = str;
        this.b = str2;
        this.c = jSONArray;
        this.d = v2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        return Intrinsics.areEqual(this.a, u2Var.a) && Intrinsics.areEqual(this.b, u2Var.b) && Intrinsics.areEqual(this.c, u2Var.c) && Intrinsics.areEqual(this.d, u2Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        JSONArray jSONArray = this.c;
        int hashCode3 = (hashCode2 + (jSONArray == null ? 0 : jSONArray.hashCode())) * 31;
        v2 v2Var = this.d;
        return hashCode3 + (v2Var != null ? v2Var.hashCode() : 0);
    }

    public final String toString() {
        return "EventAd(campaignId=" + this.a + ", creativeId=" + this.b + ", extras=" + this.c + ", eventBanner=" + this.d + ")";
    }
}
