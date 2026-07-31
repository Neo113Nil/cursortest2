package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.q4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4836q4 {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @NotNull
    private final String c;

    @NotNull
    private final String d;

    public C4836q4() {
        this(null, null, null, null, 15, null);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final String c() {
        return this.c;
    }

    @NotNull
    public final String d() {
        return this.d;
    }

    @NotNull
    public final String e() {
        return this.d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4836q4)) {
            return false;
        }
        C4836q4 c4836q4 = (C4836q4) obj;
        return Intrinsics.areEqual(this.a, c4836q4.a) && Intrinsics.areEqual(this.b, c4836q4.b) && Intrinsics.areEqual(this.c, c4836q4.c) && Intrinsics.areEqual(this.d, c4836q4.d);
    }

    @NotNull
    public final String f() {
        return this.c;
    }

    @NotNull
    public final String g() {
        return this.a;
    }

    @NotNull
    public final String h() {
        return this.b;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    @NotNull
    public String toString() {
        return "CustomAdapterSettings(customNetworkAdapterName=" + this.a + ", customRewardedVideoAdapterName=" + this.b + ", customInterstitialAdapterName=" + this.c + ", customBannerAdapterName=" + this.d + ")";
    }

    public C4836q4(@NotNull String customNetworkAdapterName, @NotNull String customRewardedVideoAdapterName, @NotNull String customInterstitialAdapterName, @NotNull String customBannerAdapterName) {
        Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        this.a = customNetworkAdapterName;
        this.b = customRewardedVideoAdapterName;
        this.c = customInterstitialAdapterName;
        this.d = customBannerAdapterName;
    }

    @NotNull
    public final C4836q4 a(@NotNull String customNetworkAdapterName, @NotNull String customRewardedVideoAdapterName, @NotNull String customInterstitialAdapterName, @NotNull String customBannerAdapterName) {
        Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        return new C4836q4(customNetworkAdapterName, customRewardedVideoAdapterName, customInterstitialAdapterName, customBannerAdapterName);
    }

    public static /* synthetic */ C4836q4 a(C4836q4 c4836q4, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4836q4.a;
        }
        if ((i & 2) != 0) {
            str2 = c4836q4.b;
        }
        if ((i & 4) != 0) {
            str3 = c4836q4.c;
        }
        if ((i & 8) != 0) {
            str4 = c4836q4.d;
        }
        return c4836q4.a(str, str2, str3, str4);
    }

    public /* synthetic */ C4836q4(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
