package com.ironsource;

import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class I2 implements H2 {

    @NotNull
    private final InterfaceC4868s1 a;

    @NotNull
    private final Executor b;

    public I2(@NotNull InterfaceC4868s1 analytics, @NotNull Executor callbackExecutor) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.a = analytics;
        this.b = callbackExecutor;
    }

    @Override // com.ironsource.H2
    @NotNull
    public BannerAdView a(@NotNull K9 adInstance, @NotNull C4661g8 adContainer, @NotNull Y1 auctionDataReporter) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        return new BannerAdView(new P2(adInstance, adContainer, auctionDataReporter, this.a, null, null, null, null, null, 496, null));
    }
}
