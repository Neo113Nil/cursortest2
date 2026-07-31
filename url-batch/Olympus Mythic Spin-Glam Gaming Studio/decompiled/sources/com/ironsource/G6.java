package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class G6 implements J6 {

    @NotNull
    private final D6 a;

    @NotNull
    private final C4855r6 b;

    @NotNull
    private final C4855r6 c;

    public G6(@NotNull D6 strategy, @NotNull C4855r6 currentAdUnit, @NotNull C4855r6 progressiveAdUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(progressiveAdUnit, "progressiveAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = progressiveAdUnit;
    }

    @Override // com.ironsource.J6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, "Show called while progressive loading another ad"));
    }

    @Override // com.ironsource.J6
    public void b(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("load success with better ad before progressive load success");
    }

    @Override // com.ironsource.J6
    public void c(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        D6 d6 = this.a;
        d6.a(new F6(d6, this.b, this.c, adInfo));
    }

    @Override // com.ironsource.J6
    public void loadAd() {
        D6 d6 = this.a;
        d6.a(new I6(d6, this.c));
    }

    @Override // com.ironsource.J6
    public void a(@Nullable IronSourceError ironSourceError) {
        D6 d6 = this.a;
        d6.a(new E6(d6, this.b, false, 4, null));
    }

    @Override // com.ironsource.J6
    public void a() {
        this.a.a("ad expired before progressive load success");
    }

    @Override // com.ironsource.J6
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("show success before progressive load success");
    }

    @Override // com.ironsource.J6
    public void c(@Nullable IronSourceError ironSourceError) {
        this.a.a("show failed before progressive load success");
    }
}
