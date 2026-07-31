package io.bidmachine.ads.networks.mraid;

import android.content.Context;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import io.bidmachine.core.Logger;
import io.bidmachine.iab.mraid.MraidInterstitial;
import io.bidmachine.iab.mraid.MraidType;
import io.bidmachine.internal.C6022q;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.util.UiUtils;
import io.bidmachine.utils.BMError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lio/bidmachine/ads/networks/mraid/MraidFullScreenAd;", "Lio/bidmachine/unified/UnifiedFullscreenAd;", "Lio/bidmachine/iab/mraid/MraidType;", "mraidType", "<init>", "(Lio/bidmachine/iab/mraid/MraidType;)V", "", "destroyMraidInterstitial", "()V", "Lio/bidmachine/ContextProvider;", "contextProvider", "Lio/bidmachine/unified/UnifiedFullscreenAdCallback;", "callback", "Lio/bidmachine/unified/UnifiedFullscreenAdRequestParams;", "requestParams", "Lio/bidmachine/unified/UnifiedMediationParams;", "unifiedMediationParams", "Lio/bidmachine/NetworkAdUnit;", "networkAdUnit", "load", "(Lio/bidmachine/ContextProvider;Lio/bidmachine/unified/UnifiedFullscreenAdCallback;Lio/bidmachine/unified/UnifiedFullscreenAdRequestParams;Lio/bidmachine/unified/UnifiedMediationParams;Lio/bidmachine/NetworkAdUnit;)V", "Lio/bidmachine/RendererConfiguration;", "rendererConfiguration", "show", "(Lio/bidmachine/ContextProvider;Lio/bidmachine/unified/UnifiedFullscreenAdCallback;Lio/bidmachine/RendererConfiguration;)V", "onDestroy", "Lio/bidmachine/iab/mraid/MraidType;", "Lio/bidmachine/iab/mraid/MraidInterstitial;", "mraidInterstitial", "Lio/bidmachine/iab/mraid/MraidInterstitial;", "Lio/bidmachine/internal/q;", "mraidOMSDKAdMeasurer", "Lio/bidmachine/internal/q;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class MraidFullScreenAd extends UnifiedFullscreenAd {

    @Nullable
    private MraidInterstitial mraidInterstitial;

    @Nullable
    private C6022q mraidOMSDKAdMeasurer;

    @NotNull
    private final MraidType mraidType;

    public MraidFullScreenAd(@NotNull MraidType mraidType) {
        Intrinsics.checkNotNullParameter(mraidType, "mraidType");
        this.mraidType = mraidType;
    }

    private final void destroyMraidInterstitial() {
        try {
            MraidInterstitial mraidInterstitial = this.mraidInterstitial;
            if (mraidInterstitial != null) {
                mraidInterstitial.destroy();
            }
        } catch (Throwable th) {
            Logger.w(th);
        }
        this.mraidInterstitial = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$0(MraidFullScreenAd this$0, MraidParams mraidParams, Context applicationContext, UnifiedFullscreenAdCallback callback, String creativeAdm) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mraidParams, "$mraidParams");
        Intrinsics.checkNotNullParameter(applicationContext, "$applicationContext");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(creativeAdm, "$creativeAdm");
        try {
            MraidInterstitial build = MraidInterstitial.newBuilder().setCacheControl(mraidParams.getCacheControl()).setPlaceholderTimeoutSec(mraidParams.getPlaceholderTimeoutSec()).setCloseTime(mraidParams.getSkipOffset()).forceUseNativeCloseButton(mraidParams.getUseNativeClose()).setListener(new MraidFullScreenAdListener(applicationContext, callback, this$0.mraidOMSDKAdMeasurer)).setR1(mraidParams.getR1()).setR2(mraidParams.getR2()).setDurationSec(mraidParams.getProgressDuration()).setProductLink(mraidParams.getStoreUrl()).setCloseStyle(mraidParams.getCloseableViewStyle()).setCountDownStyle(mraidParams.getCountDownStyle()).setProgressStyle(mraidParams.getProgressStyle()).setAdMeasurer(this$0.mraidOMSDKAdMeasurer).setAutoViewabilityCheck(true).build(applicationContext);
            this$0.mraidInterstitial = build;
            Intrinsics.checkNotNull(build);
            build.load(creativeAdm);
        } catch (Throwable th) {
            Logger.w(th);
            BMError throwable = BMError.throwable("Exception loading MRAID fullscreen object", th);
            Intrinsics.checkNotNullExpressionValue(throwable, "throwable(\"Exception loa…ID fullscreen object\", t)");
            callback.onAdLoadFailed(throwable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDestroy$lambda$1(MraidFullScreenAd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.destroyMraidInterstitial();
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onDestroy() {
        C6022q c6022q = this.mraidOMSDKAdMeasurer;
        if (c6022q == null) {
            destroyMraidInterstitial();
        } else {
            c6022q.destroy(new Runnable() { // from class: io.bidmachine.ads.networks.mraid.MraidFullScreenAd$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    MraidFullScreenAd.onDestroy$lambda$1(MraidFullScreenAd.this);
                }
            });
            this.mraidOMSDKAdMeasurer = null;
        }
    }

    @Override // io.bidmachine.unified.UnifiedFullscreenAd
    public void show(@NotNull ContextProvider contextProvider, @NotNull UnifiedFullscreenAdCallback callback, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MraidInterstitial mraidInterstitial = this.mraidInterstitial;
        if (mraidInterstitial == null) {
            BMError internal2 = BMError.internal("MRAID fullscreen object is null");
            Intrinsics.checkNotNullExpressionValue(internal2, "internal(\"MRAID fullscreen object is null\")");
            callback.onAdShowFailed(internal2);
        } else if (!mraidInterstitial.isReady()) {
            BMError internal3 = BMError.internal("MRAID fullscreen object is not ready");
            Intrinsics.checkNotNullExpressionValue(internal3, "internal(\"MRAID fullscreen object is not ready\")");
            callback.onAdShowFailed(internal3);
        } else {
            if (!mraidInterstitial.isShown()) {
                mraidInterstitial.show(contextProvider.getContext(), this.mraidType);
                return;
            }
            BMError internal4 = BMError.internal("MRAID fullscreen object is already was shown");
            Intrinsics.checkNotNullExpressionValue(internal4, "internal(\"MRAID fullscre…ct is already was shown\")");
            callback.onAdShowFailed(internal4);
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void load(@NotNull ContextProvider contextProvider, @NotNull final UnifiedFullscreenAdCallback callback, @NotNull UnifiedFullscreenAdRequestParams requestParams, @NotNull UnifiedMediationParams unifiedMediationParams, @NotNull NetworkAdUnit networkAdUnit) throws Throwable {
        String creativeAdm;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        Intrinsics.checkNotNullParameter(unifiedMediationParams, "unifiedMediationParams");
        Intrinsics.checkNotNullParameter(networkAdUnit, "networkAdUnit");
        final MraidParams mraidParams = new MraidParams(unifiedMediationParams);
        if (mraidParams.isValid(callback)) {
            if (mraidParams.getCreativeAdm() == null) {
                throw new IllegalStateException("Required value was null.");
            }
            final Context applicationContext = contextProvider.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "contextProvider.getApplicationContext()");
            if (mraidParams.getOmsdkEnabled()) {
                C6022q c6022q = new C6022q();
                this.mraidOMSDKAdMeasurer = c6022q;
                creativeAdm = c6022q.prepareCreativeForMeasure(mraidParams.getCreativeAdm());
                Intrinsics.checkNotNullExpressionValue(creativeAdm, "{\n            val mraidO…ms.creativeAdm)\n        }");
            } else {
                creativeAdm = mraidParams.getCreativeAdm();
            }
            final String str = creativeAdm;
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.ads.networks.mraid.MraidFullScreenAd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MraidFullScreenAd.load$lambda$0(MraidFullScreenAd.this, mraidParams, applicationContext, callback, str);
                }
            });
        }
    }
}
