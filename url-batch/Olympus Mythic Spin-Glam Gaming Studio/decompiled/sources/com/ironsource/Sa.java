package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class Sa implements Ta {

    @NotNull
    private final Oa a;

    @NotNull
    private final L2 b;

    public Sa(@NotNull Oa strategy, @NotNull L2 adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a = strategy;
        this.b = adUnit;
    }

    @Override // com.ironsource.Ta
    public void a(@NotNull C4903u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a(adUnitCallback, this.b);
        Oa oa = this.a;
        oa.a(new Ra(oa, this.b));
    }

    @Override // com.ironsource.Ta
    public void b() {
        this.a.a("Loading an ad while loading");
    }

    @Override // com.ironsource.Ta
    public void c() {
        this.b.a(true);
        this.a.a((L2) null);
        Oa oa = this.a;
        oa.a(new Qa(oa));
    }

    @Override // com.ironsource.Ta
    public void a(@Nullable IronSourceError ironSourceError) {
        this.a.a(ironSourceError);
        this.b.a(false);
        this.a.a((L2) null);
        Oa oa = this.a;
        oa.a(new Qa(oa));
    }
}
