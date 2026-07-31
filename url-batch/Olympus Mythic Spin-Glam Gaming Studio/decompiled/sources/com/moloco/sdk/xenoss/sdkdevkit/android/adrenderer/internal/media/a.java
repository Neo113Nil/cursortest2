package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import java.io.File;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a$a, reason: collision with other inner class name */
    public static final class C1584a {
        public static /* synthetic */ Object a(a aVar, String str, File file, String str2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadMedia");
            }
            if ((i & 8) != 0) {
                aVar2 = null;
            }
            return aVar.a(str, file, str2, aVar2, continuation);
        }
    }

    @Nullable
    Object a(@NotNull String str, @NotNull File file, @NotNull String str2, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar, @NotNull Continuation continuation);

    boolean a(@NotNull File file);

    boolean b(@NotNull File file);
}
