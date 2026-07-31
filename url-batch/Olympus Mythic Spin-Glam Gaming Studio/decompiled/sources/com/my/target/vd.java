package com.my.target;

import com.my.target.qb;
import com.my.target.tb;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class vd extends v implements qb.a {
    private vd() {
    }

    public static v a() {
        return new vd();
    }

    @Override // com.my.target.qb.a
    public x a(JSONObject jSONObject, y yVar, n nVar, s sVar) {
        hd f = hd.f();
        y2 a = y2.a(yVar, nVar);
        sc a2 = sc.a(nVar.a().a(a.a(jSONObject, u.a(nVar.a()).a("<mediationBanner>"), "<no-banner-id>")), null, nVar.c());
        a.a(jSONObject, a2);
        f.a(a2);
        return f;
    }

    @Override // com.my.target.v
    public hd a(String str, y yVar, hd hdVar, n nVar, tb.a aVar, tb tbVar, List list, s sVar) {
        u a = u.a(nVar.a());
        hd a2 = a(str, yVar, hdVar, nVar, aVar, tbVar, list, sVar, a, null);
        if (a2 == null) {
            return a2;
        }
        a(a2, a);
        return a2;
    }

    private hd a(String str, y yVar, hd hdVar, n nVar, tb.a aVar, tb tbVar, List list, s sVar, u uVar, sh shVar) {
        JSONObject optJSONObject;
        uVar.b(3000);
        JSONObject a = v.a(str, aVar, tbVar, list, sVar, uVar);
        rj rjVar = null;
        if (a == null) {
            sVar.b(q.j);
            return null;
        }
        hd f = hdVar == null ? hd.f() : hdVar;
        JSONObject optJSONObject2 = a.optJSONObject(nVar.i());
        if (optJSONObject2 == null) {
            if (nVar.m() && (optJSONObject = a.optJSONObject("mediation")) != null) {
                jb b = qb.a(this, yVar, nVar).b(optJSONObject, sVar);
                if (b != null) {
                    f.a(b);
                    return f;
                }
            }
            sVar.b(q.m);
            uVar.a(nVar.i()).a(3006, "Section-format is not found");
            return null;
        }
        JSONArray optJSONArray = optJSONObject2.optJSONArray("banners");
        u a2 = uVar.a("banners");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            y2 a3 = y2.a(yVar, nVar);
            int d = nVar.d();
            if (d > 0) {
                int length = optJSONArray.length();
                if (d > length) {
                    d = length;
                }
            } else {
                d = 1;
            }
            int i = 0;
            while (i < d) {
                u c = a2.c(i);
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                if (optJSONObject3 != null) {
                    w0 a4 = nVar.a().a(a3.a(optJSONObject3, c, "<no-banner-id" + i + ">"));
                    x0 a5 = c.a(a4);
                    JSONObject optJSONObject4 = a.optJSONObject("featureFlags");
                    sc a6 = sc.a(a4, shVar, optJSONObject4 != null ? v.a(optJSONObject4, a5) : rjVar, nVar.c());
                    a3.a(optJSONObject3, a6, a5);
                    f.a(a6);
                } else {
                    c.d(3007);
                }
                i++;
                rjVar = null;
            }
            if (f.a() > 0) {
                return f;
            }
            sVar.b(q.i);
            uVar.a(3008, "getBannersCount()==" + f.a());
            return null;
        }
        sVar.b(q.r);
        if (optJSONArray == null) {
            a2.a(3006);
        } else {
            sVar.d();
        }
        return null;
    }

    private boolean a(hd hdVar, u uVar) {
        int i = 0;
        boolean z = true;
        for (sc scVar : hdVar.c()) {
            int i2 = i + 1;
            z &= scVar.H().a(uVar.a("<banner>").c(i).a(scVar.f()).a("<stats>"));
            i = i2;
        }
        return z;
    }
}
