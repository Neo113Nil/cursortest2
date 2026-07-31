package com.my.target.mediation;

import android.content.Context;
import androidx.annotation.NonNull;
import com.my.target.common.models.IAdLoadingError;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes13.dex */
public interface MediationInterstitialAdAdapter extends MediationAdapter {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface MediationInterstitialAdListener {
        void onClick(@NonNull MediationInterstitialAdAdapter mediationInterstitialAdAdapter);

        void onDismiss(@NonNull MediationInterstitialAdAdapter mediationInterstitialAdAdapter);

        void onDisplay(@NonNull MediationInterstitialAdAdapter mediationInterstitialAdAdapter);

        void onFailedToShow(@NonNull MediationInterstitialAdAdapter mediationInterstitialAdAdapter);

        void onLoad(@NonNull MediationInterstitialAdAdapter mediationInterstitialAdAdapter);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull MediationInterstitialAdAdapter mediationInterstitialAdAdapter);

        void onVideoCompleted(@NonNull MediationInterstitialAdAdapter mediationInterstitialAdAdapter);
    }

    void dismiss();

    void load(@NonNull MediationAdConfig mediationAdConfig, @NonNull MediationInterstitialAdListener mediationInterstitialAdListener, @NonNull Context context);

    void show(@NonNull Context context);
}
