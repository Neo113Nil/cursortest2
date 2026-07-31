package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public interface y {
    void a(@NotNull View view);

    @Composable
    void a(@NotNull Function2 function2, @Nullable Composer composer, int i);
}
