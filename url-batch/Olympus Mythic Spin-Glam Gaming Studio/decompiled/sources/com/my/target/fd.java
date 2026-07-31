package com.my.target;

import com.my.target.qb;
import com.my.target.tb;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class fd extends v implements qb.a {
    private fd() {
    }

    public static v a() {
        return new fd();
    }

    @Override // com.my.target.qb.a
    public x a(JSONObject jSONObject, y yVar, n nVar, s sVar) {
        hd f = hd.f();
        tc a = tc.a(yVar, nVar);
        u a2 = u.a(nVar.a()).a("<mediationBanner>");
        w0 a3 = nVar.a().a(a.a(jSONObject, a2, "<no-banner-id>"));
        sc a4 = sc.a(a3, null, nVar.c());
        a.a(jSONObject, a4, sVar, a2.a(a3), null);
        f.a(a4);
        return f;
    }

    @Override // com.my.target.v
    public hd a(String str, y yVar, hd hdVar, n nVar, tb.a aVar, tb tbVar, List list, s sVar) {
        u a = u.a(nVar.a());
        hd a2 = a(str, yVar, hdVar, nVar, aVar, tbVar, list, sVar, a);
        if (a2 == null) {
            return a2;
        }
        a(a2, a);
        return a2;
    }

    private hd a(String str, y yVar, hd hdVar, n nVar, tb.a aVar, tb tbVar, List list, s sVar, u uVar) {
        int i;
        tc tcVar;
        int i2;
        u uVar2;
        long j;
        int i3;
        JSONArray jSONArray;
        int i4;
        int i5;
        u uVar3;
        rj rjVar;
        sh shVar;
        sh shVar2;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        uVar.b(3000);
        JSONObject a = v.a(str, aVar, tbVar, list, sVar, uVar);
        if (a == null) {
            sVar.b(q.j);
            return null;
        }
        hd f = hdVar == null ? hd.f() : hdVar;
        long j2 = 0;
        f.a(a.optLong("timestamp", 0L));
        JSONObject optJSONObject3 = a.optJSONObject(nVar.i());
        if (optJSONObject3 == null) {
            if (nVar.m() && (optJSONObject2 = a.optJSONObject("mediation")) != null) {
                jb b = qb.a(this, yVar, nVar).b(optJSONObject2, sVar);
                if (b != null) {
                    f.a(b);
                    return f;
                }
            }
            sVar.b(q.m);
            uVar.a(nVar.i()).a(3006, "Section-format is not found");
            return null;
        }
        JSONArray optJSONArray = optJSONObject3.optJSONArray("banners");
        u a2 = uVar.a("banners");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            tc a3 = tc.a(yVar, nVar);
            int d = nVar.d();
            if (d > 0) {
                int length = optJSONArray.length();
                i = d > length ? length : d;
            } else {
                i = 1;
            }
            int i6 = 0;
            while (i6 < i) {
                u c = a2.c(i6);
                JSONObject optJSONObject4 = optJSONArray.optJSONObject(i6);
                if (optJSONObject4 != null) {
                    w0 a4 = nVar.a().a(a3.a(optJSONObject4, c, "<no-banner-id" + i6 + ">"));
                    x0 a5 = c.a(a4);
                    JSONObject optJSONObject5 = a.optJSONObject("featureFlags");
                    if (optJSONObject5 != null) {
                        JSONObject optJSONObject6 = optJSONObject5.optJSONObject("statistics");
                        if (optJSONObject6 == null || (optJSONObject = optJSONObject6.optJSONObject("retry")) == null) {
                            i4 = i6;
                            i5 = i;
                            uVar3 = a2;
                            j = 0;
                        } else {
                            i4 = i6;
                            i5 = i;
                            long optLong = optJSONObject.optLong(POBCTAOverlayData.KEY_CTA_DELAY);
                            uVar3 = a2;
                            int optInt = optJSONObject.optInt("count", 1);
                            j = 0;
                            if (optLong > 0) {
                                shVar2 = new sh(new xh(optLong, optInt));
                                rjVar = v.a(optJSONObject5, a5);
                                shVar = shVar2;
                            }
                        }
                        shVar2 = null;
                        rjVar = v.a(optJSONObject5, a5);
                        shVar = shVar2;
                    } else {
                        i4 = i6;
                        i5 = i;
                        uVar3 = a2;
                        j = 0;
                        rjVar = null;
                        shVar = null;
                    }
                    sc a6 = sc.a(a4, shVar, rjVar, nVar.c());
                    tc tcVar2 = a3;
                    i3 = i4;
                    i2 = i5;
                    tcVar = a3;
                    uVar2 = uVar3;
                    jSONArray = optJSONArray;
                    tcVar2.a(optJSONObject4, a6, sVar, a5, shVar);
                    f.a(a6);
                } else {
                    tcVar = a3;
                    i2 = i;
                    uVar2 = a2;
                    j = j2;
                    i3 = i6;
                    jSONArray = optJSONArray;
                    c.d(3007);
                }
                i6 = i3 + 1;
                a2 = uVar2;
                i = i2;
                optJSONArray = jSONArray;
                j2 = j;
                a3 = tcVar;
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
        boolean z = true;
        int i = 0;
        for (sc scVar : hdVar.c()) {
            int i2 = i + 1;
            x0 a = uVar.a("<banner>").c(i).a(scVar.f());
            z &= scVar.H().a(a.a("<stats>"));
            Iterator it = scVar.c0().iterator();
            int i3 = 0;
            while (it.hasNext()) {
                z &= ((uc) it.next()).H().a(a.a("<card>").b(i3).a("<stats>"));
                i3++;
            }
            eb d0 = scVar.d0();
            if (d0 != null) {
                z &= d0.H().a(a.a("<videoBanner>").a("<stats>"));
            }
            i = i2;
        }
        return z;
    }
}
