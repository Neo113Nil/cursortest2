package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public interface If {

    public interface a {
        void cancel();
    }

    @NotNull
    a a(long j, @NotNull Runnable runnable);
}
