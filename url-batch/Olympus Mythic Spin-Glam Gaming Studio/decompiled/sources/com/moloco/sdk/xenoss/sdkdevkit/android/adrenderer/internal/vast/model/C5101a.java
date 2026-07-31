package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5101a {
    public static final int d = 0;

    @Nullable
    public final String a;

    @Nullable
    public final Integer b;

    @NotNull
    public final AbstractC5102b c;

    public C5101a(@Nullable String str, @Nullable Integer num, @NotNull AbstractC5102b child) {
        Intrinsics.checkNotNullParameter(child, "child");
        this.a = str;
        this.b = num;
        this.c = child;
    }

    @NotNull
    public final AbstractC5102b a() {
        return this.c;
    }

    @Nullable
    public final String b() {
        return this.a;
    }

    @Nullable
    public final Integer c() {
        return this.b;
    }
}
