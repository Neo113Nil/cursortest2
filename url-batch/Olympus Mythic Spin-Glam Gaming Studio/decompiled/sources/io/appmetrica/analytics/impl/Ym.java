package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes12.dex */
public final class Ym implements ProtobufConverter {
    @NonNull
    public final Mm a(@NonNull Xm xm) {
        Mm mm = new Mm();
        mm.a = xm.a;
        return mm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        Mm mm = new Mm();
        mm.a = ((Xm) obj).a;
        return mm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new Xm(((Mm) obj).a);
    }

    @NonNull
    public final Xm a(@NonNull Mm mm) {
        return new Xm(mm.a);
    }
}
