package com.smaato.sdk.ng.interstitial.presenter;

import com.smaato.sdk.ng.CustomEndCardListener;
import com.smaato.sdk.ng.VideoListener;
import com.smaato.sdk.ng.models.Ad;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public interface InterstitialPresenter {

    public interface Listener {
        void onInterstitialClicked(InterstitialPresenter interstitialPresenter);

        void onInterstitialDismissed(InterstitialPresenter interstitialPresenter);

        void onInterstitialError(InterstitialPresenter interstitialPresenter);

        void onInterstitialLoaded(InterstitialPresenter interstitialPresenter);

        void onInterstitialShown(InterstitialPresenter interstitialPresenter);
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
