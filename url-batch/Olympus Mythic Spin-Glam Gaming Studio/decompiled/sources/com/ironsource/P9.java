package com.ironsource;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4822p8;
import com.ironsource.N8;
import com.ironsource.Q;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class P9 implements InterfaceC4738ke, InterfaceC4907u4, InterfaceC4889t4, InterfaceC4853r4, InterfaceC4871s4, V9, Oc {
    private static final String m = "IronSourceAdsPublisherAgent";
    private static P9 n;
    private com.ironsource.sdk.controller.e a;
    private String b;
    private String c;
    private U4 d;
    private C4826pc e;
    private C4540a4 g;
    private boolean f = false;
    private FeaturesManager h = FeaturesManager.getInstance();
    private N8.a i = Kb.Q().j();
    private Q.a j = Kb.Q().G();
    private Q k = Kb.Y().I();
    private InterfaceC4786n8 l = Kb.Y().t();

    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ T4 c;

        a(String str, String str2, T4 t4) {
            this.a = str;
            this.b = str2;
            this.c = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            P9 p9 = P9.this;
            p9.a.a(this.a, this.b, this.c, (InterfaceC4907u4) p9);
        }
    }

    class b implements Runnable {
        final /* synthetic */ JSONObject a;

        b(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            P9 p9 = P9.this;
            p9.a.a(this.a, (InterfaceC4907u4) p9);
        }
    }

    class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ T4 c;

        c(String str, String str2, T4 t4) {
            this.a = str;
            this.b = str2;
            this.c = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            P9 p9 = P9.this;
            p9.a.a(this.a, this.b, this.c, (InterfaceC4889t4) p9);
        }
    }

    class d implements Runnable {
        final /* synthetic */ String a;

        d(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            P9 p9 = P9.this;
            p9.a.a(this.a, p9);
        }
    }

    class e implements Runnable {
        final /* synthetic */ JSONObject a;

        e(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            P9 p9 = P9.this;
            p9.a.a(this.a, (InterfaceC4889t4) p9);
        }
    }

    class f implements Runnable {
        final /* synthetic */ K9 a;
        final /* synthetic */ Map b;

        f(K9 k9, Map map) {
            this.a = k9;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4822p8.e eVar = this.a.i() ? C4822p8.e.Banner : C4822p8.e.Interstitial;
            T4 a = P9.this.d.a(eVar, this.a);
            C4857r8 c4857r8 = new C4857r8();
            c4857r8.a(B5.x, Boolean.valueOf(this.a.j())).a(B5.G, Boolean.valueOf(this.a.m())).a(B5.v, this.a.g()).a("producttype", W9.a(this.a)).a(B5.I, Long.valueOf(N.a.b(this.a.e())));
            C4951w8.a(C4703ie.h, c4857r8.a());
            if (eVar == C4822p8.e.Banner) {
                P9 p9 = P9.this;
                p9.a.a(p9.b, p9.c, a, (InterfaceC4871s4) p9);
                P9 p92 = P9.this;
                p92.a.a(a, this.b, (InterfaceC4871s4) p92);
                return;
            }
            P9 p93 = P9.this;
            p93.a.a(p93.b, p93.c, a, (InterfaceC4889t4) p93);
            P9 p94 = P9.this;
            p94.a.b(a, this.b, p94);
        }
    }

    class g implements Runnable {
        final /* synthetic */ T4 a;
        final /* synthetic */ Map b;

        g(T4 t4, Map map) {
            this.a = t4;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            P9 p9 = P9.this;
            p9.a.a(this.a, this.b, (InterfaceC4889t4) p9);
        }
    }

    class h implements Runnable {
        final /* synthetic */ K9 a;

        h(K9 k9) {
            this.a = k9;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4822p8.e eVar = this.a.i() ? C4822p8.e.Banner : C4822p8.e.Interstitial;
            T4 a = P9.this.d.a(eVar, this.a);
            C4857r8 c4857r8 = new C4857r8();
            c4857r8.a(B5.x, Boolean.valueOf(this.a.j())).a(B5.v, this.a.g()).a("producttype", W9.a(this.a)).a("isMultipleAdObjects", Boolean.valueOf(this.a.l()));
            C4951w8.a(C4703ie.m, c4857r8.a());
            if (eVar == C4822p8.e.Banner) {
                P9.this.a.a(a);
            } else {
                a.a(false);
                P9.this.a.b(a);
            }
        }
    }

    private P9(Context context, int i) {
        c(context);
    }

    public static V9 a(Context context, String str, String str2) {
        return a(str, str2, context);
    }

    public static synchronized P9 b(Context context) throws Exception {
        P9 a2;
        synchronized (P9.class) {
            a2 = a(context, 0);
        }
        return a2;
    }

    private void c(Context context) {
        try {
            SDKUtils.getNetworkConfiguration();
            C4609da.a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new Cf(SDKUtils.getNetworkConfiguration().optJSONObject(X3.a.k)));
            C4609da.e().d(SDKUtils.getSDKVersion());
            this.d = new U4();
            C4540a4 c4540a4 = new C4540a4();
            this.g = c4540a4;
            if (context instanceof Activity) {
                c4540a4.a((Activity) context);
            }
            int debugMode = this.h.getDebugMode();
            this.e = new C4826pc();
            this.a = new com.ironsource.sdk.controller.e(context, this.g, this.d, R7.a, debugMode, this.h.getDataManagerConfig(), this.b, this.c, this.e);
            Logger.enableLogging(debugMode);
            Logger.i(m, "C'tor");
            a(context);
            this.e.d();
            this.e.e();
            this.e.a(context);
            this.e.b();
            this.e.a();
            this.e.c();
        } catch (Exception e2) {
            C4782n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.ironsource.InterfaceC4889t4
    public void d(String str, String str2) {
        T4 d2 = d(C4822p8.e.Interstitial, str);
        if (d2 != null) {
            K9 c2 = d2.c();
            this.j.a(EnumC4796o0.SHOW_FAIL, c2.e());
            if (c(c2)) {
                this.i.a(new C4757lf(this.k.a(c2.e())));
            }
            Lc b2 = b(d2);
            if (b2 != null) {
                b2.onInterstitialShowFailed(str2);
            }
        }
    }

    @Override // com.ironsource.Oc
    public void e(Activity activity) {
        this.g.a(activity);
        this.a.g();
        this.a.b(activity);
    }

    @Override // com.ironsource.InterfaceC4889t4
    public void onInterstitialAdRewarded(String str, int i) {
        T4 d2 = d(C4822p8.e.Interstitial, str);
        Lc b2 = b(d2);
        if (d2 == null || b2 == null) {
            return;
        }
        b2.onInterstitialAdRewarded(str, i);
    }

    public static synchronized V9 a(String str, String str2, Context context) {
        P9 p9;
        synchronized (P9.class) {
            try {
                if (n == null) {
                    C4951w8.a(C4703ie.a);
                    n = new P9(str, str2, context);
                }
                p9 = n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return p9;
    }

    private Lc b(T4 t4) {
        if (t4 == null) {
            return null;
        }
        return (Lc) t4.i();
    }

    @Override // com.ironsource.InterfaceC4738ke
    public void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("demandSourceName");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.a.a(new d(optString));
    }

    @Override // com.ironsource.InterfaceC4738ke, com.ironsource.V9
    public void b(Activity activity) {
        if (this.f) {
            return;
        }
        d(activity);
    }

    public static synchronized P9 a(Context context, int i) throws Exception {
        P9 p9;
        synchronized (P9.class) {
            try {
                Logger.i(m, "getInstance()");
                if (n == null) {
                    n = new P9(context, i);
                }
                p9 = n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return p9;
    }

    @Override // com.ironsource.InterfaceC4853r4
    public void b(C4822p8.e eVar, String str) {
        Lc b2;
        T4 d2 = d(eVar, str);
        if (d2 != null) {
            if (eVar == C4822p8.e.RewardedVideo) {
                Qc c2 = c(d2);
                if (c2 != null) {
                    c2.d();
                    return;
                }
                return;
            }
            if (eVar != C4822p8.e.Interstitial || (b2 = b(d2)) == null) {
                return;
            }
            b2.onInterstitialClose();
        }
    }

    private T4 d(C4822p8.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.d.a(eVar, str);
    }

    @Override // com.ironsource.V9
    public com.ironsource.sdk.controller.e a() {
        return this.a;
    }

    private Jc a(T4 t4) {
        if (t4 == null) {
            return null;
        }
        return (Jc) t4.i();
    }

    @Override // com.ironsource.InterfaceC4738ke
    public void a(String str, String str2, String str3, Map<String, String> map, Qc qc) {
        this.b = str;
        this.c = str2;
        this.a.a(new a(str, str2, this.d.a(C4822p8.e.RewardedVideo, str3, map, qc)));
    }

    @Override // com.ironsource.Oc
    public void d(Activity activity) {
        try {
            this.a.e();
            this.a.a((Context) activity);
        } catch (Exception e2) {
            C4782n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    P9(String str, String str2, Context context) {
        this.b = str;
        this.c = str2;
        c(context);
    }

    @Override // com.ironsource.InterfaceC4907u4
    public void b(String str, String str2) {
        Qc c2;
        T4 d2 = d(C4822p8.e.RewardedVideo, str);
        if (d2 == null || (c2 = c(d2)) == null) {
            return;
        }
        c2.a(str2);
    }

    @Override // com.ironsource.InterfaceC4738ke
    public void a(JSONObject jSONObject) {
        this.a.a(new b(jSONObject));
    }

    @Override // com.ironsource.InterfaceC4738ke
    public void a(String str, String str2, String str3, Map<String, String> map, Lc lc) {
        this.b = str;
        this.c = str2;
        this.a.a(new c(str, str2, this.d.a(C4822p8.e.Interstitial, str3, map, lc)));
    }

    @Override // com.ironsource.InterfaceC4889t4
    public void b(String str) {
        T4 d2 = d(C4822p8.e.Interstitial, str);
        if (d2 != null) {
            K9 c2 = d2.c();
            this.j.a(EnumC4796o0.SHOW_SUCCESS, c2.e());
            if (c(c2)) {
                this.i.a(new C4775mf(this.k.a(c2.e())));
            }
            Lc b2 = b(d2);
            if (b2 != null) {
                b2.onInterstitialShowSuccess();
            }
        }
    }

    @Override // com.ironsource.InterfaceC4738ke
    public boolean a(String str) {
        return this.a.a(str);
    }

    @Override // com.ironsource.InterfaceC4738ke, com.ironsource.V9
    public void a(Activity activity) {
        if (this.f) {
            return;
        }
        e(activity);
    }

    @Override // com.ironsource.InterfaceC4853r4
    public void a(C4822p8.e eVar, String str, C4564b1 c4564b1) {
        Jc a2;
        T4 d2 = d(eVar, str);
        if (d2 != null) {
            d2.b(2);
            if (eVar == C4822p8.e.RewardedVideo) {
                Qc c2 = c(d2);
                if (c2 != null) {
                    c2.a(c4564b1);
                    return;
                }
                return;
            }
            if (eVar == C4822p8.e.Interstitial) {
                Lc b2 = b(d2);
                if (b2 != null) {
                    b2.onInterstitialInitSuccess();
                    return;
                }
                return;
            }
            if (eVar != C4822p8.e.Banner || (a2 = a(d2)) == null) {
                return;
            }
            a2.onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.X9
    public void b(Activity activity, K9 k9, Map<String, String> map) {
        if (Kb.Y().h().j()) {
            this.g.a(activity);
        }
        a(k9, map);
    }

    private void b(K9 k9, Map<String, String> map) {
        Logger.d(m, "loadOnNewInstance " + k9.e());
        this.a.a(new f(k9, map));
    }

    @Override // com.ironsource.X9
    public void b(K9 k9) {
        Logger.d(m, "destroyInstance " + k9.e());
        if (c(k9)) {
            this.j.a(EnumC4796o0.DESTROYED, k9.e());
            this.i.a(new Cif(this.k.a(k9.e())));
        }
        this.a.a(new h(k9));
    }

    private Qc c(T4 t4) {
        if (t4 == null) {
            return null;
        }
        return (Qc) t4.i();
    }

    @Override // com.ironsource.InterfaceC4738ke
    public void c(JSONObject jSONObject) {
        this.a.a(new e(jSONObject));
    }

    @Override // com.ironsource.InterfaceC4853r4
    public void a(C4822p8.e eVar, String str, String str2) {
        Jc a2;
        T4 d2 = d(eVar, str);
        C4857r8 a3 = new C4857r8().a(B5.v, str).a("producttype", eVar).a(B5.A, str2);
        if (d2 != null) {
            N n2 = N.a;
            a3.a(B5.I, Long.valueOf(n2.b(d2.h())));
            a3.a(B5.x, Boolean.valueOf(C4969x8.a(d2)));
            n2.a(d2.h());
            d2.b(3);
            if (eVar == C4822p8.e.RewardedVideo) {
                Qc c2 = c(d2);
                if (c2 != null) {
                    c2.b(str2);
                }
            } else if (eVar == C4822p8.e.Interstitial) {
                Lc b2 = b(d2);
                if (b2 != null) {
                    b2.onInterstitialInitFailed(str2);
                }
            } else if (eVar == C4822p8.e.Banner && (a2 = a(d2)) != null) {
                a2.onBannerLoadFail(str2);
            }
        }
        C4951w8.a(C4703ie.i, a3.a());
    }

    @Override // com.ironsource.InterfaceC4738ke, com.ironsource.V9
    public void c(Activity activity) {
        try {
            Logger.i(m, "release()");
            X4.g();
            this.g.b();
            this.a.a((Context) activity);
            this.a.a();
            this.a = null;
        } catch (Exception e2) {
            C4782n4.d().a(e2);
        }
        n = null;
    }

    @Override // com.ironsource.InterfaceC4907u4
    public void c(String str) {
        Qc c2;
        T4 d2 = d(C4822p8.e.RewardedVideo, str);
        if (d2 == null || (c2 = c(d2)) == null) {
            return;
        }
        c2.c();
    }

    @Override // com.ironsource.InterfaceC4853r4
    public void c(C4822p8.e eVar, String str) {
        Qc c2;
        T4 d2 = d(eVar, str);
        if (d2 != null) {
            if (eVar == C4822p8.e.Interstitial) {
                Lc b2 = b(d2);
                if (b2 != null) {
                    b2.onInterstitialOpen();
                    return;
                }
                return;
            }
            if (eVar != C4822p8.e.RewardedVideo || (c2 = c(d2)) == null) {
                return;
            }
            c2.b();
        }
    }

    @Override // com.ironsource.InterfaceC4871s4
    public void c(String str, String str2) {
        Jc a2;
        T4 d2 = d(C4822p8.e.Banner, str);
        if (d2 == null || (a2 = a(d2)) == null) {
            return;
        }
        a2.onBannerLoadFail(str2);
    }

    private void c(K9 k9, Map<String, String> map) {
        try {
            map = a(map);
        } catch (Exception e2) {
            C4782n4.d().a(e2);
            C4857r8 a2 = new C4857r8().a(B5.A, e2.getMessage()).a(B5.x, Boolean.valueOf(k9.j())).a(B5.G, Boolean.valueOf(k9.m())).a(B5.v, k9.g()).a("producttype", W9.a(k9)).a(B5.I, Long.valueOf(N.a.b(k9.e())));
            N.a.a(k9.e());
            C4951w8.a(C4703ie.k, a2.a());
            IronLog.INTERNAL.error(e2.toString());
            Logger.d(m, "loadInAppBiddingAd failed decoding  ADM " + e2.getMessage());
        }
        b(k9, map);
    }

    @Override // com.ironsource.InterfaceC4907u4
    public void a(String str, int i) {
        Qc c2;
        T4 d2 = d(C4822p8.e.RewardedVideo, str);
        if (d2 == null || (c2 = c(d2)) == null) {
            return;
        }
        c2.a(i);
    }

    @Override // com.ironsource.InterfaceC4853r4
    public void a(C4822p8.e eVar, String str) {
        Jc a2;
        T4 d2 = d(eVar, str);
        if (d2 != null) {
            if (eVar == C4822p8.e.RewardedVideo) {
                Qc c2 = c(d2);
                if (c2 != null) {
                    c2.a();
                    return;
                }
                return;
            }
            if (eVar == C4822p8.e.Interstitial) {
                Lc b2 = b(d2);
                if (b2 != null) {
                    b2.onInterstitialClick();
                    return;
                }
                return;
            }
            if (eVar != C4822p8.e.Banner || (a2 = a(d2)) == null) {
                return;
            }
            a2.onBannerClick();
        }
    }

    @Override // com.ironsource.InterfaceC4853r4
    public void a(C4822p8.e eVar, String str, String str2, JSONObject jSONObject) {
        Jc a2;
        T4 d2 = d(eVar, str);
        if (d2 == null || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            Logger.i(m, "Received Event Notification: " + str2 + " for demand source: " + d2.f());
            if (eVar == C4822p8.e.Interstitial) {
                Lc b2 = b(d2);
                if (b2 != null) {
                    jSONObject.put("demandSourceName", str);
                    b2.onInterstitialEventNotificationReceived(str2, jSONObject);
                }
            } else if (eVar == C4822p8.e.RewardedVideo) {
                Qc c2 = c(d2);
                if (c2 != null) {
                    jSONObject.put("demandSourceName", str);
                    c2.a(str2, jSONObject);
                }
            } else if (eVar == C4822p8.e.Banner && (a2 = a(d2)) != null) {
                jSONObject.put("demandSourceName", str);
                if (str2.equalsIgnoreCase("impressions")) {
                    a2.onBannerShowSuccess();
                }
            }
        } catch (JSONException e2) {
            C4782n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public boolean c(K9 k9) {
        return k9.l() && !k9.i() && a(k9);
    }

    @Override // com.ironsource.InterfaceC4889t4
    public void a(String str, JSONObject jSONObject) {
        C4822p8.e eVar = C4822p8.e.Interstitial;
        T4 d2 = d(eVar, str);
        C4857r8 a2 = new C4857r8().a(B5.v, str);
        if (d2 != null) {
            K9 c2 = d2.c();
            this.j.a(jSONObject, EnumC4796o0.LOAD_SUCCESS, c2.e());
            if (c(c2)) {
                this.i.a(new C4739kf(this.k.a(c2.e())));
            }
            C4857r8 a3 = a2.a("producttype", C4969x8.a(d2, eVar)).a(B5.x, Boolean.valueOf(C4969x8.a(d2)));
            N n2 = N.a;
            a3.a(B5.I, Long.valueOf(n2.b(d2.h())));
            n2.a(d2.h());
            Lc b2 = b(d2);
            if (b2 != null) {
                b2.onInterstitialLoadSuccess(d2.c());
            }
        }
        C4951w8.a(C4703ie.l, a2.a());
    }

    @Override // com.ironsource.InterfaceC4889t4
    public void a(String str, String str2) {
        Object obj;
        C4822p8.e eVar = C4822p8.e.Interstitial;
        T4 d2 = d(eVar, str);
        C4857r8 c4857r8 = new C4857r8();
        c4857r8.a(B5.A, str2).a(B5.v, str);
        if (d2 != null) {
            C4857r8 a2 = c4857r8.a("producttype", C4969x8.a(d2, eVar));
            if (d2.e() == 2) {
                obj = B5.E;
            } else {
                obj = B5.F;
            }
            C4857r8 a3 = a2.a(B5.y, obj).a(B5.x, Boolean.valueOf(C4969x8.a(d2)));
            N n2 = N.a;
            a3.a(B5.I, Long.valueOf(n2.b(d2.h())));
            n2.a(d2.h());
            Lc b2 = b(d2);
            if (b2 != null) {
                b2.onInterstitialLoadFailed(str2);
            }
        }
        C4951w8.a(C4703ie.g, c4857r8.a());
    }

    @Override // com.ironsource.InterfaceC4738ke
    public void a(String str, String str2, int i) {
        C4822p8.e productType;
        T4 a2;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (productType = SDKUtils.getProductType(str)) == null || (a2 = this.d.a(productType, str2)) == null) {
            return;
        }
        a2.c(i);
    }

    @Override // com.ironsource.InterfaceC4871s4
    public void a(String str, C4661g8 c4661g8) {
        Jc a2;
        T4 d2 = d(C4822p8.e.Banner, str);
        if (d2 == null || (a2 = a(d2)) == null) {
            return;
        }
        a2.onBannerLoadSuccess(d2.c(), c4661g8);
    }

    @Override // com.ironsource.X9
    public void a(K9 k9, Map<String, String> map) {
        long currentTimeMillis = System.currentTimeMillis();
        map.put(X3.i.y0, String.valueOf(currentTimeMillis));
        N.a.a(k9.e(), currentTimeMillis);
        C4857r8 c4857r8 = new C4857r8();
        c4857r8.a(B5.x, Boolean.valueOf(k9.j())).a(B5.G, Boolean.valueOf(k9.m())).a(B5.v, k9.g()).a("producttype", W9.a(k9)).a(B5.I, Long.valueOf(currentTimeMillis));
        C4951w8.a(C4703ie.f, c4857r8.a());
        Logger.d(m, "loadAd " + k9.e());
        P p = new P(k9);
        this.j.a(p);
        this.j.a(new JSONObject(map), EnumC4796o0.LOAD_REQUEST, p.c());
        if (c(k9)) {
            this.i.a(new C4721jf(p));
        }
        if (k9.k()) {
            c(k9, map);
        } else {
            b(k9, map);
        }
    }

    private Map<String, String> a(Map<String, String> map) {
        map.put("adm", SDKUtils.decodeString(map.get("adm")));
        return map;
    }

    @Override // com.ironsource.X9
    public void a(Activity activity, K9 k9, Map<String, String> map) {
        this.g.a(activity);
        Logger.i(m, "showAd " + k9.e());
        T4 a2 = this.d.a(C4822p8.e.Interstitial, k9.e());
        if (a2 == null) {
            return;
        }
        this.a.a(new g(a2, map));
    }

    @Override // com.ironsource.X9
    public boolean a(K9 k9) {
        Logger.d(m, "isAdAvailable " + k9.e());
        T4 a2 = this.d.a(C4822p8.e.Interstitial, k9.e());
        if (a2 == null) {
            return false;
        }
        return a2.d();
    }

    public void a(Context context) {
        this.f = false;
        Boolean c2 = this.l.c(X3.a.g);
        if (c2 == null) {
            c2 = Boolean.FALSE;
        }
        boolean booleanValue = c2.booleanValue();
        this.f = booleanValue;
        if (booleanValue) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new C4688i(this));
            } catch (Throwable th) {
                C4782n4.d().a(th);
                C4857r8 c4857r8 = new C4857r8();
                c4857r8.a(B5.y, th.getMessage());
                C4951w8.a(C4703ie.u, c4857r8.a());
            }
        }
    }
}
