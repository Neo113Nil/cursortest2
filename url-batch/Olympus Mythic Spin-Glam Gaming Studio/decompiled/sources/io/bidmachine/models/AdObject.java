package io.bidmachine.models;

import io.bidmachine.AdProcessCallback;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedAdRequestParams;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u00020\u0007J\u0015\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00020\nH&¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\rH&J\u000f\u0010\u000f\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H&J%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00020\u0018H&¢\u0006\u0002\u0010\u0019J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001bH&J\b\u0010\u001f\u001a\u00020\u0012H&J\b\u0010 \u001a\u00020\u0012H&J\b\u0010!\u001a\u00020\u0012H&J\b\u0010\"\u001a\u00020\u0012H&J\b\u0010#\u001a\u00020\u0012H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, d2 = {"Lio/bidmachine/models/AdObject;", "AdObjectParamsType", "Lio/bidmachine/models/AdObjectParams;", "UnifiedAdRequestParamsType", "Lio/bidmachine/unified/UnifiedAdRequestParams;", "UnifiedAdCallbackType", "Lio/bidmachine/unified/UnifiedAdCallback;", "", "createUnifiedCallback", "adProcessCallback", "Lio/bidmachine/AdProcessCallback;", "(Lio/bidmachine/AdProcessCallback;)Lio/bidmachine/unified/UnifiedAdCallback;", "getCustomParams", "", "", "getParams", "()Lio/bidmachine/models/AdObjectParams;", "hide", "", "load", "contextProvider", "Lio/bidmachine/ContextProvider;", "adRequestParams", "networkAdUnit", "Lio/bidmachine/NetworkAdUnit;", "(Lio/bidmachine/ContextProvider;Lio/bidmachine/unified/UnifiedAdRequestParams;Lio/bidmachine/NetworkAdUnit;)V", "onClicked", "", "()Ljava/lang/Boolean;", "onClosed", "finished", "onDestroy", "onExpired", "onFinished", "onShowFailed", "onShown", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public interface AdObject<AdObjectParamsType extends AdObjectParams, UnifiedAdRequestParamsType extends UnifiedAdRequestParams, UnifiedAdCallbackType extends UnifiedAdCallback> {
    @NotNull
    UnifiedAdCallbackType createUnifiedCallback(@NotNull AdProcessCallback adProcessCallback);

    @Nullable
    Map<String, Object> getCustomParams();

    @Nullable
    AdObjectParamsType getParams();

    void hide();

    void load(@NotNull ContextProvider contextProvider, @NotNull UnifiedAdRequestParamsType adRequestParams, @NotNull NetworkAdUnit networkAdUnit) throws Throwable;

    @Nullable
    Boolean onClicked();

    void onClosed(boolean finished);

    void onDestroy();

    void onExpired();

    void onFinished();

    void onShowFailed();

    void onShown();
}
