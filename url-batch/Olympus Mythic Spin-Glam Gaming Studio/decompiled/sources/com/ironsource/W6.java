package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class W6 implements X6 {
    private final long a;

    @NotNull
    private final EnumC4543a7 b;

    public W6(long j, @NotNull EnumC4543a7 recoveryStrategy) {
        Intrinsics.checkNotNullParameter(recoveryStrategy, "recoveryStrategy");
        this.a = j;
        this.b = recoveryStrategy;
    }

    @Override // com.ironsource.X6
    public long a() {
        return this.a;
    }

    @Override // com.ironsource.X6
    @NotNull
    public EnumC4543a7 b() {
        return this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W6(@NotNull Z6 feature) {
        this(feature.a(), feature.c());
        Intrinsics.checkNotNullParameter(feature, "feature");
    }
}
