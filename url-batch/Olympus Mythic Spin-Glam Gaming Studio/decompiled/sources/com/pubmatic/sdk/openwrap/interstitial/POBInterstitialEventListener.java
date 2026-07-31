package com.pubmatic.sdk.openwrap.interstitial;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.openwrap.core.POBAdEventListener;
import java.util.Map;

@MainThread
/* loaded from: classes3.dex */
public interface POBInterstitialEventListener extends POBAdEventListener {
    @Nullable
    Map<String, Object> getCustomData();

    void onAdExpired();

    void onAdServerWin();

    void onFailedToLoad(@NonNull POBError pOBError);

    void onFailedToShow(@NonNull POBError pOBError);

    void onOpenWrapPartnerWin(@Nullable String str);
}
