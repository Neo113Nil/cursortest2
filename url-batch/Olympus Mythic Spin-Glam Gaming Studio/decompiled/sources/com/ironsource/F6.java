package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class F6 implements J6 {

    @NotNull
    private final D6 a;

    @NotNull
    private final C4855r6 b;

    @NotNull
    private final C4855r6 c;

    @NotNull
    private LevelPlayAdInfo d;

    public F6(@NotNull D6 strategy, @NotNull C4855r6 currentAdUnit, @NotNull C4855r6 progressiveAdUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(progressiveAdUnit, "progressiveAdUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = progressiveAdUnit;
        this.d = adInfo;
    }

    @Override // com.ironsource.J6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.J6
    public void b(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.d = adInfo;
    }

    @Override // com.ironsource.J6
    public void c(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("load success on progressive ad unit is already loaded");
    }

    @Override // com.ironsource.J6
    public void loadAd() {
        this.a.d().b(this.d);
        D6 d6 = this.a;
        d6.a(new H6(d6, this.c));
    }

    @Override // com.ironsource.J6
    public void c(@Nullable IronSourceError ironSourceError) {
        this.a.a("show failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.J6
    public void a(@Nullable IronSourceError ironSourceError) {
        this.a.a("load failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.J6
    public void a() {
        D6 d6 = this.a;
        d6.a(new E6(d6, this.b, true));
    }

    @Override // com.ironsource.J6
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("show success on progressive ad unit that already loaded");
    }
}
