package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;

/* loaded from: classes10.dex */
public final class Ha implements InterfaceC5593pe {
    @Override // io.appmetrica.analytics.impl.InterfaceC5593pe
    @Nullable
    public final C5796x9 a(@Nullable Integer num, @Nullable String str) {
        C5796x9 c5796x9 = new C5796x9();
        if (num != null) {
            c5796x9.a = num.intValue();
        }
        if (str != null) {
            c5796x9.b = str;
        }
        return c5796x9;
    }
}
