package com.my.target.nativeads;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.nativeads.views.PromoCardRecyclerView;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public interface NativeAdViewBinder {
    @Nullable
    View getAdChoicesView();

    @Nullable
    View getAdvertisingView();

    @Nullable
    View getAgeRestrictionView();

    @Nullable
    View getCtaView();

    @Nullable
    View getDescriptionView();

    @Nullable
    View getDisclaimerView();

    @Nullable
    View getDomainOrCategoryView();

    @Nullable
    IconAdView getIconView();

    @Nullable
    MediaAdView getMediaAdView();

    @Nullable
    PromoCardRecyclerView getPromoCardRecyclerView();

    @NonNull
    ViewGroup getRootAdView();

    @Nullable
    View getStarsRatingView();

    @Nullable
    View getTitleView();

    @Nullable
    View getVotesView();
}
