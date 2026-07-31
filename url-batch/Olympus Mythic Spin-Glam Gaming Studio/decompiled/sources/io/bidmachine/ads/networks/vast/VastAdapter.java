package io.bidmachine.ads.networks.vast;

import androidx.annotation.WorkerThread;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.iab.utils.Logger;
import io.bidmachine.iab.vast.VastLog;
import io.bidmachine.iab.vast.VideoType;
import io.bidmachine.internal.AbstractC6023s;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedFullscreenAd;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0014J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J(\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0015J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016¨\u0006\u001f"}, d2 = {"Lio/bidmachine/ads/networks/vast/VastAdapter;", "Lio/bidmachine/HeaderBiddingAdapter;", "()V", "createInterstitial", "Lio/bidmachine/unified/UnifiedFullscreenAd;", "createRewarded", "isNetworkInitializationStatusCheckSupported", "", "isNetworkInitialized", "contextProvider", "Lio/bidmachine/ContextProvider;", "onCollectHeaderBiddingParams", "", "adRequestParams", "Lio/bidmachine/unified/UnifiedAdRequestParams;", "networkAdUnit", "Lio/bidmachine/NetworkAdUnit;", "hbAdRequestParams", "Lio/bidmachine/HeaderBiddingAdRequestParams;", "collectCallback", "Lio/bidmachine/HeaderBiddingCollectParamsCallback;", "onNetworkInitialize", "initializationParams", "Lio/bidmachine/InitializationParams;", "networkConfigParams", "Lio/bidmachine/NetworkConfigParams;", "callback", "Lio/bidmachine/NetworkInitializationCallback;", "setLogging", "enabled", "Companion", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class VastAdapter extends HeaderBiddingAdapter {

    @NotNull
    public static final String ADAPTER_SDK_VERSION_NAME = "3.7.1";

    @NotNull
    public static final String ADAPTER_VERSION_NAME = "3.7.1.1";

    @NotNull
    public static final String KEY = "vast";

    public VastAdapter() {
        super("vast", "3.7.1", "3.7.1.1", 1, new AdsType[]{AdsType.Interstitial, AdsType.Rewarded});
    }

    @Override // io.bidmachine.NetworkAdapter
    @NotNull
    public UnifiedFullscreenAd createInterstitial() {
        return new VastFullScreenAd(VideoType.NonRewarded);
    }

    @Override // io.bidmachine.NetworkAdapter
    @NotNull
    public UnifiedFullscreenAd createRewarded() {
        return new VastFullScreenAd(VideoType.Rewarded);
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitializationStatusCheckSupported() {
        return false;
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitialized(@NotNull ContextProvider contextProvider) throws Throwable {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        return false;
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    protected void onCollectHeaderBiddingParams(@NotNull ContextProvider contextProvider, @NotNull UnifiedAdRequestParams adRequestParams, @NotNull NetworkAdUnit networkAdUnit, @NotNull HeaderBiddingAdRequestParams hbAdRequestParams, @NotNull HeaderBiddingCollectParamsCallback collectCallback) throws Throwable {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adRequestParams, "adRequestParams");
        Intrinsics.checkNotNullParameter(networkAdUnit, "networkAdUnit");
        Intrinsics.checkNotNullParameter(hbAdRequestParams, "hbAdRequestParams");
        Intrinsics.checkNotNullParameter(collectCallback, "collectCallback");
        collectCallback.onCollectFinished(new HashMap());
    }

    @Override // io.bidmachine.NetworkAdapter
    @WorkerThread
    protected void onNetworkInitialize(@NotNull ContextProvider contextProvider, @NotNull InitializationParams initializationParams, @NotNull NetworkConfigParams networkConfigParams, @NotNull NetworkInitializationCallback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(initializationParams, "initializationParams");
        Intrinsics.checkNotNullParameter(networkConfigParams, "networkConfigParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC6023s.a(contextProvider.getContext());
        callback.onSuccess();
    }

    @Override // io.bidmachine.NetworkAdapter
    public void setLogging(boolean enabled) throws Throwable {
        VastLog.setLoggingLevel(enabled ? Logger.LogLevel.debug : Logger.LogLevel.none);
    }
}
