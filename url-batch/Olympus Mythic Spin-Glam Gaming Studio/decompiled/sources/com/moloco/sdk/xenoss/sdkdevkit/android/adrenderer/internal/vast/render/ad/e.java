package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class e {
    @NotNull
    public static final c a(@NotNull StateFlow currentPlaylistItem, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(currentPlaylistItem, "currentPlaylistItem");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new d(currentPlaylistItem, scope);
    }
}
