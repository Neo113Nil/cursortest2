package com.unity3d.ironsourceads.rewarded;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes15.dex */
public final class RewardedAdInfo {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    public RewardedAdInfo(@NotNull String instanceId, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.a = instanceId;
        this.b = adId;
    }

    @NotNull
    public final String getAdId() {
        return this.b;
    }

    @NotNull
    public final String getInstanceId() {
        return this.a;
    }

    @NotNull
    public String toString() {
        return "[instanceId: '" + this.a + "', adId: '" + this.b + "']";
    }
}
