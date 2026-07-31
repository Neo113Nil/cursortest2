package com.my.target;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class ee {
    private final boolean a;
    private final n b;
    private final String c;

    private ee(n nVar, String str, boolean z) {
        this.b = nVar;
        this.c = str;
        this.a = z;
    }

    public static ee a(n nVar, String str, boolean z) {
        return new ee(nVar, str, z);
    }

    private void a(String str, int i, String str2) {
    }

    public de a(de deVar, JSONObject jSONObject) {
        if (deVar == null) {
            String optString = jSONObject.optString("customReferenceData", "");
            if (optString.length() > 256) {
                a("customReferenceData", 3007, "customReferenceData more then 256 symbols");
            } else {
                if (optString.isEmpty()) {
                    a("customReferenceData", 3007);
                }
                deVar = de.a(jSONObject.optString("contentUrl", null), optString);
            }
            optString = null;
            deVar = de.a(jSONObject.optString("contentUrl", null), optString);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("resources");
        if (optJSONArray != null) {
            a(optJSONArray, deVar);
        }
        return deVar;
    }

    private void a(JSONArray jSONArray, de deVar) {
        xi a;
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                a("omData.resourcesJsonArray." + i, 3006);
            } else if (!optJSONObject.has("url")) {
                a("url", 3006);
            } else {
                String optString = optJSONObject.optString("url");
                if (optJSONObject.has("vendorKey") && optJSONObject.has("params")) {
                    String optString2 = optJSONObject.optString("vendorKey");
                    String optString3 = optJSONObject.optString("params");
                    if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                        a = xi.a(optString, optString2, optString3);
                    } else {
                        mi.a("VerificationScriptResource has empty param: vendorKey=" + optString2 + ", verificationParameters=" + optString3);
                        if (TextUtils.isEmpty(optString2)) {
                            a("vendorKey", 3006);
                        }
                        if (TextUtils.isEmpty(optString3)) {
                            a("params", 3006);
                        }
                    }
                } else {
                    a = xi.a(optString);
                }
                deVar.c.add(a);
            }
        }
    }

    private void a(String str, int i) {
        a(str, i, "");
    }
}
