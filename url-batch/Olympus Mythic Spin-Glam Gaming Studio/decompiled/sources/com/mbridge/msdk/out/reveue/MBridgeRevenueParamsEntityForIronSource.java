package com.mbridge.msdk.out.reveue;

import android.text.TextUtils;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class MBridgeRevenueParamsEntityForIronSource extends MBridgeRevenueParamsEntity {
    public MBridgeRevenueParamsEntityForIronSource(String str, String str2) {
        super(str, str2);
        setMediationName("IronSource");
    }

    @Override // com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity
    public void setDspInfo(String str, String str2) {
        super.setDspInfo(str, str2);
    }

    public void setIronSourceImpressionDataString(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            setMediationUnitId(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String str3 = "{" + str2 + "}";
        try {
            setSourceData(str3, str3);
            JSONObject jsonObjectInit = MintegralNetworkBridge.jsonObjectInit(str3);
            setNetworkName(jsonObjectInit.optString("adNetwork", ""));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("instanceName", jsonObjectInit.optString("instanceName", ""));
            jSONObject.put("instanceId", jsonObjectInit.optString("instanceId", ""));
            setNetworkInfo(jSONObject);
            setAdType(jsonObjectInit.optString("adUnit", ""));
            setRevenue(jsonObjectInit.optString("revenue", ""));
            setPrecision(jsonObjectInit.optString("precision", ""));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
