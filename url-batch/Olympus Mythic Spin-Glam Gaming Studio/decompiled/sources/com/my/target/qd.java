package com.my.target;

import android.text.TextUtils;
import com.my.target.tb;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class qd extends v {
    private qd() {
    }

    public static v a() {
        return new qd();
    }

    @Override // com.my.target.v
    public sd a(String str, y yVar, sd sdVar, n nVar, tb.a aVar, tb tbVar, List list, s sVar) {
        JSONObject a = v.a(str, aVar, tbVar, list, sVar);
        if (a == null) {
            sVar.b(q.j);
            return null;
        }
        JSONArray names = a.names();
        if (names == null) {
            sVar.b(q.i);
            return null;
        }
        td a2 = td.a(yVar, nVar);
        boolean z = false;
        sd sdVar2 = null;
        int i = 0;
        while (true) {
            if (i >= names.length()) {
                break;
            }
            String optString = names.optString(i);
            if (("appwall".equals(optString) || "showcaseApps".equals(optString) || "showcaseGames".equals(optString) || "showcase".equals(optString)) && (sdVar2 = a(optString, a, a2, yVar, nVar)) != null && !sdVar2.c().isEmpty()) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            sdVar2.a(yVar.H());
            sdVar2.a(a);
            return sdVar2;
        }
        sVar.b(q.m);
        return null;
    }

    private sd a(String str, JSONObject jSONObject, td tdVar, y yVar, n nVar) {
        JSONArray optJSONArray;
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("banners")) == null || optJSONArray.length() <= 0) {
            return null;
        }
        sd b = sd.b(str);
        tdVar.a(optJSONObject, b);
        nd a = nd.a(b, yVar, nVar);
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
            if (optJSONObject2 != null) {
                md t0 = md.t0();
                a.a(optJSONObject2, t0);
                String g = t0.g();
                if (!TextUtils.isEmpty(g)) {
                    t0.f(jg.a(g));
                }
                b.a(t0);
            }
        }
        return b;
    }
}
