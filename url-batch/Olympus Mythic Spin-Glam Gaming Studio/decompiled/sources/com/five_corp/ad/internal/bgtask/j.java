package com.five_corp.ad.internal.bgtask;

import android.net.Uri;
import android.os.Build;
import com.five_corp.ad.BuildConfig;
import com.five_corp.ad.internal.t;
import com.ironsource.O6;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class j extends n {
    public final com.five_corp.ad.internal.logger.b c;
    public final t d;
    public final com.five_corp.ad.internal.http.d e;

    public j(com.five_corp.ad.internal.logger.b bVar, t tVar, com.five_corp.ad.internal.http.d dVar) {
        super(5);
        this.c = bVar;
        this.d = tVar;
        this.e = dVar;
    }

    @Override // com.five_corp.ad.internal.bgtask.n
    public final boolean c() {
        Uri.Builder a = com.five_corp.ad.internal.base_url.a.a(this.d.a.d, "log.fivecdm.com");
        a.path("rlog");
        String builder = a.toString();
        t tVar = this.d;
        com.five_corp.ad.internal.logger.b bVar = this.c;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sv", BuildConfig.VERSION_CODE);
        jSONObject.put("ssv", BuildConfig.SEMVER);
        jSONObject.put("pv", tVar.b.d);
        jSONObject.put(O6.w0, "Android");
        jSONObject.put("s", tVar.b.c);
        jSONObject.put("dv", Build.VERSION.RELEASE);
        jSONObject.put("hw", Build.MODEL);
        jSONObject.put("rt", System.currentTimeMillis());
        jSONObject.put("cr", tVar.b.b);
        jSONObject.put("l", Locale.getDefault().toString());
        jSONObject.put("i", tVar.c.appId);
        jSONObject.put("ncd", tVar.c.getNeedChildDirectedTreatment().value);
        jSONObject.put("maar", tVar.c.getFiveAdAgeRating().value);
        jSONObject.put("sui", tVar.d.b);
        com.five_corp.ad.internal.tracking_data.a a2 = tVar.f.a();
        String str = a2.a;
        if (str != null) {
            jSONObject.put("ty", str);
        }
        jSONObject.put("nt", a2.b ? "1" : "0");
        String str2 = bVar.b;
        if (str2 != null) {
            jSONObject.put("sl", str2);
        }
        String str3 = bVar.c;
        if (str3 != null) {
            jSONObject.put("ld", str3);
        }
        com.five_corp.ad.internal.beacon.b bVar2 = bVar.d;
        if (bVar2 != null) {
            jSONObject.put("t", bVar2.a);
            jSONObject.put("sti", bVar2.c);
            jSONObject.put("spt", bVar2.b.a);
        }
        jSONObject.put("ll", com.five_corp.ad.e.a(bVar.a));
        jSONObject.put("lm", bVar.e);
        com.five_corp.ad.internal.util.b a3 = this.e.a(builder, "POST", jSONObject.toString(), "application/json;charset=utf-8", null);
        return a3.a && ((com.five_corp.ad.internal.http.c) a3.c).a == 200;
    }
}
