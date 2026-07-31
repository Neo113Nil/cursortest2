package com.ogury.ad.internal;

import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ogury.ad.common.OguryMediation;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class v5 {
    public static o5 a(JSONObject jSONObject) {
        OguryMediation oguryMediation;
        w2 w2Var;
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("ad");
            u2 u2Var = optJSONObject != null ? new u2(optJSONObject.optString("campaign_id", ""), optJSONObject.optString("creative_id", ""), optJSONObject.optJSONArray("extras"), null) : null;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("mediation");
            if (optJSONObject2 != null) {
                String optString = optJSONObject2.optString("name", "");
                Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                String optString2 = optJSONObject2.optString("version", "");
                Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                oguryMediation = new OguryMediation(optString, optString2, optJSONObject2.optString("adapter_version", ""));
            } else {
                oguryMediation = null;
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("error");
            if (optJSONObject3 != null) {
                String optString3 = optJSONObject3.optString("content");
                Intrinsics.checkNotNull(optString3);
                JSONObject jSONObject2 = optString3.length() > 0 ? new JSONObject(optString3) : null;
                String string = optJSONObject3.getString("type");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                w2Var = new w2(string, jSONObject2);
            } else {
                w2Var = null;
            }
            String optString4 = jSONObject.optString("details");
            Intrinsics.checkNotNull(optString4);
            JSONObject jSONObject3 = optString4.length() > 0 ? new JSONObject(optString4) : null;
            long j = jSONObject.getLong(POBConstants.KEY_AT);
            String string2 = jSONObject.getString(SDKAnalyticsEvents.PARAMETER_SESSION_ID);
            String string3 = jSONObject.getString("event_id");
            String string4 = jSONObject.getString("event");
            String string5 = jSONObject.getJSONObject("ad_unit").getString("id");
            m2 m2Var = m2.c;
            Intrinsics.checkNotNull(string2);
            Intrinsics.checkNotNull(string3);
            Intrinsics.checkNotNull(string4);
            Intrinsics.checkNotNull(string5);
            return new o5(j, string2, string3, string4, jSONObject3, w2Var, string5, u2Var, m2Var, oguryMediation);
        } catch (JSONException unused) {
            return null;
        }
    }
}
