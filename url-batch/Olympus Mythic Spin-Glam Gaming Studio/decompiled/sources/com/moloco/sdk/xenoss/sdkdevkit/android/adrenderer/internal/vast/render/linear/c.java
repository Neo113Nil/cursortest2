package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public interface c extends k, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k {
    int R();

    @NotNull
    Flow a();

    @NotNull
    StateFlow isPlaying();

    void r();
}
