package io.bidmachine.analytics.internal.G;

import io.bidmachine.analytics.internal.g.C5902d;
import io.bidmachine.analytics.internal.g.h;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class d {
    public static final c a(C5902d c5902d) {
        byte[] bArr;
        JSONObject a;
        String jSONObject;
        byte[] bytes = c5902d.a().isEmpty() ? new byte[0] : io.bidmachine.analytics.internal.I.g.a(c5902d.a()).toString().getBytes(Charsets.UTF_8);
        String c = c5902d.c();
        String d = c5902d.d();
        String e = c5902d.e();
        long f = c5902d.f();
        h b = c5902d.b();
        if (b == null || (a = g.a(b)) == null || (jSONObject = a.toString()) == null || (bArr = jSONObject.getBytes(Charsets.UTF_8)) == null) {
            bArr = new byte[0];
        }
        return new c(c, d, e, f, bytes, bArr);
    }

    public static final C5902d a(c cVar) {
        Map a;
        if (cVar.a().length == 0) {
            a = MapsKt.emptyMap();
        } else {
            a = io.bidmachine.analytics.internal.I.g.a(new JSONObject(new String(cVar.a(), Charsets.UTF_8)));
        }
        return new C5902d(cVar.c(), cVar.d(), cVar.e(), cVar.f(), a, cVar.b().length == 0 ? null : g.a(new JSONObject(new String(cVar.b(), Charsets.UTF_8))));
    }
}
