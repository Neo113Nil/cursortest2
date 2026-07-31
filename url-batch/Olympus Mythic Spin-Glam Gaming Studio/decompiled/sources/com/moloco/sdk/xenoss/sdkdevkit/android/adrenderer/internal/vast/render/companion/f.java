package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class f {
    public static final d.a b(int i) {
        return i == 0 ? d.a.C1664a.b : new d.a.b(i, null);
    }

    @NotNull
    public static final d a(int i, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new e(i, scope, null);
    }
}
