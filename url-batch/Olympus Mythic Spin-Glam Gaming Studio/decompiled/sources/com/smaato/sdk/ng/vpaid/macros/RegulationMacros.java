package com.smaato.sdk.ng.vpaid.macros;

import android.text.TextUtils;
import com.smaato.sdk.ng.DeviceInfo;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.UserDataManager;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes15.dex */
public class RegulationMacros {
    private final DeviceInfo a;
    private final UserDataManager b;

    public RegulationMacros() {
        this(NextGen.getDeviceInfo(), NextGen.getUserDataManager());
    }

    private String a() {
        UserDataManager userDataManager = this.b;
        return (userDataManager == null || TextUtils.isEmpty(userDataManager.getIABGDPRConsentString())) ? String.valueOf(-1) : this.b.getIABGDPRConsentString();
    }

    private String b() {
        DeviceInfo deviceInfo = this.a;
        return deviceInfo != null ? deviceInfo.limitTracking() ? "1" : "0" : String.valueOf(-1);
    }

    private String c() {
        StringBuilder sb = new StringBuilder();
        UserDataManager userDataManager = this.b;
        if (userDataManager != null) {
            if (userDataManager.gdprApplies() || !TextUtils.isEmpty(this.b.getIABGDPRConsentString())) {
                sb.append("gdpr");
            }
            if (NextGen.isCoppaEnabled()) {
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
        return str.replace("[LIMITADTRACKING]", b()).replace("[REGULATIONS]", c()).replace("[GDPRCONSENT]", a());
    }

    RegulationMacros(DeviceInfo deviceInfo, UserDataManager userDataManager) {
        this.a = deviceInfo;
        this.b = userDataManager;
    }
}
