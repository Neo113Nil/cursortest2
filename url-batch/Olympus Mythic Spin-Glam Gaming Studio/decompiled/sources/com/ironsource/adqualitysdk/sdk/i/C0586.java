package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ԁ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0586 extends AbstractC1173 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f973 = StringFog.decrypt("Kjb5\n", "T0KNFFJptEI=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f972 = StringFog.decrypt("mErJb68v\n", "7DioBttcpgs=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m4085() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2998;
        }
        return jSONObject.optString(f973);
    }
}
