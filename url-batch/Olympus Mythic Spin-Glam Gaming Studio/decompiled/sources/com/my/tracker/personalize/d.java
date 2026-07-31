package com.my.tracker.personalize;

import android.text.TextUtils;
import com.applovin.impl.n7$$ExternalSyntheticBackport3;
import com.applovin.sdk.AppLovinEventParameters;
import com.my.tracker.obfuscated.x2;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class d extends b {
    d() {
    }

    static String a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (!jSONObject.has(str)) {
                String str2 = "No value for key: " + str;
                x2.a("PersonalizePlacementsParser: " + str2);
                return str2;
            }
        }
        return null;
    }

    static c b(JSONObject jSONObject) {
        String a = a(jSONObject, AppLovinEventParameters.PRODUCT_IDENTIFIER, "payload", "value", "discount_value", "price", "discount_price");
        if (a != null) {
            return new c(null, a);
        }
        String optString = jSONObject.optString(AppLovinEventParameters.PRODUCT_IDENTIFIER);
        if (TextUtils.isEmpty(optString)) {
            return a("Invalid value for key: ", AppLovinEventParameters.PRODUCT_IDENTIFIER);
        }
        String optString2 = jSONObject.optString("payload");
        if (TextUtils.isEmpty(optString2)) {
            return a("Invalid value for key: ", "payload");
        }
        return new c(new PersonalizeItem(optString, optString2, jSONObject.optDouble("price"), jSONObject.optDouble("discount_price"), jSONObject.optInt("value"), jSONObject.optInt("discount_value")), null);
    }

    static c c(JSONObject jSONObject) {
        String a = a(jSONObject, "offer_id", "subitems");
        if (a != null) {
            return new c(null, a);
        }
        int optInt = jSONObject.optInt("offer_id");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("subitems");
        if (optJSONArray == null) {
            return a("No value for key: ", "subitems");
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            c b = b(optJSONArray.optJSONObject(i));
            String a2 = b.a();
            if (TextUtils.isEmpty(a2)) {
                PersonalizeItem personalizeItem = (PersonalizeItem) b.b();
                if (personalizeItem == null) {
                    String str = "Can't parse item " + i + " without errors";
                    arrayList2.add(str);
                    x2.a("PersonalizePlacementsParser: " + str);
                } else {
                    arrayList.add(personalizeItem);
                }
            } else {
                String str2 = "Can't parse item " + i + " with errors: " + a2;
                arrayList2.add(str2);
                x2.a("PersonalizePlacementsParser: " + str2);
            }
        }
        return arrayList2.size() > 0 ? new c(null, n7$$ExternalSyntheticBackport3.m(", ", arrayList2)) : new c(new PersonalizeOffer(optInt, arrayList), null);
    }

    static c d(JSONObject jSONObject) {
        String a = a(jSONObject, "placement_id", "test_id", "group_id", "offer");
        if (a != null) {
            return new c(null, a);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("offer");
        if (optJSONObject == null) {
            return a("Invalid value for key: ", "offer");
        }
        c c = c(optJSONObject);
        String a2 = c.a();
        if (a2 != null) {
            x2.a("PersonalizePlacementsParser: Can't parse offer's object with error: " + a2);
            return new c(null, a2);
        }
        PersonalizeOffer personalizeOffer = (PersonalizeOffer) c.b();
        if (personalizeOffer == null) {
            return a("Can't parse offer's object without error from parser", null);
        }
        String optString = jSONObject.optString("placement_id");
        return TextUtils.isEmpty(optString) ? a("Invalid value for key: ", "placement_id") : new c(new PersonalizePlacement(optString, jSONObject.optInt("group_id"), jSONObject.optInt("test_id"), personalizeOffer), null);
    }

    static c a(String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        String sb2 = sb.toString();
        x2.a("PersonalizePlacementsParser: " + sb2);
        return new c(null, sb2);
    }

    @Override // com.my.tracker.personalize.b
    c a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("errors");
        ArrayList arrayList = new ArrayList();
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                arrayList.add(next + ": " + optJSONObject.optString(next));
            }
            return new c(null, n7$$ExternalSyntheticBackport3.m(", ", arrayList));
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray == null) {
            return a("No value for key: ", "data");
        }
        if (optJSONArray.length() == 0) {
            return a("No placements in the list");
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            c d = d(optJSONArray.optJSONObject(i));
            String a = d.a();
            if (a != null) {
                x2.a("PersonalizePlacementsParser: Placement parsing error: " + a);
            } else {
                PersonalizePlacement personalizePlacement = (PersonalizePlacement) d.b();
                if (personalizePlacement != null) {
                    arrayList2.add(personalizePlacement);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return a("No placements in the list");
        }
        return new c(arrayList2, null);
    }
}
