package com.my.target;

import com.my.target.qb;
import com.my.target.tb;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class lh extends v implements qb.a {
    private String a;

    private lh() {
    }

    private gh b(JSONObject jSONObject, y yVar, n nVar, s sVar) {
        hh a = hh.a(yVar, nVar);
        gh a0 = gh.a0();
        if (a.a(jSONObject, a0, this.a, sVar)) {
            return a0;
        }
        return null;
    }

    public static v a() {
        return new lh();
    }

    @Override // com.my.target.qb.a
    public x a(JSONObject jSONObject, y yVar, n nVar, s sVar) {
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("banners", jSONArray);
            new JSONObject().put(nVar.i(), jSONObject2);
            nh e = nh.e();
            gh b = b(jSONObject, yVar, nVar, sVar);
            if (b == null) {
                sVar.b(q.r);
                return null;
            }
            e.a(b);
            return e;
        } catch (Throwable unused) {
            sVar.b(q.k);
            return null;
        }
    }

    @Override // com.my.target.v
    public nh a(String str, y yVar, nh nhVar, n nVar, tb.a aVar, tb tbVar, List list, s sVar) {
        JSONObject optJSONObject;
        gh b;
        JSONObject optJSONObject2;
        jb b2;
        JSONObject a = v.a(str, aVar, tbVar, list, sVar);
        if (a == null) {
            sVar.b(q.j);
            return null;
        }
        if (nhVar == null) {
            nhVar = nh.e();
        }
        this.a = a.optString(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.k);
        JSONObject a2 = a(a, nVar.i());
        if (a2 == null) {
            if (nVar.m() && (optJSONObject2 = a.optJSONObject("mediation")) != null && (b2 = qb.a(this, yVar, nVar).b(optJSONObject2, sVar)) != null) {
                nhVar.a(b2);
                return nhVar;
            }
            sVar.b(q.m);
            return null;
        }
        JSONArray optJSONArray = a2.optJSONArray("banners");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            oh.a().a(a2, nhVar);
            if (optJSONArray.length() > 0 && (optJSONObject = optJSONArray.optJSONObject(0)) != null && (b = b(optJSONObject, yVar, nVar, sVar)) != null) {
                nhVar.a(b);
                return nhVar;
            }
            sVar.b(q.r);
            return null;
        }
        sVar.b(q.r);
        return null;
    }

    private JSONObject a(JSONObject jSONObject, String str) {
        str.getClass();
        switch (str) {
            case "standard_320x50":
                JSONObject optJSONObject = jSONObject.optJSONObject("standard");
                return optJSONObject != null ? optJSONObject : jSONObject.optJSONObject("standard_320x50");
            case "standard_728x90":
                JSONObject optJSONObject2 = jSONObject.optJSONObject("standard");
                return optJSONObject2 != null ? optJSONObject2 : jSONObject.optJSONObject("standard_728x90");
            case "standard":
                JSONObject optJSONObject3 = jSONObject.optJSONObject("standard");
                if (optJSONObject3 == null) {
                    optJSONObject3 = jSONObject.optJSONObject("standard_320x50");
                }
                return optJSONObject3 != null ? optJSONObject3 : jSONObject.optJSONObject("standard_728x90");
            default:
                return jSONObject.optJSONObject(str);
        }
    }
}
