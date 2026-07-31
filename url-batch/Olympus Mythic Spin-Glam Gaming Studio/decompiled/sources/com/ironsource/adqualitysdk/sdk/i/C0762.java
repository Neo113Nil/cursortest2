package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.კ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C0762 extends AbstractC1173 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f1768 = StringFog.decrypt("laU2CM7ylmyEuQ==\n", "9spYZquR4gM=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String f1767 = StringFog.decrypt("Kw==\n", "WPc/6BRFBBo=\n") + UUID.randomUUID().toString().replace(StringFog.decrypt("rg==\n", "g8aGep4M0kw=\n"), "");

    public C0762(C0839 c0839) {
        this.f2997 = c0839;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m4159() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2998;
        }
        return jSONObject.has(this.f1768);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m4160(String str) {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2998;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(this.f1768);
        if (optJSONObject == null) {
            optJSONObject = IronSourceNetworkBridge.jsonObjectInit();
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
        if (optJSONObject2 != null) {
            return optJSONObject2.optString(StringFog.decrypt("qW5MD5CwU+q4V0cThrpI6w==\n", "ygEiYfXTJ4U=\n"));
        }
        return null;
    }
}
