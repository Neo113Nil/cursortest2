package com.my.target;

import android.text.TextUtils;
import com.my.target.common.models.ImageData;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class c6 {
    public static ImageData a(JSONObject jSONObject) {
        int optInt;
        int optInt2;
        String optString = jSONObject.optString("url");
        if (!TextUtils.isEmpty(optString) && (optInt = jSONObject.optInt("width")) > 0 && (optInt2 = jSONObject.optInt("height")) > 0) {
            return ImageData.newImageData(optString, optInt, optInt2);
        }
        return null;
    }
}
