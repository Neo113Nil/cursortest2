package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class sq0 {
    public static final sq0 c;
    public static final sq0 d;
    public static final sq0 e;
    public static final sq0 f;
    public static final /* synthetic */ sq0[] g;
    public final String b;

    static {
        sq0 sq0Var = new sq0(0, "AD_POD_SKIP", "AdPodSkipFeatureToggle");
        sq0 sq0Var2 = new sq0(1, "INTERSTITIAL_PRELOADING", "InterstitialPreloading");
        sq0 sq0Var3 = new sq0(2, "REWARDED_PRELOADING", "RewardedPreloading");
        sq0 sq0Var4 = new sq0(3, "FIRST_VIDEO_PRELOADING_STRATEGY", "FirstVideoPreloadingStrategyFeatureToggle");
        c = sq0Var4;
        sq0 sq0Var5 = new sq0(4, "TESTING_NEW_ADAPTER", "TestingNewAdapterFeatureToggle");
        d = sq0Var5;
        sq0 sq0Var6 = new sq0(5, "FALLBACK_FOR_VIDEO", "FallbackForVideoFeatureToggle");
        e = sq0Var6;
        sq0 sq0Var7 = new sq0(6, "BACKGROUND_NATIVE_VIDEO_PRELOADING", "BackgroundNativeVideoPreloading");
        sq0 sq0Var8 = new sq0(7, "DONT_WAIT_FOR_WEB_VIEW_LOAD_FINISH_ON_PRELOADING", "DontWaitForWebViewLoadFinishOnPreloading");
        sq0 sq0Var9 = new sq0(8, "APP_HARBR_QUALITY_VERIFICATION", "AppHarbrQualityVerificationEnabled");
        f = sq0Var9;
        sq0[] sq0VarArr = {sq0Var, sq0Var2, sq0Var3, sq0Var4, sq0Var5, sq0Var6, sq0Var7, sq0Var8, sq0Var9};
        g = sq0VarArr;
        EnumEntriesKt.enumEntries(sq0VarArr);
    }

    public sq0(int i, String str, String str2) {
        this.b = str2;
    }

    public static sq0 valueOf(String str) {
        return (sq0) Enum.valueOf(sq0.class, str);
    }

    public static sq0[] values() {
        return (sq0[]) g.clone();
    }
}
