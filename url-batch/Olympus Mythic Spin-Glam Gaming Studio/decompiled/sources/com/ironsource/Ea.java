package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class Ea implements Ma {

    @NotNull
    private final Ca a;
    private boolean b;

    public Ea(@NotNull Ca strategy, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = strategy;
        this.b = z;
    }

    @Override // com.ironsource.M0
    public void a(@NotNull C4903u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a("Received load success before load");
    }

    @Override // com.ironsource.Ma
    public void b() {
        L2 a = this.a.j().a(true);
        this.a.a((Ma) new Ha(this.a, a, this.b));
        a.a(this.a.g());
    }

    @Override // com.ironsource.Ma
    public void c() {
        Ca ca = this.a;
        ca.a((Ma) new Fa(ca));
    }

    @Override // com.ironsource.Ma
    public void d() {
        this.b = true;
    }

    @Override // com.ironsource.Ma
    public void f() {
        this.b = false;
    }

    @Override // com.ironsource.M0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.a.a("Received load failed before load");
    }

    public /* synthetic */ Ea(Ca ca, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ca, (i & 2) != 0 ? false : z);
    }
}
