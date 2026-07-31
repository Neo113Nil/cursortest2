package io.bidmachine.rendering.ad.fullscreen;

import com.ironsource.Zf;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.util.SystemComponent;
import io.bidmachine.util.viewabilitytracker.model.ActionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\"\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\f\u001a\u0004\u0018\u00010\u001bH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Lio/bidmachine/rendering/ad/fullscreen/SimpleFullScreenAdListener;", "Lio/bidmachine/rendering/ad/fullscreen/FullScreenAdListener;", "onAdAppeared", "", "ad", "Lio/bidmachine/rendering/ad/fullscreen/FullScreenAd;", Zf.f, "systemComponent", "Lio/bidmachine/util/SystemComponent;", "onAdDisappeared", "onAdExpired", "onAdFailToLoad", "error", "Lio/bidmachine/rendering/model/Error;", "onAdFailToShow", "onAdFinished", Zf.j, "onAdShown", "onBrokenCreativeEvent", "brokenCreativeEvent", "Lio/bidmachine/rendering/model/BrokenCreativeEvent;", "onOpenPrivacySheet", "privacySheetParams", "Lio/bidmachine/rendering/model/PrivacySheetParams;", "onViewabilityEvent", "actionEvent", "Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;", "Lio/bidmachine/util/Error;", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public interface SimpleFullScreenAdListener extends FullScreenAdListener {
    @Override // io.bidmachine.rendering.ad.AdListener
    default void onAdAppeared(@NotNull FullScreenAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    default void onAdClicked(@NotNull FullScreenAd ad, @Nullable SystemComponent systemComponent) {
        Intrinsics.checkNotNullParameter(ad, "ad");
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    default void onAdDisappeared(@NotNull FullScreenAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    default void onAdExpired(@NotNull FullScreenAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    default void onAdFailToLoad(@NotNull FullScreenAd ad, @NotNull Error error) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(error, "error");
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    default void onAdFailToShow(@NotNull FullScreenAd ad, @NotNull Error error) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(error, "error");
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    default void onAdFinished(@NotNull FullScreenAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    default void onAdLoaded(@NotNull FullScreenAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    default void onAdShown(@NotNull FullScreenAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    default void onBrokenCreativeEvent(@NotNull FullScreenAd ad, @NotNull BrokenCreativeEvent brokenCreativeEvent) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(brokenCreativeEvent, "brokenCreativeEvent");
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    default void onOpenPrivacySheet(@NotNull FullScreenAd ad, @NotNull PrivacySheetParams privacySheetParams) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(privacySheetParams, "privacySheetParams");
    }

    @Override // io.bidmachine.rendering.ad.AdListener
    default void onViewabilityEvent(@NotNull FullScreenAd ad, @NotNull ActionEvent actionEvent, @Nullable io.bidmachine.util.Error error) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
    }
}
