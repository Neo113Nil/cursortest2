package com.pubmatic.sdk.rewardedad;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.openwrap.core.POBAdEventListener;
import com.pubmatic.sdk.openwrap.core.POBReward;

@MainThread
/* loaded from: classes3.dex */
public interface POBRewardedAdEventListener extends POBAdEventListener {
    void onAdExpired();

    void onAdServerWin();

    void onFailedToLoad(@NonNull POBError pOBError);

    void onFailedToShow(@NonNull POBError pOBError);

    void onOpenWrapPartnerWin(@Nullable String str);

    void onReceiveReward(@NonNull POBReward pOBReward);
}
