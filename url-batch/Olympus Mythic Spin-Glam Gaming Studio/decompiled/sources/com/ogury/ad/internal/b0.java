package com.ogury.ad.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ironsource.X3;
import com.ogury.ad.OguryAdError;
import com.ogury.ad.OguryShowErrorCode;
import com.ogury.ad.common.OguryMediation;
import com.ogury.ad.viewer.AdsCallback;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class b0 {
    public final Context a;
    public final s0 b;
    public final t3 c;
    public final x d;
    public final le e;
    public final u5 f;
    public final h9 g;
    public final r8 h;
    public final String i;
    public final OguryMediation j;
    public final v6 k;
    public final qh l;

    public b0(Context context, s0 appBackgroundChecker, t3 internetChecker, x adType, String sessionId, OguryMediation oguryMediation) {
        v6 cacheStore = v6.a;
        le profigGateway = le.a;
        r5 r5Var = u5.e;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        u5 monitoringEventLogger = r5Var.a(applicationContext);
        h9 ogurySdk = h9.a;
        r8 oguryAds = r8.a;
        qh timeUtils = new qh();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appBackgroundChecker, "appBackgroundChecker");
        Intrinsics.checkNotNullParameter(internetChecker, "internetChecker");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(profigGateway, "profigGateway");
        Intrinsics.checkNotNullParameter(monitoringEventLogger, "monitoringEventLogger");
        Intrinsics.checkNotNullParameter(ogurySdk, "ogurySdk");
        Intrinsics.checkNotNullParameter(oguryAds, "oguryAds");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(cacheStore, "cacheStore");
        Intrinsics.checkNotNullParameter(timeUtils, "timeUtils");
        this.a = context;
        this.b = appBackgroundChecker;
        this.c = internetChecker;
        this.d = adType;
        this.e = profigGateway;
        this.f = monitoringEventLogger;
        this.g = ogurySdk;
        this.h = oguryAds;
        this.i = sessionId;
        this.j = oguryMediation;
        this.k = cacheStore;
        this.l = timeUtils;
    }

    public final boolean a(AdsCallback adsCallback, boolean z, c adConfig, List ads, boolean z2, boolean z3, int i, int i2) {
        SourceTag sourceTag;
        boolean z4;
        long j;
        Long l;
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        Intrinsics.checkNotNullParameter(ads, "ads");
        Logger logger = Logger.INSTANCE;
        LogTag logTag = LogTag.INTERNAL;
        SourceTag sourceTag2 = SourceTag.ADS;
        logger.w(logTag, sourceTag2, "onRenderProcessGone\n showConditionsAreMet --> reloadAttempts = " + i + "      maxReloadAttempts = " + i2);
        Context context = this.a;
        this.g.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        n9 n9Var = h9.b;
        n9Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (n9Var.b.a(context).a().length() == 0 && n9Var.h == 1) {
            IntegrationLogger.e(LogTag.REQUESTS, sourceTag2, X3.j.d + this.d.b + "][Show] Failed to show (module not set up)");
            this.f.a(nb.A, adConfig.a, this.i, this.j, pb.a(TuplesKt.to("from_ad_markup", Boolean.valueOf(z2)), TuplesKt.to("reload", Boolean.valueOf(z3)), TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)), null, new v2(adConfig.f));
            a(adsCallback, new OguryAdError(OguryAdError.Type.SHOW_ERROR, 3000, "The ad could not be displayed because the SDK appears to have not been started."));
            return false;
        }
        this.g.getClass();
        if (n9Var.h == 1) {
            IntegrationLogger.e(LogTag.REQUESTS, sourceTag2, X3.j.d + this.d.b + "][Show] Failed to show (module not set up)");
            this.f.a(nb.B, adConfig.a, this.i, this.j, pb.a(TuplesKt.to("from_ad_markup", Boolean.valueOf(z2)), TuplesKt.to("reload", Boolean.valueOf(z3)), TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)), null, new v2(adConfig.f));
            a(adsCallback, new OguryAdError(OguryAdError.Type.SHOW_ERROR, 3000, "The ad could not be displayed because the SDK appears to have not been started."));
            return false;
        }
        this.g.getClass();
        if (n9Var.h == 4) {
            this.f.a(nb.C, adConfig.a, this.i, this.j, pb.a(TuplesKt.to("from_ad_markup", Boolean.valueOf(z2)), TuplesKt.to("reload", Boolean.valueOf(z3)), TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)), null, new v2(adConfig.f));
            a(adsCallback, new OguryAdError(OguryAdError.Type.SHOW_ERROR, 3001, "The ad could not be displayed because the SDK is not properly initialized."));
            return false;
        }
        if (a(OguryShowErrorCode.INVALID_CONFIGURATION)) {
            a(OguryShowErrorCode.INVALID_CONFIGURATION, z2, z3, ads, adConfig, i);
            a(adsCallback, new OguryAdError(OguryAdError.Type.SHOW_ERROR, OguryShowErrorCode.INVALID_CONFIGURATION, "The ad could not be displayed due to an invalid SDK configuration."));
            return false;
        }
        this.k.getClass();
        u6 c = v6.c();
        if (c != null) {
            u5 u5Var = this.f;
            nb nbVar = nb.z;
            b bVar = c.c;
            x1 x1Var = bVar.G;
            sourceTag = sourceTag2;
            Pair pair = TuplesKt.to("expiration_source", (x1Var != null ? x1Var.a : null) != null ? "ad" : "profig");
            x1 x1Var2 = c.c.G;
            if (x1Var2 == null || (l = x1Var2.a) == null) {
                this.e.getClass();
                j = le.b.d.e;
            } else {
                j = l.longValue();
            }
            Pair pair2 = TuplesKt.to("expiration_time", Long.valueOf(j));
            this.l.getClass();
            u5Var.a(nbVar, bVar, pb.a(TuplesKt.to("from_ad_markup", Boolean.valueOf(z2)), TuplesKt.to("reload", Boolean.valueOf(z3)), TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)), pb.b(pair, pair2, TuplesKt.to("time_span", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - c.d)))));
            z4 = true;
        } else {
            sourceTag = sourceTag2;
            z4 = false;
        }
        if (i > i2) {
            this.f.a(nb.I, adConfig.a, this.i, this.j, pb.a(TuplesKt.to("from_ad_markup", Boolean.valueOf(z2)), TuplesKt.to("reload", Boolean.valueOf(z3)), TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)), null, new v2(adConfig.f));
            a(adsCallback, new OguryAdError(OguryAdError.Type.SHOW_ERROR, OguryShowErrorCode.WEBVIEW_TERMINATED_BY_SYSTEM, "The ad could not be displayed because the WebView was terminated by the system, resulting in the ad being unloaded due to high resource consumption by the application."));
            return false;
        }
        if (!z || ads.isEmpty()) {
            LogTag logTag2 = LogTag.REQUESTS;
            SourceTag sourceTag3 = sourceTag;
            IntegrationLogger.e(logTag2, sourceTag3, X3.j.d + this.d.b + "][Show] Failed to show (no ad loaded)");
            IntegrationLogger.d(logTag2, sourceTag3, X3.j.d + this.d.b + "][Show] Triggering onAdError() callback");
            if (adsCallback == null) {
                IntegrationLogger.d(logTag2, sourceTag3, X3.j.d + this.d.b + "][Show] No ad listener registered");
            }
            if (z4) {
                a(adsCallback, new OguryAdError(OguryAdError.Type.SHOW_ERROR, OguryShowErrorCode.AD_EXPIRED, "The ad could not be displayed because the retention time of the loaded ad has expired."));
            } else {
                this.f.a(nb.D, adConfig.a, this.i, this.j, pb.a(TuplesKt.to("from_ad_markup", Boolean.valueOf(z2)), TuplesKt.to("reload", Boolean.valueOf(z3)), TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)), null, new v2(adConfig.f));
                if (adsCallback != null) {
                    adsCallback.onAdNotLoaded();
                }
            }
            return false;
        }
        Iterator it = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(OguryShowErrorCode.AD_DISABLED_UNSPECIFIED_REASON), Integer.valueOf(OguryShowErrorCode.VIEW_IN_BACKGROUND), Integer.valueOf(OguryShowErrorCode.ANOTHER_AD_ALREADY_DISPLAYED), 3002}).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (a(intValue)) {
                a(intValue, z2, z3, ads, adConfig, i);
                if (intValue == 3002) {
                    a(adsCallback, new OguryAdError(OguryAdError.Type.SHOW_ERROR, intValue, "The ad could not be displayed because there is no active Internet connection."));
                } else if (intValue == 3100) {
                    a(adsCallback, new OguryAdError(OguryAdError.Type.SHOW_ERROR, intValue, "The ad could not be displayed due to an invalid SDK configuration."));
                } else if (intValue == 3104) {
                    this.e.getClass();
                    String str = le.b.d.c;
                    int hashCode = str.hashCode();
                    if (hashCode == -1984720000) {
                        if (str.equals("CONSENT_DENIED")) {
                            a(adsCallback, new OguryAdError(OguryAdError.Type.SHOW_ERROR, OguryShowErrorCode.AD_DISABLED_CONSENT_DENIED, "The ad could not be displayed because ads are disabled for an unspecified reason."));
                        }
                        a(adsCallback, new OguryAdError(OguryAdError.Type.SHOW_ERROR, OguryShowErrorCode.AD_DISABLED_UNSPECIFIED_REASON, "The ad could not be displayed because ads are disabled for an unspecified reason."));
                    } else if (hashCode != -1879742975) {
                        if (hashCode == 659206911 && str.equals("COUNTRY_NOT_OPEN")) {
                            a(adsCallback, new OguryAdError(OguryAdError.Type.SHOW_ERROR, OguryShowErrorCode.AD_DISABLED_COUNTRY_NOT_OPENED, "The ad could not be displayed because ads are disabled; the user’s country is not yet available for advertising."));
                        }
                        a(adsCallback, new OguryAdError(OguryAdError.Type.SHOW_ERROR, OguryShowErrorCode.AD_DISABLED_UNSPECIFIED_REASON, "The ad could not be displayed because ads are disabled for an unspecified reason."));
                    } else {
                        if (str.equals("CONSENT_MISSING")) {
                            a(adsCallback, new OguryAdError(OguryAdError.Type.SHOW_ERROR, OguryShowErrorCode.AD_DISABLED_CONSENT_MISSING, "The ad could not be displayed because ads are disabled; the user consent is missing or has not been provided."));
                        }
                        a(adsCallback, new OguryAdError(OguryAdError.Type.SHOW_ERROR, OguryShowErrorCode.AD_DISABLED_UNSPECIFIED_REASON, "The ad could not be displayed because ads are disabled for an unspecified reason."));
                    }
                } else if (intValue == 3202) {
                    a(adsCallback, new OguryAdError(OguryAdError.Type.SHOW_ERROR, intValue, "The ad could not be displayed because the application was running in the background."));
                } else if (intValue == 3203) {
                    a(adsCallback, new OguryAdError(OguryAdError.Type.SHOW_ERROR, intValue, "The ad could not be displayed because another ad is currently being displayed."));
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (com.ogury.ad.internal.r8.c != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i) {
        NetworkInfo networkInfo;
        boolean z = false;
        if (i == 3002) {
            t3 t3Var = this.c;
            Context context = this.a;
            t3Var.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "<this>");
            Intrinsics.checkNotNullParameter(context, "<this>");
            Intrinsics.checkNotNullParameter(context, "<this>");
            Intrinsics.checkNotNullParameter("android.permission.ACCESS_NETWORK_STATE", "permission");
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                Object systemService = context.getSystemService("connectivity");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                networkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (networkInfo != null && networkInfo.isConnected()) {
                z = true;
            }
            return !z;
        }
        if (i == 3100) {
            this.e.getClass();
            return !le.b.a;
        }
        if (i == 3104) {
            this.e.getClass();
            return !le.b.d.a;
        }
        if (i == 3202) {
            s0 s0Var = this.b;
            Context context2 = this.a;
            s0Var.getClass();
            return s0.a(context2);
        }
        if (i != 3203) {
            IntegrationLogger.e(LogTag.REQUESTS, SourceTag.ADS, X3.j.d + this.d.b + "][Show] Failed to show (error code: " + i + ")");
            throw new IllegalArgumentException("Illegal argument " + i);
        }
        if (this.d.b()) {
            this.h.getClass();
        }
        x xVar = this.d;
        xVar.getClass();
        if (xVar == x.f) {
            this.h.getClass();
            if (r8.b) {
                return true;
            }
        }
        return false;
    }

    public final void a(int i, boolean z, boolean z2, List list, c cVar, int i2) {
        if (i == 3002) {
            IntegrationLogger.e(LogTag.REQUESTS, SourceTag.ADS, X3.j.d + this.d.b + "][Show] Failed to show (No Internet connection)");
            this.f.a(nb.H, (b) CollectionsKt.first(list), pb.a(TuplesKt.to("from_ad_markup", Boolean.valueOf(z)), TuplesKt.to("reload", Boolean.valueOf(z2)), TuplesKt.to("webview_termination", i2 > 0 ? Integer.valueOf(i2) : null)), null);
            return;
        }
        if (i == 3100) {
            IntegrationLogger.e(LogTag.REQUESTS, SourceTag.ADS, X3.j.d + this.d.b + "][Show] Failed to show (missing configuration)");
            if (list.isEmpty()) {
                this.f.a(nb.E, cVar.a, this.i, this.j, pb.a(TuplesKt.to("from_ad_markup", Boolean.valueOf(z)), TuplesKt.to("reload", Boolean.valueOf(z2)), TuplesKt.to("webview_termination", i2 > 0 ? Integer.valueOf(i2) : null)), null, new v2(cVar.f));
                return;
            } else {
                this.f.a(nb.E, (b) CollectionsKt.first(list), pb.a(TuplesKt.to("from_ad_markup", Boolean.valueOf(z)), TuplesKt.to("reload", Boolean.valueOf(z2)), TuplesKt.to("webview_termination", i2 > 0 ? Integer.valueOf(i2) : null)), null);
                return;
            }
        }
        if (i == 3104) {
            IntegrationLogger.e(LogTag.REQUESTS, SourceTag.ADS, X3.j.d + this.d.b + "][Show] Failed to show (Ad serving has been disabled)");
            this.f.a(nb.y, cVar.a, this.i, this.j, pb.a(TuplesKt.to("from_ad_markup", Boolean.valueOf(z)), TuplesKt.to("reload", Boolean.valueOf(z2)), TuplesKt.to("webview_termination", i2 > 0 ? Integer.valueOf(i2) : null)), null, new v2(cVar.f));
            return;
        }
        if (i == 3202) {
            IntegrationLogger.e(LogTag.REQUESTS, SourceTag.ADS, X3.j.d + this.d.b + "][Show] Failed to show (Activity in background)");
            this.f.a(nb.F, (b) CollectionsKt.first(list), pb.a(TuplesKt.to("from_ad_markup", Boolean.valueOf(z)), TuplesKt.to("reload", Boolean.valueOf(z2)), TuplesKt.to("webview_termination", i2 > 0 ? Integer.valueOf(i2) : null)), null);
            return;
        }
        if (i != 3203) {
            return;
        }
        IntegrationLogger.e(LogTag.REQUESTS, SourceTag.ADS, X3.j.d + this.d.b + "][Show] Failed to show (Another ad already displayed)");
        this.f.a(nb.G, (b) CollectionsKt.first(list), pb.a(TuplesKt.to("from_ad_markup", Boolean.valueOf(z)), TuplesKt.to("reload", Boolean.valueOf(z2)), TuplesKt.to("webview_termination", i2 > 0 ? Integer.valueOf(i2) : null)), null);
    }

    public final void a(AdsCallback adsCallback, OguryAdError oguryAdError) {
        LogTag logTag = LogTag.REQUESTS;
        SourceTag sourceTag = SourceTag.ADS;
        IntegrationLogger.d(logTag, sourceTag, X3.j.d + this.d.b + "][Show] Triggering onAdError() callback");
        if (adsCallback == null) {
            IntegrationLogger.d(logTag, sourceTag, X3.j.d + this.d.b + "][Show] No ad listener registered");
        }
        if (adsCallback != null) {
            adsCallback.onAdError(oguryAdError);
        }
    }
}
