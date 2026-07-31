package io.bidmachine.analytics.internal.G;

import com.ironsource.C4573ba;
import io.bidmachine.analytics.internal.g.C5903e;
import io.bidmachine.analytics.internal.g.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class f {
    public static final e a(C5903e c5903e) {
        byte[] bArr;
        JSONObject a;
        String jSONObject;
        String c = c5903e.c();
        String d = c5903e.d();
        long f = c5903e.f();
        String a2 = c5903e.a();
        String jSONObject2 = a(c5903e.e()).toString();
        h b = c5903e.b();
        if (b == null || (a = g.a(b)) == null || (jSONObject = a.toString()) == null || (bArr = jSONObject.getBytes(Charsets.UTF_8)) == null) {
            bArr = new byte[0];
        }
        return new e(c, d, f, a2, jSONObject2, bArr, c5903e.g());
    }

    public static final C5903e a(e eVar) {
        return new C5903e(eVar.c(), eVar.d(), eVar.f(), eVar.a(), a(new JSONObject(eVar.e())), eVar.b().length == 0 ? null : g.a(new JSONObject(new String(eVar.b(), Charsets.UTF_8))), eVar.g());
    }

    public static final JSONObject a(C5903e.a aVar) {
        JSONObject jSONObject = new JSONObject();
        if (aVar instanceof C5903e.a.C1734a) {
            jSONObject.put("type", C4573ba.n);
            C5903e.a.C1734a c1734a = (C5903e.a.C1734a) aVar;
            jSONObject.put("tag", c1734a.b());
            jSONObject.put("path", c1734a.a());
        } else if (aVar instanceof C5903e.a.b) {
            jSONObject.put("type", "pur");
            C5903e.a.b bVar = (C5903e.a.b) aVar;
            jSONObject.put("tag", bVar.d());
            jSONObject.put("path", bVar.a());
            jSONObject.putOpt("query", bVar.b());
            jSONObject.put("shouldRep", bVar.c());
        }
        return jSONObject;
    }

    public static final C5903e.a a(JSONObject jSONObject) {
        if (Intrinsics.areEqual(jSONObject.optString("type", C4573ba.n), "pur")) {
            return new C5903e.a.b(jSONObject.optString("tag"), jSONObject.optString("path"), jSONObject.has("query") ? jSONObject.optString("query") : null, jSONObject.optBoolean("shouldRep", true));
        }
        return new C5903e.a.C1734a(jSONObject.optString("tag"), jSONObject.optString("path"));
    }
}
