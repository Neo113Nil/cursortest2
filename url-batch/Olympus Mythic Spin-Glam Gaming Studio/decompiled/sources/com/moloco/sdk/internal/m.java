package com.moloco.sdk.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes5.dex */
public final class m {
    public static final int c = 0;

    @NotNull
    public final String a;
    public final int b;

    public m(@NotNull String description, int i) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.a = description;
        this.b = i;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }
}
