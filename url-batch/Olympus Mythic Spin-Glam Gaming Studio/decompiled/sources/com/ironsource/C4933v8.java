package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.v8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C4933v8 implements G7 {
    @Override // com.ironsource.G7
    public String a(Map<String, Object> map) {
        try {
            return String.format("%s=%s", "data", Base64.encodeToString(IronSourceNetworkBridge.jsonObjectInit().put(B5.R, B5.S).put("data", new JSONObject(map)).toString().getBytes(), 2));
        } catch (JSONException e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }
}
