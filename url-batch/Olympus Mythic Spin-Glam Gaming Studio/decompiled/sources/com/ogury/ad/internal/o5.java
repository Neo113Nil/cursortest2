package com.ogury.ad.internal;

import com.ogury.ad.common.OguryMediation;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class o5 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final JSONObject e;
    public final w2 f;
    public final String g;
    public final u2 h;
    public m2 i;
    public final OguryMediation j;

    public o5(long j, String sessionId, String id, String name, JSONObject jSONObject, w2 w2Var, String adUnitId, u2 u2Var, m2 dispatchType, OguryMediation oguryMediation) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(dispatchType, "dispatchType");
        this.a = j;
        this.b = sessionId;
        this.c = id;
        this.d = name;
        this.e = jSONObject;
        this.f = w2Var;
        this.g = adUnitId;
        this.h = u2Var;
        this.i = dispatchType;
        this.j = oguryMediation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5)) {
            return false;
        }
        o5 o5Var = (o5) obj;
        return this.a == o5Var.a && Intrinsics.areEqual(this.b, o5Var.b) && Intrinsics.areEqual(this.c, o5Var.c) && Intrinsics.areEqual(this.d, o5Var.d) && Intrinsics.areEqual(this.e, o5Var.e) && Intrinsics.areEqual(this.f, o5Var.f) && Intrinsics.areEqual(this.g, o5Var.g) && Intrinsics.areEqual(this.h, o5Var.h) && this.i == o5Var.i && Intrinsics.areEqual(this.j, o5Var.j);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31)) * 31;
        JSONObject jSONObject = this.e;
        int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        w2 w2Var = this.f;
        int hashCode3 = (this.g.hashCode() + ((hashCode2 + (w2Var == null ? 0 : w2Var.hashCode())) * 31)) * 31;
        u2 u2Var = this.h;
        int hashCode4 = (this.i.hashCode() + ((hashCode3 + (u2Var == null ? 0 : u2Var.hashCode())) * 31)) * 31;
        OguryMediation oguryMediation = this.j;
        return hashCode4 + (oguryMediation != null ? oguryMediation.hashCode() : 0);
    }

    public final String toString() {
        return "MonitoringEvent(at=" + this.a + ", sessionId=" + this.b + ", id=" + this.c + ", name=" + this.d + ", details=" + this.e + ", error=" + this.f + ", adUnitId=" + this.g + ", ad=" + this.h + ", dispatchType=" + this.i + ", oguryMediation=" + this.j + ")";
    }
}
