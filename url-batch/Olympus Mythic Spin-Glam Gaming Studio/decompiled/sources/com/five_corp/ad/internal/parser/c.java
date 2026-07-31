package com.five_corp.ad.internal.parser;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class c {
    public static com.five_corp.ad.internal.g a(String str) {
        try {
            return new com.five_corp.ad.internal.g(h.a(new JSONObject(str).getJSONObject("mcfg")));
        } catch (NullPointerException e) {
            throw new JSONException(e.getMessage());
        }
    }
}
