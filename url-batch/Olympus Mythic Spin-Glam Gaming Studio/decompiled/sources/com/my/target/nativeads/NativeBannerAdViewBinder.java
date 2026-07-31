package com.my.target.nativeads;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.nativeads.views.IconAdView;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes13.dex */
public interface NativeBannerAdViewBinder {
    @Nullable
    View getAdChoicesView();

    @Nullable
    View getAdvertisingView();

    @Nullable
    View getAgeRestrictionView();

    @Nullable
    View getCtaView();

    @Nullable
    View getDisclaimerView();

    @Nullable
    View getDomainView();

    @Nullable
    IconAdView getIconView();

    @NonNull
    ViewGroup getRootAdBannerView();

    @Nullable
    View getStarsRatingView();

    @Nullable
    View getTitleView();

    @Nullable
    View getVotesView();
}
