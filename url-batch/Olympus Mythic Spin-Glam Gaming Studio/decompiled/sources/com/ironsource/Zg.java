package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public final class Zg implements ch {

    @NotNull
    private final Vg a;

    public Zg(@NotNull Vg waterfallOperations) {
        Intrinsics.checkNotNullParameter(waterfallOperations, "waterfallOperations");
        this.a = waterfallOperations;
    }

    @Override // com.ironsource.ch
    public void a() {
    }

    @Override // com.ironsource.ch
    public void a(@NotNull B it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.a.a(it);
        this.a.a();
    }

    @Override // com.ironsource.ch
    @NotNull
    public Od b() {
        return Od.FEATURE_DISABLED;
    }

    @Override // com.ironsource.ch
    @Nullable
    public B c() {
        return this.a.a(0);
    }
}
