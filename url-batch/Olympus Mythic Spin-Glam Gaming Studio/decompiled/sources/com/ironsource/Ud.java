package com.ironsource;

import com.unity3d.ironsourceads.rewarded.RewardedAd;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class Ud implements InterfaceC4617e0<RewardedAd> {

    @NotNull
    private final InterfaceC4868s1 a;

    @NotNull
    private final Executor b;

    public Ud(@NotNull InterfaceC4868s1 analytics, @NotNull Executor callbackExecutor) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.a = analytics;
        this.b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC4617e0
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RewardedAd a(@NotNull K9 adInstance, @NotNull Y1 auctionDataReporter) {
        ConcurrentHashMap concurrentHashMap;
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        C4599d0 c4599d0 = new C4599d0(new Cc());
        InterfaceC4868s1 interfaceC4868s1 = this.a;
        concurrentHashMap = Vd.a;
        return new RewardedAd(new Xd(adInstance, c4599d0, auctionDataReporter, interfaceC4868s1, null, null, null, null, concurrentHashMap, 240, null));
    }
}
