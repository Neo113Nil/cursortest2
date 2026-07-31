package net.pubnative.lite.sdk.vpaid.macros;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import net.pubnative.lite.sdk.DeviceInfo;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.UserDataManager;

/* loaded from: classes14.dex */
public class RegulationMacros {
    private static final String MACRO_GDPR_CONSENT = "[GDPRCONSENT]";
    private static final String MACRO_LIMIT_AD_TRACKING = "[LIMITADTRACKING]";
    private static final String MACRO_REGULATIONS = "[REGULATIONS]";
    private final DeviceInfo mDeviceInfo;
    private final UserDataManager mUserDataManager;

    public RegulationMacros() {
        this(HyBid.getDeviceInfo(), HyBid.getUserDataManager());
    }

    private String getGdprConsent() {
        UserDataManager userDataManager = this.mUserDataManager;
        return (userDataManager == null || TextUtils.isEmpty(userDataManager.getIABGDPRConsentString())) ? String.valueOf(-1) : this.mUserDataManager.getIABGDPRConsentString();
    }

    private String getLimitAdTracking() {
        DeviceInfo deviceInfo = this.mDeviceInfo;
        return deviceInfo != null ? deviceInfo.limitTracking() ? "1" : "0" : String.valueOf(-1);
    }

    private String getRegulations() {
        StringBuilder sb = new StringBuilder();
        UserDataManager userDataManager = this.mUserDataManager;
        if (userDataManager != null) {
            if (userDataManager.gdprApplies() || !TextUtils.isEmpty(this.mUserDataManager.getIABGDPRConsentString())) {
                sb.append("gdpr");
            }
            if (HyBid.isCoppaEnabled()) {
                if (sb.length() > 0) {
                    sb.append(StringUtils.COMMA);
                }
                sb.append("coppa");
            }
        }
        String sb2 = sb.toString();
        return TextUtils.isEmpty(sb2) ? String.valueOf(-1) : sb2;
    }

    public String processUrl(String str) {
        return str.replace(MACRO_LIMIT_AD_TRACKING, getLimitAdTracking()).replace(MACRO_REGULATIONS, getRegulations()).replace(MACRO_GDPR_CONSENT, getGdprConsent());
    }

    RegulationMacros(DeviceInfo deviceInfo, UserDataManager userDataManager) {
        this.mDeviceInfo = deviceInfo;
        this.mUserDataManager = userDataManager;
    }
}
