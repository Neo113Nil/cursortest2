package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class R3 extends AbstractC5431j8 {
    @Override // io.appmetrica.analytics.impl.AbstractC5431j8
    public final boolean a(@NotNull I3 i3, @NotNull I3 i32) {
        if (!Do.a(i32.a)) {
            if (Do.a(i3.a)) {
                return false;
            }
            EnumC5483l8 enumC5483l8 = i3.b;
            if (enumC5483l8 == EnumC5483l8.d) {
                if (((Number) this.a.a(enumC5483l8)).intValue() < ((Number) this.a.a(i32.b)).intValue()) {
                    return false;
                }
            } else if (((Number) this.a.a(enumC5483l8)).intValue() <= ((Number) this.a.a(i32.b)).intValue()) {
                return false;
            }
        }
        return true;
    }
}
