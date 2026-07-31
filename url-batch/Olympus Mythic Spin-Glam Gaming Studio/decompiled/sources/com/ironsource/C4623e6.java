package com.ironsource;

import android.app.Activity;
import com.ironsource.InterfaceC4949w6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.e6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4623e6 extends AbstractC4759m implements InterfaceC4909u6, InterfaceC4931v6 {

    @NotNull
    private final InterfaceC4659g6 b;

    @NotNull
    private final C4671h0 c;

    @NotNull
    private final InterfaceC4949w6 d;

    public /* synthetic */ C4623e6(InterfaceC4659g6 interfaceC4659g6, C4814p0 c4814p0, C4671h0 c4671h0, InterfaceC4949w6.b bVar, InterfaceC4873s6 interfaceC4873s6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4659g6, c4814p0, c4671h0, (i & 8) != 0 ? new InterfaceC4949w6.b() : bVar, interfaceC4873s6);
    }

    public final void a(@NotNull Activity activity, @Nullable C4684hd c4684hd) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.c.a(c4684hd);
        this.d.a(activity);
    }

    @Override // com.ironsource.InterfaceC4931v6
    public void b(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.b.onAdLoaded(adInfo);
    }

    @Override // com.ironsource.InterfaceC4931v6
    public void c(@Nullable IronSourceError ironSourceError) {
        InterfaceC4659g6 interfaceC4659g6 = this.b;
        String uuid = this.c.b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adProperties.adId.toString()");
        interfaceC4659g6.a(new LevelPlayAdError(ironSourceError, uuid, this.c.c()));
    }

    @Override // com.ironsource.K0
    public void e() {
        this.b.onAdClicked();
    }

    public final void m() {
        this.d.loadAd();
    }

    @Override // com.ironsource.InterfaceC4931v6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.b.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC4909u6
    public void onClosed() {
        this.b.onAdClosed();
    }

    public C4623e6(@NotNull InterfaceC4659g6 listener, @NotNull C4814p0 adTools, @NotNull C4671h0 adProperties, @NotNull InterfaceC4949w6.b adUnitStrategyFactory, @NotNull InterfaceC4873s6 fullscreenAdUnitFactory) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitStrategyFactory, "adUnitStrategyFactory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        this.b = listener;
        this.c = adProperties;
        this.d = adUnitStrategyFactory.a(adTools, adTools.b(adProperties.e(), adProperties.c()), fullscreenAdUnitFactory, this, this);
    }

    @Override // com.ironsource.InterfaceC4931v6
    public void a(@Nullable IronSourceError ironSourceError) {
        InterfaceC4659g6 interfaceC4659g6 = this.b;
        String uuid = this.c.b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adProperties.adId.toString()");
        interfaceC4659g6.onAdLoadFailed(new LevelPlayAdError(ironSourceError, uuid, this.c.c()));
    }

    @Override // com.ironsource.InterfaceC4931v6
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.b.onAdDisplayed(adInfo);
    }

    @Override // com.ironsource.InterfaceC4909u6
    public void a(@NotNull LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.b.a(reward);
    }

    @Override // com.ironsource.InterfaceC4931v6
    public void a() {
        this.b.a();
    }
}
