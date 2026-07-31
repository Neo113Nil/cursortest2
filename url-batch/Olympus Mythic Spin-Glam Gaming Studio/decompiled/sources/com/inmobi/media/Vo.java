package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class Vo {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : this.a.entrySet()) {
                jSONObject.put(String.valueOf(Uf.a((Tf) entry.getKey())), ((Uo) entry.getValue()).a());
            }
            return jSONObject;
        } catch (Exception e) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC3861aa.a(new Q2(e));
            return new JSONObject();
        }
    }
}
