package io.bidmachine.ads.networks.mraid;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.ironsource.X3;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import io.bidmachine.core.Logger;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.iab.CacheControl;
import io.bidmachine.iab.mraid.MraidView;
import io.bidmachine.internal.C6022q;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedBannerAdCallback;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.util.UiUtils;
import io.bidmachine.utils.BMError;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J7\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u0003R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR*\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b \u0010!\u0012\u0004\b&\u0010\u0003\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lio/bidmachine/ads/networks/mraid/MraidBannerAd;", "Lio/bidmachine/unified/UnifiedBannerAd;", "<init>", "()V", "", "destroyMraidView", "Lio/bidmachine/ContextProvider;", "contextProvider", "Lio/bidmachine/unified/UnifiedBannerAdCallback;", "callback", "Lio/bidmachine/unified/UnifiedBannerAdRequestParams;", "requestParams", "Lio/bidmachine/unified/UnifiedMediationParams;", "unifiedMediationParams", "Lio/bidmachine/NetworkAdUnit;", "networkAdUnit", "load", "(Lio/bidmachine/ContextProvider;Lio/bidmachine/unified/UnifiedBannerAdCallback;Lio/bidmachine/unified/UnifiedBannerAdRequestParams;Lio/bidmachine/unified/UnifiedMediationParams;Lio/bidmachine/NetworkAdUnit;)V", "Lio/bidmachine/RendererConfiguration;", "rendererConfiguration", "prepareToShow", "(Lio/bidmachine/RendererConfiguration;)V", "onShown", "", X3.i.o, "onViewabilityChanged", "(Z)V", "onDestroy", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isPrepareToShowExecuted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lio/bidmachine/iab/mraid/MraidView;", "mraidView", "Lio/bidmachine/iab/mraid/MraidView;", "getMraidView", "()Lio/bidmachine/iab/mraid/MraidView;", "setMraidView", "(Lio/bidmachine/iab/mraid/MraidView;)V", "getMraidView$annotations", "Lio/bidmachine/internal/q;", "mraidOMSDKAdMeasurer", "Lio/bidmachine/internal/q;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class MraidBannerAd extends UnifiedBannerAd {

    @NotNull
    private final AtomicBoolean isPrepareToShowExecuted = new AtomicBoolean(false);

    @Nullable
    private C6022q mraidOMSDKAdMeasurer;

    @Nullable
    private MraidView mraidView;

    private final void destroyMraidView() {
        try {
            MraidView mraidView = this.mraidView;
            if (mraidView != null) {
                mraidView.destroy();
            }
        } catch (Throwable th) {
            Logger.w(th);
        }
        this.mraidView = null;
    }

    @VisibleForTesting
    public static /* synthetic */ void getMraidView$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$1(MraidParams mraidParams, UnifiedBannerAdCallback callback, MraidBannerAd this$0, Context applicationContext, String creativeAdm) {
        Intrinsics.checkNotNullParameter(mraidParams, "$mraidParams");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(applicationContext, "$applicationContext");
        Intrinsics.checkNotNullParameter(creativeAdm, "$creativeAdm");
        try {
            MraidView build = new MraidView.Builder().setCacheControl(mraidParams.getCacheControl()).setPlaceholderTimeoutSec(mraidParams.getPlaceholderTimeoutSec()).setListener(new MraidBannerAdListener(callback)).setAdMeasurer(this$0.mraidOMSDKAdMeasurer).build(applicationContext);
            this$0.mraidView = build;
            build.load(creativeAdm);
        } catch (Throwable th) {
            Logger.w(th);
            BMError throwable = BMError.throwable("Exception loading MRAID banner object", th);
            Intrinsics.checkNotNullExpressionValue(throwable, "throwable(\"Exception loa… MRAID banner object\", t)");
            callback.onAdLoadFailed(throwable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDestroy$lambda$3(MraidBannerAd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.destroyMraidView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewabilityChanged$lambda$2(MraidBannerAd this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            MraidView mraidView = this$0.mraidView;
            if (mraidView != null) {
                mraidView.onViewabilityChanged(z);
            }
        } catch (Throwable th) {
            Logger.w(th);
        }
    }

    @Nullable
    public final MraidView getMraidView() {
        return this.mraidView;
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onDestroy() {
        C6022q c6022q = this.mraidOMSDKAdMeasurer;
        if (c6022q == null) {
            destroyMraidView();
        } else {
            c6022q.destroy(new Runnable() { // from class: io.bidmachine.ads.networks.mraid.MraidBannerAd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MraidBannerAd.onDestroy$lambda$3(MraidBannerAd.this);
                }
            });
            this.mraidOMSDKAdMeasurer = null;
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onShown() {
        super.onShown();
        C6022q c6022q = this.mraidOMSDKAdMeasurer;
        if (c6022q != null) {
            c6022q.c();
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onViewabilityChanged(final boolean isViewable) {
        UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.ads.networks.mraid.MraidBannerAd$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                MraidBannerAd.onViewabilityChanged$lambda$2(MraidBannerAd.this, isViewable);
            }
        });
    }

    @Override // io.bidmachine.unified.UnifiedViewAd
    public void prepareToShow(@Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        MraidView mraidView;
        super.prepareToShow(rendererConfiguration);
        if (this.isPrepareToShowExecuted.compareAndSet(false, true) && (mraidView = this.mraidView) != null) {
            mraidView.show(null);
        }
    }

    public final void setMraidView(@Nullable MraidView mraidView) {
        this.mraidView = mraidView;
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void load(@NotNull ContextProvider contextProvider, @NotNull final UnifiedBannerAdCallback callback, @NotNull UnifiedBannerAdRequestParams requestParams, @NotNull UnifiedMediationParams unifiedMediationParams, @NotNull NetworkAdUnit networkAdUnit) throws Throwable {
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
            callback.setVisibilitySource(mraidParams.getCacheControl() == CacheControl.FullLoad ? VisibilitySource.BidMachine : VisibilitySource.All);
            final Context applicationContext = contextProvider.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "contextProvider.getApplicationContext()");
            if (mraidParams.getOmsdkEnabled()) {
                C6022q c6022q = new C6022q(true);
                this.mraidOMSDKAdMeasurer = c6022q;
                creativeAdm = c6022q.prepareCreativeForMeasure(mraidParams.getCreativeAdm());
                Intrinsics.checkNotNullExpressionValue(creativeAdm, "{\n            val mraidO…ms.creativeAdm)\n        }");
            } else {
                creativeAdm = mraidParams.getCreativeAdm();
            }
            final String str = creativeAdm;
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.ads.networks.mraid.MraidBannerAd$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    MraidBannerAd.load$lambda$1(MraidParams.this, callback, this, applicationContext, str);
                }
            });
        }
    }
}
