package com.my.target;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.my.target.common.models.ImageData;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class v8 extends j8 {
    private final ei e;

    private v8(y yVar, n nVar) {
        super(yVar, nVar);
        this.e = ei.a(yVar, nVar);
    }

    private void a(String str, String str2, String str3, s sVar) {
        sVar.b(q.n);
    }

    public static v8 b(y yVar, n nVar) {
        return new v8(yVar, nVar);
    }

    private boolean c(JSONObject jSONObject, u8 u8Var, s sVar) {
        x8 d0 = u8Var.d0();
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            a("html", "url", u8Var.x(), sVar);
            return false;
        }
        d0.a(optString);
        int optInt = jSONObject.optInt("allowCloseDelay", -1);
        if (optInt == -1) {
            a("html", "allowCloseDelay", u8Var.x(), sVar);
            return false;
        }
        d0.a(optInt);
        d0.b(jSONObject.optInt(IronSourceConstants.EVENTS_DURATION, 5));
        JSONArray optJSONArray = jSONObject.optJSONArray("statistics");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            a("html", "statistics", u8Var.x(), sVar);
            return false;
        }
        this.e.a(1);
        this.e.a(d0.a(), jSONObject, u8Var.x(), u8Var.t());
        return true;
    }

    private boolean d(JSONObject jSONObject, u8 u8Var, s sVar) {
        z8 e0 = u8Var.e0();
        int optInt = jSONObject.optInt("allowCloseDelay", -1);
        if (optInt == -1) {
            a("banner", "allowCloseDelay", u8Var.x(), sVar);
            return false;
        }
        e0.a(optInt);
        String optString = jSONObject.optString("iconLink");
        if (TextUtils.isEmpty(optString)) {
            a("banner", "iconLink", u8Var.x(), sVar);
            return false;
        }
        int optInt2 = jSONObject.optInt("iconWidth", -1);
        int optInt3 = jSONObject.optInt("iconHeight", -1);
        if (optInt2 == -1 || optInt3 == -1) {
            a("banner", "iconWidth or iconHeight", u8Var.x(), sVar);
            return false;
        }
        e0.a(ImageData.newImageData(optString, optInt2, optInt3));
        String optString2 = jSONObject.optString("title");
        if (TextUtils.isEmpty(optString2)) {
            a("banner", "title", u8Var.x(), sVar);
            return false;
        }
        e0.b(optString2);
        String optString3 = jSONObject.optString("ctaText");
        if (!TextUtils.isEmpty(optString3)) {
            e0.a(optString3);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("statistics");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            a("banner", "statistics", u8Var.x(), sVar);
            return false;
        }
        this.e.a(1);
        this.e.a(e0.a(), jSONObject, u8Var.x(), u8Var.t());
        return true;
    }

    private boolean e(JSONObject jSONObject, u8 u8Var, s sVar) {
        c9 g0 = u8Var.g0();
        if (g0 == null) {
            return false;
        }
        String optString = jSONObject.optString("id");
        if (TextUtils.isEmpty(optString)) {
            a("video", "id", u8Var.x(), sVar);
            return false;
        }
        g0.d(optString);
        int optInt = jSONObject.optInt("allowCloseDelay", -1);
        if (optInt == -1) {
            a("video", "allowCloseDelay", u8Var.x(), sVar);
            return false;
        }
        g0.a(optInt);
        g0.b(jSONObject.optBoolean("closeOnClick", false));
        String optString2 = jSONObject.optString("adIconLink");
        if (!TextUtils.isEmpty(optString2)) {
            g0.a(ImageData.newImageData(optString2));
        }
        String optString3 = jSONObject.optString("adIconClickLink");
        if (!TextUtils.isEmpty(optString3)) {
            g0.a(optString3);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            a("video", "video", u8Var.x(), sVar);
            return false;
        }
        g0.a(optJSONObject.optBoolean("automute", true));
        String optString4 = optJSONObject.optString("previewLink");
        int optInt2 = optJSONObject.optInt("previewWidth", -1);
        int optInt3 = optJSONObject.optInt("previewHeight", -1);
        if (optInt2 != -1 && optInt3 != -1 && !TextUtils.isEmpty(optString4)) {
            g0.b(ImageData.newImageData(optString4, optInt2, optInt3));
        }
        String optString5 = optJSONObject.optString("closeActionText");
        if (!TextUtils.isEmpty(optString5)) {
            g0.b(optString5);
        }
        String optString6 = optJSONObject.optString("closeDelayActionText");
        if (!TextUtils.isEmpty(optString6)) {
            g0.c(optString6);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("mediafiles");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            a("video", "mediafiles", u8Var.x(), sVar);
            return false;
        }
        JSONObject optJSONObject2 = optJSONArray.optJSONObject(0);
        if (optJSONObject2 == null) {
            a("video", "mediafiles", u8Var.x(), sVar);
            return false;
        }
        int optInt4 = optJSONObject2.optInt("width", -1);
        if (optInt4 == -1) {
            a("video", "width", u8Var.x(), sVar);
            return false;
        }
        int optInt5 = optJSONObject2.optInt("height", -1);
        if (optInt5 == -1) {
            a("video", "height", u8Var.x(), sVar);
            return false;
        }
        String optString7 = optJSONObject2.optString("src");
        if (TextUtils.isEmpty(optString7)) {
            a("video", "src", u8Var.x(), sVar);
            return false;
        }
        int optInt6 = optJSONObject.optInt(IronSourceConstants.EVENTS_DURATION, -1);
        if (optInt6 == -1) {
            a("video", IronSourceConstants.EVENTS_DURATION, u8Var.x(), sVar);
            return false;
        }
        g0.b(optInt6);
        dj a = dj.a(optString7, optInt4, optInt5);
        int optInt7 = optJSONObject2.optInt(VastAttributes.BITRATE, -1);
        if (optInt7 != -1) {
            a.a(optInt7);
        }
        g0.a(a);
        JSONArray optJSONArray2 = jSONObject.optJSONArray("statistics");
        if (optJSONArray2 == null || optJSONArray2.length() == 0) {
            a("video", "statistics", u8Var.x(), sVar);
            return false;
        }
        this.e.a(2);
        this.e.a(g0.a(), jSONObject, u8Var.x(), u8Var.t());
        this.e.a(g0.a(), optJSONObject, u8Var.x(), u8Var.t());
        return true;
    }

    public boolean b(JSONObject jSONObject, u8 u8Var, s sVar) {
        a(jSONObject, u8Var);
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        int length = optJSONArray.length();
        boolean z = true;
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                return false;
            }
            String optString = optJSONObject.optString("type");
            optString.getClass();
            switch (optString) {
                case "banner":
                    if (!d(optJSONObject, u8Var, sVar)) {
                        return false;
                    }
                    z = hashSet.add("banner");
                    break;
                case "html":
                    if (!c(optJSONObject, u8Var, sVar)) {
                        return false;
                    }
                    z = hashSet.add("html");
                    break;
                case "video":
                    u8Var.a(c9.h());
                    if (e(optJSONObject, u8Var, sVar)) {
                        z = hashSet.add("video");
                        break;
                    } else {
                        u8Var.a((c9) null);
                        break;
                    }
                default:
                    return false;
            }
        }
        if (!z) {
            return false;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("styleSettings");
        if (optJSONObject2 != null) {
            a(optJSONObject2, u8Var.f0());
        }
        return true;
    }
}
