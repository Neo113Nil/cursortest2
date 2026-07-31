package com.moloco.sdk.internal.services.init;

import androidx.annotation.VisibleForTesting;
import com.moloco.sdk.Init;
import com.moloco.sdk.publisher.MediationInfo;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public interface k {
    @Nullable
    Init.SDKInitResponse a();

    @Nullable
    Object a(@NotNull String str, @NotNull MediationInfo mediationInfo, @NotNull Continuation continuation);

    @VisibleForTesting
    @Nullable
    Object a(@NotNull Continuation continuation);
}
