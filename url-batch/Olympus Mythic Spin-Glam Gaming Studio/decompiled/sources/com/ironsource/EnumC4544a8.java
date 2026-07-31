package com.ironsource;

import com.facebook.ads.AdError;
import com.vungle.ads.internal.protos.Sdk;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.a8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4544a8 {
    ISErrorInitNetworkFailed(7001, "Initialization failed due to network failure."),
    ISErrorInitDecryptionFailure(AdError.LOAD_CALLED_WHILE_SHOWING_AD, "Initialization failed due to decryption failure."),
    ISErrorInitHttpRequestFailed(AdError.CLEAR_TEXT_SUPPORT_NOT_ALLOWED, "Initialization failed due to HTTP request failure."),
    ISErrorInitInvalidResponse(AdError.INCORRECT_STATE_ERROR, "Initialization failed due to invalid response."),
    ISErrorLoadNetworkFailed(7101, "Loading failed due to network failure."),
    ISErrorLoadADMDecryptionFailure(7102, "Loading failed due to ADM decryption failure."),
    ISErrorLoadADMEmptyServerData(7103, "Loading failed due to empty server data."),
    ISErrorLoadADMEmptyWaterfall(7104, "Loading failed due to empty waterfall."),
    ISErrorLoadADMInvalidJSON(7105, "Loading failed due to invalid ADM JSON."),
    ISErrorLoadADMNoAuctionID(7106, "Loading failed due to missing auction ID."),
    ISErrorLoadADMNoConfigurationForRequestedNetwork(7107, "Loading failed due to no configuration for requested network."),
    ISErrorLoadADMInvalidConfigurationForRequestedNetwork(7108, "Loading failed due to invalid configuration for requested network."),
    ISErrorLoadBiddingInNonBidding(7109, "Loading failed due to non-bidding in bidding context."),
    ISErrorLoadNullADM(7110, "Loading failed due to null ADM."),
    ISErrorLoadInstanceNotInInitResponse(7111, "Loading failed due to instance not being in init response."),
    ISErrorLoadNoAdFormatConfigurations(7112, "Loading failed due to no ad format configurations."),
    ISErrorLoadTimedOut(7113, "Loading failed due to timeout."),
    ISErrorLoadSDKNotInitialized(7115, "Loading failed due to SDK not being initialized."),
    ISErrorLoadBannerNetworkViewIsNull(7116, "Loading failed due to null network banner view."),
    ISErrorLoadBannerSizeIsNull(7117, "Loading failed because the banner size is null."),
    ISErrorLoadBannerNotSupportedSize(7118, "Loading failed due to banner size not supported."),
    ISErrorShowNetworkFailed(7201, "Showing ad failed due to network failure."),
    ISErrorShowNotReadyToShowAd(7202, "Showing ad failed because the ad is not ready to show."),
    ISErrorInterstitialLoadNoConfig(10000, "Load failed due to no config"),
    ISErrorBannerLoadNoConfig(Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "Load failed due to no config"),
    ISErrorRewardedLoadNoConfig(Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE, "Load failed due to no config");

    private final int a;

    @NotNull
    private final String b;

    EnumC4544a8(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final int b() {
        return this.a;
    }

    @NotNull
    public final String c() {
        return this.b;
    }
}
