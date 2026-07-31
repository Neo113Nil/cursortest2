package com.my.target.mediation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.MyTargetPrivacy;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes15.dex */
public interface MediationAdConfig {
    @Nullable
    AdNetworkConfig getAdNetworkConfig();

    int getAge();

    int getGender();

    @Nullable
    String getPayload();

    @NonNull
    String getPlacementId();

    @NonNull
    MyTargetPrivacy getPrivacy();

    @NonNull
    Map<String, String> getServerParams();

    boolean isUserAgeRestricted();

    boolean isUserConsent();

    boolean isUserConsentSpecified();
}
