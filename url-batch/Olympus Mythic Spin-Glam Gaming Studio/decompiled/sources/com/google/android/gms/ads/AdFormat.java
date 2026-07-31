package com.google.android.gms.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes6.dex */
public enum AdFormat {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);

    private final int zza;

    AdFormat(int i) {
        this.zza = i;
    }

    @Nullable
    public static AdFormat getAdFormat(int i) {
        for (AdFormat adFormat : values()) {
            if (adFormat.getValue() == i) {
                return adFormat;
            }
        }
        return null;
    }

    public int getValue() {
        return this.zza;
    }
}
