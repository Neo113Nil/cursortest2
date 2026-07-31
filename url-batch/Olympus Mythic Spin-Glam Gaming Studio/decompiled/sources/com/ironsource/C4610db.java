package com.ironsource;

import android.app.Activity;
import com.ironsource.Ya;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.db, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4610db {

    @NotNull
    private final I7 a;

    @NotNull
    private final Ya b;

    /* renamed from: com.ironsource.db$a */
    public static final class a implements InterfaceC4979y0 {
        a() {
        }

        @Override // com.ironsource.InterfaceC4979y0
        @NotNull
        public AbstractC4961x0 a(boolean z, @NotNull C4671h0 adProperties) {
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            return C9.z.a(adProperties, C4610db.this.a.f().a(), z);
        }
    }

    public C4610db(@NotNull String adUnitId, @NotNull Ya.b config, @NotNull C4814p0 adTools, @NotNull C4641f6 adControllerFactory, @NotNull I7 provider, @NotNull InterfaceC4818p4 currentTimeProvider, @NotNull C4950w7 idFactory, @NotNull Z0 adUnitValidator) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
        this.a = provider;
        this.b = new Ya(LevelPlay.AdFormat.INTERSTITIAL, adUnitId, config, adTools, adControllerFactory, adUnitValidator, a(), provider, currentTimeProvider, idFactory);
    }

    @NotNull
    public final String b() {
        String uuid = this.b.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "fullScreenAdInternal.adId.toString()");
        return uuid;
    }

    public final boolean c() {
        IronLog.API.info("LevelPlayInterstitialAd.isAdReady()");
        return this.b.m();
    }

    public final void d() {
        IronLog.API.info("LevelPlayInterstitialAd.loadAd()");
        this.b.n();
    }

    public final void a(@Nullable LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        IronLog.API.info("LevelPlayInterstitialAd.setListener()");
        this.b.a(levelPlayInterstitialAdListener != null ? C4628eb.b(levelPlayInterstitialAdListener) : null);
    }

    public final void a(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog.API.info("LevelPlayInterstitialAd.showAd() placementName: " + str);
        this.b.a(activity, str);
    }

    private final InterfaceC4979y0 a() {
        return new a();
    }
}
