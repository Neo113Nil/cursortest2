package com.moloco.sdk.internal.publisher.nativead.parser;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes5.dex */
public final class b extends Exception {
    public static final int c = 8;
    public final int a;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b;

    public b(int i, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c errorSubType) {
        Intrinsics.checkNotNullParameter(errorSubType, "errorSubType");
        this.a = i;
        this.b = errorSubType;
    }

    public final int a() {
        return this.a;
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b() {
        return this.b;
    }
}
