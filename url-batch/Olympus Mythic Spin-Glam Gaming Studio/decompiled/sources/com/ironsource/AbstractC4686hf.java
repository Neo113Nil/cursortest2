package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.hf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC4686hf {

    @Nullable
    private final P a;

    public AbstractC4686hf(@Nullable P p) {
        this.a = p;
    }

    @Nullable
    public final P a() {
        return this.a;
    }

    @NotNull
    public abstract EnumC4811of b();

    @NotNull
    public final C4942w a(@NotNull Jb<AbstractC4686hf, C4942w> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
