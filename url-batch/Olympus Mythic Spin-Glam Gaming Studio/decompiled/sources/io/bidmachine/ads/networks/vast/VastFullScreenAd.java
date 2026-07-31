package io.bidmachine.ads.networks.vast;

import android.content.Context;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.VideoType;
import io.bidmachine.iab.vast.activity.VastView;
import io.bidmachine.internal.C6022q;
import io.bidmachine.internal.P;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.utils.BMError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lio/bidmachine/ads/networks/vast/VastFullScreenAd;", "Lio/bidmachine/unified/UnifiedFullscreenAd;", "Lio/bidmachine/iab/vast/VideoType;", "videoType", "<init>", "(Lio/bidmachine/iab/vast/VideoType;)V", "", "destroyVastView", "()V", "Lio/bidmachine/ContextProvider;", "contextProvider", "Lio/bidmachine/unified/UnifiedFullscreenAdCallback;", "callback", "Lio/bidmachine/unified/UnifiedFullscreenAdRequestParams;", "requestParams", "Lio/bidmachine/unified/UnifiedMediationParams;", "unifiedMediationParams", "Lio/bidmachine/NetworkAdUnit;", "networkAdUnit", "load", "(Lio/bidmachine/ContextProvider;Lio/bidmachine/unified/UnifiedFullscreenAdCallback;Lio/bidmachine/unified/UnifiedFullscreenAdRequestParams;Lio/bidmachine/unified/UnifiedMediationParams;Lio/bidmachine/NetworkAdUnit;)V", "Lio/bidmachine/RendererConfiguration;", "rendererConfiguration", "show", "(Lio/bidmachine/ContextProvider;Lio/bidmachine/unified/UnifiedFullscreenAdCallback;Lio/bidmachine/RendererConfiguration;)V", "onDestroy", "Lio/bidmachine/iab/vast/VideoType;", "Lio/bidmachine/internal/P;", "vastOMSDKAdMeasurer", "Lio/bidmachine/internal/P;", "Lio/bidmachine/internal/q;", "postBannerAdMeasurer", "Lio/bidmachine/internal/q;", "Lio/bidmachine/iab/vast/VastRequest;", "vastRequest", "Lio/bidmachine/iab/vast/VastRequest;", "Lio/bidmachine/ads/networks/vast/VastFullScreenAdLoadListener;", "vastAdLoadListener", "Lio/bidmachine/ads/networks/vast/VastFullScreenAdLoadListener;", "Lio/bidmachine/ads/networks/vast/VastFullScreenAdShowListener;", "vastAdShowListener", "Lio/bidmachine/ads/networks/vast/VastFullScreenAdShowListener;", "Lio/bidmachine/iab/vast/activity/VastView;", "vastView", "Lio/bidmachine/iab/vast/activity/VastView;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class VastFullScreenAd extends UnifiedFullscreenAd {

    @Nullable
    private C6022q postBannerAdMeasurer;

    @Nullable
    private VastFullScreenAdLoadListener vastAdLoadListener;

    @Nullable
    private VastFullScreenAdShowListener vastAdShowListener;

    @Nullable
    private P vastOMSDKAdMeasurer;

    @Nullable
    private VastRequest vastRequest;

    @Nullable
    private VastView vastView;

    @NotNull
    private final VideoType videoType;

    public VastFullScreenAd(@NotNull VideoType videoType) {
        Intrinsics.checkNotNullParameter(videoType, "videoType");
        this.videoType = videoType;
    }

    private final void destroyVastView() {
        VastView vastView = this.vastView;
        if (vastView != null) {
            vastView.destroy();
        }
        this.vastView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDestroy$lambda$0(VastFullScreenAd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.destroyVastView();
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onDestroy() {
        Unit unit;
        this.vastAdLoadListener = null;
        this.vastAdShowListener = null;
        P p = this.vastOMSDKAdMeasurer;
        if (p != null) {
            p.a();
        }
        this.vastOMSDKAdMeasurer = null;
        C6022q c6022q = this.postBannerAdMeasurer;
        if (c6022q != null) {
            c6022q.destroy(new Runnable() { // from class: io.bidmachine.ads.networks.vast.VastFullScreenAd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VastFullScreenAd.onDestroy$lambda$0(VastFullScreenAd.this);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            destroyVastView();
        }
        this.postBannerAdMeasurer = null;
        if (this.vastRequest != null) {
            this.vastRequest = null;
        }
    }

    @Override // io.bidmachine.unified.UnifiedFullscreenAd
    public void show(@NotNull ContextProvider contextProvider, @NotNull UnifiedFullscreenAdCallback callback, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(callback, "callback");
        VastRequest vastRequest = this.vastRequest;
        if (vastRequest != null && vastRequest.canDisplay()) {
            this.vastAdShowListener = new VastFullScreenAdShowListener(callback, this.vastOMSDKAdMeasurer, this.postBannerAdMeasurer);
            vastRequest.display(contextProvider.getContext(), this.videoType, this.vastAdShowListener, this.vastView, this.vastOMSDKAdMeasurer, this.postBannerAdMeasurer);
        } else {
            BMError internal2 = BMError.internal("VAST fullscreen object is null or can not find video file");
            Intrinsics.checkNotNullExpressionValue(internal2, "internal(\"VAST fullscree…can not find video file\")");
            callback.onAdShowFailed(internal2);
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void load(@NotNull ContextProvider contextProvider, @NotNull UnifiedFullscreenAdCallback callback, @NotNull UnifiedFullscreenAdRequestParams requestParams, @NotNull UnifiedMediationParams unifiedMediationParams, @NotNull NetworkAdUnit networkAdUnit) throws Throwable {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        Intrinsics.checkNotNullParameter(unifiedMediationParams, "unifiedMediationParams");
        Intrinsics.checkNotNullParameter(networkAdUnit, "networkAdUnit");
        VastParams vastParams = new VastParams(unifiedMediationParams);
        if (vastParams.isValid(callback)) {
            if (vastParams.getCreativeAdm() == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (vastParams.getOmsdkEnabled()) {
                this.vastOMSDKAdMeasurer = new P();
                this.postBannerAdMeasurer = new C6022q();
            }
            Context applicationContext = contextProvider.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "contextProvider.getApplicationContext()");
            this.vastAdLoadListener = new VastFullScreenAdLoadListener(callback);
            this.vastView = new VastView(applicationContext);
            VastRequest build = VastRequest.newBuilder().setCacheControl(vastParams.getCacheControl()).setPlaceholderTimeoutSec(vastParams.getPlaceholderTimeoutSec()).setVideoCloseTime(vastParams.getSkipOffset()).setCompanionCloseTime(vastParams.getCompanionSkipOffset()).forceUseNativeCloseTime(vastParams.getUseNativeClose()).setAdMeasurer(this.vastOMSDKAdMeasurer).build();
            this.vastRequest = build;
            if (build != null) {
                build.loadVideoWithData(applicationContext, vastParams.getCreativeAdm(), this.vastAdLoadListener);
            }
        }
    }
}
