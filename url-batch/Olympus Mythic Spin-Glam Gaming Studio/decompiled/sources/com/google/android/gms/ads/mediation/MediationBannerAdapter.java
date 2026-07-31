package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
@Deprecated
/* loaded from: classes8.dex */
public interface MediationBannerAdapter extends MediationAdapter {
    @NonNull
    View getBannerView();

    void requestBannerAd(@NonNull Context context, @NonNull MediationBannerListener mediationBannerListener, @NonNull Bundle bundle, @NonNull AdSize adSize, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2);
}
