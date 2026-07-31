package com.smaato.sdk.ng.leaderboard.presenter;

import android.content.Context;
import com.smaato.sdk.ng.banner.presenter.BannerPresenterFactory;
import com.smaato.sdk.ng.models.IntegrationType;

@Deprecated
/* loaded from: classes10.dex */
public class LeaderboardPresenterFactory extends BannerPresenterFactory {
    public LeaderboardPresenterFactory(Context context) {
        super(context, IntegrationType.STANDALONE);
    }
}
