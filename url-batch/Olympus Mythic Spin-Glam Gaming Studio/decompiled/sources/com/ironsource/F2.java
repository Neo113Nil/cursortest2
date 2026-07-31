package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class F2 implements K {

    @NotNull
    private final Fg a;

    public F2(@NotNull Fg viewBinder) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        this.a = viewBinder;
    }

    @Override // com.ironsource.K
    public void a(@NotNull B2 bannerAdInstance) {
        Intrinsics.checkNotNullParameter(bannerAdInstance, "bannerAdInstance");
        bannerAdInstance.a(this.a);
    }
}
