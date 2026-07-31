package com.ironsource.adqualitysdk.sdk.i;

import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.λ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0515 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f478;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject f479;

    public C0515(JSONObject jSONObject) {
        String uuid = UUID.randomUUID().toString();
        this.f479 = jSONObject;
        this.f478 = uuid;
    }

    public C0515(String str, JSONObject jSONObject) {
        this.f479 = jSONObject;
        this.f478 = str;
    }
}
