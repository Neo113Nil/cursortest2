package com.my.tracker.ads;

import androidx.annotation.Nullable;
import com.my.tracker.obfuscated.e1;

/* loaded from: classes13.dex */
public final class AdEvent extends e1 {

    @Nullable
    public final String adFormat;

    @Nullable
    public final String adId;

    @Nullable
    public final String currency;
    public final int network;

    @Nullable
    public final String placementId;
    public final double revenue;

    @Nullable
    public final String source;

    AdEvent(int i, int i2, double d, String str, String str2, String str3, String str4, String str5) {
        super(i);
        this.network = i2;
        this.revenue = d;
        this.currency = str;
        this.source = str2;
        this.placementId = str3;
        this.adId = str4;
        this.adFormat = str5;
    }
}
