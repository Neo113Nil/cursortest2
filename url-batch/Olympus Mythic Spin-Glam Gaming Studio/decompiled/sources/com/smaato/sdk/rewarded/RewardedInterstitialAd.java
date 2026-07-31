package com.smaato.sdk.rewarded;

import android.text.TextUtils;
import com.smaato.sdk.core.ad.AdRequestParams;
import com.smaato.sdk.core.ub.SmaatoUBCache;
import com.smaato.sdk.iahb.SmaatoSdkInAppBidding;
import com.smaato.sdk.interstitial.InterstitialAdBase;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.rewarded.NextGenRewardedAd;

/* loaded from: classes5.dex */
public class RewardedInterstitialAd extends InterstitialAdBase implements NextGenRewardedAd.Listener {
    private final AdRequestParams mAdRequestParams;
    private final String mAdSpaceId;
    private final EventListener mEventListener;
    private NextGenRewardedAd mRewardedAd;

    public RewardedInterstitialAd(String str, AdRequestParams adRequestParams, EventListener eventListener) {
        this.mAdRequestParams = adRequestParams;
        this.mEventListener = eventListener;
        this.mAdSpaceId = str;
        if (!NextGen.isInitialized() || NextGen.getDeviceInfo().getContext() == null) {
            return;
        }
        this.mRewardedAd = new NextGenRewardedAd(NextGen.getDeviceInfo().getContext(), str, this);
    }

    public void loadAd() {
        if (this.mRewardedAd != null) {
            AdRequestParams adRequestParams = this.mAdRequestParams;
            if (adRequestParams != null && !TextUtils.isEmpty(adRequestParams.getUBUniqueId())) {
                String uBUniqueId = this.mAdRequestParams.getUBUniqueId();
                String bid = SmaatoSdkInAppBidding.getBid(uBUniqueId);
                Ad ad = SmaatoUBCache.getAd(uBUniqueId);
                if (!TextUtils.isEmpty(bid)) {
                    this.mRewardedAd.prepareAd(bid);
                    return;
                }
                if (ad != null) {
                    this.mRewardedAd.prepareAd(ad);
                    return;
                } else {
                    if (this.mEventListener != null) {
                        this.mEventListener.onAdFailedToLoad(new RewardedRequestError(RewardedError.INVALID_REQUEST, NextGen.getAppToken(), this.mAdSpaceId));
                        return;
                    }
                    return;
                }
            }
            this.mRewardedAd.load();
            return;
        }
        if (this.mEventListener != null) {
            this.mEventListener.onAdFailedToLoad(new RewardedRequestError(RewardedError.SDK_INITIALISATION_ERROR, NextGen.getAppToken(), this.mAdSpaceId));
        }
    }

    public final void showAd() {
        showAdInternal();
    }

    protected void showAdInternal() {
        NextGenRewardedAd nextGenRewardedAd = this.mRewardedAd;
        if (nextGenRewardedAd != null) {
            nextGenRewardedAd.show();
        }
    }

    @Override // com.smaato.sdk.interstitial.InterstitialAdBase
    public String getSessionId() {
        NextGenRewardedAd nextGenRewardedAd = this.mRewardedAd;
        if (nextGenRewardedAd != null) {
            return nextGenRewardedAd.getImpressionId();
        }
        return null;
    }

    @Override // com.smaato.sdk.interstitial.InterstitialAdBase
    public String getCreativeId() {
        NextGenRewardedAd nextGenRewardedAd = this.mRewardedAd;
        if (nextGenRewardedAd != null) {
            return nextGenRewardedAd.getCreativeId();
        }
        return null;
    }

    @Override // com.smaato.sdk.interstitial.InterstitialAdBase
    public String getAdSpaceId() {
        return this.mAdSpaceId;
    }

    @Override // com.smaato.sdk.interstitial.InterstitialAdBase
    public boolean isAvailableForPresentation() {
        NextGenRewardedAd nextGenRewardedAd = this.mRewardedAd;
        if (nextGenRewardedAd != null) {
            return nextGenRewardedAd.isReady();
        }
        return false;
    }

    @Override // com.smaato.sdk.ng.rewarded.NextGenRewardedAd.Listener
    public void onRewardedLoaded() {
        EventListener eventListener = this.mEventListener;
        if (eventListener != null) {
            eventListener.onAdLoaded(this);
        }
    }

    @Override // com.smaato.sdk.ng.rewarded.NextGenRewardedAd.Listener
    public void onRewardedLoadFailed(Throwable th) {
        if (this.mEventListener != null) {
            this.mEventListener.onAdFailedToLoad(new RewardedRequestError(ErrorMapper.mapRewardedError(th), NextGen.getAppToken(), this.mAdSpaceId));
        }
    }

    @Override // com.smaato.sdk.ng.rewarded.NextGenRewardedAd.Listener
    public void onRewardedOpened() {
        EventListener eventListener = this.mEventListener;
        if (eventListener != null) {
            eventListener.onAdStarted(this);
        }
    }

    @Override // com.smaato.sdk.ng.rewarded.NextGenRewardedAd.Listener
    public void onRewardedClosed() {
        EventListener eventListener = this.mEventListener;
        if (eventListener != null) {
            eventListener.onAdClosed(this);
        }
    }

    @Override // com.smaato.sdk.ng.rewarded.NextGenRewardedAd.Listener
    public void onRewardedClick() {
        EventListener eventListener = this.mEventListener;
        if (eventListener != null) {
            eventListener.onAdClicked(this);
        }
    }

    @Override // com.smaato.sdk.ng.rewarded.NextGenRewardedAd.Listener
    public void onReward() {
        EventListener eventListener = this.mEventListener;
        if (eventListener != null) {
            eventListener.onAdReward(this);
        }
    }
}
