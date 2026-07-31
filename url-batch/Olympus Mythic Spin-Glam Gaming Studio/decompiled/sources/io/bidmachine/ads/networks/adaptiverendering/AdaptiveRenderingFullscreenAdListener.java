package io.bidmachine.ads.networks.adaptiverendering;

import android.content.Context;
import com.ironsource.Zf;
import io.bidmachine.core.Utils;
import io.bidmachine.rendering.ad.fullscreen.FullScreenAd;
import io.bidmachine.rendering.ad.fullscreen.FullScreenAdListener;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.view.PrivacySheetDialog;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.util.SystemComponent;
import io.bidmachine.util.viewabilitytracker.model.ActionEvent;
import io.bidmachine.utils.BMError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\"\u0010\u001e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u0012\u001a\u0004\u0018\u00010!H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lio/bidmachine/ads/networks/adaptiverendering/AdaptiveRenderingFullscreenAdListener;", "Lio/bidmachine/rendering/ad/fullscreen/FullScreenAdListener;", "context", "Landroid/content/Context;", "callback", "Lio/bidmachine/unified/UnifiedFullscreenAdCallback;", "(Landroid/content/Context;Lio/bidmachine/unified/UnifiedFullscreenAdCallback;)V", "applicationContext", "onAdAppeared", "", "fullScreenAd", "Lio/bidmachine/rendering/ad/fullscreen/FullScreenAd;", Zf.f, "systemComponent", "Lio/bidmachine/util/SystemComponent;", "onAdDisappeared", "onAdExpired", "onAdFailToLoad", "error", "Lio/bidmachine/rendering/model/Error;", "onAdFailToShow", "onAdFinished", Zf.j, "onAdShown", "onBrokenCreativeEvent", "brokenCreativeEvent", "Lio/bidmachine/rendering/model/BrokenCreativeEvent;", "onOpenPrivacySheet", "privacySheetParams", "Lio/bidmachine/rendering/model/PrivacySheetParams;", "onViewabilityEvent", "actionEvent", "Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;", "Lio/bidmachine/util/Error;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class AdaptiveRenderingFullscreenAdListener implements FullScreenAdListener {

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final UnifiedFullscreenAdCallback callback;

    public AdaptiveRenderingFullscreenAdListener(@NotNull Context context, @NotNull UnifiedFullscreenAdCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onAdAppeared(@NotNull FullScreenAd fullScreenAd) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onAdDisappeared(@NotNull FullScreenAd fullScreenAd) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onAdShown(@NotNull FullScreenAd fullScreenAd) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onAdClicked(@NotNull FullScreenAd fullScreenAd, @Nullable SystemComponent systemComponent) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        this.callback.onAdClicked(systemComponent);
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onAdExpired(@NotNull FullScreenAd fullScreenAd) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        this.callback.onAdExpired();
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onAdFailToLoad(@NotNull FullScreenAd fullScreenAd, @NotNull Error error) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        Intrinsics.checkNotNullParameter(error, "error");
        UnifiedFullscreenAdCallback unifiedFullscreenAdCallback = this.callback;
        BMError NoFill = BMError.NoFill;
        Intrinsics.checkNotNullExpressionValue(NoFill, "NoFill");
        unifiedFullscreenAdCallback.onAdLoadFailed(AdaptiveRenderingAdapterKt.toBMError(error, NoFill));
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onAdFailToShow(@NotNull FullScreenAd fullScreenAd, @NotNull Error error) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        Intrinsics.checkNotNullParameter(error, "error");
        UnifiedFullscreenAdCallback unifiedFullscreenAdCallback = this.callback;
        BMError InternalUnknownError = BMError.InternalUnknownError;
        Intrinsics.checkNotNullExpressionValue(InternalUnknownError, "InternalUnknownError");
        unifiedFullscreenAdCallback.onAdShowFailed(AdaptiveRenderingAdapterKt.toBMError(error, InternalUnknownError));
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onAdFinished(@NotNull FullScreenAd fullScreenAd) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        if (fullScreenAd.isCompleted()) {
            this.callback.onAdFinished();
        }
        this.callback.onAdClosed();
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onAdLoaded(@NotNull FullScreenAd fullScreenAd) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        this.callback.onAdLoaded();
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onBrokenCreativeEvent(@NotNull FullScreenAd fullScreenAd, @NotNull BrokenCreativeEvent brokenCreativeEvent) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        Intrinsics.checkNotNullParameter(brokenCreativeEvent, "brokenCreativeEvent");
        this.callback.onBrokenCreativeEvent(AdaptiveRenderingAdapterKt.toEventParams(brokenCreativeEvent));
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onOpenPrivacySheet(@NotNull FullScreenAd fullScreenAd, @NotNull PrivacySheetParams privacySheetParams) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        Intrinsics.checkNotNullParameter(privacySheetParams, "privacySheetParams");
        PrivacySheetDialog.Companion companion = PrivacySheetDialog.INSTANCE;
        Context findDialogContext = Utils.findDialogContext(this.applicationContext);
        Intrinsics.checkNotNullExpressionValue(findDialogContext, "findDialogContext(applicationContext)");
        companion.show(findDialogContext, privacySheetParams);
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onViewabilityEvent(@NotNull FullScreenAd fullScreenAd, @NotNull ActionEvent actionEvent, @Nullable io.bidmachine.util.Error error) {
        Intrinsics.checkNotNullParameter(fullScreenAd, "fullScreenAd");
        Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
        this.callback.onAdViewabilityEvent(actionEvent, error != null ? AdaptiveRenderingAdapterKt.toBMError(error) : null);
    }
}
