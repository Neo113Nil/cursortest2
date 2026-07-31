package com.my.target.mediation;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.nativeads.NativeBannerAdViewBinder;
import com.my.target.nativeads.banners.NativeBanner;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes11.dex */
public interface MediationNativeBannerAdAdapter extends MediationAdapter {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface MediationNativeBannerAdListener {
        void closeIfAutomaticallyDisabled(@NonNull MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        void onAdChoicesIconLoad(@Nullable ImageData imageData, boolean z, @NonNull MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        void onClick(@NonNull MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        void onCloseAutomatically(@NonNull MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        void onLoad(@NonNull NativeBanner nativeBanner, @NonNull MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        void onShow(@NonNull MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        boolean shouldCloseAutomatically();
    }

    @Nullable
    View getIconView(@NonNull Context context);

    void load(@NonNull MediationNativeBannerAdConfig mediationNativeBannerAdConfig, @NonNull MediationNativeBannerAdListener mediationNativeBannerAdListener, @NonNull Context context);

    @Deprecated
    void registerView(@NonNull View view, @Nullable List<View> list, int i);

    void registerView(@NonNull NativeBannerAdViewBinder nativeBannerAdViewBinder, @Nullable List<View> list, int i);

    void unregisterView();
}
