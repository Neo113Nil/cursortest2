package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes9.dex */
public final class J9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final H9 fromModel(@NonNull I9 i9) {
        H9 h9 = new H9();
        String str = i9.a;
        if (str != null) {
            h9.a = str.getBytes();
        }
        return h9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final I9 toModel(@NonNull H9 h9) {
        return new I9(new String(h9.a));
    }
}
