package com.ogury.ad.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.ironsource.X3;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.InternalCore;
import com.ogury.core.internal.KotlinVersionDetector;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import com.ogury.core.internal.network.NetworkResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class ne {
    public static final me g = new me();
    public static volatile ne h;
    public final Context a;
    public final ke b;
    public final z8 c;
    public final q0 d;
    public final u5 e;
    public boolean f;

    public ne(Context context, ke keVar, z8 z8Var, t3 t3Var, q0 q0Var, r2 r2Var, u5 u5Var) {
        le leVar = le.a;
        this.a = context;
        this.b = keVar;
        this.c = z8Var;
        this.d = q0Var;
        this.e = u5Var;
    }

    public final void a(qe qeVar, String fullProfigResponse) {
        pf profig;
        a(qeVar.b, qeVar.c);
        Intrinsics.checkNotNullParameter(fullProfigResponse, "serializedProfigResponse");
        try {
            profig = oe.a(new JSONObject(fullProfigResponse));
        } catch (Exception e) {
            Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, e);
            profig = new pf();
        }
        if (!profig.a) {
            throw new JSONException("Invalid configuration received");
        }
        LogTag logTag = LogTag.INTERNAL;
        SourceTag sourceTag = SourceTag.ADS;
        IntegrationLogger.d(logTag, sourceTag, "[Setup] Saving configuration...");
        le leVar = le.a;
        Intrinsics.checkNotNullParameter(profig, "newCachedProfigResponse");
        le.b = profig;
        ke keVar = this.b;
        Intrinsics.checkNotNullParameter(fullProfigResponse, "fullProfigResponse");
        BuildersKt.runBlocking(Dispatchers.getIO(), new ge(keVar, fullProfigResponse, null));
        IntegrationLogger.d(logTag, sourceTag, "[Setup] Configuration saved");
        Logger.INSTANCE.d(logTag, sourceTag, qf.a(profig));
        u5 u5Var = this.e;
        Intrinsics.checkNotNullParameter(profig, "profig");
        if (!profig.e.d.a) {
            g6 g6Var = u5Var.a;
            BuildersKt__Builders_commonKt.launch$default(g6Var.e, null, null, new a6(g6Var, null), 3, null);
        } else {
            g6 g6Var2 = u5Var.a;
            ArrayList arrayList = new ArrayList();
            BuildersKt__Builders_commonKt.launch$default(g6Var2.e, null, null, new b6(g6Var2, arrayList, null), 3, null);
            u5Var.a(arrayList);
        }
    }

    public final pf b() {
        Object runBlocking$default;
        pf newCachedProfigResponse;
        oh.a("loadProfigResponseFromCache");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new jd(this.b, null), 1, null);
        String serializedProfigResponse = (String) runBlocking$default;
        Intrinsics.checkNotNullParameter(serializedProfigResponse, "serializedProfigResponse");
        try {
            newCachedProfigResponse = oe.a(new JSONObject(serializedProfigResponse));
        } catch (Exception e) {
            Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, e);
            newCachedProfigResponse = new pf();
        }
        le leVar = le.a;
        Intrinsics.checkNotNullParameter(newCachedProfigResponse, "newCachedProfigResponse");
        le.b = newCachedProfigResponse;
        return newCachedProfigResponse;
    }

    public static void b(String str) {
        IntegrationLogger.d(LogTag.INTERNAL, SourceTag.ADS, "[Setup] Configuration needs to be synchronized with servers due to " + str + ".\n Proceeding with server synchronization...");
    }

    public final boolean a() {
        Object runBlocking$default;
        Object runBlocking$default2;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new dc(this.b, null), 1, null);
        long longValue = ((Number) runBlocking$default).longValue();
        runBlocking$default2 = BuildersKt__BuildersKt.runBlocking$default(null, new hc(this.b, null), 1, null);
        long longValue2 = ((Number) runBlocking$default2).longValue() + longValue;
        this.d.b.getClass();
        return longValue2 <= TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public final pf a(boolean z) {
        String str;
        String str2;
        Object runBlocking$default;
        NetworkInfo networkInfo;
        Object runBlocking$default2;
        Object runBlocking$default3;
        Object runBlocking$default4;
        Object runBlocking$default5;
        Object runBlocking$default6;
        Object runBlocking$default7;
        IntegrationLogger.d(LogTag.PUBLISHER, SourceTag.ADS, "[Setup] Synchronizing configuration...");
        oh.a("syncProfigIfNecessary");
        Context context = this.a;
        Intrinsics.checkNotNullParameter(context, "context");
        r0 app = new r0(context);
        q0 androidDevice = new q0(context);
        h2 coreWrapper = new h2(context);
        og permissionsHandler = new og(context, hb.a);
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(permissionsHandler, "permissionsHandler");
        String a = app.b.a();
        String packageName = app.a.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        Context context2 = app.a;
        try {
            str = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = "";
        }
        String valueOf = String.valueOf(str);
        Intrinsics.checkNotNullParameter(app, "app");
        KotlinVersionDetector kotlinVersionDetector = KotlinVersionDetector.INSTANCE;
        t0 app2 = new t0(a, packageName, valueOf, null, Integer.valueOf(app.d()), new o4(kotlinVersionDetector.getVersionInfo(app.a).getCompileVersion(), kotlinVersionDetector.getVersionInfo(app.a).getRuntimeVersion()), null);
        xg sdk = new xg();
        Intrinsics.checkNotNullParameter(androidDevice, "androidDevice");
        Intrinsics.checkNotNullParameter(permissionsHandler, "permissionsHandler");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        l2 device = new l2("android", RELEASE, null, null, null, null, null, null, null);
        Intrinsics.checkNotNullParameter(coreWrapper, "coreWrapper");
        qb privacyCompliance = new qb(InternalCore.retrieveTcfConsentString(coreWrapper.a), InternalCore.retrieveGppConsentString(coreWrapper.a), InternalCore.retrieveGppSectionIdsString(coreWrapper.a), InternalCore.getAllPublisherData(coreWrapper.a), null, null);
        Intrinsics.checkNotNullParameter(androidDevice, "androidDevice");
        Intrinsics.checkNotNullParameter(app2, "app");
        Intrinsics.checkNotNullParameter(sdk, "sdk");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(privacyCompliance, "privacyCompliance");
        JSONObject a2 = new tf(null, null, app2, sdk, device, privacyCompliance, null, null, null, null).a();
        String jSONObject = a2.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        String a3 = e5.a(jSONObject);
        try {
            str2 = a2.getJSONObject("privacy_compliancy").toString();
            Intrinsics.checkNotNull(str2);
        } catch (JSONException e) {
            Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, e);
            str2 = "";
        }
        String a4 = e5.a(str2);
        pf b = b();
        boolean a5 = a();
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new lc(this.b, null), 1, null);
        if (((Number) runBlocking$default).longValue() != System.currentTimeMillis() / TimeUnit.DAYS.toMillis(1L)) {
            BuildersKt.runBlocking(Dispatchers.getIO(), new yd(this.b, 0, null));
            BuildersKt__BuildersKt.runBlocking$default(null, new wd(this.b, null), 1, null);
        }
        Context context3 = this.a;
        Intrinsics.checkNotNullParameter(context3, "context");
        Intrinsics.checkNotNullParameter(context3, "<this>");
        Intrinsics.checkNotNullParameter(context3, "<this>");
        Intrinsics.checkNotNullParameter(context3, "<this>");
        Intrinsics.checkNotNullParameter("android.permission.ACCESS_NETWORK_STATE", "permission");
        if (context3.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            Object systemService = context3.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            networkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            if (!this.f || a5) {
                runBlocking$default2 = BuildersKt__BuildersKt.runBlocking$default(null, new pc(this.b, null), 1, null);
                if (((Number) runBlocking$default2).intValue() < b.c.a) {
                    runBlocking$default3 = BuildersKt__BuildersKt.runBlocking$default(null, new nd(this.b, null), 1, null);
                    if (!((Boolean) runBlocking$default3).booleanValue()) {
                        b("a missing configuration");
                        a(a2, a3, a4, z);
                    } else if (!b.a) {
                        b("no profig synced");
                        a(a2, a3, a4, z);
                    } else if (!a5) {
                        runBlocking$default4 = BuildersKt__BuildersKt.runBlocking$default(null, new fd(this.b, null), 1, null);
                        if (!Intrinsics.areEqual((String) runBlocking$default4, "5.2.2-404010")) {
                            runBlocking$default6 = BuildersKt__BuildersKt.runBlocking$default(null, new bd(this.b, null), 1, null);
                            if (!Intrinsics.areEqual((String) runBlocking$default6, a3)) {
                                b("the detection of a new SDK version");
                                a(a2, a3, a4, z);
                            }
                        }
                        runBlocking$default5 = BuildersKt__BuildersKt.runBlocking$default(null, new tc(this.b, null), 1, null);
                        if (!Intrinsics.areEqual((String) runBlocking$default5, a4)) {
                            b("New Privacy Data");
                            a(a2, a3, a4, z);
                        } else {
                            IntegrationLogger.d(LogTag.INTERNAL, SourceTag.ADS, "[Setup] Local configuration is up to date");
                        }
                    } else {
                        b("an obsolete configuration");
                        a(a2, a3, a4, z);
                    }
                } else {
                    LogTag logTag = LogTag.INTERNAL;
                    SourceTag sourceTag = SourceTag.ADS;
                    IntegrationLogger.d(logTag, sourceTag, "[Setup] Too many synchronization");
                    Logger logger = Logger.INSTANCE;
                    runBlocking$default7 = BuildersKt__BuildersKt.runBlocking$default(null, new pc(this.b, null), 1, null);
                    logger.d(logTag, sourceTag, "api calls reached " + (((Number) runBlocking$default7).intValue() >= b.c.a));
                }
            } else {
                LogTag logTag2 = LogTag.INTERNAL;
                SourceTag sourceTag2 = SourceTag.ADS;
                IntegrationLogger.d(logTag2, sourceTag2, "[Setup] Configuration is already synchronizing");
                Logger.INSTANCE.d(logTag2, sourceTag2, "Profig - profig sync already in progress");
            }
        } else {
            IntegrationLogger.d(LogTag.INTERNAL, SourceTag.ADS, "[Setup] Impossible to join Ogury servers. No Internet connection");
            this.f = false;
        }
        return le.b;
    }

    public final void a(JSONObject jSONObject, String str, String str2, boolean z) {
        qe qeVar = new qe(jSONObject, str, str2);
        this.f = true;
        IntegrationLogger.d(LogTag.INTERNAL, SourceTag.ADS, "[Setup] Synchronizing configuration from servers...");
        a(qeVar, z);
        this.f = false;
    }

    public final void a(qe qeVar, boolean z) {
        Logger logger = Logger.INSTANCE;
        LogTag logTag = LogTag.INTERNAL;
        SourceTag sourceTag = SourceTag.ADS;
        logger.d(logTag, sourceTag, "making profig api call " + qeVar);
        try {
            NetworkResponse a = this.c.a(qeVar.a);
            if (a instanceof NetworkResponse.Success) {
                a(((NetworkResponse.Success) a).getResponseHeaders());
                String serializedProfigResponse = ((NetworkResponse.Success) a).getResponseBody();
                Intrinsics.checkNotNullParameter(serializedProfigResponse, "serializedProfigResponse");
                if (new JSONObject(serializedProfigResponse).has("response")) {
                    a(qeVar, ((NetworkResponse.Success) a).getResponseBody());
                    IntegrationLogger.d(logTag, sourceTag, "[Setup] Configuration synchronized");
                    this.f = false;
                    return;
                }
                throw new ph(new a9(3, "\"response\" key not found"), nh.b);
            }
            if (a instanceof NetworkResponse.Failure) {
                t2 a2 = r2.a(((NetworkResponse.Failure) a).getResponseBody());
                this.f = false;
                a(a2.a.a);
                throw new ph(new a9(3, ((NetworkResponse.Failure) a).getCom.mobilefuse.sdk.telemetry.TelemetryCategory.EXCEPTION java.lang.String().getMessage() + " (" + a2.a.a + ")"), nh.a);
            }
        } catch (Exception e) {
            a(e.getMessage());
            Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, e);
            this.f = false;
            if (z) {
                throw e;
            }
        }
    }

    public final void a(Map map) {
        List list;
        long j;
        Map mutableMap = map != null ? MapsKt.toMutableMap(map) : null;
        long j2 = 43200;
        if (mutableMap != null && (list = (List) mutableMap.get("Cache-Control")) != null) {
            Matcher matcher = Pattern.compile("max-age=(\\d+)").matcher((CharSequence) CollectionsKt.first(list));
            loop0: while (true) {
                j = 43200;
                while (matcher.find()) {
                    String group = matcher.group(1);
                    if (group != null) {
                        Intrinsics.checkNotNull(group);
                        j = Long.parseLong(group);
                    }
                }
            }
            j2 = j;
        }
        BuildersKt.runBlocking(Dispatchers.getIO(), new ud(this.b, j2, null));
        ke keVar = this.b;
        this.d.b.getClass();
        BuildersKt.runBlocking(Dispatchers.getIO(), new sd(keVar, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()), null));
    }

    public final void a(String str) {
        IntegrationLogger.d(LogTag.INTERNAL, SourceTag.ADS, "[Setup] Failed to synchronize configuration (" + str + ")");
        le leVar = le.a;
        pf newCachedProfigResponse = new pf();
        Intrinsics.checkNotNullParameter(newCachedProfigResponse, "newCachedProfigResponse");
        le.b = newCachedProfigResponse;
        BuildersKt.runBlocking(Dispatchers.getIO(), new vb(this.b, null));
        a((String) null, (String) null);
    }

    public final void a(String md5ProfigRequestBody, String md5PrivacyCompliancyData) {
        Object runBlocking$default;
        ke keVar = this.b;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new pc(keVar, null), 1, null);
        BuildersKt.runBlocking(Dispatchers.getIO(), new yd(keVar, ((Number) runBlocking$default).intValue() + 1, null));
        ke keVar2 = this.b;
        Intrinsics.checkNotNullParameter("5.2.2-404010", X3.j.W);
        BuildersKt.runBlocking(Dispatchers.getIO(), new ie(keVar2, null));
        if (md5ProfigRequestBody != null) {
            ke keVar3 = this.b;
            Intrinsics.checkNotNullParameter(md5ProfigRequestBody, "md5ProfigRequestBody");
            BuildersKt.runBlocking(Dispatchers.getIO(), new ee(keVar3, md5ProfigRequestBody, null));
        }
        if (md5PrivacyCompliancyData != null) {
            ke keVar4 = this.b;
            Intrinsics.checkNotNullParameter(md5PrivacyCompliancyData, "md5PrivacyCompliancyData");
            BuildersKt.runBlocking(Dispatchers.getIO(), new ae(keVar4, md5PrivacyCompliancyData, null));
        }
    }
}
