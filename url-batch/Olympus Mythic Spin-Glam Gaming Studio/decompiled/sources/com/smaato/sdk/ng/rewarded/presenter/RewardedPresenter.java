package com.smaato.sdk.ng.rewarded.presenter;

import com.smaato.sdk.ng.CustomEndCardListener;
import com.smaato.sdk.ng.VideoListener;
import com.smaato.sdk.ng.models.Ad;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public interface RewardedPresenter {

    public interface Listener {
        void onRewardedClicked(RewardedPresenter rewardedPresenter);

        void onRewardedClosed(RewardedPresenter rewardedPresenter);

        void onRewardedError(RewardedPresenter rewardedPresenter);

        void onRewardedFinished(RewardedPresenter rewardedPresenter);

        void onRewardedLoaded(RewardedPresenter rewardedPresenter);

        void onRewardedOpened(RewardedPresenter rewardedPresenter);
    }

    void destroy();

    Ad getAd();

    JSONObject getPlacementParams();

    boolean isReady();

    void load();

    void setCustomEndCardListener(CustomEndCardListener customEndCardListener);

    void setListener(Listener listener);

    void setVideoListener(VideoListener videoListener);

    void show();
}
