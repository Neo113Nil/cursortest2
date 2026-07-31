package com.five_corp.ad.internal.util;

import com.five_corp.ad.internal.l;
import com.five_corp.ad.internal.m;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class a {
    public static c a(JSONObject jSONObject) {
        return jSONObject.toString().getBytes(StandardCharsets.UTF_8).length >= 102400 ? new c(false, new l(m.c7, "userInfo json is too large", null)) : new c(true, null);
    }
}
