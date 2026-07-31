package com.fyber.inneractive.sdk.response.nativead.parser;

import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.ArrayList;
import org.json.JSONArray;

/* loaded from: classes13.dex */
public abstract class b {
    public static ArrayList a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (optString != null && !optString.isEmpty() && !optString.equals(POBCommonConstants.NULL_VALUE)) {
                arrayList.add(optString);
            }
        }
        return arrayList;
    }
}
