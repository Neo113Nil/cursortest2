package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public final class A6 implements C6 {

    @NotNull
    private final C4967x6 a;

    @NotNull
    private final C4855r6 b;
    private boolean c;

    public A6(@NotNull C4967x6 strategy, @NotNull C4855r6 currentAdUnit, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = z;
    }

    @Override // com.ironsource.C6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.a("show called while loading");
    }

    @Override // com.ironsource.C6
    public void b(@NotNull C4855r6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (!this.c) {
            this.a.a(new C5003z6(this.a, this.b, null, false));
            return;
        }
        C4855r6 a = this.a.b().a(false, this.a.c());
        this.a.a(new C5003z6(this.a, this.b, a, true));
        this.a.d().b(adInfo);
        a.a(this.a);
    }

    @Override // com.ironsource.C6
    public void c(@NotNull C4855r6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("ad info changed while loading");
    }

    @Override // com.ironsource.C6
    public void loadAd() {
        if (this.c) {
            this.a.a("load called while loading");
        }
        this.c = true;
    }

    @Override // com.ironsource.C6
    public void a(@NotNull C4855r6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("show success while loading");
    }

    @Override // com.ironsource.C6
    public void a(@NotNull C4855r6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a.a("show failed while loading");
    }

    @Override // com.ironsource.C6
    public void a(@NotNull C4855r6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a.a("ad expired while loading");
    }

    @Override // com.ironsource.C6
    public void b(@NotNull C4855r6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a.a(new C4985y6(this.a));
        if (this.c) {
            this.a.d().a(ironSourceError);
        }
    }
}
