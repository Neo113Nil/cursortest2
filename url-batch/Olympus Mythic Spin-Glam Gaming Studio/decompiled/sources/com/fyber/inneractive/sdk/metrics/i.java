package com.fyber.inneractive.sdk.metrics;

import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class i {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public long c;
    public long d;

    public static JSONArray a(LinkedHashMap linkedHashMap) {
        JSONArray jSONArray = new JSONArray();
        for (h hVar : linkedHashMap.keySet()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("outcome", hVar.b);
                jSONObject.putOpt("time", linkedHashMap.get(hVar));
                jSONObject.putOpt("idx", Integer.valueOf(jSONArray.length()));
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
