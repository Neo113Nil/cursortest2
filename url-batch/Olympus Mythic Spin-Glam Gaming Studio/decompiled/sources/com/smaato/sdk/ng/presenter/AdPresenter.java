package com.smaato.sdk.ng.presenter;

import android.view.View;
import com.smaato.sdk.ng.VideoListener;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.mraid.MRAIDViewListener;
import com.smaato.sdk.ng.utils.NextGenConsumer;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public interface AdPresenter {

    public interface ImpressionListener {
        void onImpression();
    }

    public interface Listener {
        void onAdClicked(AdPresenter adPresenter);

        void onAdError(AdPresenter adPresenter);

        void onAdLoaded(AdPresenter adPresenter, View view);
    }

    void addFriendlyObstruction(View view);

    void destroy();

    Ad getAd();

    JSONObject getPlacementParams();

    void load();

    void setImpressionListener(ImpressionListener impressionListener);

    void setListener(Listener listener);

    void setMRaidListener(MRAIDViewListener mRAIDViewListener);

    void setVideoListener(VideoListener videoListener);

    void startTracking();

    void startTracking(NextGenConsumer<Double> nextGenConsumer);

    void stopTracking();
}
