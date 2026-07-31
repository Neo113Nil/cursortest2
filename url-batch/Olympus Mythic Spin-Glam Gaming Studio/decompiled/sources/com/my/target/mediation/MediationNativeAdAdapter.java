package com.my.target.mediation;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.nativeads.NativeAdViewBinder;
import com.my.target.nativeads.banners.NativePromoBanner;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public interface MediationNativeAdAdapter extends MediationAdapter {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface MediationNativeAdListener {
        void closeIfAutomaticallyDisabled(@NonNull MediationNativeAdAdapter mediationNativeAdAdapter);

        void onAdChoicesIconLoad(@Nullable ImageData imageData, boolean z, @NonNull MediationNativeAdAdapter mediationNativeAdAdapter);

        void onClick(@NonNull MediationNativeAdAdapter mediationNativeAdAdapter);

        void onCloseAutomatically(@NonNull MediationNativeAdAdapter mediationNativeAdAdapter);

        void onLoad(@NonNull NativePromoBanner nativePromoBanner, @NonNull MediationNativeAdAdapter mediationNativeAdAdapter);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull MediationNativeAdAdapter mediationNativeAdAdapter);

        void onShow(@NonNull MediationNativeAdAdapter mediationNativeAdAdapter);

        void onVideoComplete(@NonNull MediationNativeAdAdapter mediationNativeAdAdapter);

        void onVideoPause(@NonNull MediationNativeAdAdapter mediationNativeAdAdapter);

        void onVideoPlay(@NonNull MediationNativeAdAdapter mediationNativeAdAdapter);

        boolean shouldCloseAutomatically();
    }

    @Nullable
    View getMediaView(@NonNull Context context);

    void load(@NonNull MediationNativeAdConfig mediationNativeAdConfig, @NonNull MediationNativeAdListener mediationNativeAdListener, @NonNull Context context);

    @Deprecated
    void registerView(@NonNull View view, @Nullable List<View> list, int i);

    void registerView(@NonNull NativeAdViewBinder nativeAdViewBinder, @Nullable List<View> list, int i);

    void unregisterView();
}
