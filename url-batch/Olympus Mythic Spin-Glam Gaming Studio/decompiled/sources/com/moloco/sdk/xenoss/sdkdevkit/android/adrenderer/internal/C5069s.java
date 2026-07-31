package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5069s implements r {
    public static final int b = 8;

    @NotNull
    public final Context a;

    public C5069s(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r
    public boolean a(@NotNull String uri) {
        boolean b2;
        Intrinsics.checkNotNullParameter(uri, "uri");
        b2 = C5070t.b(this.a, uri);
        return b2;
    }
}
