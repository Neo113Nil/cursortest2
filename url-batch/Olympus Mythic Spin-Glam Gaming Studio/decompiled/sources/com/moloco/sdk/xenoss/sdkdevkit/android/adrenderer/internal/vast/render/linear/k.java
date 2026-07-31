package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public interface k extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b, n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g {
    void D();

    void F();

    @NotNull
    String G();

    boolean L();

    @NotNull
    StateFlow Q();

    void a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar);

    void a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar);

    void b();

    void c(boolean z);

    void d(boolean z);

    void h();

    @NotNull
    StateFlow q();
}
