package com.my.target;

import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class oh {
    private oh() {
    }

    public static oh a() {
        return new oh();
    }

    private void b(JSONObject jSONObject, nh nhVar) {
        nhVar.a(jSONObject.optBoolean("hasAdditionalAds", nhVar.d()));
    }

    public void a(JSONObject jSONObject, nh nhVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            b(optJSONObject, nhVar);
        }
    }
}
