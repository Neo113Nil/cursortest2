package com.ironsource;

import com.ironsource.AbstractC4638f3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class Ia implements Ma {

    @NotNull
    private final Ca a;

    @NotNull
    private final L2 b;

    public Ia(@NotNull Ca strategy, @NotNull L2 currentAdUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
    }

    @Override // com.ironsource.M0
    public void a(@NotNull C4903u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a("Received load success while paused");
    }

    @Override // com.ironsource.Ma
    public void b() {
        this.a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Ma
    public void c() {
        this.b.a(true);
        Ca ca = this.a;
        ca.a((Ma) new Fa(ca));
    }

    @Override // com.ironsource.Ma
    public void d() {
    }

    @Override // com.ironsource.Ma
    public void f() {
        Ca.a(this.a, this.b, (AbstractC4638f3) new AbstractC4638f3.a(AbstractC4638f3.b.c.a), false, 4, (Object) null);
    }

    @Override // com.ironsource.M0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.a.a("Received load failed while paused");
    }
}
