package net.pubnative.lite.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import net.pubnative.lite.sdk.analytics.ReportingController;
import net.pubnative.lite.sdk.analytics.ReportingEvent;
import net.pubnative.lite.sdk.analytics.ReportingEventCallback;
import net.pubnative.lite.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class DiagnosticsManager implements ReportingEventCallback {
    private static final String ADMOB_MEDIATION_BANNER_ADAPTER_CLASS = "net.pubnative.hybid.adapters.admob.mediation.HyBidMediationBannerCustomEvent";
    private static final String ADMOB_MEDIATION_INTERSTITIAL_ADAPTER_CLASS = "net.pubnative.hybid.adapters.admob.mediation.HyBidMediationInterstitialCustomEvent";
    private static final String ADMOB_MEDIATION_LEADERBOARD_ADAPTER_CLASS = "net.pubnative.hybid.adapters.admob.mediation.HyBidMediationLeaderboardCustomEvent";
    private static final String ADMOB_MEDIATION_MRECT_ADAPTER_CLASS = "net.pubnative.hybid.adapters.admob.mediation.HyBidMediationMRectCustomEvent";
    private static final String ADMOB_MEDIATION_NATIVE_ADAPTER_CLASS = "net.pubnative.hybid.adapters.admob.mediation.HyBidMediationNativeCustomEvent";
    private static final String ADMOB_MEDIATION_REWARDED_ADAPTER_CLASS = "net.pubnative.hybid.adapters.admob.mediation.HyBidMediationRewardedVideoCustomEvent";
    private static final String FORMAT_BANNER_CLASS = "net.pubnative.lite.sdk.views.HyBidAdView";
    private static final String FORMAT_INTERSTITIAL_CLASS = "net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd";
    private static final String FORMAT_NATIVE_CLASS = "net.pubnative.lite.sdk.request.HyBidNativeAdRequest";
    private static final String FORMAT_REWARDED_CLASS = "net.pubnative.lite.sdk.rewarded.HyBidRewardedAd";
    private static final String GAM_HEADER_BIDDING_BANNER_ADAPTER_CLASS = "net.pubnative.lite.adapters.dfp.HyBidDFPBannerCustomEvent";
    private static final String GAM_HEADER_BIDDING_INTERSTITIAL_ADAPTER_CLASS = "net.pubnative.lite.adapters.dfp.HyBidDFPInterstitialCustomEvent";
    private static final String GAM_HEADER_BIDDING_LEADERBOARD_ADAPTER_CLASS = "net.pubnative.lite.adapters.dfp.HyBidDFPLeaderboardCustomEvent";
    private static final String GAM_HEADER_BIDDING_MRECT_ADAPTER_CLASS = "net.pubnative.lite.adapters.dfp.HyBidDFPMRectCustomEvent";
    private static final String TAG = "DiagnosticsManager";
    private final String googleAdsPackageId;

    public DiagnosticsManager(Context context, ReportingController reportingController) {
        if (context != null) {
            this.googleAdsPackageId = getGoogleAdsAppId(context);
        } else {
            this.googleAdsPackageId = "";
        }
        if (reportingController != null) {
            reportingController.addCallback(this);
        }
    }

    private boolean checkAvailableClass(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static synchronized String generatePlacementDiagnosticsLog(Context context, JSONObject jSONObject) {
        String sb;
        synchronized (DiagnosticsManager.class) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\nHyBid Placement Diagnostics Log:\n\n");
            if (jSONObject != null && jSONObject.length() != 0) {
                try {
                    sb2.append(jSONObject.toString(2));
                    sb2.append("\n-----------------------------------------------------------------");
                } catch (JSONException e) {
                    Logger.e(TAG, "Error parsing placement params: ", e);
                    sb2.append("Placement data could not be loaded");
                    sb2.append("\n-----------------------------------------------------------------");
                }
            }
            sb = sb2.toString();
        }
        return sb;
    }

    private String getAvailableAdapters() {
        StringBuilder sb = new StringBuilder();
        if (checkAvailableClass(ADMOB_MEDIATION_BANNER_ADAPTER_CLASS)) {
            sb.append("\t");
            sb.append(ADMOB_MEDIATION_BANNER_ADAPTER_CLASS);
            sb.append("\n");
        }
        if (checkAvailableClass(ADMOB_MEDIATION_MRECT_ADAPTER_CLASS)) {
            sb.append("\t");
            sb.append(ADMOB_MEDIATION_MRECT_ADAPTER_CLASS);
            sb.append("\n");
        }
        if (checkAvailableClass(ADMOB_MEDIATION_LEADERBOARD_ADAPTER_CLASS)) {
            sb.append("\t");
            sb.append(ADMOB_MEDIATION_LEADERBOARD_ADAPTER_CLASS);
            sb.append("\n");
        }
        if (checkAvailableClass(ADMOB_MEDIATION_INTERSTITIAL_ADAPTER_CLASS)) {
            sb.append("\t");
            sb.append(ADMOB_MEDIATION_INTERSTITIAL_ADAPTER_CLASS);
            sb.append("\n");
        }
        if (checkAvailableClass(ADMOB_MEDIATION_REWARDED_ADAPTER_CLASS)) {
            sb.append("\t");
            sb.append(ADMOB_MEDIATION_REWARDED_ADAPTER_CLASS);
            sb.append("\n");
        }
        if (checkAvailableClass(ADMOB_MEDIATION_NATIVE_ADAPTER_CLASS)) {
            sb.append("\t");
            sb.append(ADMOB_MEDIATION_NATIVE_ADAPTER_CLASS);
            sb.append("\n");
        }
        if (checkAvailableClass(GAM_HEADER_BIDDING_BANNER_ADAPTER_CLASS)) {
            sb.append("\t");
            sb.append(GAM_HEADER_BIDDING_BANNER_ADAPTER_CLASS);
            sb.append("\n");
        }
        if (checkAvailableClass(GAM_HEADER_BIDDING_MRECT_ADAPTER_CLASS)) {
            sb.append("\t");
            sb.append(GAM_HEADER_BIDDING_MRECT_ADAPTER_CLASS);
            sb.append("\n");
        }
        if (checkAvailableClass(GAM_HEADER_BIDDING_LEADERBOARD_ADAPTER_CLASS)) {
            sb.append("\t");
            sb.append(GAM_HEADER_BIDDING_LEADERBOARD_ADAPTER_CLASS);
            sb.append("\n");
        }
        if (checkAvailableClass(GAM_HEADER_BIDDING_INTERSTITIAL_ADAPTER_CLASS)) {
            sb.append("\t");
            sb.append(GAM_HEADER_BIDDING_INTERSTITIAL_ADAPTER_CLASS);
            sb.append("\n");
        }
        if (sb.length() == 0) {
            sb.append("\t");
            sb.append("No adapters available");
            sb.append("\n");
        }
        return sb.toString();
    }

    private String getAvailableFormats() {
        StringBuilder sb = new StringBuilder();
        if (checkAvailableClass(FORMAT_BANNER_CLASS)) {
            sb.append("\t");
            sb.append("Banner");
            sb.append("\n");
        }
        if (checkAvailableClass(FORMAT_INTERSTITIAL_CLASS)) {
            sb.append("\t");
            sb.append("Interstitial");
            sb.append("\n");
        }
        if (checkAvailableClass(FORMAT_REWARDED_CLASS)) {
            sb.append("\t");
            sb.append("Rewarded");
            sb.append("\n");
        }
        if (checkAvailableClass(FORMAT_NATIVE_CLASS)) {
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

    private synchronized String getDiagnosticsLog(ReportingEvent reportingEvent) {
        StringBuilder sb;
        try {
            sb = new StringBuilder();
            sb.append("\nHyBid Diagnostics Log:\n\n");
            if (HyBid.isInitialized()) {
                if (reportingEvent != null) {
                    sb.append("Event: ");
                    sb.append(reportingEvent.getEventType());
                    sb.append("\n");
                }
                sb.append("Version: ");
                sb.append(HyBid.getHyBidVersion());
                sb.append("\n");
                sb.append("Bundle Id: ");
                sb.append(HyBid.getBundleId());
                sb.append("\n");
                sb.append("App Token: ");
                sb.append(HyBid.getAppToken());
                sb.append("\n");
                sb.append("Test Mode: ");
                sb.append(HyBid.isTestMode() ? "true" : "false");
                sb.append("\n");
                sb.append("COPPA: ");
                sb.append(HyBid.isCoppaEnabled() ? "true" : "false");
                sb.append("\n");
                sb.append("Video Audio State: ");
                sb.append(HyBid.getVideoAudioStatus().getStateName());
                sb.append("\n");
                sb.append("Location tracking (if permission): ");
                sb.append(HyBid.isLocationTrackingEnabled() ? "true" : "false");
                sb.append("\n");
                sb.append("Location updates (if permission): ");
                sb.append(HyBid.areLocationUpdatesEnabled() ? "true" : "false");
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
                if (!TextUtils.isEmpty(this.googleAdsPackageId)) {
                    sb.append("Google Ads Application Id: ");
                    sb.append(this.googleAdsPackageId);
                    sb.append("\n");
                }
                sb.append("Available formats:\n");
                sb.append(getAvailableFormats());
                sb.append("Available adapters:\n");
                sb.append(getAvailableAdapters());
            } else {
                sb.append("HyBid SDK has not been initialised");
                sb.append("\n");
            }
            sb.append("\n-----------------------------------------------------------------");
        } catch (Throwable th) {
            throw th;
        }
        return sb.toString();
    }

    private String getGoogleAdsAppId(Context context) {
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

    private Boolean isDiagnosticsEnabled() {
        return HyBid.isDiagnosticsEnabled();
    }

    private void reportInitialisation(ReportingEvent reportingEvent) {
        printDiagnosticsLog(reportingEvent);
    }

    @Override // net.pubnative.lite.sdk.analytics.ReportingEventCallback
    public void onEvent(ReportingEvent reportingEvent) {
        if (reportingEvent == null || TextUtils.isEmpty(reportingEvent.getEventType()) || !reportingEvent.getEventType().equals("init") || !isDiagnosticsEnabled().booleanValue()) {
            return;
        }
        reportInitialisation(reportingEvent);
    }

    public void printDiagnosticsLog() {
        Logger.d(TAG, getDiagnosticsLog(null));
    }

    public void printPlacementDiagnosticsLog(Context context, JSONObject jSONObject) {
        if (HyBid.isDiagnosticsEnabled().booleanValue()) {
            Logger.d(TAG, generatePlacementDiagnosticsLog(context, jSONObject));
        }
    }

    public void printDiagnosticsLog(ReportingEvent reportingEvent) {
        Logger.d(TAG, getDiagnosticsLog(reportingEvent));
    }
}
