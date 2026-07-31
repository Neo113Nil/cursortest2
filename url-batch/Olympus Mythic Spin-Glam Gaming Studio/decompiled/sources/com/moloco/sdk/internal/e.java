package com.moloco.sdk.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class e {
    @NotNull
    public static final String a() {
        String packageName = com.moloco.sdk.internal.android_context.b.a(null, 1, null).getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return packageName;
    }
}
