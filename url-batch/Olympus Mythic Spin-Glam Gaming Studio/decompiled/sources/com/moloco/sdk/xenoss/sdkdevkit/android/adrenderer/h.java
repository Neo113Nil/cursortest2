package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes4.dex */
public final class h implements c {
    public static final int d = 0;

    @NotNull
    public final x a;

    @NotNull
    public final f b;

    @NotNull
    public final f c;

    public h(@NotNull x vastOptions, @NotNull f mraidOptions, @NotNull f staticOptions) {
        Intrinsics.checkNotNullParameter(vastOptions, "vastOptions");
        Intrinsics.checkNotNullParameter(mraidOptions, "mraidOptions");
        Intrinsics.checkNotNullParameter(staticOptions, "staticOptions");
        this.a = vastOptions;
        this.b = mraidOptions;
        this.c = staticOptions;
    }

    @NotNull
    public final f a() {
        return this.b;
    }

    @NotNull
    public final f b() {
        return this.c;
    }

    @NotNull
    public final x c() {
        return this.a;
    }
}
