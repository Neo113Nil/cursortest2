package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class x {
    public final JSONObject a = new JSONObject();

    public final x a(Object obj, String str) {
        try {
            this.a.put(str, obj);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", str, obj);
        }
        return this;
    }
}
