package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class Qa implements Ta {

    @NotNull
    private final Oa a;

    public Qa(@NotNull Oa strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = strategy;
    }

    @Override // com.ironsource.Ta
    public void a(@NotNull C4903u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.Ta
    public void b() {
        this.a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.Ta
    public void c() {
        this.a.a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.Ta
    public void a(@Nullable IronSourceError ironSourceError) {
        this.a.a("Received load failed on a destroyed ad");
    }
}
