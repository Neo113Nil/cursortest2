package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public final class X9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Hm fromModel(@Nullable W9 w9) {
        Hm hm = new Hm();
        if (w9 != null) {
            hm.a = w9.a;
        }
        return hm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new W9(((Hm) obj).a);
    }

    @NotNull
    public final W9 a(@NotNull Hm hm) {
        return new W9(hm.a);
    }
}
