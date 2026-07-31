package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes15.dex */
public final class m {
    public static final int c = 8;

    @NotNull
    public final String a;

    @NotNull
    public final List<String> b;

    public m(@NotNull String clickThroughUrl, @NotNull List<String> clickTrackingUrlList) {
        Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        Intrinsics.checkNotNullParameter(clickTrackingUrlList, "clickTrackingUrlList");
        this.a = clickThroughUrl;
        this.b = clickTrackingUrlList;
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
