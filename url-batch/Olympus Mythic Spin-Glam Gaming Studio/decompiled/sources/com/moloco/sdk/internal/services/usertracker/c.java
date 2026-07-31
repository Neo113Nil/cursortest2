package com.moloco.sdk.internal.services.usertracker;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.services.w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class c implements b {
    public static final int b = 8;

    @NotNull
    public final w a;

    public c(@NotNull w dataStoreService) {
        Intrinsics.checkNotNullParameter(dataStoreService, "dataStoreService");
        this.a = dataStoreService;
    }

    @Override // com.moloco.sdk.internal.services.usertracker.b
    @Nullable
    public Object a(@NotNull String str, @NotNull Continuation continuation) {
        Object a = this.a.a(d.a, str, continuation);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.internal.services.usertracker.b
    @Nullable
    public Object b(@NotNull Continuation continuation) {
        return this.a.d(d.a, continuation);
    }

    @Override // com.moloco.sdk.internal.services.usertracker.b
    @Nullable
    public Object a(@NotNull Continuation continuation) {
        Object a = this.a.a(d.a, continuation);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }
}
