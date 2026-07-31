package com.my.target;

import android.text.TextUtils;
import com.my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
class t7 {
    private t7() {
    }

    static t7 a() {
        return new t7();
    }

    private d8 b(JSONObject jSONObject, x0 x0Var) {
        JSONObject optJSONObject = jSONObject.optJSONObject("resultInfo");
        if (optJSONObject == null) {
            return null;
        }
        String optString = optJSONObject.optString("title");
        if (!TextUtils.isEmpty(optString)) {
            return d8.a(optString, optJSONObject.optString("description", null));
        }
        a(x0Var, "title");
        return null;
    }

    private List d(JSONObject jSONObject, x0 x0Var) {
        JSONArray optJSONArray = jSONObject.optJSONArray("questions");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            a(x0Var, "questions");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            x0 b = x0Var.b(i);
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("blockId");
            if (TextUtils.isEmpty(optString)) {
                a(b, "blockId");
                return null;
            }
            String optString2 = optJSONObject.optString("questionType");
            if (TextUtils.isEmpty(optString2)) {
                a(x0Var, "questionType");
                return null;
            }
            String optString3 = optJSONObject.optString("text");
            if (TextUtils.isEmpty(optString3)) {
                a(x0Var, "text");
                return null;
            }
            boolean optBoolean = optJSONObject.optBoolean("isRequired");
            List a = a(optJSONObject.optJSONArray("images"), b.a("images").d());
            List a2 = a(optJSONObject, b.a("answers").d());
            if (a2 == null || a2.isEmpty()) {
                return null;
            }
            arrayList.add(c8.a(optString, optString2, optString3, optBoolean, a2, a));
        }
        return arrayList;
    }

    b8 c(JSONObject jSONObject, x0 x0Var) {
        String optString = jSONObject.optString("formId");
        if (TextUtils.isEmpty(optString)) {
            a(x0Var, "formId");
            return null;
        }
        String optString2 = jSONObject.optString("postUrl");
        if (TextUtils.isEmpty(optString2)) {
            a(x0Var, "postUrl");
            return null;
        }
        String optString3 = jSONObject.optString("legalDocUrl");
        if (TextUtils.isEmpty(optString3)) {
            a(x0Var, "legalDocUrl");
            return null;
        }
        int optInt = jSONObject.optInt("gradient", -1);
        if (optInt == -1) {
            a(x0Var, "gradient");
            return null;
        }
        String optString4 = jSONObject.optString("mainColor", null);
        List d = d(jSONObject, x0Var.a("questions").d());
        if (d == null) {
            return null;
        }
        d8 b = b(jSONObject, x0Var.a("resultInfo").d());
        if (b != null) {
            return b8.a(optString, optString2, optInt, optString4, optString3, d, b);
        }
        x0Var.a(3007, "Unable to parse resultInfo");
        return null;
    }

    private List a(JSONObject jSONObject, x0 x0Var) {
        JSONArray optJSONArray = jSONObject.optJSONArray("answers");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            a(x0Var, "answers");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            x0 b = x0Var.b(i);
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                b.a(3007, "There is no answer object for index.");
                return null;
            }
            String optString = optJSONObject.optString("id");
            if (TextUtils.isEmpty(optString)) {
                a(b, "id");
                return null;
            }
            int optInt = optJSONObject.optInt("type", -1);
            if (optInt == -1) {
                a(b, "type");
                return null;
            }
            String optString2 = optJSONObject.optString("text");
            if (TextUtils.isEmpty(optString2)) {
                a(b, "text");
                return null;
            }
            arrayList.add(a8.a(optString, optInt, optString2, a(optJSONObject.optJSONArray("logo"), b.a("logo").d())));
        }
        return arrayList;
    }

    private List a(JSONArray jSONArray, x0 x0Var) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            x0 b = x0Var.b(i);
            if (optJSONObject == null) {
                b.a(3007, "There is no image for index.");
                return null;
            }
            int optInt = optJSONObject.optInt("width", -1);
            if (optInt == -1) {
                a(b, "width");
                return null;
            }
            int optInt2 = optJSONObject.optInt("height", -1);
            if (optInt2 == -1) {
                a(b, "height");
                return null;
            }
            String optString = optJSONObject.optString("url");
            if (TextUtils.isEmpty(optString)) {
                a(b, "url");
                return null;
            }
            arrayList.add(i7.a(ImageData.newImageData(optString, optInt, optInt2)));
        }
        return arrayList;
    }

    private void a(x0 x0Var, String str) {
        x0Var.a(3006, "Missing or empty required field: " + str);
    }
}
