package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public interface Ng {
    static /* synthetic */ Lg a(Ng ng, Tg tg, F f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createWaterfall");
        }
        if ((i & 2) != 0) {
            f = null;
        }
        return ng.a(tg, f);
    }

    @NotNull
    Lg a(@NotNull Tg tg, @Nullable F f);
}
