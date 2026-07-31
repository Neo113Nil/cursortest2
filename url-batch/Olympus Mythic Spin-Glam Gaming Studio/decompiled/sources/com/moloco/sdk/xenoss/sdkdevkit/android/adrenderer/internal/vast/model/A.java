package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class A {
    public static final int d = 8;

    @Nullable
    public final z a;

    @NotNull
    public final List<z> b;

    @NotNull
    public final List<z> c;

    public A(@Nullable z zVar, @NotNull List<z> clickTrackingList, @NotNull List<z> customClickList) {
        Intrinsics.checkNotNullParameter(clickTrackingList, "clickTrackingList");
        Intrinsics.checkNotNullParameter(customClickList, "customClickList");
        this.a = zVar;
        this.b = clickTrackingList;
        this.c = customClickList;
    }

    @Nullable
    public final z a() {
        return this.a;
    }

    @NotNull
    public final List<z> b() {
        return this.b;
    }

    @NotNull
    public final List<z> c() {
        return this.c;
    }
}
