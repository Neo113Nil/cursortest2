package com.ironsource.mediationsdk;

import com.ironsource.C4782n4;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.AdUnitAdapterInterface;
import com.ironsource.mediationsdk.sdk.BannerAdapterInterface;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class AbstractAdapter implements RewardedVideoAdapterInterface, InterstitialAdapterInterface, BannerAdapterInterface, NativeAdAdapterInterface, AdapterNetworkDataInterface {
    private static Boolean mAdapterDebug;
    private String mPluginType;
    private final String mProviderName;
    private String mProviderNetworkKey;
    private final Map<LevelPlay.AdFormat, AdUnitAdapterInterface> mAdUnitAdapters = new HashMap();
    protected LoadWhileShowSupportState mLWSSupportState = LoadWhileShowSupportState.NONE;
    protected LoadWhileShowSupportState mBannerLoadWhileShowSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;

    public AbstractAdapter(String str) {
        this.mProviderName = str;
    }

    private BannerAdapterInterface a() {
        return (BannerAdapterInterface) this.mAdUnitAdapters.get(LevelPlay.AdFormat.BANNER);
    }

    private InterstitialAdapterInterface b() {
        return (InterstitialAdapterInterface) this.mAdUnitAdapters.get(LevelPlay.AdFormat.INTERSTITIAL);
    }

    private NativeAdAdapterInterface c() {
        return (NativeAdAdapterInterface) this.mAdUnitAdapters.get(LevelPlay.AdFormat.NATIVE_AD);
    }

    private RewardedVideoAdapterInterface d() {
        return (RewardedVideoAdapterInterface) this.mAdUnitAdapters.get(LevelPlay.AdFormat.REWARDED);
    }

    public static void postBackgroundThread(Runnable runnable) {
        IronSourceThreadManager.INSTANCE.postAdapterBackgroundTask(runnable);
    }

    public static void postOnUIThread(Runnable runnable) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void collectBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2, @NotNull BiddingDataCallback biddingDataCallback) {
        BannerAdapterInterface a = a();
        if (a != null) {
            a.collectBannerBiddingData(jSONObject, jSONObject2, biddingDataCallback);
            return;
        }
        Map<String, Object> bannerBiddingData = getBannerBiddingData(jSONObject, jSONObject2);
        if (bannerBiddingData != null) {
            biddingDataCallback.onSuccess(bannerBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void collectInterstitialBiddingData(JSONObject jSONObject, JSONObject jSONObject2, @NotNull BiddingDataCallback biddingDataCallback) {
        InterstitialAdapterInterface b = b();
        if (b != null) {
            b.collectInterstitialBiddingData(jSONObject, jSONObject2, biddingDataCallback);
            return;
        }
        Map<String, Object> interstitialBiddingData = getInterstitialBiddingData(jSONObject, jSONObject2);
        if (interstitialBiddingData != null) {
            biddingDataCallback.onSuccess(interstitialBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void collectNativeAdBiddingData(@NotNull JSONObject jSONObject, JSONObject jSONObject2, @NotNull BiddingDataCallback biddingDataCallback) {
        NativeAdAdapterInterface c = c();
        if (c != null) {
            c.collectNativeAdBiddingData(jSONObject, jSONObject2, biddingDataCallback);
            return;
        }
        Map<String, Object> nativeAdBiddingData = getNativeAdBiddingData(jSONObject, jSONObject2);
        if (nativeAdBiddingData != null) {
            biddingDataCallback.onSuccess(nativeAdBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void collectRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2, @NotNull BiddingDataCallback biddingDataCallback) {
        RewardedVideoAdapterInterface d = d();
        if (d != null) {
            d.collectRewardedVideoBiddingData(jSONObject, jSONObject2, biddingDataCallback);
            return;
        }
        Map<String, Object> rewardedVideoBiddingData = getRewardedVideoBiddingData(jSONObject, jSONObject2);
        if (rewardedVideoBiddingData != null) {
            biddingDataCallback.onSuccess(rewardedVideoBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    public void destroyBanner(JSONObject jSONObject) {
        BannerAdapterInterface a = a();
        if (a != null) {
            a.destroyBanner(jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void destroyInterstitialAd(JSONObject jSONObject) {
        InterstitialAdapterInterface b = b();
        if (b != null) {
            b.destroyInterstitialAd(jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void destroyNativeAd(@NotNull JSONObject jSONObject) {
        NativeAdAdapterInterface c = c();
        if (c != null) {
            c.destroyNativeAd(jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void destroyRewardedVideoAd(JSONObject jSONObject) {
        RewardedVideoAdapterInterface d = d();
        if (d != null) {
            d.destroyRewardedVideoAd(jSONObject);
        }
    }

    public void earlyInit(String str, String str2, JSONObject jSONObject) {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public int getAdaptiveHeight(int i) {
        BannerAdapterInterface a = a();
        if (a != null) {
            return a.getAdaptiveHeight(i);
        }
        return -1;
    }

    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        BannerAdapterInterface a = a();
        if (a != null) {
            return a.getBannerBiddingData(jSONObject, jSONObject2);
        }
        return null;
    }

    public LoadWhileShowSupportState getBannerLoadWhileShowSupportState(JSONObject jSONObject) {
        return this.mBannerLoadWhileShowSupportState;
    }

    public abstract String getCoreSDKVersion();

    public String getDynamicUserId() {
        return p.h().g();
    }

    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        InterstitialAdapterInterface b = b();
        if (b != null) {
            return b.getInterstitialBiddingData(jSONObject, jSONObject2);
        }
        return null;
    }

    public LoadWhileShowSupportState getLoadWhileShowSupportState(JSONObject jSONObject) {
        return this.mLWSSupportState;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public Map<String, Object> getNativeAdBiddingData(@NotNull JSONObject jSONObject, JSONObject jSONObject2) {
        NativeAdAdapterInterface c = c();
        if (c != null) {
            return c.getNativeAdBiddingData(jSONObject, jSONObject2);
        }
        return null;
    }

    public String getPluginType() {
        return this.mPluginType;
    }

    public String getProviderName() {
        return this.mProviderName;
    }

    public String getProviderNetworkKey() {
        return this.mProviderNetworkKey;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        RewardedVideoAdapterInterface d = d();
        if (d != null) {
            return d.getRewardedVideoBiddingData(jSONObject, jSONObject2);
        }
        return null;
    }

    public abstract String getVersion();

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        try {
            RewardedVideoAdapterInterface d = d();
            if (d != null) {
                d.initAndLoadRewardedVideo(str, str2, jSONObject, jSONObject2, rewardedVideoSmashListener);
            } else if (rewardedVideoSmashListener != null) {
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            }
        } catch (Error e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        }
    }

    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        try {
            BannerAdapterInterface a = a();
            if (a != null) {
                a.initBannerForBidding(str, str2, jSONObject, bannerSmashListener);
            } else if (bannerSmashListener != null) {
                bannerSmashListener.onBannerInitFailed(new IronSourceError(510, "method not implemented"));
            }
        } catch (Error e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            StringBuilder sb = new StringBuilder();
            sb.append("error - ");
            sb.append(e.getMessage());
            bannerSmashListener.onBannerInitFailed(new IronSourceError(510, sb.toString()));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBanners(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        try {
            BannerAdapterInterface a = a();
            if (a != null) {
                a.initBanners(str, str2, jSONObject, bannerSmashListener);
            } else if (bannerSmashListener != null) {
                bannerSmashListener.onBannerInitFailed(new IronSourceError(510, "method not implemented"));
            }
        } catch (Error e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            StringBuilder sb = new StringBuilder();
            sb.append("error - ");
            sb.append(e.getMessage());
            bannerSmashListener.onBannerInitFailed(new IronSourceError(510, sb.toString()));
        }
    }

    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        try {
            InterstitialAdapterInterface b = b();
            if (b != null) {
                b.initInterstitial(str, str2, jSONObject, interstitialSmashListener);
            } else if (interstitialSmashListener != null) {
                interstitialSmashListener.onInterstitialInitFailed(new IronSourceError(510, "method not implemented"));
            }
        } catch (Error e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            StringBuilder sb = new StringBuilder();
            sb.append("error - ");
            sb.append(e.getMessage());
            interstitialSmashListener.onInterstitialInitFailed(new IronSourceError(510, sb.toString()));
        }
    }

    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        try {
            InterstitialAdapterInterface b = b();
            if (b != null) {
                b.initInterstitialForBidding(str, str2, jSONObject, interstitialSmashListener);
            } else if (interstitialSmashListener != null) {
                interstitialSmashListener.onInterstitialInitFailed(new IronSourceError(510, "method not implemented"));
            }
        } catch (Error e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            StringBuilder sb = new StringBuilder();
            sb.append("error - ");
            sb.append(e.getMessage());
            interstitialSmashListener.onInterstitialInitFailed(new IronSourceError(510, sb.toString()));
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAdForBidding(String str, String str2, @NotNull JSONObject jSONObject, @NotNull NativeAdSmashListener nativeAdSmashListener) {
        NativeAdAdapterInterface c = c();
        if (c != null) {
            c.initNativeAdForBidding(str, str2, jSONObject, nativeAdSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAds(String str, String str2, @NotNull JSONObject jSONObject, @NotNull NativeAdSmashListener nativeAdSmashListener) {
        NativeAdAdapterInterface c = c();
        if (c != null) {
            c.initNativeAds(str, str2, jSONObject, nativeAdSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoForDemandOnly(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        RewardedVideoAdapterInterface d = d();
        if (d != null) {
            d.initRewardedVideoForDemandOnly(str, str2, jSONObject, rewardedVideoSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        try {
            RewardedVideoAdapterInterface d = d();
            if (d != null) {
                d.initRewardedVideoWithCallback(str, str2, jSONObject, rewardedVideoSmashListener);
            } else if (rewardedVideoSmashListener != null) {
                rewardedVideoSmashListener.onRewardedVideoInitFailed(new IronSourceError(510, "method not implemented"));
            }
        } catch (Error e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            StringBuilder sb = new StringBuilder();
            sb.append("error - ");
            sb.append(e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoInitFailed(new IronSourceError(510, sb.toString()));
        }
    }

    protected boolean isAdaptersDebugEnabled() {
        Boolean bool = mAdapterDebug;
        return bool != null && bool.booleanValue();
    }

    public boolean isInterstitialReady(JSONObject jSONObject) {
        InterstitialAdapterInterface b = b();
        if (b != null) {
            return b.isInterstitialReady(jSONObject);
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        RewardedVideoAdapterInterface d = d();
        if (d != null) {
            return d.isRewardedVideoAvailable(jSONObject);
        }
        return false;
    }

    public boolean isUsingActivityBeforeImpression(@NotNull LevelPlay.AdFormat adFormat) {
        return true;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBanner(JSONObject jSONObject, JSONObject jSONObject2, ISBannerSize iSBannerSize, BannerSmashListener bannerSmashListener) {
        BannerAdapterInterface a = a();
        if (a != null) {
            a.loadBanner(jSONObject, jSONObject2, iSBannerSize, bannerSmashListener);
        }
    }

    public void loadBannerForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, ISBannerSize iSBannerSize, BannerSmashListener bannerSmashListener) {
        BannerAdapterInterface a = a();
        if (a != null) {
            a.loadBannerForBidding(jSONObject, jSONObject2, str, iSBannerSize, bannerSmashListener);
        }
    }

    public void loadBannerForDemandOnlyForBidding(JSONObject jSONObject, String str, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, BannerSmashListener bannerSmashListener) {
        BannerAdapterInterface a = a();
        if (a != null) {
            a.loadBannerForDemandOnlyForBidding(jSONObject, str, iSDemandOnlyBannerLayout, bannerSmashListener);
        }
    }

    public void loadInterstitial(JSONObject jSONObject, JSONObject jSONObject2, InterstitialSmashListener interstitialSmashListener) {
        InterstitialAdapterInterface b = b();
        if (b != null) {
            b.loadInterstitial(jSONObject, jSONObject2, interstitialSmashListener);
        }
    }

    public void loadInterstitialForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, InterstitialSmashListener interstitialSmashListener) {
        InterstitialAdapterInterface b = b();
        if (b != null) {
            b.loadInterstitialForBidding(jSONObject, jSONObject2, str, interstitialSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAd(@NotNull JSONObject jSONObject, JSONObject jSONObject2, @NotNull NativeAdSmashListener nativeAdSmashListener) {
        NativeAdAdapterInterface c = c();
        if (c != null) {
            c.loadNativeAd(jSONObject, jSONObject2, nativeAdSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAdForBidding(@NotNull JSONObject jSONObject, JSONObject jSONObject2, String str, @NotNull NativeAdSmashListener nativeAdSmashListener) {
        NativeAdAdapterInterface c = c();
        if (c != null) {
            c.loadNativeAdForBidding(jSONObject, jSONObject2, str, nativeAdSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        RewardedVideoAdapterInterface d = d();
        if (d != null) {
            d.loadRewardedVideo(jSONObject, jSONObject2, rewardedVideoSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        RewardedVideoAdapterInterface d = d();
        if (d != null) {
            d.loadRewardedVideoForBidding(jSONObject, jSONObject2, str, rewardedVideoSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewBound(@NotNull JSONObject jSONObject) {
        BannerAdapterInterface a = a();
        if (a != null) {
            a.onBannerViewBound(jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewWillBind(@NotNull JSONObject jSONObject) {
        BannerAdapterInterface a = a();
        if (a != null) {
            a.onBannerViewWillBind(jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(String str) {
        Iterator<AdUnitAdapterInterface> it = this.mAdUnitAdapters.values().iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackFailed(str);
        }
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        Iterator<AdUnitAdapterInterface> it = this.mAdUnitAdapters.values().iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackSuccess();
        }
    }

    protected void setAdapterDebug(Boolean bool) {
        mAdapterDebug = bool;
    }

    protected void setBannerAdapter(BannerAdapterInterface bannerAdapterInterface) {
        this.mAdUnitAdapters.put(LevelPlay.AdFormat.BANNER, bannerAdapterInterface);
    }

    protected void setConsent(boolean z) {
    }

    protected void setInterstitialAdapter(InterstitialAdapterInterface interstitialAdapterInterface) {
        this.mAdUnitAdapters.put(LevelPlay.AdFormat.INTERSTITIAL, interstitialAdapterInterface);
    }

    protected void setMetaData(String str, List<String> list) {
    }

    protected void setNativeAdAdapter(NativeAdAdapterInterface nativeAdAdapterInterface) {
        this.mAdUnitAdapters.put(LevelPlay.AdFormat.NATIVE_AD, nativeAdAdapterInterface);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface
    public void setNetworkData(@NotNull AdapterNetworkData adapterNetworkData) {
        IronLog.INTERNAL.verbose("setNetworkData not implemented | adapter=" + getClass().getSimpleName() + ", networkData=" + adapterNetworkData);
    }

    public void setNewConsent(boolean z) {
        setConsent(z);
    }

    public void setPluginData(String str) {
        this.mPluginType = str;
    }

    public void setProviderNetworkKey(String str) {
        this.mProviderNetworkKey = str;
    }

    protected void setRewardedVideoAdapter(RewardedVideoAdapterInterface rewardedVideoAdapterInterface) {
        this.mAdUnitAdapters.put(LevelPlay.AdFormat.REWARDED, rewardedVideoAdapterInterface);
    }

    public void setTestMode(boolean z) {
    }

    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        InterstitialAdapterInterface b = b();
        if (b != null) {
            b.showInterstitial(jSONObject, interstitialSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        RewardedVideoAdapterInterface d = d();
        if (d != null) {
            d.showRewardedVideo(jSONObject, rewardedVideoSmashListener);
        }
    }
}
