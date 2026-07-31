package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ah implements ch {

    @NotNull
    private final Vg a;
    private int b;

    public ah(@NotNull Vg waterfallOperations) {
        Intrinsics.checkNotNullParameter(waterfallOperations, "waterfallOperations");
        this.a = waterfallOperations;
    }

    @Override // com.ironsource.ch
    public void a(@NotNull B it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.b++;
        this.a.a(it);
    }

    @Override // com.ironsource.ch
    @NotNull
    public Od b() {
        return this.b >= 2 ? Od.MAX_ATTEMPTS_REACHED : !this.a.b() ? Od.NO_LOADED_ADS : Od.CAN_RECOVER;
    }

    @Override // com.ironsource.ch
    @Nullable
    public B c() {
        return this.a.a(this.b);
    }

    @Override // com.ironsource.ch
    public void a() {
        this.a.a();
    }
}
