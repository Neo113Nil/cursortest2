package com.five_corp.ad.internal;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.facebook.appevents.UserDataStore;
import com.five_corp.ad.BuildConfig;
import com.five_corp.ad.CreativeType;
import com.five_corp.ad.FiveAdConfig;
import com.five_corp.ad.MediationInfo;
import com.ironsource.O6;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class t {
    public final com.five_corp.ad.internal.base_url.a a;
    public final w b;
    public final FiveAdConfig c;
    public final y d;
    public final com.five_corp.ad.internal.context.n e;
    public final com.five_corp.ad.internal.tracking_data.b f;

    static {
        t.class.toString();
    }

    public t(com.five_corp.ad.internal.hub.global.b bVar, w wVar, FiveAdConfig fiveAdConfig, com.five_corp.ad.a aVar, y yVar, com.five_corp.ad.internal.time.a aVar2, com.five_corp.ad.internal.context.n nVar, com.five_corp.ad.internal.tracking_data.b bVar2) {
        this.a = new com.five_corp.ad.internal.base_url.a(bVar, aVar);
        this.b = wVar;
        this.c = fiveAdConfig;
        this.d = yVar;
        this.e = nVar;
        this.f = bVar2;
    }

    public final void a(HashMap hashMap, com.five_corp.ad.internal.tracking_data.a aVar) {
        hashMap.put(O6.w0, "Android");
        hashMap.put("dv", Build.VERSION.RELEASE);
        hashMap.put("sv", String.valueOf(BuildConfig.VERSION_CODE));
        hashMap.put("s", this.b.c);
        hashMap.put("i", this.c.appId);
        hashMap.put("pv", this.b.d);
        hashMap.put("sui", this.d.b);
        String str = aVar.a;
        if (str != null) {
            hashMap.put("ty", str);
        }
        hashMap.put("nt", aVar.b ? "1" : "0");
        if (this.c.isTest) {
            hashMap.put(POBConstants.TEST_MODE, "1");
        }
        hashMap.put("ncd", String.valueOf(this.c.getNeedChildDirectedTreatment().value));
        hashMap.put("maar", String.valueOf(this.c.getFiveAdAgeRating().value));
    }

    public final String b(com.five_corp.ad.internal.context.i iVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("dv", Build.VERSION.RELEASE);
        hashMap.put("sv", String.valueOf(BuildConfig.VERSION_CODE));
        hashMap.put("pv", this.b.d);
        hashMap.put("s", this.b.c);
        hashMap.put("i", this.c.appId);
        hashMap.put("sl", iVar.b.a.b);
        hashMap.put(O6.w0, "Android");
        com.five_corp.ad.internal.tracking_data.a aVar = iVar.b.d;
        hashMap.put("nt", aVar.b ? "1" : "0");
        String str = aVar.a;
        if (str != null) {
            hashMap.put("ty", str);
        }
        if (this.c.isTest) {
            hashMap.put(POBConstants.TEST_MODE, "1");
        }
        com.five_corp.ad.internal.base_url.a aVar2 = this.a;
        return a(com.five_corp.ad.internal.base_url.a.a(aVar2.d, aVar2.a), "/v1/chk", hashMap);
    }

    public static String a(Uri.Builder builder, String str, HashMap hashMap) {
        builder.path(str);
        for (Map.Entry entry : hashMap.entrySet()) {
            builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builder.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(com.five_corp.ad.internal.beacon.a aVar) {
        com.five_corp.ad.internal.ad.beacon.f fVar;
        ArrayList<com.five_corp.ad.internal.ad.beacon.g> arrayList;
        com.five_corp.ad.internal.ad.a aVar2 = aVar.c;
        long j = aVar.i;
        com.five_corp.ad.internal.context.g gVar = aVar.a;
        String str = gVar.b;
        int i = aVar.e;
        com.five_corp.ad.internal.ad.beacon.a aVar3 = aVar.k;
        HashMap hashMap = new HashMap();
        a(hashMap, aVar.d);
        hashMap.put("ld", gVar.a);
        hashMap.put("sl", gVar.b);
        if (aVar.b == com.five_corp.ad.internal.context.f.NATIVE) {
            hashMap.put("isnt", "1");
        }
        hashMap.put("t", aVar2.b);
        hashMap.put(POBConstants.KEY_AT, String.valueOf(aVar2.c));
        hashMap.put("ss", aVar.f.a() ? "1" : "0");
        hashMap.put("pt", String.valueOf(aVar.h));
        hashMap.put("it", String.valueOf(j));
        hashMap.put(UserDataStore.CITY, String.valueOf(aVar2.a.value));
        hashMap.put("tp", String.valueOf(com.five_corp.ad.internal.ad.beacon.b.a(i)));
        hashMap.put("spt", String.valueOf(aVar.g.a));
        com.five_corp.ad.internal.ad.format_config.a a = com.five_corp.ad.internal.ad.a.a(aVar2, str);
        if (a != null) {
            hashMap.put("sti", String.valueOf(a.a));
        }
        double d = aVar.j;
        if (d >= 0.0d) {
            hashMap.put("mvar", String.format(Locale.US, "%.3f", Double.valueOf(d)));
        }
        String str2 = aVar2.A;
        if (str2 != null) {
            hashMap.put("ext", str2);
        }
        if (aVar3 != null) {
            hashMap.put("clkt", String.valueOf(com.five_corp.ad.internal.ad.beacon.c.a(aVar3.a)));
            hashMap.put("vims", String.valueOf(com.five_corp.ad.internal.ad.beacon.h.a(aVar3.b)));
            hashMap.put("tms", String.valueOf(aVar3.c));
            if (aVar3.a == 2) {
                hashMap.put("ar", String.valueOf(aVar3.d.c));
                hashMap.put("vct", String.valueOf(aVar3.d.b.a));
                hashMap.put("vty", String.valueOf(aVar3.d.a.a));
            }
        }
        if (aVar2.a == CreativeType.MOVIE) {
            hashMap.put("vsar", String.format(Locale.US, "%.3f", Double.valueOf(aVar2.v.c)));
            hashMap.put("vvct", String.valueOf(aVar2.v.b.a));
            hashMap.put("vvty", String.valueOf(aVar2.v.a.a));
        }
        if (i == 3) {
            hashMap.put("bc", "1");
        }
        HashMap hashMap2 = aVar.l;
        if (hashMap2 != null) {
            for (Map.Entry entry : hashMap2.entrySet()) {
                hashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        int a2 = com.five_corp.ad.e.a(i);
        if (a2 == 0) {
            fVar = aVar2.w;
        } else if (a2 == 13) {
            fVar = aVar2.x;
        } else {
            arrayList = null;
            if (aVar3 != null) {
                ArrayList<com.five_corp.ad.internal.ad.beacon.f> arrayList2 = aVar2.y;
                if (arrayList2 != null) {
                    for (com.five_corp.ad.internal.ad.beacon.f fVar2 : arrayList2) {
                        if (aVar3.equals(fVar2.b)) {
                            break;
                        }
                    }
                }
                fVar2 = null;
                if (fVar2 != null) {
                    arrayList = fVar2.c;
                }
            } else {
                ArrayList arrayList3 = aVar2.y;
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.five_corp.ad.internal.ad.beacon.f fVar3 = (com.five_corp.ad.internal.ad.beacon.f) it.next();
                        if (fVar3.a == i) {
                            arrayList = fVar3.c;
                            break;
                        }
                    }
                }
            }
            if (arrayList != null) {
                for (com.five_corp.ad.internal.ad.beacon.g gVar2 : arrayList) {
                    hashMap.put(gVar2.a, gVar2.b);
                }
            }
            com.five_corp.ad.internal.base_url.a aVar4 = this.a;
            return a(com.five_corp.ad.internal.base_url.a.a(aVar4.d, aVar4.b), "bc", hashMap);
        }
        arrayList = fVar.c;
        if (arrayList != null) {
        }
        com.five_corp.ad.internal.base_url.a aVar42 = this.a;
        return a(com.five_corp.ad.internal.base_url.a.a(aVar42.d, aVar42.b), "bc", hashMap);
    }

    public final JSONObject a(com.five_corp.ad.internal.context.i iVar) {
        boolean a = this.e.a.a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ssv", BuildConfig.SEMVER);
        jSONObject.put("hw", Build.MODEL);
        jSONObject.put("make", this.b.a);
        jSONObject.put("l", Locale.getDefault().toString());
        jSONObject.put("ncd", this.c.getNeedChildDirectedTreatment().value);
        jSONObject.put("maar", this.c.getFiveAdAgeRating().value);
        Rect b = this.d.b();
        jSONObject.put("sw", b.width());
        jSONObject.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, b.height());
        jSONObject.put("cr", this.b.b);
        jSONObject.put("nexp", a);
        jSONObject.put("ssa", com.five_corp.ad.e.a(iVar.c.b));
        jSONObject.put("ssm", com.five_corp.ad.e.a(iVar.c.d.a));
        jSONObject.put("ifmt", iVar.a.a);
        jSONObject.put("ld", iVar.b.a.a);
        jSONObject.put("sui", this.d.b);
        MediationInfo mediationInfo = iVar.b.a.c;
        if (mediationInfo != null) {
            jSONObject.put("mn", mediationInfo.getName());
            jSONObject.put("mv", mediationInfo.getVersion());
        }
        jSONObject.put("rt", iVar.d);
        jSONObject.put("af", iVar.a.b);
        jSONObject.put("isnt", iVar.a == com.five_corp.ad.internal.context.f.NATIVE);
        return jSONObject;
    }

    public final com.five_corp.ad.internal.util.b a(com.five_corp.ad.internal.context.g gVar, com.five_corp.ad.internal.tracking_data.a aVar, com.five_corp.ad.internal.soundstate.d dVar) {
        boolean a = this.e.a.a();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(O6.w0, "Android");
            jSONObject.put("sv", String.valueOf(BuildConfig.VERSION_CODE));
            jSONObject.put("ssv", BuildConfig.SEMVER);
            jSONObject.put("dv", Build.VERSION.RELEASE);
            jSONObject.put("pv", this.b.d);
            jSONObject.put("s", this.b.c);
            jSONObject.put("i", this.c.appId);
            jSONObject.put("hw", Build.MODEL);
            jSONObject.put("cr", this.b.b);
            jSONObject.put("l", Locale.getDefault().toString());
            Rect b = this.d.b();
            jSONObject.put("sw", b.width());
            jSONObject.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, b.height());
            jSONObject.put("sui", this.d.b);
            String str = "1";
            if (this.c.isTest) {
                jSONObject.put(POBConstants.TEST_MODE, "1");
            }
            String str2 = aVar.a;
            if (str2 != null) {
                jSONObject.put("ty", str2);
            }
            if (!aVar.b) {
                str = "0";
            }
            jSONObject.put("nt", str);
            jSONObject.put("ncd", this.c.getNeedChildDirectedTreatment().value);
            jSONObject.put("maar", this.c.getFiveAdAgeRating().value);
            jSONObject.put("sl", gVar.b);
            jSONObject.put("ld", gVar.a);
            jSONObject.put("ssm", com.five_corp.ad.e.a(dVar.a));
            jSONObject.put("nexp", a);
            return new com.five_corp.ad.internal.util.b(true, null, "v1:".concat(new String(Base64.encode(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2))));
        } catch (JSONException e) {
            return new com.five_corp.ad.internal.util.b(false, new l(m.K5, null, e), null);
        }
    }

    public static JSONArray a(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.five_corp.ad.internal.beacon.j jVar = (com.five_corp.ad.internal.beacon.j) it.next();
            if (jVar != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.safedk.android.analytics.brandsafety.m.T, jVar.a);
                com.five_corp.ad.internal.beacon.i iVar = jVar.b;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(VastAttributes.HORIZONTAL_POSITION, iVar.a);
                jSONObject2.put(VastAttributes.VERTICAL_POSITION, iVar.b);
                jSONObject2.put("w", iVar.c);
                jSONObject2.put("h", iVar.d);
                jSONObject.put("pos", jSONObject2);
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }
}
