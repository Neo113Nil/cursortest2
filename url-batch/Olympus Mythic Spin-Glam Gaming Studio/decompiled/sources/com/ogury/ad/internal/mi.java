package com.ogury.ad.internal;

import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class mi {
    public static li a(JSONObject zoneJson) {
        Intrinsics.checkNotNullParameter(zoneJson, "zoneJson");
        li liVar = new li();
        String optString = zoneJson.optString("url", "");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        Intrinsics.checkNotNullParameter(optString, "<set-?>");
        liVar.a = optString;
        String optString2 = zoneJson.optString("content", "");
        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
        Intrinsics.checkNotNullParameter(optString2, "<set-?>");
        liVar.b = optString2;
        String optString3 = zoneJson.optString("webViewId", zoneJson.optString("id", ""));
        Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
        Intrinsics.checkNotNullParameter(optString3, "<set-?>");
        liVar.c = optString3;
        JSONObject optJSONObject = zoneJson.optJSONObject("size");
        liVar.e = optJSONObject != null ? optJSONObject.optInt("width", -1) : -1;
        JSONObject optJSONObject2 = zoneJson.optJSONObject("size");
        liVar.d = optJSONObject2 != null ? optJSONObject2.optInt("height", -1) : -1;
        JSONObject optJSONObject3 = zoneJson.optJSONObject(X3.i.L);
        liVar.g = optJSONObject3 != null ? optJSONObject3.optInt(VastAttributes.HORIZONTAL_POSITION, -1) : -1;
        JSONObject optJSONObject4 = zoneJson.optJSONObject(X3.i.L);
        liVar.f = optJSONObject4 != null ? optJSONObject4.optInt(VastAttributes.VERTICAL_POSITION, -1) : -1;
        liVar.h = zoneJson.optBoolean("enableTracking", false);
        liVar.i = zoneJson.optBoolean("keepAlive", false);
        liVar.j = zoneJson.optBoolean("isLandingPage", false);
        return liVar;
    }
}
