package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class Yb implements K {

    @NotNull
    private final Qb a;

    public Yb(@NotNull Qb nativeAdBinder) {
        Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        this.a = nativeAdBinder;
    }

    @Override // com.ironsource.K
    public void a(@NotNull Xb nativeAdInstance) {
        Intrinsics.checkNotNullParameter(nativeAdInstance, "nativeAdInstance");
        nativeAdInstance.a(this.a);
    }
}
