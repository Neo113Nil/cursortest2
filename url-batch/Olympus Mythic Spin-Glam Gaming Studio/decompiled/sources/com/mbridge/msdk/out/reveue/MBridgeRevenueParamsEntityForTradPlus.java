package com.mbridge.msdk.out.reveue;

import android.text.TextUtils;
import com.ironsource.Ac;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class MBridgeRevenueParamsEntityForTradPlus extends MBridgeRevenueParamsEntity {
    public MBridgeRevenueParamsEntityForTradPlus(String str, String str2) {
        super(str, str2);
        setMediationName("TradPlus");
    }

    @Override // com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity
    public void setDspInfo(String str, String str2) {
        super.setDspInfo(str, str2);
    }

    public void setTradPlusAdInfo(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                String replace = str.replace("\"", "\\\"").replace("----------------------\n", "{\"").replaceAll("(?<!\"):(?!\")", "\":\"").replace("\n", "\",\"");
                if (replace.endsWith("\"")) {
                    str2 = (replace + "}").replace(",\"}", "}");
                } else {
                    str2 = replace + "\"}";
                }
                JSONObject jsonObjectInit = MintegralNetworkBridge.jsonObjectInit(str2);
                setAdType(jsonObjectInit.optInt("placementAdType") + "");
                setMediationUnitId(jsonObjectInit.optString("tpAdUnitId"));
                setNetworkName(jsonObjectInit.optString(Ac.a));
                setBidType(Boolean.valueOf(jsonObjectInit.optBoolean("isBiddingNetwork", false)));
                setRevenue(jsonObjectInit.optString("ecpm", ""));
                setPrecision(jsonObjectInit.optString("ecpmPrecision", ""));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("instanceName", jsonObjectInit.optString(Ac.a, ""));
                jSONObject.put("instanceId", jsonObjectInit.optString("adSourceId", ""));
                setNetworkInfo(jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        setSourceData(str, str);
    }
}
