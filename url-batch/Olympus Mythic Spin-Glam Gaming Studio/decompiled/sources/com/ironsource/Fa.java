package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class Fa implements Ma {

    @NotNull
    private final Ca a;

    public Fa(@NotNull Ca strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = strategy;
    }

    @Override // com.ironsource.M0
    public void a(@NotNull C4903u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.Ma
    public void b() {
        this.a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.Ma
    public void c() {
        this.a.a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.Ma
    public void d() {
        this.a.a("Pausing auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.Ma
    public void f() {
        this.a.a("Resuming auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.M0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.a.a("Received load failed on a destroyed ad");
    }
}
