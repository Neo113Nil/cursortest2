package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public interface Yd {
    void onAdInstanceDidBecomeVisible();

    void onRewardedAdClicked();

    void onRewardedAdDismissed();

    void onRewardedAdFailedToShow(@NotNull IronSourceError ironSourceError);

    void onRewardedAdShown();

    void onUserEarnedReward();
}
