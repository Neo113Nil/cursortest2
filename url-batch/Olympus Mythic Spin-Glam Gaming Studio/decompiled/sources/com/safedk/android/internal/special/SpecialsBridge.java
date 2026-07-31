package com.safedk.android.internal.special;

import android.view.View;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mobilefuse.videoplayer.VideoPlayer;
import com.mobilefuse.videoplayer.model.VideoSource;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.k;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;

/* loaded from: classes7.dex */
public class SpecialsBridge {
    public static void appLovinAdViewRenderAd(AppLovinAdView targetInstance, AppLovinAd appLovinAd) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->appLovinAdViewRenderAd(Lcom/applovin/adview/AppLovinAdView;Lcom/applovin/sdk/AppLovinAd;)V");
        if (SafeDK.ad()) {
            Logger.d("SafeDK-Special", "appLovinAdViewRenderAd started, ad: ", appLovinAd);
            try {
                if (AppLovinAdSize.INTERSTITIAL.equals(appLovinAd.getSize())) {
                    String clCode = ((AppLovinAdBase) appLovinAd).getClCode();
                    BrandSafetyEvent.AdFormatType adFormatType = BrandSafetyEvent.AdFormatType.INTER;
                    Logger.d("SafeDK-Special", "appLovinAdViewRenderAd clcode:", clCode, " ad: ", appLovinAd, " formatType: ", adFormatType);
                    CreativeInfoManager.a(h.a, "clcode=" + clCode + X3.j.c, adFormatType, targetInstance);
                }
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "appLovinAdViewRenderAd failed");
            }
        }
        targetInstance.renderAd(appLovinAd);
    }

    public static void maxAdViewDestroy(MaxAdView targetInstance) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->maxAdViewDestroy(Lcom/applovin/mediation/ads/MaxAdView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("SafeDK-Special", "maxAdViewDestroy started ", ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(targetInstance);
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "maxAdViewDestroy failed");
            }
        }
        targetInstance.destroy();
    }

    public static void maxNativeAdListenerOnNativeAdLoaded(MaxNativeAdListener targetInstance, MaxNativeAdView nativeAdView, MaxAd ad) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->maxNativeAdListenerOnNativeAdLoaded(Lcom/applovin/mediation/nativeAds/MaxNativeAdListener;Lcom/applovin/mediation/nativeAds/MaxNativeAdView;Lcom/applovin/mediation/MaxAd;)V");
        targetInstance.onNativeAdLoaded(nativeAdView, ad);
        if (SafeDK.ad()) {
            try {
                Logger.d("SafeDK-Special", "maxNativeAdListenerOnNativeAdLoaded started, nativeAdView: ", nativeAdView, ", ad: ", ad, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.onMaxNativeAdLoaded(nativeAdView, ad);
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "maxNativeAdListenerOnNativeAdLoaded failed", th);
            }
        }
    }

    public static void appLovinAdViewEventListenerAdOpenedFullscreen(AppLovinAdViewEventListener targetInstance, AppLovinAd ad, AppLovinAdView adView) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->appLovinAdViewEventListenerAdOpenedFullscreen(Lcom/applovin/adview/AppLovinAdViewEventListener;Lcom/applovin/sdk/AppLovinAd;Lcom/applovin/adview/AppLovinAdView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("SafeDK-Special", "appLovinAdViewEventListenerAdOpenedFullscreen started, ad: ", ad, ", adView: ", adView, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                BrandSafetyUtils.a(h.a, (String) null, (String) null, RedirectEvent.i);
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "appLovinAdViewEventListenerAdOpenedFullscreen failed", th);
            }
        }
        targetInstance.adOpenedFullscreen(ad, adView);
    }

    public static void appLovinMaxAdViewAdListenerOnAdExpanded(MaxAdViewAdListener targetInstance, MaxAd ad) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->appLovinMaxAdViewAdListenerOnAdExpanded(Lcom/applovin/mediation/MaxAdViewAdListener;Lcom/applovin/mediation/MaxAd;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("SafeDK-Special", "appLovinMaxAdViewAdListenerOnAdExpanded started, ad: ", ad, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                BrandSafetyUtils.f();
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "appLovinMaxAdViewAdListenerOnAdExpanded failed", th);
            }
        }
        targetInstance.onAdExpanded(ad);
    }

    public static void MBridgeVideoView_videoOperate(MBridgeVideoView targetHandler, int var) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->MBridgeVideoView_videoOperate(Lcom/mbridge/msdk/video/module/MBridgeVideoView;I)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("SafeDK-Special", "MBridgeVideoView_videoOperate ", targetHandler, ", var = ", Integer.valueOf(var), ", isOnUiThread = ", Boolean.valueOf(n.c()));
                String a = BrandSafetyUtils.a(targetHandler);
                if (var == 1) {
                    CampaignEx campaign = targetHandler.getCampaign();
                    Logger.d("SafeDK-Special", "MBridgeVideoView_videoOperate ", targetHandler, ", request id ", campaign.getImpressionURL());
                    CreativeInfoManager.a(h.o, k.C(campaign.getImpressionURL()), BrandSafetyEvent.AdFormatType.INTER, targetHandler);
                } else if (var == 3) {
                    CreativeInfoManager.a(h.o, a, true, "video-view");
                }
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "MBridgeVideoView_videoOperate error ", th.getMessage());
            }
        }
        targetHandler.videoOperate(var);
    }

    public static void MintegralContainerView_showPlayableView(MBridgeContainerView targetHandler) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->MintegralContainerView_showPlayableView(Lcom/mbridge/msdk/video/module/MBridgeContainerView;)V");
        targetHandler.showPlayableView();
        if (SafeDK.ad()) {
            try {
                CampaignEx campaign = targetHandler.getCampaign();
                Logger.d("SafeDK-Special", "MBridgeContainerView_showPlayableView ", targetHandler, ", request id ", campaign.getImpressionURL());
                CreativeInfoManager.a(h.o, k.C(campaign.getImpressionURL()), BrandSafetyEvent.AdFormatType.INTER, targetHandler);
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "MBridgeContainerView_showPlayableView error ", th.getMessage());
            }
        }
    }

    public static void MBridgeVideoView_showAlertView(MBridgeVideoView targetHandler) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->MBridgeVideoView_showAlertView(Lcom/mbridge/msdk/video/module/MBridgeVideoView;)V");
        if (SafeDK.ad()) {
            try {
                String a = BrandSafetyUtils.a(targetHandler);
                Logger.d("SafeDK-Special", Logger.FeatureTag.AD_CAPTURE, "MBridgeVideoView_showAlertView ", targetHandler, ", address=", a, ", isOnUiThread=", Boolean.valueOf(n.c()));
                b.a(a, m.q, new m.a[0]);
                CreativeInfoManager.b(h.o, a);
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "MBridgeVideoView_showAlertView error ", th.getMessage());
            }
        }
        targetHandler.showAlertView();
    }

    public static void fyberOnImpression(OnGlobalImpressionDataListener targetInstance, String spotId, String creativeId, ImpressionData impressionData) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->fyberOnImpression(Lcom/fyber/inneractive/sdk/external/OnGlobalImpressionDataListener;Ljava/lang/String;Ljava/lang/String;Lcom/fyber/inneractive/sdk/external/ImpressionData;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("SafeDK-Special", "fyberOnImpression started, spotId=", spotId, ", creativeId=", creativeId, ", impressionData = ", impressionData.toString(), ", isOnUiThread=", Boolean.valueOf(n.c()));
                CreativeInfoManager.b(h.p, impressionData, (Object) null);
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "Error in fyberOnImpression", th);
            }
        }
        targetInstance.onImpression(spotId, creativeId, impressionData);
    }

    public static void fyberOnAdExpanded(InneractiveAdViewEventsListener targetInstance, InneractiveAdSpot adSpot) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->fyberOnAdExpanded(Lcom/fyber/inneractive/sdk/external/InneractiveAdViewEventsListener;Lcom/fyber/inneractive/sdk/external/InneractiveAdSpot;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("SafeDK-Special", "fyberOnAdExpanded started", ", isOnUiThread = ", Boolean.valueOf(n.c()));
                BrandSafetyUtils.a(h.p, (String) null, (String) null, RedirectEvent.i);
            } catch (Throwable th) {
                Logger.d("SafeDK-Special", "Error in fyberOnAdExpanded", th);
            }
        }
        targetInstance.onAdExpanded(adSpot);
    }

    public static void inmobiOnInterstitialAdDisplayed(InterstitialAdEventListener targetInstance, InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->inmobiOnInterstitialAdDisplayed(Lcom/inmobi/ads/listeners/InterstitialAdEventListener;Lcom/inmobi/ads/InMobiInterstitial;Lcom/inmobi/ads/AdMetaInfo;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("SafeDK-Special", "inmobiOnInterstitialAdDisplayed triggered ", ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.b(h.i, adMetaInfo.getCreativeID(), (Object) null);
            } catch (Throwable th) {
                Logger.e("SafeDK-Special", "Exception in inmobiOnInterstitialAdDisplayed", th);
            }
        }
        targetInstance.onAdDisplayed(inMobiInterstitial, adMetaInfo);
    }

    public static String mobileFuseVideoSourceGetLocalFileCacheKey(VideoSource targetInstance) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->mobileFuseVideoSourceGetLocalFileCacheKey(Lcom/mobilefuse/videoplayer/model/VideoSource;)Ljava/lang/String;");
        String localFileCacheKey = targetInstance.getLocalFileCacheKey();
        try {
            if (SafeDK.ad()) {
                Logger.d("SafeDK-Special", "mobileFuseVideoSourceGetLocalFileCacheKey triggered, localFileCacheKey = ", localFileCacheKey, ", url = ", targetInstance.getRemoteUrl());
                CreativeInfoManager.a(h.E, localFileCacheKey, targetInstance.getRemoteUrl());
            }
        } catch (Throwable th) {
            Logger.e("SafeDK-Special", "mobileFuseVideoSourceGetLocalFileCacheKey exception", th);
        }
        return localFileCacheKey;
    }

    public static void mobileFuseVideoPlayerLoadVast(VideoPlayer targetInstance, String xml, VideoPlayer.LoadListener loadListener) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->mobileFuseVideoPlayerLoadVast(Lcom/mobilefuse/videoplayer/VideoPlayer;Ljava/lang/String;Lcom/mobilefuse/videoplayer/VideoPlayer$LoadListener;)V");
        try {
            if (SafeDK.ad()) {
                Logger.printFullVerboseLog("SafeDK-Special", "mobileFuseVideoPlayerLoadVast triggered, xml = ", xml);
            }
        } catch (Throwable th) {
            Logger.e("SafeDK-Special", "mobileFuseVideoPlayerLoadVast exception", th);
        }
        targetInstance.loadVast(xml, loadListener);
    }

    public static void yandexViewSetTag(View targetInstance, int key, Object o) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->yandexViewSetTag(Landroid/view/View;ILjava/lang/Object;)V");
        try {
            if (SafeDK.ad()) {
                Logger.printFullVerboseLog("SafeDK-Special", "mobileFuseVideoPlayerLoadVast triggered, key = ", Integer.valueOf(key), ", Object = ", o);
            }
        } catch (Throwable th) {
            Logger.e("SafeDK-Special", "mobileFuseVideoPlayerLoadVast exception", th);
        }
        targetInstance.setTag(key, o);
    }
}
