package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes6.dex */
public final class C7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;

    public C7(Bb bb) {
        this.a = bb.c("dId");
        this.b = bb.c("uId");
        this.c = bb.c("analyticsSdkVersionName");
        this.d = bb.c("kitBuildNumber");
        this.e = bb.c("kitBuildType");
        this.f = bb.c("appVer");
        this.g = bb.optString("app_debuggable", "0");
        this.h = bb.c("appBuild");
        this.i = bb.c("osVer");
        this.k = bb.c(com.ironsource.O6.q);
        this.l = bb.c("root");
        this.m = bb.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int optInt = bb.optInt("osApiLev", -1);
        this.j = optInt == -1 ? null : String.valueOf(optInt);
        int optInt2 = bb.optInt("attribution_id", 0);
        this.n = optInt2 > 0 ? String.valueOf(optInt2) : null;
    }

    public final String toString() {
        return "DbNetworkTaskConfig{deviceId='" + this.a + "', uuid='" + this.b + "', analyticsSdkVersionName='" + this.c + "', kitBuildNumber='" + this.d + "', kitBuildType='" + this.e + "', appVersion='" + this.f + "', appDebuggable='" + this.g + "', appBuildNumber='" + this.h + "', osVersion='" + this.i + "', osApiLevel='" + this.j + "', locale='" + this.k + "', deviceRootStatus='" + this.l + "', appFramework='" + this.m + "', attributionId='" + this.n + "'}";
    }

    public C7() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
    }
}
