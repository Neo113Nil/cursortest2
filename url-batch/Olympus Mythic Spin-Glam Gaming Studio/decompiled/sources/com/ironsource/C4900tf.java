package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.tf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4900tf {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    public C4900tf(@NotNull String identifier, @NotNull String baseConst) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(baseConst, "baseConst");
        this.a = identifier;
        this.b = baseConst;
    }

    @NotNull
    public final String a() {
        return this.a + "_" + this.b;
    }
}
