package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class N9 {
    private final int a;

    @NotNull
    private final String b;

    @NotNull
    private final JSONObject c;

    @NotNull
    private final C4884t d;

    @NotNull
    private final C4884t e;

    @NotNull
    private final C4884t f;

    public N9(int i, @NotNull String controllerUrl, @NotNull JSONObject controllerConfig, @NotNull C4884t bannerConfig, @NotNull C4884t interstitialConfig, @NotNull C4884t rewardedConfig) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        Intrinsics.checkNotNullParameter(bannerConfig, "bannerConfig");
        Intrinsics.checkNotNullParameter(interstitialConfig, "interstitialConfig");
        Intrinsics.checkNotNullParameter(rewardedConfig, "rewardedConfig");
        this.a = i;
        this.b = controllerUrl;
        this.c = controllerConfig;
        this.d = bannerConfig;
        this.e = interstitialConfig;
        this.f = rewardedConfig;
    }

    public final int a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final JSONObject c() {
        return this.c;
    }

    @NotNull
    public final C4884t d() {
        return this.d;
    }

    @NotNull
    public final C4884t e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N9)) {
            return false;
        }
        N9 n9 = (N9) obj;
        return this.a == n9.a && Intrinsics.areEqual(this.b, n9.b) && Intrinsics.areEqual(this.c, n9.c) && Intrinsics.areEqual(this.d, n9.d) && Intrinsics.areEqual(this.e, n9.e) && Intrinsics.areEqual(this.f, n9.f);
    }

    @NotNull
    public final C4884t f() {
        return this.f;
    }

    @NotNull
    public final C4884t g() {
        return this.d;
    }

    @NotNull
    public final JSONObject h() {
        return this.c;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    @NotNull
    public final String i() {
        return this.b;
    }

    @NotNull
    public final C4884t j() {
        return this.e;
    }

    public final int k() {
        return this.a;
    }

    @NotNull
    public final C4884t l() {
        return this.f;
    }

    @NotNull
    public String toString() {
        return "IronSourceAdsInitConfig(logLevel=" + this.a + ", controllerUrl=" + this.b + ", controllerConfig=" + this.c + ", bannerConfig=" + this.d + ", interstitialConfig=" + this.e + ", rewardedConfig=" + this.f + ")";
    }

    @NotNull
    public final N9 a(int i, @NotNull String controllerUrl, @NotNull JSONObject controllerConfig, @NotNull C4884t bannerConfig, @NotNull C4884t interstitialConfig, @NotNull C4884t rewardedConfig) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        Intrinsics.checkNotNullParameter(bannerConfig, "bannerConfig");
        Intrinsics.checkNotNullParameter(interstitialConfig, "interstitialConfig");
        Intrinsics.checkNotNullParameter(rewardedConfig, "rewardedConfig");
        return new N9(i, controllerUrl, controllerConfig, bannerConfig, interstitialConfig, rewardedConfig);
    }

    public static /* synthetic */ N9 a(N9 n9, int i, String str, JSONObject jSONObject, C4884t c4884t, C4884t c4884t2, C4884t c4884t3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = n9.a;
        }
        if ((i2 & 2) != 0) {
            str = n9.b;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            jSONObject = n9.c;
        }
        JSONObject jSONObject2 = jSONObject;
        if ((i2 & 8) != 0) {
            c4884t = n9.d;
        }
        C4884t c4884t4 = c4884t;
        if ((i2 & 16) != 0) {
            c4884t2 = n9.e;
        }
        C4884t c4884t5 = c4884t2;
        if ((i2 & 32) != 0) {
            c4884t3 = n9.f;
        }
        return n9.a(i, str2, jSONObject2, c4884t4, c4884t5, c4884t3);
    }
}
