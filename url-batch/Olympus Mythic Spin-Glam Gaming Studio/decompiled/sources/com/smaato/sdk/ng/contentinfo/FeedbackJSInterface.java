package com.smaato.sdk.ng.contentinfo;

import android.text.TextUtils;
import com.ironsource.X3;
import com.pubmatic.sdk.crashanalytics.POBCrashAnalyticsConstants;
import com.smaato.sdk.ng.mraid.MRAIDView;
import com.smaato.sdk.ng.utils.string.StringEscapeUtils;
import java.util.Locale;

/* loaded from: classes15.dex */
public class FeedbackJSInterface {
    private String a(AdFeedbackData adFeedbackData) {
        StringBuilder sb = new StringBuilder();
        if (adFeedbackData != null) {
            if (!TextUtils.isEmpty(adFeedbackData.getAppToken())) {
                sb.append(a("appToken", adFeedbackData.getAppToken()));
            }
            if (!TextUtils.isEmpty(adFeedbackData.getZoneId())) {
                sb.append(a("zoneId", adFeedbackData.getZoneId()));
            }
            if (!TextUtils.isEmpty(adFeedbackData.getAudioState())) {
                sb.append(a("audioState", adFeedbackData.getAudioState()));
            }
            if (!TextUtils.isEmpty(adFeedbackData.getAppVersion())) {
                sb.append(a(X3.j.W, adFeedbackData.getAppVersion()));
            }
            if (!TextUtils.isEmpty(adFeedbackData.getDeviceInfo())) {
                sb.append(a(POBCrashAnalyticsConstants.DEVICE_INFO_KEY, adFeedbackData.getDeviceInfo()));
            }
            if (!TextUtils.isEmpty(adFeedbackData.getCreativeId())) {
                sb.append(a("creativeId", adFeedbackData.getCreativeId()));
            }
            if (!TextUtils.isEmpty(adFeedbackData.getImpressionBeacon())) {
                sb.append(a("impressionBeacon", adFeedbackData.getImpressionBeacon()));
            }
            if (!TextUtils.isEmpty(adFeedbackData.getSdkVersion())) {
                sb.append(a("sdkVersion", adFeedbackData.getSdkVersion()));
            }
            if (!TextUtils.isEmpty(adFeedbackData.getIntegrationType())) {
                sb.append(a("integrationType", adFeedbackData.getIntegrationType()));
            }
            if (!TextUtils.isEmpty(adFeedbackData.getAdFormat())) {
                sb.append(a("adFormat", adFeedbackData.getAdFormat()));
            }
            if (!TextUtils.isEmpty(adFeedbackData.getHasEndCard())) {
                sb.append(a("hasEndCard", adFeedbackData.getHasEndCard()));
            }
            if (!TextUtils.isEmpty(adFeedbackData.getCreative())) {
                sb.append(a("creative", StringEscapeUtils.escapeJava(adFeedbackData.getCreative())));
            }
        }
        return sb.toString();
    }

    public void submitData(AdFeedbackData adFeedbackData, MRAIDView mRAIDView) {
        if (adFeedbackData != null) {
            String a = a(adFeedbackData);
            if (mRAIDView == null || TextUtils.isEmpty(a)) {
                return;
            }
            mRAIDView.injectJavaScript(a);
        }
    }

    private String a(String str, String str2) {
        return String.format(Locale.ENGLISH, "%s.%s = \"%s\";", "nextgenFeedback", str, str2);
    }
}
