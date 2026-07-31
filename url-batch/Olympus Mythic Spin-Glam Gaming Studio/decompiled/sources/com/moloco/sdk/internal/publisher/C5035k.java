package com.moloco.sdk.internal.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* renamed from: com.moloco.sdk.internal.publisher.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5035k {
    public static final int c = 0;

    @NotNull
    public final String a;

    @Nullable
    public final Float b;

    public C5035k(@NotNull String burl, @Nullable Float f) {
        Intrinsics.checkNotNullParameter(burl, "burl");
        this.a = burl;
        this.b = f;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @Nullable
    public final Float b() {
        return this.b;
    }
}
