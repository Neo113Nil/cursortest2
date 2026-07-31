package com.fyber.inneractive.sdk.network;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.adsdk.zmn.nps$$ExternalSyntheticBackportWithForwarding0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C4993ye;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
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

/* loaded from: classes6.dex */
public final class q0 extends t0 implements o {
    public final InneractiveAdRequest p;
    public HashMap q;
    public StringBuffer r;
    public final com.fyber.inneractive.sdk.serverapi.d s;
    public boolean t;
    public final com.fyber.inneractive.sdk.network.timeouts.request.a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(q qVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(qVar, g0.c.a(), rVar);
        com.fyber.inneractive.sdk.serverapi.c cVar = new com.fyber.inneractive.sdk.serverapi.c(rVar);
        this.t = false;
        this.o = true;
        this.p = inneractiveAdRequest;
        this.s = cVar;
        if (inneractiveAdRequest != null) {
            String a = com.fyber.inneractive.sdk.util.n1.a(inneractiveAdRequest.getSpotId());
            String mediationName = inneractiveAdRequest.getMediationName();
            com.fyber.inneractive.sdk.config.global.features.k kVar = (com.fyber.inneractive.sdk.config.global.features.k) rVar.a(com.fyber.inneractive.sdk.config.global.features.k.class);
            this.u = TextUtils.isEmpty(mediationName) ? new com.fyber.inneractive.sdk.network.timeouts.request.b(kVar, a) : new com.fyber.inneractive.sdk.network.timeouts.request.d(a, kVar, mediationName);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.o
    public final StringBuffer a() {
        return this.r;
    }

    @Override // com.fyber.inneractive.sdk.network.o
    public final Map b() {
        return this.q;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void c(long j) {
        super.c(j);
        IAlog.a("%s : NetworkRequestAd : set start connection timestamp", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void d() {
        super.d();
        IAlog.a("%s : NetworkRequestAd cancel by timeout - resolve request with no fill", IAlog.a(this));
        this.a = true;
        a((Object) null, (Exception) new k1("no fill", 204), false);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final byte[] f() {
        JSONArray jSONArray;
        byte[] bArr = new byte[0];
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            com.fyber.inneractive.sdk.config.global.r rVar = ((com.fyber.inneractive.sdk.serverapi.c) this.s).a;
            if (rVar != null) {
                jSONArray = com.fyber.inneractive.sdk.config.global.g.a(rVar.b, true);
                IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArray);
            } else {
                jSONArray = null;
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                jSONObject2.put(C4993ye.d, jSONArray);
                jSONObject.put("sdk_experiments", jSONObject2);
            }
            JSONArray a = IAConfigManager.N.w.a(com.fyber.inneractive.sdk.serverapi.b.a(this.p.getSpotId()));
            if (a != null && a.length() > 0) {
                jSONObject.put("user_sessions", a);
            }
            try {
                Object b = IAConfigManager.b();
                if (b != null) {
                    jSONObject.put("pub_extra_data", b);
                }
            } catch (JSONException e) {
                IAlog.a("Failed to add extra data to ad request body!", e, new Object[0]);
            }
            a(jSONObject);
            String jSONObject3 = jSONObject.toString();
            bArr = jSONObject3.getBytes(StandardCharsets.UTF_8);
            IAlog.a("request json body - %s", jSONObject3);
            IAlog.d("request json body - %s", jSONObject3);
            return bArr;
        } catch (Exception unused) {
            IAlog.a("Failed building body for ad request!", new Object[0]);
            return bArr;
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int j() {
        return q();
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final Map l() {
        int i = com.fyber.inneractive.sdk.config.k.a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.response");
        if (TextUtils.isEmpty(property)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("mockadnetworkresponseid", property);
        IAlog.a("NetworkRequestAd: Adding mock response header - %s", property);
        return hashMap;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final l1 p() {
        com.fyber.inneractive.sdk.network.timeouts.request.a aVar = this.u;
        return new l1(aVar.i, aVar.h);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        String str;
        String str2;
        int i = com.fyber.inneractive.sdk.config.k.a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        String a = TextUtils.isEmpty(property) ? com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u + IAConfigManager.N.i.e : com.fyber.inneractive.sdk.config.a.a(property, "clientRequestEnhancedXmlAd");
        if (this.p.getFloorPrice() != null) {
            String property2 = System.getProperty("ia.testEnvironmentConfiguration.name");
            a = TextUtils.isEmpty(property2) ? com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u + IAConfigManager.N.i.g : com.fyber.inneractive.sdk.config.a.a(property2, "clientRequestEnhancedXmlAd");
        }
        InneractiveAdRequest inneractiveAdRequest = this.p;
        com.fyber.inneractive.sdk.serverapi.d dVar = this.s;
        r0 r0Var = new r0(inneractiveAdRequest, dVar);
        r0Var.b = new HashMap();
        r0Var.a("fromSDK", Boolean.toString(true));
        r0Var.a("po", System.getProperty("ia.testEnvironmentConfiguration.number"));
        r0Var.a(POBConstants.KEY_SECURE, !com.fyber.inneractive.sdk.util.s.a() || IAConfigManager.N.q ? "1" : "0");
        r0Var.a("spotid", inneractiveAdRequest.getSpotId());
        String property3 = System.getProperty("ia.testEnvironmentConfiguration.chosenUnitId");
        if (property3 == null) {
            property3 = inneractiveAdRequest.getSelectedUnitConfig() == null ? null : ((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).a;
        }
        r0Var.a("uid", property3);
        IAConfigManager iAConfigManager = IAConfigManager.N;
        if (TextUtils.isEmpty(iAConfigManager.n)) {
            r0Var.a(com.safedk.android.analytics.brandsafety.m.Z, iAConfigManager.l);
        } else {
            r0Var.a(com.safedk.android.analytics.brandsafety.m.Z, iAConfigManager.l + "_" + iAConfigManager.n);
        }
        dVar.getClass();
        r0Var.a(InneractiveMediationDefs.GENDER_FEMALE, Integer.toString(372));
        com.fyber.inneractive.sdk.serverapi.c cVar = (com.fyber.inneractive.sdk.serverapi.c) dVar;
        List list = com.fyber.inneractive.sdk.serverapi.c.d;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf((Integer) it.next()));
            }
            r0Var.a("protocols", com.fyber.inneractive.sdk.util.o.a(arrayList));
        }
        List list2 = com.fyber.inneractive.sdk.serverapi.c.c;
        if (!list2.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(String.valueOf((Integer) it2.next()));
            }
            r0Var.a("api", com.fyber.inneractive.sdk.util.o.a(arrayList2));
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            r0Var.a("zip", iAConfigManager.j.getZipCode());
        }
        r0Var.a("a", Integer.toString(iAConfigManager.j.getAge()));
        InneractiveUserConfig.Gender gender = iAConfigManager.j.getGender();
        if (InneractiveUserConfig.Gender.MALE.equals(gender)) {
            r0Var.a("g", "m");
        } else if (InneractiveUserConfig.Gender.FEMALE.equals(gender)) {
            r0Var.a("g", InneractiveMediationDefs.GENDER_FEMALE);
        }
        r0Var.a("t", Long.toString(System.currentTimeMillis()));
        StringBuilder sb = new StringBuilder("2.2.0-Android-8.4.5");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb.append('-');
            sb.append(InneractiveAdManager.getDevPlatform());
        }
        r0Var.a("v", sb.toString());
        Boolean e = iAConfigManager.C.e();
        if (e != null) {
            r0Var.a("gdpr_privacy_consent", e.booleanValue() ? "1" : "0");
        }
        com.fyber.inneractive.sdk.config.g gVar = iAConfigManager.C;
        if (gVar != null) {
            Boolean bool = com.fyber.inneractive.sdk.util.o.a == null ? null : gVar.i;
            if (bool != null) {
                r0Var.a("lgpd_consent", bool.booleanValue() ? "1" : "0");
            }
            Boolean bool2 = iAConfigManager.C.j;
            if (bool2 != null && bool2.booleanValue()) {
                r0Var.a("coppaApplies", "1");
            }
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            String property4 = System.getProperty("ia.testEnvironmentConfiguration.device");
            com.fyber.inneractive.sdk.config.w wVar = com.fyber.inneractive.sdk.config.u.a;
            com.fyber.inneractive.sdk.config.v vVar = wVar.b;
            String str3 = vVar != null ? vVar.c : false ? "amazonId" : "aaid";
            if (TextUtils.isEmpty(property4)) {
                com.fyber.inneractive.sdk.config.v vVar2 = wVar.b;
                property4 = vVar2 != null ? vVar2.a : null;
            }
            r0Var.a(str3, property4);
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            com.fyber.inneractive.sdk.config.v vVar3 = com.fyber.inneractive.sdk.config.u.a.b;
            r0Var.a("dnt", Boolean.toString(vVar3 != null ? vVar3.b : false));
        }
        r0Var.a("dml", com.fyber.inneractive.sdk.util.k.j());
        int c = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.e());
        int c2 = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        if (c > 0 && c2 > 0) {
            r0Var.a("w", Integer.toString(c));
            r0Var.a("h", Integer.toString(c2));
        }
        int c3 = com.fyber.inneractive.sdk.util.o.c();
        r0Var.a("o", c3 == 1 ? "p" : c3 == 2 ? "l" : "u");
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            r0Var.a("ciso", com.fyber.inneractive.sdk.util.k.i());
            String str4 = cVar.b;
            r0Var.a("mcc", str4 == null ? "" : str4.substring(0, Math.min(3, str4.length())));
            String str5 = cVar.b;
            r0Var.a("mnc", str5 == null ? "" : str5.substring(Math.min(3, str5.length())));
            com.fyber.inneractive.sdk.util.a1 a2 = com.fyber.inneractive.sdk.util.a1.a();
            IAlog.a("ExchangeRequestParamsProvider: getNetwork : type: %s value: %s", a2, a2.b());
            r0Var.a("nt", a2.b());
            r0Var.a("crn", cVar.a());
        }
        r0Var.a("os", "Android");
        r0Var.a("lng", iAConfigManager.o);
        ArrayList arrayList3 = iAConfigManager.p;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            r0Var.a("in_lng", com.fyber.inneractive.sdk.util.o.a(arrayList3));
        }
        r0Var.a("bid", com.fyber.inneractive.sdk.util.o.a.getPackageName());
        r0Var.a("appv", com.fyber.inneractive.sdk.util.k.l());
        com.fyber.inneractive.sdk.config.g gVar2 = iAConfigManager.C;
        if (gVar2.m() == IabTcfGdprAppliesStatus.DOES_NOT_APPLY || com.fyber.inneractive.sdk.util.o.a == null) {
            str = null;
        } else {
            gVar2.o();
            if (gVar2.e == null) {
                gVar2.k();
            }
            str = gVar2.d;
            if (str == null) {
                str = gVar2.e;
            }
        }
        r0Var.a("gdpr_consent_data", str);
        com.fyber.inneractive.sdk.config.g gVar3 = iAConfigManager.C;
        if (com.fyber.inneractive.sdk.util.o.a == null) {
            gVar3.getClass();
            str2 = null;
        } else {
            str2 = gVar3.h;
        }
        r0Var.a("us_privacy", str2);
        r0Var.a("mute_video", Boolean.toString(iAConfigManager.k));
        r0Var.a("osv", Build.VERSION.RELEASE);
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.D.p;
        r0Var.a("ignitep", lVar != null ? lVar.a.d() : null);
        com.fyber.inneractive.sdk.ignite.l lVar2 = iAConfigManager.D.p;
        r0Var.a("ignitev", lVar2 != null ? lVar2.a.i() : null);
        HashMap hashMap = new HashMap();
        cVar.a(inneractiveAdRequest.getSpotId(), hashMap);
        for (Map.Entry entry : hashMap.entrySet()) {
            r0Var.a((String) entry.getKey(), (String) entry.getValue());
        }
        if (InneractiveAdManager.isCurrentUserAChild()) {
            r0Var.a("childMode", "1");
        }
        com.fyber.inneractive.sdk.ignite.l lVar3 = IAConfigManager.N.D.p;
        r0Var.a("odt", lVar3 != null ? lVar3.getOdt() : "");
        Double floorPrice = r0Var.a.getFloorPrice();
        r0Var.a("floorprice", floorPrice != null ? nps$$ExternalSyntheticBackportWithForwarding0.m(new BigDecimal(Double.toString(floorPrice.doubleValue())).setScale(5, RoundingMode.CEILING)).toPlainString() : null);
        String a3 = com.fyber.inneractive.sdk.util.f1.a(a, r0Var.b);
        if (!this.t) {
            IAlog.d("%s %s", "AD_REQUEST", a3);
            this.t = true;
        }
        return a3;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int s() {
        return this.u.f;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7 A[Catch: Exception -> 0x00a2, TryCatch #1 {Exception -> 0x00a2, blocks: (B:29:0x0081, B:31:0x0085, B:33:0x009b, B:37:0x00a7, B:38:0x00ad), top: B:28:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    @Override // com.fyber.inneractive.sdk.network.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o0 a(l lVar, Map map, int i) {
        StringBuffer stringBuffer;
        String str;
        List list;
        if (map != null) {
            HashMap hashMap = new HashMap();
            for (String str2 : map.keySet()) {
                if (str2 != null && (list = (List) map.get(str2)) != null && list.size() > 0) {
                    hashMap.put(str2.toLowerCase(Locale.US), (String) list.get(0));
                }
            }
            this.q = hashMap;
        }
        InputStream inputStream = lVar == null ? null : lVar.c;
        super.d(System.currentTimeMillis());
        IAlog.a("%s : NetworkRequestAd : set start read timestamp", IAlog.a(this));
        if (inputStream != null) {
            try {
                stringBuffer = com.fyber.inneractive.sdk.util.v.b(inputStream);
            } catch (Exception e) {
                IAlog.a("failed create response builder in network request ad for url: %s msg: %s", r(), e.getMessage());
                stringBuffer = null;
            }
            this.r = stringBuffer;
        }
        b(System.currentTimeMillis());
        o0 o0Var = new o0();
        try {
            HashMap hashMap2 = this.q;
            if (hashMap2 != null) {
                str = (String) hashMap2.get(n.RETURNED_AD_TYPE.key.toLowerCase(Locale.US));
                if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) {
                    o0Var.a = a(str == null ? Integer.parseInt(str) : 6, this, (com.fyber.inneractive.sdk.response.j) null);
                    return o0Var;
                }
            }
            str = null;
            o0Var.a = a(str == null ? Integer.parseInt(str) : 6, this, (com.fyber.inneractive.sdk.response.j) null);
            return o0Var;
        } catch (Exception e2) {
            b(System.currentTimeMillis());
            IAlog.a("failed parse ad network request url: %s msg: %s", r(), e2.getMessage());
            throw new n0(e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void b(long j) {
        super.b(j);
        IAlog.a("%s : NetworkRequestAd : set end read timestamp, total execution time: %d", IAlog.a(this), Integer.valueOf(q()));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final l a(String str) {
        IAlog.a("%s: NetworkRequestAd Ad request execution started, timeouts(connection: %d read: %d)", IAlog.a(this), Integer.valueOf(p().a), Integer.valueOf(p().b));
        return super.a(str);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void a(long j) {
        super.a(j);
        IAlog.a("%s : NetworkRequestAd : set end connection timestamp, total execution time: %d", IAlog.a(this), Integer.valueOf(q()));
    }

    public final void a(JSONObject jSONObject) {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.N.C;
        if (gVar == null) {
            IAlog.b("%sFailed to add GPP sections to GPP object, ConfigDataProtectionProvider is null!", IAlog.a(this));
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            com.fyber.inneractive.sdk.gpp.a aVar = gVar.m;
            String str = aVar.a.get() == null ? null : aVar.b;
            if (str != null && !str.trim().isEmpty()) {
                jSONObject2.put("gppSid", str);
            }
        } catch (JSONException e) {
            IAlog.a("%sFailed to add GPP sections to GPP object!", e, IAlog.a(this));
        }
        try {
            String str2 = gVar.m.d;
            if (str2 != null && !str2.trim().isEmpty()) {
                jSONObject2.put("gppEncodedString", str2);
            }
        } catch (JSONException e2) {
            IAlog.a("%sFailed to add GPP string to GPP object!", e2, IAlog.a(this));
        }
        if (jSONObject2.length() > 0) {
            try {
                jSONObject.put("gpp", jSONObject2);
                return;
            } catch (JSONException e3) {
                IAlog.a("%sFailed to add GPP to ad request body!", e3, IAlog.a(this));
                return;
            }
        }
        IAlog.a("%sGPP object is empty, not adding to request", IAlog.a(this));
    }
}
