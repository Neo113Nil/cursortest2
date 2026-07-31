package com.smaato.sdk.nativead;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.lifecycle.Lifecycle;
import com.smaato.sdk.core.lifecycle.Lifecycling;
import com.smaato.sdk.core.ub.SmaatoUBCache;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.iahb.SmaatoSdkInAppBidding;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.request.NextGenNativeAdRequest;

/* loaded from: classes9.dex */
public class NativeAd {
    private final NativeAdRequest nativeAdRequest;

    public interface Listener {
        void onAdClicked(NativeAd nativeAd);

        void onAdFailedToLoad(NativeAd nativeAd, NativeAdError nativeAdError);

        void onAdImpressed(NativeAd nativeAd);

        void onAdLoaded(NativeAd nativeAd, NativeAdRenderer nativeAdRenderer);

        void onTtlExpired(NativeAd nativeAd);
    }

    public NativeAd(NativeAdRequest nativeAdRequest) {
        this.nativeAdRequest = nativeAdRequest;
    }

    public NativeAdRequest request() {
        return this.nativeAdRequest;
    }

    public static void loadAd(LifecycleOwner lifecycleOwner, NativeAdRequest nativeAdRequest, Listener listener) {
        loadAd(Lifecycling.wrap(lifecycleOwner), nativeAdRequest, listener);
    }

    public static void loadAd(View view, NativeAdRequest nativeAdRequest, Listener listener) {
        loadAd(Lifecycling.of(view), nativeAdRequest, listener);
    }

    public static void loadAd(final Lifecycle lifecycle, final NativeAdRequest nativeAdRequest, final Listener listener) {
        if (!SmaatoSdk.isSmaatoSdkInitialised()) {
            if (listener != null) {
                listener.onAdFailedToLoad(new NativeAd(nativeAdRequest), NativeAdError.SDK_INITIALISATION_ERROR);
                return;
            }
            return;
        }
        final NativeAd nativeAd = new NativeAd(nativeAdRequest);
        NextGenNativeAdRequest nextGenNativeAdRequest = new NextGenNativeAdRequest();
        nextGenNativeAdRequest.setPreLoadMediaAssets(true);
        if (!TextUtils.isEmpty(nativeAdRequest.mediationNetworkName())) {
            nextGenNativeAdRequest.setMediationVendor(nativeAdRequest.mediationNetworkName());
            nextGenNativeAdRequest.setMediation(true);
        }
        if (!TextUtils.isEmpty(nativeAdRequest.uniqueUBId())) {
            String uniqueUBId = nativeAdRequest.uniqueUBId();
            String bid = SmaatoSdkInAppBidding.getBid(uniqueUBId);
            Ad ad = SmaatoUBCache.getAd(uniqueUBId);
            NextGenNativeAdRequest.RequestListener requestListener = new NextGenNativeAdRequest.RequestListener() { // from class: com.smaato.sdk.nativead.NativeAd.1
                @Override // com.smaato.sdk.ng.request.NextGenNativeAdRequest.RequestListener
                public void onRequestSuccess(com.smaato.sdk.ng.models.NativeAd nativeAd2) {
                    Listener listener2 = Listener.this;
                    if (listener2 != null) {
                        NativeAd nativeAd3 = nativeAd;
                        listener2.onAdLoaded(nativeAd3, new NativeAdRendererImpl(lifecycle, nativeAd2, nativeAd3, nativeAdRequest.shouldReturnUrlsForImageAssets(), Listener.this));
                    }
                }

                @Override // com.smaato.sdk.ng.request.NextGenNativeAdRequest.RequestListener
                public void onRequestFail(Throwable th) {
                    if (Listener.this != null) {
                        Listener.this.onAdFailedToLoad(new NativeAd(nativeAdRequest), ErrorMapper.mapNativeError(th));
                    }
                }
            };
            if (!android.text.TextUtils.isEmpty(bid)) {
                nextGenNativeAdRequest.prepareAd(bid, requestListener);
                return;
            } else if (ad != null) {
                nextGenNativeAdRequest.prepareAd(ad, requestListener);
                return;
            } else {
                if (listener != null) {
                    listener.onAdFailedToLoad(nativeAd, NativeAdError.INVALID_REQUEST);
                    return;
                }
                return;
            }
        }
        nextGenNativeAdRequest.load(nativeAdRequest.adSpaceId(), new NextGenNativeAdRequest.RequestListener() { // from class: com.smaato.sdk.nativead.NativeAd.2
            @Override // com.smaato.sdk.ng.request.NextGenNativeAdRequest.RequestListener
            public void onRequestSuccess(com.smaato.sdk.ng.models.NativeAd nativeAd2) {
                Listener listener2 = Listener.this;
                if (listener2 != null) {
                    NativeAd nativeAd3 = nativeAd;
                    listener2.onAdLoaded(nativeAd3, new NativeAdRendererImpl(lifecycle, nativeAd2, nativeAd3, nativeAdRequest.shouldReturnUrlsForImageAssets(), Listener.this));
                }
            }

            @Override // com.smaato.sdk.ng.request.NextGenNativeAdRequest.RequestListener
            public void onRequestFail(Throwable th) {
                if (Listener.this != null) {
                    Listener.this.onAdFailedToLoad(new NativeAd(nativeAdRequest), ErrorMapper.mapNativeError(th));
                }
            }
        });
    }
}
