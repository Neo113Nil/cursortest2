package com.fyber.inneractive.sdk.cache.session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b implements Runnable {
    public final /* synthetic */ JSONObject a;
    public final /* synthetic */ c b;

    public b(c cVar, JSONObject jSONObject) {
        this.b = cVar;
        this.a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        e eVar = this.b.a;
        JSONObject jSONObject = this.a;
        eVar.getClass();
        for (com.fyber.inneractive.sdk.cache.session.enums.c cVar : com.fyber.inneractive.sdk.cache.session.enums.c.values()) {
            if (cVar != com.fyber.inneractive.sdk.cache.session.enums.c.NONE) {
                String name = cVar.name();
                JSONArray jSONArray = new JSONArray();
                try {
                    jSONArray = jSONObject.getJSONArray(name);
                } catch (JSONException unused) {
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    g a = g.a(jSONArray.optJSONObject(i));
                    if (a != null && a.a != 0) {
                        eVar.a(cVar, a);
                    }
                }
            }
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("currentSession");
        if (optJSONObject != null) {
            h hVar = new h();
            JSONArray jSONArray2 = new JSONArray();
            try {
                jSONArray2 = optJSONObject.getJSONArray("content");
            } catch (JSONException unused2) {
            }
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2 = jSONArray2.getJSONObject(i2);
                } catch (JSONException unused3) {
                }
                com.fyber.inneractive.sdk.cache.session.enums.c a2 = com.fyber.inneractive.sdk.cache.session.enums.c.a(jSONObject2.optString("type"), jSONObject2.optString("subType"));
                g a3 = g.a(jSONObject2.optJSONObject("session_data"));
                if (a3 != null) {
                    hVar.put(a2, a3);
                }
            }
            for (com.fyber.inneractive.sdk.cache.session.enums.c cVar2 : com.fyber.inneractive.sdk.cache.session.enums.c.values()) {
                if (cVar2 != com.fyber.inneractive.sdk.cache.session.enums.c.NONE && (gVar = (g) hVar.get(cVar2)) != null && gVar.a != 0) {
                    eVar.a(cVar2, gVar);
                }
            }
        }
        this.b.a.getClass();
    }
}
