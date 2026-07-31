package com.pubmatic.sdk.nativead;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.nativead.response.POBNativeAdDataResponseAsset;
import com.pubmatic.sdk.nativead.response.POBNativeAdImageResponseAsset;
import com.pubmatic.sdk.nativead.response.POBNativeAdTitleResponseAsset;
import com.pubmatic.sdk.nativead.views.POBNativeTemplateView;
import java.util.List;

/* loaded from: classes13.dex */
public interface POBNativeAd {
    void destroy();

    @Nullable
    @MainThread
    View getAdInfoIcon();

    @Nullable
    POBNativeAdView getAdView();

    @Nullable
    POBNativeAdDataResponseAsset getAdvertiser();

    @Nullable
    POBNativeAdDataResponseAsset getCallToAction();

    @Nullable
    POBNativeAdDataResponseAsset getDataAssetForId(int i);

    @Nullable
    POBNativeAdDataResponseAsset getDescription();

    @Nullable
    POBNativeAdImageResponseAsset getIcon();

    @Nullable
    POBNativeAdImageResponseAsset getImageAssetForId(int i);

    @Nullable
    POBNativeAdImageResponseAsset getMainImage();

    @NonNull
    Float getMediaAspectRatio();

    @Nullable
    @MainThread
    FrameLayout getMediaView();

    @Nullable
    POBNativeAdDataResponseAsset getPrice();

    @Nullable
    POBNativeAdDataResponseAsset getRating();

    @Nullable
    POBNativeAdTitleResponseAsset getTitle();

    @Nullable
    POBNativeAdTitleResponseAsset getTitleAssetForId(int i);

    void registerViewForInteraction(@NonNull View view, @NonNull List<View> list, @NonNull POBNativeAdListener pOBNativeAdListener);

    void renderAd(@NonNull POBNativeAdListener pOBNativeAdListener);

    void renderAd(@NonNull POBNativeTemplateView pOBNativeTemplateView, @NonNull POBNativeAdListener pOBNativeAdListener);

    void setVideoEventListener(@NonNull POBNativeAdVideoEventListener pOBNativeAdVideoEventListener);
}
