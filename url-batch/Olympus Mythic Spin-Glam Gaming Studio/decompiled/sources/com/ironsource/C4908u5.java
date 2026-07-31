package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.u5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4908u5 {

    @NotNull
    public static final C4908u5 a = new C4908u5();

    private C4908u5() {
    }

    static /* synthetic */ IronSourceError a(C4908u5 c4908u5, EnumC4544a8 enumC4544a8, IronSourceError ironSourceError, int i, Object obj) {
        if ((i & 2) != 0) {
            ironSourceError = null;
        }
        return c4908u5.a(enumC4544a8, ironSourceError);
    }

    @NotNull
    public final IronSourceError b() {
        return a(this, EnumC4544a8.ISErrorInitHttpRequestFailed, null, 2, null);
    }

    @NotNull
    public final IronSourceError c() {
        return a(this, EnumC4544a8.ISErrorInitInvalidResponse, null, 2, null);
    }

    @NotNull
    public final IronSourceError d() {
        return a(this, EnumC4544a8.ISErrorLoadADMDecryptionFailure, null, 2, null);
    }

    @NotNull
    public final IronSourceError e() {
        return a(this, EnumC4544a8.ISErrorLoadADMEmptyServerData, null, 2, null);
    }

    @NotNull
    public final IronSourceError f() {
        return a(this, EnumC4544a8.ISErrorLoadADMEmptyWaterfall, null, 2, null);
    }

    @NotNull
    public final IronSourceError g() {
        return a(this, EnumC4544a8.ISErrorLoadADMInvalidConfigurationForRequestedNetwork, null, 2, null);
    }

    @NotNull
    public final IronSourceError h() {
        return a(this, EnumC4544a8.ISErrorLoadADMInvalidJSON, null, 2, null);
    }

    @NotNull
    public final IronSourceError i() {
        return a(this, EnumC4544a8.ISErrorLoadADMNoAuctionID, null, 2, null);
    }

    @NotNull
    public final IronSourceError j() {
        return a(this, EnumC4544a8.ISErrorLoadADMNoConfigurationForRequestedNetwork, null, 2, null);
    }

    @NotNull
    public final IronSourceError k() {
        return a(this, EnumC4544a8.ISErrorLoadBannerNetworkViewIsNull, null, 2, null);
    }

    @NotNull
    public final IronSourceError l() {
        return a(this, EnumC4544a8.ISErrorLoadBannerNotSupportedSize, null, 2, null);
    }

    @NotNull
    public final IronSourceError m() {
        return a(this, EnumC4544a8.ISErrorLoadBannerSizeIsNull, null, 2, null);
    }

    @NotNull
    public final IronSourceError n() {
        return a(this, EnumC4544a8.ISErrorLoadBiddingInNonBidding, null, 2, null);
    }

    @NotNull
    public final IronSourceError o() {
        return a(this, EnumC4544a8.ISErrorLoadInstanceNotInInitResponse, null, 2, null);
    }

    @NotNull
    public final IronSourceError p() {
        return a(this, EnumC4544a8.ISErrorLoadNoAdFormatConfigurations, null, 2, null);
    }

    @NotNull
    public final IronSourceError q() {
        return a(this, EnumC4544a8.ISErrorLoadNullADM, null, 2, null);
    }

    @NotNull
    public final IronSourceError r() {
        return a(this, EnumC4544a8.ISErrorLoadSDKNotInitialized, null, 2, null);
    }

    @NotNull
    public final IronSourceError s() {
        return a(this, EnumC4544a8.ISErrorLoadTimedOut, null, 2, null);
    }

    @NotNull
    public final IronSourceError t() {
        return a(this, EnumC4544a8.ISErrorShowNotReadyToShowAd, null, 2, null);
    }

    private final IronSourceError a(EnumC4544a8 enumC4544a8, IronSourceError ironSourceError) {
        String c;
        if (ironSourceError != null) {
            c = enumC4544a8.c() + " Underlying network error: '" + ironSourceError.getErrorCode() + ":" + ironSourceError.getErrorMessage() + "'";
        } else {
            c = enumC4544a8.c();
        }
        return new IronSourceError(enumC4544a8.b(), c);
    }

    @NotNull
    public final IronSourceError b(@NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return a(EnumC4544a8.ISErrorLoadNetworkFailed, error);
    }

    @NotNull
    public final IronSourceError c(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return a(EnumC4544a8.ISErrorLoadNetworkFailed, description);
    }

    @NotNull
    public final IronSourceError d(@Nullable String str) {
        return a(EnumC4544a8.ISErrorRewardedLoadNoConfig, str);
    }

    public static /* synthetic */ IronSourceError b(C4908u5 c4908u5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c4908u5.b(str);
    }

    @NotNull
    public final IronSourceError c(@NotNull IronSourceError networkError) {
        Intrinsics.checkNotNullParameter(networkError, "networkError");
        return a(EnumC4544a8.ISErrorShowNetworkFailed, networkError);
    }

    public static /* synthetic */ IronSourceError c(C4908u5 c4908u5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c4908u5.d(str);
    }

    @NotNull
    public final IronSourceError b(@Nullable String str) {
        return a(EnumC4544a8.ISErrorInterstitialLoadNoConfig, str);
    }

    private final IronSourceError a(EnumC4544a8 enumC4544a8, String str) {
        if (str == null || str.length() == 0) {
            str = enumC4544a8.c();
        }
        return new IronSourceError(enumC4544a8.b(), str);
    }

    @NotNull
    public final IronSourceError a(@NotNull IronSourceError networkError) {
        Intrinsics.checkNotNullParameter(networkError, "networkError");
        return a(EnumC4544a8.ISErrorInitNetworkFailed, networkError);
    }

    @NotNull
    public final IronSourceError a() {
        return a(this, EnumC4544a8.ISErrorInitDecryptionFailure, null, 2, null);
    }

    public static /* synthetic */ IronSourceError a(C4908u5 c4908u5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c4908u5.a(str);
    }

    @NotNull
    public final IronSourceError a(@Nullable String str) {
        return a(EnumC4544a8.ISErrorBannerLoadNoConfig, str);
    }
}
