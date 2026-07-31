package com.moloco.sdk.internal;

import android.view.View;
import androidx.annotation.UiThread;
import androidx.lifecycle.Lifecycle;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public interface C {
    @UiThread
    void a(@NotNull View view);

    @UiThread
    void b(@NotNull View view);

    @UiThread
    void c(@NotNull View view);

    @UiThread
    void d(@NotNull View view);

    @NotNull
    Lifecycle getLifecycle();
}
