package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4960x implements Jb<C4942w, G0> {
    @Override // com.ironsource.Jb
    @NotNull
    public G0 a(@NotNull C4942w input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new G0(input.f(), input.d(), input.e(), input.b(), input.a());
    }
}
