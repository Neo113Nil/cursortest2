package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5050b {

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b$a */
    public interface a {
        void a();

        void a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar);

        void a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar);
    }

    void a(long j, @Nullable a aVar);

    @NotNull
    StateFlow isLoaded();
}
