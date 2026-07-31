package com.my.target.mediation;

import android.content.Context;
import androidx.annotation.NonNull;
import com.my.target.ads.Reward;
import com.my.target.common.models.IAdLoadingError;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes13.dex */
public interface MediationRewardedAdAdapter extends MediationAdapter {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface MediationRewardedAdListener {
        void onClick(@NonNull MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onDismiss(@NonNull MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onDisplay(@NonNull MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onFailedToShow(@NonNull MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onLoad(@NonNull MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onReward(@NonNull Reward reward, @NonNull MediationRewardedAdAdapter mediationRewardedAdAdapter);
    }

    void dismiss();

    void load(@NonNull MediationAdConfig mediationAdConfig, @NonNull MediationRewardedAdListener mediationRewardedAdListener, @NonNull Context context);

    void show(@NonNull Context context);
}
