package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.v3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5738v3 implements ProtobufConverter {
    @NonNull
    public final Fm a(@NonNull C5686t3 c5686t3) {
        Fm fm = new Fm();
        fm.a = c5686t3.a;
        return fm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        Fm fm = new Fm();
        fm.a = ((C5686t3) obj).a;
        return fm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new C5686t3(((Fm) obj).a);
    }

    @NonNull
    public final C5686t3 a(@NonNull Fm fm) {
        return new C5686t3(fm.a);
    }
}
