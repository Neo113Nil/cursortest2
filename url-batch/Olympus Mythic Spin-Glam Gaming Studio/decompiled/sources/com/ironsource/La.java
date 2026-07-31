package com.ironsource;

import com.ironsource.AbstractC4638f3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public final class La implements Ma {

    @NotNull
    private final Ca a;

    @NotNull
    private final L2 b;

    @NotNull
    private final L2 c;
    private final long d;
    private final boolean e;

    public La(@NotNull Ca strategy, @NotNull L2 currentAdUnit, @NotNull L2 reloadingAdUnit, long j, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadingAdUnit, "reloadingAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = reloadingAdUnit;
        this.d = j;
        this.e = z;
    }

    @Override // com.ironsource.M0
    public void a(@NotNull C4903u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a(adUnitCallback, this.c, this.b, (AbstractC4638f3) new AbstractC4638f3.c(this.a.p().a() - this.d, AbstractC4638f3.d.C1361d.a), false, Long.valueOf(this.d));
    }

    @Override // com.ironsource.Ma
    public void b() {
        this.a.a("Loading an ad while reloading after timer finished");
    }

    @Override // com.ironsource.Ma
    public void c() {
        this.b.a(true);
        this.c.a(true);
        Ca ca = this.a;
        ca.a((Ma) new Fa(ca));
    }

    @Override // com.ironsource.Ma
    public void d() {
        Ca ca = this.a;
        ca.a((Ma) new Ia(ca, this.b));
    }

    @Override // com.ironsource.Ma
    public void f() {
    }

    public /* synthetic */ La(Ca ca, L2 l2, L2 l22, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ca, l2, l22, j, (i & 16) != 0 ? true : z);
    }

    @Override // com.ironsource.M0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.a.a(ironSourceError, this.b, (AbstractC4638f3) new AbstractC4638f3.c(this.a.p().a() - this.d, AbstractC4638f3.d.c.a), this.e, false, Long.valueOf(this.d));
    }
}
