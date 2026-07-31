package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes12.dex */
public interface MediationAdLoadCallback<MediationAdT, MediationAdCallbackT> {
    void onFailure(@NonNull AdError adError);

    @NonNull
    MediationAdCallbackT onSuccess(@NonNull MediationAdT mediationadt);
}
