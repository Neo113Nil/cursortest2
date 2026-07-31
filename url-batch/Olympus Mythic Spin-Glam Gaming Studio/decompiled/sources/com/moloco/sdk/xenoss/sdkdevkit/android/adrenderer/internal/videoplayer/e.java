package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.view.View;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public interface e extends k {
    boolean C();

    @Nullable
    View N();

    @Nullable
    Object a(@NotNull Continuation continuation);

    void a(@Nullable String str);

    void b(boolean z);

    @NotNull
    StateFlow f();

    @NotNull
    StateFlow isPlaying();

    @Nullable
    String m();

    @NotNull
    StateFlow o();

    void pause();

    void play();

    void seekTo(long j);
}
