package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class h {
    public final String a;
    public final com.fyber.inneractive.sdk.response.a b;
    public final Map c;

    public h(JSONObject jSONObject, com.fyber.inneractive.sdk.response.a aVar, Map map) {
        try {
            this.a = jSONObject.getJSONObject("ad").optString("markup");
        } catch (JSONException e) {
            IAlog.a("Failed extracting markup", e, new Object[0]);
        }
        this.b = aVar;
        this.c = map;
    }
}
