package com.smaato.sdk.ng.interstitial.viewModel;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.interstitial.InterstitialActivityInteractor;
import com.smaato.sdk.ng.interstitial.NextGenInterstitialBroadcastReceiver;
import com.smaato.sdk.ng.interstitial.viewModel.VastInterstitialViewModel;
import com.smaato.sdk.ng.presenter.AdPresenter;
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

/* loaded from: classes14.dex */
public class VastInterstitialViewModel extends InterstitialViewModel implements AdPresenter.ImpressionListener, AdCloseButtonListener, VolumeObserver.VolumeChangeListener {
    private static final String V = "VastInterstitialViewModel";
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
            VastInterstitialViewModel vastInterstitialViewModel = VastInterstitialViewModel.this;
            vastInterstitialViewModel.n = true;
            vastInterstitialViewModel.d.showInterstitialCloseButton(vastInterstitialViewModel.t);
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdClicked() {
            VastInterstitialViewModel.this.sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.CLICK);
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdCustomEndCardFound() {
            VastInterstitialViewModel.this.x = true;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdDidReachEnd() {
            VastInterstitialViewModel vastInterstitialViewModel = VastInterstitialViewModel.this;
            vastInterstitialViewModel.w = false;
            vastInterstitialViewModel.y = true;
            if (!vastInterstitialViewModel.x) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.smaato.sdk.ng.interstitial.viewModel.VastInterstitialViewModel$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        VastInterstitialViewModel.a.this.a();
                    }
                }, 100L);
            }
            VastInterstitialViewModel.this.sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.VIDEO_FINISH);
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdDismissed() {
            onAdDismissed(-1);
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdLoadFail(PlayerInfo playerInfo) {
            VastInterstitialViewModel.this.d.hideProgressBar();
            Bundle bundle = new Bundle();
            bundle.putInt("pn_video_progress", 0);
            VastInterstitialViewModel.this.sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.ERROR);
            VastInterstitialViewModel.this.sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.VIDEO_ERROR, bundle);
            VastInterstitialViewModel.this.sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.DISMISS);
            VastInterstitialViewModel.this.d.finishActivity();
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdLoadSuccess() {
            VastInterstitialViewModel vastInterstitialViewModel = VastInterstitialViewModel.this;
            if (vastInterstitialViewModel.w) {
                return;
            }
            vastInterstitialViewModel.w = true;
            vastInterstitialViewModel.d.hideProgressBar();
            VastInterstitialViewModel vastInterstitialViewModel2 = VastInterstitialViewModel.this;
            if (vastInterstitialViewModel2.S) {
                return;
            }
            vastInterstitialViewModel2.R.show();
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public synchronized void onAdSkipped() {
            VastInterstitialViewModel vastInterstitialViewModel = VastInterstitialViewModel.this;
            vastInterstitialViewModel.y = true;
            vastInterstitialViewModel.sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.VIDEO_SKIP);
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdStarted() {
            VastInterstitialViewModel.this.sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.VIDEO_START);
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onCustomCTACLick(boolean z) {
            String str = z ? "custom_cta_endcard_click" : "custom_cta_click";
            if (VastInterstitialViewModel.this.B.contains(str)) {
                return;
            }
            VastInterstitialViewModel vastInterstitialViewModel = VastInterstitialViewModel.this;
            vastInterstitialViewModel.a(str, vastInterstitialViewModel.g, "fullscreen");
            if (str.equals("custom_cta_endcard_click")) {
                AdTracker adTracker = VastInterstitialViewModel.this.P;
                if (adTracker != null) {
                    adTracker.trackClick();
                }
            } else {
                AdTracker adTracker2 = VastInterstitialViewModel.this.O;
                if (adTracker2 != null) {
                    adTracker2.trackClick();
                }
            }
            VastInterstitialViewModel.this.B.add(str);
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onCustomCTALoadFail() {
            Logger.e("onCustomCTALoadFail", "CTA Failed to load");
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onCustomCTAShow() {
            if (VastInterstitialViewModel.this.H.booleanValue()) {
                return;
            }
            VastInterstitialViewModel vastInterstitialViewModel = VastInterstitialViewModel.this;
            vastInterstitialViewModel.a(vastInterstitialViewModel.g, "fullscreen");
            AdTracker adTracker = VastInterstitialViewModel.this.O;
            if (adTracker != null) {
                adTracker.trackImpression();
            }
            VastInterstitialViewModel.this.H = Boolean.TRUE;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onCustomEndCardClick(String str) {
            if (VastInterstitialViewModel.this.A.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("end_card_type", str);
            bundle.putString("click", str);
            bundle.putString("click_source_type", "end_card");
            VastInterstitialViewModel.this.sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.CUSTOM_END_CARD_CLICK, bundle);
            VastInterstitialViewModel.this.A = Boolean.TRUE;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onCustomEndCardShow(String str) {
            if (VastInterstitialViewModel.this.D.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("end_card_type", str);
            bundle.putString("click_source_type", "end_card");
            VastInterstitialViewModel.this.sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.CUSTOM_END_CARD_SHOW, bundle);
            VastInterstitialViewModel.this.D = Boolean.TRUE;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onDefaultEndCardClick(String str) {
            if (VastInterstitialViewModel.this.z.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("end_card_type", str);
            bundle.putString("click_source_type", "end_card");
            VastInterstitialViewModel.this.sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.DEFAULT_END_CARD_CLICK, bundle);
            VastInterstitialViewModel.this.z = Boolean.TRUE;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onDefaultEndCardShow(String str) {
            if (VastInterstitialViewModel.this.C.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("end_card_type", str);
            bundle.putString("click_source_type", "end_card");
            VastInterstitialViewModel.this.sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.DEFAULT_END_CARD_SHOW, bundle);
            VastInterstitialViewModel.this.C = Boolean.TRUE;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onEndCardClosed(Boolean bool) {
            if (bool.booleanValue() && VastInterstitialViewModel.this.K.booleanValue()) {
                return;
            }
            if (bool.booleanValue() || !VastInterstitialViewModel.this.L.booleanValue()) {
                if (bool.booleanValue()) {
                    VastInterstitialViewModel vastInterstitialViewModel = VastInterstitialViewModel.this;
                    vastInterstitialViewModel.K = Boolean.TRUE;
                    vastInterstitialViewModel.N.trackCustomEndcardEvent(3, null);
                } else {
                    VastInterstitialViewModel vastInterstitialViewModel2 = VastInterstitialViewModel.this;
                    vastInterstitialViewModel2.L = Boolean.TRUE;
                    vastInterstitialViewModel2.N.trackCompanionAdEvent(3, null);
                }
                VastInterstitialViewModel vastInterstitialViewModel3 = VastInterstitialViewModel.this;
                vastInterstitialViewModel3.a(vastInterstitialViewModel3.L);
            }
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onEndCardLoadFail(Boolean bool) {
            if (VastInterstitialViewModel.this.G.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_custom_end_card", bool.booleanValue());
            VastInterstitialViewModel.this.sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.END_CARD_LOAD_FAILURE, bundle);
            VastInterstitialViewModel.this.G = Boolean.TRUE;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public synchronized void onEndCardLoadSuccess(Boolean bool) {
            try {
                if ((!bool.booleanValue() || !VastInterstitialViewModel.this.F.booleanValue()) && (bool.booleanValue() || !VastInterstitialViewModel.this.E.booleanValue())) {
                    if (bool.booleanValue()) {
                        VastInterstitialViewModel.this.hideContentInfo();
                        VastInterstitialViewModel.this.F = Boolean.TRUE;
                    } else {
                        VastInterstitialViewModel.this.E = Boolean.TRUE;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("is_custom_end_card", bool.booleanValue());
                    VastInterstitialViewModel.this.sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.END_CARD_LOAD_SUCCESS, bundle);
                }
            } finally {
            }
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onEndCardSkipped(Boolean bool) {
            if (bool.booleanValue() && VastInterstitialViewModel.this.J.booleanValue()) {
                return;
            }
            if (bool.booleanValue() || !VastInterstitialViewModel.this.I.booleanValue()) {
                if (bool.booleanValue()) {
                    VastInterstitialViewModel.this.N.trackCustomEndcardEvent(2, null);
                } else {
                    VastInterstitialViewModel vastInterstitialViewModel = VastInterstitialViewModel.this;
                    vastInterstitialViewModel.I = Boolean.TRUE;
                    vastInterstitialViewModel.N.trackCompanionAdEvent(2, null);
                }
                VastInterstitialViewModel vastInterstitialViewModel2 = VastInterstitialViewModel.this;
                vastInterstitialViewModel2.b(vastInterstitialViewModel2.I);
            }
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onReplay() {
            VastInterstitialViewModel.this.w = true;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onReplayFinish() {
            VastInterstitialViewModel.this.w = false;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdDismissed(int i) {
            VastInterstitialViewModel vastInterstitialViewModel = VastInterstitialViewModel.this;
            if (vastInterstitialViewModel.n) {
                i = 100;
            }
            vastInterstitialViewModel.a(i);
            VastInterstitialViewModel.this.a();
        }
    }

    public VastInterstitialViewModel(Context context, String str, String str2, int i, long j, InterstitialActivityInteractor interstitialActivityInteractor) {
        super(context, str, str2, i, j, interstitialActivityInteractor);
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
        this.U = new CloseButtonListener() { // from class: com.smaato.sdk.ng.interstitial.viewModel.VastInterstitialViewModel$$ExternalSyntheticLambda0
            @Override // com.smaato.sdk.ng.vpaid.CloseButtonListener
            public final void onCloseButtonVisible() {
                VastInterstitialViewModel.this.g();
            }
        };
        e();
        f();
        processInterstitialAd();
        interstitialActivityInteractor.setContentLayout();
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

    @Override // com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel
    public void addFriendlyObstruction(View view) {
        VideoAd videoAd = this.R;
        if (videoAd != null) {
            videoAd.addFriendlyObstruction(view);
        }
    }

    @Override // com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel
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
        sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.DISMISS);
        this.d.finishActivity();
    }

    @Override // com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel
    public void destroyAd() {
        VideoAd videoAd = this.R;
        if (videoAd != null) {
            videoAd.destroy();
            this.S = false;
            this.w = false;
        }
    }

    @Override // com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel
    public View getAdView() {
        if (this.g == null) {
            return null;
        }
        VideoAdView videoAdView = new VideoAdView(this.b);
        this.M = videoAdView;
        return videoAdView;
    }

    @Override // com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel
    public Boolean hasReducedCloseSize() {
        return Boolean.FALSE;
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter.ImpressionListener
    public void onImpression() {
        sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.SHOW);
    }

    @Override // com.smaato.sdk.ng.vpaid.volume.VolumeObserver.VolumeChangeListener
    public void onVolumeChanged() {
        this.R.onVolumeChanged();
    }

    @Override // com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel
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
                sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.ERROR);
                sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.VIDEO_ERROR, bundle);
                sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.DISMISS);
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
            this.M.postDelayed(new Runnable() { // from class: com.smaato.sdk.ng.interstitial.viewModel.VastInterstitialViewModel$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    VastInterstitialViewModel.this.h();
                }
            }, 1000L);
        } catch (Exception e) {
            Logger.e(V, e.getMessage());
            Bundle bundle2 = new Bundle();
            bundle2.putInt("pn_video_progress", 0);
            sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.ERROR);
            sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.VIDEO_ERROR, bundle2);
            sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.DISMISS);
            this.d.finishActivity();
        }
    }

    @Override // com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel
    public void resetVolumeChangeTracker() {
        VolumeObserver.getInstance().reset();
    }

    @Override // com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel
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

    @Override // com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel
    public boolean shouldShowContentInfo() {
        return true;
    }

    @Override // com.smaato.sdk.ng.vpaid.AdCloseButtonListener
    public void showButton() {
        if (!this.x) {
            this.n = true;
        }
        this.d.showInterstitialCloseButton(this.t);
    }

    @Override // com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel
    public void skipButtonClicked() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("pn_video_progress", i);
        sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.VIDEO_DISMISS, bundle);
    }
}
