package com.five_corp.ad.internal.parser;

import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.m;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class a {
    public static com.five_corp.ad.internal.ad_check.a a(String str) {
        int i;
        JSONObject jSONObject = new JSONObject(str);
        int i2 = jSONObject.getInt("t");
        int[] b = com.five_corp.ad.e.b(3);
        int length = b.length;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = b[i3];
            if (i4 == 1) {
                i = 3;
            } else if (i4 == 2) {
                i = 4;
            } else {
                if (i4 != 3) {
                    throw null;
                }
                i = 5;
            }
            if (i == i2) {
                int a = com.five_corp.ad.e.a(i4);
                if (a == 0) {
                    return new com.five_corp.ad.internal.ad_check.a(1, null);
                }
                if (a == 1) {
                    return new com.five_corp.ad.internal.ad_check.a(2, null);
                }
                if (a != 2) {
                    throw new RuntimeException("Unexpected AdCheckResponseType enum: ".concat(i4 != 1 ? i4 != 2 ? i4 != 3 ? POBCommonConstants.NULL_VALUE : "SHOW_ONE_OF_AD" : "SUPPRESSED" : "NOT_SHOW"));
                }
                JSONArray jSONArray = jSONObject.getJSONArray(m.r);
                ArrayList arrayList = new ArrayList();
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    arrayList.add(new com.five_corp.ad.internal.ad_check.e(b.a(jSONArray.getJSONObject(i5).getJSONObject("ad"))));
                }
                return new com.five_corp.ad.internal.ad_check.a(3, arrayList);
            }
        }
        throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.m.j1, i2);
    }
}
