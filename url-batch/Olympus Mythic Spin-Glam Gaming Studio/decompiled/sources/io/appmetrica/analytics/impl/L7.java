package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class L7 {
    public static final String a(C5804xh c5804xh) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject().put("dId", c5804xh.getDeviceId()).put("uId", c5804xh.getUuid()).put("appVer", c5804xh.getAppVersion()).put("appBuild", c5804xh.getAppBuildNumber()).put("kitBuildType", c5804xh.getAnalyticsSdkBuildType()).put("osVer", c5804xh.getOsVersion()).put("osApiLev", c5804xh.getOsApiLevel()).put(com.ironsource.O6.q, c5804xh.getLocale()).put("root", c5804xh.getDeviceRootStatus()).put("app_debuggable", ((C5275d6) c5804xh).a).put(CommonUrlParts.APP_FRAMEWORK, c5804xh.getAppFramework()).put("attribution_id", c5804xh.r).put("analyticsSdkVersionName", c5804xh.getAnalyticsSdkVersionName()).put("kitBuildNumber", c5804xh.getAnalyticsSdkBuildNumber());
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        return jSONObject.toString();
    }
}
