package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class B2 {
    public static void a(C5731um c5731um, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(com.ironsource.Y3.c);
        if (optJSONObject != null) {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = optJSONObject.optJSONArray("deeplink_conditions");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    String optString = optJSONObject2.optString("key", null);
                    if (!TextUtils.isEmpty(optString)) {
                        String optString2 = optJSONObject2.optString("value", null);
                        arrayList.add(new Pair(optString, optString2 != null ? new C5815y2(optString2) : null));
                    }
                }
            }
            c5731um.s = new C5841z2(arrayList);
        }
    }
}
