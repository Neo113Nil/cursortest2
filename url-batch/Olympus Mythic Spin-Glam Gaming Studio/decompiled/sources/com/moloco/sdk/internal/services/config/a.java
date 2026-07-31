package com.moloco.sdk.internal.services.config;

import com.moloco.sdk.Init;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public interface a {
    <T> T a(@NotNull Class<T> cls, T t);

    void a(@NotNull Init.SDKInitResponse sDKInitResponse);

    boolean a(@NotNull String str);

    @Nullable
    String b(@NotNull String str);
}
