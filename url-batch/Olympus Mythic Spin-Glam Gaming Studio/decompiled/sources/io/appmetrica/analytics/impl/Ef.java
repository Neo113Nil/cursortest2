package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class Ef extends AbstractC5431j8 {
    @Override // io.appmetrica.analytics.impl.AbstractC5431j8
    public final boolean a(@NotNull Kf kf, @NotNull Kf kf2) {
        if (kf.c) {
            return !kf2.c || ((Number) this.a.a(kf.e)).intValue() > ((Number) this.a.a(kf2.e)).intValue();
        }
        return false;
    }
}
