package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public interface d {

    public static final class a {
        public static /* synthetic */ Object a(d dVar, String str, String str2, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 2) != 0) {
                str2 = "UNKNOWN_MTID";
            }
            return dVar.a(str, str2, z, continuation);
        }
    }

    @NotNull
    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c a(@NotNull String str);

    @Nullable
    Object a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, long j, @NotNull Continuation continuation);

    @Nullable
    Object a(@NotNull String str, @NotNull String str2, boolean z, @NotNull Continuation continuation);
}
