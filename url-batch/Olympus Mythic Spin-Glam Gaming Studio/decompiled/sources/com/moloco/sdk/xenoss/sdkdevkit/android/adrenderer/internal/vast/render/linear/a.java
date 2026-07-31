package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a {

    @NotNull
    public final String a;
    public final long b;

    public a(@NotNull String url, long j) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = url;
        this.b = j;
    }

    public final long a() {
        return this.b;
    }

    @NotNull
    public final String b() {
        return this.a;
    }
}
