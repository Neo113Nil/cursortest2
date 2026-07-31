package com.moloco.sdk.internal.scheduling;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final c a = new c();

    @NotNull
    public static final CoroutineScope b = CoroutineScopeKt.CoroutineScope(b.a().getIo());

    @NotNull
    public static final CoroutineScope c = CoroutineScopeKt.CoroutineScope(b.a().getDefault());
    public static final int d = 8;

    @NotNull
    public final CoroutineScope a() {
        return c;
    }

    @NotNull
    public final CoroutineScope b() {
        return b;
    }
}
