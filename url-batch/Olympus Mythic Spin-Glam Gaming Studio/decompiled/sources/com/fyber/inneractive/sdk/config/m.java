package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class m {
    public final HashMap a = new HashMap();

    public m() {
    }

    public m(JSONObject jSONObject) {
        JSONArray names;
        JSONArray names2 = jSONObject.names();
        for (int i = 0; i < names2.length(); i++) {
            String optString = names2.optString(i, null);
            JSONObject optJSONObject = jSONObject.optJSONObject(optString);
            l lVar = new l();
            if (optJSONObject != null && (names = optJSONObject.names()) != null) {
                for (int i2 = 0; i2 < names.length(); i2++) {
                    String optString2 = names.optString(i2, null);
                    String optString3 = optJSONObject.optString(optString2, null);
                    if (optString2 != null && optString3 != null) {
                        lVar.a.put(optString2, optString3);
                    }
                }
            }
            this.a.put(optString, lVar);
        }
    }
}
