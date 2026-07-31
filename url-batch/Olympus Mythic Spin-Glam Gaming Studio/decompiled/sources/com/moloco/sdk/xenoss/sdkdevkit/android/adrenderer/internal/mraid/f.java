package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.webkit.WebView;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public interface f extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k {
    @NotNull
    StateFlow H();

    @Nullable
    Object a(@NotNull String str, @NotNull Continuation continuation);

    void a(@NotNull n nVar, @NotNull String str);

    void a(@NotNull r rVar);

    void a(@NotNull s sVar);

    void a(@NotNull t tVar);

    void a(boolean z);

    void a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5);

    @NotNull
    WebView c();

    void j();

    @NotNull
    SharedFlow v();

    @NotNull
    StateFlow w();
}
