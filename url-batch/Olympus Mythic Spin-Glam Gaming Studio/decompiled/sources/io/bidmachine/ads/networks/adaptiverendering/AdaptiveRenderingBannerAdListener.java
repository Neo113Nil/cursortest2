package io.bidmachine.ads.networks.adaptiverendering;

import android.content.Context;
import com.ironsource.Zf;
import io.bidmachine.core.Utils;
import io.bidmachine.rendering.ad.view.AdView;
import io.bidmachine.rendering.ad.view.AdViewListener;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.view.PrivacySheetDialog;
import io.bidmachine.unified.UnifiedBannerAdCallback;
import io.bidmachine.util.SystemComponent;
import io.bidmachine.util.viewabilitytracker.model.ActionEvent;
import io.bidmachine.utils.BMError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\"\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lio/bidmachine/ads/networks/adaptiverendering/AdaptiveRenderingBannerAdListener;", "Lio/bidmachine/rendering/ad/view/AdViewListener;", "callback", "Lio/bidmachine/unified/UnifiedBannerAdCallback;", "(Lio/bidmachine/unified/UnifiedBannerAdCallback;)V", "onAdAppeared", "", "adView", "Lio/bidmachine/rendering/ad/view/AdView;", Zf.f, "systemComponent", "Lio/bidmachine/util/SystemComponent;", "onAdDisappeared", "onAdExpired", "onAdFailToLoad", "error", "Lio/bidmachine/rendering/model/Error;", "onAdFailToShow", "onAdFinished", Zf.j, "onAdShown", "onBrokenCreativeEvent", "brokenCreativeEvent", "Lio/bidmachine/rendering/model/BrokenCreativeEvent;", "onOpenPrivacySheet", "privacySheetParams", "Lio/bidmachine/rendering/model/PrivacySheetParams;", "onViewabilityEvent", "actionEvent", "Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;", "Lio/bidmachine/util/Error;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class AdaptiveRenderingBannerAdListener implements AdViewListener {

    @NotNull
    private final UnifiedBannerAdCallback callback;

    public AdaptiveRenderingBannerAdListener(@NotNull UnifiedBannerAdCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onAdAppeared(@NotNull AdView adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onAdDisappeared(@NotNull AdView adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onAdFinished(@NotNull AdView adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onAdShown(@NotNull AdView adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onAdClicked(@NotNull AdView adView, @Nullable SystemComponent systemComponent) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        this.callback.onAdClicked(systemComponent);
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onAdExpired(@NotNull AdView adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        this.callback.onAdExpired();
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onAdFailToLoad(@NotNull AdView adView, @NotNull Error error) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(error, "error");
        UnifiedBannerAdCallback unifiedBannerAdCallback = this.callback;
        BMError NoFill = BMError.NoFill;
        Intrinsics.checkNotNullExpressionValue(NoFill, "NoFill");
        unifiedBannerAdCallback.onAdLoadFailed(AdaptiveRenderingAdapterKt.toBMError(error, NoFill));
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onAdFailToShow(@NotNull AdView adView, @NotNull Error error) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(error, "error");
        UnifiedBannerAdCallback unifiedBannerAdCallback = this.callback;
        BMError InternalUnknownError = BMError.InternalUnknownError;
        Intrinsics.checkNotNullExpressionValue(InternalUnknownError, "InternalUnknownError");
        unifiedBannerAdCallback.onAdShowFailed(AdaptiveRenderingAdapterKt.toBMError(error, InternalUnknownError));
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onAdLoaded(@NotNull AdView adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        this.callback.onAdLoaded(adView);
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onBrokenCreativeEvent(@NotNull AdView adView, @NotNull BrokenCreativeEvent brokenCreativeEvent) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(brokenCreativeEvent, "brokenCreativeEvent");
        this.callback.onBrokenCreativeEvent(AdaptiveRenderingAdapterKt.toEventParams(brokenCreativeEvent));
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onOpenPrivacySheet(@NotNull AdView adView, @NotNull PrivacySheetParams privacySheetParams) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(privacySheetParams, "privacySheetParams");
        PrivacySheetDialog.Companion companion = PrivacySheetDialog.INSTANCE;
        Context findDialogContext = Utils.findDialogContext(adView.getContext(), adView);
        Intrinsics.checkNotNullExpressionValue(findDialogContext, "findDialogContext(adView.context, adView)");
        companion.show(findDialogContext, privacySheetParams);
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    public void onViewabilityEvent(@NotNull AdView adView, @NotNull ActionEvent actionEvent, @Nullable io.bidmachine.util.Error error) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
        this.callback.onAdViewabilityEvent(actionEvent, error != null ? AdaptiveRenderingAdapterKt.toBMError(error) : null);
    }
}
