package com.pubmatic.sdk.common.ui;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBAdDescriptor;

@MainThread
/* loaded from: classes5.dex */
public interface POBRewardedAdRendererListener {
    void onAdClicked();

    void onAdExpired();

    void onAdImpression();

    void onAdInteractionStarted();

    void onAdInteractionStopped();

    void onAdRender(@Nullable POBAdDescriptor pOBAdDescriptor);

    void onAdRenderingFailed(@NonNull POBError pOBError);

    void onLeavingApplication();

    void onReceiveReward(@Nullable POBCoreReward pOBCoreReward);
}
