package io.bidmachine.ads.networks.nast;

import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedNativeAd;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0014J0\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J(\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0014¨\u0006\u001c"}, d2 = {"Lio/bidmachine/ads/networks/nast/NastAdapter;", "Lio/bidmachine/HeaderBiddingAdapter;", "()V", "createNativeAd", "Lio/bidmachine/unified/UnifiedNativeAd;", "isNetworkInitializationStatusCheckSupported", "", "isNetworkInitialized", "contextProvider", "Lio/bidmachine/ContextProvider;", "onCollectHeaderBiddingParams", "", "adRequestParams", "Lio/bidmachine/unified/UnifiedAdRequestParams;", "networkAdUnit", "Lio/bidmachine/NetworkAdUnit;", "hbAdRequestParams", "Lio/bidmachine/HeaderBiddingAdRequestParams;", "collectCallback", "Lio/bidmachine/HeaderBiddingCollectParamsCallback;", "onNetworkInitialize", "initializationParams", "Lio/bidmachine/InitializationParams;", "networkConfigParams", "Lio/bidmachine/NetworkConfigParams;", "callback", "Lio/bidmachine/NetworkInitializationCallback;", "Companion", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes12.dex */
public final class NastAdapter extends HeaderBiddingAdapter {

    @NotNull
    public static final String ADAPTER_SDK_VERSION_NAME = "1.0";

    @NotNull
    public static final String ADAPTER_VERSION_NAME = "3.7.1.1";

    @NotNull
    public static final String KEY = "nast";

    public NastAdapter() {
        super(KEY, ADAPTER_SDK_VERSION_NAME, "3.7.1.1", 1, new AdsType[]{AdsType.Native});
    }

    @Override // io.bidmachine.NetworkAdapter
    @NotNull
    public UnifiedNativeAd createNativeAd() {
        return new NastNative();
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
    protected void onNetworkInitialize(@NotNull ContextProvider contextProvider, @NotNull InitializationParams initializationParams, @NotNull NetworkConfigParams networkConfigParams, @NotNull NetworkInitializationCallback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(initializationParams, "initializationParams");
        Intrinsics.checkNotNullParameter(networkConfigParams, "networkConfigParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.onSuccess();
    }
}
