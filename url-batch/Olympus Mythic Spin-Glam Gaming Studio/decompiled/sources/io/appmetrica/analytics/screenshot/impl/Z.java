package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Z implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final M fromModel(@NotNull X x) {
        M m = new M();
        m.a = x.a;
        m.b = x.b;
        return m;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        M m = (M) obj;
        return new X(m.a, m.b);
    }

    @NotNull
    public final X a(@NotNull M m) {
        return new X(m.a, m.b);
    }
}
