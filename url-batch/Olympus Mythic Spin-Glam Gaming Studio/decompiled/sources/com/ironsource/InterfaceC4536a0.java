package com.ironsource;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4536a0 {
    @NotNull
    String a();

    default void a(@NotNull K9 adInstance, @NotNull Map<String, String> loadParams) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
    }
}
