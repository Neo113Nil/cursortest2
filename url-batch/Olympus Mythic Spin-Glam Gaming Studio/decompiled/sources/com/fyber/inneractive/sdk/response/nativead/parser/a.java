package com.fyber.inneractive.sdk.response.nativead.parser;

import com.fyber.inneractive.sdk.response.nativead.g;
import com.fyber.inneractive.sdk.util.v;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public abstract class a {
    public static ArrayList a(JSONArray jSONArray) {
        g gVar;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject == null || optJSONObject.names() == null) {
                    gVar = null;
                } else {
                    gVar = new g();
                    gVar.a = optJSONObject.optInt("event");
                    gVar.b = optJSONObject.optInt("method");
                    gVar.c = v.a(optJSONObject, "url");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("customdata");
                    HashMap hashMap = gVar.d;
                    HashMap hashMap2 = new HashMap();
                    if (optJSONObject2 != null) {
                        HashMap hashMap3 = new HashMap();
                        JSONArray names = optJSONObject2.names();
                        if (names != null && names.length() != 0) {
                            for (int i2 = 0; i2 < names.length(); i2++) {
                                String optString = names.optString(i2);
                                if (optString != null && !optString.isEmpty() && !optJSONObject2.isNull(optString)) {
                                    String optString2 = optJSONObject2.optString(optString);
                                    if (!optString2.isEmpty()) {
                                        hashMap3.put(optString, optString2);
                                    }
                                }
                            }
                        }
                        hashMap2.putAll(hashMap3);
                    }
                    hashMap.putAll(hashMap2);
                }
                if (gVar != null) {
                    arrayList.add(gVar);
                }
            }
        }
        return arrayList;
    }
}
