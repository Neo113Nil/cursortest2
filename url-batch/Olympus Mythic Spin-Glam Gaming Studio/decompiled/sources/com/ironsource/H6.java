package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class H6 implements J6 {

    @NotNull
    private final D6 a;

    @NotNull
    private final C4855r6 b;

    public H6(@NotNull D6 strategy, @NotNull C4855r6 adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a = strategy;
        this.b = adUnit;
    }

    @Override // com.ironsource.J6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.b.a(activity, this.a);
    }

    @Override // com.ironsource.J6
    public void b(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.d().onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.J6
    public void c(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("Ad unit is already loaded");
    }

    @Override // com.ironsource.J6
    public void loadAd() {
        D6 d6 = this.a;
        d6.a(new E6(d6, null, false, 4, null));
        this.a.loadAd();
    }

    @Override // com.ironsource.J6
    public void a(@Nullable IronSourceError ironSourceError) {
        this.a.a("load failed after ad unit is already loaded");
    }

    @Override // com.ironsource.J6
    public void c(@Nullable IronSourceError ironSourceError) {
        if (!C4541a5.a.a(ironSourceError)) {
            D6 d6 = this.a;
            d6.a(new E6(d6, null, false, 4, null));
        }
        this.a.d().c(ironSourceError);
    }

    @Override // com.ironsource.J6
    public void a() {
        D6 d6 = this.a;
        d6.a(new E6(d6, null, true));
        this.a.d().a();
    }

    @Override // com.ironsource.J6
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.d().a(adInfo);
        C4855r6 a = this.a.b().a(false, this.a.c());
        D6 d6 = this.a;
        d6.a(new G6(d6, this.b, a));
        a.a(this.a);
    }
}
