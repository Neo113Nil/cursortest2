package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class H0 implements Jb<G0, C4879sc> {
    @Override // com.ironsource.Jb
    @NotNull
    public C4879sc a(@NotNull G0 input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new C4879sc(input.e(), input.c(), input.b(), input.a());
    }
}
