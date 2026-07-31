package io.bidmachine.rendering.ad;

import com.ironsource.Zf;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.util.SystemComponent;
import io.bidmachine.util.viewabilitytracker.model.ActionEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u000fH&¢\u0006\u0002\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u000fH&¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0017H&¢\u0006\u0002\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u001bH&¢\u0006\u0002\u0010\u001cJ'\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u000e\u001a\u0004\u0018\u00010 H&¢\u0006\u0002\u0010!ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, d2 = {"Lio/bidmachine/rendering/ad/AdListener;", "Ad", "", "onAdAppeared", "", "ad", "(Ljava/lang/Object;)V", Zf.f, "systemComponent", "Lio/bidmachine/util/SystemComponent;", "(Ljava/lang/Object;Lio/bidmachine/util/SystemComponent;)V", "onAdDisappeared", "onAdExpired", "onAdFailToLoad", "error", "Lio/bidmachine/rendering/model/Error;", "(Ljava/lang/Object;Lio/bidmachine/rendering/model/Error;)V", "onAdFailToShow", "onAdFinished", Zf.j, "onAdShown", "onBrokenCreativeEvent", "brokenCreativeEvent", "Lio/bidmachine/rendering/model/BrokenCreativeEvent;", "(Ljava/lang/Object;Lio/bidmachine/rendering/model/BrokenCreativeEvent;)V", "onOpenPrivacySheet", "privacySheetParams", "Lio/bidmachine/rendering/model/PrivacySheetParams;", "(Ljava/lang/Object;Lio/bidmachine/rendering/model/PrivacySheetParams;)V", "onViewabilityEvent", "actionEvent", "Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;", "Lio/bidmachine/util/Error;", "(Ljava/lang/Object;Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;Lio/bidmachine/util/Error;)V", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public interface AdListener<Ad> {
    void onAdAppeared(Ad ad);

    void onAdClicked(Ad ad, @Nullable SystemComponent systemComponent);

    void onAdDisappeared(Ad ad);

    void onAdExpired(Ad ad);

    void onAdFailToLoad(Ad ad, @NotNull Error error);

    void onAdFailToShow(Ad ad, @NotNull Error error);

    void onAdFinished(Ad ad);

    void onAdLoaded(Ad ad);

    void onAdShown(Ad ad);

    void onBrokenCreativeEvent(Ad ad, @NotNull BrokenCreativeEvent brokenCreativeEvent);

    void onOpenPrivacySheet(Ad ad, @NotNull PrivacySheetParams privacySheetParams);

    void onViewabilityEvent(Ad ad, @NotNull ActionEvent actionEvent, @Nullable io.bidmachine.util.Error error);
}
