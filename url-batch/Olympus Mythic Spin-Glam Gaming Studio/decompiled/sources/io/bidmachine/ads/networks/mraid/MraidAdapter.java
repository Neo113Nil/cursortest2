package io.bidmachine.ads.networks.mraid;

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
import io.bidmachine.iab.bridge.JsBridgeHandler;
import io.bidmachine.iab.bridge.NativeStorageJsBridge;
import io.bidmachine.iab.mraid.MraidLog;
import io.bidmachine.iab.mraid.MraidType;
import io.bidmachine.internal.AbstractC6023s;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedFullscreenAd;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0014J0\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J(\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0015J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\tH\u0016¨\u0006!"}, d2 = {"Lio/bidmachine/ads/networks/mraid/MraidAdapter;", "Lio/bidmachine/HeaderBiddingAdapter;", "()V", "createBanner", "Lio/bidmachine/unified/UnifiedBannerAd;", "createInterstitial", "Lio/bidmachine/unified/UnifiedFullscreenAd;", "createRewarded", "isNetworkInitializationStatusCheckSupported", "", "isNetworkInitialized", "contextProvider", "Lio/bidmachine/ContextProvider;", "onCollectHeaderBiddingParams", "", "adRequestParams", "Lio/bidmachine/unified/UnifiedAdRequestParams;", "networkAdUnit", "Lio/bidmachine/NetworkAdUnit;", "hbAdRequestParams", "Lio/bidmachine/HeaderBiddingAdRequestParams;", "collectCallback", "Lio/bidmachine/HeaderBiddingCollectParamsCallback;", "onNetworkInitialize", "initializationParams", "Lio/bidmachine/InitializationParams;", "networkConfigParams", "Lio/bidmachine/NetworkConfigParams;", "callback", "Lio/bidmachine/NetworkInitializationCallback;", "setLogging", "enabled", "Companion", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes12.dex */
public final class MraidAdapter extends HeaderBiddingAdapter {

    @NotNull
    public static final String ADAPTER_SDK_VERSION_NAME = "3.7.1";

    @NotNull
    public static final String ADAPTER_VERSION_NAME = "3.7.1.1";

    @NotNull
    private static final AtomicBoolean IS_JS_BRIDGE_ADDED = new AtomicBoolean(false);

    @NotNull
    public static final String KEY = "mraid";

    public MraidAdapter() {
        super("mraid", "3.7.1", "3.7.1.1", 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    @Override // io.bidmachine.NetworkAdapter
    @NotNull
    public UnifiedBannerAd createBanner() {
        return new MraidBannerAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    @NotNull
    public UnifiedFullscreenAd createInterstitial() {
        return new MraidFullScreenAd(MraidType.Static);
    }

    @Override // io.bidmachine.NetworkAdapter
    @NotNull
    public UnifiedFullscreenAd createRewarded() {
        return new MraidFullScreenAd(MraidType.Rewarded);
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
        if (IS_JS_BRIDGE_ADDED.compareAndSet(false, true)) {
            JsBridgeHandler.addBridge(new NativeStorageJsBridge());
        }
        AbstractC6023s.a(contextProvider.getContext());
        callback.onSuccess();
    }

    @Override // io.bidmachine.NetworkAdapter
    public void setLogging(boolean enabled) throws Throwable {
        MraidLog.setEnabled(enabled);
    }
}
