package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.webkit.WebView;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public interface j extends i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k {
    void B();

    @Nullable
    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k E();

    @NotNull
    Flow a();

    void a(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar);

    void a(@NotNull String str, @NotNull a.AbstractC1677a.f fVar);

    @NotNull
    WebView c();

    @NotNull
    StateFlow e();
}
