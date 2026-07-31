package com.ironsource.mediationsdk.logger;

import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C4782n4;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
class b {
    private IronSourceLogger.IronSourceTag a;
    private String b;
    private String c;
    private int d;

    public b(IronSourceLogger.IronSourceTag ironSourceTag, String str, String str2, int i) {
        this.a = ironSourceTag;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public int a() {
        return this.d;
    }

    public JSONObject b() {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put("timestamp", this.b);
            jsonObjectInit.put("tag", this.a);
            jsonObjectInit.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, this.d);
            jsonObjectInit.put("message", this.c);
        } catch (JSONException e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jsonObjectInit;
    }
}
