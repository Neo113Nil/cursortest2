package net.pubnative.lite.sdk.rewarded.viewModel;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.presenter.AdPresenter;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedBroadcastReceiver;
import net.pubnative.lite.sdk.rewarded.RewardedActivityInteractor;
import net.pubnative.lite.sdk.rewarded.viewModel.VastRewardedViewModel;
import net.pubnative.lite.sdk.utils.AdEndCardManager;
import net.pubnative.lite.sdk.utils.AdTracker;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.vpaid.AdCloseButtonListener;
import net.pubnative.lite.sdk.vpaid.CloseButtonListener;
import net.pubnative.lite.sdk.vpaid.PlayerInfo;
import net.pubnative.lite.sdk.vpaid.VideoAd;
import net.pubnative.lite.sdk.vpaid.VideoAdCacheItem;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;
import net.pubnative.lite.sdk.vpaid.VideoAdView;
import net.pubnative.lite.sdk.vpaid.volume.VolumeObserver;

/* loaded from: classes13.dex */
public class VastRewardedViewModel extends RewardedViewModel implements AdPresenter.ImpressionListener, AdCloseButtonListener, VolumeObserver.VolumeChangeListener {
    private static final String TAG = "VastRewardedViewModel";
    private VideoAdCacheItem mAdCacheItem;
    private AdTracker mAdEventTracker;
    private final CloseButtonListener mCloseButtonListener;
    protected List<String> mCustomCTAClickTrackedEvents;
    private AdTracker mCustomCTAEndCardTracker;
    protected Boolean mCustomCTAImpressionTracked;
    private AdTracker mCustomCTATracker;
    protected Boolean mCustomEndCardClickTracked;
    protected Boolean mCustomEndCardCloseTracked;
    protected Boolean mCustomEndCardImpressionTracked;
    protected Boolean mCustomEndCardSkipTracked;
    protected Boolean mDefaultEndCardClickTracked;
    protected Boolean mDefaultEndCardCloseTracked;
    protected Boolean mDefaultEndCardImpressionTracked;
    protected Boolean mDefaultEndCardSkipTracked;
    private boolean mHasEndCard;
    private boolean mIsAdPausedBeforeRender;
    private boolean mIsVideoFinished;
    protected Boolean mLoadCustomEndCardTracked;
    protected Boolean mLoadDefaultEndCardTracked;
    protected Boolean mLoadEndCardFailTracked;
    private boolean mReady;
    private VideoAd mVideoAd;
    private final VideoAdListener mVideoAdListener;
    private VideoAdView mVideoPlayer;

    /* renamed from: net.pubnative.lite.sdk.rewarded.viewModel.VastRewardedViewModel$1, reason: invalid class name */
    class AnonymousClass1 extends VideoAdListener {
        AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdDidReachEnd$0() {
            VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
            vastRewardedViewModel.mIsSkippable = true;
            vastRewardedViewModel.mListener.showRewardedCloseButton(vastRewardedViewModel.mCloseListener);
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdClicked() {
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.CLICK);
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdCustomEndCardFound() {
            VastRewardedViewModel.this.mHasEndCard = true;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdDidReachEnd() {
            VastRewardedViewModel.this.mReady = false;
            VastRewardedViewModel.this.mIsVideoFinished = true;
            if (!VastRewardedViewModel.this.mHasEndCard) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.rewarded.viewModel.VastRewardedViewModel$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        VastRewardedViewModel.AnonymousClass1.this.lambda$onAdDidReachEnd$0();
                    }
                }, 100L);
            }
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.VIDEO_FINISH);
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdDismissed() {
            onAdDismissed(-1);
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdLoadFail(PlayerInfo playerInfo) {
            VastRewardedViewModel.this.mListener.hideProgressBar();
            Bundle bundle = new Bundle();
            bundle.putInt("pn_video_progress", 0);
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.ERROR);
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.VIDEO_ERROR, bundle);
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.CLOSE);
            VastRewardedViewModel.this.mListener.finishActivity();
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdLoadSuccess() {
            if (VastRewardedViewModel.this.mReady) {
                return;
            }
            VastRewardedViewModel.this.mReady = true;
            VastRewardedViewModel.this.mListener.hideProgressBar();
            if (VastRewardedViewModel.this.mIsAdPausedBeforeRender) {
                return;
            }
            VastRewardedViewModel.this.mVideoAd.show();
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public synchronized void onAdSkipped() {
            VastRewardedViewModel.this.mIsVideoFinished = true;
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.VIDEO_SKIP);
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdStarted() {
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.VIDEO_START);
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onCustomCTACLick(boolean z) {
            String str = z ? "custom_cta_endcard_click" : "custom_cta_click";
            if (VastRewardedViewModel.this.mCustomCTAClickTrackedEvents.contains(str)) {
                return;
            }
            VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
            vastRewardedViewModel.invokeOnCustomCTAClick(str, vastRewardedViewModel.mAd, "fullscreen");
            if (str.equals("custom_cta_endcard_click")) {
                if (VastRewardedViewModel.this.mCustomCTAEndCardTracker != null) {
                    VastRewardedViewModel.this.mCustomCTAEndCardTracker.trackClick();
                }
            } else if (VastRewardedViewModel.this.mCustomCTATracker != null) {
                VastRewardedViewModel.this.mCustomCTATracker.trackClick();
            }
            VastRewardedViewModel.this.mCustomCTAClickTrackedEvents.add(str);
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onCustomCTALoadFail() {
            Logger.e("onCustomCTALoadFail", "CTA Failed to load");
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onCustomCTAShow() {
            if (VastRewardedViewModel.this.mCustomCTAImpressionTracked.booleanValue()) {
                return;
            }
            VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
            vastRewardedViewModel.invokeOnCustomCTAShow(vastRewardedViewModel.mAd, "fullscreen");
            if (VastRewardedViewModel.this.mCustomCTATracker != null) {
                VastRewardedViewModel.this.mCustomCTATracker.trackImpression();
            }
            VastRewardedViewModel.this.mCustomCTAImpressionTracked = Boolean.TRUE;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onCustomEndCardClick(String str) {
            if (VastRewardedViewModel.this.mCustomEndCardClickTracked.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("end_card_type", str);
            bundle.putString("click", str);
            bundle.putString("click_source_type", "end_card");
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.CUSTOM_END_CARD_CLICK, bundle);
            VastRewardedViewModel.this.mCustomEndCardClickTracked = Boolean.TRUE;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onCustomEndCardShow(String str) {
            if (VastRewardedViewModel.this.mCustomEndCardImpressionTracked.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("end_card_type", str);
            bundle.putString("click_source_type", "end_card");
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.CUSTOM_END_CARD_SHOW, bundle);
            VastRewardedViewModel.this.mCustomEndCardImpressionTracked = Boolean.TRUE;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onDefaultEndCardClick(String str) {
            if (VastRewardedViewModel.this.mDefaultEndCardClickTracked.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("end_card_type", str);
            bundle.putString("click_source_type", "end_card");
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.DEFAULT_END_CARD_CLICK, bundle);
            VastRewardedViewModel.this.mDefaultEndCardClickTracked = Boolean.TRUE;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onDefaultEndCardShow(String str) {
            if (VastRewardedViewModel.this.mDefaultEndCardImpressionTracked.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("end_card_type", str);
            bundle.putString("click_source_type", "end_card");
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.DEFAULT_END_CARD_SHOW, bundle);
            VastRewardedViewModel.this.mDefaultEndCardImpressionTracked = Boolean.TRUE;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onEndCardClosed(Boolean bool) {
            if (bool.booleanValue() && VastRewardedViewModel.this.mCustomEndCardCloseTracked.booleanValue()) {
                return;
            }
            if (bool.booleanValue() || !VastRewardedViewModel.this.mDefaultEndCardCloseTracked.booleanValue()) {
                if (bool.booleanValue()) {
                    VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
                    vastRewardedViewModel.mCustomEndCardCloseTracked = Boolean.TRUE;
                    vastRewardedViewModel.mAdEventTracker.trackCustomEndcardEvent(3, null);
                } else {
                    VastRewardedViewModel vastRewardedViewModel2 = VastRewardedViewModel.this;
                    vastRewardedViewModel2.mDefaultEndCardCloseTracked = Boolean.TRUE;
                    vastRewardedViewModel2.mAdEventTracker.trackCompanionAdEvent(3, null);
                }
                VastRewardedViewModel vastRewardedViewModel3 = VastRewardedViewModel.this;
                vastRewardedViewModel3.invokeOnEndCardClosed(vastRewardedViewModel3.mDefaultEndCardCloseTracked);
            }
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onEndCardLoadFail(Boolean bool) {
            if (VastRewardedViewModel.this.mLoadEndCardFailTracked.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_custom_end_card", bool.booleanValue());
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.END_CARD_LOAD_FAILURE, bundle);
            VastRewardedViewModel.this.mLoadEndCardFailTracked = Boolean.TRUE;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public synchronized void onEndCardLoadSuccess(Boolean bool) {
            try {
                if ((!bool.booleanValue() || !VastRewardedViewModel.this.mLoadCustomEndCardTracked.booleanValue()) && (bool.booleanValue() || !VastRewardedViewModel.this.mLoadDefaultEndCardTracked.booleanValue())) {
                    if (bool.booleanValue()) {
                        VastRewardedViewModel.this.hideContentInfo();
                        VastRewardedViewModel.this.mLoadCustomEndCardTracked = Boolean.TRUE;
                    } else {
                        VastRewardedViewModel.this.mLoadDefaultEndCardTracked = Boolean.TRUE;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("is_custom_end_card", bool.booleanValue());
                    VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.END_CARD_LOAD_SUCCESS, bundle);
                }
            } finally {
            }
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onEndCardSkipped(Boolean bool) {
            if (bool.booleanValue() && VastRewardedViewModel.this.mCustomEndCardSkipTracked.booleanValue()) {
                return;
            }
            if (bool.booleanValue() || !VastRewardedViewModel.this.mDefaultEndCardSkipTracked.booleanValue()) {
                if (bool.booleanValue()) {
                    VastRewardedViewModel.this.mAdEventTracker.trackCustomEndcardEvent(2, null);
                } else {
                    VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
                    vastRewardedViewModel.mDefaultEndCardSkipTracked = Boolean.TRUE;
                    vastRewardedViewModel.mAdEventTracker.trackCompanionAdEvent(2, null);
                }
                VastRewardedViewModel vastRewardedViewModel2 = VastRewardedViewModel.this;
                vastRewardedViewModel2.invokeOnEndCardSkipped(vastRewardedViewModel2.mDefaultEndCardSkipTracked);
            }
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onReplay() {
            VastRewardedViewModel.this.mReady = true;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onReplayFinish() {
            VastRewardedViewModel.this.mReady = false;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdDismissed(int i) {
            VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
            if (vastRewardedViewModel.mIsSkippable) {
                i = 100;
            }
            vastRewardedViewModel.dismissVideo(i);
            VastRewardedViewModel.this.dismiss();
        }
    }

    public VastRewardedViewModel(Context context, String str, String str2, int i, long j, RewardedActivityInteractor rewardedActivityInteractor) {
        super(context, str, str2, i, j, rewardedActivityInteractor);
        this.mReady = false;
        this.mHasEndCard = false;
        this.mIsVideoFinished = false;
        Boolean bool = Boolean.FALSE;
        this.mDefaultEndCardClickTracked = bool;
        this.mCustomEndCardClickTracked = bool;
        this.mCustomCTAClickTrackedEvents = new ArrayList();
        this.mDefaultEndCardImpressionTracked = bool;
        this.mCustomEndCardImpressionTracked = bool;
        this.mLoadDefaultEndCardTracked = bool;
        this.mLoadCustomEndCardTracked = bool;
        this.mLoadEndCardFailTracked = bool;
        this.mCustomCTAImpressionTracked = bool;
        this.mDefaultEndCardSkipTracked = bool;
        this.mCustomEndCardSkipTracked = bool;
        this.mCustomEndCardCloseTracked = bool;
        this.mDefaultEndCardCloseTracked = bool;
        this.mIsAdPausedBeforeRender = false;
        this.mVideoAdListener = new AnonymousClass1();
        this.mCloseButtonListener = new CloseButtonListener() { // from class: net.pubnative.lite.sdk.rewarded.viewModel.VastRewardedViewModel$$ExternalSyntheticLambda1
            @Override // net.pubnative.lite.sdk.vpaid.CloseButtonListener
            public final void onCloseButtonVisible() {
                VastRewardedViewModel.this.lambda$new$1();
            }
        };
        initiateCustomCTAAdTrackers();
        initiateEventTrackers();
        processRewardedAd();
        rewardedActivityInteractor.setContentLayout();
        initVolumeTracker();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissVideo(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("pn_video_progress", i);
        sendBroadcast(HyBidRewardedBroadcastReceiver.Action.VIDEO_DISMISS, bundle);
    }

    private void initVolumeTracker() {
        VolumeObserver.getInstance().setListener(this);
    }

    private void initiateCustomCTAAdTrackers() {
        if (this.mAd != null) {
            this.mCustomCTATracker = new AdTracker(this.mAd.getBeacons("custom_cta_show"), this.mAd.getBeacons("custom_cta_click"), false);
            this.mCustomCTAEndCardTracker = new AdTracker(null, this.mAd.getBeacons("custom_cta_endcard_click"), false);
        }
    }

    private void initiateEventTrackers() {
        if (this.mAd != null) {
            this.mAdEventTracker = new AdTracker(null, null, null, this.mAd.getBeacons("companion_ad_event"), this.mAd.getBeacons("custom_endcard_event"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        this.mIsVideoFinished = true;
        this.mIsSkippable = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderVastAd$0() {
        this.mVideoAd.load(this.mIntegrationType);
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public void addFriendlyObstruction(View view) {
        VideoAd videoAd = this.mVideoAd;
        if (videoAd != null) {
            videoAd.addFriendlyObstruction(view);
        }
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public void closeButtonClicked() {
        VideoAd videoAd = this.mVideoAd;
        if (videoAd == null) {
            return;
        }
        if (!this.mIsVideoFinished) {
            videoAd.skip();
            return;
        }
        videoAd.closeVideo();
        sendBroadcast(HyBidRewardedBroadcastReceiver.Action.CLOSE);
        this.mListener.finishActivity();
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public void destroyAd() {
        VideoAd videoAd = this.mVideoAd;
        if (videoAd != null) {
            videoAd.destroy();
            this.mIsAdPausedBeforeRender = false;
            this.mReady = false;
        }
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public View getAdView() {
        if (this.mAd == null) {
            return null;
        }
        VideoAdView videoAdView = new VideoAdView(this.mContext);
        this.mVideoPlayer = videoAdView;
        return videoAdView;
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public boolean hasReducedCloseSize() {
        return false;
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter.ImpressionListener
    public void onImpression() {
        sendBroadcast(HyBidRewardedBroadcastReceiver.Action.OPEN);
    }

    @Override // net.pubnative.lite.sdk.vpaid.volume.VolumeObserver.VolumeChangeListener
    public void onVolumeChanged() {
        this.mVideoAd.onVolumeChanged();
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public void pauseAd() {
        VideoAd videoAd = this.mVideoAd;
        if (videoAd != null) {
            boolean z = this.mReady;
            if (!z) {
                this.mIsAdPausedBeforeRender = true;
            }
            if (z && videoAd.isAdStarted()) {
                this.mVideoAd.pause();
            }
            if (this.mIsVideoFinished) {
                this.mVideoAd.pauseEndCardCloseButtonTimer();
            }
        }
    }

    public void renderVastAd() {
        try {
            if (this.mAd == null) {
                Bundle bundle = new Bundle();
                bundle.putInt("pn_video_progress", 0);
                sendBroadcast(HyBidRewardedBroadcastReceiver.Action.ERROR);
                sendBroadcast(HyBidRewardedBroadcastReceiver.Action.VIDEO_ERROR, bundle);
                sendBroadcast(HyBidRewardedBroadcastReceiver.Action.CLOSE);
                this.mListener.finishActivity();
                return;
            }
            this.mIsSkippable = this.mSkipOffset == 0;
            if (this.mVideoAd == null) {
                VideoAd videoAd = new VideoAd(this.mContext, this.mAd, true, true, this, this);
                this.mVideoAd = videoAd;
                videoAd.useMobileNetworkForCaching(true);
            }
            this.mVideoAd.bindView(this.mVideoPlayer);
            this.mVideoAd.setRewarded(true);
            this.mVideoAd.setAdListener(this.mVideoAdListener);
            this.mVideoAd.setAdCloseButtonListener(this.mCloseButtonListener);
            this.mListener.showProgressBar();
            VideoAdCacheItem inspect = HyBid.getVideoAdCache().inspect(this.mAd.getSessionId());
            this.mAdCacheItem = inspect;
            if (inspect != null) {
                if (inspect.getAdParams() != null) {
                    this.mAdCacheItem.getAdParams().setPublisherSkipSeconds(this.mSkipOffset);
                    if (this.mAdCacheItem.getEndCardData() != null && !TextUtils.isEmpty(this.mAdCacheItem.getEndCardData().getContent())) {
                        this.mHasEndCard = AdEndCardManager.isEndCardEnabled(this.mAd).booleanValue();
                    } else if (this.mAd.isEndCardEnabled() != null && this.mAd.isEndCardEnabled().booleanValue() && this.mAd.isCustomEndCardEnabled() != null && this.mAd.isCustomEndCardEnabled().booleanValue() && this.mAd.hasCustomEndCard()) {
                        this.mHasEndCard = true;
                    }
                    if (this.mAdCacheItem.getAdParams().getAdIcon() != null) {
                        setupContentInfo(this.mAdCacheItem.getAdParams().getAdIcon());
                    } else {
                        setupContentInfo(null);
                    }
                }
                this.mVideoAd.setVideoCacheItem(this.mAdCacheItem);
            } else {
                setupContentInfo(null);
            }
            this.mVideoPlayer.postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.rewarded.viewModel.VastRewardedViewModel$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VastRewardedViewModel.this.lambda$renderVastAd$0();
                }
            }, 1000L);
        } catch (Exception e) {
            Logger.e(TAG, e.getMessage());
            Bundle bundle2 = new Bundle();
            bundle2.putInt("pn_video_progress", 0);
            sendBroadcast(HyBidRewardedBroadcastReceiver.Action.ERROR);
            sendBroadcast(HyBidRewardedBroadcastReceiver.Action.VIDEO_ERROR, bundle2);
            sendBroadcast(HyBidRewardedBroadcastReceiver.Action.CLOSE);
            this.mListener.finishActivity();
        }
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public void resetVolumeChangeTracker() {
        VolumeObserver.getInstance().reset();
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public void resumeAd() {
        VideoAd videoAd;
        if (isFeedbackFormOpen() || (videoAd = this.mVideoAd) == null) {
            return;
        }
        if (this.mReady) {
            if (videoAd.isAdStarted()) {
                this.mVideoAd.resume();
            } else {
                this.mListener.hideProgressBar();
                this.mIsAdPausedBeforeRender = false;
                this.mVideoAd.show();
            }
        }
        if (this.mIsVideoFinished) {
            this.mVideoAd.resumeEndCardCloseButtonTimer();
        }
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public boolean shouldShowContentInfo() {
        return true;
    }

    @Override // net.pubnative.lite.sdk.vpaid.AdCloseButtonListener
    public void showButton() {
        if (!this.mHasEndCard) {
            this.mIsSkippable = true;
        }
        this.mListener.showRewardedCloseButton(this.mCloseListener);
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public void skipButtonClicked() {
    }
}
