package io.appmetrica.analytics.impl;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class Da extends Q4 {
    public Da(@NotNull N4 n4) {
        super(n4);
    }

    @Override // io.appmetrica.analytics.impl.Q4
    public final boolean a(@NotNull C5326f6 c5326f6, @NotNull L4 l4) {
        Bundle bundle = c5326f6.m;
        C5694tb c5694tb = bundle != null ? (C5694tb) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null;
        if (c5694tb != null) {
            if (c5694tb.d) {
                F4 f4 = l4.b.d.a;
                Boolean bool = f4.n;
                Boolean bool2 = f4.i;
                Ka.I.c().c(bool != null ? bool.booleanValue() : true);
                Ka.I.h().b(bool2);
            }
        }
        this.a.a(c5694tb);
        return false;
    }
}
