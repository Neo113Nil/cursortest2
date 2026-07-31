package com.pubmatic.sdk.webrendering.mraid;

import com.pubmatic.sdk.common.POBError;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class k implements g {
    k() {
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public boolean a() {
        return true;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public String b() {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public POBError a(JSONObject jSONObject, n nVar, boolean z) {
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        if (optJSONObject == null) {
            return new POBError(1009, "Invalid MRAID command for orientation event");
        }
        nVar.resize(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0), optJSONObject.optInt("offsetX", 0), optJSONObject.optInt("offsetY", 0), optJSONObject.optBoolean("allowOffscreen", false), z);
        return null;
    }
}
