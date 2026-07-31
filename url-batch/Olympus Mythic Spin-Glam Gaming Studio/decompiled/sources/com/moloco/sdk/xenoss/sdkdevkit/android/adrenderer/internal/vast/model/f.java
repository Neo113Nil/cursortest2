package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes15.dex */
public final class f {
    public static final int c = 8;

    @NotNull
    public final String a;

    @NotNull
    public final List<String> b;

    public f(@NotNull String clickThroughUrl, @NotNull List<String> clickTrackingUrls) {
        Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        Intrinsics.checkNotNullParameter(clickTrackingUrls, "clickTrackingUrls");
        this.a = clickThroughUrl;
        this.b = clickTrackingUrls;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final List<String> b() {
        return this.b;
    }
}
