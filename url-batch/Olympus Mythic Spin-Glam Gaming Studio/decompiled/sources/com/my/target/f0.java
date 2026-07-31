package com.my.target;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class f0 {
    private final y a;
    private final n b;
    private final ei c;

    private f0(y yVar, n nVar) {
        this.a = yVar;
        this.b = nVar;
        this.c = ei.a(yVar, nVar);
    }

    public static f0 a(y yVar, n nVar) {
        return new f0(yVar, nVar);
    }

    public y a(JSONObject jSONObject, s sVar, x0 x0Var) {
        JSONObject optJSONObject;
        rh a;
        int E = this.a.E();
        Boolean bool = null;
        if (E >= 5) {
            sVar.b(q.i);
            x0Var.c(3007, "rc limit");
            mi.a("AdditionalDataParser: Got additional data, but max redirects limit exceeded");
            return null;
        }
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            sVar.b(q.n);
            x0Var.a("url").c(3007);
            return null;
        }
        x0Var.b(3010, "url = " + optString);
        y b = y.b(optString);
        int optInt = jSONObject.optInt("id", this.a.u());
        b.e(E + 1);
        b.c(optInt);
        b.b(jSONObject.optBoolean("doAfter", b.I()));
        b.b(jSONObject.optInt("doOnEmptyResponseFromId", b.s()));
        b.c(jSONObject.optBoolean("isMidrollPoint", b.K()));
        float e = this.a.e();
        if (e < 0.0f) {
            e = (float) jSONObject.optDouble("allowCloseDelay", b.e());
        }
        b.a(e);
        Boolean d = this.a.d();
        if (d == null) {
            d = jSONObject.has("allowClose") ? Boolean.valueOf(jSONObject.optBoolean("allowClose")) : null;
        }
        b.b(d);
        Boolean f = this.a.f();
        if (f == null) {
            f = jSONObject.has("hasPause") ? Boolean.valueOf(jSONObject.optBoolean("hasPause")) : null;
        }
        b.c(f);
        Boolean h = this.a.h();
        if (h == null) {
            h = jSONObject.has("allowSeek") ? Boolean.valueOf(jSONObject.optBoolean("allowSeek")) : null;
        }
        b.e(h);
        Boolean i = this.a.i();
        if (i == null) {
            i = jSONObject.has("allowSkip") ? Boolean.valueOf(jSONObject.optBoolean("allowSkip")) : null;
        }
        b.f(i);
        Boolean j = this.a.j();
        if (j == null) {
            j = jSONObject.has("allowTrackChange") ? Boolean.valueOf(jSONObject.optBoolean("allowTrackChange")) : null;
        }
        b.g(j);
        Boolean z = this.a.z();
        if (z == null) {
            z = jSONObject.has("openInBrowser") ? Boolean.valueOf(jSONObject.optBoolean("openInBrowser")) : null;
        }
        b.l(z);
        Boolean r = this.a.r();
        if (r == null) {
            r = jSONObject.has("directLink") ? Boolean.valueOf(jSONObject.optBoolean("directLink")) : null;
        }
        b.j(r);
        Boolean g = this.a.g();
        if (g == null) {
            g = jSONObject.has("allowReplay") ? Boolean.valueOf(jSONObject.optBoolean("allowReplay")) : null;
        }
        b.d(g);
        Boolean c = this.a.c();
        if (c == null) {
            c = jSONObject.has("allowBackButton") ? Boolean.valueOf(jSONObject.optBoolean("allowBackButton")) : null;
        }
        b.a(c);
        Boolean k = this.a.k();
        if (k == null) {
            k = jSONObject.has("automute") ? Boolean.valueOf(jSONObject.optBoolean("automute")) : null;
        }
        b.h(k);
        Boolean l = this.a.l();
        if (l == null) {
            l = jSONObject.has("autoplay") ? Boolean.valueOf(jSONObject.optBoolean("autoplay")) : null;
        }
        b.i(l);
        int F = this.a.F();
        if (F < 0) {
            F = jSONObject.optInt("style", b.F());
        }
        b.f(F);
        int n = this.a.n();
        if (n < 0) {
            n = jSONObject.optInt("clickArea", b.n());
        }
        b.a(n);
        Boolean J = this.a.J();
        if (J != null) {
            bool = J;
        } else if (jSONObject.has("logErrors")) {
            bool = Boolean.valueOf(jSONObject.optBoolean("logErrors"));
        }
        b.k(bool);
        float A = this.a.A();
        if (A < 0.0f && jSONObject.has("point")) {
            A = (float) jSONObject.optDouble("point");
            if (A < 0.0f) {
                x0Var.c(3007, "point=-1.0");
                A = -1.0f;
            }
        }
        b.b(A);
        float B = this.a.B();
        if (B < 0.0f && jSONObject.has("pointP")) {
            B = (float) jSONObject.optDouble("pointP");
            if (B < 0.0f || B > 100.0f) {
                x0Var.c(3007, "pointP=" + B);
                B = -1.0f;
            }
        }
        b.c(B);
        b.a(this.a.v());
        b.a(a(this.a.x(), jSONObject.optJSONObject("omdata")));
        JSONArray optJSONArray = jSONObject.optJSONArray("serviceStatistics");
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                if (optJSONObject2 != null && (a = this.c.a(optJSONObject2, -1.0f)) != null) {
                    b.a(a);
                }
            }
        }
        this.c.a(b.m(), jSONObject, String.valueOf(b.u()), -1.0f);
        e a2 = this.a.a();
        if (a2 == null && (optJSONObject = jSONObject.optJSONObject("adChoices")) != null) {
            a2 = l.a().a(optJSONObject, null, b.a, this.b.j(), bool != null ? bool.booleanValue() : true, x0Var);
        }
        b.a(a2);
        String b2 = this.a.b();
        if (b2 == null && jSONObject.has("advertisingLabel")) {
            b2 = jSONObject.optString("advertisingLabel");
        }
        b.c(b2);
        return b;
    }

    private de a(de deVar, JSONObject jSONObject) {
        return jSONObject == null ? deVar : ee.a(this.b, this.a.b, true).a(deVar, jSONObject);
    }
}
