package com.ironsource;

import android.app.Activity;
import com.ironsource.Ya;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.pb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4825pb {

    @NotNull
    private final Ya a;

    /* renamed from: com.ironsource.pb$a */
    public static final class a implements InterfaceC4979y0 {
        final /* synthetic */ I7 a;

        a(I7 i7) {
            this.a = i7;
        }

        @Override // com.ironsource.InterfaceC4979y0
        @NotNull
        public AbstractC4961x0 a(boolean z, @NotNull C4671h0 adProperties) {
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            return C4613de.z.a(adProperties, this.a.f().a(), z);
        }
    }

    public C4825pb(@NotNull String adUnitId, @NotNull Ya.b config, @NotNull C4814p0 adTools, @NotNull C4641f6 adControllerFactory, @NotNull I7 provider, @NotNull InterfaceC4818p4 currentTimeProvider, @NotNull C4950w7 idFactory, @NotNull Z0 adUnitValidator) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
        this.a = new Ya(LevelPlay.AdFormat.REWARDED, adUnitId, config, adTools, adControllerFactory, adUnitValidator, a(provider), provider, currentTimeProvider, idFactory);
    }

    @NotNull
    public final String a() {
        String uuid = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "fullScreenAdInternal.adId.toString()");
        return uuid;
    }

    public final boolean b() {
        IronLog.API.info("LevelPlayRewardedAd.isAdReady()");
        return this.a.m();
    }

    public final void c() {
        IronLog.API.info("LevelPlayRewardedAd.loadAd()");
        this.a.n();
    }

    public final void a(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog.API.info("LevelPlayRewardedAd.showAd() placementName: " + str);
        this.a.a(activity, str);
    }

    public final void a(@Nullable LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        IronLog.API.info("LevelPlayRewardedAd.setListener()");
        this.a.a(levelPlayRewardedAdListener != null ? C4843qb.b(levelPlayRewardedAdListener) : null);
    }

    @NotNull
    public final LevelPlayReward a(@Nullable String str) {
        IronLog.API.info("LevelPlayRewardedAd.getReward()");
        return this.a.a(str);
    }

    private final a a(I7 i7) {
        return new a(i7);
    }
}
