package com.my.target.mediation;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.my.target.ads.MyTargetView;
import com.my.target.common.models.IAdLoadingError;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes15.dex */
public interface MediationStandardAdAdapter extends MediationAdapter {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface MediationStandardAdListener {
        void onClick(@NonNull MediationStandardAdAdapter mediationStandardAdAdapter);

        void onLoad(@NonNull View view, @NonNull MediationStandardAdAdapter mediationStandardAdAdapter);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull MediationStandardAdAdapter mediationStandardAdAdapter);

        void onShow(@NonNull MediationStandardAdAdapter mediationStandardAdAdapter);
    }

    void load(@NonNull MediationAdConfig mediationAdConfig, @NonNull MyTargetView.AdSize adSize, @NonNull MediationStandardAdListener mediationStandardAdListener, @NonNull Context context);
}
