package com.my.target;

import android.text.TextUtils;
import com.ironsource.O6;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class qb {
    private final a a;
    private final y b;
    private final n c;
    private final ei d;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        x a(JSONObject jSONObject, y yVar, n nVar, s sVar);
    }

    private qb(a aVar, y yVar, n nVar) {
        this.a = aVar;
        this.b = yVar;
        this.c = nVar;
        this.d = ei.a(yVar, nVar);
    }

    public static qb a(a aVar, y yVar, n nVar) {
        return new qb(aVar, yVar, nVar);
    }

    public jb b(JSONObject jSONObject, s sVar) {
        kb a2;
        JSONArray optJSONArray = jSONObject.optJSONArray(O6.E1);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            sVar.b(q.v);
            return null;
        }
        jb c = jb.c();
        int optInt = jSONObject.optInt("refreshTimeout", c.a());
        if (optInt >= 0) {
            c.a(optInt);
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null && (a2 = a(optJSONObject, sVar)) != null) {
                c.a(a2);
            }
        }
        if (c.b()) {
            return c;
        }
        sVar.b(q.v);
        return null;
    }

    private kb a(JSONObject jSONObject, s sVar) {
        JSONObject optJSONObject;
        String optString = jSONObject.optString("name");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        String optString2 = jSONObject.optString("placementId");
        if (TextUtils.isEmpty(optString2)) {
            return null;
        }
        String optString3 = jSONObject.optString(O6.G1);
        if (TextUtils.isEmpty(optString3)) {
            return null;
        }
        kb a2 = kb.a(optString, optString2, optString3);
        if (a2.j() && (optJSONObject = jSONObject.optJSONObject("banner")) != null) {
            a2.a(this.a.a(optJSONObject, this.b, this.c, sVar));
        }
        String optString4 = jSONObject.optString("payload");
        if (!TextUtils.isEmpty(optString4)) {
            a2.a(optString4);
        }
        int optInt = jSONObject.optInt("timeout", a2.i());
        if (optInt > 0) {
            a2.a(optInt);
        }
        a2.a((float) jSONObject.optDouble(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, a2.f()));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("params");
        if (optJSONObject2 != null) {
            Iterator<String> keys = optJSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    a2.a(next, optJSONObject2.optString(next));
                }
            }
        }
        this.d.a(a2.h(), jSONObject, optString, -1.0f);
        return a2;
    }
}
