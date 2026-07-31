package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes9.dex */
public final class Tl implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5585p6 fromModel(@NonNull Ul ul) {
        C5585p6 c5585p6 = new C5585p6();
        c5585p6.a = (String) WrapUtils.getOrDefault(ul.a, c5585p6.a);
        c5585p6.b = (String) WrapUtils.getOrDefault(ul.b, c5585p6.b);
        c5585p6.c = ((Integer) WrapUtils.getOrDefault(ul.c, Integer.valueOf(c5585p6.c))).intValue();
        c5585p6.f = ((Integer) WrapUtils.getOrDefault(ul.d, Integer.valueOf(c5585p6.f))).intValue();
        c5585p6.d = (String) WrapUtils.getOrDefault(ul.e, c5585p6.d);
        c5585p6.e = ((Boolean) WrapUtils.getOrDefault(ul.f, Boolean.valueOf(c5585p6.e))).booleanValue();
        return c5585p6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Ul a(@NonNull C5585p6 c5585p6) {
        throw new UnsupportedOperationException();
    }
}
