package com.smaato.sdk.ng.vpaid;

import android.view.View;
import com.smaato.sdk.ng.models.EndCardData;
import com.smaato.sdk.ng.viewability.NextGenViewabilityFriendlyObstruction;
import com.smaato.sdk.ng.viewability.NextGenViewabilityNativeVideoAdSession;
import com.smaato.sdk.ng.viewability.baseom.BaseFriendlyObstructionPurpose;
import com.smaato.sdk.ng.vpaid.response.AdParams;
import com.smaato.sdk.ng.vpaid.utils.UrlClickSource;
import java.util.List;

/* loaded from: classes14.dex */
public interface VideoAdController {

    public interface OnPreparedListener {
        void onPrepared();
    }

    boolean adFinishedPlaying();

    void addEndCardData(EndCardData endCardData);

    void addViewabilityFriendlyObstruction(View view, BaseFriendlyObstructionPurpose baseFriendlyObstructionPurpose, String str);

    void buildVideoAdView(VideoAdView videoAdView);

    void closeEndCard();

    void closeSelf();

    void destroy();

    void dismiss();

    AdParams getAdParams();

    int getProgress();

    NextGenViewabilityNativeVideoAdSession getViewabilityAdSession();

    List<NextGenViewabilityFriendlyObstruction> getViewabilityFriendlyObstructions();

    boolean isRewarded();

    boolean isVideoVisible();

    void onCustomCTAClick(boolean z);

    void onCustomCTALoadFail();

    void onCustomCTAShow();

    void onCustomEndCardClick(String str);

    void onCustomEndCardShow(String str);

    void onDefaultEndCardClick(String str);

    void onDefaultEndCardShow(String str);

    void onEndCardClosed(Boolean bool);

    void onEndCardLoadFail(Boolean bool);

    void onEndCardLoadSuccess(Boolean bool);

    void onVolumeChanged();

    void openUrl(String str, UrlClickSource urlClickSource);

    void pause();

    void pauseEndCardCloseButtonTimer();

    void playAd();

    void prepare(OnPreparedListener onPreparedListener);

    void resume();

    void resumeEndCardCloseButtonTimer();

    void setEndCardFilePath(String str);

    void setVideoFilePath(String str);

    void setVideoVisible(boolean z);

    void setVolume(boolean z);

    void skipEndCard();

    void skipVideo();

    void toggleMute();
}
