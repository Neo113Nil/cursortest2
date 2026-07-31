package com.smaato.sdk.ng.vpaid;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.presenter.AdPresenter;
import com.smaato.sdk.ng.utils.AdAudioStateManager;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.viewability.NextGenViewabilityFriendlyObstruction;
import com.smaato.sdk.ng.viewability.baseom.BaseFriendlyObstructionPurpose;
import com.smaato.sdk.ng.vpaid.enums.AudioState;
import com.smaato.sdk.ng.vpaid.models.vpaid.AdSpotDimensions;
import com.smaato.sdk.ng.vpaid.utils.Utils;

/* loaded from: classes12.dex */
public class VideoAd extends com.smaato.sdk.ng.vpaid.a {
    private static final String A = "VideoAd";
    private volatile VideoAdView y;
    private boolean z;

    class a implements Runnable {

        /* renamed from: com.smaato.sdk.ng.vpaid.VideoAd$a$a, reason: collision with other inner class name */
        class RunnableC1700a implements Runnable {
            RunnableC1700a() {
            }

            private void a() {
                String str = VideoAd.A;
                Logger.d(str, "Banner did start showing ad");
                if (VideoAd.this.h() == 202) {
                    Logger.d(str, "Banner already displays on screen");
                    return;
                }
                if (!VideoAd.this.isReady() || VideoAd.this.y == null) {
                    Logger.e(str, "Banner is not ready");
                } else {
                    VideoAd.this.a(202);
                    VideoAd.this.D();
                    if (VideoAd.this.e() != null) {
                        synchronized (this) {
                            try {
                                if (VideoAd.this.e() != null && VideoAd.this.e().getAdParams() != null) {
                                    VideoAd.this.k().initAdSession(VideoAd.this.y, VideoAd.this.e().getAdParams().getVerificationScriptResources());
                                    VideoAd.this.e().buildVideoAdView(VideoAd.this.y);
                                    for (NextGenViewabilityFriendlyObstruction nextGenViewabilityFriendlyObstruction : VideoAd.this.e().getViewabilityFriendlyObstructions()) {
                                        VideoAd.this.k().addFriendlyObstruction(nextGenViewabilityFriendlyObstruction.getView(), nextGenViewabilityFriendlyObstruction.getPurpose(), nextGenViewabilityFriendlyObstruction.getReason());
                                    }
                                    VideoAd.this.k().fireLoaded();
                                    VideoAd.this.e().playAd();
                                    VideoAd.this.I();
                                }
                            } finally {
                            }
                        }
                    } else {
                        Logger.e(str, "getAdController() is null and can not set attributes to banner view ");
                        if (VideoAd.this.f() != null) {
                            VideoAd.this.f().onAdLoadFail(new PlayerInfo("getAdController() is null and can not set attributes to banner view "));
                        }
                    }
                }
                VideoAd.this.z = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                a();
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoAd.this.a(new RunnableC1700a());
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AudioState.values().length];
            a = iArr;
            try {
                iArr[AudioState.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AudioState.MUTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AudioState.ON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public VideoAd(Context context, Ad ad, boolean z, boolean z2, AdPresenter.ImpressionListener impressionListener) throws Exception {
        super(context, ad, z, z2, impressionListener, null);
        this.z = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        String str = A;
        Logger.d(str, "Video will be dismissed");
        if (h() != 202) {
            Logger.e(str, "Can't dismiss ad, it's not displaying");
            return;
        }
        if (this.y != null) {
            this.y.setVisibility(8);
            this.y.removeAllViews();
        }
        if (e() != null) {
            e().dismiss();
        }
        H();
    }

    private void H() {
        Logger.d(A, "Ad disappeared from screen");
        z();
        a(200);
        if (f() != null) {
            f().onAdDismissed(e().getProgress());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        int i = b.a[AdAudioStateManager.getAudioState(d(), this.f).ordinal()];
        if (i == 1 || i == 2 || (i == 3 && Utils.isPhoneMuted(i()))) {
            e().toggleMute();
        }
    }

    public void addFriendlyObstruction(View view) {
        k().addFriendlyObstruction(view, BaseFriendlyObstructionPurpose.OTHER, "Watermark");
    }

    public void bindView(VideoAdView videoAdView) {
        if (videoAdView == null) {
            Logger.e(A, "Bind view is null");
            return;
        }
        Logger.d(A, "Bind view (visibility: " + videoAdView.getVisibility() + ")");
        this.y = videoAdView;
    }

    @Override // com.smaato.sdk.ng.vpaid.a
    public /* bridge */ /* synthetic */ void clearCache() {
        super.clearCache();
    }

    public void closeVideo() {
        e().closeSelf();
    }

    @Override // com.smaato.sdk.ng.vpaid.a
    public /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }

    @Override // com.smaato.sdk.ng.vpaid.a, com.smaato.sdk.ng.vpaid.b
    public void dismiss() {
        a(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.VideoAd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                VideoAd.this.G();
            }
        });
    }

    @Override // com.smaato.sdk.ng.vpaid.b
    AdSpotDimensions g() {
        if (this.y != null) {
            return new AdSpotDimensions(this.y.getWidth(), this.y.getHeight());
        }
        return null;
    }

    public boolean isAdStarted() {
        return this.z;
    }

    @Override // com.smaato.sdk.ng.vpaid.b
    public /* bridge */ /* synthetic */ Boolean isInterstitial() {
        return super.isInterstitial();
    }

    @Override // com.smaato.sdk.ng.vpaid.a
    public /* bridge */ /* synthetic */ boolean isLoading() {
        return super.isLoading();
    }

    @Override // com.smaato.sdk.ng.vpaid.a, com.smaato.sdk.ng.vpaid.b
    public /* bridge */ /* synthetic */ boolean isReady() {
        return super.isReady();
    }

    @Override // com.smaato.sdk.ng.vpaid.a, com.smaato.sdk.ng.vpaid.b
    public /* bridge */ /* synthetic */ boolean isRewarded() {
        return super.isRewarded();
    }

    @Override // com.smaato.sdk.ng.vpaid.a
    public /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    @Override // com.smaato.sdk.ng.vpaid.a
    public /* bridge */ /* synthetic */ void load(IntegrationType integrationType) {
        super.load(integrationType);
    }

    @Override // com.smaato.sdk.ng.vpaid.b
    public /* bridge */ /* synthetic */ void onAdFinishedReplaying() {
        super.onAdFinishedReplaying();
    }

    @Override // com.smaato.sdk.ng.vpaid.b
    public /* bridge */ /* synthetic */ void onAdReplaying() {
        super.onAdReplaying();
    }

    @Override // com.smaato.sdk.ng.vpaid.b
    public /* bridge */ /* synthetic */ void onEndCardClosed(Boolean bool) {
        super.onEndCardClosed(bool);
    }

    public void onVolumeChanged() {
        if (e() != null) {
            e().onVolumeChanged();
        }
    }

    public void pause() {
        if (e() != null) {
            e().pause();
        }
    }

    public void pauseEndCardCloseButtonTimer() {
        Logger.d(A, "pause End Card Timer");
        if (e() != null) {
            e().pauseEndCardCloseButtonTimer();
        }
    }

    public void resume() {
        if (e() == null || !isReady()) {
            return;
        }
        e().resume();
    }

    public void resumeEndCardCloseButtonTimer() {
        Logger.d(A, "resume End Card Timer");
        if (e() != null) {
            e().resumeEndCardCloseButtonTimer();
        }
    }

    @Override // com.smaato.sdk.ng.vpaid.a, com.smaato.sdk.ng.vpaid.b
    public /* bridge */ /* synthetic */ void setAdCloseButtonListener(CloseButtonListener closeButtonListener) {
        super.setAdCloseButtonListener(closeButtonListener);
    }

    @Override // com.smaato.sdk.ng.vpaid.a, com.smaato.sdk.ng.vpaid.b
    public /* bridge */ /* synthetic */ void setAdListener(VideoAdListener videoAdListener) {
        super.setAdListener(videoAdListener);
    }

    @Override // com.smaato.sdk.ng.vpaid.a
    public /* bridge */ /* synthetic */ void setDebugMode(boolean z) {
        super.setDebugMode(z);
    }

    @Override // com.smaato.sdk.ng.vpaid.a, com.smaato.sdk.ng.vpaid.b
    public /* bridge */ /* synthetic */ void setRewarded(boolean z) {
        super.setRewarded(z);
    }

    @Override // com.smaato.sdk.ng.vpaid.b
    public /* bridge */ /* synthetic */ void setVideoCacheItem(VideoAdCacheItem videoAdCacheItem) {
        super.setVideoCacheItem(videoAdCacheItem);
    }

    public void show() {
        new Handler(Looper.getMainLooper()).postDelayed(new a(), 500L);
    }

    public void skip() {
        e().skipVideo();
    }

    @Override // com.smaato.sdk.ng.vpaid.a
    public /* bridge */ /* synthetic */ void useMobileNetworkForCaching(boolean z) {
        super.useMobileNetworkForCaching(z);
    }

    public VideoAd(Context context, Ad ad, boolean z, boolean z2, AdPresenter.ImpressionListener impressionListener, AdCloseButtonListener adCloseButtonListener) throws Exception {
        super(context, ad, z, z2, impressionListener, adCloseButtonListener);
        this.z = false;
    }
}
