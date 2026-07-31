package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.y6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4985y6 implements C6 {

    @NotNull
    private final C4967x6 a;

    public C4985y6(@NotNull C4967x6 strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = strategy;
    }

    @Override // com.ironsource.C6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.a("show called before load success");
    }

    @Override // com.ironsource.C6
    public void b(@NotNull C4855r6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("load success before load called");
    }

    @Override // com.ironsource.C6
    public void c(@NotNull C4855r6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("load success with better ad before load called");
    }

    @Override // com.ironsource.C6
    public void loadAd() {
        C4855r6 a = this.a.b().a(true, this.a.c());
        this.a.a(new A6(this.a, a, true));
        a.a(this.a);
    }

    @Override // com.ironsource.C6
    public void a(@NotNull C4855r6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a.a("ad expired before load called");
    }

    @Override // com.ironsource.C6
    public void b(@NotNull C4855r6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a.a("load failed before load called");
    }

    @Override // com.ironsource.C6
    public void a(@NotNull C4855r6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("ad display success before load called");
    }

    @Override // com.ironsource.C6
    public void a(@NotNull C4855r6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a.a("ad display failed before load called");
    }
}
