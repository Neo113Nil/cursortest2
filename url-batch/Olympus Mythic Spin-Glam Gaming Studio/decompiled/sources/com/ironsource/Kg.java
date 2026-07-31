package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class Kg {
    public static final String a = "errMsg";

    public static JSONObject a(String str, String str2) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put("errMsg", str);
            jsonObjectInit.put("adViewId", str2);
        } catch (JSONException e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jsonObjectInit;
    }
}
