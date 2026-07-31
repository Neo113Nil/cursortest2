package com.ogury.ad.internal;

import com.my.target.common.DisclaimerAlias;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class r2 {
    public static t2 a(String errorResponseBody) {
        Intrinsics.checkNotNullParameter(errorResponseBody, "errorResponseBody");
        t2 t2Var = new t2();
        s2 s2Var = new s2();
        if (StringsKt.isBlank(errorResponseBody)) {
            Intrinsics.checkNotNullParameter(DisclaimerAlias.UNDEFINED, "<set-?>");
            Intrinsics.checkNotNullParameter("undefined error", "<set-?>");
            s2Var.a = "undefined error";
        } else {
            Intrinsics.checkNotNullParameter(errorResponseBody, "<this>");
            try {
                new JSONObject(errorResponseBody);
                JSONObject jSONObject = new JSONObject(errorResponseBody);
                if (jSONObject.has("error")) {
                    String optString = jSONObject.getJSONObject("error").optString("type", "UNSPECIFIED");
                    Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                    Intrinsics.checkNotNullParameter(optString, "<set-?>");
                    String optString2 = jSONObject.getJSONObject("error").optString("message", "unspecified error");
                    Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                    Intrinsics.checkNotNullParameter(optString2, "<set-?>");
                    s2Var.a = optString2;
                } else {
                    Intrinsics.checkNotNullParameter(DisclaimerAlias.UNDEFINED, "<set-?>");
                    Intrinsics.checkNotNullParameter("\"error\" key not found", "<set-?>");
                    s2Var.a = "\"error\" key not found";
                }
            } catch (Exception unused) {
                Intrinsics.checkNotNullParameter(DisclaimerAlias.UNDEFINED, "<set-?>");
                Intrinsics.checkNotNullParameter(errorResponseBody, "<set-?>");
                s2Var.a = errorResponseBody;
            }
        }
        Intrinsics.checkNotNullParameter(s2Var, "<set-?>");
        t2Var.a = s2Var;
        return t2Var;
    }
}
