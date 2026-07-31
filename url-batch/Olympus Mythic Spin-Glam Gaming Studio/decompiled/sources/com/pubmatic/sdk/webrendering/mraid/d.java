package com.pubmatic.sdk.webrendering.mraid;

import com.pubmatic.sdk.common.POBError;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class d implements g {
    d() {
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public boolean a() {
        return false;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public String b() {
        return "listenersChanged";
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public POBError a(JSONObject jSONObject, n nVar, boolean z) {
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        if (optJSONObject == null) {
            return new POBError(1009, "Invalid MRAID command for listenersChanged event");
        }
        nVar.listenerChanged(optJSONObject.optString("event", null), optJSONObject.optBoolean("hasListeners", false));
        return null;
    }
}
