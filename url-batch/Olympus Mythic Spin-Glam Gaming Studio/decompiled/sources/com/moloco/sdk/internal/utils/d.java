package com.moloco.sdk.internal.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class d implements CoroutineContext.Key {
    public static final int b = 8;

    @NotNull
    public final Mutex a;

    public d(@NotNull Mutex mutex) {
        Intrinsics.checkNotNullParameter(mutex, "mutex");
        this.a = mutex;
    }

    @NotNull
    public final Mutex a() {
        return this.a;
    }

    @NotNull
    public final Mutex b() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.areEqual(this.a, ((d) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return "ReentrantMutexContextKey(mutex=" + this.a + ')';
    }

    @NotNull
    public final d a(@NotNull Mutex mutex) {
        Intrinsics.checkNotNullParameter(mutex, "mutex");
        return new d(mutex);
    }

    public static /* synthetic */ d a(d dVar, Mutex mutex, int i, Object obj) {
        if ((i & 1) != 0) {
            mutex = dVar.a;
        }
        return dVar.a(mutex);
    }
}
