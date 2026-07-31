package com.pubmatic.sdk.openwrap.core;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.common.POBAdType;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.network.POBTrackerHandler;
import com.pubmatic.sdk.common.ui.POBBannerRendering;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.viewability.POBHTMLMeasurementProvider;
import com.pubmatic.sdk.common.viewability.POBVideoMeasurementProvider;
import com.pubmatic.sdk.openwrap.core.banner.POBBannerRenderer;
import com.pubmatic.sdk.openwrap.core.interstitial.POBInterstitialRenderer;
import com.pubmatic.sdk.video.POBVastPlayerConfig;
import com.pubmatic.sdk.video.player.POBVastPlayer;
import com.pubmatic.sdk.video.renderer.POBVideoRenderer;
import com.pubmatic.sdk.video.renderer.POBVideoRendering;
import com.pubmatic.sdk.webrendering.mraid.POBMraidRenderer;
import com.pubmatic.sdk.webrendering.ui.POBViewabilityTracker;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class POBRenderer {

    class a implements POBBannerRenderer.RendererBuilder {
        final /* synthetic */ Context a;
        final /* synthetic */ int b;

        a(Context context, int i) {
            this.a = context;
            this.b = i;
        }

        @Override // com.pubmatic.sdk.openwrap.core.banner.POBBannerRenderer.RendererBuilder
        public POBBannerRendering build(POBAdDescriptor pOBAdDescriptor, int i) {
            if (pOBAdDescriptor.isVideo()) {
                return POBRenderer.videoRenderer(this.a, pOBAdDescriptor, this.b, POBAdFormat.BANNER);
            }
            return POBRenderer.bannerRenderer(this.a, POBCommonConstants.BANNER_PLACEMENT_TYPE, Math.max(pOBAdDescriptor.getRefreshInterval(), 15), i);
        }
    }

    class b implements POBInterstitialRenderer.RendererBuilder {
        final /* synthetic */ Context a;
        final /* synthetic */ POBBid b;

        b(Context context, POBBid pOBBid) {
            this.a = context;
            this.b = pOBBid;
        }

        @Override // com.pubmatic.sdk.openwrap.core.interstitial.POBInterstitialRenderer.RendererBuilder
        public POBBannerRendering build(POBAdDescriptor pOBAdDescriptor, int i) {
            return pOBAdDescriptor.isVideo() ? POBRenderer.videoRenderer(this.a, pOBAdDescriptor, this.b.getRemainingExpirationTime(), POBAdFormat.INTERSTITIAL) : POBRenderer.bannerRenderer(this.a, "interstitial", 15, i);
        }
    }

    class c extends POBVideoRenderer {
        final /* synthetic */ POBLandingPageCallback n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(POBVastPlayer pOBVastPlayer, POBViewabilityTracker pOBViewabilityTracker, String str, POBTrackerHandler pOBTrackerHandler, POBLandingPageCallback pOBLandingPageCallback) {
            super(pOBVastPlayer, pOBViewabilityTracker, str, pOBTrackerHandler);
            this.n = pOBLandingPageCallback;
        }

        @Override // com.pubmatic.sdk.video.renderer.POBVideoRenderer, com.pubmatic.sdk.video.player.POBVastPlayerListener
        public void onOpenLandingPage(String str) {
            POBLandingPageCallback pOBLandingPageCallback = this.n;
            if (pOBLandingPageCallback == null) {
                super.onOpenLandingPage(str);
            } else {
                pOBLandingPageCallback.onLandingPageOpened(str);
            }
        }
    }

    private static POBVastPlayerConfig a(POBAdDescriptor pOBAdDescriptor, POBAdType pOBAdType) {
        POBVastPlayerConfig createVastConfig = POBVastPlayerConfig.ConfigBuilder.createVastConfig(pOBAdDescriptor.getRawBid(), pOBAdType);
        if (pOBAdType.isNative()) {
            createVastConfig.setVastPlayerUIConfig(new POBVastPlayerConfig.POBVastPlayerUIConfig.Builder().showProgressBar(false).showMuteButton(true).showAdInfoButton(false).showIndustryIcon(false).setMuteButtonLayout(com.pubmatic.sdk.video.R.layout.pob_video_mute_button_compact).build());
        }
        return createVastConfig;
    }

    private static boolean b(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.optInt("fsc") == 1;
    }

    @Nullable
    public static POBBannerRendering bannerRenderer(@NonNull Context context, @NonNull String str, int i, int i2) {
        POBMraidRenderer createInstance = POBMraidRenderer.createInstance(context.getApplicationContext(), str, i2);
        if (createInstance != null) {
            createInstance.setTrackerHandler(POBInstanceProvider.getTrackerHandler(POBInstanceProvider.getNetworkHandlerWithBackgroundThreadDelivery()));
            createInstance.setRenderingTimeout(i);
            createInstance.setBaseURL("https://ow.pubmatic.com/openrtb/2.5");
            POBHTMLMeasurementProvider pOBHTMLMeasurementProvider = (POBHTMLMeasurementProvider) POBInstanceProvider.getSdkConfig().getMeasurementProvider(POBCommonConstants.HTML_MEASUREMENT_PROVIDER_CLASS);
            if (pOBHTMLMeasurementProvider != null) {
                createInstance.setHTMLMeasurementListener(pOBHTMLMeasurementProvider);
            }
        }
        return createInstance;
    }

    @NonNull
    public static POBBannerRendering getBannerRenderer(@NonNull Context context, int i) {
        return new POBBannerRenderer(new a(context, i));
    }

    @NonNull
    public static POBInterstitialRenderer getInterstitialRenderer(@NonNull Context context, @NonNull POBBid pOBBid) {
        POBInterstitialRenderer pOBInterstitialRenderer = new POBInterstitialRenderer(context.getApplicationContext(), new b(context, pOBBid));
        if (!pOBBid.isVideo()) {
            pOBInterstitialRenderer.setTrackerHandler(POBInstanceProvider.getTrackerHandler(POBInstanceProvider.getNetworkHandlerWithBackgroundThreadDelivery()));
        }
        return pOBInterstitialRenderer;
    }

    @NonNull
    public static POBVideoRendering videoRenderer(@NonNull Context context, @NonNull POBAdDescriptor pOBAdDescriptor, int i, @NonNull POBAdFormat pOBAdFormat) {
        return videoRenderer(context, pOBAdDescriptor, i, pOBAdFormat, null);
    }

    @NonNull
    public static POBVideoRendering videoRenderer(@NonNull Context context, @NonNull POBAdDescriptor pOBAdDescriptor, int i, @NonNull POBAdFormat pOBAdFormat, @Nullable POBLandingPageCallback pOBLandingPageCallback) {
        POBAdType fromAdFormat = POBAdType.fromAdFormat(pOBAdFormat);
        POBVastPlayer a2 = a(context, pOBAdDescriptor, fromAdFormat, a(pOBAdDescriptor, fromAdFormat));
        return a(context, pOBAdDescriptor, i, fromAdFormat, a2, a(a2, fromAdFormat), pOBLandingPageCallback);
    }

    private static POBVastPlayer a(Context context, POBAdDescriptor pOBAdDescriptor, POBAdType pOBAdType, POBVastPlayerConfig pOBVastPlayerConfig) {
        String str;
        POBVastPlayer createInstance = POBVastPlayer.createInstance(context, pOBVastPlayerConfig);
        createInstance.setDeviceInfo(POBInstanceProvider.getDeviceInfo(context.getApplicationContext()));
        createInstance.setMaxWrapperThreshold(3);
        createInstance.setLinearity(POBVastPlayer.Linearity.LINEAR);
        createInstance.setBidBundleId(pOBAdDescriptor.getBundle());
        createInstance.setAdomains(pOBAdDescriptor.getAdomains());
        if (!pOBAdType.isNative()) {
            createInstance.setCTAOverlayData(pOBAdDescriptor.getCTAOverlayData());
        }
        if (pOBAdType.isFullScreen()) {
            str = "interstitial";
        } else {
            str = POBCommonConstants.BANNER_PLACEMENT_TYPE;
        }
        createInstance.setPlacementType(str);
        if (pOBAdType.isAppOpen()) {
            a(createInstance);
            return createInstance;
        }
        a(createInstance, pOBAdDescriptor, pOBAdType);
        return createInstance;
    }

    private static void a(POBVastPlayer pOBVastPlayer) {
        pOBVastPlayer.setSkipabilityEnabled(false);
        pOBVastPlayer.setShowEndCardOnSkip(false);
        pOBVastPlayer.setFSCEnabled(true);
        pOBVastPlayer.setEnableLearnMoreButton(false);
        pOBVastPlayer.setEndCardSelectionType(POBVastPlayer.EndCardSelectionType.NEAREST_END_CARD);
    }

    private static void a(POBVastPlayer pOBVastPlayer, POBAdDescriptor pOBAdDescriptor, POBAdType pOBAdType) {
        pOBVastPlayer.setSkipabilityEnabled(pOBAdType.isFullScreen());
        boolean z = false;
        pOBVastPlayer.setShowEndCardOnSkip(!pOBAdType.isRewarded() && pOBAdType.isFullScreen());
        if (pOBAdType.isFullScreen()) {
            pOBVastPlayer.setEndCardSelectionType(POBVastPlayer.EndCardSelectionType.DUAL_END_CARD);
        } else {
            pOBVastPlayer.setEndCardSelectionType(POBVastPlayer.EndCardSelectionType.NEAREST_END_CARD);
        }
        boolean b2 = b(pOBAdDescriptor.getExtension());
        pOBVastPlayer.setFSCEnabled(!pOBAdType.isFullScreen() || b2);
        pOBVastPlayer.setACTEnabled(a(pOBAdDescriptor.getExtension()) && pOBAdType.isFullScreen() && !pOBAdType.isAppOpen());
        pOBVastPlayer.setEndCardEnabled(!pOBAdType.isNative());
        if (!pOBAdType.isNative() && (!pOBAdType.isFullScreen() || !b2)) {
            z = true;
        }
        pOBVastPlayer.setEnableLearnMoreButton(z);
    }

    private static POBViewabilityTracker a(POBVastPlayer pOBVastPlayer, POBAdType pOBAdType) {
        if (pOBAdType.isFullScreen()) {
            return new POBViewabilityTracker(pOBVastPlayer);
        }
        POBViewabilityTracker pOBViewabilityTracker = new POBViewabilityTracker((View) pOBVastPlayer, 50.0f);
        pOBViewabilityTracker.setAllowViewTreeObserverRegistration(true);
        return pOBViewabilityTracker;
    }

    private static POBVideoRenderer a(Context context, POBAdDescriptor pOBAdDescriptor, int i, POBAdType pOBAdType, POBVastPlayer pOBVastPlayer, POBViewabilityTracker pOBViewabilityTracker, POBLandingPageCallback pOBLandingPageCallback) {
        String str;
        POBAdSize pOBAdSize;
        if (pOBAdType.isFullScreen()) {
            str = "interstitial";
        } else {
            str = POBCommonConstants.BANNER_PLACEMENT_TYPE;
        }
        c cVar = new c(pOBVastPlayer, pOBViewabilityTracker, str, new POBTrackerHandler(POBInstanceProvider.getNetworkHandlerWithBackgroundThreadDelivery()), pOBLandingPageCallback);
        cVar.setMeasurementProvider((POBVideoMeasurementProvider) POBInstanceProvider.getSdkConfig().getMeasurementProvider(POBCommonConstants.VIDEO_MEASUREMENT_PROVIDER_CLASS));
        if (pOBAdType.isFullScreen()) {
            pOBAdSize = POBUtils.getInterstitialAdSize(context);
            cVar.setExpirationTimeout(i);
        } else {
            pOBAdSize = new POBAdSize(pOBAdDescriptor.getContentWidth(), pOBAdDescriptor.getContentHeight());
        }
        pOBVastPlayer.setEndCardSize(pOBAdSize);
        return cVar;
    }

    private static boolean a(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.optInt(POBConstants.KEY_ACT) == 1;
    }
}
