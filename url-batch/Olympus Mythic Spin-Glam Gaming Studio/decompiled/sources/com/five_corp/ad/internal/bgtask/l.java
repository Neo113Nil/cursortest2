package com.five_corp.ad.internal.bgtask;

import android.net.Uri;
import android.os.Build;
import com.five_corp.ad.BuildConfig;
import com.five_corp.ad.internal.t;
import com.ironsource.O6;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class l extends n {
    public final com.five_corp.ad.internal.beacon.l c;
    public final t d;
    public final com.five_corp.ad.internal.http.d e;

    public l(com.five_corp.ad.internal.beacon.l lVar, t tVar, com.five_corp.ad.internal.http.d dVar) {
        super(6);
        this.c = lVar;
        this.d = tVar;
        this.e = dVar;
    }

    @Override // com.five_corp.ad.internal.bgtask.n
    public final boolean c() {
        Uri.Builder a = com.five_corp.ad.internal.base_url.a.a(this.d.a.d, "log.fivecdm.com");
        a.path("vclog");
        String builder = a.toString();
        t tVar = this.d;
        com.five_corp.ad.internal.beacon.l lVar = this.c;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("i", tVar.c.appId);
        jSONObject.put("sl", lVar.a);
        jSONObject.put(O6.w0, "Android");
        jSONObject.put("dv", Build.VERSION.RELEASE);
        jSONObject.put("hw", Build.MODEL);
        jSONObject.put("pv", tVar.b.d);
        jSONObject.put("ssv", BuildConfig.SEMVER);
        jSONObject.put("t", lVar.b);
        jSONObject.put("mir", lVar.c.c);
        jSONObject.put("mvr", lVar.c.a);
        jSONObject.put("air", lVar.c.d);
        jSONObject.put("avr", lVar.c.b);
        com.five_corp.ad.internal.beacon.i iVar = lVar.d.a;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(VastAttributes.HORIZONTAL_POSITION, iVar.a);
        jSONObject2.put(VastAttributes.VERTICAL_POSITION, iVar.b);
        jSONObject2.put("w", iVar.c);
        jSONObject2.put("h", iVar.d);
        jSONObject.put("mpos", jSONObject2);
        com.five_corp.ad.internal.beacon.i iVar2 = lVar.d.b;
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(VastAttributes.HORIZONTAL_POSITION, iVar2.a);
        jSONObject3.put(VastAttributes.VERTICAL_POSITION, iVar2.b);
        jSONObject3.put("w", iVar2.c);
        jSONObject3.put("h", iVar2.d);
        jSONObject.put("apos", jSONObject3);
        jSONObject.put("mobs", t.a(lVar.d.c));
        jSONObject.put("aobs", t.a(lVar.d.d));
        jSONObject.put("mfrs", t.a(lVar.d.e));
        jSONObject.put("afrs", t.a(lVar.d.f));
        int i = lVar.d.g;
        if (i != 1) {
            jSONObject.put("vur", com.five_corp.ad.e.a(i));
        }
        com.five_corp.ad.internal.util.b a2 = this.e.a(builder, "POST", jSONObject.toString(), "application/json;charset=utf-8", null);
        return a2.a && ((com.five_corp.ad.internal.http.c) a2.c).a == 200;
    }
}
