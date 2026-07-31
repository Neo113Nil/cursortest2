package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.c4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4585c4 {
    public static final String a = "SSA_CORE.SDKController.runFunction";

    public static String a(C4603d4 c4603d4) {
        return String.format("%1$s('%2$s%3$s'%4$s)", a, c4603d4.b(), a(c4603d4.c()), b(c4603d4));
    }

    private static String b(C4603d4 c4603d4) {
        return (c4603d4.d() == null || c4603d4.a() == null) ? "" : String.format(", '%1$s', '%2$s'", c4603d4.d(), c4603d4.a());
    }

    private static String a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            return jSONObject.toString();
        }
        return "";
    }
}
