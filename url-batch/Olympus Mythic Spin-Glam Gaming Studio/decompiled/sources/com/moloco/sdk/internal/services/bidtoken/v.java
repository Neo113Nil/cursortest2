package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.internal.services.I;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public interface v {

    @NotNull
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();

        @NotNull
        public final v a(@NotNull com.moloco.sdk.internal.bidtoken.b bidTokenParser, @NotNull I timeProviderService) {
            Intrinsics.checkNotNullParameter(bidTokenParser, "bidTokenParser");
            Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
            return new w(bidTokenParser, timeProviderService);
        }
    }

    @NotNull
    k a();

    @Nullable
    Object a(@NotNull k kVar, @NotNull Continuation continuation);

    @Nullable
    Object a(@NotNull Continuation continuation);

    void b();
}
