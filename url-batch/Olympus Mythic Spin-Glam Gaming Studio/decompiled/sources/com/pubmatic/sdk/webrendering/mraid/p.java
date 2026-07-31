package com.pubmatic.sdk.webrendering.mraid;

import com.pubmatic.sdk.common.POBError;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class p implements g {
    p() {
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public boolean a() {
        return true;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public String b() {
        return "playVideo";
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.g
    public POBError a(JSONObject jSONObject, n nVar, boolean z) {
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        if (optJSONObject == null) {
            return new POBError(1009, "Invalid MRAID command for playVideo event");
        }
        String optString = optJSONObject.optString("url", null);
        if (optString == null) {
            return new POBError(1009, "Invalid MRAID Url for playVideo event");
        }
        nVar.playVideo(optString, z);
        return null;
    }
}
