package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public final class Pa implements Ta {

    @NotNull
    private final Oa a;

    public Pa(@NotNull Oa strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = strategy;
    }

    @Override // com.ironsource.Ta
    public void a(@NotNull C4903u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a("Received load success before load called");
    }

    @Override // com.ironsource.Ta
    public void b() {
        L2 a = this.a.i().a(true);
        this.a.a(a);
        Oa oa = this.a;
        oa.a(new Sa(oa, a));
        a.a(this.a.g());
    }

    @Override // com.ironsource.Ta
    public void c() {
        L2 k = this.a.k();
        if (k != null) {
            k.a(false);
        }
        this.a.a((L2) null);
        Oa oa = this.a;
        oa.a(new Qa(oa));
    }

    @Override // com.ironsource.Ta
    public void a(@Nullable IronSourceError ironSourceError) {
        this.a.a("Received load failed before load called");
    }
}
