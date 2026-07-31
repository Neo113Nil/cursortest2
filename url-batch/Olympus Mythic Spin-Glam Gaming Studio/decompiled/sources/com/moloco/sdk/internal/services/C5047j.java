package com.moloco.sdk.internal.services;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* renamed from: com.moloco.sdk.internal.services.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5047j {
    public static final int d = 0;

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;

    public C5047j(@NotNull String applicationName, @NotNull String packageName, @NotNull String version) {
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(version, "version");
        this.a = applicationName;
        this.b = packageName;
        this.c = version;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final String c() {
        return this.c;
    }
}
