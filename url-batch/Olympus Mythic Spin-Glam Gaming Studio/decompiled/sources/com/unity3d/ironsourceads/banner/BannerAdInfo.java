package com.unity3d.ironsourceads.banner;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class BannerAdInfo {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    public BannerAdInfo(@NotNull String instanceId, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.a = instanceId;
        this.b = adId;
    }

    public static /* synthetic */ BannerAdInfo copy$default(BannerAdInfo bannerAdInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerAdInfo.a;
        }
        if ((i & 2) != 0) {
            str2 = bannerAdInfo.b;
        }
        return bannerAdInfo.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    @NotNull
    public final BannerAdInfo copy(@NotNull String instanceId, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        return new BannerAdInfo(instanceId, adId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAdInfo)) {
            return false;
        }
        BannerAdInfo bannerAdInfo = (BannerAdInfo) obj;
        return Intrinsics.areEqual(this.a, bannerAdInfo.a) && Intrinsics.areEqual(this.b, bannerAdInfo.b);
    }

    @NotNull
    public final String getAdId() {
        return this.b;
    }

    @NotNull
    public final String getInstanceId() {
        return this.a;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @NotNull
    public String toString() {
        return "[instanceId: '" + this.a + "', adId: '" + this.b + "']";
    }
}
