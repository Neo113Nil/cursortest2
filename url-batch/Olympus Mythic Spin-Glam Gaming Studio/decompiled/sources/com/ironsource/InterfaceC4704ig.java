package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.ig, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC4704ig {
    static /* synthetic */ void a(InterfaceC4704ig interfaceC4704ig, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postReleaseTask");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        interfaceC4704ig.a(runnable, j);
    }

    void a(@NotNull Runnable runnable);

    void a(@NotNull Runnable runnable, long j);
}
