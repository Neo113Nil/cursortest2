package com.smaato.sdk.interstitial;

import android.app.Activity;
import android.text.TextUtils;
import com.smaato.sdk.core.ad.AdRequestParams;
import com.smaato.sdk.core.ub.SmaatoUBCache;
import com.smaato.sdk.iahb.SmaatoSdkInAppBidding;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.interstitial.NextGenInterstitialAd;
import com.smaato.sdk.ng.models.Ad;

/* loaded from: classes3.dex */
public class InterstitialAd extends InterstitialAdBase implements NextGenInterstitialAd.Listener {
    private final AdRequestParams mAdRequestParams;
    private final String mAdSpaceId;
    private final EventListener mEventListener;
    private NextGenInterstitialAd mInterstitialAd;

    public InterstitialAd(String str, AdRequestParams adRequestParams, EventListener eventListener) {
        this.mAdRequestParams = adRequestParams;
        this.mEventListener = eventListener;
        this.mAdSpaceId = str;
        if (!NextGen.isInitialized() || NextGen.getDeviceInfo().getContext() == null) {
            return;
        }
        this.mInterstitialAd = new NextGenInterstitialAd(NextGen.getDeviceInfo().getContext(), str, this);
    }

    public void setMediation(boolean z) {
        this.mInterstitialAd.setMediation(z);
    }

    public void loadAd() {
        if (this.mInterstitialAd != null) {
            AdRequestParams adRequestParams = this.mAdRequestParams;
            if (adRequestParams != null && !TextUtils.isEmpty(adRequestParams.getUBUniqueId())) {
                String uBUniqueId = this.mAdRequestParams.getUBUniqueId();
                String bid = SmaatoSdkInAppBidding.getBid(uBUniqueId);
                Ad ad = SmaatoUBCache.getAd(uBUniqueId);
                if (!TextUtils.isEmpty(bid)) {
                    this.mInterstitialAd.prepareAd(bid);
                    return;
                }
                if (ad != null) {
                    this.mInterstitialAd.prepareAd(ad);
                    return;
                } else {
                    if (this.mEventListener != null) {
                        this.mEventListener.onAdFailedToLoad(new InterstitialRequestError(InterstitialError.INTERNAL_ERROR, NextGen.getAppToken(), this.mAdSpaceId));
                        return;
                    }
                    return;
                }
            }
            this.mInterstitialAd.load();
            return;
        }
        if (this.mEventListener != null) {
            this.mEventListener.onAdFailedToLoad(new InterstitialRequestError(InterstitialError.SDK_INITIALISATION_ERROR, NextGen.getAppToken(), this.mAdSpaceId));
        }
    }

    public final void showAd(Activity activity) {
        showAdInternal(activity);
    }

    protected void showAdInternal(Activity activity) {
        NextGenInterstitialAd nextGenInterstitialAd = this.mInterstitialAd;
        if (nextGenInterstitialAd != null) {
            nextGenInterstitialAd.show();
        }
    }

    @Override // com.smaato.sdk.interstitial.InterstitialAdBase
    public String getSessionId() {
        NextGenInterstitialAd nextGenInterstitialAd = this.mInterstitialAd;
        if (nextGenInterstitialAd != null) {
            return nextGenInterstitialAd.getImpressionId();
        }
        return null;
    }

    @Override // com.smaato.sdk.interstitial.InterstitialAdBase
    public String getCreativeId() {
        NextGenInterstitialAd nextGenInterstitialAd = this.mInterstitialAd;
        if (nextGenInterstitialAd != null) {
            return nextGenInterstitialAd.getCreativeId();
        }
        return null;
    }

    @Override // com.smaato.sdk.interstitial.InterstitialAdBase
    public String getAdSpaceId() {
        return this.mAdSpaceId;
    }

    @Override // com.smaato.sdk.interstitial.InterstitialAdBase
    public boolean isAvailableForPresentation() {
        NextGenInterstitialAd nextGenInterstitialAd = this.mInterstitialAd;
        if (nextGenInterstitialAd != null) {
            return nextGenInterstitialAd.isReady();
        }
        return false;
    }

    @Override // com.smaato.sdk.ng.interstitial.NextGenInterstitialAd.Listener
    public void onInterstitialLoaded() {
        EventListener eventListener = this.mEventListener;
        if (eventListener != null) {
            eventListener.onAdLoaded(this);
        }
    }

    @Override // com.smaato.sdk.ng.interstitial.NextGenInterstitialAd.Listener
    public void onInterstitialLoadFailed(Throwable th) {
        if (this.mEventListener != null) {
            this.mEventListener.onAdFailedToLoad(new InterstitialRequestError(ErrorMapper.mapInterstitialError(th), NextGen.getAppToken(), this.mAdSpaceId));
        }
    }

    @Override // com.smaato.sdk.ng.interstitial.NextGenInterstitialAd.Listener
    public void onInterstitialImpression() {
        EventListener eventListener = this.mEventListener;
        if (eventListener != null) {
            eventListener.onAdOpened(this);
            this.mEventListener.onAdImpression(this);
        }
    }

    @Override // com.smaato.sdk.ng.interstitial.NextGenInterstitialAd.Listener
    public void onInterstitialClick() {
        EventListener eventListener = this.mEventListener;
        if (eventListener != null) {
            eventListener.onAdClicked(this);
        }
    }

    @Override // com.smaato.sdk.ng.interstitial.NextGenInterstitialAd.Listener
    public void onInterstitialDismissed() {
        EventListener eventListener = this.mEventListener;
        if (eventListener != null) {
            eventListener.onAdClosed(this);
        }
    }
}
