package com.ironsource;

import com.ironsource.AbstractC4638f3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class Ha implements Ma {

    @NotNull
    private final Ca a;

    @NotNull
    private final L2 b;
    private boolean c;

    public Ha(@NotNull Ca strategy, @NotNull L2 currentAdUnit, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = z;
    }

    @Override // com.ironsource.M0
    public void a(@NotNull C4903u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a(adUnitCallback, this.b, (L2) null, new AbstractC4638f3.a(AbstractC4638f3.b.C1360b.a), this.c, (Long) null);
    }

    @Override // com.ironsource.Ma
    public void b() {
        this.a.a("Loading an ad while loading");
    }

    @Override // com.ironsource.Ma
    public void c() {
        this.b.a(true);
        Ca ca = this.a;
        ca.a((Ma) new Fa(ca));
    }

    @Override // com.ironsource.Ma
    public void d() {
        this.c = true;
    }

    @Override // com.ironsource.Ma
    public void f() {
        this.c = false;
    }

    @Override // com.ironsource.M0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.a.a(ironSourceError, this.b, (AbstractC4638f3) new AbstractC4638f3.a(AbstractC4638f3.b.a.a), false, this.c, (Long) null);
    }
}
