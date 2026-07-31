package com.pubmatic.sdk.webrendering.mraid;

import com.pubmatic.sdk.common.POBError;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class i implements g {
    i() {
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public boolean a() {
        return true;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public String b() {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.e;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public POBError a(JSONObject jSONObject, n nVar, boolean z) {
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        if (optJSONObject == null) {
            return new POBError(1009, "Invalid MRAID command for expand() event");
        }
        nVar.expand(optJSONObject.optString("url", null), z, optJSONObject.optBoolean("useCustomClose", false));
        return null;
    }
}
