package com.ironsource.mediationsdk;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.ironsource.C4565b2;
import com.ironsource.C4573ba;
import com.ironsource.C4637f2;
import com.ironsource.C4699ia;
import com.ironsource.C4701ic;
import com.ironsource.C4708j2;
import com.ironsource.C4782n4;
import com.ironsource.C4834q2;
import com.ironsource.C4966x5;
import com.ironsource.EnumC4984y5;
import com.ironsource.InterfaceC4986y7;
import com.ironsource.Kb;
import com.ironsource.O6;
import com.ironsource.U9;
import com.ironsource.W0;
import com.ironsource.X1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class d {
    public static final boolean A = false;
    private static d B = new d();
    public static final String c = "auctionId";
    public static final String d = "armData";
    public static final String e = "larmData";
    public static final String f = "isAdUnitCapped";
    public static final String g = "settings";
    public static final String h = "waterfall";
    public static final String i = "genericParams";
    public static final String j = "configurations";
    public static final String k = "instances";
    public static final String l = "${AUCTION_LOSS}";
    public static final String m = "${AUCTION_MBR}";
    public static final String n = "${AUCTION_PRICE}";
    public static final String o = "${DYNAMIC_DEMAND_SOURCE}";
    public static final String p = "${INSTANCE}";
    public static final String q = "${INSTANCE_TYPE}";
    public static final String r = "${PLACEMENT_NAME}";
    private static final String s = "adMarkup";
    private static final String t = "dynamicDemandSource";
    private static final String u = "params";
    public static final String v = "dlpl";
    public static final String w = "adUnit";
    public static final String x = "parallelLoad";
    public static final String y = "bidderExclusive";
    public static final String z = "showPriorityEnabled";
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final InterfaceC4986y7 b = Kb.Y().a();

    public static class a {
        private String a;
        private List<C4834q2> b;
        private C4834q2 c;
        private JSONObject d;
        private JSONObject e;
        private int f;
        private String g;
        private X1 h;

        public a(String str) {
            this.a = str;
        }

        public String a() {
            return this.a;
        }

        public JSONObject b() {
            return this.e;
        }

        public int c() {
            return this.f;
        }

        public String d() {
            return this.g;
        }

        public C4834q2 e() {
            return this.c;
        }

        public JSONObject f() {
            return this.d;
        }

        public X1 g() {
            return this.h;
        }

        public List<C4834q2> h() {
            return this.b;
        }

        public com.ironsource.mediationsdk.demandOnly.p a(String str) {
            X1 x1 = this.h;
            return x1 != null ? x1.a(str) : new p.b();
        }
    }

    static class b implements Runnable {
        private static final int d = 15000;
        private String a;
        private String b;
        private String c;

        public b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x007b A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:3:0x0020, B:9:0x0055, B:11:0x007b, B:12:0x0082, B:16:0x0080), top: B:2:0x0020 }] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0080 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:3:0x0020, B:9:0x0055, B:11:0x007b, B:12:0x0082, B:16:0x0080), top: B:2:0x0020 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            boolean z;
            String str = this.a + ";" + this.b + ";" + this.c;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.c).openConnection();
                httpURLConnection.setRequestMethod(C4701ic.a);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.connect();
                int httpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                String responseMessage = httpURLConnection.getResponseMessage();
                IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                if (httpUrlConnectionGetResponseCode != 200 && httpUrlConnectionGetResponseCode != 204) {
                    z = false;
                    Kb.Y().q().a(new C4966x5(!z ? EnumC4984y5.TROUBLESHOOTING_SEND_AUCTION_URL_SUCCESS : EnumC4984y5.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, IronSourceNetworkBridge.jsonObjectInit().put(IronSourceConstants.EVENTS_PROVIDER, "Mediation").put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1).put(IronSourceConstants.EVENTS_EXT1, str).put(IronSourceConstants.EVENTS_ERROR_CODE, httpUrlConnectionGetResponseCode).put("reason", responseMessage)));
                }
                z = true;
                Kb.Y().q().a(new C4966x5(!z ? EnumC4984y5.TROUBLESHOOTING_SEND_AUCTION_URL_SUCCESS : EnumC4984y5.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, IronSourceNetworkBridge.jsonObjectInit().put(IronSourceConstants.EVENTS_PROVIDER, "Mediation").put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1).put(IronSourceConstants.EVENTS_EXT1, str).put(IronSourceConstants.EVENTS_ERROR_CODE, httpUrlConnectionGetResponseCode).put("reason", responseMessage)));
            } catch (Exception e) {
                C4782n4.d().a(e);
                IronLog.INTERNAL.error("Send auction url failed with params - " + str + ";" + e.getMessage());
            }
        }
    }

    private enum c {
        NOT_SECURE,
        SECURE
    }

    public static d b() {
        return B;
    }

    public a a(JSONObject jSONObject) throws JSONException {
        String optString = jSONObject.optString("auctionId");
        if (TextUtils.isEmpty(optString)) {
            throw new JSONException("Invalid auction response - auction id is missing");
        }
        a aVar = new a(optString);
        if (jSONObject.has("settings")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
            aVar.c = new C4834q2(jSONObject2);
            r3 = jSONObject2.has(d) ? jSONObject2.optJSONObject(d) : null;
            if (jSONObject2.has("genericParams")) {
                aVar.d = jSONObject2.optJSONObject("genericParams");
            }
            if (jSONObject2.has("configurations")) {
                aVar.e = jSONObject2.optJSONObject("configurations");
            }
            if (jSONObject2.has(k)) {
                aVar.h = new X1.a(jSONObject2.optJSONObject(k));
            }
        }
        aVar.b = new ArrayList();
        if (jSONObject.has(h)) {
            JSONArray jSONArray = jSONObject.getJSONArray(h);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                C4834q2 c4834q2 = new C4834q2(jSONArray.getJSONObject(i2), i2, r3);
                if (!c4834q2.n()) {
                    aVar.f = 1002;
                    aVar.g = "waterfall " + i2;
                    IronLog.INTERNAL.verbose("AuctionResponseItem " + i2 + " not valid - parsing error");
                    throw new JSONException("invalid response");
                }
                aVar.b.add(c4834q2);
            }
        }
        return aVar;
    }

    public String c(String str) {
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str) || !C4699ia.a(str)) {
                return "";
            }
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
            if (!jsonObjectInit.has("params")) {
                return "";
            }
            JSONObject jSONObject = jsonObjectInit.getJSONObject("params");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("parameters = " + jSONObject);
            if (!jSONObject.has("dynamicDemandSource")) {
                return "";
            }
            str2 = jSONObject.getString("dynamicDemandSource");
            ironLog.verbose("demand source = " + str2);
            return str2;
        } catch (JSONException e2) {
            C4782n4.d().a(e2);
            IronLog.INTERNAL.error("exception " + e2.getMessage());
            return str2;
        }
    }

    public Map<String, String> b(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
            if (jsonObjectInit.has("params")) {
                JSONObject jSONObject = jsonObjectInit.getJSONObject("params");
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof String) {
                        hashMap.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException e2) {
            C4782n4.d().a(e2);
            IronLog.INTERNAL.error("exception " + e2.getMessage());
        }
        return hashMap;
    }

    private c a() {
        c cVar = c.SECURE;
        return Build.VERSION.SDK_INT >= 28 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() ? c.NOT_SECURE : cVar : (ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) != 0 ? c.NOT_SECURE : cVar;
    }

    JSONObject a(h hVar) throws JSONException {
        ISBannerSize iSBannerSize;
        C4573ba c4573ba;
        int i2;
        IronSource.a c2 = hVar.c();
        boolean u2 = hVar.u();
        Map<String, Object> h2 = hVar.h();
        List<String> l2 = hVar.l();
        C4565b2 e2 = hVar.e();
        int p2 = hVar.p();
        ISBannerSize f2 = hVar.f();
        C4573ba o2 = hVar.o();
        boolean q2 = hVar.q();
        boolean r2 = hVar.r();
        ArrayList<C4708j2> k2 = hVar.k();
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        JSONObject jsonObjectInit2 = IronSourceNetworkBridge.jsonObjectInit();
        String n2 = hVar.n();
        if (n2 != null) {
            JSONObject jsonObjectInit3 = IronSourceNetworkBridge.jsonObjectInit();
            jsonObjectInit3.put(O6.y0, 1);
            jsonObjectInit3.put(O6.B0, e2 != null ? e2.a(n2) : "");
            iSBannerSize = f2;
            jsonObjectInit3.put(O6.C0, true);
            jsonObjectInit2.put(n2, jsonObjectInit3);
        } else {
            iSBannerSize = f2;
        }
        Iterator<String> it = h2.keySet().iterator();
        while (true) {
            c4573ba = o2;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            Iterator<String> it2 = it;
            JSONObject jsonObjectInit4 = IronSourceNetworkBridge.jsonObjectInit();
            jsonObjectInit4.put(O6.y0, 2);
            Map<String, Object> map = h2;
            jsonObjectInit4.put(O6.p0, new JSONObject((Map) h2.get(next)));
            jsonObjectInit4.put(O6.B0, e2 != null ? e2.a(next) : "");
            jsonObjectInit4.put("ts", r2 ? 1 : 0);
            jsonObjectInit2.put(next, jsonObjectInit4);
            o2 = c4573ba;
            it = it2;
            h2 = map;
        }
        for (String str : l2) {
            JSONObject jsonObjectInit5 = IronSourceNetworkBridge.jsonObjectInit();
            jsonObjectInit5.put(O6.y0, 1);
            jsonObjectInit5.put(O6.B0, e2 != null ? e2.a(str) : "");
            jsonObjectInit2.put(str, jsonObjectInit5);
        }
        Iterator<C4708j2> it3 = k2.iterator();
        while (it3.hasNext()) {
            C4708j2 next2 = it3.next();
            JSONObject jsonObjectInit6 = IronSourceNetworkBridge.jsonObjectInit();
            jsonObjectInit6.put(O6.y0, next2.e() ? 2 : 1);
            Map<String, Object> f3 = next2.f();
            if (!f3.isEmpty()) {
                jsonObjectInit6.put(O6.p0, new JSONObject(f3));
            }
            jsonObjectInit6.put(O6.B0, e2 != null ? e2.a(next2.g()) : "");
            jsonObjectInit6.put("ts", r2 ? 1 : 0);
            if (!next2.h().isEmpty()) {
                jsonObjectInit6.put(v, next2.h());
            }
            jsonObjectInit2.put(next2.g(), jsonObjectInit6);
        }
        jsonObjectInit.put(O6.x0, jsonObjectInit2);
        if (hVar.w()) {
            i2 = 1;
            jsonObjectInit.put(O6.x1, 1);
        } else {
            i2 = 1;
        }
        if (hVar.t()) {
            jsonObjectInit.put("do", i2);
        }
        new U9().b(ContextProvider.getInstance().getApplicationContext());
        JSONObject a2 = new C4637f2(W0.a(c2)).a();
        a(a2, false);
        a2.put(O6.z0, p2);
        a2.put(O6.A0, a().ordinal());
        if (c4573ba != null) {
            a2.put(O6.j1, c4573ba.i());
        }
        jsonObjectInit.put(O6.u0, a2);
        if (iSBannerSize != null) {
            JSONObject jsonObjectInit7 = IronSourceNetworkBridge.jsonObjectInit();
            jsonObjectInit7.put(O6.r0, iSBannerSize.getDescription());
            jsonObjectInit7.put(O6.t0, iSBannerSize.getWidth());
            jsonObjectInit7.put(O6.s0, iSBannerSize.getHeight());
            jsonObjectInit.put(O6.q0, jsonObjectInit7);
        }
        jsonObjectInit.put(O6.l0, c2.toString());
        if (hVar.b() != null) {
            jsonObjectInit.put("adf", hVar.b());
        }
        if (hVar.d() != null) {
            jsonObjectInit.put("mediationAdUnitId", hVar.d());
        }
        if (hVar.v() != null) {
            jsonObjectInit.put(O6.o0, hVar.v());
        }
        jsonObjectInit.put(O6.v0, !u2 ? 1 : 0);
        if (hVar.g() != null) {
            jsonObjectInit.put(O6.t1, IronSourceNetworkBridge.jsonObjectInit().put(O6.u1, hVar.g()));
        } else {
            Object remove = a2.remove(O6.t1);
            if (remove != null) {
                jsonObjectInit.put(O6.t1, remove);
            }
        }
        if (q2) {
            jsonObjectInit.put(O6.r1, 1);
        }
        return jsonObjectInit;
    }

    public String a(String str, String str2, int i2, String str3, String str4, String str5, String str6, String str7) {
        return str.replace("${AUCTION_PRICE}", str4).replace("${AUCTION_LOSS}", str6).replace("${AUCTION_MBR}", str5).replace(p, str2).replace(q, Integer.toString(i2)).replace(o, str3).replace(r, str7);
    }

    public String a(String str, int i2, C4834q2 c4834q2, String str2, String str3, String str4) {
        String i3 = c4834q2.i();
        return a(str, c4834q2.c(), i2, b().c(c4834q2.k()), i3, b().a(i3, str2), str3, str4);
    }

    public void a(String str, String str2, String str3) {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b(str, str2, str3));
    }

    public String a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
            return jsonObjectInit.has("adMarkup") ? jsonObjectInit.getString("adMarkup") : str;
        } catch (JSONException e2) {
            C4782n4.d().a(e2);
            IronLog.INTERNAL.error("exception " + e2.getMessage());
            return str;
        }
    }

    private String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        double parseDouble = Double.parseDouble(str);
        return Double.parseDouble(str2) == 0.0d ? "" : String.valueOf(Math.round((parseDouble / r7) * 1000.0d) / 1000.0d);
    }

    public void a(JSONObject jSONObject, boolean z2) {
        if (jSONObject == null || jSONObject.length() <= 0 || TextUtils.isEmpty(jSONObject.optString(O6.l1)) || !this.a.compareAndSet(false, true)) {
            return;
        }
        Kb.Y().q().a(new C4966x5(EnumC4984y5.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.a(z2, true, -1)));
    }
}
