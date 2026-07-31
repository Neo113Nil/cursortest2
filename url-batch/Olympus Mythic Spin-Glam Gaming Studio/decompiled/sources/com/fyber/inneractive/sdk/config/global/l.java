package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C4993ye;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class l {
    public final HashMap a = new HashMap();

    public static l a(JSONObject jSONObject) {
        l lVar = new l();
        JSONArray optJSONArray = jSONObject.optJSONArray("features");
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            q qVar = new q();
            qVar.b = jSONObject2.getString("id");
            JSONObject optJSONObject = jSONObject2.optJSONObject("params");
            if (optJSONObject != null) {
                qVar.a = new o(optJSONObject);
            } else {
                IAlog.a("RemoteFeature fromJson. feature %s has no params!", qVar.b);
            }
            JSONArray optJSONArray2 = jSONObject2.optJSONArray(C4993ye.d);
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    JSONObject jSONObject3 = optJSONArray2.getJSONObject(i2);
                    b bVar = new b();
                    bVar.a = jSONObject3.getString("id");
                    bVar.b = jSONObject3.optInt("perc", 10);
                    JSONArray jSONArray = jSONObject3.getJSONArray("variants");
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i3);
                        k kVar = new k();
                        kVar.b = jSONObject4.getString("id");
                        kVar.c = jSONObject4.getInt("perc");
                        JSONObject optJSONObject2 = jSONObject4.optJSONObject("params");
                        if (optJSONObject2 != null) {
                            kVar.a = new o(optJSONObject2);
                        }
                        bVar.c.add(kVar);
                    }
                    b.a(bVar, jSONObject3.optJSONObject(POBProfileInfo.COUNTRY_FILTERING_ALLOW_MODE), true);
                    b.a(bVar, jSONObject3.optJSONObject(POBProfileInfo.COUNTRY_FILTERING_BLOCK_MODE), false);
                    qVar.c.put(bVar.a, bVar);
                }
            }
            lVar.a.put(qVar.b, qVar);
        }
        return lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.format("remoteConfig - features: %s", this.a.values());
    }
}
