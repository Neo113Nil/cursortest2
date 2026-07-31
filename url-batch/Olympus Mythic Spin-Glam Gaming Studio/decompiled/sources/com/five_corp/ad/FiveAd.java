package com.five_corp.ad;

import android.content.Context;
import androidx.annotation.NonNull;

@Deprecated
/* loaded from: classes3.dex */
public abstract class FiveAd {
    public static String getSdkSemanticVersion() {
        return BuildConfig.SEMVER;
    }

    @Deprecated
    public static int getSdkVersion() {
        return BuildConfig.VERSION_CODE;
    }

    public static FiveAd getSingleton() {
        return m.a;
    }

    public static void initialize(@NonNull Context context, @NonNull FiveAdConfig fiveAdConfig) {
        AdLoader.a(context, fiveAdConfig, (a) null, true);
    }

    public static boolean isInitialized() {
        return m.isInitialized();
    }

    @Deprecated
    public abstract void enableSound(boolean z);

    @Deprecated
    public int getVersion() {
        return BuildConfig.VERSION_CODE;
    }

    @Deprecated
    public abstract boolean isSoundEnabled();
}
