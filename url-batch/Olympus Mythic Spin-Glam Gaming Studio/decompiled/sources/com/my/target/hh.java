package com.my.target;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class hh {
    private final y a;
    private final n b;
    private final y2 c;
    private boolean d = true;

    private hh(y yVar, n nVar) {
        this.a = yVar;
        this.b = nVar;
        this.c = y2.a(yVar, nVar);
    }

    public static hh a(y yVar, n nVar) {
        return new hh(yVar, nVar);
    }

    public boolean a(JSONObject jSONObject, gh ghVar, String str, s sVar) {
        int optInt;
        this.c.a(jSONObject, ghVar);
        this.d = ghVar.U();
        if (!"html".equals(ghVar.M())) {
            mi.a("StandardAdBannerParser: Standard banner with unsupported type " + ghVar.M());
            return false;
        }
        if (jSONObject.has("timeout") && (optInt = jSONObject.optInt("timeout")) >= 5) {
            ghVar.e(optInt);
        }
        String a = y2.a(jSONObject, sVar);
        if (TextUtils.isEmpty(a)) {
            sVar.b(q.q);
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            ghVar.A(str);
            String a2 = y2.a(str, a);
            if (a2 != null) {
                ghVar.B(a2);
                ghVar.y("mraid");
                a = a2;
            }
        }
        if (ghVar.E() != null) {
            a = fe.a(a);
        }
        ghVar.B(a);
        return true;
    }
}
