package com.smaato.sdk.ng;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.smaato.sdk.ng.analytics.ReportingController;
import com.smaato.sdk.ng.analytics.ReportingEvent;
import com.smaato.sdk.ng.analytics.ReportingEventCallback;
import com.smaato.sdk.ng.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class DiagnosticsManager implements ReportingEventCallback {
    private static final String b = "DiagnosticsManager";
    private final String a;

    public DiagnosticsManager(Context context, ReportingController reportingController) {
        if (context != null) {
            this.a = a(context);
        } else {
            this.a = "";
        }
        if (reportingController != null) {
            reportingController.addCallback(this);
        }
    }

    private synchronized String a(ReportingEvent reportingEvent) {
        StringBuilder sb;
        try {
            sb = new StringBuilder();
            sb.append("\nNextGen Diagnostics Log:\n\n");
            if (NextGen.isInitialized()) {
                if (reportingEvent != null) {
                    sb.append("Event: ");
                    sb.append(reportingEvent.getEventType());
                    sb.append("\n");
                }
                sb.append("Version: ");
                sb.append(NextGen.getNextGenVersion());
                sb.append("\n");
                sb.append("Bundle Id: ");
                sb.append(NextGen.getBundleId());
                sb.append("\n");
                sb.append("App Token: ");
                sb.append(NextGen.getAppToken());
                sb.append("\n");
                sb.append("Test Mode: ");
                sb.append(NextGen.isTestMode() ? "true" : "false");
                sb.append("\n");
                sb.append("COPPA: ");
                sb.append(NextGen.isCoppaEnabled() ? "true" : "false");
                sb.append("\n");
                sb.append("Video Audio State: ");
                sb.append(NextGen.getVideoAudioStatus().getStateName());
                sb.append("\n");
                sb.append("Location tracking (if permission): ");
                sb.append(NextGen.isLocationTrackingEnabled() ? "true" : "false");
                sb.append("\n");
                sb.append("Location updates (if permission): ");
                sb.append(NextGen.areLocationUpdatesEnabled() ? "true" : "false");
                sb.append("\n");
                sb.append("Time: ");
                sb.append(System.currentTimeMillis());
                sb.append("\n");
                sb.append("Device OS: ");
                sb.append("Android");
                sb.append("\n");
                sb.append("Device OS Version: ");
                sb.append(Build.VERSION.SDK_INT);
                sb.append("\n");
                sb.append("Device Model: ");
                sb.append(Build.MODEL);
                sb.append("\n");
                sb.append("Device Manufacturer: ");
                sb.append(Build.MANUFACTURER);
                sb.append("\n");
                if (!TextUtils.isEmpty(this.a)) {
                    sb.append("Google Ads Application Id: ");
                    sb.append(this.a);
                    sb.append("\n");
                }
                sb.append("Available formats:\n");
                sb.append(b());
                sb.append("Available adapters:\n");
                sb.append(a());
            } else {
                sb.append("NextGen SDK has not been initialised");
                sb.append("\n");
            }
            sb.append("\n-----------------------------------------------------------------");
        } catch (Throwable th) {
            throw th;
        }
        return sb.toString();
    }

    private void b(ReportingEvent reportingEvent) {
        printDiagnosticsLog(reportingEvent);
    }

    private Boolean c() {
        return NextGen.isDiagnosticsEnabled();
    }

    public static synchronized String generatePlacementDiagnosticsLog(Context context, JSONObject jSONObject) {
        String sb;
        synchronized (DiagnosticsManager.class) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\nNextGen Placement Diagnostics Log:\n\n");
            if (jSONObject != null && jSONObject.length() != 0) {
                try {
                    sb2.append(jSONObject.toString(2));
                    sb2.append("\n-----------------------------------------------------------------");
                } catch (JSONException e) {
                    Logger.e(b, "Error parsing placement params: ", e);
                    sb2.append("Placement data could not be loaded");
                    sb2.append("\n-----------------------------------------------------------------");
                }
            }
            sb = sb2.toString();
        }
        return sb;
    }

    @Override // com.smaato.sdk.ng.analytics.ReportingEventCallback
    public void onEvent(ReportingEvent reportingEvent) {
        if (reportingEvent == null || TextUtils.isEmpty(reportingEvent.getEventType()) || !reportingEvent.getEventType().equals("init") || !c().booleanValue()) {
            return;
        }
        b(reportingEvent);
    }

    public void printDiagnosticsLog() {
        Logger.d(b, a((ReportingEvent) null));
    }

    public void printPlacementDiagnosticsLog(Context context, JSONObject jSONObject) {
        if (NextGen.isDiagnosticsEnabled().booleanValue()) {
            Logger.d(b, generatePlacementDiagnosticsLog(context, jSONObject));
        }
    }

    private String b() {
        StringBuilder sb = new StringBuilder();
        if (a("com.smaato.sdk.ng.views.NextGenAdView")) {
            sb.append("\t");
            sb.append("Banner");
            sb.append("\n");
        }
        if (a("com.smaato.sdk.ng.interstitial.NextGenInterstitialAd")) {
            sb.append("\t");
            sb.append("Interstitial");
            sb.append("\n");
        }
        if (a("com.smaato.sdk.ng.rewarded.NextGenRewardedAd")) {
            sb.append("\t");
            sb.append("Rewarded");
            sb.append("\n");
        }
        if (a("com.smaato.sdk.ng.request.NextGenNativeAdRequest")) {
            sb.append("\t");
            sb.append("Native");
            sb.append("\n");
        }
        if (sb.length() == 0) {
            sb.append("\t");
            sb.append("No formats available");
            sb.append("\n");
        }
        return sb.toString();
    }

    public void printDiagnosticsLog(ReportingEvent reportingEvent) {
        Logger.d(b, a(reportingEvent));
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        if (a("com.smaato.sdk.adapters.admob.mediation.NextGenMediationBannerCustomEvent")) {
            sb.append("\t");
            sb.append("com.smaato.sdk.adapters.admob.mediation.NextGenMediationBannerCustomEvent");
            sb.append("\n");
        }
        if (a("com.smaato.sdk.adapters.admob.mediation.NextGenMediationMRectCustomEvent")) {
            sb.append("\t");
            sb.append("com.smaato.sdk.adapters.admob.mediation.NextGenMediationMRectCustomEvent");
            sb.append("\n");
        }
        if (a("com.smaato.sdk.adapters.admob.mediation.NextGenMediationLeaderboardCustomEvent")) {
            sb.append("\t");
            sb.append("com.smaato.sdk.adapters.admob.mediation.NextGenMediationLeaderboardCustomEvent");
            sb.append("\n");
        }
        if (a("com.smaato.sdk.adapters.admob.mediation.NextGenMediationInterstitialCustomEvent")) {
            sb.append("\t");
            sb.append("com.smaato.sdk.adapters.admob.mediation.NextGenMediationInterstitialCustomEvent");
            sb.append("\n");
        }
        if (a("com.smaato.sdk.adapters.admob.mediation.NextGenMediationRewardedVideoCustomEvent")) {
            sb.append("\t");
            sb.append("com.smaato.sdk.adapters.admob.mediation.NextGenMediationRewardedVideoCustomEvent");
            sb.append("\n");
        }
        if (a("com.smaato.sdk.adapters.admob.mediation.NextGenMediationNativeCustomEvent")) {
            sb.append("\t");
            sb.append("com.smaato.sdk.adapters.admob.mediation.NextGenMediationNativeCustomEvent");
            sb.append("\n");
        }
        if (a("com.smaato.sdk.adapters.dfp.NextGenDFPBannerCustomEvent")) {
            sb.append("\t");
            sb.append("com.smaato.sdk.adapters.dfp.NextGenDFPBannerCustomEvent");
            sb.append("\n");
        }
        if (a("com.smaato.sdk.adapters.dfp.NextGenDFPMRectCustomEvent")) {
            sb.append("\t");
            sb.append("com.smaato.sdk.adapters.dfp.NextGenDFPMRectCustomEvent");
            sb.append("\n");
        }
        if (a("com.smaato.sdk.adapters.dfp.NextGenDFPLeaderboardCustomEvent")) {
            sb.append("\t");
            sb.append("com.smaato.sdk.adapters.dfp.NextGenDFPLeaderboardCustomEvent");
            sb.append("\n");
        }
        if (a("com.smaato.sdk.adapters.dfp.NextGenDFPInterstitialCustomEvent")) {
            sb.append("\t");
            sb.append("com.smaato.sdk.adapters.dfp.NextGenDFPInterstitialCustomEvent");
            sb.append("\n");
        }
        if (sb.length() == 0) {
            sb.append("\t");
            sb.append("No adapters available");
            sb.append("\n");
        }
        return sb.toString();
    }

    private boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private String a(Context context) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                return bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return "";
    }
}
