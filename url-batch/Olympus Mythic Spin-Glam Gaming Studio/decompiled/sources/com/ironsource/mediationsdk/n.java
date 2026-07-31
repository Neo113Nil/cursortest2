package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class n extends a<InterstitialAdListener> implements InterstitialSmashListener {
    public n(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, UUID uuid) {
        super(abstractAdapter, networkSettings, IronSource.a.INTERSTITIAL, uuid);
    }

    @Override // com.ironsource.mediationsdk.a
    protected void a(JSONObject jSONObject, JSONObject jSONObject2, @NotNull AdData adData) {
        Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.a.loadInterstitialForBidding(jSONObject, jSONObject2, adData.getServerData(), this);
        } else {
            this.a.loadInterstitial(jSONObject, jSONObject2, this);
        }
    }

    @Override // com.ironsource.mediationsdk.a
    protected boolean b(JSONObject jSONObject) {
        return this.a.isInterstitialReady(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.a
    protected void e(JSONObject jSONObject) {
        this.a.showInterstitial(jSONObject, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((InterstitialAdListener) this.b.get()).onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((InterstitialAdListener) this.b.get()).onAdClosed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.b.get() != null) {
            ((InterstitialAdListener) this.b.get()).onAdLoadFailed(a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        onInterstitialAdOpened(new HashMap());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((InterstitialAdListener) this.b.get()).onAdLoadSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.b.get() != null) {
            ((InterstitialAdListener) this.b.get()).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.a
    protected IronSource.a b() {
        return IronSource.a.INTERSTITIAL;
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened(Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((InterstitialAdListener) this.b.get()).onAdOpened(map);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded(Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(a());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady(Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((InterstitialAdListener) this.b.get()).onAdLoadSuccess(map);
        }
    }

    @Override // com.ironsource.mediationsdk.a
    protected void a(JSONObject jSONObject, JSONObject jSONObject2, @NotNull BiddingDataCallback biddingDataCallback) {
        this.a.collectInterstitialBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    @Override // com.ironsource.mediationsdk.a
    protected void a(JSONObject jSONObject) {
        this.a.destroyInterstitialAd(jSONObject);
    }

    protected boolean a(IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 1158;
    }
}
