package com.ironsource;

import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.u9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4912u9 implements InterfaceC4617e0<InterstitialAd> {

    @NotNull
    private final InterfaceC4868s1 a;

    @NotNull
    private final Executor b;

    public C4912u9(@NotNull InterfaceC4868s1 analytics, @NotNull Executor callbackExecutor) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.a = analytics;
        this.b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC4617e0
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterstitialAd a(@NotNull K9 adInstance, @NotNull Y1 auctionDataReporter) {
        ConcurrentHashMap concurrentHashMap;
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        C4599d0 c4599d0 = new C4599d0(new Cc());
        InterfaceC4868s1 interfaceC4868s1 = this.a;
        concurrentHashMap = C4934v9.a;
        return new InterstitialAd(new C4952w9(adInstance, c4599d0, auctionDataReporter, interfaceC4868s1, null, null, null, null, concurrentHashMap, 240, null));
    }
}
