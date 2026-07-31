package com.my.target;

import android.util.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class td {
    private td(y yVar, n nVar) {
    }

    public static td a(y yVar, n nVar) {
        return new td(yVar, nVar);
    }

    private void b(JSONObject jSONObject, sd sdVar) {
        sdVar.h(jSONObject.optString("title", sdVar.l()));
        sdVar.e(jSONObject.optString("icon_hd", sdVar.f()));
        sdVar.c(jSONObject.optString("bubble_icon_hd", sdVar.d()));
        sdVar.g(jSONObject.optString("label_icon_hd", sdVar.h()));
        sdVar.d(jSONObject.optString("goto_app_icon_hd", sdVar.e()));
        sdVar.f(jSONObject.optString("item_highlight_icon", sdVar.g()));
        JSONArray optJSONArray = jSONObject.optJSONArray("icon_status");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    sdVar.k().add(new Pair(optJSONObject.optString("value"), optJSONObject.optString("icon_hd")));
                }
            }
        }
    }

    public void a(JSONObject jSONObject, sd sdVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            b(optJSONObject, sdVar);
        }
    }
}
