package com.ironsource;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.w7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4950w7 {

    @NotNull
    public static final C4950w7 a = new C4950w7();

    private C4950w7() {
    }

    @NotNull
    public final UUID a() {
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
        return randomUUID;
    }
}
