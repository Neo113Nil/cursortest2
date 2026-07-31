package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class l {

    @NotNull
    public final String a;
    public final int b;

    public l(@NotNull String url, int i) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = url;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    @NotNull
    public final String b() {
        return this.a;
    }
}
