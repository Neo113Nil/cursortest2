package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class Um implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Lm fromModel(@NotNull Tm tm) {
        Lm lm = new Lm();
        lm.a = tm.a;
        return lm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Tm(((Lm) obj).a);
    }

    @NotNull
    public final Tm a(@NotNull Lm lm) {
        return new Tm(lm.a);
    }
}
