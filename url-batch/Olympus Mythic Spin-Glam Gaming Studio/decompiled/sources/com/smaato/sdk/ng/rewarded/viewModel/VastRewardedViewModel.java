package com.smaato.sdk.ng.rewarded.viewModel;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.presenter.AdPresenter;
import com.smaato.sdk.ng.rewarded.NextGenRewardedBroadcastReceiver;
import com.smaato.sdk.ng.rewarded.RewardedActivityInteractor;
import com.smaato.sdk.ng.rewarded.viewModel.VastRewardedViewModel;
import com.smaato.sdk.ng.utils.AdEndCardManager;
import com.smaato.sdk.ng.utils.AdTracker;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.vpaid.AdCloseButtonListener;
import com.smaato.sdk.ng.vpaid.CloseButtonListener;
import com.smaato.sdk.ng.vpaid.PlayerInfo;
import com.smaato.sdk.ng.vpaid.VideoAd;
import com.smaato.sdk.ng.vpaid.VideoAdCacheItem;
import com.smaato.sdk.ng.vpaid.VideoAdListener;
import com.smaato.sdk.ng.vpaid.VideoAdView;
import com.smaato.sdk.ng.vpaid.volume.VolumeObserver;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class VastRewardedViewModel extends RewardedViewModel implements AdPresenter.ImpressionListener, AdCloseButtonListener, VolumeObserver.VolumeChangeListener {
    private static final String V = "VastRewardedViewModel";
    protected Boolean A;
    protected List<String> B;
    protected Boolean C;
    protected Boolean D;
    protected Boolean E;
    protected Boolean F;
    protected Boolean G;
    protected Boolean H;
    protected Boolean I;
    protected Boolean J;
    protected Boolean K;
    protected Boolean L;
    private VideoAdView M;
    private AdTracker N;
    private AdTracker O;
    private AdTracker P;
    private VideoAdCacheItem Q;
    private VideoAd R;
    private boolean S;
    private final VideoAdListener T;
    private final CloseButtonListener U;
    private boolean w;
    private boolean x;
    private boolean y;
    protected Boolean z;

    class a extends VideoAdListener {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
            vastRewardedViewModel.n = true;
            vastRewardedViewModel.d.showRewardedCloseButton(vastRewardedViewModel.t);
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdClicked() {
            VastRewardedViewModel.this.sendBroadcast(NextGenRewardedBroadcastReceiver.Action.CLICK);
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdCustomEndCardFound() {
            VastRewardedViewModel.this.x = true;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdDidReachEnd() {
            VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
            vastRewardedViewModel.w = false;
            vastRewardedViewModel.y = true;
            if (!vastRewardedViewModel.x) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.smaato.sdk.ng.rewarded.viewModel.VastRewardedViewModel$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        VastRewardedViewModel.a.this.a();
                    }
                }, 100L);
            }
            VastRewardedViewModel.this.sendBroadcast(NextGenRewardedBroadcastReceiver.Action.VIDEO_FINISH);
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdDismissed() {
            onAdDismissed(-1);
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdLoadFail(PlayerInfo playerInfo) {
            VastRewardedViewModel.this.d.hideProgressBar();
            Bundle bundle = new Bundle();
            bundle.putInt("pn_video_progress", 0);
            VastRewardedViewModel.this.sendBroadcast(NextGenRewardedBroadcastReceiver.Action.ERROR);
            VastRewardedViewModel.this.sendBroadcast(NextGenRewardedBroadcastReceiver.Action.VIDEO_ERROR, bundle);
            VastRewardedViewModel.this.sendBroadcast(NextGenRewardedBroadcastReceiver.Action.CLOSE);
            VastRewardedViewModel.this.d.finishActivity();
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdLoadSuccess() {
            VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
            if (vastRewardedViewModel.w) {
                return;
            }
            vastRewardedViewModel.w = true;
            vastRewardedViewModel.d.hideProgressBar();
            VastRewardedViewModel vastRewardedViewModel2 = VastRewardedViewModel.this;
            if (vastRewardedViewModel2.S) {
                return;
            }
            vastRewardedViewModel2.R.show();
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public synchronized void onAdSkipped() {
            VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
            vastRewardedViewModel.y = true;
            vastRewardedViewModel.sendBroadcast(NextGenRewardedBroadcastReceiver.Action.VIDEO_SKIP);
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdStarted() {
            VastRewardedViewModel.this.sendBroadcast(NextGenRewardedBroadcastReceiver.Action.VIDEO_START);
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onCustomCTACLick(boolean z) {
            String str = z ? "custom_cta_endcard_click" : "custom_cta_click";
            if (VastRewardedViewModel.this.B.contains(str)) {
                return;
            }
            VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
            vastRewardedViewModel.a(str, vastRewardedViewModel.g, "fullscreen");
            if (str.equals("custom_cta_endcard_click")) {
                AdTracker adTracker = VastRewardedViewModel.this.P;
                if (adTracker != null) {
                    adTracker.trackClick();
                }
            } else {
                AdTracker adTracker2 = VastRewardedViewModel.this.O;
                if (adTracker2 != null) {
                    adTracker2.trackClick();
                }
            }
            VastRewardedViewModel.this.B.add(str);
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onCustomCTALoadFail() {
            Logger.e("onCustomCTALoadFail", "CTA Failed to load");
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onCustomCTAShow() {
            if (VastRewardedViewModel.this.H.booleanValue()) {
                return;
            }
            VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
            vastRewardedViewModel.a(vastRewardedViewModel.g, "fullscreen");
            AdTracker adTracker = VastRewardedViewModel.this.O;
            if (adTracker != null) {
                adTracker.trackImpression();
            }
            VastRewardedViewModel.this.H = Boolean.TRUE;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onCustomEndCardClick(String str) {
            if (VastRewardedViewModel.this.A.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("end_card_type", str);
            bundle.putString("click", str);
            bundle.putString("click_source_type", "end_card");
            VastRewardedViewModel.this.sendBroadcast(NextGenRewardedBroadcastReceiver.Action.CUSTOM_END_CARD_CLICK, bundle);
            VastRewardedViewModel.this.A = Boolean.TRUE;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onCustomEndCardShow(String str) {
            if (VastRewardedViewModel.this.D.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("end_card_type", str);
            bundle.putString("click_source_type", "end_card");
            VastRewardedViewModel.this.sendBroadcast(NextGenRewardedBroadcastReceiver.Action.CUSTOM_END_CARD_SHOW, bundle);
            VastRewardedViewModel.this.D = Boolean.TRUE;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onDefaultEndCardClick(String str) {
            if (VastRewardedViewModel.this.z.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("end_card_type", str);
            bundle.putString("click_source_type", "end_card");
            VastRewardedViewModel.this.sendBroadcast(NextGenRewardedBroadcastReceiver.Action.DEFAULT_END_CARD_CLICK, bundle);
            VastRewardedViewModel.this.z = Boolean.TRUE;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onDefaultEndCardShow(String str) {
            if (VastRewardedViewModel.this.C.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("end_card_type", str);
            bundle.putString("click_source_type", "end_card");
            VastRewardedViewModel.this.sendBroadcast(NextGenRewardedBroadcastReceiver.Action.DEFAULT_END_CARD_SHOW, bundle);
            VastRewardedViewModel.this.C = Boolean.TRUE;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onEndCardClosed(Boolean bool) {
            if (bool.booleanValue() && VastRewardedViewModel.this.K.booleanValue()) {
                return;
            }
            if (bool.booleanValue() || !VastRewardedViewModel.this.L.booleanValue()) {
                if (bool.booleanValue()) {
                    VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
                    vastRewardedViewModel.K = Boolean.TRUE;
                    vastRewardedViewModel.N.trackCustomEndcardEvent(3, null);
                } else {
                    VastRewardedViewModel vastRewardedViewModel2 = VastRewardedViewModel.this;
                    vastRewardedViewModel2.L = Boolean.TRUE;
                    vastRewardedViewModel2.N.trackCompanionAdEvent(3, null);
                }
                VastRewardedViewModel vastRewardedViewModel3 = VastRewardedViewModel.this;
                vastRewardedViewModel3.a(vastRewardedViewModel3.L);
            }
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onEndCardLoadFail(Boolean bool) {
            if (VastRewardedViewModel.this.G.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_custom_end_card", bool.booleanValue());
            VastRewardedViewModel.this.sendBroadcast(NextGenRewardedBroadcastReceiver.Action.END_CARD_LOAD_FAILURE, bundle);
            VastRewardedViewModel.this.G = Boolean.TRUE;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public synchronized void onEndCardLoadSuccess(Boolean bool) {
            try {
                if ((!bool.booleanValue() || !VastRewardedViewModel.this.F.booleanValue()) && (bool.booleanValue() || !VastRewardedViewModel.this.E.booleanValue())) {
                    if (bool.booleanValue()) {
                        VastRewardedViewModel.this.hideContentInfo();
                        VastRewardedViewModel.this.F = Boolean.TRUE;
                    } else {
                        VastRewardedViewModel.this.E = Boolean.TRUE;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("is_custom_end_card", bool.booleanValue());
                    VastRewardedViewModel.this.sendBroadcast(NextGenRewardedBroadcastReceiver.Action.END_CARD_LOAD_SUCCESS, bundle);
                }
            } finally {
            }
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onEndCardSkipped(Boolean bool) {
            if (bool.booleanValue() && VastRewardedViewModel.this.J.booleanValue()) {
                return;
            }
            if (bool.booleanValue() || !VastRewardedViewModel.this.I.booleanValue()) {
                if (bool.booleanValue()) {
                    VastRewardedViewModel.this.N.trackCustomEndcardEvent(2, null);
                } else {
                    VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
                    vastRewardedViewModel.I = Boolean.TRUE;
                    vastRewardedViewModel.N.trackCompanionAdEvent(2, null);
                }
                VastRewardedViewModel vastRewardedViewModel2 = VastRewardedViewModel.this;
                vastRewardedViewModel2.b(vastRewardedViewModel2.I);
            }
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onReplay() {
            VastRewardedViewModel.this.w = true;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onReplayFinish() {
            VastRewardedViewModel.this.w = false;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdDismissed(int i) {
            VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
            if (vastRewardedViewModel.n) {
                i = 100;
            }
            vastRewardedViewModel.a(i);
            VastRewardedViewModel.this.a();
        }
    }

    public VastRewardedViewModel(Context context, String str, String str2, int i, long j, RewardedActivityInteractor rewardedActivityInteractor) {
        super(context, str, str2, i, j, rewardedActivityInteractor);
        this.w = false;
        this.x = false;
        this.y = false;
        Boolean bool = Boolean.FALSE;
        this.z = bool;
        this.A = bool;
        this.B = new ArrayList();
        this.C = bool;
        this.D = bool;
        this.E = bool;
        this.F = bool;
        this.G = bool;
        this.H = bool;
        this.I = bool;
        this.J = bool;
        this.K = bool;
        this.L = bool;
        this.S = false;
        this.T = new a();
        this.U = new CloseButtonListener() { // from class: com.smaato.sdk.ng.rewarded.viewModel.VastRewardedViewModel$$ExternalSyntheticLambda0
            @Override // com.smaato.sdk.ng.vpaid.CloseButtonListener
            public final void onCloseButtonVisible() {
                VastRewardedViewModel.this.g();
            }
        };
        e();
        f();
        processRewardedAd();
        rewardedActivityInteractor.setContentLayout();
        d();
    }

    private void d() {
        VolumeObserver.getInstance().setListener(this);
    }

    private void e() {
        if (this.g != null) {
            this.O = new AdTracker(this.g.getBeacons("custom_cta_show"), this.g.getBeacons("custom_cta_click"), false);
            this.P = new AdTracker(null, this.g.getBeacons("custom_cta_endcard_click"), false);
        }
    }

    private void f() {
        if (this.g != null) {
            this.N = new AdTracker(null, null, null, this.g.getBeacons("companion_ad_event"), this.g.getBeacons("custom_endcard_event"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.y = true;
        this.n = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.R.load(this.e);
    }

    @Override // com.smaato.sdk.ng.rewarded.viewModel.RewardedViewModel
    public void addFriendlyObstruction(View view) {
        VideoAd videoAd = this.R;
        if (videoAd != null) {
            videoAd.addFriendlyObstruction(view);
        }
    }

    @Override // com.smaato.sdk.ng.rewarded.viewModel.RewardedViewModel
    public void closeButtonClicked() {
        VideoAd videoAd = this.R;
        if (videoAd == null) {
            return;
        }
        if (!this.y) {
            videoAd.skip();
            return;
        }
        videoAd.closeVideo();
        sendBroadcast(NextGenRewardedBroadcastReceiver.Action.CLOSE);
        this.d.finishActivity();
    }

    @Override // com.smaato.sdk.ng.rewarded.viewModel.RewardedViewModel
    public void destroyAd() {
        VideoAd videoAd = this.R;
        if (videoAd != null) {
            videoAd.destroy();
            this.S = false;
            this.w = false;
        }
    }

    @Override // com.smaato.sdk.ng.rewarded.viewModel.RewardedViewModel
    public View getAdView() {
        if (this.g == null) {
            return null;
        }
        VideoAdView videoAdView = new VideoAdView(this.b);
        this.M = videoAdView;
        return videoAdView;
    }

    @Override // com.smaato.sdk.ng.rewarded.viewModel.RewardedViewModel
    public boolean hasReducedCloseSize() {
        return false;
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter.ImpressionListener
    public void onImpression() {
        sendBroadcast(NextGenRewardedBroadcastReceiver.Action.OPEN);
    }

    @Override // com.smaato.sdk.ng.vpaid.volume.VolumeObserver.VolumeChangeListener
    public void onVolumeChanged() {
        this.R.onVolumeChanged();
    }

    @Override // com.smaato.sdk.ng.rewarded.viewModel.RewardedViewModel
    public void pauseAd() {
        VideoAd videoAd = this.R;
        if (videoAd != null) {
            boolean z = this.w;
            if (!z) {
                this.S = true;
            }
            if (z && videoAd.isAdStarted()) {
                this.R.pause();
            }
            if (this.y) {
                this.R.pauseEndCardCloseButtonTimer();
            }
        }
    }

    public void renderVastAd() {
        try {
            if (this.g == null) {
                Bundle bundle = new Bundle();
                bundle.putInt("pn_video_progress", 0);
                sendBroadcast(NextGenRewardedBroadcastReceiver.Action.ERROR);
                sendBroadcast(NextGenRewardedBroadcastReceiver.Action.VIDEO_ERROR, bundle);
                sendBroadcast(NextGenRewardedBroadcastReceiver.Action.CLOSE);
                this.d.finishActivity();
                return;
            }
            this.n = this.f == 0;
            if (this.R == null) {
                VideoAd videoAd = new VideoAd(this.b, this.g, true, true, this, this);
                this.R = videoAd;
                videoAd.useMobileNetworkForCaching(true);
            }
            this.R.bindView(this.M);
            this.R.setRewarded(true);
            this.R.setAdListener(this.T);
            this.R.setAdCloseButtonListener(this.U);
            this.d.showProgressBar();
            VideoAdCacheItem inspect = NextGen.getVideoAdCache().inspect(this.g.getSessionId());
            this.Q = inspect;
            if (inspect != null) {
                if (inspect.getAdParams() != null) {
                    this.Q.getAdParams().setPublisherSkipSeconds(this.f);
                    if (this.Q.getEndCardData() != null && !TextUtils.isEmpty(this.Q.getEndCardData().getContent())) {
                        this.x = AdEndCardManager.isEndCardEnabled(this.g).booleanValue();
                    } else if (this.g.isEndCardEnabled() != null && this.g.isEndCardEnabled().booleanValue() && this.g.isCustomEndCardEnabled() != null && this.g.isCustomEndCardEnabled().booleanValue() && this.g.hasCustomEndCard()) {
                        this.x = true;
                    }
                    if (this.Q.getAdParams().getAdIcon() != null) {
                        setupContentInfo(this.Q.getAdParams().getAdIcon());
                    } else {
                        setupContentInfo(null);
                    }
                }
                this.R.setVideoCacheItem(this.Q);
            } else {
                setupContentInfo(null);
            }
            this.M.postDelayed(new Runnable() { // from class: com.smaato.sdk.ng.rewarded.viewModel.VastRewardedViewModel$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    VastRewardedViewModel.this.h();
                }
            }, 1000L);
        } catch (Exception e) {
            Logger.e(V, e.getMessage());
            Bundle bundle2 = new Bundle();
            bundle2.putInt("pn_video_progress", 0);
            sendBroadcast(NextGenRewardedBroadcastReceiver.Action.ERROR);
            sendBroadcast(NextGenRewardedBroadcastReceiver.Action.VIDEO_ERROR, bundle2);
            sendBroadcast(NextGenRewardedBroadcastReceiver.Action.CLOSE);
            this.d.finishActivity();
        }
    }

    @Override // com.smaato.sdk.ng.rewarded.viewModel.RewardedViewModel
    public void resetVolumeChangeTracker() {
        VolumeObserver.getInstance().reset();
    }

    @Override // com.smaato.sdk.ng.rewarded.viewModel.RewardedViewModel
    public void resumeAd() {
        VideoAd videoAd;
        if (isFeedbackFormOpen() || (videoAd = this.R) == null) {
            return;
        }
        if (this.w) {
            if (videoAd.isAdStarted()) {
                this.R.resume();
            } else {
                this.d.hideProgressBar();
                this.S = false;
                this.R.show();
            }
        }
        if (this.y) {
            this.R.resumeEndCardCloseButtonTimer();
        }
    }

    @Override // com.smaato.sdk.ng.rewarded.viewModel.RewardedViewModel
    public boolean shouldShowContentInfo() {
        return true;
    }

    @Override // com.smaato.sdk.ng.vpaid.AdCloseButtonListener
    public void showButton() {
        if (!this.x) {
            this.n = true;
        }
        this.d.showRewardedCloseButton(this.t);
    }

    @Override // com.smaato.sdk.ng.rewarded.viewModel.RewardedViewModel
    public void skipButtonClicked() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("pn_video_progress", i);
        sendBroadcast(NextGenRewardedBroadcastReceiver.Action.VIDEO_DISMISS, bundle);
    }
}
