package com.google.android.gms.ads.rewarded;

import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
public interface RewardItem {

    @NonNull
    public static final RewardItem DEFAULT_REWARD = new zza();

    int getAmount();

    @NonNull
    String getType();
}
