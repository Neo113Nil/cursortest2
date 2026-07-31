package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes9.dex */
public final class Te implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Km fromModel(@NonNull Se se) {
        Km km = new Km();
        km.a = se.a;
        km.b = se.b;
        return km;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        Km km = (Km) obj;
        return new Se(km.a, km.b);
    }

    @NonNull
    public final Se a(@NonNull Km km) {
        return new Se(km.a, km.b);
    }
}
