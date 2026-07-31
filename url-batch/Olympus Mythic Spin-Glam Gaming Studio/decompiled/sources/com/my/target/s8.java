package com.my.target;

import android.text.TextUtils;
import com.my.target.common.models.ImageData;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class s8 {
    private final y a;
    private final n b;
    private boolean c = true;

    private s8(y yVar, n nVar) {
        this.a = yVar;
        this.b = nVar;
    }

    public static s8 a(y yVar, n nVar) {
        return new s8(yVar, nVar);
    }

    private void a(String str) {
    }

    boolean a(JSONObject jSONObject, r8 r8Var, s sVar) {
        ImageData a;
        ImageData a2;
        this.c = r8Var.U();
        JSONArray optJSONArray = jSONObject.optJSONArray("portrait");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("landscape");
        if ((optJSONArray == null || optJSONArray.length() <= 0) && (optJSONArray2 == null || optJSONArray2.length() <= 0)) {
            sVar.b(q.p);
            a("portrait");
            a("landscape");
            return false;
        }
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && (a2 = a(optJSONObject, r8Var.x())) != null) {
                    r8Var.e(a2);
                }
            }
        }
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                if (optJSONObject2 != null && (a = a(optJSONObject2, r8Var.x())) != null) {
                    r8Var.d(a);
                }
            }
        }
        boolean z = (r8Var.d0().isEmpty() && r8Var.g0().isEmpty()) ? false : true;
        if (z) {
            sVar.b(q.p);
        }
        return z;
    }

    private ImageData a(JSONObject jSONObject, String str) {
        String optString = jSONObject.optString("imageLink");
        if (TextUtils.isEmpty(optString)) {
            a("imageLink");
            return null;
        }
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        if (optInt > 0 && optInt2 > 0) {
            return ImageData.newImageData(optString, optInt, optInt2);
        }
        a("width");
        a("height");
        return null;
    }
}
