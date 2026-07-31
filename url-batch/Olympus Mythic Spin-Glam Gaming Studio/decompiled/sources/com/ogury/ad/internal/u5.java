package com.ogury.ad.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.ogury.ad.async.Completable;
import com.ogury.ad.common.OguryMediation;
import com.ogury.core.internal.KotlinVersionDetector;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import com.ogury.core.internal.network.NetworkRequest;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class u5 {
    public static final r5 e = new r5();
    public static volatile u5 f;
    public final g6 a;
    public final w5 b;
    public final q5 c;
    public final k8 d;

    public u5(g6 g6Var, w5 w5Var, q5 q5Var, k8 k8Var) {
        le leVar = le.a;
        this.a = g6Var;
        this.b = w5Var;
        this.c = q5Var;
        this.d = k8Var;
    }

    public final void a(o5 o5Var) {
        pf pfVar = le.b;
        a(o5Var, pfVar.e.d.a, !r1.b.contains(o5Var.c));
        if (!pfVar.a && !pfVar.e.d.a) {
            b(o5Var);
            return;
        }
        re reVar = pfVar.e.d;
        if (!reVar.a || reVar.b.contains(o5Var.c)) {
            return;
        }
        ConnectivityManager connectivityManager = this.d.a;
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            b(o5Var);
            return;
        }
        g6 g6Var = this.a;
        ArrayList arrayList = new ArrayList();
        BuildersKt__Builders_commonKt.launch$default(g6Var.e, null, null, new b6(g6Var, arrayList, null), 3, null);
        arrayList.add(o5Var);
        a(arrayList);
    }

    public final void b(o5 event) {
        m2 m2Var = m2.c;
        event.getClass();
        Intrinsics.checkNotNullParameter(m2Var, "<set-?>");
        event.i = m2Var;
        g6 g6Var = this.a;
        Intrinsics.checkNotNullParameter(event, "event");
        BuildersKt__Builders_commonKt.launch$default(g6Var.e, null, null, new d6(g6Var, event, null), 3, null);
    }

    public final void a(ob predefinedMonitoringEvent, String adUnitId, String sessionId, OguryMediation oguryMediation, JSONObject jSONObject, v2 v2Var) {
        Intrinsics.checkNotNullParameter(predefinedMonitoringEvent, "predefinedMonitoringEvent");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        q5 q5Var = this.c;
        Intrinsics.checkNotNullParameter(predefinedMonitoringEvent, "predefinedMonitoringEvent");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        q5Var.a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        String str = predefinedMonitoringEvent.a;
        String str2 = predefinedMonitoringEvent.b;
        m2 m2Var = m2.b;
        a(new o5(currentTimeMillis, sessionId, str, str2, jSONObject, null, adUnitId, q5.a(q5Var, null, v2Var, 1), m2.b, oguryMediation));
    }

    public final void a(ob predefinedMonitoringEvent, b ad, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(predefinedMonitoringEvent, "predefinedMonitoringEvent");
        Intrinsics.checkNotNullParameter(ad, "ad");
        q5 q5Var = this.c;
        Intrinsics.checkNotNullParameter(predefinedMonitoringEvent, "predefinedMonitoringEvent");
        Intrinsics.checkNotNullParameter(ad, "ad");
        q5Var.a.getClass();
        a(new o5(System.currentTimeMillis(), ad.F, predefinedMonitoringEvent.a, predefinedMonitoringEvent.b, jSONObject, null, ad.n.a, q5.a(q5Var, ad, null, 2), m2.b, ad.I));
    }

    public final void a(nb predefinedMonitoringErrorEvent, String adUnitId, String sessionId, OguryMediation oguryMediation, JSONObject jSONObject, JSONObject jSONObject2, v2 v2Var) {
        Intrinsics.checkNotNullParameter(predefinedMonitoringErrorEvent, "predefinedMonitoringErrorEvent");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        q5 q5Var = this.c;
        Intrinsics.checkNotNullParameter(predefinedMonitoringErrorEvent, "predefinedMonitoringErrorEvent");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        q5Var.a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        String str = predefinedMonitoringErrorEvent.a;
        String str2 = predefinedMonitoringErrorEvent.b;
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject2 != null) {
            jSONObject3 = jSONObject2;
        }
        jSONObject3.put("reason", predefinedMonitoringErrorEvent.d);
        a(new o5(currentTimeMillis, sessionId, str, str2, jSONObject, new w2(predefinedMonitoringErrorEvent.c, jSONObject3), adUnitId, q5.a(q5Var, null, v2Var, 1), m2.b, oguryMediation));
    }

    public final void a(nb predefinedMonitoringErrorEvent, b ad, JSONObject jSONObject, JSONObject jSONObject2) {
        Intrinsics.checkNotNullParameter(predefinedMonitoringErrorEvent, "predefinedMonitoringErrorEvent");
        Intrinsics.checkNotNullParameter(ad, "ad");
        q5 q5Var = this.c;
        Intrinsics.checkNotNullParameter(predefinedMonitoringErrorEvent, "predefinedMonitoringErrorEvent");
        Intrinsics.checkNotNullParameter(ad, "ad");
        q5Var.a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        String str = ad.F;
        OguryMediation oguryMediation = ad.I;
        String str2 = predefinedMonitoringErrorEvent.a;
        String str3 = predefinedMonitoringErrorEvent.b;
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject2 != null) {
            jSONObject3 = jSONObject2;
        }
        jSONObject3.put("reason", predefinedMonitoringErrorEvent.d);
        a(new o5(currentTimeMillis, str, str2, str3, jSONObject, new w2(predefinedMonitoringErrorEvent.c, jSONObject3), ad.n.a, q5.a(q5Var, ad, null, 2), m2.b, oguryMediation));
    }

    public static void a(o5 o5Var, boolean z, boolean z2) {
        String str;
        Logger logger;
        LogTag logTag;
        String str2;
        String str3;
        hh hhVar;
        if (z && z2) {
            str = "[Preparing Event to be sent]\n";
        } else {
            str = "[Event created but not sent(monitoringEnabled : " + z + " - trackWhiteListed : " + z2 + ")]\n";
        }
        Logger logger2 = Logger.INSTANCE;
        LogTag logTag2 = LogTag.MONITORING;
        SourceTag sourceTag = SourceTag.ADS;
        String str4 = o5Var.c;
        String str5 = o5Var.d;
        JSONObject jSONObject = o5Var.e;
        String str6 = o5Var.b;
        OguryMediation oguryMediation = o5Var.j;
        u2 u2Var = o5Var.h;
        if (u2Var != null) {
            String str7 = u2Var.a;
            String str8 = u2Var.b;
            JSONArray jSONArray = u2Var.c;
            v2 v2Var = u2Var.d;
            hh hhVar2 = v2Var != null ? v2Var.a : null;
            if (v2Var != null) {
                hhVar = v2Var.b;
                logger = logger2;
            } else {
                logger = logger2;
                hhVar = null;
            }
            StringBuilder sb = new StringBuilder();
            logTag = logTag2;
            sb.append("\n       campaignId : ");
            sb.append(str7);
            sb.append("\n       creativeId : ");
            sb.append(str8);
            sb.append("\n       extras     : ");
            sb.append(jSONArray);
            sb.append("\n       Banner     : \n           requestedSize : ");
            sb.append(hhVar2);
            sb.append("\n           creativeSize  : ");
            sb.append(hhVar);
            sb.append("\n");
            str2 = sb.toString();
        } else {
            logger = logger2;
            logTag = logTag2;
            str2 = null;
        }
        w2 w2Var = o5Var.f;
        if (w2Var != null) {
            str3 = "\n       type   : " + w2Var.a + "\n       reason : " + w2Var.b + "\n";
        } else {
            str3 = null;
        }
        logger.d(logTag, sourceTag, str + "id        : " + str4 + "\nname      : " + str5 + "\ndetails   : " + jSONObject + "\nsession   : " + str6 + "\nmediation : " + oguryMediation + "\nad        : " + str2 + "\nerror     : " + str3 + "\n ");
    }

    public final synchronized void a(ArrayList events) {
        String str;
        Object runBlocking$default;
        Object runBlocking$default2;
        Intrinsics.checkNotNullParameter(events, "events");
        if (events.isEmpty()) {
            return;
        }
        w5 w5Var = this.b;
        Intrinsics.checkNotNullParameter(events, "events");
        z8 z8Var = w5Var.a;
        h6 h6Var = w5Var.b;
        h6Var.getClass();
        Intrinsics.checkNotNullParameter(events, "events");
        r0 app = h6Var.a;
        og permissionsHandler = h6Var.d;
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(permissionsHandler, "permissionsHandler");
        String a = app.b.a();
        String packageName = app.a.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        Context context = app.a;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = "";
        }
        String valueOf = String.valueOf(str);
        permissionsHandler.getClass();
        String str2 = (String) permissionsHandler.a(g2.p, new bg(permissionsHandler));
        Intrinsics.checkNotNullParameter(app, "app");
        KotlinVersionDetector kotlinVersionDetector = KotlinVersionDetector.INSTANCE;
        t0 app2 = new t0(a, packageName, valueOf, str2, Integer.valueOf(app.d()), new o4(kotlinVersionDetector.getVersionInfo(app.a).getCompileVersion(), kotlinVersionDetector.getVersionInfo(app.a).getRuntimeVersion()), null);
        xg sdk = new xg();
        og permissionsHandler2 = h6Var.d;
        Intrinsics.checkNotNullParameter(permissionsHandler2, "permissionsHandler");
        permissionsHandler2.getClass();
        g2 g2Var = g2.f;
        ug screen = new ug((Integer) permissionsHandler2.a(g2Var, new jg(permissionsHandler2)), (Integer) permissionsHandler2.a(g2Var, new kg(permissionsHandler2)), (Float) permissionsHandler2.a(g2Var, new ig(permissionsHandler2)), null, (String) permissionsHandler2.a(g2.h, new eg(permissionsHandler2)), (String) permissionsHandler2.a(g2.i, new mg(permissionsHandler2)));
        og permissionsHandler3 = h6Var.d;
        Intrinsics.checkNotNullParameter(permissionsHandler3, "permissionsHandler");
        permissionsHandler3.getClass();
        c5 locale = new c5((String) permissionsHandler3.a(g2.l, new fg(permissionsHandler3)), (String) permissionsHandler3.a(g2.k, new gg(permissionsHandler3)));
        og permissionsHandler4 = h6Var.d;
        Intrinsics.checkNotNullParameter(permissionsHandler4, "permissionsHandler");
        permissionsHandler4.getClass();
        String str3 = (String) permissionsHandler4.a(g2.j, new lg(permissionsHandler4));
        Intrinsics.checkNotNullParameter(locale, "locale");
        zg settings = new zg(str3, locale, null, (Boolean) permissionsHandler4.a(g2.c, new uf(permissionsHandler4)));
        og permissionsHandler5 = h6Var.d;
        Intrinsics.checkNotNullParameter(permissionsHandler5, "permissionsHandler");
        permissionsHandler5.getClass();
        j8 network = new j8((String) permissionsHandler5.a(g2.m, new hg(permissionsHandler5)), (String) permissionsHandler5.a(g2.n, new wf(permissionsHandler5)));
        og permissionsHandler6 = h6Var.d;
        Intrinsics.checkNotNullParameter(permissionsHandler6, "permissionsHandler");
        permissionsHandler6.getClass();
        aj webview = new aj((String) permissionsHandler6.a(g2.o, new ng(permissionsHandler6)));
        og permissionsHandler7 = h6Var.d;
        Intrinsics.checkNotNullParameter(permissionsHandler7, "permissionsHandler");
        permissionsHandler7.getClass();
        lh system = new lh((String) permissionsHandler7.a(g2.q, new vf(permissionsHandler7)), (Boolean) permissionsHandler7.a(g2.r, new cg(permissionsHandler7)));
        q0 androidDevice = h6Var.b;
        og permissionsHandler8 = h6Var.d;
        Intrinsics.checkNotNullParameter(androidDevice, "androidDevice");
        Intrinsics.checkNotNullParameter(permissionsHandler8, "permissionsHandler");
        androidDevice.getClass();
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        permissionsHandler8.getClass();
        g2 g2Var2 = g2.e;
        String str4 = (String) permissionsHandler8.a(g2Var2, new yf(permissionsHandler8));
        String str5 = (String) permissionsHandler8.a(g2Var2, new zf(permissionsHandler8));
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(webview, "webview");
        Intrinsics.checkNotNullParameter(system, "system");
        l2 device = new l2("android", RELEASE, str4, str5, screen, settings, network, webview, system);
        r0 app3 = h6Var.a;
        Intrinsics.checkNotNullParameter(app3, "app");
        ke keVar = app3.b;
        keVar.getClass();
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new xc(keVar, null), 1, null);
        String name = ((Product) runBlocking$default).getName();
        ke keVar2 = app3.b;
        keVar2.getClass();
        runBlocking$default2 = BuildersKt__BuildersKt.runBlocking$default(null, new xc(keVar2, null), 1, null);
        sb product = new sb(name, ((Product) runBlocking$default2).getVersion());
        q0 androidDevice2 = h6Var.b;
        Intrinsics.checkNotNullParameter(androidDevice2, "androidDevice");
        androidDevice2.b.getClass();
        Long valueOf2 = Long.valueOf(System.currentTimeMillis());
        wh uuidUtils = h6Var.c;
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        uuidUtils.getClass();
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        Intrinsics.checkNotNullParameter(app2, "app");
        Intrinsics.checkNotNullParameter(sdk, "sdk");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(product, "product");
        JSONObject requestBody = new tf(valueOf2, uuid, app2, sdk, device, null, null, null, product, events).a();
        z8Var.getClass();
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        String a2 = fi.a();
        String jSONObject = requestBody.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        Completable.INSTANCE.fromAction(new v8(z8Var, new NetworkRequest(a2, "POST", jSONObject, z8Var.a.c))).doOnError(new s5(this, events)).subscribe(t5.a);
    }
}
