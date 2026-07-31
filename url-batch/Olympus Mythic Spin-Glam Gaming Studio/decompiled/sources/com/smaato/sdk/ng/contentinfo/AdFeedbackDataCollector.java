package com.smaato.sdk.ng.contentinfo;

import android.text.TextUtils;
import com.smaato.sdk.ng.DeviceInfo;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.contentinfo.AdFeedbackData;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.IntegrationType;
import java.util.Locale;

/* loaded from: classes15.dex */
public class AdFeedbackDataCollector {
    private final DeviceInfo a;
    private final IntegrationType b;

    public AdFeedbackDataCollector(IntegrationType integrationType) {
        this(NextGen.getDeviceInfo(), integrationType);
    }

    public AdFeedbackData collectData(Ad ad, String str, IntegrationType integrationType) {
        AdFeedbackData.Builder builder = new AdFeedbackData.Builder();
        if (NextGen.isInitialized() && !TextUtils.isEmpty(NextGen.getAppToken())) {
            builder.setAppToken(NextGen.getAppToken());
        }
        if (!TextUtils.isEmpty(NextGen.getSDKVersionInfo(this.b))) {
            builder.setSdkVersion(NextGen.getSDKVersionInfo(this.b));
        }
        if (!TextUtils.isEmpty(NextGen.getAppVersion())) {
            builder.setAppVersion(NextGen.getAppVersion());
        }
        if (!TextUtils.isEmpty(str)) {
            builder.setAdFormat(str);
        }
        if (integrationType != null) {
            builder.setIntegrationType(integrationType.getCode());
        }
        String audioState = ad.getAudioState();
        if (audioState == null) {
            audioState = NextGen.getVideoAudioStatus().getStateName();
        }
        builder.setAudioState(audioState);
        DeviceInfo deviceInfo = this.a;
        if (deviceInfo != null && !TextUtils.isEmpty(deviceInfo.getModel()) && !TextUtils.isEmpty(this.a.getOSVersion())) {
            builder.setDeviceInfo(String.format(Locale.ENGLISH, "%s Android %s", this.a.getModel(), this.a.getOSVersion()));
        }
        if (!TextUtils.isEmpty(ad.getZoneId())) {
            builder.setZoneId(ad.getZoneId());
        }
        if (!TextUtils.isEmpty(ad.getCreativeId())) {
            builder.setCreativeId(ad.getCreativeId());
        }
        if (!TextUtils.isEmpty(ad.getImpressionId())) {
            builder.setImpressionBeacon(ad.getImpressionId());
        }
        builder.setHasEndCard(ad.hasEndCard() ? "true" : "false");
        if (!TextUtils.isEmpty(ad.getVast())) {
            builder.setCreative(ad.getVast());
        } else if (!TextUtils.isEmpty(ad.getAssetUrl("htmlbanner"))) {
            builder.setCreative(ad.getAssetUrl("htmlbanner"));
        } else if (!TextUtils.isEmpty(ad.getAssetHtml("htmlbanner"))) {
            builder.setCreative(ad.getAssetHtml("htmlbanner"));
        }
        return builder.build();
    }

    public AdFeedbackDataCollector(DeviceInfo deviceInfo, IntegrationType integrationType) {
        this.a = deviceInfo;
        this.b = integrationType;
    }
}
