package com.my.target;

import com.my.target.qb;
import com.my.target.tb;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class g9 extends v implements qb.a {
    private String a;

    private g9() {
    }

    public static void b(JSONObject jSONObject, y yVar, n nVar, s sVar) {
        y a = f0.a(yVar, nVar).a(jSONObject, sVar, x0.e);
        if (a != null) {
            yVar.a(a);
        }
    }

    public static v a() {
        return new g9();
    }

    @Override // com.my.target.qb.a
    public x a(JSONObject jSONObject, y yVar, n nVar, s sVar) {
        i8 a = j8.a(yVar, nVar).a(jSONObject, this.a, sVar, u.a(nVar.a()));
        if (a == null) {
            sVar.b(q.r);
            return null;
        }
        i9 d = i9.d();
        d.a(a);
        return d;
    }

    @Override // com.my.target.v
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i9 a(String str, y yVar, i9 i9Var, n nVar, tb.a aVar, tb tbVar, List list, s sVar) {
        if (v.b(str)) {
            return a(str, yVar, nVar, i9Var, sVar);
        }
        return a(str, yVar, i9Var, nVar, aVar, tbVar, list, sVar);
    }

    private i9 a(String str, y yVar, i9 i9Var, n nVar, tb.a aVar, tb tbVar, List list, s sVar) {
        JSONObject optJSONObject;
        jb b;
        u a = u.a(nVar.a());
        JSONObject a2 = v.a(str, aVar, tbVar, list, sVar, a);
        if (a2 == null) {
            sVar.b(q.j);
            return i9Var;
        }
        if (i9Var == null) {
            i9Var = i9.d();
        }
        this.a = a2.optString(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.k);
        JSONObject a3 = a(a2, nVar.i());
        JSONObject optJSONObject2 = a2.optJSONObject("settings");
        if (optJSONObject2 == null && a3 != null) {
            optJSONObject2 = a3.optJSONObject("settings");
        }
        if (optJSONObject2 != null && optJSONObject2.has("style")) {
            int optInt = optJSONObject2.optInt("style", 0);
            if (optInt != 1 && optInt != 2 && optInt != 3) {
                yVar.f(0);
            } else {
                yVar.f(optInt);
            }
        }
        if (a3 == null) {
            if (nVar.m() && (optJSONObject = a2.optJSONObject("mediation")) != null && (b = qb.a(this, yVar, nVar).b(optJSONObject, sVar)) != null) {
                i9Var.a(b);
            }
            sVar.b(q.m);
            return i9Var;
        }
        JSONArray optJSONArray = a3.optJSONArray("banners");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                if (optJSONObject3 != null) {
                    if ("additionalData".equals(optJSONObject3.optString("type", ""))) {
                        b(optJSONObject3, yVar, nVar, sVar);
                    } else {
                        i8 a4 = j8.a(yVar, nVar).a(optJSONObject3, this.a, sVar, a);
                        if (a4 != null) {
                            i9Var.a(a4);
                        }
                    }
                }
            }
            return i9Var;
        }
        sVar.b(q.r);
        return i9Var;
    }

    private i9 a(String str, y yVar, n nVar, i9 i9Var, s sVar) {
        vi a = vi.a(nVar, yVar);
        a.c(str);
        if (!a.c().isEmpty()) {
            return a(i9Var, a, yVar);
        }
        sVar.b(q.l);
        return i9Var;
    }

    private i9 a(i9 i9Var, vi viVar, y yVar) {
        i8 a;
        if (i9Var == null) {
            i9Var = i9.d();
        }
        int i = 0;
        eb ebVar = (eb) viVar.c().get(0);
        d9 m0 = d9.m0();
        m0.g(ebVar.l());
        m0.a(ebVar);
        m0.e(yVar.F());
        m0.x(ebVar.L());
        m0.f(ebVar.k());
        m0.a(yVar.a());
        int n = yVar.n();
        if (n >= 0) {
            m0.a(e2.a(n));
        }
        Boolean d = yVar.d();
        if (d != null) {
            ebVar.f(d.booleanValue());
        }
        Boolean f = yVar.f();
        if (f != null) {
            ebVar.g(f.booleanValue());
        }
        Boolean g = yVar.g();
        if (g != null) {
            ebVar.h(g.booleanValue());
        }
        Boolean k = yVar.k();
        if (k != null) {
            ebVar.l(k.booleanValue());
        }
        Boolean r = yVar.r();
        if (r != null) {
            m0.b(r.booleanValue());
        }
        Boolean z = yVar.z();
        if (z != null) {
            m0.d(z.booleanValue());
        }
        float e = yVar.e();
        if (e >= 0.0f) {
            ebVar.c(e);
        }
        m0.H().a(ebVar.H().b("click").c);
        m0.H().a(ebVar.H().b("ctaClick").c);
        m0.H().a(ebVar.H().b("urlResolved").c);
        m0.H().a(ebVar.H().b("webviewShown").c);
        m0.H().a(ebVar.H().b("webviewClosed").c);
        m0.H().a(ebVar.H().b("pageLoaded").c);
        m0.H().a(ebVar.H().b("pageLoadFailed").c);
        i9Var.a(m0);
        if (m0.E() == null) {
            m0.a(ebVar.E());
        }
        ArrayList c0 = ebVar.c0();
        int size = c0.size();
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj = c0.get(i);
            i++;
            c3 c3Var = (c3) obj;
            if (c3Var.d0() != null) {
                a = p8.a(c3Var);
            } else {
                a = c3Var.g0() != null ? r8.a(c3Var) : null;
            }
            if (a != null) {
                m0.a(a);
                break;
            }
        }
        return i9Var;
    }

    private JSONObject a(JSONObject jSONObject, String str) {
        if (!"fullscreen".equals(str) && !"rewarded".equals(str)) {
            return jSONObject.optJSONObject(str);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("fullscreen");
        return optJSONObject != null ? optJSONObject : jSONObject.optJSONObject("rewarded");
    }
}
