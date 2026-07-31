package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes10.dex */
public final class H4 extends I4 {
    public H4(@NonNull Ei ei) {
        super(ei);
    }

    public final void a(@NonNull EnumC5798xb enumC5798xb, @NonNull List<AbstractC5208ah> list) {
        if (!Q9.h.contains(enumC5798xb)) {
            list.add(this.a.s);
        }
        if (Q9.b.contains(enumC5798xb)) {
            return;
        }
        list.add(this.a.c);
    }
}
