package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class I6 implements J6 {

    @NotNull
    private final D6 a;

    @NotNull
    private final C4855r6 b;

    public I6(@NotNull D6 strategy, @NotNull C4855r6 adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a = strategy;
        this.b = adUnit;
    }

    @Override // com.ironsource.J6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.J6
    public void b(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("load success with better ad while loading");
    }

    @Override // com.ironsource.J6
    public void c(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        D6 d6 = this.a;
        d6.a(new H6(d6, this.b));
        this.a.d().b(adInfo);
    }

    @Override // com.ironsource.J6
    public void loadAd() {
        this.a.d().a(new IronSourceError(LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load called before load success"));
    }

    @Override // com.ironsource.J6
    public void c(@Nullable IronSourceError ironSourceError) {
        this.a.a("show failed while loading");
    }

    @Override // com.ironsource.J6
    public void a(@Nullable IronSourceError ironSourceError) {
        D6 d6 = this.a;
        d6.a(new E6(d6, this.b, false, 4, null));
        this.a.d().a(ironSourceError);
    }

    @Override // com.ironsource.J6
    public void a() {
        this.a.a("ad expired while loading");
    }

    @Override // com.ironsource.J6
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("show success while loading");
    }
}
