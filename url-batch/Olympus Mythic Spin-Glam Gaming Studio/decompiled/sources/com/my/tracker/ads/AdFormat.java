package com.my.tracker.ads;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes15.dex */
public @interface AdFormat {

    @NonNull
    public static final String BANNER = "banner";

    @NonNull
    public static final String INTERSTITIAL = "interstitial";

    @NonNull
    public static final String NATIVE = "native";

    @NonNull
    public static final String REWARDED = "rewarded";
}
