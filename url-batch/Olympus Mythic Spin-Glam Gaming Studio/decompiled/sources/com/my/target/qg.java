package com.my.target;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class qg {
    private final y a;
    private final n b;

    private qg(y yVar, n nVar) {
        this.a = yVar;
        this.b = nVar;
    }

    public static qg a(y yVar, n nVar) {
        return new qg(yVar, nVar);
    }

    public pg a(JSONObject jSONObject, String str) {
        th a = th.a(w0.d, (sh) null);
        ei a2 = ei.a(this.a, this.b);
        boolean has = jSONObject.has("statistics");
        if (has) {
            a2.a(a, jSONObject, str, -1.0f);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray == null) {
            mi.a("ShoppableAdsDataParser: can't parse – ShoppableAdItems'");
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            mi.a("ShoppableAdsDataParser: can't parse – shoppableAdItems size is 0");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                mi.a("ShoppableAdsDataParser: can't parse – hasn't shoppableItemJson");
            } else {
                z7 a3 = a(optJSONObject, a2, str);
                if (a3 == null) {
                    mi.a("ShoppableAdsDataParser: can't parse shoppableAdsItem");
                    return null;
                }
                arrayList.add(a3);
            }
        }
        if (arrayList.size() == 0) {
            mi.a("ShoppableAdsDataParser: can't parse – no one valid shoppableAdItem");
            return null;
        }
        if (!has || a.d("shoppableAdsItemShow") || a.d("show")) {
            return pg.a(arrayList, a);
        }
        mi.a("ShoppableAdsDataParser: hasn't show stat'");
        return null;
    }

    public z7 a(JSONObject jSONObject, ei eiVar, String str) {
        try {
            String string = jSONObject.getString("url");
            if (TextUtils.isEmpty(string)) {
                mi.a("ShoppableAdsDataParser: can't parse ShoppableAdsItem – hasn't url");
                return null;
            }
            String string2 = jSONObject.getString("id");
            if (TextUtils.isEmpty(string2)) {
                mi.a("ShoppableAdsDataParser: can't parse ShoppableAdsItem – hasn't id");
                return null;
            }
            String string3 = jSONObject.getString("picture");
            if (TextUtils.isEmpty(string3)) {
                mi.a("ShoppableAdsDataParser: can't parse ShoppableAdsItem – hasn't picture");
                return null;
            }
            String string4 = jSONObject.getString("text");
            if (TextUtils.isEmpty(string4)) {
                mi.a("ShoppableAdsDataParser: can't parse ShoppableAdsItem – hasn't text");
                return null;
            }
            String string5 = jSONObject.has("oldPrice") ? jSONObject.getString("oldPrice") : null;
            String string6 = jSONObject.has("price") ? jSONObject.getString("price") : null;
            String string7 = jSONObject.has("deeplink") ? jSONObject.getString("deeplink") : null;
            String string8 = jSONObject.has("deeplink_fallback_url") ? jSONObject.getString("deeplink_fallback_url") : null;
            th a = th.a(w0.d, (sh) null);
            eiVar.a(a, jSONObject, str, -1.0f);
            return z7.a(string, string2, string3, string4, string6, string5, string7, string8, a);
        } catch (Throwable th) {
            mi.a("ShoppableAdsDataParser: can't parse ShoppableAdsItem – " + th.getMessage());
            return null;
        }
    }
}
