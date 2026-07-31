package com.smaato.sdk.ng.contentinfo;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public class FeedbackMacros {
    public static final String MACRO_APP_TOKEN = "[APPTOKEN]";

    public String processUrl(String str, AdFeedbackData adFeedbackData) {
        if (adFeedbackData == null) {
            return str;
        }
        if (!TextUtils.isEmpty(adFeedbackData.getAppToken())) {
            str = str.replace("[APPTOKEN]", adFeedbackData.getAppToken());
        }
        if (!TextUtils.isEmpty(adFeedbackData.getSdkVersion())) {
            str = str.replace("[SDKVERSION]", adFeedbackData.getSdkVersion());
        }
        if (!TextUtils.isEmpty(adFeedbackData.getAppVersion())) {
            str = str.replace("[APPVERSION]", adFeedbackData.getAppVersion());
        }
        if (!TextUtils.isEmpty(adFeedbackData.getAdFormat())) {
            str = str.replace("[ADFORMAT]", adFeedbackData.getAdFormat());
        }
        if (!TextUtils.isEmpty(adFeedbackData.getIntegrationType())) {
            str = str.replace("[INTEGRATIONTYPE]", adFeedbackData.getIntegrationType());
        }
        if (!TextUtils.isEmpty(adFeedbackData.getZoneId())) {
            str = str.replace("[ZONEID]", adFeedbackData.getZoneId());
        }
        if (!TextUtils.isEmpty(adFeedbackData.getAudioState())) {
            str = str.replace("[AUDIOSTATE]", adFeedbackData.getAudioState());
        }
        if (!TextUtils.isEmpty(adFeedbackData.getDeviceInfo())) {
            str = str.replace("[DEVICEINFO]", adFeedbackData.getDeviceInfo());
        }
        if (!TextUtils.isEmpty(adFeedbackData.getCreativeId())) {
            str = str.replace("[CREATIVEID]", adFeedbackData.getCreativeId());
        }
        if (!TextUtils.isEmpty(adFeedbackData.getImpressionBeacon())) {
            str = str.replace("[IMPRESSIONBEACON]", adFeedbackData.getImpressionBeacon());
        }
        return !TextUtils.isEmpty(adFeedbackData.getHasEndCard()) ? str.replace("[HASENDCARD]", adFeedbackData.getHasEndCard()) : str;
    }
}
