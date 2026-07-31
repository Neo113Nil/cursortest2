package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ll, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5496ll {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final int m;
    public final String n;
    public final String o;

    public C5496ll(JSONObject jSONObject) {
        this.a = jSONObject.toString();
        this.b = jSONObject.optString("dId", "");
        this.c = jSONObject.optString("uId", "");
        this.d = jSONObject.optString("appVer", "");
        this.e = jSONObject.optString("appBuild", "");
        this.f = jSONObject.optString("kitBuildType", "");
        this.g = jSONObject.optString("osVer", "");
        this.h = jSONObject.optInt("osApiLev", -1);
        this.i = jSONObject.optString(com.ironsource.O6.q, "");
        this.j = jSONObject.optString("root", "");
        this.k = jSONObject.optString("app_debuggable", "");
        this.l = jSONObject.optString(CommonUrlParts.APP_FRAMEWORK, "");
        this.m = jSONObject.optInt("attribution_id", 0);
        this.n = jSONObject.optString("analyticsSdkVersionName", "");
        this.o = jSONObject.optString("kitBuildNumber", "");
    }

    public final String toString() {
        return "SessionRequestParams(deviceId='" + this.b + "', uuid='" + this.c + "', appVersion='" + this.d + "', appBuild='" + this.e + "', kitBuildType='" + this.f + "', osVersion='" + this.g + "', apiLevel=" + this.h + ", locale='" + this.i + "', deviceRootStatus='" + this.j + "', appDebuggable='" + this.k + "', appFramework='" + this.l + "', attributionId=" + this.m + ", kitVersionName='" + this.n + "', kitBuildNumber='" + this.o + "')";
    }
}
