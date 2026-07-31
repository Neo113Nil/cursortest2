package com.pubmatic.sdk.webrendering.mraid;

import com.pubmatic.sdk.common.POBError;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class l implements g {
    l() {
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public boolean a() {
        return false;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public String b() {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.h;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public POBError a(JSONObject jSONObject, n nVar, boolean z) {
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        if (optJSONObject == null) {
            return new POBError(1009, "Invalid MRAID command for orientation event");
        }
        nVar.setOrientation(optJSONObject.optBoolean("allowOrientationChange", false), optJSONObject.optString("forceOrientation", null), z);
        return null;
    }
}
